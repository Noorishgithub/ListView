package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView
    lateinit var customadapter: Customadapter
    val image= arrayOf<Int>(R.drawable.indiaflag,R.drawable.us,R.drawable.uae)
    val description= arrayOf<String>("kkkkkkkkkkkkkkkkkkkk","abc","bb")
    val name= arrayOf<String>("mmmmmmmmmmmmmmmmmmmmmmmk","ll","fkm")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView=findViewById(R.id.list)
        customadapter=Customadapter(this,image,name,description)
        listView.adapter=customadapter







    }
}