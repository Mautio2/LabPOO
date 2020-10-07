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
public class DispositivoElectronico {

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    private String  marca;
    private String  modelo;
    public  void Encender(){
    System.out.println("Dispositivo ON");
    }
    public String Apagar()
    {return"Dispositivo OFF, se ha detenido la autodestruccion";}
   
  
              
            
    
    
}

