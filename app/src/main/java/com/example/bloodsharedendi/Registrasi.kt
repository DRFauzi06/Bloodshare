package com.example.bloodsharedendi

//NIM               : 10120765
//Nama              : Dendi Rizal Fauzi
//Kelas             : IF-9
//Tgl Pengerjaan    : 29-04-2023
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registrasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        val buttonClick = findViewById<Button>(R.id.register2_btn)
        buttonClick.setOnClickListener {
            val intent = Intent(this, AlmostThere::class.java)
            startActivity(intent)
        }

    }
}