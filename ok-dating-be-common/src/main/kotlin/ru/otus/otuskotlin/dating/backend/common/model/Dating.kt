package ru.otus.otuskotlin.dating.backend.common.model

import java.time.LocalDate
import java.time.LocalTime

data class Dating(
        var id:String="",
        var profile:Profile = Profile(),
        var date:LocalDate = LocalDate.MIN,
        var time:LocalTime=LocalTime.MIN,
        var location:String = ""
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Dating

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}