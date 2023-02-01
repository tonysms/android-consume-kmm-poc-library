package com.coxauto.consumekmmpoclibrary

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.R
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.coxauto.androidlibrary.LibraryMainActivity
import com.coxauto.consumekmmpoclibrary.ui.theme.ConsumekmmpoclibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConsumekmmpoclibraryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Button( onClick = { onClick() },
                        //modifier = Modifier.fillMaxWidth(),
                    ) {
                        Text("Test Click")
                }
            }
        }
    }
}

    private fun onClick() {
        Log.e("xx","click!")
        startActivity(Intent(this, LibraryMainActivity::class.java))
    }
}