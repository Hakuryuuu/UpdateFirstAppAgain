package com.example.firstappagain.addcontact

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [AddContactData::class],version = 1)
abstract class AddContactDataBase : RoomDatabase() {

    companion object {
        @Volatile
        private var model: AddContactDataBase? = null
        fun getDatabase(context: Context): AddContactDataBase? {
            synchronized(this) {
                var _model = model

                if (_model == null) {
                    model = Room.databaseBuilder(
                        context.applicationContext,
                        AddContactDataBase::class.java,
                        "contact_list_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    model = _model
                }
                return _model
            }
        }
    }

}

