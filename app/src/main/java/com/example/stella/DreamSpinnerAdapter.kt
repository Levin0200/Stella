package com.example.stella

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class DreamSpinnerAdapter (
    context: Context,
    private val items: List<DreamItem>
) : ArrayAdapter<DreamItem>(context, android.R.layout.simple_spinner_dropdown_item, items) {

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        return createView(position, convertView, parent)
    }

    override fun getDropDownView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View? {
        return createView(position, convertView, parent)
    }

    private fun createView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ) : View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.dream_spinner, parent, false)

        val img = view.findViewById<ImageView>(R.id.imgDreamItem)

        img.setImageResource(items[position].imageResId)
        return view
    }


}