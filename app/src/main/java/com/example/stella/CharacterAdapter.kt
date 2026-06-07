package com.example.stella

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

//CharacterItem 리스트를 Spinner에 연결해줄 어뎁터 클래스
class CharacterAdapter(
    //현재 액티비티 정보
    private val context: Context,
    
    //Spinner에 넣을 캐릭터 목록 / 베이스 어댑터란 어댑터의 부모 클래스를 말한다. :로 extends 한것
    private val items: List<CharacterItem>) : BaseAdapter() {

    //Spinner에 들어있는 아이템 개수 반환
    override fun getCount(): Int = items.size

    //인덱스 위치 데이터가 무엇인지 반환
    override fun getItem(position: Int): Any = items[position]

    //데이터 -> 이미지 뷰 생성 -> 화면 출력하는 애
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView = ImageView(context)

        imageView.layoutParams = ViewGroup.LayoutParams(120, 150)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.setImageResource(items[position].imageResId)

        return imageView
    }

    //얘는 고유 번호를 찾아주는 애인데 만들 필요 없어보여서 삭제했더니 베이스 어뎁터가 오류 일으킴
    //근데 : 이게 extends니 당연히 상속 클래스는 구현이 강제되니까 꼭 구현이 필요한거였지 참
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //Spinner를 눌렀을때 펼쳐질 목록
    override fun getDropDownView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val imageView = ImageView(context)

        //펼쳐지는 목록에서 좀 더 크게 표시될 수 있게 해주는 애들 스케일 및 패딩 설정
        imageView.layoutParams = ViewGroup.LayoutParams(220, 260)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.setPadding(8, 8, 8, 8)
        imageView.setImageResource(items[position].imageResId)

        return imageView
    }
}