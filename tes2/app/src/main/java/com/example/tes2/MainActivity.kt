package com.example.tes2

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.tes2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
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
