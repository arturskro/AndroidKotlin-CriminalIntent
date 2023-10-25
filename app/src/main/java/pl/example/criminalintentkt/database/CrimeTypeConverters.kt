package pl.example.criminalintentkt.database

import androidx.room.TypeConverter
import java.util.*

class CrimeTypeConverters {

    @TypeConverter
    fun fromDate(date: Date) : Long {
        return date.time
    }

    @TypeConverter
    fun toDate(millisSinceEpoch : Long) : Date {
        return Date(millisSinceEpoch)
    }
}