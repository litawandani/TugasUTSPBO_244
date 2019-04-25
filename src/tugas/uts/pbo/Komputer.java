package tugas.uts.pbo;

/**
 *
 * @author LULITA
 */
public class Komputer {

    public CPU cpu;

    public Komputer(CPU cpu) {
        this.cpu = cpu;
    }

    public Komputer() {

    }

    public void Memasang(CPU cpu) {
        this.cpu = cpu;
        System.out.println("CPU : "+this.cpu.getCPUData()+" GHz dipasang");
    }

    public void Mencabut(CPU cpu) {
        this.cpu = cpu;
        System.out.println("CPU : "+this.cpu.getCPUData()+" GHz dicabut");
    }

    public void cetakInfo() {
        System.out.println("Spesifikasi : "+ this.cpu.getCPUData()+" GHz");
    }

}
