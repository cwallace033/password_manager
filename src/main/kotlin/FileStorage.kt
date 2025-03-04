package org.example

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

object FileStorage {
    private const val FILE_NAME = "passwords.json"

    fun savePasswords(passwords: List<PasswordEntry>) {
        val json = Json.encodeToString(passwords)
        File(FILE_NAME).writeText(json)
    }
    fun loadPasswords(): List<PasswordEntry> {
        val file = File(FILE_NAME)
        return if (file.exists()) {
            Json.decodeFromString(file.readText())
        } else
            emptyList()

    }
}

