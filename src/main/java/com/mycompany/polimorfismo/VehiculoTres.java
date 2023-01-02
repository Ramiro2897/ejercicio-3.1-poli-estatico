
package com.mycompany.polimorfismo;

public class VehiculoTres extends vehiculo {
    private final int cilindrada;
    
    public VehiculoTres(int cilindrada, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    public int getCilindrada(){
        return cilindrada;
    }
    
    @Override
    public String mostrarDatos(){
    return "matricula : "+ matricula+"\nmarca :"+marca+ "\nmodelo :"+modelo
                 +"\ncilindrada :"+cilindrada;
}
}
