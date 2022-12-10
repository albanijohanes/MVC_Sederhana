package Model; //membuat Model 'Mahasiswa'
public class Mahasiswa { //pembuatan isi class Mahasiswa
    private String nim;
    private String nama;
    private int quiz;
    private int uts;
    private int uas;
    private float rata;
    private String kompetensi;
//getter dari class Mahasiswa
    public String getNim() { 
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getUts() {
        return uts;
    }

    public int getUas() {
        return uas;
    }

    public float getRata() {
        return rata;
    }

    public String getKompetensi() {
        return kompetensi;
    }
//setter dari class Mahasiswa
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }

    public void setRata(float rata) {
        this.rata = rata;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }
    
}
