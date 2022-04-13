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
    void getStudent(){
        System.out.println("Student Id is :"+id);
        System.out.println("Student Name is:"+name);
    }
}
 class Internal extends Student {
     int m1;
     int m2;

     void setInternal() {
         System.out.println("Enter M1 marks");
         m1 = sc.nextInt();
         System.out.println("Enter M2 marks");

         m2 = sc.nextInt();
     }
     void  getInternal(){
         System.out.println("M1 marks :"+m1);
         System.out.println("M2 marks :"+m2);
     }
 }
 class  External extends Student{
     int em1;
     int em2;
    void setExternal() {
        System.out.println("Enter EM1 marks :");
        em1 = sc.nextInt();
        System.out.println("Enter EM2 marks :");
        em2 = sc.nextInt();
    }
    void getExternal(){
        System.out.println("is EM1 marks :");
        System.out.println("is EM2 marks :");
    }
 }
 class Main {
     public static void main(String[] args) {
         int total;
         int per ;
        External ex = new External();
        Internal in = new Internal();
        in.setStudent();
        in.setInternal();
         in.getStudent();
         in.getInternal();
         ex.setStudent();
         ex.setExternal();
         ex.getStudent();
         ex.getExternal();


     }

}

