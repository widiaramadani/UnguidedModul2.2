import java.util.Scanner;

public class projectTitikk {
    public static void main(String[] args) {
        int pilihan;
        Titik t1 = new Titik();
        Scanner cin = new Scanner(System.in);
        do{
            System.out.println("MENU OPERASI TITIK");
            System.out.println("1. Inisialisasi Titik");
            System.out.println("2. Tampil Titik");
            System.out.println("3. Perkalihan Skalar Titik");
            System.out.println("4. Pencerminan Terhadap Sumbu X");
            System.out.println("5. Pencerminan Terhadap Sumbu Y");
            System.out.println("6. Jarak Antara Dua Titik");
            System.out.println("0. Keluar");
            System.out.print("MASUKKAN PILIHAN : ");
            pilihan = cin.nextInt();
            System.out.println("");
            switch(pilihan){
                case 1 :
                    int x;
                    int y;
                    System.out.println("Inisialisasi Titik");
                    System.out.print("Masukkan nilai x : ");
                    x = cin.nextInt();
                    System.out.print("Masukkan nilai y : ");
                    cin.nextInt();
                    y = cin.nextInt();
                    t1.inisialisasiTitik(x, y);
                    System.out.println("");
                    break;
                case 2:
                t1.tampilTitik();
                System.out.println("");
                break;
                case 3 :
                    int skalar;
                    System.out.print("Masukkan nilai skalar : ");
                    cin.nextInt();
                    skalar = cin.nextInt();
                    t1.perkalianSkalar(skalar);
                    System.out.println("");
                    break;
                case 4 :
                    t1.pencerminanSumbuX();
                    System.out.println("");
                    break;
                case 5 :
                    t1.pencerminanSumbuY();
                    System.out.println("");
                    break;
                case 6 :
                    int x2;
                    int y2;
                    System.out.print("Masukkan nilsi x2 : ");
                    x2 = cin.nextInt();
                    System.out.print("Masukkan nilai y2 : ");
                    y2 = cin.nextInt();
                    System.out.println("Jarak = " + t1.jarak(x2, y2));
                    t1.jarak(x2, y2);
                    System.out.println("");
                    break;
                case 0 :
                    System.out.println("Anda Keluar");
                    System.out.println("");
                    break;
                default :
                    System.out.println("Pilihan anda salah");
                    System.out.println("");
                    break;
            }
        }while(pilihan != 0);
    }
}




