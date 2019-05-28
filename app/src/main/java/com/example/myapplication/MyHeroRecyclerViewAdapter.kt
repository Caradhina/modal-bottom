package com.example.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide


//import com.example.myapplication.HeroFragment.OnListFragmentInteractionListener
import kotlinx.android.synthetic.main.fragment_hero.view.*


class MyHeroRecyclerViewAdapter(
    private var mValues: List<HeroFragment.Hero>,
    private val mContext: Context
) : RecyclerView.Adapter<MyHeroRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_hero, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]

        holder.mName.text = item.name
        holder.mGender.text = item.gender
        holder.mPower.text = item.power.toString()
        Glide.with(mContext).load(item.imgUrl).into(holder.mImage)
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mImage: ImageView = mView.imageView
        val mName: TextView = mView.textViewName
        val mGender: TextView = mView.textViewGender
        val mPower: TextView = mView.textViewPower

    }
}
