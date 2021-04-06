package com.mad.kext

import android.content.Context
import android.content.res.Configuration
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.FontRes
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

fun Context.getCompatColor(@ColorRes id: Int) =
        ContextCompat.getColor(this, id)

fun Context.getCompatFont(@FontRes id: Int) =
        ResourcesCompat.getFont(this, id)

fun Context.getCompatDrawable(@DrawableRes id: Int) =
        ContextCompat.getDrawable(this, id)

fun Context.isTablet(): Boolean =
        ((resources.configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE)
