package com.example.esjumbo

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomerDetailsScreen(
    onConfirmButtonClicked: (String, String, String) -> Unit,
    onCancelButtonClicked: () -> Unit
){
    var namaPelanggan by remember { mutableStateOf("") }
    var nomorTelepon by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("")
}
class HalamanPelanggan {
}}