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
public class Hardware {
    private  String id;
    private Conexiones conexion;

    public Hardware(String id) {
        this.id = id;
        this.conexion = new Conexiones();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Conexiones getConexion() {
        return conexion;
    }


    public Boolean ConnectHardware(Hardware hardware) {
        if(!this.conexion.exists(hardware)){
         this.conexion.getListHardware().add(hardware);
        return true;
        }       
        return false;
    }
    

    
    
    
}
