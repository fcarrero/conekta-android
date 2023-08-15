package io.conekta.conektasdk.component.ui.content

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import io.conekta.conektasdk.component.ui.component.TitleText

@Composable
fun TitleColumn(text: String){
    Column () {
        TitleText(text)
    }
}