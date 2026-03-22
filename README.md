# 📱 Lab 3 — Navigation entre Activités (Intent Explicite)


---

> **Module :** Développement Mobile Android  
> **Niveau :** Licence / BUT Informatique  
> **Outil :** Android Studio · Java · XML

---

## 🎯 Objectif

Construire une application Android à **deux écrans** communicants :

| Écran | Rôle |
|---|---|
| `MainActivity` | Formulaire de saisie (Nom, Email, Téléphone, Adresse, Ville) |
| `Screen2Activity` | Récapitulatif des données saisies |

La navigation entre les deux écrans utilise un **Intent explicite** avec passage de données via `putExtra` / `getStringExtra`.

---


## 🎬 Démonstration vidéo


https://github.com/user-attachments/assets/901c5e51-c26d-480a-8c21-695e072f7536

---

## 🧠 Compétences mobilisées

- Layouts XML (`LinearLayout`, `EditText`, `Spinner`, `Button`, `TextView`)
- **Intent explicite** pour naviguer entre activités
- `putExtra()` / `getStringExtra()` pour transmettre des données
- `finish()` pour revenir à l'écran précédent
- Validation de formulaire avec `setError()` et `Patterns.EMAIL_ADDRESS`
- `onResume()` pour réinitialiser l'état d'une activité

---

## 📁 Structure du projet



```
Lab3/
├── app/
│   ├── manifests/
│   │   └── AndroidManifest.xml
│   ├── java/com/example/lab3/
│   │   ├── MainActivity.java
│   │   └── Screen2Activity.java
│   └── res/
│       └── layout/
│           ├── activity_main.xml
│           └── activity_screen2.xml
```

---

---

## 🔄 Flux de navigation

```
[MainActivity]
     │
     │  Saisie → Validation champs vides → setError()
     │         → Validation email        → Patterns.EMAIL_ADDRESS
     │         → Tout OK → startActivity(intent)
     │
     ▼
[Screen2Activity]
     │  Affiche le récapitulatif
     │  btnRetour → finish()
     │
     ▼
[MainActivity]  ←  onResume() : réinitialise le formulaire
```

---

## ✅ Fonctionnalités

### 1. Formulaire (`MainActivity`)

- **5 champs** : Nom & Prénom, Email, Téléphone, Adresse, Ville (Spinner)
- **Validation champ vide** : affichage d'une erreur inline via `setError()`
- **Validation email** : vérification du format avec `Patterns.EMAIL_ADDRESS`
- **Envoi** : passage de toutes les données à `Screen2Activity` via `Intent`

### 2. Récapitulatif (`Screen2Activity`)

- Affichage des 5 données reçues via `getStringExtra()`
- **Bouton Retour** : appel de `finish()` pour revenir au formulaire

### 3. Réinitialisation automatique

- La méthode `onResume()` dans `MainActivity` **vide tous les champs** et remet le Spinner à sa valeur initiale chaque fois qu'on revient sur cet écran

---
## 📌 Concepts Android — Tableau récapitulatif

| Concept | Classe / Méthode | Rôle |
|---|---|---|
| Navigation | `Intent` explicite | Passer d'une activité à l'autre |
| Passage de données | `putExtra()` | Envoyer des données avec l'intent |
| Récupération | `getStringExtra()` | Lire les données reçues |
| Retour | `finish()` | Fermer l'activité courante |
| Validation | `setError()` | Afficher une erreur inline sur un champ |
| Validation email | `Patterns.EMAIL_ADDRESS` | Vérifier le format d'un email |
| Cycle de vie | `onResume()` | Exécuter du code au retour sur l'activité |

---

## ▶️ Lancer le projet

1. Ouvrir le projet dans **Android Studio**
2. Connecter un émulateur ou appareil physique
3. Cliquer sur **Run ▶** (`Shift + F10`)
4. Saisir les champs dans l'écran formulaire
5. Cliquer sur **Envoyer** → vérifier l'écran récapitulatif
6. Cliquer sur **Retour** → le formulaire est vidé automatiquement

---

## 👨‍💻 Auteur

> Projet réalisé dans le cadre du cours de **Développement Mobile Android**