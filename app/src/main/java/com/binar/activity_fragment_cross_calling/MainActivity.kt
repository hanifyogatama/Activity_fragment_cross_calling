package com.binar.activity_fragment_cross_calling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loadFragment(This_Fragment())
        btn_activity.setOnClickListener {
            var fragment = supportFragmentManager.findFragmentById(fl_container.id) as This_Fragment
            fragment.fragmentToast()
        }
    }

    fun activityToast() {
        Toast.makeText(this, "Dijalankan dari Activity", Toast.LENGTH_SHORT).show()
    }

    private fun loadFragment(fragmentPart: This_Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(fl_container.id, fragmentPart)
            .commit()
    }
}