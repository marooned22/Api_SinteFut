package com.example.apisintefut.model;

import jakarta.persistence.*;

@Entity
@Table(name="canchas")
public class Canchas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String DescripcionCanchas;
    private int calificacion;
    private int numeroCancha;
    private boolean estadoCancha;
    private int costos;
    private String tipoCancha;

    public Canchas() {
    }

    public Canchas(int id, String descripcionCanchas, int calificacion, int numeroCancha, boolean estadoCancha, int costos, String tipoCancha) {
        this.id = id;
        DescripcionCanchas = descripcionCanchas;
        this.calificacion = calificacion;
        this.numeroCancha = numeroCancha;
        this.estadoCancha = estadoCancha;
        this.costos = costos;
        this.tipoCancha = tipoCancha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionCanchas() {
        return DescripcionCanchas;
    }

    public void setDescripcionCanchas(String descripcionCanchas) {
        DescripcionCanchas = descripcionCanchas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getNumeroCancha() {
        return numeroCancha;
    }

    public void setNumeroCancha(int numeroCancha) {
        this.numeroCancha = numeroCancha;
    }

    public boolean isEstadoCancha() {
        return estadoCancha;
    }

    public void setEstadoCancha(boolean estadoCancha) {
        this.estadoCancha = estadoCancha;
    }

    public int getCostos() {
        return costos;
    }

    public void setCostos(int costos) {
        this.costos = costos;
    }

    public String getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }
}
