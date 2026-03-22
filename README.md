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
