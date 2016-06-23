/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author YasH
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();

        for (int j = 0; j < 50; j++) {
            int k = rand.nextInt(40) + 1;
            list.add(k);
            //sort(k,list);
        }
        // to print the list
        System.out.print("Unsorted list : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        SelectionSort(list);
        System.out.print("Sorted List : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    public static void SelectionSort(ArrayList<Integer> list) {

        for (int i = 0; i <= list.size() - 2; i++) {
            // int j = i+1;
            int x = list.get(i), y = list.get(i + 1);
            if (x > y) {
                list.add(i, y);
                list.remove(y);
            }

        }

    }
}
