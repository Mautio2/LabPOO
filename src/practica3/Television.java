/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author mauricioceballos
 */
public class Television extends DispositivoElectronico implements IControl {
     public String CambiarCanal(int ch)
     {return "Cambiando a canal "+ch;}
     public String Volumen( int vol)
     {return "Cambiando el volumen a " +vol;}
     public String Autodestruir()
     {return "Autodestruccion inicializada";}
    private String Color; 
    
public String ConfigMenu(){
    
   return "Configurando Menu...";
      
}

    
}

