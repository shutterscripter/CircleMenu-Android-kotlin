package com.jayesh.circularmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.hitomi.cmlibrary.CircleMenu


class MainActivity : AppCompatActivity() {
    lateinit var cmMain: CircleMenu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cmMain = findViewById(R.id.cmMain)

        //adding main menu
        cmMain.setMainMenu(Color.parseColor("#000000"), R.drawable.ic_menu, R.drawable.ic_cancel)

        //adding submenus
        cmMain.addSubMenu(Color.parseColor("#00AF91"), R.drawable.ic_home)
        cmMain.addSubMenu(Color.parseColor("#007965"), R.drawable.ic_favourite)
        cmMain.addSubMenu(Color.parseColor("#F58634"), R.drawable.ic_contact)
        cmMain.addSubMenu(Color.parseColor("#FFCC29"), R.drawable.ic_info)

        //adding click listeners to menu items
        cmMain.setOnMenuSelectedListener { it ->
            when (it) {
                0 -> Toast.makeText(this, "This is Home!", Toast.LENGTH_SHORT).show()

                1 -> Toast.makeText(this, "This is Favourite", Toast.LENGTH_SHORT).show()

                2 -> Toast.makeText(this, "This is Contact", Toast.LENGTH_SHORT).show()

                3 -> Toast.makeText(this, "This is About", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
