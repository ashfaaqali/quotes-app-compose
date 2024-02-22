package com.ali.quotesappcompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.ali.quotesappcompose.models.Quotes

@Composable
fun QuoteList(data: Array<Quotes>, onClick: (quote: Quotes)-> Unit) {
    LazyColumn(content = {
        items(data){
            QuoteListItem(quote = it, onClick)
        }
    })
}