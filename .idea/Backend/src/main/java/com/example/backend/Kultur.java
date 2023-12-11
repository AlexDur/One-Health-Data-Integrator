package com.example.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Kultur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String beschreibung;
    private double wasserbedarf;
    private double lichtbedarf;
    private String kultur;
    private String bodentyp;

    // Getter und Setter

    // Weitere Eigenschaften und Methoden
}
