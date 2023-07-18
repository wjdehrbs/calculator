package com.example.calculator

import java.util.Scanner

fun main() {
    val calculator = Scanner(System.`in`)

    println("사칙연산 계산기")

    print("첫 번째 숫자를 입력하세요: ")
    val num1 = calculator.nextDouble()

    print("두 번째 숫자를 입력하세요: ")
    val num2 = calculator.nextDouble()

    print("연산자를 선택하세요 (+, -, *, / , %): ")
    val operator = calculator.next()

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        "%" -> num1 / num2

        else -> throw IllegalArgumentException("실패")
    }

    println("$num1 과 $num2 의 $operator 결과는 $result 입니다")
}
