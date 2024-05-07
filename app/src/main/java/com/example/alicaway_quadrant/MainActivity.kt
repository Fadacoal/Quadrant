package com.example.alicaway_quadrant

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.alicaway_quadrant.ui.theme.Alicaway_quadrantTheme

// Define the Greeting function here
@Composable
fun Greeting() {
    // Add your content for the greeting here
    Text( text = "Test input" )
}

@Composable
fun QuadrantScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(.5f)
        ) {
            Column(modifier = Modifier
                .background(Color.Green)
                .fillMaxSize()
                .weight(.5f)) {
                Greeting()
            }

            Column(modifier = Modifier
                .background(Color.Red)
                .fillMaxSize()
                .weight(.5f)) {
                Greeting()
            }
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(.5f)
        ) {
            AnotherColumn("test 3",modifier = Modifier
                .background(Color.Blue)
                .weight(.5f))

            AnotherColumn("test 4" ,modifier = Modifier
                .background(Color.Yellow)
                .weight(.5f))
        }
    }
}

@Composable
fun AnotherColumn(text: String, modifier: Modifier){

    Column(modifier = modifier
            .fillMaxSize()){
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantScreenPreview() {
    Alicaway_quadrantTheme {
        QuadrantScreen()
    }
}