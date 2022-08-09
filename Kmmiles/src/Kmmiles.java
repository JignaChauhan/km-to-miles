import java.util.Scanner;
public class Kmmiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km;
		System.out.println("Enter the Kilometers:");
		Scanner in=new Scanner(System.in);
		km=in.nextDouble();
		double miles=km/1.6;
		System.out.println(miles+"miles");

	}

}
