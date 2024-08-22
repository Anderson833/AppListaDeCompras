package com.api.listadecompras.componentes

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Botao(
    onclick: () -> Unit,
   texto:String,
   modifier: Modifier
){
   Button(
       onclick,
       modifier,
       colors = ButtonDefaults.buttonColors(
           containerColor = Color.Black,
           contentColor = Color.White
       )
   ) {
       Text(text = texto, fontWeight = FontWeight.Bold, fontSize = 20.sp)
   }
}