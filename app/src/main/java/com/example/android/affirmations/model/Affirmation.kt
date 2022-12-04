package com.example.android.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//создали дата класс высказывания который принимает строковый ресурс с высказываниями
data class Affirmation(
    @StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int
) {

}
