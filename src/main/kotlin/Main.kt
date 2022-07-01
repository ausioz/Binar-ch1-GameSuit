import kotlin.random.Random

class Main {
}
fun main (){
    val gameBanner =Banner()
    gameBanner.createGameBanner()
    val ruleGameSuit = RuleSuit()
    val gameMode: Int = readLine()?.toInt() ?: 1

    if (gameMode == 1) {
        val pemain1Input: String? = readLine()
        val pemainAIInput: String = RuleSuit().pemainAI
        ruleGameSuit.rule(pemain1Input, pemainAIInput)
        println(pemainAIInput)
        ruleGameSuit.result()
    }
    else if (gameMode == 2) {
        val pemain1Input: String? = readLine()
        val pemain2Input: String? = readLine()
        ruleGameSuit.rule(pemain1Input, pemain2Input)
        ruleGameSuit.result()
    }
    else {
        println("Command Error!")
        println("Masukan game mode (1/2)\n")
        return main()
    }


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