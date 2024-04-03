package com.example.todoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase


//@Database(entities = [Note::class],
//    version = 1,
//    exportSchema = false
//)
//abstract class NotesDatabase : RoomDatabase() {
//    abstract val dao: NoteDao
//}

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NotesDatabase: RoomDatabase(){
    abstract val dao: NoteDao
}