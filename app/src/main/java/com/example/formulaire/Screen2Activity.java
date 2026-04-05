package com.example.formulaire;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class Screen2Activity extends AppCompatActivity {
    private TextView aNom, aEmail, aPhone, aAdresse, aVille;

    private Button btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        aNom = findViewById(R.id.aNom);
        aEmail = findViewById(R.id.aEmail);
        aPhone = findViewById(R.id.aPhone);
        aAdresse = findViewById(R.id.aAdresse);
        aVille = findViewById(R.id.aVille);
        btnRetour = findViewById(R.id.btnRetour);

        Intent intent = getIntent();

        String nom     = intent.getStringExtra("nom");
        String email   = intent.getStringExtra("email");
        String phone   = intent.getStringExtra("phone");
        String adresse = intent.getStringExtra("adresse");
        String ville   = intent.getStringExtra("ville");


        aNom.setText("Nom : " + nom);
        aEmail.setText("Email : " + email);
        aPhone.setText("Téléphone : " + phone);
        aAdresse.setText("Adresse : " + adresse);
        aVille.setText("Ville : " + ville);

        btnRetour.setOnClickListener(v -> finish());
    }

}
