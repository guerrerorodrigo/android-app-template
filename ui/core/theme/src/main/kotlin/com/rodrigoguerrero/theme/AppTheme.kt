package com.rodrigoguerrero.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import com.rodrigoguerrero.theme.colors.DarkColors
import com.rodrigoguerrero.theme.colors.LightColors
import com.rodrigoguerrero.theme.colors.LocalAppColors
import androidx.compose.material3.Typography as TypographyMaterial3

/**
 * Theme object to access different theme properties
 */
object AppTheme {
    /**
     * Color scheme
     */
    val color: ColorScheme
        @Composable
        get() = LocalAppColors.current

    /**
     * Paddings to be used
     */
    val padding: AppPadding
        @Composable
        get() = LocalAppPadding.current

    /**
     * Typography
     */
    val typography: TypographyMaterial3
        @Composable
        get() = LocalAppTypography.current

    /**
     * Shapes
     */
    val shapes: Shapes
        @Composable
        get() = LocalAppShapes.current
}

/**
 * Composable that holds the app theme
 *
 * @param modifier
 * @param darkTheme
 * @param content
 */
@Composable
fun AppTheme(
    modifier: Modifier = Modifier,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }

    val padding = AppPadding()
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
