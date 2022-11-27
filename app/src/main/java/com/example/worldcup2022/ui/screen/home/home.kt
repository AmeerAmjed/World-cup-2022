package com.example.worldcup2022.ui.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.worldcup2022.R
import com.example.worldcup2022.ui.screen.home.composable.CardInfo
import com.example.worldcup2022.ui.screen.home.composable.CardMatch
import com.example.worldcup2022.ui.screen.home.composable.TitleWithSeeAll
import com.example.worldcup2022.ui.screen.home.uistate.HomeUiState
import com.example.worldcup2022.ui.theme.spacingLarge
import com.example.worldcup2022.ui.theme.spacingMedium
import com.example.worldcup2022.ui.theme.spacingSmall

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    val stateScrollCard = rememberLazyListState()
    val firstVisibleItemIndexCard by remember { derivedStateOf { stateScrollCard.firstVisibleItemIndex } }
    HomeScreenContent(
        state = state,
        stateScrollCard = stateScrollCard,
        firstVisibleItemIndexCard = firstVisibleItemIndexCard
    )
}

@Composable
private fun HomeScreenContent(
    state: HomeUiState,
    stateScrollCard: LazyListState,
    firstVisibleItemIndexCard: Int
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = spacingSmall)
    ) {

        Spacer(modifier = Modifier.height(72.dp))
        TitleWithSeeAll(
            R.string.information,
            seeAll = {}
        )

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = spacingMedium),
            horizontalArrangement = Arrangement.spacedBy(
                spacingLarge,
            ),
            state = stateScrollCard
        ) {
            items(state.genericInfo.size) {
                CardInfo(state.genericInfo[it], it == firstVisibleItemIndexCard)
            }
        }

        TitleWithSeeAll(
            R.string.all_matches,
            seeAll = {}
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(horizontal = spacingMedium),

            verticalArrangement = Arrangement.spacedBy(
                spacingLarge,

                ),
        ) {
            items(state.matchesInfo.size) {
                CardMatch(state.matchesInfo[it])
            }
        }

    }
}
//
//@Preview()
//@Composable
//private fun HomeScreenPreview() {
//    HomeScreenContent()
//}

