fun main() {
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
//    solarSystem["Pluto"] = 5
    solarSystem["Jupiter"] = 78
    solarSystem.remove("Pluto")
    println(solarSystem["Jupiter"])
    println(solarSystem.size)
    println(solarSystem.get("Theia"))
}