package com.cc.java;
public class App {
    public static void main(String[] args) {
      // to do
    
     Child  child = new Child();
     ausgabe(child.sayhello());
     ausgabe(child.sayhello("Parent"));
    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
