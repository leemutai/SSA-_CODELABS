fun main() {
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    val rockPlanets = arrayOf<String>("Mercury", "Venus","Earth","Mars")
//    val gasPlanets = arrayOf("Jupiter","Saturn", "Uranus", "Neptune")
//    val solarSytem = rockPlanets + gasPlanets
//    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
//    //solarSytem[3] = "Little Earth"
//    //solarSytem[8] = "Pluto"
//   // val solarSytem[3] = "Little Earth"
//    println(newSolarSystem[8])
    solarSystem.add("Pluto")
    solarSystem.add(3,"Theia")
    solarSystem[3] = "Future Moon"
    solarSystem.removeAt(9)
    solarSystem.remove("Future Moon")
    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)
//    println(solarSystem[3])
//    println(solarSystem[9])
//    for (planet in solarSystem) {
//        println(planet)
//    }
//    println(solarSystem.size)
//    println(solarSystem[2])
//    println(solarSystem.get(3))
//    println(solarSystem.indexOf("Earth"))
//    println(solarSystem.indexOf("Pluto"))


}