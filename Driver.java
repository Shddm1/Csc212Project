/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs212;

/**
 *
 * @author Layan Almasoud
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Driver {
    LinkedList<String> stopWords;
    Index ind;
    InvertedIndex invertedInd;
    
    public Driver(){
     stopWords = new LinkedList<> ();
     ind = new Index();
     invertedInd = new InvertedIndex();
    }
    
    public void loadStopWords(String fileName){
        try{
           File f = new File(fileName);
           Scanner s = new Scanner(f);
           while(s.hasNextLine()){
               String line=s.nextLine();
               stopWords.insert(line);
           }
       }catch(IOException e){
           e.printStackTrace();
       }
    }
    
    public void loadAllDoc(String fileName){
        String line=null;
       try{
           File f = new File(fileName);
           Scanner s = new Scanner(f);
           s.nextLine();
           while(s.hasNextLine()){
               line=s.nextLine();
               
               if(line.trim().length()<=2){
                   System.out.println("Empty line found, skipping this line= "+line);
                   break;
               }
               String i = line.substring(0,line.indexOf(','));
               int id = Integer.parseInt(i.trim());
               String docContent = line.substring(line.indexOf(',')+1).trim();
               LinkedList<String> wordsInDoc = (docContent , id);
               ind.insertDoc(new Document(id,wordsInDoc));
           }
       }catch(Exception e){
           System.out.println("end of file");
       }
    }
    }
