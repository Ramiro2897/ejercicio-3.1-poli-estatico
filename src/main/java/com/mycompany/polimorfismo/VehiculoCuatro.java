
package com.mycompany.polimorfismo;


public class VehiculoCuatro extends vehiculo {
    public int carga;
    
    public VehiculoCuatro(int carga, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    
    public int getCarga(){
        return carga;
    }
    
    @Override
      public String mostrarDatos(){
         return "matricula : "+ matricula+"\nmarca :"+marca+ "\nmodelo :"+modelo
                 +"\ncarga :"+carga;
    }
}
