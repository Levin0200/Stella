package com.example.stella

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stella.databinding.ActivityStoryBinding

class Story : AppCompatActivity() {

    lateinit var binding: ActivityStoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("title")
        val type = intent.getStringExtra("type")
        val description = intent.getStringExtra("description")
        val imageId = intent.getIntExtra("imageId", R.drawable.stella_star1)
        val nickname = intent.getStringExtra("nickname")

        binding.txtStoryTitle.text = title
        binding.txtStoryType.text = type
        binding.imgStory.setImageResource(imageId)

        when (title) {
            "하늘섬의 항해사" -> {
                binding.txtStoryHeader.text = "낡은 항해 일지"

                binding.txtStoryBody.text =
                    """
                    오래된 지도 한 장이 남아 있습니다.

                    지도 끝은 닳아 있었고,
                    수십 번은 접었다 펼친 흔적이 보입니다.

                    희미하게 남은 문장.

                    "언젠가 하늘섬에 닿을 것이다."

                    그는 누구보다 멀리 가고 싶었습니다.

                    하지만 어느 날부터
                    그의 항해는 멈추었습니다.

                    가족을 돌봐야 했고,
                    현실은 바다보다 무거웠습니다.

                    그는 끝내
                    하늘섬에 닿지 못했습니다.

                    하지만 지도는 버리지 않았습니다.
                    """.trimIndent()

                binding.txtStoryMessage.text =
                    "이루지 못한 꿈도\n사라지는 것은 아닙니다."
            }

            "별빛 우체부" -> {
                binding.txtStoryHeader.text = "보내지 못한 편지"

                binding.txtStoryBody.text =
                    """
                    책상 위에는
                    오래된 편지 한 통이 놓여 있습니다.

                    봉투는 바래 있었지만,
                    받는 사람의 이름만은 선명했습니다.

                    그는 수많은 편지를 배달했습니다.

                    사랑한다는 말도,
                    돌아오겠다는 약속도,
                    보고 싶다는 마음도.

                    하지만 정작 자신의 편지만은
                    끝내 전하지 못했습니다.

                    언젠가 말해야지.

                    그렇게 미루는 사이,
                    그 사람은 다시 돌아오지 못할 길을 떠났습니다.

                    편지는 끝내
                    우체통에 들어가지 못했습니다.
                    """.trimIndent()

                binding.txtStoryMessage.text =
                    "전하지 못한 마음도\n없었던 것은 아닙니다."
            }

            "왕립 마법학교의 낙제생" -> {
                binding.txtStoryHeader.text = "낡은 성적표"

                binding.txtStoryBody.text =
                    """
                    책상 위에는
                    낡은 성적표가 놓여 있습니다.

                    결과는 불합격.

                    그는 왕립 마법학교의
                    훌륭한 마법사가 되고 싶었습니다.

                    하지만 주문은 자주 실패했고,
                    별빛은 그의 손끝에 오래 머물지 않았습니다.

                    사람들은 말했습니다.

                    "너는 마법사가 될 수 없어."

                    그는 결국
                    마법사가 되지 못했습니다.

                    그러나 시간이 흐른 뒤,
                    그의 작은 교실에는 아이들이 모였습니다.

                    그는 자신이 닿지 못한 길을
                    아이들에게 가르치기 시작했습니다.
                    """.trimIndent()

                binding.txtStoryMessage.text =
                    "꿈은 때때로\n다른 모습으로 피어납니다."
            }

            "가장 높은 탑의 학자" -> {
                binding.txtStoryHeader.text = "탑 꼭대기의 연구 노트"

                binding.txtStoryBody.text =
                    """
                    탑 꼭대기에는
                    낡은 연구 노트가 남아 있습니다.

                    첫 장에는 이렇게 적혀 있습니다.

                    "하늘은 정말 닿을 수 없는 곳인가."

                    그는 평생 하늘을 올려다보았습니다.

                    사람들은 그를 비웃었습니다.

                    탑을 아무리 높이 쌓아도
                    별에는 닿을 수 없다고.

                    하지만 그는 멈추지 않았습니다.

                    하루에 한 계단씩,
                    한 장의 계산식씩,
                    한 줄의 기록씩.

                    그는 끝내
                    하늘에 닿지 못했습니다.

                    그래도 그의 탑은
                    누군가에게 더 높은 곳을 바라보게 했습니다.
                    """.trimIndent()

                binding.txtStoryMessage.text =
                    "닿지 못한 이상도\n누군가의 길이 될 수 있습니다."
            }

            "마지막 정원사" -> {
                binding.txtStoryHeader.text = "오래된 정원 일지"

                binding.txtStoryBody.text =
                    """
                    모두가 떠난 정원에
                    한 사람이 남아 있었습니다.

                    정원 한가운데에는
                    꽃이 피지 않는 화분 하나가 있었습니다.

                    첫 번째 봄.

                    오늘도 피지 않았다.

                    열 번째 봄.

                    아직도 피지 않았다.

                    서른 번째 봄.

                    이제는 내가 틀렸던 걸까.

                    사람들은 떠났고,
                    계절은 수없이 바뀌었습니다.

                    그래도 그는
                    매일 같은 자리에 물을 주었습니다.

                    그리고 마지막 봄.

                    일지에는 한 줄만 남아 있었습니다.

                    "오늘은 꽃이 피었다."
                    """.trimIndent()

                binding.txtStoryMessage.text =
                    "늦었다는 것과\n끝났다는 것은 다릅니다."
            }

            else -> {
                binding.txtStoryHeader.text = "알 수 없는 흔적"
                binding.txtStoryBody.text = description
                binding.txtStoryMessage.text =
                    "꿈은 사라지지 않고\n어딘가에 남아 있습니다."
            }
        }

        binding.btnGoResult.setOnClickListener {
            val intent = Intent(this, Result::class.java)

            intent.putExtra("title", title)
            intent.putExtra("type", type)
            intent.putExtra("description", description)
            intent.putExtra("imageId", imageId)
            intent.putExtra("nickname", nickname)

            startActivity(intent)
        }
    }
}