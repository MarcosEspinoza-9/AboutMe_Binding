package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

//PASO 3 DE LA PRACICA GUIADA: DECLARAR UNA ACTIVITYMAINBINDING
    private lateinit var binding: ActivityMainBinding

    //paso 3 crear los datos
    private val myName: MyName = MyName()


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //REMPLAZO
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        /*binding.nameText.text = binding.nameText.text.toString()
        binding.bioText.visibility = View.GONE
        binding.bioScroll.visibility = View.GONE
        binding.starImage.visibility = View.GONE
    */

        // PASO 4 DE LA PRACTICA

        binding.apply {
            //binding.nameText.text = binding.nameText.text.toString()
            myName?.nickname = nicknameEdit.text.toString()
            binding.bioText.visibility = View.VISIBLE
            binding.bioScroll.visibility = View.VISIBLE
            binding.starImage.visibility = View.VISIBLE
        }
        binding.apply {
            myName?.MyName = nameText.text.toString()
            invalidateAll()
        }



    }
}