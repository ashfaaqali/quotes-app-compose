package com.ali.quotesappcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ali.quotesappcompose.R
import com.ali.quotesappcompose.models.Quotes

@Composable
fun QuoteListItem(quotes: Quotes, onClick: ()-> Unit) {
    Card(
        modifier = Modifier
            .clickable { onClick }
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {

        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    imageVector = Icons.Filled.FormatQuote,
                    colorFilter = ColorFilter.tint(Color.White),
                    alignment = Alignment.Center,
                    contentDescription = "Favorite",
                    modifier = Modifier
                        .rotate(180f)
                        .size(40.dp)
                        .background(Color.Black)
                )

                Text(
                    text = quotes.text,
                    fontFamily = FontFamily(Font(R.font.quicksand_semibold)),
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Black,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                )
            }

            Spacer(modifier = Modifier.padding(8.dp))

            Box(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth(.3f)
                    .height(1.dp)
            )

            Spacer(modifier = Modifier.padding(4.dp))

            Text(
                text = quotes.author,
                fontFamily = FontFamily(Font(R.font.quicksand_regular)),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
