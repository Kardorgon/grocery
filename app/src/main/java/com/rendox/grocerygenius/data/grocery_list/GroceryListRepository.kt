package com.rendox.grocerygenius.data.grocery_list

import com.rendox.grocerygenius.model.GroceryList
import kotlinx.coroutines.flow.Flow

interface GroceryListRepository {
    suspend fun insertGroceryList(groceryList: GroceryList)
    fun getGroceryListById(id: String): Flow<GroceryList?>
    fun getAllGroceryLists(): Flow<List<GroceryList>>
    suspend fun updateGroceryListName(listId: String, name: String)
    suspend fun deleteGroceryListById(groceryListId: String)
    suspend fun upsertGroceryLists(groceryLists: List<GroceryList>)
    suspend fun updateGroceryLists(groceryLists: List<GroceryList>)
}