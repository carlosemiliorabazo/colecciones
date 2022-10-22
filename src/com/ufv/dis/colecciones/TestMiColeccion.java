package com.ufv.dis.colecciones;
// Muestra una lista de nombres en orden inverso
import java.util.Scanner;
public class TestMiColeccion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Creo una colección de capacidad inicial 5
        MiColeccion mc = new MiColeccion(5);
        // Leo el primer nombre
        System.out.println("Ingrese nombre: ");
        String nom=scanner.next();

        while (!nom.equals("FIN")){
            // inserto siempre en la posicion 0
            mc.insertar(nom,0);
            // leo el siguiente nombre
            nom=scanner.next();
        }
        String aux;

        // recorro la colección y tomo cada uno de sus elementos
        for (int i=0; i<mc.cantidad(); i++){
            // el metodo obtener retorna un Object entonces
            // tengo que castear a String
            aux = (String)mc.obtener(i);
            System.out.println(aux + " - " + aux.length() + " caracteres");
        }
    }
}
