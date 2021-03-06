package id.ac.ukdw.pertemuan7_71190476

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ContactDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val nama = intent.getStringExtra("nama")
        val name = findViewById<TextView>(R.id.txtNama)
        name.text = nama
        val number = intent.getStringExtra("nomor")
        val num = findViewById<TextView>(R.id.txtNomor)
        num.text = number
        val address = intent.getStringExtra("alamat")
        val alamat = findViewById<TextView>(R.id.txtAlamat)
        alamat.text = address
        val surel = intent.getStringExtra("email")
        val email = findViewById<TextView>(R.id.txtEmail)
        email.text = surel
        }
    }