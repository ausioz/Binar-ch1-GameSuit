import kotlin.random.Random

open class RuleSuit {
    val pilihanSuit = arrayOf("Batu","Gunting","Kertas")
    var status: String? = null
    fun rule(pemain1:String?, pemain2:String?){
        // 0: Batu      1: Gunting      2:Kertas
        if (
            pemain1 == pilihanSuit[0] && pemain2 == pilihanSuit[1] ||
            pemain1 == pilihanSuit[1] && pemain2 == pilihanSuit[2] ||
            pemain1 == pilihanSuit[2] && pemain2 == pilihanSuit[0])
            { status = "Pemain 1 MENANG!" }
        else if (
            pemain1 == pilihanSuit[0] && pemain2 == pilihanSuit[2] ||
            pemain1 == pilihanSuit[1] && pemain2 == pilihanSuit[0]||
            pemain1 == pilihanSuit[2] && pemain2 == pilihanSuit[1])
            { status = "Pemain 2 MENANG!" }
        else { status = "DRAW!"  }
    }
    val pemainAI = pilihanSuit.random()
    fun result(){
        println("\u001B[1m"+status)
    }
}
