package com.example.InformalBusinessDictionary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InformalBusinessDictionary.Models.Terms
import kotlinx.android.synthetic.main.row_layout_term.view.*

class TermsAdapter(private val onItemClicked : (Terms) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<Terms> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return TermsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_layout_term, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder) {
            is TermsViewHolder -> {
                holder.bind(items[position], onItemClicked)
            }
        }
    }

    override fun getItemCount(): Int {
       return items.size
    }

    fun setData(term: List<Terms>){
        this.items = term
        this.items = term
        this.items = term
    }

    class TermsViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        private val termTitle = itemView.term_title
        private val termTranslate = itemView.term_translate

        fun bind(terms: Terms, onItemClicked : (Terms) -> Unit) {

            termTitle.text = terms.term
            termTranslate.text = terms.translate

            itemView.setOnClickListener{
                onItemClicked(terms)
            }


        }

    }

}