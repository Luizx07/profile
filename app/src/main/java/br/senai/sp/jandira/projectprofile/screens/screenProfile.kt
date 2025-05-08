package br.senai.sp.jandira.projectprofile.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.projectprofile.R


@Composable
fun screenProfile(){
    Column() {
        Box(
            modifier = Modifier
                .height(350.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp,
                        bottomStart = 20.dp,
                        bottomEnd = 20.dp
                    )
                ),
            contentAlignment = Alignment.BottomCenter
        ){
            Image(
                painter = painterResource(R.drawable.fundo),
                contentDescription = "background site",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(40.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "",
                        tint = Color.White
                    )
                    Text(
                        text = "Details",
                        color = Color.White,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(horizontal = 120.dp)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(10.dp)
                ) {
                    Card(
                        modifier = Modifier
                            .width(80.dp)
                            .height(80.dp),
                        shape = RoundedCornerShape(50.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.careca),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                        )
                    }
                    Text(
                        text = "Luiz Careca",
                        color = Color.White,
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 15.dp)
                    )
                    Text(
                        text = "product manager",
                        fontSize = 13.sp,
                        color = Color.LightGray,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Card(
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(15.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        border = BorderStroke(
                            width = 2.dp,
                            color = Color(0xFFF2F2F2)
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.envelope),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(25.dp)
                                    .height(25.dp)
                                    .padding(bottom = 5.dp)
                            )
                            Text(
                                text = "Email",
                                color = Color(0xFFF2F2F2),
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Thin,
                                fontSize = 10.sp
                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(15.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        border = BorderStroke(
                            width = 2.dp,
                            color = Color(0xFFF2F2F2)
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.telefone),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(25.dp)
                                    .height(25.dp)
                                    .padding(bottom = 5.dp)
                            )
                            Text(
                                text = "Call",
                                color = Color(0xFFF2F2F2),
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Thin,
                                fontSize = 10.sp
                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(15.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        border = BorderStroke(
                            width = 2.dp,
                            color = Color(0xFFF2F2F2)
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.whatsapp),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(25.dp)
                                    .height(25.dp)
                                    .padding(bottom = 5.dp)
                            )
                            Text(
                                text = "Whatsapp",
                                color = Color(0xFFF2F2F2),
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Thin,
                                fontSize = 10.sp
                            )
                        }

                    }
                    Card(
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(15.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        border = BorderStroke(
                            width = 2.dp,
                            color = Color(0xFFF2F2F2)
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.estrela),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(25.dp)
                                    .height(25.dp)
                                    .padding(bottom = 5.dp)
                            )
                            Text(
                                text = "Favorite",
                                color = Color(0xFFF2F2F2),
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Thin,
                                fontSize = 10.sp
                            )
                        }

                    }
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
        ) {
            Column(
                modifier = Modifier
                    .padding(15.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.envelope),
                        contentDescription = "",
                        modifier = Modifier
                            .width(25.dp)
                            .height(25.dp)
                    )
                    Text(
                        text = "Email",
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(horizontal = 30.dp)
                        .padding(top = 10.dp)
                        .padding(bottom = 15.dp)
                ) {
                    Text(
                        text = "Official",
                        color = Color.LightGray,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Luiz.manager@example.com",
                        color = Color.Black,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                    Text(
                        text = "Personal",
                        color = Color.LightGray,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier
                            .padding(top = 15.dp)
                    )
                    Text(
                        text = "LuizCareca@example.com",
                        color = Color.Black,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }
                HorizontalDivider()
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.telefone),
                        contentDescription = "",
                        modifier = Modifier
                            .width(25.dp)
                            .height(25.dp)
                    )
                    Text(
                        text = "Phone number",
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(horizontal = 30.dp)
                        .padding(top = 10.dp)
                        .padding(bottom = 15.dp)
                ) {
                    Text(
                        text = "Mobile",
                        color = Color.LightGray,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "(209) 555-0104",
                        color = Color.Black,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }
                HorizontalDivider()
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(top = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pessoas),
                        contentDescription = "",
                        modifier = Modifier
                            .width(25.dp)
                            .height(25.dp)
                    )
                    Text(
                        text = "Team",
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp)
                        .padding(top = 10.dp)
                        .padding(bottom = 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Project Operation Team"
                    )
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .width(40.dp)
                            .height(40.dp),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color(0xFF223671)
                        )
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                }
                HorizontalDivider()
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(top = 15.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.pessoas),
                        contentDescription = "",
                        modifier = Modifier
                            .width(25.dp)
                            .height(25.dp)
                    )
                    Text(
                        text = "Leads by",
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp)
                        .padding(top = 10.dp)
                        .padding(bottom = 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Project Operation Team"
                    )
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .width(40.dp)
                            .height(40.dp),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color(0xFF223671)
                        )
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.adicionar),
                            contentDescription = "",
                            modifier = Modifier
                                .width(25.dp)
                                .height(25.dp)
                        )
                        Text(
                            text = "Add to contact",
                            color = Color(0xFF223671),
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .padding(horizontal = 10.dp)
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.compartilhar),
                        contentDescription = "",
                        modifier = Modifier
                            .width(25.dp)
                            .height(25.dp)
                    )
                }

            }
        }
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL_7)
@Composable
private fun screenProfilePreview(){
    screenProfile()
}