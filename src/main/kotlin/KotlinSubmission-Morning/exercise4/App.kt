package `KotlinSubmission-Morning`.exercise4

fun main() {
    exceptionHandling()
}

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
fun exceptionHandling() {
    val name: String? = null
    lateinit var nameNotNull: String

    try {
        nameNotNull = name!!
        println(nameNotNull)
    } catch (e: Exception) {
        nameNotNull = "Name bernilai Null"
        println(nameNotNull)
    }
}