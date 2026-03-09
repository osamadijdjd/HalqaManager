package com.example.halqamanager.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class Student(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val phone: String = "",
    val email: String = "",
    val joinDate: String,
    val notes: String = ""
)