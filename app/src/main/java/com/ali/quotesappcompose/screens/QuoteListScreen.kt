package com.ali.quotesappcompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ali.quotesappcompose.R
import com.ali.quotesappcompose.models.Quotes

@Composable
fun QuoteListScreen(data: Array<Quotes>, onClick: ()-> Unit) {
    Column(modifier = Modifier.padding(8.dp)) {

        Spacer(modifier = Modifier.padding(4.dp))

        Text(
            text = "Quotes App",
            fontFamily = FontFamily(Font(R.font.quicksand_bold)),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.padding(8.dp))

        QuoteList(data = data) {
            onClick
        }
    }
}