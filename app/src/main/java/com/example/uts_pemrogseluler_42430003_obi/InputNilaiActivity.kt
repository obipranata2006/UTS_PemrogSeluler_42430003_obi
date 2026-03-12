package com.example.uts_pemrogseluler_42430003_obi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InputNilaiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_nilai)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etTugas = findViewById<EditText>(R.id.etNilaiTugas)
        val etUTS = findViewById<EditText>(R.id.etNilaiUTS)
        val etUAS = findViewById<EditText>(R.id.etNilaiUAS)
        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btnHitung.setOnClickListener {
            val nama = etNama.text.toString()
            val nTugas = etTugas.text.toString().toDoubleOrNull() ?: 0.0
            val nUTS = etUTS.text.toString().toDoubleOrNull() ?: 0.0
            val nUAS = etUAS.text.toString().toDoubleOrNull() ?: 0.0

            val nilaiAkhir = (nTugas * 0.3) + (nUTS * 0.3) + (nUAS * 0.4)
            val status = if (nilaiAkhir >= 70) "LULUS" else "GAGAL"

            tvHasil.text = "Mahasiswa: $nama \nNilai Akhir: $nilaiAkhir \nStatus: $status"
        }
    }
}