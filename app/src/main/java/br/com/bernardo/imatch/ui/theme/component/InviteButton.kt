package br.com.bernardo.imatch.ui.theme.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Preview(showBackground = true)
@Composable
fun InviteButton() {
    var isDisplayDialog by remember {
        mutableStateOf(false)
    }
    var text by remember {
        mutableStateOf("")
    }
    if (isDisplayDialog){
        Dialog(onDismissRequest = { isDisplayDialog = false }) {
            Card(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.elevatedCardElevation()
            ) {
                Column(
                    modifier = Modifier
                        /*.fillMaxSize()*/,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Icon(
                        Icons.Outlined.DateRange,
                        contentDescription = "Localized description",
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    Text(
                        text = "Confirmar Agendamento",
                        modifier = Modifier
                            .padding(8.dp),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    //Spacer(modifier = Modifier.size(10.dp))
                    Text(
                        text = "Adicione seu convidados",
                        modifier = Modifier.padding(16.dp)
                    )
                    OutlinedTextField(
                        value = text,
                        onValueChange = {text = it},
                        label = { Text("convidado") }

                    )


                    Row(
                        Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        TextButton(onClick = { isDisplayDialog = false },
                            modifier = Modifier
                                .padding(8.dp)

                        ) {
                            Text(text = "cancelar")
                        }
                        TextButton(onClick = {
                            /*todo*/
                            isDisplayDialog = false
                        },
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text(text = "confirmar")
                        }
                    }
                }
            }
        }
    }
    Button(onClick = { isDisplayDialog = true }) {
        Text(text = "9:00")
    }
}