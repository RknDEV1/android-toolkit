# Android Toolkit

Reusable utilities for **Android** apps (Kotlin + Jetpack Compose).

> Português: [README.pt-BR.md](README.pt-BR.md)

Companion to the iOS packages on [RknDEV1](https://github.com/RknDEV1).

## Features

| Module | Status | Description |
|--------|--------|-------------|
| **Validators** | Done | Email + CPF |
| **Formatters** | Done | R$, phone, CEP, CPF |
| **SecureStorage** | Planned | EncryptedSharedPreferences + Biometric |
| **Compose UI** | Planned | Buttons, fields, cards |

## Usage

```kotlin
Validators.isValidCPF("390.533.447-05")
Formatters.currency(19.90)
Formatters.phone("79999999999")
Formatters.cep("49000000")
```

## Requirements

- Android Studio Ladybug+
- Kotlin 2.0+
- Min SDK 26

## License

MIT
