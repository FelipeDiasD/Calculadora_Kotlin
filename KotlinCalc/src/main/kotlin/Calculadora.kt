fun main() {
    var num1: Float?
    var num2: Float?
    var input: String?
    var opcoes = "+-/*"
    println("Por favor escolha a operação a ser realizada")
    for (i in opcoes) {
        println("$i")
    }
    var op: String? = readLine()
    if (op == "+") {
        println("Por favor insira o 1º valor a ser somado")
        input = readLine()
        num1 = input?.toFloat()
        println("Por favor insira o 2º valor a ser somado")
        input = readLine()
        num2 = input?.toFloat()
        if (num1 != null && num2 != null) {
            println(num1 + num2)
        }
    } else if (op == "-") {
        println("Por favor insira o 1º valor a ser subtraído")
        input = readLine()
        num1 = input?.toFloat()
        println("Por favor insira o 2º valor a ser subtraído")
        input = readLine()
        num2 = input?.toFloat()
        if (num1 != null && num2 != null) {
            println(num1 - num2)
        }
    } else if (op == "/") {
        println("Por favor insira o 1º valor a ser dividido")
        input = readLine()
        num1 = input?.toFloat()
        println("Por favor insira o 2º valor a ser dividido")
        input = readLine()
        num2 = input?.toFloat()
        if (num1 != null && num2 != null) {
            println(num1 / num2)
        }
    } else if (op == "*") {
        println("Por favor insira o 1º valor a ser multiplicado")
        input = readLine()
        num1 = input?.toFloat()
        println("Por favor insira o 2º valor a ser multiplicado")
        input = readLine()
        num2 = input?.toFloat()
        if (num1 != null && num2 != null) {
            println(num1 * num2)
        }
    } else
        println("Por favor insira um dado válido!")


}