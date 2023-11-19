package com.example.apisintefut.model;

import jakarta.persistence.*;

@Entity
@Table(name="centro_deportivo")
public class centroDeportivo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String descripcionCentro;
    private int calificacion;


    public centroDeportivo() {
    }

    public centroDeportivo(int id, String descripcionCentro, int calificacion) {
        this.id = id;
        this.descripcionCentro = descripcionCentro;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionCentro() {
        return descripcionCentro;
    }

    public void setDescripcionCentro(String descripcionCentro) {
        this.descripcionCentro = descripcionCentro;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
