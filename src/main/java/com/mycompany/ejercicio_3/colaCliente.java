
package com.mycompany.ejercicio_3;

import java.util.ArrayList;


public class colaCliente {
    
    ArrayList<Object> cola1 = new ArrayList<Object>();
    
    public void Push(String s){
        cola1.add(s);
        
    }
        public void Peek(){
            
            if(cola1.size()==0){
                System.out.println("No hay elementos");
                
            }
            else{
                cola1.remove(cola1.get(0));
            }
        }
    
    
        public String VerCola(){
        
        String v=""; 
        for(int i=0;i<cola1.size();i++){
            v+="Cliente Numero:  "+(i+1)+" "+cola1.get(i)+"\n";
        }
            return v;
        }
        
        public int items(){
            
            return cola1.size();    
            
        }
        
        public String Vacia(){
            String a="";
            if(cola1.size()==0){
                
            a="Si";    
            }
            else{
                a="No";
            }
            return a;
        }
        
        public String Ultimo(){
            
            String u="";
            if(cola1.size()==0){
                u+="No hay Clientes";
                
            }
            else{
                u+=cola1.get(cola1.size()-1);
                
                
            }
            
            return u;
            
        }
        
        public String Primero(){
            
            String prim=" ";
            if(cola1.size()==0){
                
            prim +="No hay Clientes";
            
            }
            
            else{
                prim+=cola1.get(0);
            }
            
            return prim;
        }
        
        
        public void Vaciar(){
            
            cola1.clear();
            
        }
        
        
        
        
        
        
}
