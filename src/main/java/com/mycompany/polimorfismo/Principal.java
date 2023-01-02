
package com.mycompany.polimorfismo;


public class Principal {
    public static void main(String[] args){
        //reservamos 4 espacios para vehiculos en el array
        vehiculo misVehiculos[] = new vehiculo[3];
        // aplicando polimorfismo
        misVehiculos[0] = new vehiculo("mazda", "mzd-20", "nuevo");
        misVehiculos[1] = new VehiculoDos(4, "wer-weo", "ford", "2023");
        misVehiculos[2] = new VehiculoTres(250, "wer-opi", "nissan", "2022");
        
         // bucle forEach
    for(vehiculo vehiculos: misVehiculos){
           // System.out.println(vehiculos.mostrarDatos());
            System.out.println(vehiculos.mostrarDatos("maxxis", "voalt"));
            System.out.println(" ");
           // System.out.println(vehiculos.mostrarDatos());
    }
}

}
