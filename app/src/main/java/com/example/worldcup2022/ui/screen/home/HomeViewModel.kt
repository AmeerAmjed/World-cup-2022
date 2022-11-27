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
                        title = "2022 FIFA World Cup",
                        description = "The 2022 FIFA World Cup is an international association football tournament contested by the men's national teams of FIFA's member associations. The 22nd FIFA World Cup, it is taking place in Qatar from 20 November to 18 December 2022. This is the first World Cup to be held in the Arab world, and the second held entirely in Asia after the 2002 tournament in South Korea and Japan.[A] At an estimated cost of over \$220 billion, it is the most expensive World Cup ever held",
                        imageUrl = "https://digitalhub.fifa.com/transform/cc484be3-24c2-4315-a331-71f252d70349/Brand_Protection_fwc2022_oe_4ct_3D_ps_l"
                    ),
                    GenericInfoUiState(
                        title = "Thiago Silva: I knew people doubted me",
                        description = "Brazil captain tells FIFA+ about his burning World Cup aim and remaining at peak of profession for two decades.",
                        imageUrl = "https://cloudinary.fifa.com/m/4d96512a41e31e58/original/Brazil-Training-Session-FIFA-World-Cup-Qatar-2022.jpg"
                    ),
                    GenericInfoUiState(
                        title = "Thiago Silva: I knew people doubted me",
                        description = "Brazil captain tells FIFA+ about his burning World Cup aim and remaining at peak of profession for two decades.",
                        imageUrl = "https://cloudinary.fifa.com/m/4d96512a41e31e58/original/Brazil-Training-Session-FIFA-World-Cup-Qatar-2022.jpg"
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
                        date = "End",
                        firstTeamName = "Belgium",
                        firstTeamGoals = "0",
                        firstTeamFlagImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Flag_of_Belgium_%28civil%29.svg/255px-Flag_of_Belgium_%28civil%29.svg.png",
                        secondTeamName = "Morocco",
                        secondTeamGoals = "2",
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


