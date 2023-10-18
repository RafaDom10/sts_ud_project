package com.rafael.ud_project.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode( onlyExplicitlyIncluded = true )
public class Product implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @EqualsAndHashCode.Include
    private Integer id;

    private String name;

    private Double price;

    @ManyToMany
    @JoinTable( 
        name = "PRODUCT_CATEGORY",
        joinColumns = @JoinColumn( name = "product_id" ),
        inverseJoinColumns = @JoinColumn( name = "category_id" )
        )
    private List<Category> categories =  new ArrayList<>();

    public Product() {
    }

    public Product(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
}
