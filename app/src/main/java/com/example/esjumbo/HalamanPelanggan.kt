package com.example.esjumbo

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomerDetailsScreen(
    onConfirmButtonClicked: (String, String, String) -> Unit,
    onCancelButtonClicked: () -> Unit
){}
class HalamanPelanggan {
}