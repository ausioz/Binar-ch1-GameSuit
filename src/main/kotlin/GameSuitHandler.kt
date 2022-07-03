class GameSuitHandler:Handler{

    override fun gameMode() {
        println("Pilih mode game : \n1. vs AI \n2. vs Player 2")
        print("Pilihan game mode (1/satu/2/dua): ")
    }

    override fun pilihMode(mode:Int?) {
        try {
            when (mode) {
                1 -> println("\nMode game vs AI telah dipilih...")
                2 -> println("\nMode game vs Player 2 telah dipilih...")
                else -> salahMode()
            }
        } catch (e: Exception) {
            println("\nInput game mode salah!\n")
            Thread.sleep(700)
            return main()
        }
    }

    fun pilihMode(mode:String?){
        try {
            when {
                mode.equals("satu",ignoreCase = true) -> {
                    println("\nMode game vs AI telah dipilih...")
                }
                mode.equals("dua",ignoreCase = true) -> {
                    println("\nMode game vs Player 2 telah dipilih...")
                }
                else -> {salahMode()}
            }

        } catch (e: Exception) {
            println("\nInput game mode salah!\n")
            Thread.sleep(700)
            return main()
        }
    }

    override fun salahMode() {
        println("\nInput game mode salah!\n")
        Thread.sleep(700)
        return main()
    }

    override fun inputSuitP1(){
         println("Pilih suit Pemain 1 : \n"+
                "1. Batu            2. Gunting          3. Kertas" )
         print("Pilihan suit (1/2/3): ")
    }
    override fun inputSuitP2(){
        println("Pilih suit Pemain 2 : \n"+
                "1. Batu            2. Gunting          3. Kertas" )
        print("Pilihan suit (1/2/3): ")
    }
    override fun inputSuitSalah(){
        println("\nInput pilihan suit salah!\n")
        Thread.sleep(700)
    }

    override fun mulaiSuit(){
        println("_____________")
        println("SUIT DIMULAI!")
        for (i in 3 downTo 1){
            println("$i..")
            Thread.sleep(700)
        }
    }

    override fun mainLagi(){
        println("_________________")
        println("Main lagi? (1.Ya    2.Tidak)" )
    }

}