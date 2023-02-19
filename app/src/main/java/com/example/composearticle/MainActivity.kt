package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val headerImg: Painter = painterResource(id = R.drawable.bg_compose_background)
   Column {

       Row {
           Image(painter = headerImg, contentDescription = "Header Image")
       }

       Column {
           Text(text = stringResource(R.string.article_title),
               Modifier.padding(16.dp),
               fontWeight = FontWeight.Bold,
               fontSize = 24.sp,


           );
           Text(text = stringResource(R.string.body_p1),
               Modifier.padding(16.dp),
               textAlign = TextAlign.Justify

           );
           Text(text = stringResource(R.string.body_p2),
               Modifier.padding(16.dp),
               textAlign = TextAlign.Justify);
       }
   }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        Greeting("Android")
    }
}