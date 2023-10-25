package com.example.tugaspertemuan8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_exit -> {
                val intentToStartActivity = Intent(this@HomeActivity, StartActivity::class.java)
                startActivity(intentToStartActivity)
                true // Mengembalikan `true` untuk menunjukkan bahwa penanganan sudah selesai
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}