
/* MUHAMMAD HAFIZ BIN SUKHRI   
275414 */

package Abstraction;

abstract class Mark {
	abstract double getPercentage();
	
}

class StudentA extends Mark {
	double mark1, mark2, mark3, percentage;
	
	public StudentA(double M1, double M2, double M3) {
		this.mark1 = M1;
		this.mark2 = M2;
		this.mark3 = M3;
	}
	
	public double getPercentage() {
		percentage = (mark1 + mark2 + mark3)/300*100;
		return percentage;
	}
}


class StudentB extends Mark {
	double mark1, mark2, mark3, mark4, percentage;
	
	public StudentB (double M1, double M2, double M3, double M4) {
		this.mark1 = M1;
		this.mark2 = M2;
		this.mark3 = M3;
		this.mark4 = M4;
		
	}
	
	public double getPercentage() {
		percentage = (mark1 + mark2 + mark3 + mark4) /400*100;
		return percentage;
		
	}
}

public class Question3 {
	public static void main (String [] args) {
		StudentA A = new StudentA (70, 80, 90);
		StudentB B = new StudentB (70, 80, 90, 95);
		
		System.out.println ("Student A : " + A.getPercentage() + "%");
		System.out.println ("Student B : " + B.getPercentage() + "%");
	}

}
