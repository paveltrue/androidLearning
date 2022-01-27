package com.yanpav.purchaselist.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getSHopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>

}