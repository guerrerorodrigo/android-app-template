package com.rodrigoguerrero.home.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import com.rodrigoguerrero.home.theme.colors.DarkColors
import com.rodrigoguerrero.home.theme.colors.LightColors
import com.rodrigoguerrero.home.theme.colors.LocalAppColors
import androidx.compose.material3.Typography as TypographyMaterial3

object AppTheme {
    val color: ColorScheme
        @Composable
        get() = LocalAppColors.current

    val padding: MyMoneyPadding
        @Composable
        get() = LocalAppPadding.current

    val typography: TypographyMaterial3
        @Composable
        get() = LocalAppTypography.current

    val shapes: Shapes
        @Composable
        get() = LocalAppShapes.current
}

@Composable
fun AndroidAppTheme(
    modifier: Modifier = Modifier,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }

    val padding = MyMoneyPadding()
    val typography = typography()

    CompositionLocalProvider(
        LocalAppColors provides colors,
        LocalAppPadding provides padding,
        LocalAppTypography provides typography,
        LocalAppShapes provides Shapes,
    ) {
        MaterialTheme(
            colorScheme = colors,
            shapes = Shapes,
            typography = typography,
        ) {
            Surface(
                modifier = modifier.fillMaxSize(),
            ) {
                content()
            }
        }
    }
}
