import java.util.Scanner;

public class AddQ_01 {

    //Kullanicidan aldiginiz sayiyi asagidaki sekilde yazdiriniz;
    // Mesela 4 sayisi girildiginde;
//   1
//   232
//   34543
//   4567654

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num=scan.nextInt();

        int i, j, k, m;
        for(i=1; i<=num; i++)
        {
            m = i;
            for(j=1; j<=i; j++)
                System.out.print(m++);
            m = m - 2;
            for(k=1; k<i; k++)
                System.out.print(m--);
            System.out.println();
        }

    }

}
