import java.io.IOException;

public class Quiz {
    public static void main(String[] args) throws IOException {
        Pytania p1 = new Pytania();
        p1.nr_pytania=1;
        p1.wczytaj();
        p1.zadaj();
        p1.sprawdz();

        System.out.println("Koniec quizu! Punkty = "+ p1.punkt);

    }
}
