package com.matetasks.app.domain.model

data class Achievement(
    val id: String,
    val title: String,
    val description: String,
    val conditionType: AchievementCondition,
    val targetValue: Int,
    var currentValue: Int = 0,
    val xpReward: Int,
    var isUnlocked: Boolean = false
)

enum class AchievementCondition {
    COMPLETED_TASKS_COUNT,
    STREAK_DAYS,
    EARLY_BIRD
}