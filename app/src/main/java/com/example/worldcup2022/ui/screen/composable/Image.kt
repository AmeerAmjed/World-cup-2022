package com.example.worldcup2022.ui.screen.composable


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.worldcup2022.R
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun NetworkImage(imageUrl: String, modifier: Modifier = Modifier) {
    GlideImage(
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxSize(),
        imageModel = imageUrl,
//        contentScale = ContentScale.Crop,
//        circularReveal = CircularReveal(duration = 250),
        placeHolder = painterResource(R.drawable.image),
        error = painterResource(R.drawable.image)
    )
}