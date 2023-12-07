package com.example.datahub.investments.investmentlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.datahub.investments.dto.InvestmentDTO
import com.example.datahub.R

class InvestmentListAdapter(private val investmentData: List<InvestmentDTO>) :
    RecyclerView.Adapter<InvestmentListAdapter.ViewHolder>() {


        class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
            var investmentName : TextView

            init {
                investmentName = view.findViewById(R.id.tv_investment_name)

            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.investment_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = investmentData[position]
        holder.investmentName.text = item.bankName
    }



    override fun getItemCount() = investmentData.size

}