/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc212;

/**
 *
 * @author shade
 */
public class Word {
    String text; 
    Linkedlist<Integer>IDs; 
    
    public Word(String w) { 
        text = w ; 
        IDs = new Linkedlist<Integer>() ; 
        
    } 
    public void AddID(int id) 
    {
     if(!SearchIDI(id))
       IDs.insert(id);
    
    } 
    public boolean SearchIDI(Integer ID){
    if(IDs.empty())
        return false;
    
    IDs.findFirst();
    while(!IDs.last()){
      if(IDs.retrieve().equals(ID))
          return true ; 
      IDs.findNext();
    }
    if(IDs.retrieve().equals(ID))     
    return true ; 
    
     return false; 
    
    }
    
   
    
   
    
}
