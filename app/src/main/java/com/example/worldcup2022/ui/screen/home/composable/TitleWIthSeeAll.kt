package com.example.worldcup2022.ui.screen.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.worldcup2022.R
import com.example.worldcup2022.ui.theme.LightColorScheme
import com.example.worldcup2022.ui.theme.labelSmallTextStyle
import com.example.worldcup2022.ui.theme.secondaryBoldTextStyle
import com.example.worldcup2022.ui.theme.spacingMedium

@Composable
fun TitleWithSeeAll(title: Int, seeAll: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = spacingMedium),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(title),
            style = secondaryBoldTextStyle.copy(color = LightColorScheme.secondary)
        )

        TextButton(onClick = seeAll) {
            Text(
                text = stringResource(id = R.string.seeAll),
                style = labelSmallTextStyle.copy(color = LightColorScheme.primary)
            )
        }

    }
}