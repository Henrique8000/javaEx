package application;

import java.util.Arrays;

public class Exercicio5 {
    public static void moveZeros(int[] v) {
        int write = 0;
        
        for (int read = 0; read < v.length; read++) {
        	
            if (v[read] != 0) {
                v[write] = v[read];
   
                if (read != write) {
                    v[read] = 0;
                }
                write++;
            }
        }
    }

    public static void main(String[] args) {
        int[] v = {0, 1, 0, 3, 12};
        moveZeros(v);
        System.out.println(Arrays.toString(v));
    }
}