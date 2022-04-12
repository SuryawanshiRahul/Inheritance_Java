package com.infogalaxy;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    void  setStudent(){
        System.out.println("Enter Student ID and Name :");
        id = sc.nextInt();
        name = sc.next();
    }
}
 class Internal extends Student {
     int m1;
     int m2;

     void setInternal() {
         System.out.println("Enter M1 and M2");
         m1 = sc.nextInt();
         m2 = sc.nextInt();
     }

 }

