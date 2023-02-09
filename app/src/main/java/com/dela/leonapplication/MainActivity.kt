package com.dela.leonapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dela.leonapplication.ui.theme.LeonApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LeonApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
   fun leoin(name:String,title:String){
       Column() {

           Text(text = name)
           Text(text = title)
       }
   }
@Composable
fun theRows(phone:Int,email:String,linkedin:String){
Column() {
    Row() {

        Text(text =phone )
    }
    Row() {
        Text(text = email)
    }
    Row() {
        Text(text = linkedin)
    }
}
}

@Composable
fun firstImage(){
    ima
}

@Composable
fun firstImage(){

}

@Composable
fun firstImage(){

}
@Composable
fun firstImage(){

}