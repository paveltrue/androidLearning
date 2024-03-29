package com.yanpav.purchaselist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yanpav.purchaselist.data.ShopListRepositoryImpl
import com.yanpav.purchaselist.domain.DeleteShopItemUseCase
import com.yanpav.purchaselist.domain.EditShopItemUseCase
import com.yanpav.purchaselist.domain.GetShopListUseCase
import com.yanpav.purchaselist.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val getDeleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val getEditShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = MutableLiveData<List<ShopItem>>()

    fun getShopList() {
        val list = getShopListUseCase.getShopList()
        shopList.value = list
    }

    fun deleteShopItem(shopItem: ShopItem) {
        getDeleteShopItemUseCase.deleteShopItem(shopItem)
        getShopList()
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        getEditShopItemUseCase.editShopItem(newItem)
        getShopList()
    }

}