package com.api.listadecompras.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.api.listadecompras.componentes.Botao
import com.api.listadecompras.componentes.campoDeTexto


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
        /**
         *  Aqui é criado uma view chamada adicinarLista
         */
fun adicionarLista(
    navController: NavController
) {
    // Na linha abaixo no Scaffold é construido  o corpo da view
  Scaffold (
      topBar = {
          TopAppBar(title = { Text(text = "Adicionar itens:",
              fontSize = 18.sp,
              fontWeight = FontWeight.Bold,
              color = Color.White
          )
          }, colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
              containerColor = Color.Blue,
          ) )
      }

  ){
       // Aqui é uma variável para armazenar um dado
      var nomeItem by remember{
          mutableStateOf("")
      }
      // Aqui é uma variável para armazenar um dado
      var campoDescricao by remember{
          mutableStateOf("")
      }
      // Na linha abaixo tem uma coluna que fazer os conteúdos da view se organizar um abaixo do outro
     Column (
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
     ){
         // Na linha abaixo tem um arquivo de campo de texto que foi criado para servi como métodos
        campoDeTexto(  // Campo de texto Nome do item
            value = nomeItem,
            onValueChange ={
                nomeItem=it
             } ,
           modifier = androidx.compose.ui.Modifier
               .fillMaxWidth()
               .padding(20.dp, 70.dp, 20.dp, 0.dp),
             label = "Nome do Item:",
             maxlines = 1,
             keyboardType = KeyboardType.Text
         )
         // Na linha abaixo tem um arquivo de campo de texto que foi criado para servi como métodos
         campoDeTexto(    // Campo de texto de descrição
             value = campoDescricao,
             onValueChange ={
                 campoDescricao=it
             } ,
             modifier = androidx.compose.ui.Modifier
                 .fillMaxWidth()
                 .height(150.dp)
                 .padding(20.dp, 30.dp, 20.dp, 0.dp),
             label = "Descrição:",
             maxlines = 3,
             keyboardType = KeyboardType.Text
         )
         /// Na linha abaixo está um botão de salva
         Botao(onclick = { }, texto = "Salvar", modifier = Modifier.fillMaxWidth().height(80.dp).padding(20.dp))
     }

  }


}




