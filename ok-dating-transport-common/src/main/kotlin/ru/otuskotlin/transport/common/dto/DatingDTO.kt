package ru.otuskotlin.transport.common.dto

import java.time.LocalDate
import java.time.LocalTime
import java.util.*

data class DatingDTO(
    val id:UUID,
    val idProfile: String= "",
    val date: LocalDate = LocalDate.MIN,
    var time: LocalTime = LocalTime.MIN,
    var location:String = ""
) {

}