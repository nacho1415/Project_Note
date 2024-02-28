package com.example.projectnote.Repository;

import com.example.projectnote.Domain.CategoryProject;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryProjectRepository {

    @Autowired
    EntityManager em;

    public void save (CategoryProject categoryProject) {
        em.persist(categoryProject);
    }
}
