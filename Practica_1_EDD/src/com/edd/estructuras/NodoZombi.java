/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edd.estructuras;

import com.edd.objects.Zombi;
/**
 *
 * @author Shuten-Satsu
 */
public class NodoZombi {
    
    private Zombi zombie;
    private NodoZombi siguiente;
    private NodoZombi anterior;
    private NodoZombi ultimo;
    /**
     * @return the zombie
     */
    public Zombi getZombie() {
        return zombie;
    }

    /**
     * @param zombie the zombie to set
     */
    public void setZombie(Zombi zombie) {
        this.zombie = zombie;
    }

    /**
     * @return the siguiente
     */
    public NodoZombi getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoZombi siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoZombi getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoZombi anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the ultimo
     */
    public NodoZombi getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoZombi ultimo) {
        this.ultimo = ultimo;
    }
    
    
    
    
}
