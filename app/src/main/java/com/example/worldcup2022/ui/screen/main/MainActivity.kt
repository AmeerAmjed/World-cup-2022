package com.example.worldcup2022.ui.screen.main

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.worldcup2022.ui.screen.main.composable.AppBar
import com.example.worldcup2022.ui.theme.WorldCup2022Theme

class MainActivity : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorldCup2022Theme {
                Main()
            }
        }
    }
}

@Composable
fun Main() {
    MainContent()
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent() {
    Scaffold(
        topBar = {
            AppBar()

        },
    ) {

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WorldCup2022Theme {
        Main()
    }
}