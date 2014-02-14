
public class Matrix {
	
	public static void main(String[] args) {
		
		Operate matrix = new Operate();
		
		int a[][] = new int[2][2];
		
		a[0][0] = 2;
		a[0][1] = 4;
		a[1][0] = 6;
		a[1][1] = 8;
		
		System.out.println("2x2 Matrix");
		System.out.println("");
		System.out.println("|"+ a[0][0] + " " + a[0][1] + "|");
		System.out.println("|"+ a[1][0] + " " + a[1][1] + "|");
		
		int detA = matrix.det(a);
		boolean invers = matrix.inv(detA);
				
		System.out.println("");
		System.out.println("Determinante det(A): " + detA);	
		System.out.println("Die Matrix hat eine Inverse: " + invers);
		
	}

}
