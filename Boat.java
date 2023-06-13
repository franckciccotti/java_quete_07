package java_quete_07;

public class Boat extends Vehicule {
    public Boat (String brand, int kilometers){
        super(brand, kilometers);
    }
    @Override
    public String doStuff() {
        return "Je suis " + brand + " et je fais glou glou !";
    }
}
