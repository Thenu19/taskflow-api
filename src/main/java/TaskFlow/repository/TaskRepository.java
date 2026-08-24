package TaskFlow.repository;

import TaskFlow.entity.Task;
import TaskFlow.entity.TaskPriority;
import TaskFlow.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(TaskStatus status);

    List<Task> findByPriority(TaskPriority priority);

    List<Task> findByTitleContainingIgnoreCase(String title);
}