package com.matetasks.app.data.local

// Nota: Estas anotaciones se pondrán en rojo por ahora en VS Code 
// porque aún no agregamos las librerías de Room en Gradle (lo haremos en Android Studio),
// pero estructurar el código primero nos mantiene enfocados.

// @Entity(tableName = "tasks")
data class TaskEntity(
    // @PrimaryKey
    val id: String,
    val title: String,
    val description: String,
    val scheduledDate: String,
    val isCompleted: Boolean,
    val priority: String, // Guardamos el Enum como String para la Base de Datos
    val category: String
)