package com.example.worldcup2022.ui.screen.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.worldcup2022.ui.theme.LightColorScheme
import com.example.worldcup2022.ui.theme.avatarSmall
import com.example.worldcup2022.ui.theme.imageBorderSmall



var ImageTeamBorder = Modifier
    .width(avatarSmall)
    .height(avatarSmall)
    .clip(CircleShape)
    .border(
        imageBorderSmall,
        LightColorScheme.primary,
        CircleShape
    )
    .padding(1.dp)
    .border(
        imageBorderSmall,
        Color.White,
        CircleShape
    )

