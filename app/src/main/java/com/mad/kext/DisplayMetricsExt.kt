package com.mad.kext

import android.content.Context
import android.util.DisplayMetrics

fun Int.dpToPx(context: Context): Float = context.dpToPx(this)
fun Float.dpToPx(context: Context): Float = context.dpToPx(this)
fun Int.pxToDp(context: Context): Float = context.pxToDp(this)
fun Float.pxToDp(context: Context): Float = context.pxToDp(this)

private fun Context.dpToPx(dp: Int): Float =
    dp.toFloat() * (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)

private fun Context.dpToPx(dp: Float): Float =
    dp * (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)

private fun Context.pxToDp(px: Int): Float =
    px.toFloat() / (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)

private fun Context.pxToDp(px: Float): Float =
    px / (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)