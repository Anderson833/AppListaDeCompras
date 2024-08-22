package com.api.listadecompras.componentes

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import com.api.listadecompras.ui.theme.shapEditText


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun campoDeTexto(
    value: String,
    onValueChange:(String)-> Unit,
    modifier:Modifier,
    label:String,
    maxlines:Int,
    keyboardType: KeyboardType
){
    OutlinedTextField(
        value, onValueChange,
        modifier=modifier,
        maxLines = maxlines,
        label ={ Text(text = label,
            textDecoration = TextDecoration.None)},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            disabledTextColor = Color.Black,
            focusedBorderColor = Color.Blue,
            focusedLabelColor = Color.Blue,
            containerColor = Color.White,
            cursorColor = Color.Blue
        ),keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
        , shape = shapEditText.small
    )
}










