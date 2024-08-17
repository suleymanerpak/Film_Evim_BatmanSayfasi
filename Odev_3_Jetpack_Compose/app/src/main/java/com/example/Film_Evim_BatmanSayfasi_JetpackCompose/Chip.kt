package com.example.Film_Evim_BatmanSayfasi_JetpackCompose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.Film_Evim_BatmanSayfasi_JetpackCompose.ui.theme.AnaRenk
import com.example.Film_Evim_BatmanSayfasi_JetpackCompose.ui.theme.AnaRenkDark
import com.example.Film_Evim_BatmanSayfasi_JetpackCompose.ui.theme.YaziRenk1

@Composable
fun Chip(icerik : String, darkTheme : Boolean = isSystemInDarkTheme()){
    Button(onClick = {}, colors = ButtonDefaults.buttonColors(containerColor = if(darkTheme) AnaRenkDark else AnaRenk, contentColor = YaziRenk1))
    {
        Text(text = icerik)
    }
}