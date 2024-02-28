package com.example.projectnote.Project;

import com.example.projectnote.Domain.Category;
import com.example.projectnote.Domain.CategoryProject;
import com.example.projectnote.Domain.Project;
import com.example.projectnote.Repository.CategoryProjectRepository;
import com.example.projectnote.Repository.CategoryRepository;
import com.example.projectnote.Repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class ProjectTest {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CategoryProjectRepository categoryProjectRepository;
    @Autowired
    ProjectRepository projectRepository;

    @Test
    @Transactional
    @Commit
    public void 프로젝트생성 () {
        Project project = new Project();
        project.setName("todoList");
        project.setDescription("스프링 이해를 위한 todoList 구현");
        project.setLinkGithub("https://github.com/nacho1415/toDoList/tree/master");

        projectRepository.save(project);

        Category category1 = categoryRepository.findById(1L);
        Category category2 = categoryRepository.findById(2L);

        CategoryProject categoryProject = new CategoryProject();

        categoryProject.setProject(project);
        categoryProject.setCategory(category1);
        categoryProjectRepository.save(categoryProject);

    }
}
