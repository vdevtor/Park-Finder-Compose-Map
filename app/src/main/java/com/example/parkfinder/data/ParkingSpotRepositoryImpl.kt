package com.example.parkfinder.data

import com.example.parkfinder.domain.model.ParkingSpot
import com.example.parkfinder.domain.repository.ParkingSpotRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ParkingSpotRepositoryImpl(
    val dao: ParkingSpotDao

) : ParkingSpotRepository {

    override suspend fun insertParkingSpot(spot: ParkingSpot) {
        dao.insertParkingSpot(spot.toParkingSpotEntity())
    }

    override suspend fun deleteParkingSpot(spot: ParkingSpot) {
        dao.deleteParkingSpot(spot.toParkingSpotEntity())
    }

    override fun getParkingSport(): Flow<List<ParkingSpot>> {
        return dao.getParkingSpot().map { spots ->
            spots.map { it.toParkingSpot() }
        }
    }
}