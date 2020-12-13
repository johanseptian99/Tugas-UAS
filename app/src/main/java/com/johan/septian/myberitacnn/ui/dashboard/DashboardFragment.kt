package com.johan.septian.myberitacnn.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.johan.septian.myberitacnn.R
import kotlinx.android.synthetic.main.fragment_dashboard.view.*

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dashboardViewModel =
                ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)

        root.cardCategoryNasional.setOnClickListener {
            Toast.makeText(context, "Membuka Berita Nasional", Toast.LENGTH_SHORT).show()
        }

        root.cardCategoryInternasional.setOnClickListener {
            Toast.makeText(context, "Membuka Berita Internasional", Toast.LENGTH_SHORT).show()
        }

        return root
    }
}