package com.HrmsProjesi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Language {

    public enum Level {
        LOW,MEDIUM,HIGH,EXPERT
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Level level;

    //@ManyToOne
    //private Cv cv;
}
