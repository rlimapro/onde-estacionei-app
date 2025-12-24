package io.github.rlimapro.ondeestacionei.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.github.rlimapro.ondeestacionei.ui.ParkingViewModel
import io.github.rlimapro.ondeestacionei.ui.components.ParkingItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HistoryScreen(viewModel: ParkingViewModel) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text("Histórico de Estacionamento")
            })
        }
    ) { padding ->
        if (state.locations.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = androidx.compose.ui.Alignment.Center
            ) {
                Text("Nenhum local salvo ainda.")
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .padding(padding)
                    .padding(horizontal = 16.dp)
            ) {
                items(state.locations) { location ->
                    ParkingItem(
                        location = location,
                        onDelete = { viewModel.deleteLocation(location) }
                    )
                }
            }
        }
    }
}