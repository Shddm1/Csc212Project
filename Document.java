/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sdrah
 */
public class Document {
    int ID;
    LinkedList<String> wordsList=new LinkedList<String>();
    
    public Document(int id,LinkedList<String> words){
       ID=id;
       wordsList=words;
        
    }
    
    
    
    
    
    /*public static <T> boolean existInList(List<T> L ,String word){
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
    
    }*/
    
}

