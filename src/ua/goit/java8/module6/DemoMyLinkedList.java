package ua.goit.java8.module6;

import ua.goit.java8.module6.collections.MyLinkedList;

/**
 * Created by t.oleksiv on 18/08/2017.
 */
public class DemoMyLinkedList {
    private MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    public DemoMyLinkedList(){
        showDemo();
    }

    private void showDemo(){

        System.out.println("Add elements to MyLinkedList:");
        myLinkedList.add(2);
        myLinkedList.add(-2);
        myLinkedList.add(10);
        myLinkedList.add(4);
        myLinkedList.add(1);
        showInfo();

        System.out.println("Get element by index:");
        int index = 2;
        Object arrayListElement = myLinkedList.get(index);
        if (arrayListElement != null) {
            System.out.println("Element " + index + " is " + arrayListElement);
        }
        System.out.println();

        System.out.println("Remove element from MyLinkedlist:");
        index = 4;
        myLinkedList.remove(index);
        showInfo();

        System.out.println("Clear MyLinkedList:");
        myLinkedList.clear();
        showInfo();
    }

    private void showInfo(){
        myLinkedList.print();
        System.out.println("Size is " + myLinkedList.getSize());
        System.out.println();
    }
}
