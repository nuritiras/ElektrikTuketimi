package tr.gov.enerji.elektriktuketimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnHesapla;
    EditText editTextCihazAdi,editTextCihazKw,editTextGunlukSaatKallanim;
    TextView textViewSonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHesapla=findViewById(R.id.buttonHesapla);
        editTextCihazAdi=findViewById(R.id.editTextCihazAdi);
        editTextCihazKw=findViewById(R.id.editTextKw);
        editTextGunlukSaatKallanim=findViewById(R.id.editTextGunlukKullanimSaat);
        textViewSonuc=findViewById(R.id.textViewSonuc);
        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cihazAdi=editTextCihazAdi.getText().toString();
                int kw=Integer.parseInt(editTextCihazKw.getText().toString());
                int saat=Integer.parseInt(editTextGunlukSaatKallanim.getText().toString());
                ElektrikliCihaz cihaz1=new ElektrikliCihaz();
                cihaz1.cihazAdi=cihazAdi;
                cihaz1.cihazKW=kw;
                cihaz1.gunlukSaatKullanim=saat;
                int sonuc=cihaz1.aylikTuketim();
                textViewSonuc.setText("Sonuç:"+sonuc);
            }
        });
    }
}