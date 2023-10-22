fun main() {
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")
    solarSystem.add("Pluto")
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    println("Pluto" in solarSystem)
}