package application;

import java.util.Arrays;

public class Exercicio4 {
    public static int[] mergeOrdenado(int[] a, int[] b) {
        
        int[] resultado = new int[a.length + b.length];
        
        int i = 0, j = 0, k = 0;
       
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                resultado[k++] = a[i++];
            } else {
                resultado[k++] = b[j++];
            }
        }
        
        while (i < a.length) {
            resultado[k++] = a[i++];
        }       
        
        while (j < b.length) {
            resultado[k++] = b[j++];
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 9};
        int[] b = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(mergeOrdenado(a, b)));
    }
}