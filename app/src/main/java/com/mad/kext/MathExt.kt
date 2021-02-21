package com.mad.kext

fun Float.convertRange(oldMax: Float, oldMin: Float, newMax: Float, newMin: Float): Float {
    if (this > oldMax) return newMax
    val oldRange = oldMax - oldMin
    val newRange = newMax - newMin
    return (((this - oldMin) * newRange) / oldRange) + newMin
}