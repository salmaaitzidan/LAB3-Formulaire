package com.example.formulaire;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class Screen2Activity extends AppCompatActivity {
    private TextView tNom, tEmail, tPhone, tAdresse, tVille;

    private Button btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2); // relie au XML du récap

        tNom = findViewById(R.id.tNom);
        tEmail = findViewById(R.id.tEmail);
        tPhone = findViewById(R.id.tPhone);
        tAdresse = findViewById(R.id.tAdresse);
        tVille = findViewById(R.id.tVille);
        btnRetour = findViewById(R.id.btnRetour);

        // 1) Récupérer l'Intent qui a lancé cet écran
        Intent intent = getIntent();

        // 2) Extraire les données envoyées depuis MainActivity
        String nom     = intent.getStringExtra("nom");
        String email   = intent.getStringExtra("email");
        String phone   = intent.getStringExtra("phone");
        String adresse = intent.getStringExtra("adresse");
        String ville   = intent.getStringExtra("ville");


        tNom.setText("Nom : " + nom);
        tEmail.setText("Email : " + email);
        tPhone.setText("Téléphone : " + phone);
        tAdresse.setText("Adresse : " + adresse);
        tVille.setText("Ville : " + ville);


        // 5) Bouton Retour : fermer cet écran et revenir au précédent
        btnRetour.setOnClickListener(v -> finish());
    }

    // Petite aide : si une valeur est null/vides, retourner "—"
    private String safe(String s) {
        return (s == null || s.trim().isEmpty()) ? "—" : s.trim();
    }
}
