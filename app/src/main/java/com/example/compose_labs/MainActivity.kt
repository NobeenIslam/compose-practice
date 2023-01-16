package com.example.compose_labs

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_labs.components.Greeting
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
    var nickNames = listOf("Test","Stest","Test","test")

        Column(){
            for (nickName in nickNames){
                Greeting(nickName)
            }
        }

}



@Preview(showBackground = true)
@Composable
fun AppPreview() {
    ComposelabsTheme {
        MyApp()
    }
}