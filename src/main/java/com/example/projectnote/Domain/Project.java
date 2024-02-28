package com.example.projectnote.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectId", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String linkGithub;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<CategoryProject> categoryProjects = new ArrayList<>(); //주문 회원

    public void addCategoryProject (CategoryProject categoryProject) {
        this.categoryProjects.add(categoryProject);
        categoryProject.setProject(this);
    }
}
