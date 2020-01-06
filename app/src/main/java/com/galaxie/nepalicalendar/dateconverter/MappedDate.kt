package com.galaxie.nepalicalendar.dateconverter


class MappedDate {


    var englishYear: Int
    var englishMonth: Int
    var whichEnglishMonth: String? = null
    var englishDay: Int
    var nepaliYear: Int
    //is a zero index
    var nepaliMonth: Int
    var whichNepaliMonth: String? = null
    //not a zero index
    var nepaliDay: Int
    //is a zero index
    var dayInWeek: Int
    var whichDayInWeek: String? = null
    var totalNepaliDaysInMonth: Int


    constructor(englishYear: Int, englishMonth: Int, englishDay: Int, nepaliYear: Int, nepaliMonth: Int, nepaliDay: Int, dayInWeek: Int, totalNepaliDaysInMonth: Int) {
        this.englishYear = englishYear
        this.englishMonth = englishMonth
        this.englishDay = englishDay
        this.nepaliYear = nepaliYear
        this.nepaliMonth = nepaliMonth
        this.nepaliDay = nepaliDay
        this.dayInWeek = dayInWeek
        this.totalNepaliDaysInMonth = totalNepaliDaysInMonth
        setWhichDayInWeek(this.dayInWeek)
        setWhichNepaliMonth(this.nepaliMonth)
        setWhichEnglishMonth(this.englishMonth)
    }

    fun setWhichDayInWeek(dayInWeek: Int) {
        this.whichDayInWeek = Week.whichDayInWeek(dayInWeek)
    }

    fun setWhichNepaliMonth(nepaliMonth: Int) {
        this.whichNepaliMonth = Month.whichNepaliMonth(nepaliMonth)
    }

    fun setWhichEnglishMonth(englishMonth: Int) {
        this.whichEnglishMonth = Month.whichEnglishMonth(englishMonth)
    }

    override fun toString(): String {
        return "DateMapper(englishYear=$englishYear, englishMonth=$englishMonth, whichEnglishMonth=$whichEnglishMonth, englishDay=$englishDay, nepaliYear=$nepaliYear, nepaliMonth=$nepaliMonth, whichNepaliMonth=$whichNepaliMonth, nepaliDay=$nepaliDay, dayInWeek=$dayInWeek, whichDayInWeek=$whichDayInWeek, totalNepaliDaysInMonth=$totalNepaliDaysInMonth)"
    }


}