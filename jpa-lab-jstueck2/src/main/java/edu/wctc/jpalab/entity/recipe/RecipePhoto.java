package edu.wctc.jpalab.entity.recipe;


import jakarta.persistence.*;
@Entity
@Table(name = "recipe.photo")
public class RecipePhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long photoId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

