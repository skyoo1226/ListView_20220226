package com.knta.listview_20220226

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.Toast
import com.neppplus.listview_20220226.adapters.StudentAdapter
import com.neppplus.listview_20220226.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //    학생 목록을 담을 그릇
    val mStudentList = ArrayList<StudentData>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mStudentList.add(  StudentData("조경진", 1988, "서울시 동대문구")  )
        mStudentList.add(  StudentData("권효영", 1995, "서울시 서대문구")  )
        mStudentList.add(  StudentData("김정환", 1981, "서울시 중랑구")  )
        mStudentList.add(  StudentData("김한균", 1966, "서울시 마포구")  )
        mStudentList.add(  StudentData("문상현", 1997, "부천시 원미구")  )
        mStudentList.add(  StudentData("이형종", 1991, "서울시 중구")  )
        mStudentList.add(  StudentData("최다영", 1989, "서울시 강서구")  )
        mStudentList.add(  StudentData("최민서", 1995, "서울시 송파구")  )
        mStudentList.add(  StudentData("유석균", 1970, "서울시 동대문구")  )


        mAdapter = StudentAdapter( this, R.layout.student_list_item, mStudentList )

        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { adapterView, view, position, l ->

//            position : 몇번 줄이 눌렸나? 알려줌. 0에서 출발.

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name}학생이 클릭됨", Toast.LENGTH_SHORT).show()

        }

        studentListView.setOnItemLongClickListener { adapterView, view, position, l ->

            val longClickedStudent = mStudentList[position]

            Toast.makeText(this, "${longClickedStudent.name} 학생이 길게 클릭됨", Toast.LENGTH_SHORT).show()


            return@setOnItemLongClickListener true
        }


    }
}