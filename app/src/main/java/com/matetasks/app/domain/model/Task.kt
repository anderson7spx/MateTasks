package com.matetasks.app.domain.model

import java.util.UUID

data class Task(
    val id: String = UUID.randomUUID().toString(),
    var title: String,
    var description: String = "",
    var scheduledDate: String,
    var isCompleted: Boolean = false,
    var priority: TaskPriority = TaskPriority.MEDIUM,
    var category: String = "General"
)

enum class TaskPriority {
    LOW, MEDIUM, HIGH
}