package com.matetasks.app.presentation.tasks;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/matetasks/app/presentation/tasks/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_tasksState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/matetasks/app/domain/model/Task;", "tasksState", "Lkotlinx/coroutines/flow/StateFlow;", "getTasksState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadTasks", "", "onTaskCheckedChange", "taskId", "", "isCompleted", "", "app_debug"})
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.matetasks.app.domain.model.Task>> _tasksState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.matetasks.app.domain.model.Task>> tasksState = null;
    
    public TasksViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.matetasks.app.domain.model.Task>> getTasksState() {
        return null;
    }
    
    private final void loadTasks() {
    }
    
    public final void onTaskCheckedChange(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, boolean isCompleted) {
    }
}