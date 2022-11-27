package com.example.worldcup2022.ui.screen.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.worldcup2022.ui.screen.composable.ImageTeamBorder
import com.example.worldcup2022.ui.screen.composable.NetworkImage
import com.example.worldcup2022.ui.screen.home.uistate.MatchInfoUiState
import com.example.worldcup2022.ui.theme.labelSmallTextStyle
import com.example.worldcup2022.ui.theme.secondaryBoldTextStyle
import com.example.worldcup2022.ui.theme.secondaryBoldTextStylePrimaryColor
import com.example.worldcup2022.ui.theme.spacing
import com.example.worldcup2022.ui.theme.spacingMedium
import com.example.worldcup2022.ui.theme.spacingSmall

@Composable
fun CardMatch(matchInfo: MatchInfoUiState) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = spacing),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                matchInfo.firstTeamName,
                style = secondaryBoldTextStyle,
                maxLines = 1,
                overflow = TextOverflow.Clip,
                modifier = Modifier
                    .padding(horizontal = spacingSmall)
                    .width(80.dp)
            )
            NetworkImage(
                matchInfo.firstTeamFlagImageUrl,
                modifier = ImageTeamBorder,
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = spacingMedium),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row() {
                    Text(
                        matchInfo.firstTeamGoals,
                        style = secondaryBoldTextStylePrimaryColor,
                        modifier = Modifier
                    )
                    Text(
                        ":",
                        style = secondaryBoldTextStylePrimaryColor,
                        modifier = Modifier
                            .padding(horizontal = spacingSmall)
                    )
                    Text(
                        matchInfo.secondTeamGoals,
                        style = secondaryBoldTextStylePrimaryColor,
                        modifier = Modifier
                    )
                }
                Text(
                    matchInfo.date,
                    style = labelSmallTextStyle,
                    modifier = Modifier
                )

            }

            NetworkImage(
                matchInfo.secondTeamFlagImageUrl,
                modifier = ImageTeamBorder.fillMaxSize(),
            )

            Text(
                matchInfo.secondTeamName,
                style = secondaryBoldTextStyle,
                maxLines = 1,
                overflow = TextOverflow.Clip,
                modifier = Modifier
                    .padding(horizontal = spacingSmall)
                    .width(80.dp)
            )

        }

    }

}


//@Preview()
//@Composable
//private fun CardMatchPreview() {
//    CardMatch()
//}
