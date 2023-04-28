package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.room.databinding.ActivityMainBinding
import com.example.room.db.Note
import com.example.room.note.NoteViewModel

class MainActivity : AppCompatActivity() {


    private val noteViewModel by viewModels<NoteViewModel>()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)




        val name: String = "test"

        val bool = name.equals("name", true)

        Log.d("Extension", name.isName().toString())














        /*lifecycleScope.launch(Dispatchers.IO) {
            Log.d("Thread1", Thread.currentThread().name)
        }

        lifecycleScope.launch(Dispatchers.Main) {
            Log.d("Thread2", Thread.currentThread().name)
        }

        lifecycleScope.launch(Dispatchers.Unconfined) {
            Log.d("Thread3", Thread.currentThread().name)
        }

        lifecycleScope.launch(Dispatchers.Default) {
            Log.d("Thread4", Thread.currentThread().name)
        }*/


        val note = Note(
            "title","desc", "image"
        )

        val note2 = Note(
            "title2","desc2", "image2"
        )

        val note3 = Note(
            "title3","desc3", "image3"
        )



        noteViewModel.init(this)
        noteViewModel.addNote(note)
        noteViewModel.addNote(note2)
        noteViewModel.addNote(note3)

        noteViewModel.allNotes.observe(this) {
            it.forEach {
                Log.d("NoteDetail", it.noteTitle)
            }
        }


    }
}