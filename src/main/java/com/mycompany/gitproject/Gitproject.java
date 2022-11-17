/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gitproject;

/**
 *
 * @author Admin
 */
public class Gitproject {
    

     public int add(int a, int b){
        return a + b;
     }
    public static int mul(int a, int b) throws Exception {
        if (a == 2) throw new Exception();
        return a * b + 1;

    }

    public static void main(String[] args) {
        int m;
        try {
            m = mul(2, 3);
         } catch (Exception ex) {
            System.out.println(ex.getMessage());
         }
        System.out.println("res = " + m);
        System.out.println("Hello Worlddsgfkjdsgkjdrhesk!");
    }
}
