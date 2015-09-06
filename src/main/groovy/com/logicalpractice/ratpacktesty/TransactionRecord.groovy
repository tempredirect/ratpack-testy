package com.logicalpractice.ratpacktesty

import groovy.transform.Immutable

/**
 *
 */
@Immutable
class TransactionRecord {

    long partnerId
    String partnerName
    String partnerSegment
    String partnerSuperRegion

    long propertyId
    String propertyName
    String propertyMarket
    String propertyRegion
    String propertySuperRegion

    String transactionDate
    int adultCount
    int childCount
    int infantCount
    int totalPersonCount
    int roomCount
    int roomNightCount

    double gbv
}
