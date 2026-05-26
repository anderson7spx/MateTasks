package com.matetasks.app.domain.usecase

import com.matetasks.app.domain.model.Task
import com.matetasks.app.domain.model.Achievement
import com.matetasks.app.domain.model.AchievementCondition

class CompleteTaskUseCase {

    /**
     * Ejecuta la lógica de completar una tarea y actualiza el progreso de los logros afectados.
     * @return Una lista actualizada de logros con sus nuevos progresos o estados de desbloqueo.
     */
    fun invoke(completedTask: Task, currentAchievements: List<Achievement>): List<Achievement> {
        // Marcamos la tarea como completada obligatoriamente
        completedTask.isCompleted = true

        // Retornamos la nueva lista de logros evaluando el impacto de esta tarea
        return currentAchievements.map { achievement ->
            if (achievement.isUnlocked) {
                achievement // Si ya está desbloqueado, no hacemos nada
            } else {
                evaluateAchievementProgress(achievement, completedTask)
            }
        }
    }

    private fun evaluateAchievementProgress(achievement: Achievement, task: Task): Achievement {
        when (achievement.conditionType) {
            AchievementCondition.COMPLETED_TASKS_COUNT -> {
                // Sumamos 1 al progreso actual hacia la meta del logro
                achievement.currentValue += 1
                
                // Si alcanzó la meta, se desbloquea
                if (achievement.currentValue >= achievement.targetValue) {
                    achievement.isUnlocked = true
                }
            }
            AchievementCondition.STREAK_DAYS -> {
                // TODO: La lógica de rachas requerirá verificar fechas (lo resolveremos más adelante)
            }
            AchievementCondition.EARLY_BIRD -> {
                // TODO: Requerirá verificar la hora exacta de finalización
            }
        }
        return achievement
    }
}