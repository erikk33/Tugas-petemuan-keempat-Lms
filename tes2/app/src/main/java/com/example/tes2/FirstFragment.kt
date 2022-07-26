package com.example.tes2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tes2.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



fun main (Args : Array<String>) {
    println("------------------------------------------------------------------------------")
    print("Hello user ^^^^^^^^^^^^^^^^^^______^^^^^")
    println("Silahkan diiisi Biodata berikut ini")
    println("Have A nice day")
    println("Now loading")
    println("10%")
    println("100%")
    println("Completed")

    //input
    print("Nama : ")
    var kimiNamae = readLine()
    print("Tanggal Lahir : ")
    var tanggalLahir = readLine()
    print("Tempat lahir : ")
    var tempatLahir = readLine()
    print("Hobi : ")
    var hobiKamu = readLine()
    print("Alamat : ")
    var alamatKamu = readLine()
    print("Kesukaan : ")
    var kesukaan = readLine()

    //output
    var tesout = """
    ~~~~~~~~System checking data~~~~~~~~~~~~~~~~~
    ~~~~~~~~No Eror~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~Procesesing data~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~10 %~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~50 %---------------------------------
    ~~~~~~~~100 %--------------------------------
    Yourname = $kimiNamae
    Tanggal lahir = $tanggalLahir
    Tempat lahir = $tempatLahir
    Hobi = $hobiKamu
    Alamat = $alamatKamu
    Kesukaan = $kesukaan
    """
    print(tesout)
}}
