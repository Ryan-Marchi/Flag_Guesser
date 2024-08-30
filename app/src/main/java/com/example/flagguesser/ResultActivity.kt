package com.example.flagguesser

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flagguesser.ui.theme.FlagGuesserTheme

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val result = intent.getIntExtra("RESULT_SCORE", 0)
        val questionSize = intent.getIntExtra("QUESTION_SIZE", 0)

        setContent {
            FlagGuesserTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        Modifier
                            .padding(innerPadding)
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            modifier = Modifier.padding(innerPadding),
                            text = "Congratulations!",
                            fontSize = 24.sp
                        )
                        Image(
                            modifier = Modifier.padding(innerPadding),
                            painter = painterResource(id = R.drawable.trophy),
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.padding(innerPadding),
                            text = "Result",
                            fontSize = 24.sp
                        )
                        Text(
                            modifier = Modifier.padding(20.dp),
                            textAlign = TextAlign.Center,
                            text = "You got $result out of $questionSize correct answer",
                            fontSize = 24.sp,
                            lineHeight = 24.sp
                        )
                        Button(modifier = Modifier
                            .padding(innerPadding)
                            .size(300.dp, 50.dp),
                            onClick = {
                                val intent = Intent(this@ResultActivity, MenuActivity::class.java)
                                startActivity(intent)
                                finish()
                            }) {
                            Text(
                                fontSize = 24.sp,
                                text = "Finish",
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}