package com.techforall.usingcustomcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techforall.usingcustomcomponents.model.Product
import com.techforall.usingcustomcomponents.model.Skill
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val skill = Skill("Mobile dev", "Android, iOS, Spring boot")
        val card = skillCard
        card.loadSkill(skill)

        loadProducts();
    }

    private fun loadProducts() {

        val p1 = Product("Beans", 23.0, "Veg", "https://images.heb.com/is/image/HEBGrocery/prd-small/fresh-jazz-apples-000375130.jpg")
        val p2 = Product("Beans", 23.0, "Veg", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F389250.jpg")

        product_one.displayProduct(p1)
        product_two.displayProduct(p2)
    }
}