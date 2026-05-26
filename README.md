# MateTasks - App de Agenda y Logros Gamificados

Aplicación móvil de productividad y seguimiento diario diseñada con principios de Arquitectura Limpia y MVVM.

## Stack Tecnológico
* **Lenguaje:** Kotlin
* **IDE:** Android Studio & VS Code
* **Base de Datos:** Room (SQLite)
* **Arquitectura:** MVVM + Clean Architecture

## Arquitectura del Proyecto (Capas de Escalabilidad)
Para garantizar la escalabilidad, el proyecto se divide en tres capas principales:
1. **Capa de Presentación (UI/UX):** Maneja las vistas y el estado de la interfaz mediante ViewModels.
2. **Capa de Dominio (Lógica de Negocio):** Contiene las reglas puras del negocio (Casos de Uso) y los modelos de datos esenciales. No depende de ninguna librería externa.
3. **Capa de Datos:** Se encarga de la persistencia local (Room) o futuras APIs externas.