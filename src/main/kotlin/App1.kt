fun main(args: Array<String>) {

    // Typy liczbowe w Kotlin

    // 1. Byte
    println("Byte min   = ${Byte.MIN_VALUE}")
    println("Byte max   = ${Byte.MAX_VALUE}")
    println("Byte bytes = ${Byte.SIZE_BYTES}")
    println("Byte bits  = ${Byte.SIZE_BITS}")
    val b1: Byte = 112
    // val b2: Byte = 200

    // 2. Short
    println("Short min   = ${Short.MIN_VALUE}")
    println("Short max   = ${Short.MAX_VALUE}")
    println("Short bytes = ${Short.SIZE_BYTES}")
    println("Short bits  = ${Short.SIZE_BITS}")

    // 3. Int
    println("Int min   = ${Int.MIN_VALUE}")
    println("Int max   = ${Int.MAX_VALUE}")
    println("Int bytes = ${Int.SIZE_BYTES}")
    println("Int bits  = ${Int.SIZE_BITS}")

    // 4. Long
    println("Long min   = ${Long.MIN_VALUE}")
    println("Lng max    = ${Long.MAX_VALUE}")
    println("Long bytes = ${Long.SIZE_BYTES}")
    println("Long bits  = ${Long.SIZE_BITS}")

    val a1: Long = 10
    val a2 = 10L

    println(a1 is Long)
    println(a2 is Long)

    // Norma IEEE 754

    // 5. Double - liczby zmiennoprzecinkowe podwójnej precyzji
    println("Double min   =  ${Double.MIN_VALUE}")
    println("Double max   =  ${Double.MAX_VALUE}")
    println("Double bytes =  ${Double.SIZE_BYTES}")

    val b = 12.3

    // 6. Float - liczby zmiennoprzecinkowe pojedynczej precyzji
    println("Float min   =  ${Float.MIN_VALUE}")
    println("Float max   =  ${Float.MAX_VALUE}")
    println("Float bytes =  ${Float.SIZE_BYTES}")

    val c = 12.3F

    println(b is Double)
    println(c is Float)

    // 7. Number
    var d: Number = 12
    d = 12.3
    d = 12.3F
    d = 11L

    var e = 12
    // e = 12.3
    // e = 12L


}
