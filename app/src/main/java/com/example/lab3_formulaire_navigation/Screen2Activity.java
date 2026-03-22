package com.example.lab3_formulaire_navigation;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {

    TextView tvNom, tvEmail, tvPhone, tvAdresse, tvVille;
    Button btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        // Liaison des vues
        tvNom     = findViewById(R.id.tvNom);
        tvEmail   = findViewById(R.id.tvEmail);
        tvPhone   = findViewById(R.id.tvPhone);
        tvAdresse = findViewById(R.id.tvAdresse);
        tvVille   = findViewById(R.id.tvVille);
        btnRetour = findViewById(R.id.btnRetour);

        // Récupération des données
        String nom     = getIntent().getStringExtra("NOM");
        String email   = getIntent().getStringExtra("EMAIL");
        String phone   = getIntent().getStringExtra("PHONE");
        String adresse = getIntent().getStringExtra("ADRESSE");
        String ville   = getIntent().getStringExtra("VILLE");

        // Affichage dans les TextViews
        tvNom.setText("Nom : "      + nom);
        tvEmail.setText("Email : "  + email);
        tvPhone.setText("Phone : "  + phone);
        tvAdresse.setText("Adresse : " + adresse);
        tvVille.setText("Ville : "  + ville);

        //  Bouton Retour → ferme Screen2, revient à MainActivity
        btnRetour.setOnClickListener(v -> finish());
    }
}