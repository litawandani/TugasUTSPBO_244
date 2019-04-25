package tugas.uts.pbo;

/**
 *
 * @author LULITA
 */
public class CPU {

    protected String Nama;
    protected int Kecepatan;

    public CPU(String Nama, int Kecepatan) {
        this.Nama = Nama;
        this.Kecepatan = Kecepatan;
    }

    public String getCPUData() {
        return (this.Nama+" "+ this.Kecepatan);
    }

}
