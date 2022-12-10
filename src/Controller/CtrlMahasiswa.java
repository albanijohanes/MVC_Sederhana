package Controller; //membuat Controller Mahasiswa
import Model.Mahasiswa;
import View.FormMahasiswa;
public class CtrlMahasiswa {
    private Mahasiswa sis;
    private FormMahasiswa tampil;
    
    public CtrlMahasiswa(FormMahasiswa tampil){
        this.tampil = tampil;
    }
    public void proses(){ //pembuatan prosedur proses
        sis = new Mahasiswa();
        sis.setNim(tampil.getTxtNim().getText());
        sis.setNama(tampil.getTxtNama().getText());
        sis.setQuiz(Integer.parseInt(tampil.getTxtQuiz().getText()));
        sis.setUts(Integer.parseInt(tampil.getTxtUts().getText()));
        sis.setUas(Integer.parseInt(tampil.getTxtUas().getText()));
        
        sis.setRata((sis.getQuiz()+sis.getUts()+sis.getUas())/3);
        
        if(sis.getRata()>=75){
            sis.setKompetensi("KOMPETEN");
        }else{
            sis.setKompetensi("TIDAK KOMPETEN");
        }
        // menampilkan output hasil
        tampil.getTxtHasil().setText("========== INFORMASI MAHASISWA ==========\n"
                                     +"NIM  : "+sis.getNim()+"\n"
                                     +"NAMA : "+sis.getNama()+"\n"
                                     +"Quiz : "+sis.getQuiz()+"\n"
                                     +"UTS  : "+sis.getUts()+"\n"
                                     +"UAS  : "+sis.getUas()+"\n"
                                     +"Rata-Rata : "+sis.getRata()+"\n"
                                     +"ANDA DINYATAKAN "+sis.getKompetensi()+"\n"
                                     +"=========================================");
    }
    //pembuatan prosedur untuk mereset/menghapus output
    public void reset(){
        tampil.getTxtNim().setText("");
        tampil.getTxtNama().setText("");
        tampil.getTxtQuiz().setText("");
        tampil.getTxtUts().setText("");
        tampil.getTxtUas().setText("");
        tampil.getTxtHasil().setText("");
    }
}
