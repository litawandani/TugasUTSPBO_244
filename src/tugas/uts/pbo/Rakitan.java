package tugas.uts.pbo;

/**
 *
 * @author LULITA
 */
public class Rakitan {

    public static void main(String[] args) {

        Intel intel1 = new Intel(2);
        AMD amd1 = new AMD(3);
        Komputer komputer1 = new Komputer(intel1);

        komputer1.cetakInfo();
        komputer1.Mencabut(intel1);
        komputer1.Memasang(amd1);
        komputer1.cetakInfo();
    }
}
