package com.absinthe.libchecker.database

import android.content.pm.ApplicationInfo
import androidx.lifecycle.MutableLiveData
import com.absinthe.libchecker.database.entity.RuleEntity
import java.util.concurrent.ConcurrentHashMap
import java.util.regex.Pattern

object AppItemRepository {
    val allApplicationInfoItems: MutableLiveData<List<ApplicationInfo>> = MutableLiveData()
    var trackItemsChanged = false
    var shouldRefreshAppList = false
    var rulesRegexList = ConcurrentHashMap<Pattern, RuleEntity>()
}