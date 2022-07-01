package com.gultendogan.todoapplication.data

import androidx.room.TypeConverter
import com.gultendogan.todoapplication.data.models.Priority

class Converter {
    @TypeConverter
    fun fromPriority(priority: Priority): String{
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }
}