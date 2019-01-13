package com.general.kotlin.demo

open class Vehicle(var name:String)

class PrivateCar(name: String,val carClassificationType: String) : Vehicle(name)

class Van(name: String,val transportingType: String) : Vehicle(name)



private fun extractType(vehicle: Vehicle): String {
    return if (vehicle is PrivateCar)
        vehicle.carClassificationType
    else if (vehicle is Van)
        vehicle.transportingType
    else
        "unknown"

}