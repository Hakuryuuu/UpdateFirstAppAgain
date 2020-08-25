package com.example.firstappagain.addcontact

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class AddContactViewModel (
    val database: AddContactDataBase, application: Application
):AndroidViewModel(application){

}
