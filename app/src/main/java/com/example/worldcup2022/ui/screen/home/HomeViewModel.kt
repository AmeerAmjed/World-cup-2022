package com.example.worldcup2022.ui.screen.home

import androidx.lifecycle.ViewModel
import com.example.worldcup2022.ui.screen.home.uistate.GenericInfoUiState
import com.example.worldcup2022.ui.screen.home.uistate.HomeUiState
import com.example.worldcup2022.ui.screen.home.uistate.MatchInfoUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


@HiltViewModel
class HomeViewModel : ViewModel() {
    private val _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    init {
        getGenericInfo()
        getMatchInfo()
    }
    private fun getGenericInfo() {

        _state.update {
            it.copy(
                genericInfo = listOf(
                    GenericInfoUiState(
                        title = "ameer",
                        description = "hi",
                        imageUrl = "https://avatars.githubusercontent.com/u/45900975?v=4"
                    ),
                    GenericInfoUiState(
                        title = "ameer",
                        description = "hi",
                        imageUrl = "https://avatars.githubusercontent.com/u/45900975?v=4"
                    ),
                    GenericInfoUiState(
                        title = "ameer",
                        description = "hi",
                        imageUrl = "https://avatars.githubusercontent.com/u/45900975?v=4"
                    ),
                )
            )
        }

    }

    private fun getMatchInfo() {

        _state.update {

            it.copy(
                matchesInfo = listOf(
                    MatchInfoUiState(
                        date = "End",
                        firstTeamName = "Costa Rica",
                        firstTeamGoals = "1",
                        firstTeamFlagImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Flag_of_Costa_Rica.svg/255px-Flag_of_Costa_Rica.svg.png",
                        secondTeamName = "Japan",
                        secondTeamGoals = "0",
                        secondTeamFlagImageUrl = "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/255px-Flag_of_Japan.svg.png"
                    ),
                    MatchInfoUiState(
                        date = "4:00",
                        firstTeamName = "Belgium",
                        firstTeamGoals = "0",
                        firstTeamFlagImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Flag_of_Belgium_%28civil%29.svg/255px-Flag_of_Belgium_%28civil%29.svg.png",
                        secondTeamName = "Morocco",
                        secondTeamGoals = "0",
                        secondTeamFlagImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/255px-Flag_of_Morocco.svg.png"
                    ),
                    MatchInfoUiState(
                        date = "7:00",
                        firstTeamName = "Croatia",
                        firstTeamGoals = "0",
                        firstTeamFlagImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Flag_of_Croatia.svg/800px-Flag_of_Croatia.svg.png?20131109134641",
                        secondTeamName = "Canada",
                        secondTeamGoals = "0",
                        secondTeamFlagImageUrl = "https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Canada.png"
                    ),
                    MatchInfoUiState(
                        date = "10:00",
                        firstTeamName = "Spain",
                        firstTeamGoals = "0",
                        firstTeamFlagImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Spain.svg/750px-Flag_of_Spain.svg.png?20140922091435",
                        secondTeamName = "Germany",
                        secondTeamGoals = "0",
                        secondTeamFlagImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/800px-Flag_of_Germany.svg.png?20070926182838"
                    )


                )
            )
        }
    }
}


