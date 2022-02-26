package com.knta.listview_20220226

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.knta.listview_20220226.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList : AppCompatActivity() {


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( StudentData("조경진", 1988, "서울시 동대문구")  )
        mStudentList.add( StudentData("유석균", 1970, "서울시 강북")  )
        mStudentList.add( StudentData("권효영", 1981, "서울시 중구")  )
        mStudentList.add( StudentData("김한균", 1991, "서울시 송파구")  )
        mStudentList.add( StudentData("최민서", 1990, "서울시 천호구")  )
        mStudentList.add( StudentData("최다영", 1994, "서울시 의정부")  )
        mStudentList.add( StudentData("김정환", 1985, "서울시 서대구")  )
        mStudentList.add( StudentData("권효영", 1984, "서울시 마포구")  )
        mStudentList.add( StudentData("이현종", 1989, "서울시 아현구")  )




    }
}