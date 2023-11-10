package com.example.preguntas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.preguntas.ui.theme.PreguntasTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreguntasTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = "MainMenu") {
                    composable("MainMenu") {
                        MainMenu(navController = navController)
                    }
                    composable("question") {
                        QuestionScreen(navController)
                    }
                    composable("statistics") {
                        StatisticsScreen(navController)
                    }
                }
            }
        }
    }
}
@Composable
fun MainMenu(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Menú Principal", style = MaterialTheme.typography.titleMedium)

        Button(
            onClick = {
                navController.navigate("question")
            }
        ) {
            Text("Jugar")
        }

        Button(
            onClick = {
                navController.navigate("statistics")
            }
        ) {
            Text("Estadísticas")
        }
    }
}





