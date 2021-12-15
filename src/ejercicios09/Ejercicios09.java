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
        //ejercicio01();
        //ejercicio02();
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
    
    public static void ejercicio03(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una string: ");
        String s1 = sc.nextLine();
        System.out.print("Introduce una string: ");
        String s2 = sc.nextLine(); 
        
        if(compareString(s1, s2)){
            System.out.println("son anagrama");
        }else{
            System.out.println("no son anagrama");
        }
        
        
        
    }
    public static boolean compareString(String s1, String s2){
        StringBuilder sb1 = ordenar(new StringBuilder(s1));
        StringBuilder sb2 = ordenar(new StringBuilder(s2));
        
        return sb1.compareTo(sb2) == 0;
        
    }
    public static StringBuilder ordenar(StringBuilder sb){
        char aux;
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if(sb.charAt(i) < sb.charAt(j)){
                    aux = sb.charAt(i);
                    sb.replace(i, i+1, Character.toString(sb.charAt(j)));
                    sb.replace(j, j+1, Character.toString(aux));
                }
                
            }
            
        }
        
        
        return sb;
    }
    
}
