package lec01

import com.lannstark.lec01.Person

class Lec01Main {
    fun main() {
        var number1 : Long = 10L // (1) 값을 바꿀 수 있는 것
        number1 = 5L

        val number2 = 10L // (2) 값을 바꿀 수 없는 것

        var number3 : Long? = 1_000L
        number3 = null // 코틀린에서 null 이 변수에 들어갈 수 있다면 "타입?" 를 사용해야 한다.

        var person = Person("최태현") // 객체 인스턴스화에서 new 를 붙여주지 않는다.
    }
}