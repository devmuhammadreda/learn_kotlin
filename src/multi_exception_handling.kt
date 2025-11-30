import java.io.FileNotFoundException
import java.io.IOException
import java.text.ParseException

fun main() {
  try {
      readFile()
  }catch (e : IOException){
      println("")
  }catch (e : FileNotFoundException){
      println("")
  }
  catch (e : ParseException){
      println("")
  }
  catch (e : Exception){
      println("")
  }


    try {
        readFile()
    }catch (e : Exception){
        when(e){
            is FileNotFoundException -> {
                println("")
            }
            is IOException -> {
                println("")
            }
            is ParseException -> {
                println("")
            }
            else -> {
            println("")
            }
        }
    }

    val result : Result<Unit> = runCatching { readFile() }

    result.onSuccess {
        println("")
    }

    result.onFailure {
        when(it){
            is FileNotFoundException -> {
                println("")
            }
            is IOException -> {
                println("")
            }
            is ParseException -> {
                println("")
            }
            else -> {
                println("")
            }
        }
    }
}


fun readFile(){
    println("File read success ")
}