package com.example.birthdayapp
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.sp
//import com.example.birthdayapp.ui.theme.BirthdayAppTheme
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.text.style.TextAlign
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            BirthdayAppTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        message = "Happy Birthday Fahd",
//                        modifier = Modifier.padding(innerPadding),
//                        from = "From Zakaria"
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(message: String, modifier: Modifier = Modifier,from:String) {
//    Column(
//        verticalArrangement = Arrangement.Center,
//        modifier=modifier) {
//        Text(
//        text = "Happy Birthday $message!",
//        modifier = Modifier ,
//        fontSize = 26.sp,
//        textAlign = TextAlign.Center
//        )
//        Text(
//            text = from,
//            fontSize = 16.sp,
//            modifier = Modifier
//                .padding(16.dp)
//                .align(alignment = Alignment.End)
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun BirthdayCardPreview() {
//    BirthdayAppTheme {
//        Greeting("Fahd" ,from = "From Zakaria")
//    }
//}


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdayapp.ui.theme.BirthdayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        message = "Fahd",
                        from = "From Zakaria",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = "Happy Birthday $message!",
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayAppTheme {
        GreetingText(message = "Fahd", from = "From Zakaria")
    }
}