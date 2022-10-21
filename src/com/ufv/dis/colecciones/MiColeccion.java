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

    public void insertar(Object elm, int i){
        if (len==datos.length){
            Object aux[] = datos;
            datos = new Object[datos.length*2];
            for (int j=0; j<len; j++){
              datos[j]=aux[j];
            }
            aux=null;
        }
        for (int j=len-1; j>=i; j--){
            datos[j+1]=datos[j];
        }
        datos[i]=elm;
        len++;
    }
}
