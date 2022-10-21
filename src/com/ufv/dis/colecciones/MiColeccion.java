package com.ufv.dis.colecciones;

public class MiColeccion {
    private Object datos[] = null ;
    private int len = 0;
    // En el constructor se especifica la cantidad inicial

    public MiColeccion(int capacidadInicial){
        datos = new Object[capacidadInicial];
    }

    // retorna el i-esimo elemento de la colección
    public Object obtener(int i){
        return datos[i];
    }

    //indica cuantos elementos tiene la coleccion
    public int cantidad(){
        return len;
    }
}
