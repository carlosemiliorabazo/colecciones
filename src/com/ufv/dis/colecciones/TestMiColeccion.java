package com.ufv.dis.colecciones;
import java.util.Scanner;
public class TestMiColeccion { // Muestra una lista de nombres en orden inverso
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Creo una colección de capacidad inicial 5
        MiColeccion mc = new MiColeccion(5);
        System.out.println("Ingrese nombre: ");
        String nom=scanner.next(); // Leo el primer nombre
        while (!nom.equals("FIN")){
            // inserto siempre en la posicion 0
            mc.insertar(nom,0);
            // leo el siguiente nombre
            nom=scanner.next();
        }
        String aux;
        // recorro la colección y tomo cada uno de sus elementos
        for (int i=0; i<mc.cantidad(); i++){
            // el metodo obtener retorna un Object que tengo que castear a String
            aux = (String)mc.obtener(i);
            System.out.println(aux + " - " + aux.length() + " caracteres");
        }
    }
}
