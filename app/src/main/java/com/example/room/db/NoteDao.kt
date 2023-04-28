package com.example.room.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert
    suspend fun addNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("Select * from $tableName order by id ASC")
    fun getAllNotes(): LiveData<List<Note>>

    @Update
    suspend fun updateNote (note: Note)

}