package com.rayshaayundami2b.tugas2raysha

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var Username: EditText
    lateinit var Password: EditText
    lateinit var Login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Username = findViewById(R.id.username)
        Password = findViewById(R.id.password)
        Login = findViewById(R.id.login)


        Login.setOnClickListener {
            val username = Username.text.toString()
            val password = Password.text.toString()

            //Log.i("Test Credentianls", "username : $username and password : $password")
            if (username == "admin" && password == "1234") {
                // Pindah ke MainActivity setelah login berhasil
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish() // Untuk menutup LoginActivity agar pengguna tidak bisa kembali
            // ke halaman login
            } else {
                // Tampilkan pesan error jika login gagal
                Toast.makeText(this, "Username atau password salah",
                    Toast.LENGTH_SHORT).show()
            }


        }
    }
}