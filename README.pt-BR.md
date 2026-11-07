# Android Toolkit

Utilitários reutilizáveis para apps **Android** (Kotlin + Jetpack Compose).

> English: [README.md](README.md)

## Recursos

| Módulo | Status | Descrição |
|--------|--------|-----------|
| **Validators** | Pronto | E-mail + CPF |
| **Formatters** | Pronto | R$, telefone, CEP, CPF |
| **SecureStorage** | Planejado | Armazenamento seguro + biometria |
| **Compose UI** | Planejado | Botões, campos, cards |

## Uso

```kotlin
Validators.isValidCPF("390.533.447-05")
Formatters.currency(19.90)
Formatters.phone("79999999999")
Formatters.cep("49000000")
```

## Licença

MIT
