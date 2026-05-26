package com.matetasks.app.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

// Declaramos las entidades (tablas) y la versión de la base de datos
@Database(entities = [TaskEntity::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {

    // Exponemos el DAO para que la app pueda acceder a las consultas
    abstract fun taskDao(): TaskDao

    companion object {
        @Volatile
        private var INSTANCE: AppDataBase? = null

        fun getDatabase(context: Context): AppDataBase {
            // Si la instancia ya existe, la retornamos; si no, la creamos
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "matetasks_database" // Nombre del archivo SQLite interno
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}