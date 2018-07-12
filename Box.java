import java.util.Scanner;
 class Volume {
double dimension(double width,double height,double depth){
	double v=depth*height*width;
return v;
}
}
public class Box
{
	public static void main(String[] args) {
		double x,y,z;
		System.out.print("Enter the values");
		Scanner in=new Scanner(System.in);
		
		x=in.nextDouble();
			y=in.nextDouble();
				z=in.nextDouble();
Volume v=new Volume();
double v1=v.dimension(x,y,z);
System.out.print("The volume of box"+"="+v1);
in.close();
	}

}
