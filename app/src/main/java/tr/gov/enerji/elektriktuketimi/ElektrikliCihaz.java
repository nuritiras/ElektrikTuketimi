package tr.gov.enerji.elektriktuketimi;

public class ElektrikliCihaz {
    public String cihazAdi;
    public int cihazKW;
    public int gunlukSaatKullanim;
    public int aylikTuketim(){
        return cihazKW*gunlukSaatKullanim*30;
    }
}
