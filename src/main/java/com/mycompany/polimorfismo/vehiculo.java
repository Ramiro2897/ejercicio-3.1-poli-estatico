
package com.mycompany.polimorfismo;


public class vehiculo {
        //propiedades
        protected String matricula;
        protected String marca;
        protected String modelo;
//constructor
public vehiculo(String matricula, String marca, String modelo){
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
}

public String getMatricula(){
return matricula;   
}

public String getMarca(){
    return marca;
}

public String getModelo(){
    return modelo;
}

public String mostrarDatos(){
    return "matricula : "+ matricula+"\nmarca :"+marca+ "\nmodelo :"+modelo;
}
//sobre carga de metodos, polimorfismo estatico
public String mostrarDatos(String marcaRuedas){
    return "matricula : "+ matricula+"\nmarca :"+marca+ "\nmodelo :"+"\nVelocidad max :"+marcaRuedas;
}
public String mostrarDatos(String marcaRuedas, String marcaVidrios){
    return "matricula : "+ matricula+"\nmarca :"+marca+ "\nmodelo :"+modelo + "\nNumero de ruedas :"+ marcaRuedas
            +"\nNum de puertas :" + marcaVidrios;
}
}
