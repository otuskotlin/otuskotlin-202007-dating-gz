package ru.otus.otuskotlin.dating.backend.common.model

import java.time.LocalDate

data class Profile  (
        var id: String = "",
        var fName: String = "",
        var mName: String = "",
        var lName: String = "",
        var dob: LocalDate = LocalDate.MIN,
        var email: String = "",
        var phone: String = "",
        var gender: Gender = Gender.FEMALE


){}