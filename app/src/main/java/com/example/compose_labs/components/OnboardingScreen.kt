package com.example.compose_labs.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_labs.ui.theme.ComposelabsTheme

@Composable
fun OnboardingScreen(message:String, onClickFn: ()-> Unit){
    Surface(color = Color.White, modifier = Modifier.fillMaxSize()){
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = message, textAlign = TextAlign.Center, color = Color.Black, modifier = Modifier.padding(bottom = 3.dp))
            Button(onClick = { onClickFn() },) {
               Text("Enter the dungeon")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun OnboardingPreview() {
    ComposelabsTheme {
        OnboardingScreen("Welcome to the most awesome app ever", onClickFn = { })
    }
}