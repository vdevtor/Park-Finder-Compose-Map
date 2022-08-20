package com.example.parkfinder.data

import com.example.parkfinder.domain.model.ParkingSpot

fun ParkingSpotEntity.toParkingSpot(): ParkingSpot {

    return ParkingSpot(
        lat = this.lat,
        lng = this.lng,
        id = this.id
    )
}

fun ParkingSpot.toParkingSpotEntity(): ParkingSpotEntity {

    return ParkingSpotEntity(
        lat = this.lat,
        lng = this.lng,
        id = this.id
    )
}