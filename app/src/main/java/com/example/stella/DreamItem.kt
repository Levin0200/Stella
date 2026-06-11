package com.example.stella

// 스토리 데이터 (이미지, 텍스트)를 데이터 클래스로 만들어둠 / 왜 이렇게 했냐면 (이유)
// 아래와 같이 클래스 필드를 구성한 이유는 xml에서 제목, 묘사하는 글, 이미지를 끌어오기 위한 식별 가능한 id를 하나의 데이터 객체처럼 취급,
// 하나의 세트처럼 패키징 하여 동작하게 만들고 싶기 때문에 이렇게 데이터 클래스를 구성하였다.

data class DreamItem (
    val title: String,
    val type: String,
    val description: String,
    val imageResId: Int
)