package rq01_sedef;

public class RQ_01 {
        /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */

    public static void main(String[] args) {

        int num=183;
        int pcs=0, total=0;


        while(num!=0) {

            total=(num%10)+total;
            num/=10;
            ++pcs;
        }

        System.out.println(total);

    }

}
