package com.example.proyectobase2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        val opcioneLv:ListView=findViewById(R.id.opcionesLV)
        val opcinesArr= arrayOf(
            "Sumar",
            "Resta",
            "Multiplicar",
            "Dividir"
        )
        val adaptador = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, opcinesArr)
        opcioneLv.adapter = adaptador

        //eveto escuchar opcion seleccionada
        opcioneLv.setOnItemClickListener { parent, view, position, id ->
            val itemElegido= parent.getItemAtPosition(position).toString()
            Toast.makeText(this, itemElegido, Toast.LENGTH_SHORT).show()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}