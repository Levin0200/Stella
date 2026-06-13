package com.example.stella

/**
 * 스토리 데이터 (이미지, 텍스트)를 데이터 클래스로 만들어둠 / 왜 이렇게 했냐면 (이유)
 * 아래와 같이 클래스 필드를 구성한 이유는 xml에서 제목, 묘사하는 글, 이미지를 끌어오기 위한 식별 가능한 id를 하나의 데이터 객체처럼 취급,
 * 하나의 세트처럼 패키징 하여 동작하게 만들고 싶기 때문에 이렇게 데이터 클래스를 구성하였다.
 * 결국 스토리, 꿈 등도 객체 지향적으로 보면 하나의 객체이기에 클래스를 만들고, 객체를 생성하는 과정으로 이어져야 하는건 자명하다.
 */
data class DreamItem (
    val title: String,
    val type: String,
    val description: String,
    val imageResId: Int
)