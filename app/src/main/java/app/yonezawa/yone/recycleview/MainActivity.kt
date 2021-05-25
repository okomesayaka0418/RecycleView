package app.yonezawa.yone.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val courseData: List<CourseData> = listOf(
        CourseData(R.drawable.randy_image,"Androidアプリプログラミングコース","色んなアプリを作って、プログラミングを楽しもう!"),
        CourseData(R.drawable.iphone,"iphoneアプリプログラミングコース","世界に一つだけのiPhoneアプリを作って、周りを驚かせよう!"),
        CourseData(R.drawable.maya,"Maya 3DCGコース","君の想像を3Dで実現しよう!"),


    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //RecycleViewAdapterで宣言したaddAllメソッドを呼ぶ
        val adapter = RecyclerViewAdapter(this)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = adapter

        adapter.addAll(courseData)
    }
}