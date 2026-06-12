package com.example.stella

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stella.databinding.ActivityResultBinding

class Result : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count = 0

        val title = intent.getStringExtra("title")
        val type = intent.getStringExtra("type")
        val description = intent.getStringExtra("description")
        val imageId = intent.getIntExtra("imageId", R.drawable.stella_star1)
        val nickname = intent.getStringExtra("nickname")

        val visitedStella1 = intent.getBooleanExtra("visitedStella1", false)
        val visitedStellaPost = intent.getBooleanExtra("visitedStellaPost", false)
        val visitedStellaTeacher = intent.getBooleanExtra("visitedStellaTeacher", false)
        val visitedStellaScholar = intent.getBooleanExtra("visitedStellaScholar", false)
        val visitedStellaFarmer = intent.getBooleanExtra("visitedStellaFarmer", false)

        binding.txtResultTitle.text = title
        binding.txtResultType.text = type
        binding.imgResultStar.setImageResource(imageId)

        binding.txtResultHeader.text =
            "$nickname 여행자님의 별이 기록되었습니다."

        binding.txtResultMessage.text =
            when (title) {
                "하늘섬의 항해사" ->
                    "이루지 못한 꿈도\n사라지는 것은 아닙니다."

                "별빛 우체부" ->
                    "전하지 못한 마음도\n없었던 것은 아닙니다."

                "왕립 마법학교의 낙제생" ->
                    "꿈은 때때로\n다른 모습으로 피어납니다."

                "가장 높은 탑의 학자" ->
                    "닿지 못한 이상도\n누군가의 길이 될 수 있습니다."

                "마지막 정원사" ->
                    "늦었다는 것과\n끝났다는 것은 다릅니다."

                else ->
                    "꿈은 사라지지 않고\n어딘가에 남아 있습니다."
            }


        if (visitedStella1) count++
        if (visitedStellaPost) count++
        if (visitedStellaTeacher) count++
        if (visitedStellaScholar) count++
        if (visitedStellaFarmer) count++

        binding.txtResultCount.text =
            "현재 기록한 별 $count / 5"

        binding.btnBackToStars.setOnClickListener {
            val intent = Intent(this, StarSelect::class.java)

            intent.putExtra("nickname", nickname)

            intent.putExtra("visitedStella1", visitedStella1)
            intent.putExtra("visitedStellaPost", visitedStellaPost)
            intent.putExtra("visitedStellaTeacher", visitedStellaTeacher)
            intent.putExtra("visitedStellaScholar", visitedStellaScholar)
            intent.putExtra("visitedStellaFarmer", visitedStellaFarmer)

            startActivity(intent)
        }
    }
}