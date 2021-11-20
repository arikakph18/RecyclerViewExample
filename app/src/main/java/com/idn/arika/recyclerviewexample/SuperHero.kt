package com.idn.arika.recyclerviewexample

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize

@VersionedParcelize
data class SuperHero(
    val name: String,
    val desc: String
): Parcelable