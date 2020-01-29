
package minimarket;

// class luar
public class Makanan extends NonMakanan{ 
    
    // class dalam
    public static class Sembako {
        
        protected String nama_makanan; 
        protected double harga_makanan;

        public String getNama_makanan() {
            return nama_makanan;
        }

        public void setNama_makanan(String nama_makanan) {
            this.nama_makanan = nama_makanan;
        }

        public double getHarga_makanan() {
            return harga_makanan;
        }

        public void setHarga_makanan(double harga_makanan) {
            this.harga_makanan = harga_makanan;
        }        
    }    
}
