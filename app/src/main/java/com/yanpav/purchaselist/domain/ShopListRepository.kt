package com.yanpav.purchaselist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getSHopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>

}