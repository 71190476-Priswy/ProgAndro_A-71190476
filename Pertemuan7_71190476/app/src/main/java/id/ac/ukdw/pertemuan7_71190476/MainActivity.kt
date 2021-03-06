package id.ac.ukdw.pertemuan7_71190476

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    val listContact = arrayListOf<Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listContact.add(Contact("TorontoTirta", "081236455768", R.mipmap.tirtatokyo))
        listContact.add(Contact("PuppeySecret", "081233456778", R.mipmap.puppeysecret))
        listContact.add(Contact("DendiLegend", "081384569430", R.mipmap.dendilegend))

        val rcyContact = findViewById<RecyclerView>(R.id.rcyContact)
        rcyContact.layoutManager = LinearLayoutManager(this)
        val adapter = ContactAdapter(listContact, this)
        rcyContact.adapter = adapter
    }
}