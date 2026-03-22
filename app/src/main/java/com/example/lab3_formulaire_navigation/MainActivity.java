package com.example.lab3_formulaire_navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNom, etEmail, etPhone, etAdresse;
    Spinner spinnerVille;
    Button btnEnvoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison des vues
        etNom      = findViewById(R.id.etNom);
        etEmail    = findViewById(R.id.etEmail);
        etPhone    = findViewById(R.id.etPhone);
        etAdresse  = findViewById(R.id.etAdresse);
        spinnerVille = findViewById(R.id.spinnerVille);
        btnEnvoyer = findViewById(R.id.btnEnvoyer);

        // Remplissage du Spinner avec les villes
        String[] villes = {"Agadir", "Casablanca", "Marrakech", "Rabat", "Fès", "Tanger"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                villes
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerVille.setAdapter(adapter);

        // Clic sur Envoyer
        btnEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Récupération des valeurs
                String nom     = etNom.getText().toString().trim();
                String email   = etEmail.getText().toString().trim();
                String phone   = etPhone.getText().toString().trim();
                String adresse = etAdresse.getText().toString().trim();
                String ville   = spinnerVille.getSelectedItem().toString();

                // ✅ Validation basique
                if (nom.isEmpty() || email.isEmpty() || phone.isEmpty() || adresse.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Envoi vers Screen2 via Intent explicite
                Intent intent = new Intent(MainActivity.this, Screen2Activity.class);
                intent.putExtra("NOM",     nom);
                intent.putExtra("EMAIL",   email);
                intent.putExtra("PHONE",   phone);
                intent.putExtra("ADRESSE", adresse);
                intent.putExtra("VILLE",   ville);
                startActivity(intent);
            }
        });

    }
    // 4. Réinitialiser le formulaire quand on revient de Screen2
    @Override
    protected void onResume() {
        super.onResume();
        etNom.setText("");
        etEmail.setText("");
        etPhone.setText("");
        etAdresse.setText("");
        spinnerVille.setSelection(0);   // remet "Agadir" (index 0)
        etNom.requestFocus();           // focus sur le 1er champ
    }

}