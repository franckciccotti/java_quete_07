package java_quete_07;

public abstract class Vehicule {

    String brand;
    int kilometers;

    Vehicule(String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getKilometers() {
        return kilometers;
    }
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();

}