package ru.otuskotlin.transport.common.dto

import java.time.LocalDate
import java.time.LocalTime
import java.util.*

data class PutDatingDTO (
    val id: UUID,
    val idUser: String= "",
    val date: LocalDate = LocalDate.MIN,
    var time: LocalTime = LocalTime.MIN,
    var location:String = ""
) {

}