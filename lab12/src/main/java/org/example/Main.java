package org.example;

import org.example.tester.Tester;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Помелов");
        Tester.hello();
        Tester.hello("Максим");
        Tester.hello("Максим",3);
        Tester tester = new Tester("qwe", "qwe", "qwe", 12, 32);
        System.out.println(tester);
    }
}