package com.api.listadecompras.ListaItem

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ItensAdicionado(){
  Card(
      modifier= Modifier
          .fillMaxWidth()
          .padding(10.dp),
  ) {
     ConstraintLayout(
         modifier = Modifier.padding(20.dp)
     ) {
        val(textNome,TextDescricao,BtDeleta) = createRefs()
         
         Text(text = "Nome:", modifier = Modifier.constrainAs(textNome){
             top.linkTo(parent.top, margin = 10.dp)
             start.linkTo(parent.start,margin=10.dp)
         }


         )
     }
  }
}
@Composable
@Preview
fun listaPreview(){
    ItensAdicionado()
}