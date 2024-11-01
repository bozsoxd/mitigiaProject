package mitigia.backend.mitigia_task.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mitigia.backend.mitigia_task.ProjectRepository;
import mitigia.backend.mitigia_task.Model.Project;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }
}
