package pboif2.pkg10119065.latihan23.latihannilaiterbesarterkecil;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan nilai terbesar dan terkecil
 */
public class PBOIF210119065Latihan23LatihanNilaiTerbesarTerkecil {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTerbesar, nTerkecil,i;
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = sc.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int totNilaiMhs = sc.nextInt();
        int[] NMhs = new int[totNilaiMhs];
        
        for(i = 0; i < totNilaiMhs; i++){
            System.out.print("Nilai mahasiswa ke-"+ (i+1) +" = ");
            NMhs[i] = sc.nextInt();
        }
        
        nTerbesar = NMhs[0];
        nTerkecil = NMhs[0];
        
        for(i = 0; i < totNilaiMhs; i++ ){      
          if(NMhs[i] > nTerbesar){
              nTerbesar = NMhs[i];
          }else if(NMhs[i] < nTerkecil){
              nTerkecil = NMhs[i];
          }
        }
        
        System.out.println("\nNilai Terbesar adalah " + nTerbesar);
        System.out.println("Nilai Terkecil adalah " + nTerkecil);
        System.out.println("\nPetugas " + petugas);
        System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");  
        
    }
    
}
