package com.example.worldcup2022.ui.screen.home

import androidx.lifecycle.ViewModel
import com.example.worldcup2022.ui.screen.home.uistate.GenericInfoUiState
import com.example.worldcup2022.ui.screen.home.uistate.HomeUiState
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
}