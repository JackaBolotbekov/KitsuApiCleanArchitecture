package com.example.kitsuapicleanarchitecture.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kitsuapicleanarchitecture.databinding.ItemAnimeBinding
import com.example.kitsuapicleanarchitecture.domain.models.anime.main.DataItem
import com.example.kitsuapicleanarchitecture.presentation.models.anime.main.DataItemUI

class AnimeAdapter :
    ListAdapter<DataItem, AnimeAdapter.AnimeViewHolder>(diffUtil) {

    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: DataItem) {
            Glide.with(binding.ivImage.context)
                .load(item.attributes.posterImage.original)
                .into(binding.ivImage)
            binding.tvName.text = item.attributes.titles.enJp
        }

        init {
            itemView.setOnClickListener {
                getItem(bindingAdapterPosition)?.apply {
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let {
            holder.onBind(it)
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<DataItem>() {
            override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
                return oldItem.attributes.titles == newItem.attributes.titles
            }

            override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
                return oldItem == newItem
            }
        }
    }
}