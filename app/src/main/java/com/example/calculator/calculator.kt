import java.util.Scanner

class Calculator(private val operation: AbstractOperation) {
    fun calculate(num1: Double, num2: Double): Double { return operation.operate(num1, num2)
}
}
abstract class AbstractOperation {
    abstract fun operate(num1: Double, num2: Double): Double
}

class AddOperation : AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return num1 + num2
    }
}

class SubOperation : AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return num1 - num2
    }
}

class MulOperation : AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return num1 * num2
    }
}

class DivOperation : AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {return num1 / num2
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
    val operation = when (operator) {
        "+" -> AddOperation()
        "-" -> SubOperation()
        "*" -> MulOperation()
        "/" -> DivOperation()
        else -> throw IllegalArgumentException("잘못된 연산자입니다")
    }
    val calculator = Calculator(operation)
    val result = calculator.calculate(num1,num2)

    println("$num1 와 $num2 의 $operator 한 결과는 $result 입니다")

}