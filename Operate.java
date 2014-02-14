
public class Operate {

	int det(int a, int b, int c, int d) {
		int detA = (a * d) - (b * c);
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
