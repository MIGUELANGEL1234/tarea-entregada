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
public class instrumento
{
String Nombre;
    String Tocar;
    
public instrumento(String Nombre, String Tocar)
{

    this.Nombre=Nombre;
    this.Tocar=Tocar;
    
}
    

public String mostrar()
{
    return "El instrumento es: "+Nombre+"\n Tocar la nota: "+Tocar;
}    
}
