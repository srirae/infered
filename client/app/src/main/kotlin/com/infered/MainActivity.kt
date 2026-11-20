package com.infered


import android.os.Bundle

import androidx.activity.ComponentActivity

import androidx.activity.compose.setContent

import androidx.compose.material3.*

import androidx.compose.runtime.*


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent { MaterialTheme { Counter() } }

    }

}


@Composable

fun Counter() {

    var n by remember { mutableStateOf(0) }

    Button(onClick = { n++ }) { Text("Clicked - $n") }

}
