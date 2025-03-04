package org.example

import kotlinx.serialization.Serializable

@Serializable
data class PasswordEntry(val site: String, val username: String, val password: String)