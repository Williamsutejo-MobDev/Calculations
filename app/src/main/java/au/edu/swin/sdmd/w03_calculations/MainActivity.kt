package au.edu.swin.sdmd.w03_calculations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var operator = "plus"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        val answer =  findViewById<TextView>(R.id.answer)



        val equals = findViewById<Button>(R.id.equals)
        equals.setOnClickListener { _ ->
            val result = when (operator) {
                "plus" -> add(number1.text.toString(), number2.text.toString())
                "mult" -> mult(number1.text.toString(), number2.text.toString())
                else -> add(number1.text.toString(), number2.text.toString())

            }
            // TODO: show result on the screen
            answer.setText(result.toString())
        }


    }
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.getId()) {
                R.id.RadioPlus ->
                    if (checked){
                        operator = "plus"
                    }

                R.id.RadioMult ->
                    if (checked){
                        operator = "mult"
                    }
            }
        }
    }
    // adds two numbers together
    private fun add(number1: String, number2: String) = number1.toInt() + number2.toInt()
    private fun mult(number1: String, number2: String) = number1.toInt() * number2.toInt()

}