package com.example.compose_labs.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_labs.ui.theme.ComposelabsTheme

@Composable
fun CardScreen(listOfNames: List<String>){
    Column(){
        for (name in listOfNames){
            Greeting(name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardScreenPreview() {
    ComposelabsTheme {
        CardScreen(listOf("test","test","test"))
    }
}