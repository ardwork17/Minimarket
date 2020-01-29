
package minimarket;

import java.util.Scanner;

public class Minimarket {
        
    Scanner input = new Scanner(System.in);
    Scanner inputjumlah = new Scanner(System.in);
    Scanner inputbayar = new Scanner(System.in);
    
    int i= 0;
   
    double totalBeli = 0,
           totalBayar = 0,
           totalKembali = 0,
           diskon,
           bayar;
    
    String ulang ="Y";
          
    String[] produk = new String[100];
    double[] harga_barang = new double[100],
             barang = new double[100];
    int[] jumlah_barang = new int[100];
    
    public void Data (){
         
        System.out.println("==============SUPERMARKETKU=============");
        System.out.println(" ");
        System.out.println("===============LIST BARANG==============");
        System.out.println("KODE\tNAMA BARANG\tHARGA");
        System.out.println("========================================");
        System.out.println("01.\tRoti\t\tRp. 15.000,-");
        System.out.println("02.\tShampo\t\tRp. 10.000,-");
        System.out.println(" ");
        
        Makanan.Sembako barang1 = new Makanan.Sembako();
        NonMakanan.Alat_Kebersihan barang2 = new NonMakanan.Alat_Kebersihan();
        Perhitungan hitung = new Perhitungan() ;
        
        barang1.setNama_makanan("Roti");
        barang1.setHarga_makanan(15000.00);
        
        barang2.setNama_alat("Shampo");
        barang2.setHarga_alat(10000.00);
        
        do{
        System.out.print("Silahkan masukan kode barang : ");
        int pilih_barang = input.nextInt();
            switch (pilih_barang){
                case 01 :
                    produk[i] = barang1.getNama_makanan();
                    harga_barang[i] = barang1.getHarga_makanan();
                break;
                case 02 :
                    produk[i] = barang2.getNama_alat();
                    harga_barang[i] = barang2.getHarga_alat();
                break;
                default:
                    System.err.println("Barang Belum Tersedia");
                    produk[i] = "Maaf isi dengan benar";
                    harga_barang[i] = 0;      
                    break;
            }
            
        System.out.print("Silahkan masukan jumlah : ");
        jumlah_barang[i] = inputjumlah.nextInt();
        barang[i] = jumlah_barang[i] * harga_barang[i];
        System.out.println("Total Harga : Rp." + barang[i]+"0,-");
        System.out.println("");
        System.out.println("Tambah Barang Lagi?(Y/N)");
                ulang = input.next();
                i++;
        } while(ulang.equals("Y")||ulang.equals("y"));
       
        System.out.println("------------------------------------------------------");
        for (int h=0; h<i ; h++){
             System.out.println(produk[h] + " x " + jumlah_barang[h] + " : Rp."+ barang[h]+"0,-");
             totalBeli += barang[h];
        }
        System.out.println("------------------------------------------------------");
        hitung.setTotalbeli(totalBeli);
        System.out.println("Total : Rp."+totalBeli+"0,-");
        if(totalBeli >= 20000 && totalBeli > 50000){
            diskon = totalBeli*0.1;
            System.out.println("Diskon : Rp."+diskon+"0,-");
        } else if(totalBeli >=100000){
            diskon = totalBeli*0.5;
            System.out.println("Diskon : Rp."+diskon+"0,-");
        } 
        hitung.setDiskon(diskon);
        System.out.println("------------------------------------------------------");        
        totalBayar = (totalBeli-diskon);
        hitung.setTotalbayar(totalBayar);
        System.out.println("Total Bayar  : Rp."+totalBayar+"0,-");
        System.out.println("------------------------------------------------------");
        hitung.setTotalbayar(totalBayar);
        System.out.print("Bayar : Rp ");
        bayar = inputbayar.nextDouble();
        totalKembali = (bayar-totalBayar);
        hitung.setTotalkembali(totalKembali);
        System.out.println("Kembalian : Rp."+ totalKembali+"0,-");
        System.out.println("");
        
        
        System.out.println("=====================================================================");
        System.out.println("                        RINCIAN TRANSAKSI                        ");
        System.out.println("=====================================================================");
        System.out.println("NAMA BARANG\t\tHARGA\t\tJUMLAH\t\tTOTAL\t\t");
        System.out.println("=====================================================================");
          for(int j = 0; j < i; j++){
        System.out.print(""+produk[j]+"\t\t\tRp."+harga_barang[j]+"0,-"+"\t"+ jumlah_barang[j]+"\t\tRp."+barang[j]+"0,-"+"\t\t"+"\n");
          }
        System.out.println("=====================================================================");
    }
    
    public void mulai(){
        Data();
    }
    
    public static void main(String[] args) {
    Minimarket eksekusi = new Minimarket();    
    eksekusi.mulai();
    }

    
}
