package com.rodrigoguerrero.theme

import android.annotation.SuppressLint
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class MyMoneyPadding(
    val none: Dp = 0.dp,
    val xxs: Dp = 2.dp,
    val xs: Dp = 4.dp,
    val s: Dp = 8.dp,
    val sm: Dp = 12.dp,
    val m: Dp = 16.dp,
    val ml: Dp = 20.dp,
    val l: Dp = 32.dp,
    val xl: Dp = 64.dp,
)

@SuppressLint("ComposeCompositionLocalUsage")
val LocalAppPadding = staticCompositionLocalOf { MyMoneyPadding() }
