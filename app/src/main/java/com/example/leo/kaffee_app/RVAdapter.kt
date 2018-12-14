package com.example.leo.kaffee_app

import android.content.Intent
import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.contact_list_item.view.*


class RVAdapter(private val list:List<Person>) : RecyclerView.Adapter<RVAdapter.PersonViewHolder>() {

    override fun onBindViewHolder(personViewHolder: PersonViewHolder, position: Int) {
        personViewHolder.personName.text = list.get(position).name
        personViewHolder.personPhoto.setImageResource(list.get(position).photoId)
        personViewHolder.itemView.setOnClickListener {
            it.context.startActivity(Intent(it.context, SelectScreenActivity::class.java).putExtra("photo",list.get(position).photoId))
            //list.get(position).photoId
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): PersonViewHolder {
        val v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_list_item, viewGroup, false)
        return PersonViewHolder(v)
    }

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var personName: TextView
        internal var personPhoto: ImageView

        init {
            personName = itemView.findViewById(R.id.person_name)
            personPhoto = itemView.findViewById(R.id.person_photo) as ImageView
        }


    }


}

