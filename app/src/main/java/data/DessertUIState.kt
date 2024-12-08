package trpl.nim234311029.dessert_clicker.data

import androidx.annotation.DrawableRes
import trpl.nim234311029.dessert_clicker.data.Datasource.dessertList

data class DessertUIState(
    val currentDessertIndex: Int = 0,
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId
)