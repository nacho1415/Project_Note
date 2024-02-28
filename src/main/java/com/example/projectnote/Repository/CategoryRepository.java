package com.example.projectnote.Repository;

import com.example.projectnote.Domain.Category;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {

    @Autowired
    EntityManager em;

    public void save(Category category) {
        em.persist(category);
    }

    public Category createCategory (String name) {
        Category category = new Category();
        category.setName(name);
        save(category);
        return category;
    }

    public Category findById (Long id) {
        return em.find(Category.class, id);
    }
}
