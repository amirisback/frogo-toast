package com.frogobox.frogotoast

/*
 * Created by Faisal Amir on 13/01/2021
 * Toasty Source Code
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.
 * All rights reserved
 *
 */

import android.content.Context
import android.view.View
import android.widget.Toast


class FrogoToast(context: Context?) : Toast(context) {


    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }

    override fun show() {
        super.show()
    }

    override fun cancel() {
        super.cancel()
    }

    override fun setView(view: View?) {
        super.setView(view)
    }

    override fun getView(): View? {
        return super.getView()
    }

    override fun setDuration(duration: Int) {
        super.setDuration(duration)
    }

    override fun getDuration(): Int {
        return super.getDuration()
    }

    override fun setMargin(horizontalMargin: Float, verticalMargin: Float) {
        super.setMargin(horizontalMargin, verticalMargin)
    }

    override fun getHorizontalMargin(): Float {
        return super.getHorizontalMargin()
    }

    override fun getVerticalMargin(): Float {
        return super.getVerticalMargin()
    }

    override fun setGravity(gravity: Int, xOffset: Int, yOffset: Int) {
        super.setGravity(gravity, xOffset, yOffset)
    }

    override fun getGravity(): Int {
        return super.getGravity()
    }

    override fun getXOffset(): Int {
        return super.getXOffset()
    }

    override fun getYOffset(): Int {
        return super.getYOffset()
    }

    override fun addCallback(callback: Callback) {
        super.addCallback(callback)
    }

    override fun removeCallback(callback: Callback) {
        super.removeCallback(callback)
    }

    override fun setText(resId: Int) {
        super.setText(resId)
    }

    override fun setText(s: CharSequence?) {
        super.setText(s)
    }
}