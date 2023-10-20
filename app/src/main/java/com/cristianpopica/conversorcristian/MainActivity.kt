package com.cristianpopica.conversorcristian

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cristianpopica.conversorcristian.ui.theme.ConversorCristianTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConversorCristianTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content()
                }
            }
        }
    }
}

@Composable
fun Content() {
    val yellow  = 0xFFEFFD100
    val blue = 0xFFE0020eb
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Conversor de numeros",
            fontSize = 30.sp
        )
        Column {
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Text(
                    text = "Numero aleatorio",
                    fontSize = 27.sp
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(blue)
                )
            ) {
                Text(text = "Generar numero aleatorio")
            }


        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Text(text = "Convertir a hexadecimal", fontSize = 19.sp)
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Convertir a binario", fontSize = 19.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(yellow)
                )
            ) {
                Text(text = "Convertir")
            }
            Spacer(modifier = Modifier.width(70.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(yellow)
                )
            ) {
                Text(text = "Convertir")
            }
        }

    }
    
    
    
    

}