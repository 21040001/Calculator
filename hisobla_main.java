import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        girdi.useLocale(Locale.UK);
        System.out.println("Birinchi sonni kiring");
        double v = girdi.nextDouble();

        Scanner islemgir = new Scanner(System.in);
        System.out.println("bajaradigan matematik amalni tanla qoshish amalini bajaradigan bo'lsang 1 ni, ayirish amalini bajaradigan bo'lsang 2 ni, kopaytirish amalini bajaradigan bolsang 3 ni ,bolish amali uchun 4 ni kir");
        int islem = islemgir.nextInt();

        Scanner girdi2 = new Scanner(System.in);
        girdi2.useLocale(Locale.UK);
        System.out.println("ikkinchi sonni kiring");
        double k = girdi2.nextDouble();


        bagliclass islemler = new bagliclass();



        if (islem == 1 ){
            System.out.println(islemler.topal(v,k));
        }
        if (islem == 2 ){
            System.out.println(islemler.eksi(v,k));
        }
        if (islem == 3 ){
            System.out.println(islemler.carpma(v,k));
        }
        if (islem == 4 ){
            System.out.println(islemler.boluv(v,k));
        }

    }}
