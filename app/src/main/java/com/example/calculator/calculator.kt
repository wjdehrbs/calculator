import java.util.Scanner

class Calculator {
    fun calculate(num1: Double, num2: Double, operator: String): Double {
        return when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> throw IllegalArgumentException("실패!")
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("사칙연산 계산기")

    print("첫 번째 숫자를 입력하세요: ")
    val num1 = scanner.nextDouble()

    print("두 번째 숫자를 입력하세요: ")
    val num2 = scanner.nextDouble()

    print("연산자를 선택하세요 (+, -, *, /): ")
    val operator = scanner.next()

    val calculator = Calculator()
    val result = calculator.calculate(num1, num2, operator)

    println("$num1 와 $num2 의 $operator 한 결과는 $result 입니다")
}
