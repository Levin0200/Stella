package com.example.stella

import android.content.Intent
import android.os.Bundle
import android.service.dreams.DreamService
import android.view.View
import android.widget.AdapterView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.stella.databinding.ActivityStarSelectBinding

class StarSelect : AppCompatActivity() {

    lateinit var binding : ActivityStarSelectBinding
    lateinit var seletedDream : DreamItem
    /**
     * 선택한 꿈은 나중에 사용자의 선택에 따라 초기화 될것,
     * 그러므로 클래스 전역변수로 선언해서 코드 재활용성을 높이는게 맞다고 생각해서
     * selectedDream이라는 객체로 만듬
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStarSelectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nickname = intent.getStringExtra("nickname")
        val visitedStella1 = intent.getBooleanExtra("visitedStella1", false)
        val visitedStellaPost = intent.getBooleanExtra("visitedStellaPost", false)
        val visitedStellaTeacher = intent.getBooleanExtra("visitedStellaTeacher", false)
        val visitedStellaScholar = intent.getBooleanExtra("visitedStellaScholar", false)
        val visitedStellaFarmer = intent.getBooleanExtra("visitedStellaFarmer", false)


        binding.txtStarSub.text = "$nickname 여행자님, \n 어떤 꿈의 흔적을 따라가시겠습니까?"


        val dreamList = listOf(
            DreamItem(
                "하늘섬의 항해사",
                "이루지 못한 꿈",
                "하늘섬을 향한 지도를 끝까지 \n 품고 있던 항해사",
                R.drawable.stella_star1
            ),

            DreamItem(
                "별빛 우체부",
                "전하지 못한 꿈",
                "한 편의 편지를 배달하지 못한 우체부",
                R.drawable.stella_post
            ),

            DreamItem(
                "왕립 마법학교의 낙제생",
                "형태가 바뀐 꿈",
                "마법사가 되지 못했지만, \n 아이들의 스승이 된 교사",
                R.drawable.stella_teacher
            ),
            DreamItem(
                "가장 높은 탑의 학자",
                "이상을 향했던 꿈",
                "언젠가 하늘에 닿기를 바랐던 한 학자",
                R.drawable.stella_scholar
            ),
            DreamItem(
                "마지막 정원사",
                "뒤늦게 피어난 꿈",
                "모두가 떠난 정원에 홀로 남아 \n 개화를 기다린 정원사",
                R.drawable.stella_farmer
            )
        )

        //onCreate에서 디폴트값 초기화
        seletedDream = dreamList[0]

        binding.spinnerDream.adapter =
            DreamSpinnerAdapter (
                this,
                dreamList
            )

        binding.spinnerDream.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    p0: AdapterView<*>?,
                    p1: View?, //view
                    p2: Int, //position
                    p3: Long //id
                ) {
                    
                    //선언과 초기화를 명시적으로 짰습니다. 안그러면 나중에 혹시나 헷갈릴까봐
                    val selected = dreamList[p2]
                    seletedDream = selected

                    binding.txtDreamName.text = selected.title
                    binding.txtDreamType.text = selected.type
                    binding.txtDreamDesc.text = selected.description

                    val isVisited = when(selected.title) {

                        "하늘섬의 항해사" ->
                            visitedStella1

                        "별빛 우체부" ->
                            visitedStellaPost

                        "왕립 마법학교의 낙제생" ->
                            visitedStellaScholar

                        "가장 높은 탑의 학자" ->
                           visitedStellaScholar

                        "마지막 정원사" ->
                            visitedStellaFarmer

                        else ->
                            false
                    }

                    //3항연산으로 처리할까 했는데 3항연산보다 그냥 기본 if문이 이 코드에선 더 간결할것 같습니다.
                    if (isVisited) {
                        binding.txtStarSub.text =
                            "$nickname 여행자님, \n 이미 발견한 흔적입니다."
                    }



                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                }

            }



        //이 흔적을 따라간다는 버튼을 눌렀을때 보내줄 Explict intent data들
        binding.btnFollowDream.setOnClickListener {
            val intent = Intent(
                this,
                Story::class.java
            )

            //아래 4개 엑스트라들은 DreamItem에서 정의한 필드들이자, 객체의 구성요소들 / 이걸 계속 전해줄것
            //객체 자체를 주머니처럼 아래 필드들을 묶어서 DTO 처럼 보내주면 좋을거 같은데
            //아직 배우지 않은 부분을 함부로 쓰기 애매함 때문에 아래처럼 필드들을 나눠서 보냈습니다.
            intent.putExtra("title", seletedDream.title)
            intent.putExtra("type", seletedDream.type)
            intent.putExtra("description", seletedDream.description)
            intent.putExtra("imageId", seletedDream.imageResId)

            intent.putExtra("nickname", nickname)

            intent.putExtra("visitedStella1", visitedStella1)
            intent.putExtra("visitedStellaPost", visitedStellaPost)
            intent.putExtra("visitedStellaTeacher", visitedStellaTeacher)
            intent.putExtra("visitedStellaScholar", visitedStellaScholar)
            intent.putExtra("visitedStellaFramer", visitedStellaFarmer)



            startActivity(intent)
        }



    }
}