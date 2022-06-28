import mylist.MyArrayList;
import mylist.MyLinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class UseListAppMain {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            arrayList.add(i);
        }
        for (Object element : arrayList) {
            System.out.println(element);
        }

        printCollection(addElementsToCollection(new ArrayList()));
        printCollection(addElementsToCollection(new LinkedList()));

//        ArrayList<String> arrayList1 = new ArrayList<>();
//        LinkedList<String> linkedList = new LinkedList<>();
//        addElementsToCollection(arrayList1);
//        addElementsToCollection(linkedList);
//        printCollection(arrayList1);
//        printCollection(linkedList);

//        printCollection(addElementsToCollection(new MyArrayList()));
//        printCollection(addElementsToCollection(new MyLinkedList()));

//        printList((List) addElementsToCollection(new ArrayList()));
//        printList((List) addElementsToCollection(new MyArrayList()));
//        printList((List) addElementsToCollection(new MyLinkedList()));
    }


    public static Collection addElementsToCollection(Collection collection) {
        for (int i = 0; i < 10; i++) {
            collection.add("str" + (i % 5));
        }
        return collection;
    }

    public static void printCollection(Collection collection) {
        System.out.println();
        System.out.println("输出" + collection.getClass() + "中的元素，共" + collection.size() + "个");
        try {
            for (Object element : collection) {
                System.out.println(element);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void printList(List list) {
        System.out.println();
        System.out.println("输出" + list.getClass() + "中的元素，共" + list.size() + "个");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}



