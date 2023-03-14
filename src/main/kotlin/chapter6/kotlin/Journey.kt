package chapter6.kotlin

data class Journey(
    var name: String,
    var duration: Int
) {
    fun getDepartsFrom(): Location {
        return Location("location")
    }

    fun <U : Comparable<U?>?, T> getDuration(t: T): Int {
        return 0
    }
}