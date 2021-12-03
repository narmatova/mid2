package kg.kamila.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nazzzzz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nazzzzz)
        val button = findViewById<Button>(R.id.Button)

        button.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}