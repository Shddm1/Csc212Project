/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sdrah
 */
public class Document {
      public static <T> boolean existInList(List<T> L ,String word){
    if(L.empty())
        return false;
    L.findFirst();
    while(!L.last()){
      if(L.retrieve().equals(word))
          return true ; 
      L.findNext();
    }
    if(L.retrieve().equals(word))     
    return true ; 
    
     return false; 
    
    }
    
}
