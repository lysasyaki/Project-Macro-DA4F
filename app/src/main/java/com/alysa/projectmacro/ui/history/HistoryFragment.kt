package com.alysa.projectmacro.ui.history

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.alysa.projectmacro.R
import com.alysa.projectmacro.databinding.FragmentHistoryBinding
import com.alysa.projectmacro.databinding.FragmentProfileBinding
import com.alysa.projectmacro.notificationActivity

class HistoryFragment : Fragment() {

    private var _binding: FragmentHistoryBinding? = null
    private val binding get() = _binding!!
    private  lateinit var notifikasi : ImageButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHistoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        notifikasi = root.findViewById(R.id.notification)

        notifikasi.setOnClickListener {
            val intent = Intent(requireActivity(), notificationActivity::class.java)
            startActivity(intent)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}