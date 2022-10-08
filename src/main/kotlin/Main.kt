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
}

fun ndakReturnFun (): Unit {
    println("\njajajaln function yang ndak return")
}

fun setUser(name: String, age: Int): String = "Your name is $name and your age is $age"