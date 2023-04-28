package com.example.room.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = tableName)

class Note(
    @ColumnInfo(name = "noteTitle") val noteTitle: String,
    @ColumnInfo(name = "noteDesc") val noteDesc: String,
    @ColumnInfo(name = "noteImage") val noteImage: String
) : java.io.Serializable {
    @PrimaryKey(autoGenerate = true) var id = 0
}