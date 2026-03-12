package com.example.uts_pemrogseluler_42430003_obi

import android.content.Intent // !! WAJIB ADA
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val user = etUsername.text.toString()
            val pass = etPassword.text.toString()

            if (user == "admin" && pass == "123") {
                // Munculkan pesan berhasil
                Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()

                // !! PROSES PINDAH KE HALAMAN INPUT NILAI !!
                val intent = Intent(this, InputNilaiActivity::class.java)
                startActivity(intent)

            } else {
                // Jika salah
                Toast.makeText(this, "Username atau Password Salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}