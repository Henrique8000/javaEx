package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Parte da aula de Curingas Delimitados

public class PrincipioGetPut {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
	// A lista "source" é um caso de covariancia: get = OK / put = error
		
	// A lista "destiny" é um caso de contravariância: get = error / put = OK
	
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
}
