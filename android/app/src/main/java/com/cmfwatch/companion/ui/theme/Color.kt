package com.cmfwatch.companion.ui.theme

import androidx.compose.ui.graphics.Color

// CMF Watch Pro — HTML design tokens
val CmfBackground = Color(0xFF0B0E12)
val CmfSurface = Color(0xFF0B0E12)
val CmfOnSurface = Color(0xFFF2F4F7)
val CmfOnSurfaceVariant = Color(0xFFC2AFA8)
val CmfOutline = Color(0xFF9AA4AF)
val CmfOutlineVariant = Color(0xFF343D48)

val CmfSurfaceLowest = Color(0xFF171C22)
val CmfSurfaceLow = Color(0xFF0B0E12)
val CmfSurfaceContainer = Color(0xFF222A33)
val CmfSurfaceHigh = Color(0xFF29323C)
val CmfSurfaceHighest = Color(0xFF343E49)

val CmfPrimary = Color(0xFFFF8A65)
val CmfPrimaryContainer = Color(0xFFFF7043)
val CmfPrimaryFixed = Color(0xFF4A241B)
val CmfOnPrimary = Color(0xFF171C22)
val CmfOnPrimaryContainer = Color(0xFFFFE1D8)

val CmfSecondary = Color(0xFF9B96FF)
val CmfSecondaryContainer = Color(0xFF817BFF)
val CmfSecondaryFixed = Color(0xFF292747)
val CmfSecondaryFixedDim = Color(0xFFBDB8FF)
val CmfOnSecondary = Color(0xFF171C22)

val CmfTertiary = Color(0xFF5BE28A)
val CmfTertiaryContainer = Color(0xFF4ED47D)
val CmfTertiaryFixed = Color(0xFFB5FFCB)
val CmfOnTertiary = Color(0xFF171C22)
val CmfOnTertiaryFixed = Color(0xFF062414)
val CmfOnErrorContainer = Color(0xFFFFB4AB)
val CmfOnSecondaryFixedVariant = Color(0xFFBDB8FF)

val CmfError = Color(0xFFFF6B6B)
val CmfErrorContainer = Color(0xFF4B2024)

// Legacy aliases — mapped onto the new light palette
val LightBackground = CmfBackground
val BlackBackground = CmfBackground

val SurfaceWhite = CmfSurfaceLowest
val SurfaceCard = CmfSurfaceLowest
val SurfaceCardAlt = CmfSurfaceLow
val DarkCardSurface = CmfSurfaceLowest
val DarkCardVariant = CmfSurfaceLow

val TextPrimary = CmfOnSurface
val TextSecondary = CmfOnSurfaceVariant
val TextMuted = Color(0xFF9AA4AF)
val DividerColor = CmfOutlineVariant

val RingGreen = CmfTertiaryContainer
val RingGreenBg = Color(0x1A008733)
val RingOrange = CmfPrimaryContainer
val RingOrangeBg = Color(0x1AFF5722)
val RingBlue = CmfSecondaryContainer
val RingBlueBg = Color(0x1A6664E4)

val HeartRateRed = CmfError
val HeartRateBg = CmfErrorContainer
val SleepPurple = CmfSecondary
val SleepPurpleBg = Color(0x1A4C4ACA)
val SleepDeep = Color(0xFFBDB8FF)
val SleepCore = CmfSecondaryContainer
val SleepREM = Color(0xFFBDB8FF)

val SpO2Red = CmfSecondaryContainer
val RespBlue = CmfSecondaryContainer
val StressGreen = CmfTertiary

val AccentRed = CmfPrimaryContainer
val AccentActivity = CmfTertiaryContainer
val AccentStressLow = CmfTertiary
val AccentSpO2 = CmfSecondaryContainer
val AccentSleepREM = SleepREM
val AccentSleepLight = SleepCore
val AccentSleepDeep = SleepDeep
val AccentHeartRate = HeartRateRed
val AccentSleepAwake = CmfPrimaryContainer
