package com.elyeproj.designkit

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign.Companion.Center
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DkThinkTextView(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontSize = 24.sp,
        textAlign = Center,
        modifier = modifier
    )
}


@Composable
fun DkTextView(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        textAlign = Center,
        modifier = modifier
    )
}

@Composable
fun DkBorderTextView(text: String, modifier: Modifier = Modifier) {
    DkThinkTextView(text,
        modifier
            .padding(16.dp)
            .background(Color.White)
            .border(1.dp, Color.Black)
    )
}
