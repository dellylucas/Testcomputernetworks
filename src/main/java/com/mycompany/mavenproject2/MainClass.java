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
public class MainClass {
    private static List<Hardware> base;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        base = new ArrayList<>();
        
        Computador comp = new Computador( "255.255.255.1");
        CanalComunicacion canCom = new CanalComunicacion("con0001");
        
        
        Computador copia;
        
        base.add(comp);
        base.add(canCom);        
        
        Dispositivo disp =new Dispositivo(3,"Hub0001");

        base.add(disp);
             Boolean es;   
       es= base.get(0).ConnectHardware(base.get(1));
       es = base.get(1).ConnectHardware(base.get(0));
       
        System.out.println("sss");
    }


    
}
