package com.example.room.note

import androidx.lifecycle.LiveData
import com.example.room.db.Note
import com.example.room.db.NoteDao

class NoteRepository(private val noteDao: NoteDao) {


    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun addNote(note: Note) {
        noteDao.addNote(note)
    }

    suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }

    suspend fun updateNote(note: Note) {
        noteDao.updateNote(note)
    }


}