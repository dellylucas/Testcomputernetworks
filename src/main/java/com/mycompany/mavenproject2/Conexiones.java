/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabian.lucas
 */
public class Conexiones {
    private List<Hardware> hardware;

    public Conexiones() {
        this.hardware = new ArrayList<>();
    }

    public List<Hardware> getListHardware() {
        return hardware;
    }
    public Boolean exists(Hardware hardware){
    if(this.hardware.contains(hardware)){
        return true;
    }
    return false;
    }

}
