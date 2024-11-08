/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs212;

/**
 *
 * @author Layan Almasoud
 */
public class invertedIndex {
   
     public void add(String text , int id ) {
        Word w = new Word (text) ;
        if(!exist(text)){
                     Word w = new Word(text) ;
                     w.IDs.insert(id);
                     invertedIndex.insert(w)
                             }
        else {
            Word existword = invertedIndex.retrieve():
            existword.AddID(id);
            

        }
    }
      public void viewWords(){
        if(invertedIndex.empty()){
            System.out.println("There are no words");
            return;
        }
        if(invertedIndex==null){
            System.out.println("There are no words");
            return;
        }
        System.out.println("All words information");
        invertedIndex.findFirst ();
        while(!invertedIndex.last()){
          Word word= Word.retrieve ();
          System.out.println("\n---------------------------------");
          System.out.println("Word:"+word.text); 
          System.out.println("[");
          word.IDs.display();
          System.out.println("]");
          invertedIndex.findNext();
        }
         Word word= Word.retrieve ();
          System.out.println("\n---------------------------------");
          System.out.println("Word:"+word.text); 
          System.out.println("[");
          word.IDs.display();
          System.out.println("]");
          invertedIndex.findNext();   
        
    }
}
