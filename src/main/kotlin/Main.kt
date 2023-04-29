fun main() {
    val likes = 11
    val correctWord = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $correctWord")
}