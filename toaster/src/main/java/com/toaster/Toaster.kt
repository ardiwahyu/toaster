@file:Suppress("DEPRECATION")

package com.toaster

import android.content.Context
import android.graphics.PorterDuff
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

object Toaster {

    fun defaultToast(context: Context, text: String) {
        val toast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        toast.show()
    }

    fun defaultLongToast(context: Context, text: String) {
        val toast = Toast.makeText(context, text, Toast.LENGTH_LONG)
        toast.show()
    }

    fun successToast(context: Context, text: String) {
        val backgroundColor: Int = ContextCompat.getColor(context, R.color.toastSuccessBgColor)
        val textColor: Int = ContextCompat.getColor(context, R.color.toastSuccessTextColor)
        val toast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        val view = toast.view
        view?.background?.setColorFilter(backgroundColor, PorterDuff.Mode.SRC_IN)
        val toastText = view?.findViewById<TextView>(android.R.id.message)
        toastText?.setTextColor(textColor)
        toast.show()
    }

    fun longSuccessToast(context: Context, text: String) {
        val backgroundColor: Int = ContextCompat.getColor(context, R.color.toastSuccessBgColor)
        val textColor: Int = ContextCompat.getColor(context, R.color.toastSuccessTextColor)
        val toast = Toast.makeText(context, text, Toast.LENGTH_LONG)
        val view = toast.view
        view?.background?.setColorFilter(backgroundColor, PorterDuff.Mode.SRC_IN)
        val toastText = view?.findViewById<TextView>(android.R.id.message)
        toastText?.setTextColor(textColor)
        toast.show()
    }

    fun warningToast(context: Context, text: String) {
        val backgroundColor: Int = ContextCompat.getColor(context, R.color.toastWarningBgColor)
        val textColor: Int = ContextCompat.getColor(context, R.color.toastWarningTextColor)
        val toast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        val view = toast.view
        view?.background?.setColorFilter(backgroundColor, PorterDuff.Mode.SRC_IN)
        val toastText = view?.findViewById<TextView>(android.R.id.message)
        toastText?.setTextColor(textColor)
        toast.show()
    }

    fun longWarningToast(context: Context, text: String) {
        val backgroundColor: Int = ContextCompat.getColor(context, R.color.toastWarningBgColor)
        val textColor: Int = ContextCompat.getColor(context, R.color.toastWarningTextColor)
        val toast = Toast.makeText(context, text, Toast.LENGTH_LONG)
        val view = toast.view
        view?.background?.setColorFilter(backgroundColor, PorterDuff.Mode.SRC_IN)
        val toastText = view?.findViewById<TextView>(android.R.id.message)
        toastText?.setTextColor(textColor)
        toast.show()
    }

    fun errorToast(context: Context, text: String) {
        val backgroundColor: Int = ContextCompat.getColor(context, R.color.toastErrorBgColor)
        val textColor: Int = ContextCompat.getColor(context, R.color.toastErrorTextColor)
        val toast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        val view = toast.view
        view?.background?.setColorFilter(backgroundColor, PorterDuff.Mode.SRC_IN)
        val toastText = view?.findViewById<TextView>(android.R.id.message)
        toastText?.setTextColor(textColor)
        toast.show()
    }

    fun longErrorToast(context: Context, text: String) {
        val backgroundColor: Int = ContextCompat.getColor(context, R.color.toastErrorBgColor)
        val textColor: Int = ContextCompat.getColor(context, R.color.toastErrorTextColor)
        val toast = Toast.makeText(context, text, Toast.LENGTH_LONG)
        val view = toast.view
        view?.background?.setColorFilter(backgroundColor, PorterDuff.Mode.SRC_IN)
        val toastText = view?.findViewById<TextView>(android.R.id.message)
        toastText?.setTextColor(textColor)
        toast.show()
    }

    fun customToast(
        context: Context,
        text: String,
        backgroundColor: Int,
        textColor: Int,
        duration: Int
    ) {
        val toast = Toast.makeText(context, text, duration)
        val view = toast.view
        view?.background?.setColorFilter(backgroundColor, PorterDuff.Mode.SRC_IN)
        val toastText = view?.findViewById<TextView>(android.R.id.message)
        toastText?.setTextColor(textColor)
        toast.show()
    }
}