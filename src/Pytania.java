
import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class Pytania {

    String tresc;
    String a,b,c,d;
    int nr_pytania;
    String poprawna;
    String odpowiedz;
    int punkt; //1 lub 0

    void wczytaj() throws FileNotFoundException, IOException {
        BufferedReader odczyt = new BufferedReader(new FileReader("quiz.txt"));

        //if
        int nr_linii=(nr_pytania-1)*6+1;
        int aktualny_nr=1;
        try {
            String linijka = odczyt.readLine();
            if (aktualny_nr==nr_linii)
                tresc=linijka;
            if (aktualny_nr==nr_linii+1)
                a=linijka;
            if (aktualny_nr==nr_linii+2)
                b=linijka;
            if (aktualny_nr==nr_linii+3)
                c=linijka;
            if (aktualny_nr==nr_linii+4)
                d=linijka;
            if (aktualny_nr==nr_linii+5)
                poprawna=linijka;
            aktualny_nr++;
        }
        finally {
           if (odczyt != null);
           odczyt.close();
        }
    }

    void zadaj(){
        System.out.println(tresc);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("");
        System.out.println("Odpowiedz: ");
        Scanner odpowiedz = new Scanner(System.in);
    }
    void sprawdz(){
        if (odpowiedz==poprawna){
            punkt=1;
        }
        else punkt=0;
    }

}
