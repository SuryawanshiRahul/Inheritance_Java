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

 class  Result extends Student{

    void getResult(){
        System.out.println("Student ID is :"+id);
        System.out.println("Student Name Is:"+name);
    }
 }
 class Main{
     public static void main(String[] args) {
         Result result = new Result();
         result.setStudent();
         result.getResult();

     }
 }
