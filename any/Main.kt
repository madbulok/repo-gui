package kotlins

fun main() {

//    ЗАДАЧА №1
    // false это аверс
    // true это ревер
    // вот 10 монеток в темноте (перемешены)
    var s = listOf(true, true, true, true, true, false, false, false, false, false).shuffled()

    // делим их на две равные кучки
    var firstHeap = s.subList(0, s.size / 2).toMutableList()
    var secondHeap = s.subList(s.size / 2, s.size).toMutableList()

    // монеты второй кучки переворачиваем
    secondHeap.indices.forEach {
        secondHeap[it] = !secondHeap[it]
    }

    // вуаля!
    println("Answer")
    println(firstHeap)
    println(secondHeap)

}
