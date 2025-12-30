package com.example.actionbar_temas

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar_second)
        setSupportActionBar(toolbar)

        // Habilita o botão de "voltar" na toolbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Trata o clique no botão de "voltar"
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish() // Fecha a atividade e volta para a anterior
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}