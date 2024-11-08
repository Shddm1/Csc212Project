/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sdrah
 */
public interface List<T> {
public boolean last();
public void findFirst( );
public void findNext( );
public T retrieve( );
public void update(T e);
public void insert(T e);
public void remove( );
public boolean full( );
public boolean empty( );
    
}
