package com.rafael.ud_project.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Category implements Serializable {

    private Integer id;

    @EqualsAndHashCode.Exclude
    private String name;
  
}
