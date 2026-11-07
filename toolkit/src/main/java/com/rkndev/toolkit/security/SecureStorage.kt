package com.rkndev.toolkit.security

/**
 * Placeholder for secure storage.
 * Will use EncryptedSharedPreferences + BiometricPrompt when Android Studio is available.
 */
object SecureStorage {

    fun save(key: String, value: String) {
        // TODO: EncryptedSharedPreferences
    }

    fun load(key: String): String? {
        // TODO: EncryptedSharedPreferences
        return null
    }

    fun delete(key: String) {
        // TODO
    }
}
