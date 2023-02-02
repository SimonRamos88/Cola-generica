
package com.mycompany.colagenerica;

public interface ColaGenerica <T>{
    
    public boolean empty();
    
    public boolean full();
    
    public void encolar(T item);
    
    public T desencolar();
    
    
}
