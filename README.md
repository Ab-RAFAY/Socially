# 📱 Socially – Android App

Socially is a sample social media application built in **Kotlin** as part of an Android development assignment/project.  
The app demonstrates user flows and UI design similar to popular social platforms.

---

## 🚀 Features
- **Splash Screen** – Animated app start screen.
- **Multi-Activity Navigation** – Flow from Splash → Activity2 → Activity3 → ....
- **Login / Signup UI** – Clean form layouts with proper input handling.
- **Stories Simulation** – Progress bar styled story views (like Instagram).
- **Profile Editing** – Update profile photo, email, phone, bio, and gender.
- **Buttons & Interactions** – Consistent Material 3 styled buttons.
- **Custom Themes & Colors** – Light/dark themes and app-specific color palette.

---

## 🛠️ Tech Stack
- **Language**: Kotlin  
- **UI**: XML layouts, Material Design 3  
- **Navigation**: Multiple `Activities` with `Intent` handling  
- **Layouting**: LinearLayout (migrating towards ConstraintLayout for responsiveness)  
- **Splash Screen Handling**: `Handler` with delay and Intent redirection  

---

## 📂 Project Structure
app/
├── manifests/ # AndroidManifest.xml
├── java/com/example/ # Kotlin source code
│ ├── SplashActivity.kt
│ ├── Activity2.kt
│ ├── Activity3.kt
│ └── Activity4.kt

└── res/ # Resources
├── layout/ # XML Layout files
├── drawable/ # Custom shapes, icons
├── values/ # colors.xml, strings.xml, themes.xml
