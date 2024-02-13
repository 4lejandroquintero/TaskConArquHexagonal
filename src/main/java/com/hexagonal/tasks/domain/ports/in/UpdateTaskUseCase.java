package com.hexagonal.tasks.domain.ports.in;

import com.hexagonal.tasks.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    //a la hora de actualizar hay que dar ID, este puede o no puede existir, usamos el optional
    Optional<Task> updateTask(Long id, Task updatedTask);
}