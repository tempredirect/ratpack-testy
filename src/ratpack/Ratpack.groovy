import com.logicalpractice.ratpacktesty.DataFileLoader
import org.supercsv.io.CsvListReader
import org.supercsv.prefs.CsvPreference
import ratpack.exec.Blocking
import ratpack.groovy.template.MarkupTemplateModule

import java.nio.charset.Charset
import java.nio.file.Files

import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack
import static ratpack.jackson.Jackson.json;

ratpack {
  bindings {
    module MarkupTemplateModule
  }

  handlers {
    get {
      render groovyMarkupTemplate("index.gtpl", title: "My Ratpack App")
    }

    get('transactions') {
      Blocking.get({
        new DataFileLoader(new File('data/trx_20150701_3.csv'))
        42
      }).then({ len -> render json([[lines:len]])})

    }
    files { dir "public" }
  }
}
