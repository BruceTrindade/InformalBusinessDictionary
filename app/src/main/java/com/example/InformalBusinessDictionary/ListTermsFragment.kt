package com.example.InformalBusinessDictionary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
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
            findNavController().navigate(R.id.firstDestinationToTranslateTermDialog)
        }
        termsRecyclerView.layoutManager = LinearLayoutManager(context)
        termsRecyclerView.adapter = this.termsAdapter
    }

}