package zalicz;

public class jeden {
    private dwa dwa;

    public jeden() {
        dwa = new dwa();
    }

    public void metodaJeden() {
        System.out.println("Metoda z klasy Jeden");
        dwa.metodaDwa();
    }
}
