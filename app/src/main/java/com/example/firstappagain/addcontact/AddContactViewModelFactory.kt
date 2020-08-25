package com.example.firstappagain.addcontact

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.sql.CommonDataSource

class AddContactViewModelFactory (private val dataSource: AddContactDataBase,
                                  private val application: Application
):ViewModelProvider.Factory{
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AddContactViewModel::class.java)) {
            return AddContactViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
