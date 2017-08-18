package ua.goit.java8.module6;

import ua.goit.java8.module6.collections.MyArrayList;

/**
 * Created by t.oleksiv on 18/08/2017.
 */
public class DemoMyArrayList {
    private MyArrayList<String> myArrayList = new MyArrayList<>();

    public DemoMyArrayList(){
        showDemo();
    }

    private void showDemo() {

        System.out.println("Add elements to MyArrayList:");
        myArrayList.add("taras1");
        myArrayList.add("taras2");
        myArrayList.add("taras0");
        myArrayList.add("taras1");
        showInfo();

        System.out.println("Get element by index:");
        int index = 2;
        Object arrayListElement = myArrayList.get(index);
        if (arrayListElement != null) {
            System.out.println("Element " + index + " is " + arrayListElement);
        }
        System.out.println();

        System.out.println("Remove element from MyArraylist:");
        index = 2;
        myArrayList.remove(index);
        showInfo();

        System.out.println("Clear MyArraylist:");
        myArrayList.clear();
        showInfo();
    }

    private void showInfo(){
        myArrayList.print();
        System.out.println("Size is " + myArrayList.getSize());
        System.out.println();
    }
}
