package com.example.rgm34172050.data

import android.content.Context
import br.edu.up.rgm34353470.data.OfflineItemsRepository

interface AppContainer {
    val itemsRepository: ItemsRepository
}

class AppDataContainer(private val context: Context) : AppContainer {
    override val itemsRepository: ItemsRepository by lazy {
        OfflineItemsRepository(InventoryDatabase.getDatabase(context).itemDao())
    }
}
