package com.example.projectnote.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class CategoryProject {

    @Id @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "projectId")
    private Project project;
}
