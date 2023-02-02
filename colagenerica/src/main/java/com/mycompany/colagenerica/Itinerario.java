
package com.mycompany.colagenerica;
import java.util.Scanner;

public class Itinerario {
    int numeroTrabajos;
    int token;
    Cola itinerario;
    
    
    public void CorrerItiner(){
        Scanner sc = new Scanner(System.in);      
        int acumCPU = 0;
        /*Ciclo de lectura para cada trabajo*/
        for(int i =0; i<numeroTrabajos; i++){
            System.out.println("Ingrese numero de trabajo: ");
            int num = sc.nextInt();
            System.out.println("Ingrese tiempo: ");
            int tiem = sc.nextInt();
            Job job = new Job(num,tiem);
            itinerario.encolar(job);
        }
        
        /*Ciclo de impresion de la info y procesamiento de cada trabajo*/
        while(!itinerario.empty()){
            Job j = (Job) itinerario.desencolar();
            int tiempo = j.getTiempo();         
            if(Procesar(tiempo) <=0){
                acumCPU += tiempo;
                System.out.println(j.toString() + "FINALIZADO EN: " + acumCPU);
            }
            else{
                acumCPU += token;
                j.setTiempo(Procesar(tiempo));
                itinerario.encolar(j);
            }
            System.out.println("ACUMULADO: " + acumCPU);
        }
    
    }
    
    public int Procesar(int tiempo){
        return tiempo-this.token;
    }
    
    public Itinerario(int n, int token){
        this.numeroTrabajos = n;
        this.itinerario = new Cola(n);
        this.token = token;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de trabajos: ");
        int n = sc.nextInt();
        System.out.println("Ingrese token: ");
        int m = sc.nextInt();
        Itinerario itiner = new Itinerario(n,m);
        itiner.CorrerItiner();
      
    }
    
    
    
}
