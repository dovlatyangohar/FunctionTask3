infix fun IntArray.add(value: Int): IntArray {
    var arr = IntArray(this.size + 1)
    arr[size] = value
    for (element in arr) {
        arr = this.copyOf()
    }
    return arr
}

// infix fun IntArray.insert(value: Int): IntArray {    
//     return this
// }

//infix fun IntArray.at(position: Int): IntArray {
//}

infix fun IntArray.`remove at`(position: Int): IntArray {
    if (this.isEmpty()) {
        println("Array is empty")
    } else this[position] = 0
    return this
}

infix fun IntArray.print(intRange: IntRange) {
    if (this.isNotEmpty()) {
        for (i in intRange) {
            println(this[i])
        }
    } else println("array is empty")

}

fun main(args: Array<String>) {
    var arr = IntArray(0)

    arr = arr add 3 // create new array and add element at the end
    arr = arr add 7 add 1
    arr = arr add 9 add 6 add 8

    // arr = arr insert 5 at 2 // insert 5 into position 2
    arr = arr `remove at` 3 // set to 0 at position 3
    arr = arr `remove at` 1


    arr print 2..5 // 5 0 6 8
}







