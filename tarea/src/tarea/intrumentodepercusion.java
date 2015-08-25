/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author MARLON
 */
public class intrumentodepercusion extends instrumento
{
   public intrumentodepercusion(String Nombre, String Tocar){
            super(Nombre, Tocar);
            
    
    }
    
 public String Mostrar ()
 {
     return super.mostrar()+"\n ES UN INSTRUMENTO DE PERCUSIÓN AFINADO";
 }        
}
