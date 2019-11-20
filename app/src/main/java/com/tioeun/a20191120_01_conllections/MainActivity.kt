package com.tioeun.a20191120_01_conllections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tioeun.a20191120_01_conllections.datas.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userList = ArrayList<User>()

        userList.add(User("조경진", "서울시 은평구"))
        userList.add(User("구민성", "경기도 양주시"))
        userList.add(User("김기백", "경기도 광명시"))
        userList.add(User("김문석", "인천광역시"))



        Log.d("직접빼내기", userList.get(1).name)

//        들어있는 사용자의 수?
        Log.d("사용자수", "${userList.size}")

//        김기백님은 몇번째 위치?
        Log.d("김기백님의 위치", "${userList.indexOf(User("김기백", "경기도 광명시"))}")
//        -1 리턴  그런것 없다.

        userList.remove(User("조경진", "서울시 은평구"))


        for (user in userList) {
            Log.d("사용자변수", "${user.name}  ${user.address}")
        }
    }
}
