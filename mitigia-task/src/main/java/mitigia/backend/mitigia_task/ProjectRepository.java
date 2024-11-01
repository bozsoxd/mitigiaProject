package mitigia.backend.mitigia_task;

import org.springframework.data.jpa.repository.JpaRepository;

import mitigia.backend.mitigia_task.Model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
