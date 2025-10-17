package com.example.myapplication2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen 1")
        Text(text = "Komponen 2")
        Text(text = "Komponen 3")
        Text(text = "Komponen 4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen 1")
        Text(text = "Komponen 2")
        Text(text = "Komponen 3")
        Text(text = "Komponen 4") // Nilai ini disimpulkan dari struktur Row(SpaceEvenly)
    }
}

@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 2")
        Text(text = "Text 4") // Disimpulkan
        Text(text = "Text 5") // Disimpulkan
    }
}

// --- TataletakRowColumn (Page 2) ---

@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // Kolom Pertama
        Column {
            Text(text = "Komponen 1 Kolom 1")
            Text(text = "Komponen 2 Kolom 1")
            Text(text = "Komponen 3 Kolom 1")
        }
        // Kolom Kedua
        Column {
            Text(text = "Komponen 1 Kolom 2") // Disimpulkan
            Text(text = "Komponen 2 Kolom 2") // Disimpulkan
            Text(text = "Komponen 3 Kolom 2") // Disimpulkan
        }
    }
}

// --- TataletakBoxColumnRow (Page 2, 3) ---

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    // Asumsi: R.drawable.notasinaton ada di proyek Anda.
    val gambar = painterResource(id = R.drawable.notasinaton)

    Column(modifier = Modifier.fillMaxWidth()) {

        // Bagian Atas: Column berisi dua Row
        Column {
            // Row 1
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col 1 Row 1 Komponen 1")
                Text(text = "Col 1 Row 1 Komponen 2")
                Text(text = "Col 1 Row 1 Komponen 3")
            }

            // Row 2
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col 1 Row 2 Komponen 1")
                Text(text = "Col 1 Row 2 Komponen 2")
                Text(text = "Col 1 Row 2 Komponen 3")
            }
        }

        Spacer(modifier = Modifier.height(height = 10.dp)) // Spasi

        // Box Bagian Bawah
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = "Notasi", // Deskripsi yang lebih baik
                contentScale = ContentScale.Fit
            )
            Text(
                text = "My Compose",
                fontSize = 50.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}
2. File: MainActivity.kt
Berikut adalah rekonstruksi dari MainActivity.kt yang menunjukkan cara memanggil fungsi TataletakBoxColumnRow di dalam Scaffold.

Kotlin

package com.example.mylayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mylayout.ui.theme.MyLayoutTheme // Asumsi Theme Anda

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TataletakBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Preview Opsional
@Preview(showBackground = true)
@Composable
fun AppPreview() {
    MyLayoutTheme {
        TataletakBoxColumnRow()
    }
}
