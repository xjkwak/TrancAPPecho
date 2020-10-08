package com.xjkwak.trancappecho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onPlaceOrderButtonClicked(view: View) {

        var trancaSizePrice = 0.0
        var toppingTotal = 0.0

        // Calculating tranca price based on its size
        when {
            smalltranca.isChecked -> trancaSizePrice = 5.0
            mediumtranca.isChecked -> trancaSizePrice = 10.0
            largetranca.isChecked -> trancaSizePrice = 15.0
        }

        // Adding extra topping
        if (tomato.isChecked) {
            toppingTotal += 1
        }

        if (onion.isChecked) {
            toppingTotal += 2
        }

        if (pepper.isChecked) {
            toppingTotal += 3
        }

        val totalPrice = trancaSizePrice + toppingTotal

        totalprice.text = "Precio total de la orden: $totalPrice Bs."
    }
}