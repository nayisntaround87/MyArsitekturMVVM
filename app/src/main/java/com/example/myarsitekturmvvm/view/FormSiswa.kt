package com.example.myarsitekturmvvm.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import java.lang.reflect.Modifier

class FormSiswa {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun FormSiswa(
        //edit 1 : parameter pilihanjk dan onSubmitButtonClicked
        pilihanJk: List<String> ,
        onSubmitButtonClicked: (MutableList<String>) -> Unit,
        modifier: Modifier = Modifier

    ) {
        //edit 2 : tambahkan 4 variable dibawah ini
        var txtNama by rememberSaveable { mutableStateOf("") }
        var txtAlamat by rememberSaveable { mutableStateOf("") }
        var txtGender by rememberSaveable { mutableStateOf("") }
        val listData: MutableList<String> = mutableListOf(txtNama,txtGender,txtAlamat)

        Scaffold (modifier = Modifier,
            { TopAppBar(title = { Text(stringResource(id = R.string.app_name), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.purple_500))
        )
    }) { isiRuang ->

        }
}