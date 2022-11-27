package com.example.worldcup2022.ui.screen.home.uistate

data class HomeUiState(
    val genericInfo: List<GenericInfoUiState> = emptyList(),
    val matchesInfo: List<MatchInfoUiState> = emptyList(),
)

