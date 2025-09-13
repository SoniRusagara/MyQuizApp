package com.example.myquizapp.LeaderActivity

import android.os.Bundle
import android.view.View
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.myquizapp.LeaderActivity.Model.UserModel
import com.example.myquizapp.R

class LeaderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor= ContextCompat.getColor(this, R.color.grey)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        val topUsers = loadData().take(3)
        val otherUsers = loadData().drop(3)

        setContent {
            LeaderScreen(
                topUsers = topUsers,
                otherUsers = otherUsers,
                onBackClick = {finish()})
        }
    }

    private fun loadData():List<UserModel>{
        return listOf(
            UserModel(1, "Sophia", "person1", 4850),
            UserModel(2, "Daniel", "person2",4560),
            UserModel(3, "James", "person3", 3873),
            UserModel(4, "John", "person4", 3250),
            UserModel(5, "Emily", "person5", 3015),
            UserModel(6, "David", "person6", 2970),
            UserModel(7, "Sarah", "person7", 2870),
            UserModel(8, "Michael", "person8", 2670),
            UserModel(9, "Sarah", "person9", 2380),
            UserModel(10, "Tina", "person10", 2376),
        )
    }
}