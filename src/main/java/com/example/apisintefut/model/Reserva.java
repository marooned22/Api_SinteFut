package com.example.apisintefut.model;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class Reserva {
    private int id;

    private Date fecha;

    private LocalTime horaInicio;

    private LocalTime horaFin;

    private String pago;

    public Reserva() {
    }

    public Reserva(int id, Date fecha, LocalTime horaInicio, LocalTime horaFin, String pago) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.pago = pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
}


