package com.example.compose_labs.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_labs.ui.theme.ComposelabsTheme

@Composable
fun CardScreen(listOfNames: List<String>, onClickFn:()-> Unit){
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        for (name in listOfNames){
            Greeting(name)
        }
        Button(onClick = { onClickFn()} ){
            Text(text = "Go Back")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun CardScreenPreview() {
    ComposelabsTheme {
        CardScreen(listOf("test","test","test"), onClickFn = {})
    }
}