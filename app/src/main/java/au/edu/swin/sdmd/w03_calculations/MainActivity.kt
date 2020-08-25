package au.edu.swin.sdmd.w03_calculations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)



        val equals = findViewById<Button>(R.id.equals)
        equals.setOnClickListener { _ ->
            val result = add(number1.text.toString(), number2.text.toString())
            equals.setText(result.toString())
            // TODO: show result on the screen
        }
    }

    // adds two numbers together
    private fun add(number1: String, number2: String) = number1.toInt() + number2.toInt()

}