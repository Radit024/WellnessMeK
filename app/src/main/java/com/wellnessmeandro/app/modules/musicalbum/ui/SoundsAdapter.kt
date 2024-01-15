package com.wellnessmeandro.app.modules.musicalbum.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.databinding.RowSoundsBinding
import com.wellnessmeandro.app.modules.musicalbum.`data`.model.SoundsRowModel
import kotlin.Int
import kotlin.collections.List

class SoundsAdapter(
  var list: List<SoundsRowModel>
) : RecyclerView.Adapter<SoundsAdapter.RowSoundsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSoundsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sounds,parent,false)
    return RowSoundsVH(view)
  }

  override fun onBindViewHolder(holder: RowSoundsVH, position: Int) {
    val soundsRowModel = SoundsRowModel()
    // TODO uncomment following line after integration with data source
    // val soundsRowModel = list[position]
    holder.binding.soundsRowModel = soundsRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SoundsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: SoundsRowModel
    ) {
    }
  }

  inner class RowSoundsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSoundsBinding = RowSoundsBinding.bind(itemView)
  }
}
