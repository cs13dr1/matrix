
public class Operate {

	int det(int a[][]) {
		int detA = (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);
		inv(detA);
		return detA;
	}
	
	boolean inv(int a) {
		if (a != 0) {
		return true;
		} else {
			return false;
		}
	}
	
}
