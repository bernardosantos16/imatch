package br.com.bernardo.imatch.ui.theme.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.bernardo.imatch.R

@Composable
fun AddUser(userImage: ImageVector, username: String) {
    Row(
        modifier = Modifier
            //.padding(6.dp)
        ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = userImage /*Icons.Rounded.AccountCircle*/, contentDescription = "User icon")
        Spacer(modifier = Modifier.width(6.dp))
        Text(text = username)
        Spacer(modifier = Modifier.width(10.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Delete, contentDescription = "delete")
        }


    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewAddUser() {
    AddUser(Icons.Rounded.AccountCircle, "Bernardo dos Santos")
}

@Preview(showBackground = true)
@Composable
private fun PreviewColumnUser() {
    Row {
        Column {
            AddUser(Icons.Rounded.AccountCircle, "Bernardo dos Santos")
            AddUser(Icons.Rounded.AccountCircle, "João Silva")
            AddUser(Icons.Rounded.AccountCircle, "José Teste da Costa")
        }

    }

}