package com.company;

public class Main {

    private String memberVariable = "I am a member variable i have class level scope";
    private int memberInt = 10;
    private int count = 0;

    public static void main(String[] args) {
        // write your code here
        // scope  notes and praxtice

        Main main = new Main();
        //  main.aMethod();
//main.anotherMethod();
        //main.methodForloopVariables();
        main.memberVsLocalVariables();
    }


    private void aMethod() {

        String localVariable = "I am a local variable and i can only be used in this method";

        System.out.println("Inside first method");

        System.out.println(memberVariable);
        System.out.println(localVariable);

    }


    private void anotherMethod() {
        System.out.println("Inside second method");

        System.out.println();
        System.out.println(memberVariable);
    }


    private void methodForloopVariables() {

        String localVariable = "just another member variable outside of our do while loop";

        boolean runDoLoop = true;

        do {
            String loopVariable = "I am a loop variable inside our do while loop";
            System.out.println("Inside our do while loop");
            System.out.println("localVariable");
            runDoLoop = false;
        } while (runDoLoop);
        System.out.println("Inside third method just outside do while loop");
        System.out.println(localVariable);
        System.out.println();


    }

    private void memberVsLocalVariables() {

        int localInt = 7;

        localInt *= 2;
        memberInt *= 2;

        if (count <= 2) {
            System.out.println("memberInt *= 2 = " + memberInt);
            System.out.println("localInt *= 2 = " + localInt);
            count++;
        }


    }


}
