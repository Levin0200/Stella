package com.example.stella

import android.content.Intent
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.example.stella.databinding.ActivityEndingBinding

class Ending : AppCompatActivity() {

    lateinit var binding: ActivityEndingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEndingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nickname = intent.getStringExtra("nickname")
        val characterImage = intent.getIntExtra("characterImage", R.drawable.stella_boy)
        var reviewScore = 5

        binding.imgEnding.setImageResource(characterImage)

        binding.txtEndingBody.text =
            """
            $nickname 여행자님은
            다섯 개의 꿈의 흔적을 모두 
            마주했습니다.

            이루지 못한 꿈

            전하지 못한 꿈

            형태가 바뀐 꿈

            이상을 향했던 꿈

            뒤늦게 피어난 꿈

            이 모든 꿈은
            서로 다른 모습으로 남아 있었지만,

            결국 모두
            누군가가 진심으로 바랐던 
            삶의 흔적이었습니다.
            """.trimIndent()

        binding.txtEndingMessage.text =
            """
            꿈은 사라지지 않습니다.

            다만 별이 되어
            누군가의 밤하늘에 남을 뿐입니다.
            """.trimIndent()

        binding.txtReviewScore.text =
            "여운 점수: $reviewScore"

        binding.seekReview.progress = reviewScore

        binding.seekReview.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {

                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    reviewScore = progress
                    binding.txtReviewScore.text =
                        "여운 점수: $reviewScore"
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                }
            }
        )

        binding.btnShareReview.setOnClickListener {
            val reviewText =
                """
                STELLA를 플레이했습니다.

                $nickname 여행자님은 다섯 개의 꿈의 흔적을 모두 기록했습니다.

                여운 점수: $reviewScore / 10

                꿈은 사라지지 않습니다.
                다만 별이 되어 누군가의 밤하늘에 남을 뿐입니다.
                """.trimIndent()

            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, reviewText)

            startActivity(
                Intent.createChooser(
                    shareIntent,
                    "감상 공유하기"
                )
            )
        }

        binding.btnGoMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }
}