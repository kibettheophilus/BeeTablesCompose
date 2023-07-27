package com.breens.beetablescompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun TableHeaderComponent(
    headerTableTitles: List<String>,
    headerTitlesBorderColor: Color,
    headerTitlesBorderWidth: Dp,
    headerTitlesTextStyle: TextStyle,
    headerTitlesBackGroundColor: Color,
) {
    Row(
        Modifier
            .fillMaxWidth()
            .background(headerTitlesBackGroundColor),
    ) {
        headerTableTitles.forEach { title ->
            Box(
                modifier = Modifier
                    .weight(.3f)
                    .border(
                        width = headerTitlesBorderWidth,
                        color = headerTitlesBorderColor,
                    ),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = title,
                    style = headerTitlesTextStyle,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .height(38.dp)
                        .wrapContentHeight(),
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TableHeaderComponentPreview() {
    val titles = listOf("Team", "Home", "Away", "Points")

    Row(
        Modifier
            .fillMaxWidth()
            .background(Color.White),
    ) {
        titles.forEach { title ->
            Box(
                modifier = Modifier
                    .weight(.3f)
                    .border(
                        width = 0.4.dp,
                        color = Color.LightGray,
                    ),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Black,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .height(38.dp)
                        .wrapContentHeight(),
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}