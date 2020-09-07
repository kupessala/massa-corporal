/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc.modelo;

/**
 *
 * @author student
 */
public class imcClas {

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.peso;
        hash = 11 * hash + this.altura;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final imcClas other = (imcClas) obj;
        if (this.peso != other.peso) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        return true;
    }
     private int peso;
     private int altura;
}
