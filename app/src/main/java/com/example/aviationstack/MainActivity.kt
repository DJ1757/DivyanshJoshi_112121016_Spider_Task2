package com.example.aviationstack

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val currentLocation = findViewById<EditText>(R.id.currentLocation)
        val destination=findViewById<EditText>(R.id.destination)
        val search=findViewById<Button>(R.id.search)
// ...


// Instantiate the RequestQueue.
        /*search.setOnClickListener{
           val intent = Intent(this, RecyclerView::class.java)
            startActivity(intent)*/
           /* val queue = Volley.newRequestQueue(this)

            val url = "http://api.aviationstack.com/v1/flights"
            val jsonObjectRequest=JsonObjectRequest(
                Request.Method.GET,url,null,
                Response.Listener { response ->
                    val url=response.getString("url")

                },
                Response.ErrorListener {
                    Toast.makeText(this,"No Flights Available",Toast.LENGTH_LONG).show()
                }
            )*/


       // }



// Request a string response from the provided URL.
       // val jsonRequest = JsonObjectRequest(
           /* Request.Method.GET, url,
            { response ->
                // Display the first 500 characters of the response string.
                currentLocation.text = "Response is: ${response.substring(0, 500)}"
            },
            { currentLocation.text = "No flights available" })*/

// Add the request to the RequestQueue.


// Access the RequestQueue through your singleton class.
       // MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)
    }
}