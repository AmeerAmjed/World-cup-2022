package com.example.worldcup2022.ui.screen.home.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.worldcup2022.R
import com.example.worldcup2022.ui.screen.composable.NetworkImage
import com.example.worldcup2022.ui.screen.home.uistate.GenericInfoUiState
import com.example.worldcup2022.ui.theme.LightColorScheme
import com.example.worldcup2022.ui.theme.cardRounded
import com.example.worldcup2022.ui.theme.fontSizesSmall
import com.example.worldcup2022.ui.theme.labelSmallTextStyle
import com.example.worldcup2022.ui.theme.primaryTextStyle
import com.example.worldcup2022.ui.theme.spacing
import com.example.worldcup2022.ui.theme.spacingLarge
import com.example.worldcup2022.ui.theme.spacingSmall
import com.example.worldcup2022.ui.theme.zero

@Composable
fun CardInfo(genericInfo: GenericInfoUiState, IsFirstVisibleItem: Boolean) {
    Card(
        modifier = Modifier
            .width(300.dp)
            .height(200.dp)
            .padding(vertical = if (IsFirstVisibleItem) zero else spacingLarge),
        shape = RoundedCornerShape(cardRounded),
        colors = CardDefaults.cardColors(
            containerColor = if (IsFirstVisibleItem) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary,
        )
    ) {
        Row() {
            NetworkImage(
                genericInfo.imageUrl,
                modifier = Modifier
                    .width(150.dp)
                    .fillMaxHeight()
                    .padding(if (IsFirstVisibleItem) spacing else zero)
                    .clip(
                        RoundedCornerShape(cardRounded)
                    )
            )
            Column(
                modifier = Modifier
                    .padding(spacingSmall)
                    .fillMaxHeight()
            ) {
                Text(genericInfo.title, style = primaryTextStyle)
                Text(
                    genericInfo.description,
                    style = labelSmallTextStyle.copy(
                        fontSize = fontSizesSmall,
                        color = Color.White,
                    ),
                    maxLines = 8,
                    overflow = TextOverflow.Ellipsis
                )
                Box(
                    Modifier.fillMaxHeight(),
                    contentAlignment = Alignment.BottomEnd,
                ) {
                    OutlinedButton(
                        onClick = {},
                        border = BorderStroke(zero, Color.White),
                        contentPadding = PaddingValues(zero),
                        colors = ButtonDefaults.buttonColors(
                            Color.White
                        ),
                        modifier = Modifier
                            .defaultMinSize(
                                minWidth = 72.dp,
                                minHeight = 20.dp
                            )

                    ) {
                        Text(
                            stringResource(R.string.read_more),
                            style = labelSmallTextStyle.copy(
                                color = LightColorScheme.primary,
                                fontSize = fontSizesSmall
                            )
                        )
                    }
                }

            }
        }
    }
}