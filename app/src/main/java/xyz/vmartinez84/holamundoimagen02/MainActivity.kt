package xyz.vmartinez84.holamundoimagen02

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

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
        //1 enlazar el control con el código
        val imageView = findViewById<ImageView>(R.id.imageView)

        //2 Recurso
        val url = "https://images.pexels.com/photos/20791380/pexels-photo-20791380.jpeg"

        //3 Cargarlo con la libreria y enlzarlo a la imagen
        Glide.with(this).load(url).into(imageView)
    }
}