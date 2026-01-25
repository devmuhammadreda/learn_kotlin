fun main() {
    DataBaseConnection.query("Select * from users")
    DataBaseConnection.query("Insert into users values('Ali')")
    val book1 = Book(title = "C++", author = "Ali")
    val book2 = Book(title = "Java", author = "Muhammad")
    val book3 = Book(title = "C#", author = "Reda")
    book1.showInfo()
    book2.showInfo()
    book3.showInfo()
    println("total created books ${Book.getBookCount()}")
    // object expression
    val buttonClickListener = object : ClickListener {
        override fun click() {
            println("Button clicked")
        }

    }
    buttonClickListener.click()

}

object DataBaseConnection {
    init {
        println("Initializing DataBase Connection")
    }

    fun query(sql: String) {
        println("Query SQL $sql")
    }
}

class Book(val title: String, val author: String) {
    companion object {
        private var bookCount: Int = 0
        fun getBookCount(): Int {
            return bookCount
        }
    }

    init {
        bookCount++
    }

    fun showInfo() {
        println("book with info title $title , author: $author")
    }
}


interface ClickListener {
    fun click()
}