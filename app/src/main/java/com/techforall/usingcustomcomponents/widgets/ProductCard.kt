package com.techforall.usingcustomcomponents.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.squareup.picasso.Picasso
import com.techforall.usingcustomcomponents.R
import com.techforall.usingcustomcomponents.model.Product
import kotlinx.android.synthetic.main.product_card_layout.view.*

public class ProductCard  @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.product_card_layout, this, true)
        orientation = VERTICAL
    }

    fun displayProduct(product: Product) {

        Picasso.get()
            .load(product.imageUrl)
            .into(productImageView);
    }
}