package com.example.myapplication4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(
    modifier: Modifier = Modifier){
    Column (
        modifier = Modifier.fillMaxSize()) {
        SectionHeader()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Kepada Yth :")
        Text(text = "Muhammad Zharfan")
        MainSection(
            judulparam = "Nama" , isiParam = "Muhammad Zharfan" )
        MainSection(judulparam = "Kelas", isiParam = "Kesenian")
        MainSection(judulparam = "NIM", isiParam = "20220140079")
        MainSection(judulparam = "KET", isiParam = "")
    }
}

@Composable
fun SectionHeader(){
     Box(modifier = Modifier
         .fillMaxWidth()
         .background(color = Color.LightGray)) {

         Row(modifier = Modifier.padding(all = 10.dp)) {
             Box(contentAlignment = Alignment.BottomEnd) {
                 Image(
                     painter = painterResource(id = R.drawable.logotutingtas),
                     contentDescription = "", Modifier.size(100.dp)
                 )
                 Modifier.size(100.dp)
             }
             Icon(Icons.Filled.Check, contentDescription = null)
             Modifier
                 .padding(end = 13.dp)
                 .size(25.dp)


         Column(Modifier.padding(15.dp)) {
             Text(
                 text = "Teknologi Informasi",
                 color = Color.Black
             )
             Spacer(Modifier.padding(3.dp))
             Text(
                 text = "Universitas Muhammadiyah Yogyakarta",
                 color = Color.Black
             )
         }
         }
     }
}

@Composable
fun MainSection(judulparam: String, isiParam: String){
    Column(horizontalAlignment = Alignment.Start) {
        Row (Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = judulparam, modifier = Modifier.weight(0.0f))
            Text(text = ":")
            Text(text = isiParam, modifier = Modifier.weight(2f))
        }
    }
}