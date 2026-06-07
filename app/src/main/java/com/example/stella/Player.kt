package com.example.stella

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.stella.databinding.ActivityPlayerBinding

class Player : AppCompatActivity() {

    lateinit var binding: ActivityPlayerBinding

    //디폴트 벨류 설정
    var selectedGender = "소년"
    var selectedCharacterImage = R.drawable.stella_boy

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val boyList = listOf(
            CharacterItem(R.drawable.stella_boy),
            CharacterItem(R.drawable.stella_boy1),
            CharacterItem(R.drawable.stella_boy2),
            CharacterItem(R.drawable.stella_boy3)
        )

        val girlList = listOf(
            CharacterItem(R.drawable.stella_girl),
            CharacterItem(R.drawable.stella_girl1),
            CharacterItem(R.drawable.stella_girl2),
            CharacterItem(R.drawable.stella_girl3),
        )

        setCharacterSpinner(boyList)

        binding.radioBoy.setOnClickListener {
            selectedGender = "소년"
            setCharacterSpinner(boyList)
        }

        binding.radioGirl.setOnClickListener {
            selectedGender = "소녀"
            setCharacterSpinner(girlList)
        }

        binding.btnNext.setOnClickListener {
            val nickname = binding.editName.text.toString()
            if(nickname.isEmpty()) {
                Toast.makeText(this,
                    "닉네임을 입력해주세요",
                Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(
                this,
                StarSelect::class.java
            )

            intent.putExtra("nickname", nickname)
            intent.putExtra("gender", selectedGender) //젠더는 Boolean값으로 처리해도 괜찮을거 같다.
            intent.putExtra("characterImage", selectedCharacterImage)
            startActivity(intent)
        }
    }

    private fun setCharacterSpinner(characterList: List<CharacterItem>) {
        val adapter = CharacterAdapter(this, characterList)
        binding.spinnerCharacter.adapter = adapter

        selectedCharacterImage = characterList[0].imageResId
        binding.imgPlayer.setImageResource(selectedCharacterImage)

        binding.spinnerCharacter.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {

            }
    }
}