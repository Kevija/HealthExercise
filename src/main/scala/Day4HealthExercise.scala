import scala.io.StdIn.readLine


object Day4HealthExercise extends App {

  println("Temperature exercise")

  val personsName = readLine("What is your name?")
  val temperature = readLine("What is your temperature?").toDouble

   if (temperature < 35) {
    println("That is a bit too cold!")
  }
  else if (temperature >= 35 && temperature <= 37) {
   println( "You are all right!")
  }
  else if (temperature > 37) println("You have a fever! Consider contacting a doctor!")
}
