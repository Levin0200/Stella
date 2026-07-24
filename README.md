<div align="center">

#  Stella

### *꿈을 마주하는 이야기*

별을 선택하고 이야기를 따라가며,  
자신의 꿈을 마주하는 **Kotlin 기반 Android 스토리 게임**

*Every star leaves a story,
every story leaves a dream.*
<br>

<img src="docs/banner.png" width="360" alt="Stella 시작 화면">

<br><br>

<img src="https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white" alt="Kotlin">
<img src="https://img.shields.io/badge/Android_Studio-3DDC84?style=flat-square&logo=androidstudio&logoColor=white" alt="Android Studio">
<img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=gradle&logoColor=white" alt="Gradle">
<img src="https://img.shields.io/badge/Personal_Project-6C63FF?style=flat-square" alt="Personal Project">

</div>

---

## 📖 프로젝트 소개

**Stella**는 별을 매개로 여러 이야기를 경험하는  
스토리 중심의 Android 개인 프로젝트입니다.

플레이어는 별을 선택해 각 별에 담긴 이야기를 확인하고,  
화면의 흐름을 따라 결과와 엔딩에 도달하게 됩니다.

> **“한 편의 이야기를 직접 플레이한다.”**

단순히 화면을 넘기는 것을 넘어,  
이야기 속 선택과 결과를 통해 자신의 꿈을 돌아보는 경험을 목표로 제작했습니다.

---

## 🎮 진행 흐름

<div align="center">

`Main` → `Player` → `Star Select` → `Story` → `Result` → `Ending`

</div>

---

## ✨ 주요 기능

| 기능 | 설명 |
|---|---|
| ⭐ 별 선택 | 별을 선택해 각각의 이야기로 진입 |
| 📖 스토리 진행 | 화면 전환을 통해 이야기를 순차적으로 탐색 |
| 🎯 선택과 결과 | 사용자의 선택을 바탕으로 결과 화면 제공 |
| 🌅 엔딩 구성 | 이야기 진행을 마친 뒤 최종 엔딩 제공 |
| 📱 모바일 UI | Android 세로 화면에 맞춘 인터페이스 구성 |

---

## 📸 Screenshots

### 시작 화면

<div align="center">
  <img src="docs/main.png" width="360" alt="Stella 시작 화면">
</div>

<br>

### 별 선택

<div align="center">
  <img src="docs/gameplay.png" width="360" alt="Stella 별 선택 화면">
</div>

<br>

### 이야기 진행

<p align="center">
  <img src="docs/story0.png" width="240" alt="Stella 스토리 화면 1">
  <img src="docs/story1.png" width="240" alt="Stella 스토리 화면 2">
  <img src="docs/story2.png" width="240" alt="Stella 스토리 화면 3">
</p>

<p align="center">
  <img src="docs/story3.png" width="240" alt="Stella 스토리 화면 4">
  <img src="docs/story4.png" width="240" alt="Stella 스토리 화면 5">
  <img src="docs/story5.png" width="240" alt="Stella 스토리 화면 6">
</p>

<br>

### 엔딩

<p align="center">
  <img src="docs/ending0.png" width="240" alt="Stella 엔딩 화면 1">
  <img src="docs/ending1.png" width="240" alt="Stella 엔딩 화면 2">
</p>

---

## 🛠 Tech Stack

| Category | Technology |
|---|---|
| Language | Kotlin |
| Platform | Android |
| IDE | Android Studio |
| Build Tool | Gradle Kotlin DSL |

---

## 📁 프로젝트 구성

```text
Stella/
├── app/                  # Android 애플리케이션 소스
├── docs/                 # README 이미지
├── gradle/               # Gradle Wrapper 설정
├── build.gradle.kts      # 프로젝트 빌드 설정
├── settings.gradle.kts   # 모듈 및 프로젝트 설정
└── README.md
```

---

## 💡 개발하며 배운 점

- 하나의 아이디어를 기획부터 구현, 테스트, 완성까지 직접 진행하며 프로젝트 개발 과정을 경험했습니다.
- 여러 Activity를 연결하여 자연스러운 화면 전환과 사용자 흐름을 설계하는 방법을 익혔습니다.
- 사용자의 선택과 진행 상태를 관리하며 화면 간 데이터를 전달하고 상태를 유지하는 방법을 구현했습니다.
- 단순한 기능 구현을 넘어, 하나의 주제를 이야기와 UI에 녹여내는 프로젝트 설계의 중요성을 배웠습니다.
- 프로젝트를 끝까지 완성하고 리팩터링하며 코드 구조와 유지보수의 중요성을 체감했습니다.

---

## 🔧 개선하고 싶은 점

- Story와 Result 화면을 하나의 재사용 가능한 컴포넌트 구조로 개선하여 코드 중복을 줄이고 싶습니다.
- 현재는 하드코딩된 스토리 데이터를 데이터 파일 또는 데이터베이스 기반으로 관리하도록 개선하고 싶습니다.
- 사용자의 진행 상황을 저장하고 이어서 플레이할 수 있는 Save / Load 기능을 구현하고 싶습니다.
- 선택에 따라 다른 결과를 제공하는 분기형 스토리와 다양한 엔딩을 추가하고 싶습니다.
- MVVM과 같은 Android 아키텍처를 적용하여 유지보수성과 확장성을 높이고 싶습니다.

---

<div align="center">

### ⭐ Thank you for visiting Stella

*Every star has its own story.*

</div>
