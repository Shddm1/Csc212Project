/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs212;

/**
 *
 * @author Layan Almasoud
 */
public class InvertedIndex {

   LinkedList<Word> invertedIndex;

   public InvertedIndex(){
invertedIndex = new LinkedList<Word>();
   }
   
   public boolean exist(String t){
        if(invertedIndex==null || invertedIndex.empty())
            return false;
        invertedIndex.findFirst();
        while(!invertedIndex.last())
        {
            if(invertedIndex.retrieve().text.equals(t))
                return true;
            invertedIndex.findNext();
        }
        if(invertedIndex.retrieve().text.equals(t))
                return true;
        
        return false;
        
    }
     public void add(String text , int id ) {
        
        if(!exist(text)){
             Word w = new Word(text);
              w.IDs.insert(id);
              invertedIndex.insert(w);
                             }
        else {
            Word existword;
            existword = invertedIndex.retrieve();
            existword.AddID(id);
            

        }
    }
    }
      public void viewWords(){
       if(invertedIndex==null || invertedIndex.empty()){
            System.out.println("There are no words");
            return;
        }
        System.out.println("All words information");
        invertedIndex.findFirst ();
        while(!invertedIndex.last()){
          Word word= invertedIndex.retrieve();
          System.out.println("\n---------------------------------");
          System.out.println("Word:"+word.text); 
          System.out.println("[");
          word.IDs.display();
          System.out.println("]");
          invertedIndex.findNext();
        }
         Word word= invertedIndex.retrieve();
          System.out.println("\n---------------------------------");
          System.out.println("Word:"+word.text); 
          System.out.println("[");
          word.IDs.display();
          System.out.println("]");
          invertedIndex.findNext();   
        
    }
}
