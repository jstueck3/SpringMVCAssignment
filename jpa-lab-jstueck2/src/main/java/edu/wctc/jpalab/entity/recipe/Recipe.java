package edu.wctc.jpalab.entity.recipe;


import jakarta.persistence.*;

@Entity
@Table(name = "recipe.recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private Long recipeId;

    @Column(name = "recipe_title")
    private String title;

    @Column(name = "description")
    private String description;

    // Add more fields as needed

    @ManyToOne
    @JoinColumn(name = "recipe_chef_id")
    private Chef chef;
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

}
