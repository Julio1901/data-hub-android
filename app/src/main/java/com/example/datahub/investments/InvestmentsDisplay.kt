package com.example.datahub.investments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.datahub.R
import com.example.datahub.investments.dto.InvestmentDTO
import com.example.datahub.investments.investmentlist.InvestmentListAdapter
import com.example.datahub.investments.network.InvestmentService
import com.example.datahub.investments.network.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


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



        val recyclerView: RecyclerView = view.findViewById(R.id.investment_list)
        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager



        lifecycleScope.launch(Dispatchers.Main) {
           val response = RetrofitInstance.api.getAllInvestments().body()

            response?.let {
                val adapter = InvestmentListAdapter(it)
                recyclerView.adapter = adapter

            }

        }






    }
}