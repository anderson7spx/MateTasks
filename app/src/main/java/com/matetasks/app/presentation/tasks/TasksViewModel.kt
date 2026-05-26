package com.matetasks.app.presentation.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.matetasks.app.domain.model.TaskPriority
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import com.matetasks.app.domain.model.Priority
import com.matetasks.app.domain.model.Task

class TasksViewModel : ViewModel() {

    // Estado interno privado que muta (cambia) dentro del ViewModel
    private val _tasksState = MutableStateFlow<List<Task>>(emptyList())

    // Estado público de solo lectura que la vista (Compose) va a observar
    val tasksState: StateFlow<List<Task>> = _tasksState.asStateFlow()

    init {
        loadTasks()
    }

    private fun loadTasks() {
        // Usamos el viewModelScope para lanzar una corrutina en segundo plano
        viewModelScope.launch {
            // Por ahora, creamos tareas de prueba ficticias (Mock Data)
            // para verificar que la interfaz dibuje correctamente.
            // Más adelante conectaremos esto con el caso de uso y Room.
            _tasksState.value = listOf(
                Task(
                    id = "1",
                    title = "Estudiar Álgebra",
                    description = "Resolver los ejercicios de ecuaciones lineales",
                    scheduledDate = "2026-05-26",
                    isCompleted = false,
                    priority = TaskPriority.HIGH,
                    category = "Estudio"
                ),
                Task(
                    id = "2",
                    title = "Revisar cadena de la moto",
                    description = "Limpieza y tensión para el fin de semana",
                    scheduledDate = "2026-05-27",
                    isCompleted = true,
                    priority = TaskPriority.MEDIUM,
                    category = "Mantenimiento"
                )
            )
        }
    }

    fun onTaskCheckedChange(taskId: String, isCompleted: Boolean) {
        // Actualizamos el estado de la tarea de forma reactiva
        _tasksState.value = _tasksState.value.map { task ->
            if (task.id == taskId) task.copy(isCompleted = isCompleted) else task
        }
    }
}