package com.example.firstappagain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_addcontact.view.*

class AddContactFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_addcontact,container,false)

        view.floatingActionButton.setOnClickListener{
            Navigation.findNavController(view!!).navigate(R.id.action_addContactFragment_to_addFragment)
        }


        return view
    }
}

