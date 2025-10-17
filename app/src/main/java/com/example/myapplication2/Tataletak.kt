package com.example.myapplication2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication2.R

@Composable
fun TataLetakBoxColumnRow(modifier: Modifier) {
    Column(
        modifier = modifier
            .padding(top = 30.dp, start = 20.dp, end = 20.dp)
    ) {
        Text(text = "Nim: 123456789")
        Text(text = "Nama: Mahasiswa 1")
        Text(text = "Kelas: IF-1")
    }
}

@Composable
fun TataLetakColumn(modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Kolom 1")
        Text(text = "Kolom 2")
        Text(text = "Kolom 3")
        Text(text = "Kolom 4")
    }
}

@Composable
fun TataLetakRow(modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Row 1")
        Text(text = "Row 2")
        Text(text = "Row 3")
    }
}

@Composable
fun TataLetakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box Center")
    }
}

@Composable
fun TataLetakBoxColumn(modifier: Modifier) {
    Column {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column {
                Text(text = "Baris 1 Kolom 1")
                Text(text = "Baris 1 Kolom 2")
            }
            Column {
                Text(text = "Baris 1 Kolom 3")
                Text(text = "Baris 1 Kolom 4")
            }
        }
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column {
                Text(text = "Baris 2 Kolom 1")
                Text(text = "Baris 2 Kolom 2")
            }
            Column {
                Text(text = "Baris 2 Kolom 3")
                Text(text = "Baris 2 Kolom 4")
            }
        }
    }
}

@Composable
fun TataLetakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.fototua)
    Column {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column {
                Text(text = "Kolom1-Baris1")
                Text(text = "Kolom1-Baris2")
                Text(text = "Kolom1-Baris3")
            }
            Column {
                Text(text = "Kolom2-Baris1")
                Text(text = "Kolom2-Baris2")
                Text(text = "Kolom2-Baris3")
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(130.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "Hello Android!",
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}
