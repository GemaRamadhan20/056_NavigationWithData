package com.example.esjumbo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.esjumbo.component.FormatLabelHarga
import com.example.esjumbo.data.OrderUIState

@Composable
fun HalamanDua (
    orderUiState: OrderUIState,
    onCancelButtonCLicked: () -> Unit,
    //onSendButtonClicked: (String, String) -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        Pair("Nama Pelanggan", orderUiState.namaPelanggan),
        Pair("Nomor Telepon", orderUiState.nomorTelepon),
        Pair("Alamat", orderUiState.alamat),
        Pair("Jumlah", orderUiState.jumlah.toString()),
        Pair("Rasa", orderUiState.rasa),
        Pair("Harga", orderUiState.harga)
    )
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            items.forEach { item -> Column {
                Text(item.first.uppercase())
                Text(text = item.second.toString(),
                    fontWeight = FontWeight.Bold)
            }
                Divider(thickness = dimensionResource(R.dimen.thickness_divider))
            }
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
            FormatLabelHarga(
                subtotal = orderUiState.harga,
                modifier = Modifier.align(Alignment.End))
        }
        Row(modifier = Modifier
            .weight(1f, false)
            .padding(dimensionResource(R.dimen.padding_medium))
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
            ) {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { }
                ) {
                    Text(stringResource(R.string.send))
                }
                OutlinedButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onCancelButtonCLicked
                ) {
                    Text(stringResource(R.string.cancel))
                }
            }
        }
    }
}