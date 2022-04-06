/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.genericscollectionslab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soblab
 */
public class Main {

    public static void main(String[] args) {

        try {
            Collection<String> list1 = new ArrayList<String>();

            File f = new File("File.txt");

            Scanner scan = new Scanner(f);

            while (scan.hasNext()) {
                String str = scan.nextLine();
                list1.add(str);
            }
            System.out.println("Print with Enhanced for: ");
            printAllItems(list1);
            System.out.println("Print using Iterator: ");
            printWithIterator(list1);
            System.out.println("Remove with Iterator: ");
            removeWithIterator(list1, "Mateo");
            System.out.println("Test Remove: ");
            printWithIterator(list1);
            
            list1.add("Mateo");//add the deleted item back, for future test purposes
            
            
            ////////////////////////////////////////////////////////////////////////
            //now onto the lists
            
            
            List<String> list2 = new ArrayList<String>();
            
            list2.addAll(list1);
            
            printAllItems(list2);//check if the list was copied 
            System.out.println("--------------------------");
            System.out.println("After Sort: ");
            
            Collections.sort(list2);
            
            printAllItems(list2);//check if sorted
            
            System.out.println("--------------------------");
            
            
            System.out.println("--------------------------");
            System.out.println("Print in Reverse");
            
            printReverse(list2);
            
            System.out.println("Convert to Array, then print it");
            
            
            list2.toArray();
            
            for(String s : list2){
                System.out.println(s);
            }
            
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void printAllItems(Collection<String> c) {

        for (String t : c) {//it uses an object 
            System.out.println(t);
        }

    }

    public static void printWithIterator(Collection<String> c) {

        Iterator<String> iter;
        iter = c.iterator();

        while (iter.hasNext()) {
            String curr = iter.next();
            System.out.println(curr);
        }

    }

    public static void removeWithIterator(Collection<String> c, String removeMe) {

        Iterator<String> iter;
        iter = c.iterator();

        while (iter.hasNext()) {
            String curr = iter.next();

            if (curr.equals(removeMe)) {
                iter.remove();
                System.out.println("removed successfully");
            }
        }

    }
    
    public static void addToMiddle(List c, String addMe, int position){
        
        ListIterator<String> iter;
        iter = c.listIterator();
        
        int counter = 0;
        
        while(iter.hasNext()){
            
            String curr = iter.next();
            
            
            
            
            
        }
        
        
        
        
    }
    
    public static void printReverse(List c){
        
        ListIterator<String> iter;
        iter = c.listIterator(c.size());
        
        while(iter.hasPrevious()){
            String curr = iter.previous();
            System.out.println(curr);
        }
        
        
        
        
        
    }

}
