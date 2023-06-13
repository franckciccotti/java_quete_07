package java_quete_07;

public class Car extends Vehicule {
    public Car (String brand, int kilometers){
        super(brand, kilometers);
    }
    @Override
    public String doStuff() {
        return "Je suis " + brand + " et je fais vroum vroum !";
    }
}
