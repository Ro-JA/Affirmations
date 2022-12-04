package com.example.android.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.affirmations.R
import com.example.android.affirmations.model.Affirmation

/*** создали класс адаптер с раширеним из класса  RecyclerView.Adapter
 * который принмаета аргументы context и  dataset(наш список из класса Datasource)
 */
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    /***   создали класс который предстовляе один элемент из нашего сиска
     * с раширение из класса RecyclerView.ViewHolder в который принимает
     * в параметры нашу вьюшку которую мы находим
     * через view.findViewById(R.id.item_title)
      */
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }
    //в том классе надо реализвоать три метода
    //Это метод надывает нашу вьюшку и возращает ее
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }
// это метод принимает парметр нашу вьюшку и на каокй позиций она находиться и ложит в нее даные
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }
// это метод возращает размер нашего списка для того что бы viewHolder знал сколько элементов создовать
    override fun getItemCount() = dataset.size
    }
