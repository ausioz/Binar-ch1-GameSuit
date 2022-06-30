class Main {
}
fun main (){
    val gameBanner =Banner()
    gameBanner.createGameBanner()
}


class Banner(){
    val borderGame:String = "=========================="
    val textBanner:String = "GAME SUIT TERMINAL VERSION"

    fun createGameBanner(){
        println(borderGame)
        println(textBanner)
        println(borderGame)
    }
}