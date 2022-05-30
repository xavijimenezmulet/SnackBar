package com.xavijimenezmulet.customsnackbar.snackbar

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.xavijimenezmulet.customsnackbar.R
import com.xavijimenezmulet.customsnackbar.snackbar.view.StyleableSnackBarView


/**
 * @author Xavier Jimenez Mulet
 * @since 30/5/22
 * @email xavijimenezmulet@gmail.com
 */
class StyleableSnackBar(
    parent: ViewGroup,
    content: StyleableSnackBarView
) : BaseTransientBottomBar<StyleableSnackBar>(parent, content, content) {

// =================================================================================================
// Enum
// =================================================================================================

    enum class Type {
        SUCCESS, FAILURE, WARNING, INFORMATION
    }

// =================================================================================================
// Initialization
// =================================================================================================

    init {
        getView().setBackgroundColor(
            ContextCompat.getColor(view.context, android.R.color.transparent)
        )
        getView().setPadding(0, 0, 0, 0)
    }

    companion object {

// =================================================================================================
// Public methods
// =================================================================================================

        /**
         * Creates a custom snackbar with the selected elements
         * @param viewGroup view group of the caller
         * @param text to be used as the message
         * @param backgroundColor the snackBar background color
         * @param image image to be used in the snackBar (optional)
         * @param tintImage color of image set (optional)
         * @param long duration of snackBar false if you want short
         * @param strokeColor the outline color (optional)
         * @param strokeWidth the outline width (optional)
         */
        fun customSnack(
            viewGroup: ViewGroup,
            text: String?,
            backgroundColor: Int = R.color.black,
            image: Int? = null,
            tintImage: Int = R.color.white,
            long: Boolean,
            strokeWidth: Int = 0,
            strokeColor: Int = R.color.black,
            context: Context
        ) {
            val customView = LayoutInflater.from(viewGroup.context).inflate(
                R.layout.layout_custom_snackbar,
                viewGroup,
                false
            ) as StyleableSnackBarView

            customView.background.setCardBackgroundColor(
                ContextCompat.getColor(
                    context,
                    backgroundColor
                )
            )
            customView.message.text = text ?: ""
            image?.let {
                customView.image.setImageResource(image)
                customView.image.setColorFilter(
                    ContextCompat.getColor(context, tintImage),
                    PorterDuff.Mode.SRC_IN
                )
                customView.message.gravity = Gravity.START
            } ?: run {
                customView.image.visibility = View.GONE
                customView.message.gravity = Gravity.CENTER
            }

            customView.strokeColor = strokeColor
            customView.strokeWidth = strokeWidth

            StyleableSnackBar(viewGroup, customView).setDuration(if (long) 3000 else 1000).show()
        }

        /**
         * Creates a snackBar instance with custom duration and color
         * @param viewGroup view group of the caller
         * @param text to be used as the message
         * @param type specifies the image and background to be prompted
         * @param long duration of snackBar false if you want short
         * @param context current context
         * @param showImage to show image (optional) default is true
         */
        fun snack(
            viewGroup: ViewGroup,
            text: String?,
            type: Type,
            long: Boolean,
            context: Context,
            showImage: Boolean = true
        ) {
            val customView = LayoutInflater.from(viewGroup.context).inflate(
                R.layout.layout_custom_snackbar,
                viewGroup,
                false
            ) as StyleableSnackBarView

            customView.message.text = text ?: ""
            if (!showImage) {
                customView.image.visibility = View.GONE
                customView.message.gravity = Gravity.CENTER
            } else {
                customView.message.gravity = Gravity.START
            }
            customView.image.setImageResource(getImageByType(type))
            customView.image.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN)
            customView.background.setCardBackgroundColor(
                ContextCompat.getColor(context, getColorByType(type))
            )

            StyleableSnackBar(viewGroup, customView).setDuration(if (long) 3000 else 1000).show()
        }

// =================================================================================================
// Private methods
// =================================================================================================

        private fun getImageByType(type: Type): Int {
            return when (type) {
                Type.SUCCESS -> R.drawable.ic_check
                Type.FAILURE -> R.drawable.ic_cancel
                Type.WARNING -> R.drawable.ic_alert
                Type.INFORMATION -> R.drawable.ic_info
            }
        }

        private fun getColorByType(type: Type): Int {
            return when (type) {
                Type.SUCCESS -> R.color.styleableGreen
                Type.FAILURE -> R.color.styleableRed
                Type.WARNING -> R.color.styleableYellow
                Type.INFORMATION -> R.color.styleableBlue
            }
        }
    }
}