public class Person {
    private double height = 0;
    private double mass = 0;
    private String name = null;
    private double bmi = 0;

    public String getName() {
        return name;
    }

    public double getHeight(){
        return height;
    }

    public double getMass(){
        return mass;
    }

    public double getBMI(){
        return bmi;
    }

    public void setName(String n){
        name = n;
    }

    public void setHeight(double h){
        height = h;
    }

    public void setMass (double m){
        mass = m;
    }

    public void setBMI(double b){
        bmi = b;
    }
}
