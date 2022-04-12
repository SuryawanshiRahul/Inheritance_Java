package com.infogalaxy;

public class Result extends Internal {
    int per = 0;
    int total = 0;

    void getResult() {
        total = m1 + m2;
        per = total / 2;
        System.out.println("Student ID is :" + id);
        System.out.println("Student Name Is:" + name);
        System.out.println("M1 marks :" + m1);
        System.out.println("M2 mark:" + m2);
        System.out.println("Total Marks :" + total);
        System.out.println("percentage :" + per);
    }
}

    class Main {
        public static void main(String[] args) {
            Result result = new Result();
            result.setStudent();
            result.setInternal();
            result.getResult();

        }
    }
