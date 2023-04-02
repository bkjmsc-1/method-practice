import java.util.Scanner;

public class Methods1{

    int num1;
    int num2;
    int z = 0;
    Scanner sc = new Scanner(System.in);

    public void multiply(){

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        z = num1 * num2;
    }

    public static void main(String[] args) {
        Methods1 methodObject = new Methods1();
        methodObject.multiply();
        System.out.println("The result of " + methodObject.num1 + "x" + methodObject.num2 + "=" + methodObject.z);          
    }
  
}