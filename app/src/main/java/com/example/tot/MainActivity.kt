package com.example.tot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tot.ui.theme.TotóTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TotóTheme {

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable

fun CartãoConvite() {
    Box(

    ) {

        Image(
            painterResource(id = R.drawable.montanha),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 1.2F,
            modifier = Modifier.fillMaxSize()
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Column(

                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxSize()


            ) {

                ApresentaçãoCartão()
                Rodape()


            }

            @Composable

            fun ApresentaçãoCartão() {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(top = 150.dp)

                ) {
                Image(
                    painterResource(id = R.drawable.git),
                    contentDescription = null,
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .size(60.dp)
                        .border(
                            BorderStroke(5.dp, color = Color.Black),
                            CircleShape
                        )
                        .padding(5.dp)
                        .clip(CircleShape)

                )

                    Text(
                        text = "Rafael Pinheiro Costa ",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Professor de TI",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.DarkGray

                    )

                }

            }

            @Composable
            fun Rodape() {
                Column {
                    Contato(
                        id = R.drawable.telefone,
                        contato = "(11) 95555-5555"
                    )
                    Contato(
                        id = R.drawable.email,
                        contato = "xxxxxx@gmail.com"
                    )
                    Contato(
                        id = R.drawable.git,
                        contato = "CaioSilva26"
                    )
                }
            }

            @Composable
            fun Contato(id: Int, contato: String) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = id),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(40.dp)
                            .border(
                                BorderStroke(2.dp, Color.Black),
                                CircleShape
                            )
                            .padding(2.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = contato,
                        fontSize = 15.sp
                    )
                }
                Spacer(modifier = Modifier.size(20.dp))
            }
















            }
        }
    }
}




