class Main {
}
fun main (){
    val gameBanner =Banner()
    gameBanner.createGameBanner()
    val ruleGameSuit = RuleSuit()
    val pemain1Input:String? = readLine()
    val pemain21Input:String? = readLine()
    ruleGameSuit.rule(pemain1Input,pemain21Input)
    ruleGameSuit.result()
}


class Banner(){
    val borderGame:String = "=========================="
    val textBanner:String = "\u001B[1mGAME SUIT TERMINAL VERSION"

    fun createGameBanner(){
        println(borderGame)
        println(textBanner)
        println(borderGame)
    }
}