package com.example.demo.ui.notifications


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R

class NotificationsFragment : Fragment() {

    private val viewModel: NotificationsViewModel by viewModels()
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NotificationAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_notifications, container, false)
        recyclerView = view.findViewById(R.id.rvNotifications)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        viewModel.notifications.observe(viewLifecycleOwner) { list ->
            adapter = NotificationAdapter(list)
            recyclerView.adapter = adapter
        }

        return view
    }
}
