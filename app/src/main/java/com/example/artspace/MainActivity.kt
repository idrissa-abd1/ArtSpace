package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                ArtSpaceApp()
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    var currentScreen by remember { mutableStateOf(1) }
    when (currentScreen) {
        1 -> ArtworkWall(
            modifier = Modifier.fillMaxSize(),
            onNextClick = { currentScreen = 2 },
            onPreviousClick = { currentScreen = 3 }
        )
        2 -> ArtworkWall2(
            modifier = Modifier.fillMaxSize(),
            onNextClick = { currentScreen = 3 },
            onPreviousClick = { currentScreen = 1 }
        )
        3 -> ArtworkWall3(
            modifier = Modifier.fillMaxSize(),
            onNextClick = { currentScreen = 1 },
            onPreviousClick = { currentScreen = 2 }
        )
    }
}

@Composable
fun ArtworkWall(modifier: Modifier = Modifier, onNextClick: () -> Unit, onPreviousClick: () -> Unit) {
    val image = painterResource(id = R.drawable.itachi)
    Column(
        modifier = modifier
            .background(Color(0xFF546163))
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .padding(8.dp)
        ) {
            Image(
                painter = image,
                contentDescription = stringResource(R.string.itachi_uchiha),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(400.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.LightGray)
            )
        }

        Box(
            modifier = Modifier
                .padding(16.dp)
                .background(Color.LightGray)
                .clip(RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Column {
                Text(
                    text = stringResource(R.string.itachi_uchiha),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Itachi Uchiha (2024)",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = { onPreviousClick() }) {
                Text(text = "Previous")
            }

            Button(onClick = { onNextClick() }) {
                Text(text = "Next")
            }
        }
    }
}

@Composable
fun ArtworkWall2(modifier: Modifier = Modifier, onNextClick: () -> Unit, onPreviousClick: () -> Unit) {
    val image = painterResource(id = R.drawable.itachimoon)
    Column(
        modifier = modifier
            .background(Color(0xFF546163))
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFF872E00))
                .padding(8.dp)
        ) {
            Image(
                painter = image,
                contentDescription = stringResource(R.string.uchiha_moon),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(400.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.LightGray)
            )
        }

        Box(
            modifier = Modifier
                .padding(16.dp)
                .background(Color.LightGray)
                .clip(RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Column {
                Text(
                    text = stringResource(R.string.uchiha_moon),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Itachi Moon (2024)",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = { onPreviousClick() }) {
                Text(text = "Previous")
            }

            Button(onClick = { onNextClick() }) {
                Text(text = "Next")
            }
        }
    }
}

@Composable
fun ArtworkWall3(modifier: Modifier = Modifier, onNextClick: () -> Unit, onPreviousClick: () -> Unit) {
    val image = painterResource(id = R.drawable.sharingan)
    Column(
        modifier = modifier
            .background(Color(0xFF546163))
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFF872E00))
                .padding(8.dp)
        ) {
            Image(
                painter = image,
                contentDescription = stringResource(R.string.mangekyui_sharingan),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(400.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.LightGray)
            )
        }

        Box(
            modifier = Modifier
                .padding(16.dp)
                .background(Color.LightGray)
                .clip(RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Column {
                Text(
                    text = stringResource(R.string.mangekyui_sharingan),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Itachi Sharingan (2024)",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = { onPreviousClick() }) {
                Text(text = "Previous")
            }

            Button(onClick = { onNextClick() }) {
                Text(text = "Next")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}
