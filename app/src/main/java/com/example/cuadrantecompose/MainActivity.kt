package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadranteCompose()
                }
            }
        }
    }
}

@Composable
fun CuadranteCompose() {
    Column(Modifier.fillMaxSize()){
        Row(Modifier.weight(1f)){
            Cuadrante(
                titulo = stringResource(R.string.tituloTexto),
                descripcion = stringResource(R.string.textoTexto),
                colorFondo = colorResource(R.color.moradoTexto),
                modifier = Modifier.weight(1f)
            )
            Cuadrante(
                titulo = stringResource(R.string.tituloImagen),
                descripcion = stringResource(R.string.textoImagen),
                colorFondo = colorResource(R.color.moradoImagen),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Cuadrante(
                titulo = stringResource(R.string.tituloRow),
                descripcion = stringResource(R.string.textoRow),
                colorFondo =  colorResource(R.color.moradoRow),
                modifier = Modifier.weight(1f)
            )
            Cuadrante(
                titulo = stringResource(R.string.tituloColumna),
                descripcion = stringResource(R.string.textoColumna),
                colorFondo = colorResource(R.color.moradoColumn),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun Cuadrante(
    titulo: String,
    descripcion: String,
    colorFondo: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorFondo)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        CuadranteCompose()
    }
}