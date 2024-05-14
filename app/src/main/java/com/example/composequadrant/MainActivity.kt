package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeShow()
                }
            }
        }
    }
}

@Composable
fun ComposeText(heading: String, para: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
        ) {
        Column{
            Text(
                text = heading,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(
                        bottom = 16.dp
                    )
            )
            Text(
                text = para,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Composable
fun ComposeShow(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {

            ComposeText(
                heading = stringResource(R.string.heading_1),
                para = stringResource(R.string.para1),
                modifier = Modifier
                    .weight(1f)
                    .background(color = Color(0xFFEADDFF))
                    .padding(16.dp)

            )

            ComposeText(
                heading = stringResource(R.string.h2),
                para = stringResource(R.string.p2),
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            )
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            ComposeText(
                heading = stringResource(R.string.h3),
                para = stringResource(R.string.p3),
                modifier = Modifier
                    .weight(1f)
                    .background(color = Color(0xFFB69DF8))
                    .padding(16.dp)
            )
            ComposeText(
                heading = stringResource(R.string.h4),
                para = stringResource(R.string.p4),
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeShow()
    }
}