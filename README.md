# Android Quiz App (Jetpack Compose, Supabase: Postgres, Auth, Realtime)

A lightweight quiz app built with **Kotlin** and **Jetpack Compose**. It features a dashboard, question flow with scoring, and a leaderboard. Designed to be easy to read, run, and extend.

> **Highlight:** Profiled startup with **Perfetto** and reduced **P95 time-to-first-question ~30%**.

---

## Features
- 📊 Dashboard with categories & quick actions  
- 🧠 Question flow with answer feedback & scoring  
- 🏆 Leaderboard (demo/local data; backend-ready)  
- 🎨 Material 3 theming, adaptive assets  
- 🔁 (Optional) Offline queue + **WorkManager** sync  
- 🌐 (Optional) Supabase for auth, scores, realtime

## Tech Stack
- **Language:** Kotlin · **UI:** Jetpack Compose + Material 3  
- **Images:** Coil · **Build:** Gradle (KTS), JDK **17**, compile/target SDK **36**  
- **Profiling:** **Perfetto** (Android Studio / perfetto.dev)  
- **Optional:** **Supabase**, **WorkManager**, GitHub Actions CI

---

## Getting Started

**Requirements**
- Android Studio (JDK **17**)
- Device/emulator API 24+

**Run**
```bash
git clone https://github.com/SoniRusagara/MyQuizApp.git
cd MyQuizApp
# Open in Android Studio → let Gradle sync → Run ▶

