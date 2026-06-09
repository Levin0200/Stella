package com.example.stella

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView

class CharacterAdapter(
    context: Context,
    private val items: List<CharacterItem>
) : ArrayAdapter<CharacterItem>(context, 0, items) {

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
    ): View {
        return createView(position, convertView, parent)
    }

    private fun createView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_character, parent, false)

        val imgCharacter =
            view.findViewById<ImageView>(R.id.imgCharacter)

        imgCharacter.setImageResource(
            items[position].imageResId
        )


        return view
    }
}