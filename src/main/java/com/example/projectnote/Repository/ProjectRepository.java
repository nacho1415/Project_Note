package com.example.projectnote.Repository;

import com.example.projectnote.Domain.CategoryProject;
import com.example.projectnote.Domain.Project;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectRepository {

    @PersistenceContext
    EntityManager em;

    public void save (Project project) {
        em.persist(project);
    }
}
