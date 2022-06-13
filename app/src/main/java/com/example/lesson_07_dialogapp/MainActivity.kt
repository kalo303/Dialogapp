package com.example.lesson_07_dialogapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun save(view: View){
     val saveAlert=AlertDialog.Builder(this)
     saveAlert.setTitle("save")
        saveAlert.setMessage("Are you sure you want to save your changes?")
        saveAlert.setPositiveButton("YES")
        {dialogInterface: DialogInterface,_: Int->Snackbar.make(findViewById(R.id.Save),"Save",Snackbar.LENGTH_LONG).show()}

        saveAlert.setNegativeButton("NO")
        {dialogInterface: DialogInterface,_: Int->Snackbar.make(findViewById(R.id.Save),"NotSave",Snackbar.LENGTH_LONG).show()}

        saveAlert.setNeutralButton("Remind me later",null)

        saveAlert.show()
    }

}