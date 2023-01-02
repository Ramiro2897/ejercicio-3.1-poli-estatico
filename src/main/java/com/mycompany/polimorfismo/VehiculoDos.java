
package com.mycompany.polimorfismo;


public class VehiculoDos extends vehiculo {
    private final int nPuertas;
    
    public VehiculoDos(int nPuertas, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    
    public int getPuertas(){
        return nPuertas;
    }
    //sobreescribimos el metodo de la clase padre
    @Override
    public String mostrarDatos(){
         return "matricula : "+ matricula+"\nmarca :"+marca+ "\nmodelo :"+modelo
                 +"\nNumero de puertas :"+nPuertas;
         
    }
    //sobreescrimos los metodos
    @Override
    public String mostrarDatos(String marcaRuedas, String marcaVidrios) {
        return "matricula : "+ matricula+"\nmarca :"+marca+ "\nmodelo :"+modelo + "\nNumero de ruedas :"+ marcaRuedas
            +"\nLa marca de vidrios es :" + marcaVidrios;
    }

    @Override
    public String mostrarDatos(String marcaRuedas) {
        return "matricula : "+ matricula+"\nmarca :"+marca+ "\nmodelo :"+"\nLa marca de ruedas es :"+marcaRuedas;
    }
    //aplicamos el polimorfismo estatico, sobrecarga de metodos
     public String mostrarDatos(String marcaRuedas, int codigo) {
        return "matricula : "+ matricula+"\nmarca :"+marca+ "\nmodelo :"+"\nLa marca de ruedas es :"+marcaRuedas +
                "\nCodigo :"+codigo;
    }
}
