package com.example.halqamanager.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lessons")
data class Lesson(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String = "",
    val date: String,
    val time: String,
    val duration: Int = 60,
    val topic: String = "",
    val notes: String = ""
)