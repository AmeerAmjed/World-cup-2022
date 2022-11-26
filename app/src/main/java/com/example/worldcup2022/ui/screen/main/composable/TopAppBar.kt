package com.example.worldcup2022.ui.screen.main.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.worldcup2022.R
import com.example.worldcup2022.ui.theme.LightColorScheme
import com.example.worldcup2022.ui.theme.WorldCup2022Theme
import com.example.worldcup2022.ui.theme.avatarSmall
import com.example.worldcup2022.ui.theme.iconMedium
import com.example.worldcup2022.ui.theme.labelSmallTextStyle
import com.example.worldcup2022.ui.theme.secondaryBoldTextStyle
import com.example.worldcup2022.ui.theme.spacingMedium
import com.example.worldcup2022.ui.theme.spacingSmall
import com.skydoves.landscapist.CircularReveal
import com.skydoves.landscapist.glide.GlideImage


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar() {
    TopAppBar(modifier = Modifier.padding(spacingMedium), title = {
        Column(
            modifier = Modifier.padding(start = spacingSmall)
        ) {

            Text(
                "Ameer Amjed",
                style = secondaryBoldTextStyle.copy(color = LightColorScheme.secondary)
            )
            Text(

                stringResource(R.string.welcome_user),
                style = labelSmallTextStyle.copy(color = LightColorScheme.primary)
            )
        }

    }, navigationIcon = {
        GlideImage(
            modifier = Modifier
                .width(avatarSmall)
                .height(avatarSmall)
                .clip(CircleShape)
                .clickable(enabled = true, onClick = {}),
            imageModel = "https://avatars.githubusercontent.com/u/45900975?v=4",
            contentScale = ContentScale.Crop,
            circularReveal = CircularReveal(duration = 250),
            placeHolder = painterResource(R.drawable.image),
            error = painterResource(R.drawable.image)
        )


    }, actions = {
        IconButton(onClick = {}) {

            Icon(
                Icons.Outlined.Notifications,
                contentDescription = stringResource(R.string.notifications),
                modifier = Modifier.size(iconMedium),
                tint = LightColorScheme.primary
            )
        }
    }

    )
}

@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    WorldCup2022Theme {
        AppBar()
    }
}