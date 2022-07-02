import kotlin.random.Random
import kotlin.system.exitProcess

class Main {
}
fun main (){
    val gameBannerSuit = BannerSuit()
    gameBannerSuit.createGameBannerSuit()
    val gameHandler = GameSuitHandler()
    val ruleGameSuit = RuleSuit()
    gameHandler.gameMode()

    fun doAIMode() {
        gameHandler.inputSuitP1()
        val pemain1Input: Int? = readLine()?.toIntOrNull()
        val pemainAIInput: String = RuleSuit().pemainAI

        val pemain1InputStr:String = (when (pemain1Input) {
            1 -> "Batu"
            2 -> "Gunting"
            3 -> "Kertas"
            else -> {
                gameHandler.inputSuitSalah()
                return doAIMode()
            }
        })
        ruleGameSuit.rule(pemain1InputStr, pemainAIInput)
        gameHandler.mulaiSuit()
        println("Pemain 1 memilih $pemain1InputStr")
        Thread.sleep(500)
        println("Pemain 2 memilih $pemainAIInput")
        ruleGameSuit.result()
    }
    fun doPlayerMode(){

        gameHandler.inputSuitP1()
        val pemain1Input: Int? = readLine()?.toIntOrNull()
        gameHandler.inputSuitP2()
        val pemain2Input: Int? = readLine()?.toIntOrNull()

        val pemain1InputStr:String = (when (pemain1Input) {
            1 -> "Batu"
            2 -> "Gunting"
            3 -> "Kertas"
            else -> {
                gameHandler.inputSuitSalah()
                return doPlayerMode()
            }
        })
        val pemain2InputStr:String = (when (pemain2Input) {
            1 -> "Batu"
            2 -> "Gunting"
            3 -> "Kertas"
            else -> {
                gameHandler.inputSuitSalah()
                return doPlayerMode()
            }
        })
        ruleGameSuit.rule(pemain1InputStr, pemain2InputStr)
        gameHandler.mulaiSuit()
        println("Pemain 1 memilih $pemain1InputStr")
        Thread.sleep(500)
        println("Pemain 2 memilih $pemain2InputStr")
        ruleGameSuit.result()
    }
    fun doMainLagi(){
        gameHandler.mainLagi()
        val inputMainLagi:Int? = readLine()?.toIntOrNull()
        if (inputMainLagi == 1){ return  main()}
        else if (inputMainLagi == 2){System.exit(1)}
        else {
            println("Input Salah")
            return doMainLagi()
        }
    }


    val inputMode = readLine()?.toIntOrNull()
    gameHandler.pilihMode(inputMode)

    if (inputMode == 1) {
        doAIMode()
        doMainLagi()

    }
    else if (inputMode == 2) {
        doPlayerMode()
        doMainLagi()
    }

}


class BannerSuit(){
    val borderGame:String = "=========================="
    val textBanner:String = "GAME SUIT TERMINAL VERSION"

    fun createGameBannerSuit(){
        println(borderGame)
        println(textBanner)
        println(borderGame)
    }
}