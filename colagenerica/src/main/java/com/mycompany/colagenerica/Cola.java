
package com.mycompany.colagenerica;

public class Cola<T> implements ColaGenerica<T>{
    private T[] arreglo;
    private int front;
    private int back;
    private int count;
    
    
    public boolean full(){
        return count== this.arreglo.length;
    }
    
     public boolean empty(){
        return count == 0;
    }
    
    public T desencolar(){
        if(empty()){
            throw new IllegalArgumentException("Esta vacio pa");          
        }
        T e = this.arreglo[front];
        int n = this.arreglo.length;
        front = (front+1)%n; //Hacemos la cola circular
        count --;
        return e;
        
    
    }
    
    public void encolar(T e){
        if(full()){
            throw new IllegalArgumentException("Esta lleno pa"); 
        }
        this.arreglo[this.back] = e;
        int n = this.arreglo.length;
        back = (back + 1)%n;
        count++;
    }
    
    public Cola(){
        this(5);
    }
    public Cola(int n){
        T[] arreglo = (T[]) new Object[n];
        this.arreglo = arreglo;
        this.front = 0;
        this.back = 0;
        this.count = 0;
    }
    
    public String toString(){ //Este toString es inútil
        String cad = "[";
        for(T x: this.arreglo){
            cad += x + " ";
        }
        cad += "]";
        return cad;
    }
    
    public static void main(String[] args) {
        Cola cola = new Cola(3);
        cola.encolar(1);
        System.out.println(cola.toString());
        cola.encolar(2);
        System.out.println(cola.toString());
        cola.encolar(3);
        System.out.println(cola.toString());
        int i = (Integer) cola.desencolar();
        System.out.println(i);
        cola.encolar(4);
        System.out.println(cola.toString());
        i =(Integer) cola.desencolar();
        System.out.println(i);
        cola.encolar(5);
        System.out.println(cola.toString());
        i = (Integer) cola.desencolar();
        System.out.println(i);
        cola.encolar(6);
        System.out.println(cola.toString());
         i = (Integer) cola.desencolar();
        System.out.println(i);
         i =(Integer)  cola.desencolar();
        System.out.println(i);
         i = (Integer)  cola.desencolar();
        System.out.println(i);
         i = (Integer) cola.desencolar();
        System.out.println(i);
    }
    
}
