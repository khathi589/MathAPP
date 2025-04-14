package vcmsa.nombulelo.mathapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //code start here
        //step 1 : access the elements
        //create all the value for the elements
        val edtInput = findViewById<EditText>(R.id.edtInput)
        val edtInput2 = findViewById<EditText>(R.id.edtInput2)
        val edtTotalValue = findViewById<EditText>(R.id.edtTextText3)
        val edtClickMe = findViewById<Button>(R.id.button)
        val edtSubtract = findViewById<Button>(R.id.edtsubtract)


        //Set click listener for the edtClickMe button
        edtClickMe.setOnClickListener {
            val number1 = edtInput.text.toString().toDoubleOrNull()
            val number2 = edtInput2.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                val totalValue = number1 + number2
                edtTotalValue.setText(totalValue.toString())
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
        //Set click listener for the edtSubtract button
        edtSubtract.setOnClickListener {
            val number1 = edtInput.text.toString().toDoubleOrNull()
            val number2 = edtInput2.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                val totalValue = number1 - number2
                edtTotalValue.setText(totalValue.toString())
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}











