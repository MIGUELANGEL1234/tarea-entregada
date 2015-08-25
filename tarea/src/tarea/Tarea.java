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
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         
        String Viento[]={"Flauta","Clarinetes","Trompetas","trombones"};
        for(int i=0; i<4; i++)
        {
            instrumentodeviento Al= new instrumentodeviento (Viento[i],"DO");
            System.out.println(Al.Mostrar());
        }
        
        String Cuerda[]={"Guitarra","Violin","Guitarrón Chileno","Lira"};
        for(int i=0; i<4; i++)
        {
            instrumentosdecuerda Al2= new instrumentosdecuerda (Cuerda[i],"RE");
            System.out.println(Al2.Mostrar());
        }
        
        String Percusion[]={"Bateria","Bombo","Congas","Platos"};
        for(int i=0; i<4; i++)
        {
            intrumentodepercusion Al23= new intrumentodepercusion(Percusion[i],"FA");
            System.out.println(Al23.Mostrar());
        }
    }
    
}
