/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edd.menu;

import com.edd.estructuras.NodoUsuario;
import com.edd.objects.Usuario;
import com.edd.create.CrearEstructura;
/**
 *
 * @author Shuten-Satsu
 */
public class Menu {
    
 static NodoUsuario usuarios;

   public static void main(String[] args)
   {
       NodoUsuario usuarios= null;
       CrearEstructura create= new CrearEstructura();
       for(int i = 0;i<3;i++)
       {
           Usuario usuario = new Usuario();
           usuario.setNombre("Sammy "+i);
           usuario.setCantidadObjects(5+i);
           usuarios=create.insertUsuario(usuarios, usuario);
        }
       
       while(usuarios!=null)
       {
           Usuario usuario=usuarios.getUsuario();
           System.out.println(usuario.getNombre()+" "+usuario.getCantidadObjects());
           usuarios=usuarios.getSiguiente();
       }
       
       
   }
    
}




