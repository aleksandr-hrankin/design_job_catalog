package ua.antibyte.designjobcatalog.common

import android.content.res.Resources

fun dpToPx(dp: Int) = (Resources.getSystem().displayMetrics.density * dp).toInt()