package com.api.listadecompras.ListaItem

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.api.listadecompras.R

@Composable
fun ItensAdicionado(){
  Card(
      colors = CardDefaults.cardColors(
          containerColor = Color.White
      ),
      modifier= Modifier
          .fillMaxWidth()
          .padding(15.dp)
  ) {
     ConstraintLayout(
         modifier = Modifier.padding(20.dp)
     ) {
        val(textNome,TextDescricao,BtDeleta) = createRefs()
         
         Text(text = "Nome: Ovos", modifier = Modifier.constrainAs(textNome){
             top.linkTo(parent.top, margin = 10.dp)
             start.linkTo(parent.start,margin=10.dp)
         }
         )
         Text(text = "Descrição: Uma bandeija de ovos", modifier = Modifier.constrainAs(TextDescricao){
             top.linkTo(textNome.bottom, margin = 10.dp)
             start.linkTo(parent.start,margin=10.dp)
         }
         )

         IconButton(
             onClick = {  },
             modifier=Modifier.constrainAs(BtDeleta){
                 top.linkTo(TextDescricao.bottom,margin=10.dp)
                 start.linkTo(TextDescricao.end,margin=10.dp)
                 end.linkTo(parent.end, margin = 10.dp)
                 bottom.linkTo(parent.bottom, margin = 10.dp)
             }
         ) {
             Image(imageVector = ImageVector.vectorResource(id = R.drawable.delete_24), contentDescription = null)
         }
     }
  }
}
@Composable
@Preview
fun listaPreview(){
    ItensAdicionado()
}