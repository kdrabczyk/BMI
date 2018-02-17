import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import java.util.Scanner;

public class Bmi {
    public static void main (String args[]){
        Bmi bmi= new Bmi();
        Result result = new Result();
        Person person = new Person();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name");
        String myName = sc.nextLine();
        person.setName(myName);

        boolean success1= true;
        while (success1) {
            try {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("enter your height in meters ( use ',' as a separator)");
                double myHeight = sc1.nextDouble();
                person.setHeight(myHeight);
                success1= false;
            }catch (Exception ex){
                System.out.println("Something went wrong, most likely it's a wrong data format.");
            }
        }

        boolean succes2= true;
        while(succes2) {
            try {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("enter your mass in kilograms");
                double myMass = sc2.nextDouble();
                person.setMass(myMass);
                succes2 = false;
            } catch (Exception ex) {
                System.out.println("Something went wrong, most likely it's a wrong data format.");
            }
        }

        double newbmi = bmi.doBMI(person.getMass(), person.getHeight());
        System.out.println("*************************");
        System.out.print(person.getName());
        System.out.print(" your bmi is ");
        System.out.printf("%.2f", newbmi);
        System.out.println("");
        System.out.println("This means that,");
        result.resultDisplay(newbmi);
    }

    public double doBMI(double m, double h){
        return (m/(h*h));
    }
}
