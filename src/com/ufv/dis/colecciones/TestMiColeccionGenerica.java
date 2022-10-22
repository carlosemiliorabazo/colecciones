package com.ufv.dis.colecciones;
import java.util.Scanner;
public class TestMiColeccionGenerica { // Muestra una lista de nombres en orden inverso
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nom=scanner.next(); // Leo el primer nombre
        // instancio una MiColeccionGenerica "especializada" en String
        MiColeccionGenerica<String> mcg = new MiColeccionGenerica<String>(5);
        while (!nom.equals("FIN")){
            // inserto siempre en la posicion 0
            mcg.insertar(nom,0);
            // leo el siguiente nombre
            nom=scanner.next();
        }
        String aux;
        // recorro la colección y tomo cada uno de sus elementos
        for (int i=0; i<mcg.cantidad(); i++){
            // no es necesario castear porque el método obtener devuelve String
            aux = mcg.obtener(i);
            System.out.println(aux + " - " + aux.length() + " caracteres");
        }
    }
}
