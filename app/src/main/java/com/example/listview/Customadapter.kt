package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Customadapter(  context:  Context,val image:Array<Int>,val name:Array<String>, val description:Array<String> ):BaseAdapter() {
    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return name.size
    }

    override fun getItem(position: Int): Any {
        return name[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.list_row, parent, false)

        val textView: TextView
        val textView1: TextView
        val image1: ImageView
        textView = rowView.findViewById(R.id.textname)
        textView1 = rowView.findViewById(R.id.textname2)
        image1 = rowView.findViewById(R.id.image1)
        textView.text = name[position]
        image1.setImageResource(image[position])
        textView1.text = description[position]

        return rowView
    }
}




//    override fun getCount(): Int {
//            return name.size
//        }
// }





//    override fun getItem(position: Int): Any {
//        return name[position]
//    }
//
//    override fun getItemId(position: Int): Long {
//        return position.toLong()
//    }
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        val rowView = inflater.inflate(R.layout.list_row, parent, false)
//
//        val imageView: ImageView = rowView.findViewById(R.id.image1)
//
//        val textView: TextView = rowView.findViewById(R.id.textname)
//        val t: TextView = rowView.findViewById(R.id.textname2)
//
//        // imageView.image=name.get(position)
//
//        imageView.setImageResource(name[position])
//
//
//        textView.text = name.get(position)
//
//
//    }
//
//}

//class CustemAdapter(context: Context, val name: Array<String>,val surname:
// Array<String>): BaseAdapter() {