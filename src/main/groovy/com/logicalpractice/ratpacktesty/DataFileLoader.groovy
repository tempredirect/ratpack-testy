package com.logicalpractice.ratpacktesty

import org.supercsv.io.CsvListReader
import org.supercsv.prefs.CsvPreference

/**
 *
 */
class DataFileLoader {

    List<TransactionRecord> load(File f) {
        f.withReader('ISO-8859-1') { reader ->
          def listReader = new CsvListReader(reader, CsvPreference.STANDARD_PREFERENCE);
          listReader.getHeader(true)
          def fieldValues
          while((fieldValues = listReader.read()) != null) {
            println fieldValues[0]
          }
        }

    }
}
