import scala.io.StdIn.readLine

object Day4HealthExercise extends App {

//TODO ask person for name
//Ask for their temperature
//if temperature is below 35 print "That is a bit too cold"
//if temperature is between 35 and 37 (both sides inclusive) then print "You are all right!"
//finally if the temperature is over 37 then print "You have a fever! Consider contacting a doctor"

//consider what would be the best way to handle this logic

  println("Temperature exercise")

  val personsName = readLine(s"What is your name? \n")
  val temperature = readLine(s"What is your temperature? \n").toDouble

   if (temperature < 35) {
    println("That is a bit too cold!")

  } else if (temperature >= 35 && temperature <= 37) {
   println( "You are all right!")

  } else println("You have a fever! Consider contacting a doctor!")
}
