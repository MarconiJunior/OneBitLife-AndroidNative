package com.marconi.onebitlife

import android.content.Context
import android.content.Intent

object Util {
    fun openActivity(context: Context, activityClass: Class<*>) {
        val intent = Intent(context, activityClass)
        context.startActivity(intent)
    }
}