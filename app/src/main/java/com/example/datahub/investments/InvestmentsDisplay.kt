package com.example.datahub.investments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.datahub.R
import com.example.datahub.investments.dto.InvestmentDTO
import com.example.datahub.investments.investmentlist.InvestmentListAdapter


class InvestmentsDisplay : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return  inflater.inflate(R.layout.fragment_investments_display, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mockInvestmentList = listOf(
            InvestmentDTO("CDI", 1000.00f, "Nubank", "Fixed"),
            InvestmentDTO("CDI", 1000.00f, "Nubank", "Fixed"),
            InvestmentDTO("CDI", 1000.00f, "Nubank", "Fixed"),
            InvestmentDTO("CDI", 1000.00f, "Nubank", "Fixed"),)


        val recyclerView: RecyclerView = view.findViewById(R.id.investment_list)
        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager

        val adapter = InvestmentListAdapter(mockInvestmentList)
        recyclerView.adapter = adapter






    }



}