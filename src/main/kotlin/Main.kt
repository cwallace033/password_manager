package org.example

fun main() {
    println("Hello World!")
    addPassword("Google", "cwallace", "password")

    findPassword("Google")
    val result = findPassword("Google")
    println(result)
}

data class PasswordEntry(val site: String, val username: String, val password: String)
val passwordList = mutableListOf<PasswordEntry>()

fun addPassword(site: String, username: String, password: String) {
    val entry = PasswordEntry(site, username, password)
    passwordList.add(entry)
}

fun findPassword(site: String): PasswordEntry? {
    return passwordList.find { it.site == site }
}

fun deletePassword(site: String) {
    passwordList.removeIf { it.site == site }
}
