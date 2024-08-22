package com.api.listadecompras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.api.listadecompras.ui.theme.ListaDeComprasTheme
import com.api.listadecompras.view.adicionarLista

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaDeComprasTheme {
          val navController = rememberNavController()
         NavHost(navController = navController, startDestination = "adicionaLista" ){
             composable(
                 route ="adicionaLista"
             ){
                 adicionarLista(navController)
             }

         }

            }
        }
    }
}
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListaDeComprasTheme {
        Greeting("Android")
    }
}*/