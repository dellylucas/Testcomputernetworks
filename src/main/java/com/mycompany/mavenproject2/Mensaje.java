/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author fabian.lucas
 */
public class Mensaje {
    private Integer id;
    private String Contenido;
    private String destino;
    private  String origen;
    private  Integer tiempototal;
    private String ruta;

    public Mensaje(Integer id, String Contenido, String destino, String origen, Integer tiempototal, String ruta) {
        this.id = id;
        this.Contenido = Contenido;
        this.destino = destino;
        this.origen = origen;
        this.tiempototal = tiempototal;
        this.ruta = ruta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Integer getTiempototal() {
        return tiempototal;
    }

    public void setTiempototal(Integer tiempototal) {
        this.tiempototal = tiempototal;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
}
