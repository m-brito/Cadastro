package com.github.mbrito.cadastro

import android.os.Bundle
import android.widget.Toast
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

        activityMainBinding.saveBt.setOnClickListener {
            val sexo : String = if(activityMainBinding.mascRb.isChecked){
                "Masculino"
            }else{
                "Feminino"
            }
            val f = Formulario(
                activityMainBinding.nameEt.text.toString(),
                activityMainBinding.emailEt.text.toString(),
                activityMainBinding.phoneEt.text.toString(),
                activityMainBinding.cityEt.text.toString(),
                activityMainBinding.stateSn.selectedItem.toString(),
                sexo,
                activityMainBinding.joinEmailsCb.isChecked,
            )
            Toast.makeText(this@MainActivity, f.toString(), Toast.LENGTH_LONG).show()
        }

        activityMainBinding.cleanBt.setOnClickListener{
            activityMainBinding.nameEt.text.clear()
            activityMainBinding.emailEt.text.clear()
            activityMainBinding.phoneEt.text.clear()
            activityMainBinding.cityEt.text.clear()
            activityMainBinding.joinEmailsCb.isChecked = false
            activityMainBinding.mascRb.isChecked = false
            activityMainBinding.femRb.isChecked = false
            activityMainBinding.stateSn.setSelection(0)
        }
    }
}