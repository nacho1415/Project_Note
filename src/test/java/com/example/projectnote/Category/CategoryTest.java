package com.example.projectnote.Category;

import com.example.projectnote.Repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class CategoryTest {

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    @Transactional
    @Commit
    public void 태그기본10개생성() {
        categoryRepository.createCategory("Spring");
        categoryRepository.createCategory("Mysql");
        categoryRepository.createCategory("MariaDB");
        categoryRepository.createCategory("SpringBoot");
        categoryRepository.createCategory("AWS");
        categoryRepository.createCategory("PostSQL");
        categoryRepository.createCategory("Oracle");
        categoryRepository.createCategory("Docker");
    }
}
