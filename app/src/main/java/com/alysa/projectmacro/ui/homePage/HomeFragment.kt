package com.alysa.projectmacro.ui.homePage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.alysa.projectmacro.ArticelActivity
import com.alysa.projectmacro.ParentingClass
import com.alysa.projectmacro.R
import com.alysa.projectmacro.databinding.FragmentHomeBinding
import com.alysa.projectmacro.konsultasiActivity
import com.alysa.projectmacro.notificationActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var konsultasi : Button
    private  lateinit var notifikasi : ImageButton
    private lateinit var encyclopedia : Button
    private lateinit var kelas : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
            _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        konsultasi = root.findViewById(R.id.konsultasi)
        notifikasi = root.findViewById(R.id.notification)
        encyclopedia = root.findViewById(R.id.artikel)
        kelas = root.findViewById(R.id.kelas)

        konsultasi.setOnClickListener {
            val intent = Intent(requireActivity(), konsultasiActivity::class.java)
            startActivity(intent)
        }

        notifikasi.setOnClickListener {
            val intent = Intent(requireActivity(), notificationActivity::class.java)
            startActivity(intent)
        }

        encyclopedia.setOnClickListener {
            val intent = Intent(requireActivity(), ArticelActivity::class.java)
            startActivity(intent)
        }

        kelas.setOnClickListener {
            val intent = Intent(requireActivity(), ParentingClass::class.java)
            startActivity(intent)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}