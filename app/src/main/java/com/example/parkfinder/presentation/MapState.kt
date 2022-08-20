package com.example.parkfinder.presentation

import com.example.parkfinder.domain.model.ParkingSpot
import com.google.maps.android.compose.MapProperties

data class MapState(
    val properties : MapProperties = MapProperties(),
    val parkingSpot: List<ParkingSpot> = emptyList(),
    val isFalloutMap : Boolean = false
)
