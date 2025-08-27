package com.example.proyectobase2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase2.utils.OpMatematicas

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        val edNumero1:EditText = findViewById(R.id.ed_numero1)
        val edNumero2:EditText = findViewById(R.id.ed_numero2)
        val txtMensaje:TextView = findViewById(R.id.txt_mensaje)
        val btnCalcular:Button = findViewById(R.id.boton_calcular)

        btnCalcular.setOnClickListener {
            var calN1:Int = edNumero1.text.toString().toIntOrNull()?:0
            var calN2:Int = edNumero2.text.toString().toIntOrNull()?:0

            var resultadoOP: Int = OpMatematicas.resta(calN1,calN2)

            txtMensaje.text = resultadoOP.toString()

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}