/*
 * Copyright (c) 2019 by Delphix. All rights reserved.
 */

package io.titandata.models

import com.google.gson.annotations.SerializedName

data class VolumeMountRequest(
    @SerializedName("Name")
    var name: String? = null,
    @SerializedName("ID")
    var ID: String? = null
)