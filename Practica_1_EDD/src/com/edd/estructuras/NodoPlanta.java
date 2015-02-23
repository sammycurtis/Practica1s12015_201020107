/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edd.estructuras;

import com.edd.objects.Planta;
/**
 *
 * @author Shuten-Satsu
 */
public class NodoPlanta {
    
    private NodoPlanta anterior;
    private NodoPlanta siguiente;
    private NodoPlanta ultimo;
    private Planta planta;

    /**
     * @return the anterior
     */
    public NodoPlanta getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoPlanta anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the siguiente
     */
    public NodoPlanta getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPlanta siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the ultimo
     */
    public NodoPlanta getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoPlanta ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return the planta
     */
    public Planta getPlanta() {
        return planta;
    }

    /**
     * @param planta the planta to set
     */
    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
    
    
}
