package com.example.kidsdrowingapp

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class DrowingView(context: Context, attrs: AttributeSet) : View(context, attrs) {



    private var mDrawPath : CustomPath? = null
    private var mCanvasBitmap: Bitmap? = null
    private var mDrawPaint: Paint? = null
    private var mCanvasPaint: Paint? = null
    private var mBrushSize: Float = 0.toFloat()
    private var color = Color.BLACK
    private var canvas: Canvas? = null

    init {
        setUpDrawing()
    }

    private fun setUpDrawing(){
        mDrawPaint = Paint ()
        mDrawPath = CustomPath(color, mBrushSize)
        mDrawPaint!!.color = color
        mDrawPaint!!.style = Paint.Style.STROKE
        mDrawPaint!!.strokeJoin = Paint.Join.ROUND
        mDrawPaint!!.strokeCap = Paint.Cap.ROUND
        mCanvasPaint = Paint(Paint.DITHER_FLAG)
        mBrushSize  = 20.toFloat() //Setting Up The Kids Drawing App - Drawing View Part 1
    }

    internal inner class CustomPath (var color: Int, var brushThickness: Float) : Path() {

    }
}