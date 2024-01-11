package Demo;

public class Assignment_QNO4 {
	public static int average(int j1, int j2) { // A 
		return (j1+j2)/2;
		 }
		public static double average(double j1, double j2) { // B
		return (j1+j2)/2;
		 }
		 public static int average(int j1, int j2, int j3) { // C
		 return (j1+j2+j3)/3;
		 }
	public static void main(String[] args) {
		System.out.println(average(30, 89)); // Use A 
		System.out.println(average(23.7, 57.9)); // Use B 
		System.out.println(average(109, 20, 30)); // Use C 
		System.out.println(average(19.0, 25)); // Use B – int 2 implicitly casted to double 2.0
		 }
	}