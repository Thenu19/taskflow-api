package TaskFlow.controller;

import TaskFlow.dto.TaskRequest;
import TaskFlow.dto.TaskResponse;
import TaskFlow.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import TaskFlow.entity.TaskPriority;
import TaskFlow.entity.TaskStatus;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public TaskResponse createTask(@Valid @RequestBody TaskRequest request) {
        return taskService.createTask(request);
    }

    @GetMapping
    public List<TaskResponse> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskResponse> getTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @PutMapping("/{id}")
    public TaskResponse updateTask(
            @PathVariable Long id,
            @Valid @RequestBody TaskRequest request) {

        return taskService.updateTask(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/filter/status")
    public List<TaskResponse> getTasksByStatus(
            @RequestParam TaskStatus status) {

        return taskService.getTasksByStatus(status);
    }

    @GetMapping("/filter/priority")
    public List<TaskResponse> getTasksByPriority(
            @RequestParam TaskPriority priority) {

        return taskService.getTasksByPriority(priority);
    }

    @GetMapping("/search")
    public List<TaskResponse> searchTasks(
            @RequestParam String query) {

        return taskService.searchTasks(query);
    }
}