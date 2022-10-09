// main function
fun main(args: Array<String>) {
    var name: String = "huehue"
    name = "beruba"

    print("hello my name is ")
    println(name + "Wahyuu bang")
    println(if (name === "lao") "Alwwaa true" else "Alwayyy false")

    val satu = 1
    val dua = 2
    println(satu + dua + 5)

//    Char = unicode, iso di increment dan decrement
    var ongko: Char = '-'
    println(ongko++)
    println(ongko++)
    println(ongko++)
    println(ongko++)
    println(ongko++)
    println(ongko--)
    println("last ongko : " + ongko)

// String
    val strinngki: String = "Alpelible"
    println(strinngki[0])
    println(strinngki[2])
    println(strinngki[5])
    val lastBender = strinngki[strinngki.length - 1]
    println("Last Character in $strinngki is $lastBender")

    for (rext in strinngki) {
        print("$rext ")
    }

    val escapeString: String = "\niso ngene \"bro\" \t tabsss aku \u0050"
    println(escapeString)

    val jajal = """
        iyo iki line 1
        line 2
        lin 3
    """.trimIndent()
    print(jajal)

    ndakReturnFun()

    val user = setUser("Wjooee", 255)
    println(user)

//    Condition
    val openHours = 7
    val now = 22
    if (now >= openHours) {
        println("already open")
    }
    val office: String
    if (now >= openHours) {
        office = "office is open"
    } else {
        office = "office is close"
    }
    println(office)
    val jajalOffice: Double
    jajalOffice = if (openHours <= now) {
        -1.01
    } else {
        1.01
    }
    println(jajalOffice)

//  Conjuntion
    val isOpen = 22 >= 7 && 22 <= 16
    println("Open kah dirimu ? $isOpen")

//    Array
    val araAra = arrayOf('a', "heuhuehue", 1, 1000)
    println(araAra[1])
    println(araAra.size)

    val intArr = intArrayOf(1, 4, 6)
    println(intArr[2])
//    intArrayOf() : IntArray
//    booleanArrayOf() : BooleanArray
//    charArrayOf() : CharArray
//    longArrayOf() : LongArray
//    shortArrayOf() : ShortArray
//    byteArrayOf() : ByteArray

    val jajArray = Array(4) { i -> i + 2 }
    println(jajArray[0])
    println(jajArray[2])

//    Null Pointer Exception
    val text: String? = null
    println(text)
    if (text !== null) {
        println(text.length)
    }

//    Safe Call & Elvis Operator
//    safe call
    println(text?.length)
//    elvis operator
    println(text?: "default nih bos")


}

fun ndakReturnFun (): Unit {
    println("\njajajaln function yang ndak return")
}

fun setUser(name: String, age: Int): String = "Your name is $name and your age is $age"