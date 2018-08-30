package com.example.ahmed.calclutor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnclac.setOnClickListener {
         try {

                var sbt = SimpleDateFormat("yyyy")
                var nowyear = Integer.parseInt(sbt.format(Date()))
                var brithdate = Integer.parseInt(txtsum.text.toString())
                var resuly = nowyear - brithdate
                txtage.text = resuly.toString()
         }catch (ex:Exception){
             Toast.makeText(this,"Enter Number ",Toast.LENGTH_SHORT).show()
         }


        }
    }
}
