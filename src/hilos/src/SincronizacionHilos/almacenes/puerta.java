package SincronizacionHilos.almacenes;

public class puerta {

    private boolean libre;

    // Constructor
    public puerta(){
        this.libre = true;
    }

//    synchronized public boolean estadoPuerta(){
//        return this.libre;
//    }

    synchronized public boolean intentarEntrar(){
        if(libre){  // Entramos por la puerta que está abierta
            libre = false;  // Cerramos la puerta al entrar
            return true;
        } else {
            return false;
        }
        /*

        if (this.libre) return true;

        // Si llegamos aqui, la puerta estaba libre, por que la pondremos ocupada
        // un tiempo y luego la volveremos a poner libre

        this.libre = false;
        return true;
        */
    }

    synchronized public void liberarPuerta(){
        this.libre = true;
    }
}