
package minimarket;

//Polimorfism
public class Perhitungan extends Transaksi {
    
   double  diskon, bayar, totalbayar, totalbeli, totalkembali;
    
    @Override
    public void Hitung() {
         
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public double getBayar() {
        return bayar;
    }

    public void setBayar(double bayar) {
        this.bayar = bayar;
    }

    public double getTotalbayar() {
        return totalbayar;
    }

    public void setTotalbayar(double totalbayar) {
        this.totalbayar = totalbayar;
    }

    public double getTotalbeli() {
        return totalbeli;
    }

    public void setTotalbeli(double totalbeli) {
        this.totalbeli = totalbeli;
    }
    
    public double getTotalkembali() {
        return totalbeli;
    }

    public void setTotalkembali(double totalkembali) {
        this.totalkembali = totalkembali;
    }

}
