package io.conekta.conektasdk.component.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
@Composable
fun TitleText(text: String) {
    Text(text.uppercase(), fontSize = 16.sp, fontWeight = FontWeight.Bold)
}