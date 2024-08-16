package com.github.mbrito.cadastro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.github.mbrito.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.cleanBt.setOnClickListener{
            activityMainBinding.nameEt.text.clear()
            activityMainBinding.emailEt.text.clear()
            activityMainBinding.phoneEt.text.clear()
            activityMainBinding.cityEt.text.clear()
            activityMainBinding.ticketEmailsCb.isChecked = false
            activityMainBinding.mascRb.isChecked = false
            activityMainBinding.femRb.isChecked = false
            activityMainBinding.stateSn.setSelection(0)
        }
    }
}