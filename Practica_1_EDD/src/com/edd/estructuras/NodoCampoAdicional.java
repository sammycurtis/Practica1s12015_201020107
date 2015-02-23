/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edd.estructuras;

/**
 *
 * @author Shuten-Satsu
 */
public class NodoCampoAdicional {
    
    private NodoCampoAdicional siguiente;
    private NodoCampoAdicional anterior;
    private NodoCampoAdicional ultimo;
    private String campoAdicional;

    /**
     * @return the siguiente
     */
    public NodoCampoAdicional getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCampoAdicional siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoCampoAdicional getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoCampoAdicional anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the ultimo
     */
    public NodoCampoAdicional getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoCampoAdicional ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return the campoAdicional
     */
    public String getCampoAdicional() {
        return campoAdicional;
    }

    /**
     * @param campoAdicional the campoAdicional to set
     */
    public void setCampoAdicional(String campoAdicional) {
        this.campoAdicional = campoAdicional;
    }
    
}
