package com.example.compose_labs

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_labs.components.CardScreen
import com.example.compose_labs.components.Greeting
import com.example.compose_labs.components.OnboardingScreen
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
    var navigateToScreen = remember { mutableStateOf(false) };

    if(navigateToScreen.value){
        var nickNames = listOf("Test","Test","Test","test");

        CardScreen(listOfNames = nickNames, onClickFn = {navigateToScreen.value=false})
    }else{
        OnboardingScreen(message = "Welcome to the best app ever", onClickFn = { navigateToScreen.value = true })

    }
}



@Preview(showBackground = true)
@Composable
fun AppPreview() {
    ComposelabsTheme {
        MyApp()
    }
}