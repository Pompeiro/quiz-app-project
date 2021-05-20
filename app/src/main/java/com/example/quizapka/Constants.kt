package com.example.quizapka

object Constants {
    fun getQuestions(): ArrayList<Pytania>{
        val questionsList = ArrayList<Pytania>()

        val pyt1 = Pytania(
            1,
            "Czy Android Studio jest fajnym środowiskiem?",
            R.drawable.ic_launcher_foreground,
            "Nie znam lepszego",
            "W życiu",
            "Nie wiem",
        "Oddajcie mi RAM :(",
            1
        );
        questionsList.add(pyt1);
        return questionsList;
    }

}