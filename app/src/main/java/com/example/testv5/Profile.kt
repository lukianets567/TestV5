package com.example.testv5

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.text.TextUtils
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.TransitionBuilder.validate
import com.example.testv5.databinding.ActivityMainBinding
import com.example.testv5.databinding.FragmentProfileBinding
import java.net.PasswordAuthentication

class Profile : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        emailFocusListener()
        passwordFocusListener()
        confirmPasswordFocusListener()
        loginFocusListener()


    }


    private fun emailFocusListener() {
        binding.eMailText.setOnFocusChangeListener{_, focused ->
            if (!focused)
            {
                binding.eMailContainer.helperText = validEmail()
            }
        }
    }

    private fun validEmail(): String? {
        val eMailText = binding.eMailText.text.toString()
        if (!Patterns.EMAIL_ADDRESS.matcher(eMailText).matches()) {
            return "Invalid Email Adress"
        }
        return null
    }

    private fun passwordFocusListener(){
        binding.passwordText.setOnFocusChangeListener{_,focused ->
            if (!focused)
            {
                binding.passwordContainer.helperText = validPassword()
            }
        }
    }

    private fun validPassword(): String? {
        val passwordText = binding.passwordText.text.toString()
        if(passwordText.length < 8){
            return "Min 8 symbols"
        }
        return null
    }

    private fun confirmPasswordFocusListener(){
        binding.confirmPasswordText.setOnFocusChangeListener{_,focused ->
            if (!focused)
            {
                binding.confirmPasswordContainer.helperText = validConfirmPassword()
            }
        }
    }

    private fun validConfirmPassword(): String? {
        val passwordText = binding.passwordText.text.toString()
        val confirmPasswordText = binding.confirmPasswordText.text.toString()
        if(!passwordText.equals(confirmPasswordText)){
            return "Password mismatch"
        }
        return null
    }

    private fun loginFocusListener(){
        binding.passwordText.setOnFocusChangeListener{_,focused ->
            if (!focused)
            {
                binding.loginContainer.helperText = validLogin()
            }
        }
    }

    private fun validLogin(): String? {
        val loginText = binding.loginText.text.toString()
        //if(loginText.matches(".*[A-Z].*".toRegex())&&loginText.matches(".*[a-z].*".toRegex()))
           if(!loginText.matches(".*[@!`~#/$%^&*=+].*".toRegex())&&!loginText.matches(".*[0-9].*".toRegex()))
               //&&loginText.matches(".*[A-Z].*".toRegex())&&loginText.matches(".*[a-z].*".toRegex()))
        {
               return  "Must contain sym and numbers "
            //return "Must Contain only sym and numbers"
        }
        return null
    }

}



