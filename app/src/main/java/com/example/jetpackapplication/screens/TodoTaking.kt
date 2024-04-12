package com.example.jetpackapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.jetpackapplication.R

//@Preview(showBackground = true , name = "todo_taking" , showSystemUi = true)
@Composable
fun TodoTaking(navController: NavHostController) {
    var todoName by rememberSaveable { mutableStateOf("") }
    var todoDescription by rememberSaveable { mutableStateOf("") }
    Column(modifier = Modifier.padding(20.dp) ,
        horizontalAlignment = Alignment.CenterHorizontally) {
           Image(painter = painterResource(id = R.drawable.undraw_selection_re_ycpo), contentDescription = "",
               modifier = Modifier
                   .width(200.dp)
                   .height(200.dp))
        OutlinedTextField(
            value = todoName,
            onValueChange = { todoName = it },
            label = { Text("Todo Name") },
            modifier =  Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = todoDescription,
            onValueChange = { todoDescription = it },
            label = { Text("Description") },
            modifier =  Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Add Todo")
        }
    }
}