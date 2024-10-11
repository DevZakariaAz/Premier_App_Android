package com.example.carte_de_visite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CarteVisit : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = colorScheme.background
            ) {
                GreetingImage()
            }
        }
    }
}

@Composable
fun GreetingImage() {
    Box(modifier = Modifier.fillMaxSize()) {
        val backgroundImage = painterResource(R.drawable.mosquee_oujda)
        Image(
            painter = backgroundImage,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        val transparentColor = Color(0x80FFFFFF) // 50% transparent white
        Box(
            modifier = Modifier
                .padding(16.dp)
                .border(
                    width = 2.dp,
                    color = Color.Gray,
                    shape = RoundedCornerShape(16.dp)
                )
                .background(
                    color = transparentColor,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp)
                .align(Alignment.Center)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                val foregroundImage = painterResource(R.drawable.oujda_jama3)
                Image(
                    painter = foregroundImage,
                    contentDescription = null,
                    modifier = Modifier.size(150.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                CarteDeVisitContent(city = "Oujda")
            }
        }
    }
}

@Composable
fun CarteDeVisitContent(modifier: Modifier = Modifier, city: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = "City is $city",
            modifier = modifier.padding(8.dp),
            fontSize = 24.sp,
            lineHeight = 30.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Oujda is the capital city of the Oriental region, Morocco",
            fontSize = 18.sp,
            modifier = modifier.padding(4.dp)
        )
        Text(
            text = "Mohammed VI Mosque Oujda, Morocco",
            fontSize = 16.sp,
            modifier = modifier.padding(4.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CarteDeVisitPreview() {
    GreetingImage()
}
