package io.conekta.conektasdk.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import io.conekta.conektasdk.component.conf.Conf
import io.conekta.conektasdk.component.ui.content.TitleColumn

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun Main() {
    Column ( modifier = Modifier
        .verticalScroll(state = rememberScrollState())
        .alpha( 1f)
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(32.dp)){

        // title
        TitleColumn(Conf.TITLE_TEXT)
        // warning

        // payment methods
    }
}
@Preview()
@Composable
fun MainPreview() {
    Main()
}