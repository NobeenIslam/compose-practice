package com.example.compose_labs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_labs.ui.theme.ComposelabsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposelabsTheme {
                    MyApp()
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier){
    // A surface container using the 'background' color from the theme
    var nickNames: List<String> = listOf("Beans","Shmeans")
        Column() {
            for (nickName in nickNames){
                Greeting(nickName)
            }
        }
}

@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.secondary){
        Column(modifier = Modifier.padding(24.dp)){
            Text(text = "Hello ")
            Text(text = "$name!")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposelabsTheme {
        MyApp()
    }
}