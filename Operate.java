
public class Operate {

	int det(int a11, int a12, int a21, int a22) {
		int detA = (a11 * a22) - (a12 * a21);
		//Warum inverse berechnen? wird nicht ausgegeben!
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