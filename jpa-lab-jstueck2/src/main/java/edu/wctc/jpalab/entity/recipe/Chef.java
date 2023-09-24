package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.*;

import java.util.List;

    @Entity
    @Table(name = "recipe.chef")
    public class Chef {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "chef_id")
        private Long chefId;

        @Column(name = "name")
        private String name;

        @Column(name = "email")
        private String email;


    }



