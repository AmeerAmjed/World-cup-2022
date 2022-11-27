package com.example.worldcup2022.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
)

var fontDefault: TextStyle = TextStyle(
    fontFamily = poppinsFamily,
)

var labelSmallTextStyle: TextStyle = fontDefault.copy(
    fontWeight = FontWeight.Normal,
    fontSize = fontSizesCaption,
    letterSpacing = 0.5.sp
)

var primaryTextStyle: TextStyle = fontDefault.copy(
    fontWeight = FontWeight.Normal,
    fontSize = fontSizePrimary,
)

var primaryBoldTextStyle: TextStyle = primaryTextStyle.copy(
    fontWeight = FontWeight.SemiBold,
)

var primaryBoldTextStylePrimaryColor: TextStyle = primaryBoldTextStyle.copy(
    color = LightColorScheme.primary
)

var secondaryTextStyle: TextStyle = fontDefault.copy(
    fontWeight = FontWeight.Normal,
    fontSize = fontSizesSecondary,
)

var secondaryBoldTextStyle: TextStyle = secondaryTextStyle.copy(
    fontWeight = FontWeight.Bold,
    fontSize = fontSizesSecondary,
)

var secondaryBoldTextStylePrimaryColor: TextStyle = secondaryBoldTextStyle.copy(
    color = LightColorScheme.primary
)
