package com.example.Film_Evim_BatmanSayfasi_JetpackCompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.Film_Evim_BatmanSayfasi_JetpackCompose.ui.theme.AnaRenk
import com.example.Film_Evim_BatmanSayfasi_JetpackCompose.ui.theme.AnaRenkDark
import com.example.Film_Evim_BatmanSayfasi_JetpackCompose.ui.theme.Odev_3_Jetpack_ComposeTheme
import com.example.Film_Evim_BatmanSayfasi_JetpackCompose.ui.theme.YaziRenk1
import com.example.Film_Evim_BatmanSayfasi_JetpackCompose.ui.theme.dmfont
import com.example.odev_3_jetpack_compose.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Odev_3_Jetpack_ComposeTheme {
               Anasayfa()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Anasayfa(darkTheme: Boolean = isSystemInDarkTheme()) {

    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = { Text(text = "Film Evim", fontFamily = dmfont) },
            colors = TopAppBarDefaults.topAppBarColors(if(darkTheme) AnaRenkDark else AnaRenk,
                titleContentColor = YaziRenk1,)) }
    )
    {paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Image(painter = painterResource(id = R.drawable.batman), contentDescription ="",modifier = Modifier.size(300.dp))
            Text(text = stringResource(id = R.string.filmBaslik) , color = YaziRenk1, fontWeight = FontWeight.Bold, fontSize = 30.sp )
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly)
            {
                Chip(icerik = stringResource(id = R.string.filmMatch))
                Chip(icerik = stringResource(id = R.string.filmYili))
                Chip(icerik = stringResource(id = R.string.filmUzunlugu))
                Chip(icerik = stringResource(id = R.string.filmGoruntuKalitesi))
            }
            Text(text = stringResource(id = R.string.filmAciklama1) , color = YaziRenk1, fontSize = 15.sp )
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(containerColor = AnaRenk, contentColor = YaziRenk1)) { Text(text = stringResource(id = R.string.filmButonYazi), fontSize =25.sp)}

        }

    }

}

@Preview(showBackground = true, locale = "tr")
@Composable
fun GreetingPreview() {
    Odev_3_Jetpack_ComposeTheme {
        Anasayfa()
    }
}