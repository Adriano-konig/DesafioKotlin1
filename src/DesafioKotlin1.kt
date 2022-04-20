import kotlin.system.exitProcess

fun main() {
    println("****************************************************")
    println("************* PROFESSORES DE SIMCITY ***************")
    println("****************************************************")
    calculoMediaAluno()
    novoCalculo()
}
fun calculoMediaAluno(){
    var nome: String = " "
    var nota: Double = 0.0
    var soma: Double = 0.0
    var media: Double = 0.0

    println("Informe nome aluno: ")
    nome = readln()

    for (i: Int in 1..4){
        println("nota $i: ")
        nota= readln().toDouble()
        soma+=nota
        media = soma / 4
        when{
            nota > 0 && nota <=10 -> true
        else->{
            println("nota inválida")
            return calculoMediaAluno()
        }
        }
    }
    println("Aluno(a) $nome tirou a Media: $media")

}

fun novoCalculo(){
    println("Gostaria fazer outro calculo? digite numero 1=sim ou 2=não")
    var digite = readln().toInt()

    val lista = arrayListOf<Int>(digite)


    lista.forEach{numero->
    when {
        digite == 1 -> main()
        digite == 2 ->{
            println("Encerrando com sucesso!")
            exitProcess(0)
        }
        else -> {
            println("numero invalido!!")
            novoCalculo()
        }
    }
    }
}