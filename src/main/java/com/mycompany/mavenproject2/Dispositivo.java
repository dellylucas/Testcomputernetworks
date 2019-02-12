/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.List;

/**
 *
 * @author fabian.lucas
 */
public class Dispositivo extends Hardware {
    private Integer tiempo;

    public Dispositivo(Integer tiempo, String id) {
        super(id);
        this.tiempo = tiempo;
    }


    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    
}
