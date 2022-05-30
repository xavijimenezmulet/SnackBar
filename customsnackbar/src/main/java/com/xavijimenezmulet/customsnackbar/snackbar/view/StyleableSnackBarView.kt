package com.xavijimenezmulet.customsnackbar.snackbar.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.card.MaterialCardView
import com.google.android.material.snackbar.ContentViewCallback
import com.xavijimenezmulet.customsnackbar.R


/**
 * @author Xavier Jimenez Mulet
 * @since 30/5/22
 * @email xavijimenezmulet@gmail.com
 */
class StyleableSnackBarView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defaultStyle: Int = 0
) : ConstraintLayout(context, attributeSet, defaultStyle), ContentViewCallback {

// =================================================================================================
// Attributes
// =================================================================================================

    var message: AppCompatTextView
    var image: AppCompatImageView
    var background: MaterialCardView

    var strokeWidth = 0
        set(value) {
            field = value
            setStrokeWidth()
        }
    var strokeColor = R.color.black
        set(value) {
            field = value
            setStrokeColor()
        }

// =================================================================================================
// Init
// =================================================================================================

    init {
        View.inflate(context, R.layout.custom_snack_bar, this)
        message = findViewById(R.id.messageSB)
        image = findViewById(R.id.imageSB)
        background = findViewById(R.id.cardBackground)
    }

// =================================================================================================
// Override methods
// =================================================================================================

    override fun animateContentIn(delay: Int, duration: Int) {
        // Nothing to do
    }

    override fun animateContentOut(delay: Int, duration: Int) {
        // Nothing to do
    }

// =================================================================================================
// Private methods
// =================================================================================================

    private fun setStrokeWidth() {
        background.strokeWidth = strokeWidth
    }

    private fun setStrokeColor() {
        background.strokeColor = ContextCompat.getColor(context, strokeColor)
    }

}