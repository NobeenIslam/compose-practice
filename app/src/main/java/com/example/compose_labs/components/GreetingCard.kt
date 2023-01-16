package com.example.compose_labs.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_labs.ui.theme.ComposelabsTheme
import androidx.compose.runtime.remember


@Composable
fun Greeting(name: String) {
    var expanded = remember  { mutableStateOf(false) }

    val extraPadding = if(expanded.value) 48.dp else 0.dp

    Surface(color = MaterialTheme.colors.secondaryVariant, modifier = Modifier.padding(4.dp)){
        Row(modifier = Modifier.padding(24.dp)){
            Column(modifier = Modifier
                .weight(1f).padding(bottom = extraPadding) ){
                Text(text = "Hello ", color = Color.White)
                Text(text = "$name!", color = Color.White)

            }
            Button(onClick = {
                expanded.value = !expanded.value
                             },
                modifier = Modifier.weight(weight = 1f, fill = true)) {
                Text(text = "Show More")

            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposelabsTheme {
        Greeting("Spock")
    }
}