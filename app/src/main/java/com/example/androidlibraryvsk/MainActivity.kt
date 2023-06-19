package com.example.androidlibraryvsk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlibraryvsk.databinding.ActivityMainBinding
import com.example.text_style.textViewStyle

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textViewStyle(binding.textView, "#2c7ef2")
//        setContent {
//        bind    AndroidLibraryVSKTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    AndroidLibraryVSKTheme {
//        Greeting("Android")
//    }
//}