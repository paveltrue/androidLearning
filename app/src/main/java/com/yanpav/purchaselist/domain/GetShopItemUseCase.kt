package com.yanpav.purchaselist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getSHopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getSHopItem(shopItemId)
    }

}