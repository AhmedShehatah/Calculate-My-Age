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

        var numbrith = findViewById<EditText>(R.id.txtsum)
        var btncalac = findViewById<Button>(R.id.btnclac)
        var txtage = findViewById<TextView>(R.id.txtage)



        btncalac.setOnClickListener {
         try {


                var sbt = SimpleDateFormat("yyyy")
                var nowyear = Integer.parseInt(sbt.format(Date()))
                var brithdate = Integer.parseInt(numbrith.text.toString())
                var resuly = nowyear - brithdate
                txtage.text = resuly.toString()
         }catch (ex:Exception){
             Toast.makeText(this,"no number entered",Toast.LENGTH_SHORT).show()
         }


        }
    }
}
