package com.mad.kext

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.maxVerticalScrollReached(): Boolean {
    val computeOffset = computeVerticalScrollOffset()
    val computeExtent = computeVerticalScrollExtent()
    val computeRange = computeVerticalScrollRange()
    return computeOffset + computeExtent >= computeRange
}

fun RecyclerView.maxHorizontalScrollReached(): Boolean {
    val computeOffset = computeHorizontalScrollOffset()
    val computeExtent = computeHorizontalScrollExtent()
    val computeRange = computeHorizontalScrollRange()
    return computeOffset + computeExtent >= computeRange
}

fun RecyclerView.scrollVerticalPercentage(): Float {
    val computeOffset = computeVerticalScrollOffset()
    val computeExtent = computeVerticalScrollExtent()
    val computeRange = computeVerticalScrollRange()
    return 100.toFloat() * computeOffset / (computeRange - computeExtent)
}

fun RecyclerView.scrollHorizontalPercentage(): Float {
    val computeOffset = computeHorizontalScrollOffset()
    val computeExtent = computeHorizontalScrollExtent()
    val computeRange = computeHorizontalScrollRange()
    return 100.toFloat() * computeOffset / (computeRange - computeExtent)
}


val RecyclerView.lastVisibleItem: Int
    get() {
        return when (val manager = layoutManager) {
            is LinearLayoutManager -> manager.findLastVisibleItemPosition()
            is GridLayoutManager -> manager.findLastVisibleItemPosition()
            else -> RecyclerView.NO_POSITION
        }
    }


val RecyclerView.firstVisibleItem: Int
    get() {
        return when (val manager = layoutManager) {
            is LinearLayoutManager -> manager.findFirstVisibleItemPosition()
            is GridLayoutManager -> manager.findFirstVisibleItemPosition()
            else -> RecyclerView.NO_POSITION
        }
    }


fun RecyclerView.getItemHeight(): Int {
    val itemCount = adapter?.itemCount ?: return 0
    val computeRange = computeVerticalScrollRange()
    return computeRange / itemCount
}


fun RecyclerView.getItemWidth(): Int {
    val itemCount = adapter?.itemCount ?: return 0
    val computeRange = computeHorizontalScrollRange()
    return computeRange / itemCount
}