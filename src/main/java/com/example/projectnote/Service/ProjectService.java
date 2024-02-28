package com.example.projectnote.Service;

import com.example.projectnote.Domain.Category;
import com.example.projectnote.Domain.CategoryProject;
import com.example.projectnote.Domain.Project;
import com.example.projectnote.Repository.CategoryProjectRepository;
import com.example.projectnote.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;
    CategoryProjectRepository categoryProjectRepository;

    @Transactional
    public Project createProject (String name, String description, String linkGithub, List<Category> categories) {
        Project project = new Project();
        project.setName(name);
        project.setDescription(description);
        project.setLinkGithub(linkGithub);
        projectRepository.save(project);

        for(Category category: categories) {
            CategoryProject categoryProject = new CategoryProject();
            categoryProject.setProject(project);
            categoryProject.setCategory(category);

            categoryProjectRepository.save(categoryProject);
        }
        return project;
    }
}
