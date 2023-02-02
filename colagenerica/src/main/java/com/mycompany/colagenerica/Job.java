
package com.mycompany.colagenerica;


public class Job {
    
    int NumeroTrabajo;
    int Tiempo ;

    public Job(int NumeroTrabajo, int Tiempo) {
        this.NumeroTrabajo = NumeroTrabajo;
        this.Tiempo = Tiempo;
    }

    public void setNumeroTrabajo(int NumeroTrabajo) {
        this.NumeroTrabajo = NumeroTrabajo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getNumeroTrabajo() {
        return NumeroTrabajo;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public String toString(){
        String cad = "# trabajo: " + this.NumeroTrabajo + " Tiempo: " + this.Tiempo;
        return cad;
    }
    
}