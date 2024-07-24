
fun main() {
    
    //lists
    val imperials = listOf("Emperor","Dath Vadar","Boba Fett","Tarkin")
    println(imperials.last())
    println(imperials.contains("Luke"))
    println(imperials.sorted())
    println(imperials)
    //mutable
    val rebels = arrayListOf("Leiah","Luke","Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    rebels.remove("Han Solo")
    println(rebels)
    
    //map => is key pair value
    val rebelVehiclesMap = mapOf("Solo" to "Millenium falcon", "Luke" to "Landscaper")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.getOrDefault("Luke", "This doesnt kubaawo"))
    //mutable
    val rebelVehicles = hashMapOf("Solo" to "Millenium falcon", "Ken" to "landstoker", "Bazz" to "Matutu john")
    rebelVehicles["Luke"] = "Xwing"
    rebelVehicles.put("Leaih", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Solo")
    println(rebelVehicles)
    rebelVehicles.isEmpty()
    
    
}