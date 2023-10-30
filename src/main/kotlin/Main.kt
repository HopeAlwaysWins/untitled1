fun main() {
//ЗАДАНИЕ 6
    for (i in 7 downTo 0 )
    {
        println("Вывод заданий начнется через:$i")
        Thread.sleep(1000)
    }
    var Alan=648;
    var counter = 0;

    while (Alan>0)
    {
        Alan-=20
        counter+=55
    }
    println(counter)

getName()

//ЗАДАНИЕ 1
    val str = "find the lady of the light gone mad with the night"
    val str2 = str.uppercase()
    println(str2)

//ЗАДАНИЕ 2
    val a = 2010
    val b = 665
    println(a+b)


//ЗАДАНИЕ 3
    val username1 = "Alan wake"
    val space = ' '
    val username2 = "The Dark Place"
    println("$username1, has been trapped in $username2")


//ЗАДАНИЕ 4
    val s: String = "665"
    val d: Int = s.toInt()
    println(d)


//ЗАДАНИЕ 8
    val arrayOfBooks: Array<String> = arrayOf("The Sudden stop","Departure","Initiation","Return")
    println(arrayOfBooks.indexOf("Departure"))
    println(arrayOfBooks.size)


//ЗАДАНИЕ 5
    val initiation = 1
    if (initiation >= Return) {
        println("return")
    } else {
        println("Время написание Return еще не пришло")
    }
}
const val Return = 2

//ЗАДАНИЕ 7
fun getName() {
    println("Введите имя:")
    val name = readLine()
    println(name)
}

