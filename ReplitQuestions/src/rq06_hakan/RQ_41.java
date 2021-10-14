package rq06_hakan;

import java.util.Locale;
import java.util.Scanner;

public class RQ_41 {
    /*Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

    Örnek
    makeTitle("Bu bir başlıktır")
    Bu Bir Başlıktır

    makeTitle("tüm ilk harfler büyük olacak")
    Tüm İlk Harfler Büyük Olacak
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a wort or sentence: ");
        String wort=scan.nextLine();

        /*char harf=wort.charAt(0);

        for (int i = 0; i < wort.length(); i++) {
        if(wort.contains(" "))
            wort.replaceFirst(harf,wort.toUpperCase(Locale.ROOT));
        }*/



    }
}
