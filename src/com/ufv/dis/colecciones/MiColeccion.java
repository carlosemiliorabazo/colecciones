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
    // inserta un elemento en la i-ésima posición del array
    public void insertar(Object elm, int i){
        // capacidad del array colmada?
        if (len==datos.length){
            // creamos nuevo array con el doble capacidad del anterior
            Object aux[] = datos;
            datos = new Object[datos.length*2];
            // copiamos en el array los elementos del anterior
            for (int j=0; j<len; j++){
              datos[j]=aux[j];
            }
            aux=null; // asignamos null al array anterior
        }
        for (int j=len-1; j>=i; j--){
            datos[j+1]=datos[j];
        }
        datos[i]=elm;
        len++;
    }
    // recorre el array mientras no encuentre el elemento que busca
    public int buscar(Object elm){
        int i=0;
        // mientras no me pase del tope y mientras no encuentre...
        for ( ;i<len && !datos[i].equals(elm); i++);
        // si no me pasé entonces encontré, si no, no encontré
        return i<len ? i : -1;
    }
    // agrega un elemento al final del array
    public void agregar(Object elm){
        insertar(elm, len);
    }
    // elimina el i-ésimo elemento desplazando hacia arriba
    // los elementos que están a partir de la posición i+1
    public Object eliminar(int i){
        Object aux = datos[i];
        for (int j=i; j<len-1; j++){
            datos[j]=datos[j+1];
        }
        len--;
        return aux; // retorna el elemento eliminado de la colección
    }
}
