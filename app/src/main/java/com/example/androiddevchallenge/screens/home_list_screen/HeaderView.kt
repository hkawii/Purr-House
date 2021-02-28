/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.screens.home_list_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Composable
fun HeaderView() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(start = 30.dp, end = 30.dp, bottom = 30.dp, top = 50.dp)
    ) {

        UserDetailsView(
            name = "Earl Kim",
            title = "Cairo, Egypt",
            modifier = Modifier.weight(3f)
        )

        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.logo),
            contentDescription = "Logo Image",
            modifier = Modifier
                .weight(1f)
                .height(20.dp)
        )
    }
}
