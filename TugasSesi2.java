package tugas.sesi2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TugasSesi2 {
    static char operator;
    static double bil_1,bil_2,hasil;
    public static void main(String[] args) {
        // Menghilangkan angka 0 yang dibe
        DecimalFormat format = new DecimalFormat("0.##");
        // menginput value
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input Bilangan 1 ; ");
        bil_1 = sc.nextInt();
        
        System.out.print(" Input Operator (+,-,*,/,%) ; ");
        operator = sc.next().charAt(0);
        
        System.out.print("Input Bilangan 2 ; ");
        bil_2 = sc.nextInt();
        
        switch(operator) {
            // pertambahan
            case '+':
                hasil = bil_1 + bil_2;
                System.out.println("Output : Hasil pertambahan " + format.format(bil_1) + " dan " + format.format(bil_2) + " ialah " + format.format(hasil));
                break;
            // pengurangan
            case '-':
                 hasil = bil_1 - bil_2;
                System.out.println("Output : Hasil pengurangan " + format.format(bil_1) + " dan " + format.format(bil_2) + " ialah " + format.format(hasil));
                break;
            // perkalian
            case '*' :
                 hasil = bil_1 * bil_2;
                System.out.println("Output : Hasil perkalian " + format.format(bil_1) + " dan " + format.format(bil_2) + " adalah " + format.format(hasil));
                break;
            case '/' :
                 hasil = bil_1 / bil_2;
                System.out.println("Output : Hasil pembagian " + format.format(bil_1) + " dan " + format.format(bil_2) + " adalah " + format.format(hasil));
                break;
            case '%' :
                 hasil = bil_1 % bil_2;
                System.out.println("Output : Hasil modulus " + format.format(bil_1) + " dan " + format.format(bil_2) + " adalah " + format.format(hasil));
                break;
            default:
                System.out.println("Maaf input yang anda masukan salah!");
            
        }
        // menghitungkan hasil agar menjadi nilai
        if(hasil >= 85 && hasil <= 100){
            System.out.println("Nilai Anda adalah A ");
        } else if (hasil >= 75 && hasil < 85) {
            System.out.println("Nilai Anda adalah B ");
        } else if (hasil >= 65 && hasil < 75) {
            System.out.println("Nilai Anda adalah C ");
        } else if (hasil >= 55 && hasil < 65) {
            System.out.println("Nilai Anda adalah D ");
        } else if (hasil < 55) {
            System.out.println("Nilai Anda adalah E ");
        } else {
            System.out.println("Inputan Anda Salah ");
        }
        
        sc.close();
        
    }
    
}
