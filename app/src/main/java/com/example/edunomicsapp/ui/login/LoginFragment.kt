package com.example.edunomicsapp.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.edunomicsapp.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    private lateinit var galleryViewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
            ViewModelProviders.of(this).get(LoginViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_login, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signup.setOnClickListener {
            Toast.makeText(context, "Signup yourself in Edunomics", Toast.LENGTH_SHORT).show()
        }
        login.setOnClickListener {
            if(email.text.isNullOrEmpty() && password.text.isNullOrEmpty()) {
                if (email.text.isNullOrEmpty())
                    email.error = "Please enter your email"
                if (password.text.isNullOrEmpty())
                    password.error = "please enter you password"
            }else{
             Toast.makeText(context, "Login Successfully", Toast.LENGTH_SHORT).show()
            }
        }
    }
}