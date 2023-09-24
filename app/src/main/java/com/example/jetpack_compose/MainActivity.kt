package com.example.jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose.ui.theme.Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeImage(getString(R.string.Heading1),getString(R.string.para1),getString(R.string.para2))
                }
            }
        }
    }
}

@Composable
fun ComposeText(title: String,info:String,info2:String, modifier: Modifier = Modifier) {

    Column {
        Text(
            text = title,
            modifier = modifier.padding(16.dp),
        fontSize=24.sp,
        textAlign= TextAlign.End
        )
        Text(
            text = info,
            modifier = modifier.padding(
                start=16.dp,
                top=10.dp,
                bottom=10.dp,
                end=16.dp
            ),
            textAlign=TextAlign.Justify
        )
        Text(
            text=info2,
            modifier=modifier.padding(
                start=16.dp,
                top=10.dp,
                bottom=10.dp,
                end=16.dp
            ),
            textAlign=TextAlign.Justify
        )
    }
}
@Composable
fun ComposeImage(title:String,info:String,info2:String,modifier:Modifier=Modifier) {
    val image= painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        ComposeText(title = title,
            info =info ,
            info2 = info2,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true,
name="andriod info")
@Composable
fun GreetingPreview() {
    Jetpack_ComposeTheme {
        ComposeImage(stringResource(id =R.string.Heading1 ), stringResource(id =R.string.para1 ), stringResource(id = R.string.para2))
    }
}