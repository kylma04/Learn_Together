package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    GreetingImage(
                        txtTitle = stringResource(R.string.txtTitle),
                        txtText1 = stringResource(R.string.txtText1),
                        txtText2 = stringResource(R.string.txtText2)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(txtTitle: String, txtText1: String, txtText2: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier,
    ) {
        Text(
            text = txtTitle,
            fontSize = 24.sp,
            modifier = Modifier.padding( 16.dp)
        )
        Text(
            text = txtText1,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Text(
            text = txtText2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun GreetingImage(txtTitle: String, txtText1: String, txtText2: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        val image = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        GreetingText(
            txtTitle = txtTitle,
            txtText1 = txtText1,
            txtText2 = txtText2,
            modifier = Modifier.padding(vertical = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LearnCardPreview() {
    LearnTogetherTheme {
        GreetingImage(
            txtTitle = stringResource(R.string.txtTitle),
            txtText1 = stringResource(R.string.txtText1),
            txtText2 = stringResource(R.string.txtText2)
        )
    }
}




// By KLM