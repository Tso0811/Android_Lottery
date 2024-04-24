package tso.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv: TextView = findViewById(R.id.number)
        txv.text = "0"

    }
    fun main(v: View){
        var txv: TextView = findViewById(R.id.number)
        txv.text = (1..100).random().toString()
    }
}