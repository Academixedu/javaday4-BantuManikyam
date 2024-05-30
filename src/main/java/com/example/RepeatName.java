package com.example;
import java.util.*;
/**
 * RepeatName
 */
public class RepeatName {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENter name");
        String name = obj.nextLine();
        System.out.println("Name Please: "+name);
        System.out.println("How many times do you want to repeat ");
        int num = obj.nextInt();
        for (int i=0; i<num; i++){
            System.out.println(name);
        }
        int count = 0;
        while(count<num){
            System.out.println(name);
            count++;

        }
        int doc = 0;
        do {
            System.out.println(name);
            doc++;
        } while (doc<num);
    }

    
}
