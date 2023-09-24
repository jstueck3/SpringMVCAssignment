package edu.wctc.jpalab.entity.collection;


import jakarta.persistence.*;

@Entity
@Table(name = "collection.photo")
public class CollectorPhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long photoId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "collector_id")
    private Collector collector;

}



