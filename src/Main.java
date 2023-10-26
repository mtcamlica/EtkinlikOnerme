import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //kullanıcıdan sıcaklık değeri almalıyız
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        sicaklik = input.nextInt();

        //Sorgulama

        if (sicaklik < 5){
            System.out.print("Kayak yapılabilir");
        }else if (sicaklik >= 5 && sicaklik <= 25){

            if (sicaklik <= 15) {
                System.out.println("Sinemaya gidebilirsin");
            }
            if (sicaklik >= 10){
                System.out.print("Pikniğe gidebilirsiniz.");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
