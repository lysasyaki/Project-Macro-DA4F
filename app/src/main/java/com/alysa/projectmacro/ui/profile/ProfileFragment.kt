package com.alysa.projectmacro.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.alysa.projectmacro.EditProfile
import com.alysa.projectmacro.Language
import com.alysa.projectmacro.R
import com.alysa.projectmacro.Tearm
import com.alysa.projectmacro.databinding.FragmentProfileBinding
import com.alysa.projectmacro.login

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private lateinit var edit : Button
    private  lateinit var terms : Button
    private lateinit var language : Button
    private lateinit var logout : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root
        edit = root.findViewById(R.id.editProfileButton)
        terms = root.findViewById(R.id.termsButton)
        language = root.findViewById(R.id.languageButton)
    logout = root.findViewById(R.id.logoutButton)

    edit.setOnClickListener {
        val intent = Intent(requireActivity(), EditProfile::class.java)
        startActivity(intent)
    }

    terms.setOnClickListener {
        val intent = Intent(requireActivity(), Tearm::class.java)
        startActivity(intent)
    }

    language.setOnClickListener {
        val intent = Intent(requireActivity(), Language::class.java)
        startActivity(intent)
    }

    logout.setOnClickListener {
        val intent = Intent(requireActivity(), login::class.java)
        startActivity(intent)
    }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}