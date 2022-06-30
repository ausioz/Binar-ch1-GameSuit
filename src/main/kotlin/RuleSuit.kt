class RuleSuit {
    val batu: String = "Batu"
    val gunting: String = "Gunting"
    val kertas: String = "Kertas"
    var status: String? = null
    fun rule(pemain1:String?, pemain2:String?){
        if (
            pemain1 == batu && pemain2 == gunting ||
            pemain1 == gunting && pemain2 == kertas ||
            pemain1 == kertas && pemain2 == batu)
            { status = "Pemain 1 MENANG!" }
        else if (
            pemain1 == batu && pemain2 == kertas ||
            pemain1 == gunting && pemain2 == batu ||
            pemain1 == kertas && pemain2 == gunting)
            { status = "Pemain 2 MENANG!" }
        else { status = "DRAW!"  }
    }
    fun result(){
        println("\u001B[1m"+status)
    }
}
