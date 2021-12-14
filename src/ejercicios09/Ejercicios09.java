/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicios09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio03();
    }
    
    public static void ejercicio01(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            if(!Character.isLetter(sb.charAt(i))){
                sb.setCharAt(i, '_');
                
            }
            
        }
        System.out.printf("resultado: %s\n", sb);
        
    }
    
    public static void ejercicio02(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        StringBuilder sb = new StringBuilder("[");
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(", ");
            sb.append(array[i]);
            
        }
        sb.append(']');
        System.out.println(sb);
        
    }
    
    public static void ejercicio03mal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una string: ");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        System.out.print("Introduce una string: ");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());  
        char[] a1 = new char[sb1.length()];
        sb1.getChars(0, sb1.length(), a1, 0);
        char[] a2 = new char[sb1.length()];
        sb2.getChars(0, sb2.length(), a2, 0);
        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(a2);
        if(java.util.Arrays.equals(a1,a2)){
            System.out.println("son anagrama");
        }else{
            System.out.println("no son anagrama");
        }
        
        
        
    }
    public static void ejercicio03(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una string: ");
        String s1 = sc.nextLine();
        System.out.print("Introduce una string: ");
        String s2 = sc.nextLine(); 
        
        if(java.util.Arrays.equals(a1,a2)){
            System.out.println("son anagrama");
        }else{
            System.out.println("no son anagrama");
        }
        
        
        
    }
    public static boolean compareString(String s1, String s2){
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        
        
        return sb1.equals(sb2);
    }
    public static StringBuilder ordenar(StringBuilder sb){
        char aux;
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 1; j < sb.length(); j++) {
                if(sb.charAt(i) < sb.charAt(j))
                
            }
            
        }
        
        
        
        return sb;
    }
    
}
