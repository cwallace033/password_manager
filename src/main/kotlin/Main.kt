package org.example

fun main() {
//    val passwords = listOf(
//        PasswordEntry("Google", "chase@gmail.com", "mypassword123"),
//        PasswordEntry("GitHub", "chase_dev", "securePass!"),
//    )
//
//    FileStorage.savePasswords(passwords)
//    println("Passwords saved")

    val loadedPasswords = FileStorage.loadPasswords()
    println("Loaded passwords: $loadedPasswords")
}


//fun addPassword(site: String, username: String, password: String) {
//    val entry = PasswordEntry(site, username, password)
//    passwordList.add(entry)
//}
//
//fun findPassword(site: String): PasswordEntry? {
//    return passwordList.find { it.site == site }
//}
//
//fun deletePassword(site: String) {
//    passwordList.removeIf { it.site == site }
//}
