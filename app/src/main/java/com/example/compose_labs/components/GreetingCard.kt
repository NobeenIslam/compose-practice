package com.example.compose_labs.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_labs.ui.theme.ComposelabsTheme

@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.secondary, modifier = Modifier.padding(4.dp)){
        Column(modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()){
            Text(text = "Hello ")
            Text(text = "$name!")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposelabsTheme {
        Greeting("Spock")
    }
}