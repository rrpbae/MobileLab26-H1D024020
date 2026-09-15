package com.pemmob.rajendraranggapriyatama.data.dummy

import com.pemmob.rajendraranggapriyatama.data.model.Category
import com.pemmob.rajendraranggapriyatama.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        // Makanan
        Product(id = 1, category_id = 1, category = categories[0], name = "Kripik Singkong", description = "Kripik gurih", price = 15000.0, stock = 20, img = "dummy_product"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Mendoan", description = "Mendoan Asli Banyumas", price = 20000.0, stock = 15, img = "dummy_product"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Sale Pisang", description = "Sale manis", price = 25000.0, stock = 30, img = "dummy_product"),
        Product(id = 4, category_id = 1, category = categories[0], name = "Getuk Goreng", description = "Getuk khas", price = 30000.0, stock = 40, img = "dummy_product"),
        Product(id = 5, category_id = 1, category = categories[0], name = "Nopia", description = "Nopia rasa coklat", price = 35000.0, stock = 50, img = "dummy_product"),

        // Minuman
        Product(id = 6, category_id = 2, category = categories[1], name = "Es Badeg", description = "Segar bugar", price = 10000.0, stock = 20, img = "dummy_product"),
        Product(id = 7, category_id = 2, category = categories[1], name = "Kopi Banyumas", description = "Kopi lokal", price = 15000.0, stock = 15, img = "dummy_product"),
        Product(id = 8, category_id = 2, category = categories[1], name = "Wedang Jahe", description = "Jahe anget", price = 12000.0, stock = 30, img = "dummy_product"),
        Product(id = 9, category_id = 2, category = categories[1], name = "Teh Poci", description = "Teh poci", price = 15000.0, stock = 40, img = "dummy_product"),
        Product(id = 10, category_id = 2, category = categories[1], name = "Jamu Beras Kencur", description = "Jamu sehat", price = 10000.0, stock = 50, img = "dummy_product"),

        // Kerajinan
        Product(id = 11, category_id = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu lantai", price = 20000.0, stock = 20, img = "dummy_product"),
        Product(id = 12, category_id = 3, category = categories[2], name = "Sandal Bandol", description = "Sandal kuat", price = 35000.0, stock = 15, img = "dummy_product"),
        Product(id = 13, category_id = 3, category = categories[2], name = "Batik Banyumasan", description = "Batik lokal", price = 150000.0, stock = 30, img = "dummy_product"),
        Product(id = 14, category_id = 3, category = categories[2], name = "Kerajinan Bambu", description = "Kerajinan tangan", price = 50000.0, stock = 40, img = "dummy_product"),
        Product(id = 15, category_id = 3, category = categories[2], name = "Tas Rajut", description = "Tas wanita rajut", price = 75000.0, stock = 50, img = "dummy_product")
    )
}