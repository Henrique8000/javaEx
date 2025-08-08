package application;

public class ForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Henrique", "Amanda"};
		
		for (int i=0; i< vect.length; i++) {
			System.out.println(vect[i]);
			}
		
		System.out.println("=====================");
		for (String obj : vect) {
			System.out.println(obj);
			}
		
		Double[] vect2 = new Double[] {1.0, null, 1.0, 1.0};
		
		System.out.println("=====================");
		for (Double num : vect2) {
			if (num != null) {
				System.out.println(num + 1);
			}
			
		}
		
	}

}
