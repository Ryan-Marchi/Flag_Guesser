package com.example.flagguesser

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flagguesser.ui.theme.FlagGuesserTheme

data class ButtonData(val gameOption: String, val text: String)

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val buttonData = listOf(
            ButtonData("AT", "Antarctica"),
            ButtonData("AI", "Asia"),
            ButtonData("AF", "Africa"),
            ButtonData("AU", "Oceania"),
            ButtonData("EU", "Europe"),
            ButtonData("NA", "North America"),
            ButtonData("SA", "South America"),
            ButtonData("WO", "World")
        )
        setContent {
            FlagGuesserTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        Modifier.fillMaxSize()
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(10.dp),
                            text = "Fossly",
                            fontStyle = FontStyle.Italic,
                            fontSize = 20.sp,
                        )
                        Text(
                            modifier = Modifier
                                .padding(25.dp),
                            text = "Flag Guesser",
                            fontStyle = FontStyle.Italic,
                            fontSize = 25.sp,
                        )

                        buttonData.forEach { data ->
                            Button(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .size(300.dp, 50.dp),
                                onClick = {
                                    startGame(data.gameOption)
                                }
                            ) {
                                Text(
                                    fontSize = 24.sp,
                                    text = data.text,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    private fun startGame(gameSelected: String = "FLAG") {
        val intent = Intent(this@MenuActivity, QuizActivity::class.java).apply {
            putExtra("GAME_OPTION", gameSelected)
        }
        startActivity(intent)
        finish()
    }
}
