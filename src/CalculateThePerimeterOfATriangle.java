import java.util.Scanner;
public class CalculateThePerimeterOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("The circumference of triangle is "+(a+b+c)+".");
        }else{
            System.out.println("There is no such triangle!");
        }

    }
}
