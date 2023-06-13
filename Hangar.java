package java_quete_07;

public class Hangar {
    public static void main(String[] args) {
        Car voiture1 = new Car("Clio", 0);
        Boat bateau1 = new Boat ("Titanic", 0);

        System.out.println(voiture1.doStuff());
        System.out.println(bateau1.doStuff());
    }
}
