/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgenerics;

import java.util.ArrayList;

/**
 *
 * @author hessaalseiari
 */
public class MyGenericList <T> {
    
 private ArrayList<T> list = new ArrayList<>();

    public void addItem(T item) {
        list.add(item);
    }

    public T getItem(int index) {
        return list.get(index);
    }
}
