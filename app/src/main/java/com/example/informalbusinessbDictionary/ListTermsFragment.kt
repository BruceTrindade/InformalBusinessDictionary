package com.example.informalbusinessbDictionary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.InformalBusinessDictionary.R
import kotlinx.android.synthetic.main.list_terms.*

class ListTermsFragment : Fragment(R.layout.list_terms) {

    private lateinit var termsAdapter: TermsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
        addDataSource()
    }

    private fun addDataSource() {
        val dataSource = DataSource.createData()
        this.termsAdapter.setData(dataSource)
    }

    private fun setupAdapter() {
        this.termsAdapter = TermsAdapter { term ->
            val teste = "teste"
            val actions = ListTermsFragmentDirections.firstDestinationToTranslateTermDialog(term.translate)
            findNavController().navigate(actions)
        }
        termsRecyclerView.layoutManager = LinearLayoutManager(context)
        termsRecyclerView.adapter = this.termsAdapter
    }

}