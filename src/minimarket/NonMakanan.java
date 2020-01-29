
package minimarket;

// class luar
public class NonMakanan {
    
    //class dalam
    public static class Alat_Kebersihan {
        
        protected String nama_alat; 
        protected double harga_alat;

        public String getNama_alat() {
            return nama_alat;
        }

        public void setNama_alat(String nama_alat) {
            this.nama_alat = nama_alat;
        }

        public double getHarga_alat() {
            return harga_alat;
        }

        public void setHarga_alat(double harga_alat) {
            this.harga_alat = harga_alat;
        }  
    }    
}
