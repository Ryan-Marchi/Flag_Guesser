package com.example.flagguesser

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flagguesser.model.Question
import com.example.flagguesser.ui.theme.FlagGuesserTheme
import com.example.flagguesser.util.QuestionFactory

class QuizActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val gameOption = intent.getStringExtra("GAME_OPTION")?:"EU"
        val questionList = QuestionFactory.createQuestions(gameOption)

        setContent {
            FlagGuesserTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CreateQuestion(
                        questionList, modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CreateQuestion(questionList: List<Question>, modifier: Modifier = Modifier) {
    var currentQuestion by remember { mutableIntStateOf(0) }
    var buttonText by remember { mutableStateOf("Check") }
    var optionSelected by remember { mutableIntStateOf(-1) }
    var score by remember { mutableIntStateOf(0) }
    val context = LocalContext.current

    val scrollState = rememberScrollState()


    Column(
        modifier = modifier.fillMaxSize().padding(20.dp).verticalScroll(scrollState),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "What country is this flag from?",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            lineHeight = 30.sp,
            modifier = modifier
        )

        Image(
            painter = painterResource(questionList[currentQuestion].flagImage),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )

        Row(
            modifier = Modifier.padding(horizontal = 25.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            LinearProgressIndicator(
                progress = { (currentQuestion.toFloat() + 1) / questionList.size.toFloat() },
                modifier.weight(0.8f)
            )

            Spacer(modifier = Modifier.size(15.dp))

            Text(
                text = "${currentQuestion + 1}/${questionList.size}", fontSize = 15.sp
            )
        }

        QuestionOptions(
            questionList = questionList,
            currentQuestion = currentQuestion,
            optionSelected = optionSelected,
            buttonText = buttonText,
            onOptionSelected = { optionSelected = it },
        )

        Button(
            onClick = {
                when {
                    optionSelected == -1 -> {
                        Toast.makeText(context, "Please select an option", Toast.LENGTH_LONG).show()
                    }

                    buttonText == "Check" -> {
                        buttonText =
                            if (currentQuestion + 1 == questionList.size) "Finish" else "Next"
                        if (optionSelected == questionList[currentQuestion].correctAnswer) score++
                    }

                    buttonText == "Next" -> {
                        optionSelected = -1
                        buttonText = "Check"
                        currentQuestion++
                    }

                    buttonText == "Finish" -> {
                        val intent = Intent(context, ResultActivity::class.java).apply{
                            putExtra("RESULT_SCORE", score)
                            putExtra("QUESTION_SIZE", questionList.size)
                        }
                        context.startActivity(intent)
                        (context as Activity).finish()
                    }
                }
            }, modifier = modifier.size(300.dp, 50.dp)
        ) {
            Text(text = buttonText, fontSize = 20.sp)
        }
    }
}

@Composable
fun QuestionOptions(
    questionList: List<Question>,
    currentQuestion: Int,
    optionSelected: Int,
    buttonText: String,
    onOptionSelected: (Int) -> Unit
) {
    val currentQuestionData = questionList[currentQuestion]
    val optionBox = Modifier
        .padding(vertical = 10.dp)
        .size(width = 340.dp, height = 55.dp)
        .clip(RoundedCornerShape(10.dp))
        .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))

    for (i in 1..4) {
        val isSelected = i == optionSelected
        val optionText = currentQuestionData.options[i - 1]

        Box(modifier = optionBox
            .background(
                getBackgroundColor(
                    buttonText,
                    isSelected,
                    currentQuestionData,
                    i,
                )
            )
            .then(if (buttonText !in listOf("Next", "Finish")) {
                Modifier.clickable { onOptionSelected(i) }
            } else Modifier), contentAlignment = Alignment.Center) {
            Text(
                text = optionText,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                color = if (isSelected) Color.White else Color.Black
            )
        }
    }
}

@Composable
private fun getBackgroundColor(
    buttonText: String, isSelected: Boolean, currentQuestionData: Question, optionSelected: Int
): Color {
    return when {
        buttonText in listOf(
            "Next", "Finish"
        ) && currentQuestionData.correctAnswer == optionSelected -> {
            Color.Green
        }

        buttonText in listOf("Next", "Finish") && isSelected -> {
            Color.Red
        }

        isSelected -> Color.Black
        else -> Color.White
    }
}
