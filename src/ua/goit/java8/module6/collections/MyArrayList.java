package ua.goit.java8.module6.collections;

import java.util.Collection;

/**
 * Created by t.oleksiv on 18/08/2017.
 */
public class MyArrayList<T> {
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private Object[] elementData;
    private int size;

    public MyArrayList(){
        initializeEmpty();
    }

    private void initializeEmpty(){
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        this.size = 0;
    }

    // add element to the end
    public void add(T element){
        Object[] oldElementData = getElementData();
        Object[] newElementData = new Object[oldElementData.length + 1];
        System.arraycopy(oldElementData, 0, newElementData, 0, oldElementData.length);
        newElementData[newElementData.length - 1] = element;
        elementData = newElementData;
        size++;
    }

    // remove element
    public void remove(int index){
        if (index < size){
            Object[] oldElementData = getElementData();
            Object[] newElementData = new Object[oldElementData.length - 1];
            System.arraycopy(oldElementData, 0, newElementData, 0, index);
            System.arraycopy(oldElementData, index + 1, newElementData, index, size - index - 1);
            elementData = newElementData;
            size--;
        } else {
            System.out.println("Index " + index + " is out of bound! It's impossible to remove the element");
        }
    }

    // clear collection
    public void clear(){
        initializeEmpty();
    }

    // print all elements of ArrayList
    public void print() {
        for(Object element : elementData) {
            System.out.print("" + element + " ");
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }

    public Object[] getElementData() {
        return elementData;
    }

    public Object get(int index){
        if (index < size) {
            return elementData[index];
        } else {
            System.out.println("Index " + index + " is out of bound! It's impossible to get the element");
            return null;
        }
    }
}
