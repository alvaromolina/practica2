package com.ucbcba.taller.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by alvaro on 19/4/17.
 */
public class Autor {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy="articleCategory", cascade = CascadeType.ALL)
    private Set<Article> articles;

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private Set<Article> getArtcles() {
        return articles;
    }
}
