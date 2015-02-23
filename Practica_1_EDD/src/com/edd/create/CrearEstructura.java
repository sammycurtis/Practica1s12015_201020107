/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edd.create;

import com.edd.estructuras.*;
import com.edd.objects.Planta;
import com.edd.objects.Usuario;
import com.edd.objects.Zombi;
/**
 *
 * @author Shuten-Satsu
 */
public class CrearEstructura {
    
    
    public NodoUsuario insertUsuario(NodoUsuario raiz,Usuario nuevoUsuario)
    {
        NodoUsuario nodoUsuario=null;
        if (raiz==null){
            raiz=new NodoUsuario();
            nodoUsuario= new NodoUsuario();
            nodoUsuario.setUsuario(nuevoUsuario);
            raiz=nodoUsuario;            
            raiz.setUltimo(nodoUsuario);
            raiz.sizeUsuario++;
        }
        else 
        {
            NodoUsuario ultimo= raiz.getUltimo();
            nodoUsuario = new NodoUsuario();
            nodoUsuario.setUsuario(nuevoUsuario);
            ultimo.setSiguiente(nodoUsuario);
            nodoUsuario.setAnterior(ultimo);
            nodoUsuario.setUltimo(nodoUsuario);
            raiz.setUltimo(nodoUsuario);
            raiz.sizeUsuario++;
        }
        return raiz;
    }
    
    public NodoPlanta insertPlanta(NodoPlanta raiz,Planta nuevaPlanta)
    {
        NodoPlanta nodoPlanta=null;
        if (raiz==null){
            raiz= new NodoPlanta();
            nodoPlanta= new NodoPlanta();
            nodoPlanta.setPlanta(nuevaPlanta);
            raiz.setUltimo(nodoPlanta);
            raiz=nodoPlanta;            
        }
        else 
        {
            NodoPlanta ultimo= raiz.getUltimo();
            nodoPlanta = new NodoPlanta();
            nodoPlanta.setPlanta(nuevaPlanta);
            ultimo.setSiguiente(nodoPlanta);
            nodoPlanta.setAnterior(ultimo);
            raiz.setUltimo(nodoPlanta);
        }
        return raiz;
    }
    
    
    public NodoZombi insertZombi(NodoZombi raiz,Zombi nuevoZombi)
    {
        NodoZombi nodoZombi=null;
        if (raiz==null){
            raiz= new NodoZombi();
            nodoZombi= new NodoZombi();
            nodoZombi.setZombie(nuevoZombi);
            raiz.setUltimo(nodoZombi);
            raiz=nodoZombi;            
        }
        else 
        {
            NodoZombi ultimo= raiz.getUltimo();
            nodoZombi = new NodoZombi();
            nodoZombi.setZombie(nuevoZombi);
            ultimo.setSiguiente(nodoZombi);
            nodoZombi.setAnterior(ultimo);
            raiz.setUltimo(nodoZombi);
        }
        return raiz;
    }
    
    public NodoCampoAdicional insertZombi(NodoCampoAdicional raiz,String adicional)
    {
        NodoCampoAdicional nodoCampo=null;
        if (raiz==null){
            raiz= new NodoCampoAdicional();
            nodoCampo= new NodoCampoAdicional();
            nodoCampo.setCampoAdicional(adicional);
            raiz.setUltimo(nodoCampo);
            raiz=nodoCampo;            
        }
        else 
        {
            NodoCampoAdicional ultimo= raiz.getUltimo();
            nodoCampo = new NodoCampoAdicional();
            nodoCampo.setCampoAdicional(adicional);
            ultimo.setSiguiente(nodoCampo);
            nodoCampo.setAnterior(ultimo);
            raiz.setUltimo(nodoCampo);
        }
        return raiz;
    }
    
    
}
