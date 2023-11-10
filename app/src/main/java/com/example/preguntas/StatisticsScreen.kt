package com.example.preguntas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun StatisticsScreen(navController: NavHostController) {
    val statistics = StatisticsManager.getStatistics()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Estadísticas", style = MaterialTheme.typography.titleMedium)

        Text("Aciertos: ${statistics.aciertos}")
        Text("Fallos: ${statistics.fallos}")
        Text("Total: ${statistics.total}")
    }
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Botón para volver al menú principal
        Button(
            onClick = {
                navController.navigate("MainMenu")
            },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Menú Principal")
        }
    }
}


