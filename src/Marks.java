public class Marks{
	protected double a;  //subject 1
	protected double b;  //subject 2
	protected double c;  //subject 3
	Marks(double a,double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		getMarks();
	}
	public void getMarks() {
		System.out.println("Subject 1: "+a);
		System.out.println("Subject 2: "+b);
		System.out.println("Subject 3: "+c);
	}
}
class Grade extends Marks{
	Grade(double a, double b, double c){
		super(a,b,c);
		calculateGrade();
	}
	public void calculateGrade() {
		double result = (a+b+c)/3;
		System.out.println("average marks: "+result);
	}
	
}