/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edd.estructuras;

import com.edd.objects.Usuario;
/**
 *
 * @author Shuten-Satsu
 */
public class NodoUsuario {
    
    private Usuario  usuario;
    private NodoUsuario anterior;
    private NodoUsuario siguiente;
    private NodoUsuario ultimo;
    public static int sizeUsuario;
    /**
     * @return the anterior
     */
    public NodoUsuario getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoUsuario anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the siguiente
     */
    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the ultimo
     */
    public NodoUsuario getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoUsuario ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
