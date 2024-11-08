/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sdrah
 */
public class Index {
    LinkedList<Document> documentList;

    public Index() {
        documentList=new LinkedList<Document>();
    }
    
    public void insertDoc(Document d){
        documentList.insert(d);
    }
    public void viewDocuments(){
        if(documentList.empty()){
            System.out.println("There are no documents");
            return;
        }
        if(documentList==null){
            System.out.println("There are no documents");
            return;
        }
        System.out.println("All documents information");
        documentList.findFirst ();
        while(!documentList.last()){
          Document doc= documentList.retrieve ();
          System.out.println("\n---------------------------------");
          System.out.println("ID:"+doc.ID); 
          doc.wordsList.display();
          documentList.findNext();
        }
         Document doc= documentList.retrieve ();
          System.out.println("\n---------------------------------");
          System.out.println("ID:"+doc.ID); 
          doc.wordsList.display();
          documentList.findNext();   
        
    }
    
}
