package com.ali.quotesappcompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.ali.quotesappcompose.models.Quotes

@Composable
fun QuoteList(data: Array<Quotes>, onClick: ()-> Unit) {
    LazyColumn(content = {
        items(data){
            QuoteListItem(quotes = it) {
                onClick()
            }
        }
    })
}