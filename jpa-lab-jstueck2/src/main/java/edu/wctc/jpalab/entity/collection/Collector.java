package edu.wctc.jpalab.entity.collection;

import jakarta.persistence.*;


@Entity
@Table(name = "collection.collector")
public class Collector {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "collector_id")
        private Long collectorId;

        @Column(name = "name")
        private String name;

        @Column(name = "email")
        private String email;


}

