package com.knta.listview_20220226.Adapter

import android.content.Context
import android.widget.ArrayAdapter
import com.knta.listview_20220226.datas.StudentData

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList)  {
}