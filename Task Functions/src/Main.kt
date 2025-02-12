fun main() {
    greetTraveler()
    println(findOasis(10,20))
    println(currentTemperature(22, 42))
    println(startCamelRide(10))
    var timeToClimb = exploreDune(climbRate = 3, height = 20) // need exp
    println("Time to Climb the Dune: %.2f hours".format(timeToClimb))
    println(survivalChance(8))
}

fun greetTraveler(){
    println("Welcome to the Desert, Traveler!")
}
fun  findOasis(x: Int, y: Int): String {
    return "Oasis found at coordinates ($x, $y)"
}
fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): Int{
    return (morningTemperature + afternoonTemperature)/2
}
fun startCamelRide(time: Int , speed: Int = 5): String{
    var Distance = time * speed
    return "Camel Ride: Distance = $Distance km, Speed = $speed km/h, Time = $time hours"
}
fun exploreDune(height: Int, climbRate: Int): Double{
    return height.toDouble()/climbRate
}
fun survivalChance(supplies: Int): Int{
    return supplies * 10

}