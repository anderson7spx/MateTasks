package com.matetasks.app.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey
    val id: String,
    val title: String,
    val description: String,
    val scheduledDate: String,
    val isCompleted: Boolean,
    val priority: String,
    val category: String
)