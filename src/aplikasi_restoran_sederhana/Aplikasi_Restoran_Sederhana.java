
package aplikasi_restoran_sederhana;

/**
 *
 * @author Acer
 */
public class Aplikasi_Restoran_Sederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koneksi k = new koneksi();
        k.connect();
        
        Login l = new Login();
        l.setVisible(true);
        
    }
    
}
