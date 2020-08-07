package com.example.androidtextviewnedittext

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val number1EditText = findViewById<EditText>(R.id.editText_first_number)
        val number1Value = number1EditText.text


        val number2EditText = findViewById<EditText>(R.id.editText_second_number)
        val number2Value = number2EditText.text

        val resultEditor = findViewById<EditText>(R.id.editText_result)

        val buttonAdd = findViewById<Button>(R.id.button_add)
        buttonAdd.setOnClickListener(){

            val result : Int = number1Value.toString().toInt()

            resultEditor.setText(result)


        }

        val buttonSub = findViewById<Button>(R.id.button_sub)
        buttonSub.setOnClickListener(){

        }

        val buttonMul = findViewById<Button>(R.id.button_mul)
        buttonMul.setOnClickListener(){

        }

        val buttonDiv = findViewById<Button>(R.id.button_div)
        buttonDiv.setOnClickListener(){

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
}