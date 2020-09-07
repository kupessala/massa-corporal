/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc.modelo;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author student
 */
@Named(value = "imcBean")
@RequestScoped
public class imcBean {

    public imcClas getIMC() {
        return IMC;
    }

    public void setIMC(imcClas IMC) {
        this.IMC = IMC;
    }
    imcClas IMC;
    @PostConstruct
public void init(){
  IMC=new imcClas();  
}
public int total(){
    return getIMC().getAltura()*getIMC().getAltura()+getIMC().getPeso();
}
}
