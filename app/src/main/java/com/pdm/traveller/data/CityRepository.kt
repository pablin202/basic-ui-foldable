package com.pdm.traveller.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface CityRepository {
    fun getCities(): Flow<List<City>>
}

class CityRepositoryImpl : CityRepository {

    override fun getCities() = flow {
        val cities = CityDataSource.loadCities
        emit(cities)
    }
}