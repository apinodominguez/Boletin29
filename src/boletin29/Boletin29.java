package boletin29;

import java.util.ArrayList;

public class Boletin29 {

    public static void main(String[] args) {

        ArrayList <Barco> listaBarcos = new ArrayList<>();
        Veleros obxVelero = new Veleros();
        Deportivas obxDeportivas = new Deportivas();
        Yates obxYates = new Yates();
        
        Barco vel = new Veleros(5,1234,10);
        listaBarcos.add(vel);
        Barco dep = new Deportivas(200,2345,20);
        listaBarcos.add(dep);
        Barco yat = new Yates(500, 10, 3456,80);
        listaBarcos.add(yat);
        for  (Barco bar: listaBarcos){
            System.out.println(bar.toString() + " alquiler: " + bar.calcularAlquiler());
        }
        
        
    }
    
}
