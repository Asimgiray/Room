package com.example.room.note

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.room.db.Note
import com.example.room.db.NoteDatabase
import kotlinx.coroutines.launch

class NoteViewModel : ViewModel() {

    lateinit var allNotes : LiveData<List<Note>>
    private lateinit var repository: NoteRepository

    fun init(context: Context) {
        val dao = NoteDatabase.getDatabaseInstance(context).getNoteDao()
        repository = NoteRepository(dao)
        allNotes = repository.allNotes
    }

    fun addNote(note: Note) = viewModelScope.launch {
        repository.addNote(note)
    }

    fun deleteNote(note: Note) = viewModelScope.launch {
        repository.deleteNote(note)
    }

    fun updateNote(note: Note) = viewModelScope.launch {
        repository.updateNote(note)
    }



}