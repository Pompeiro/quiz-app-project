package com.example.quizapka

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"
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

        val pyt2 = Pytania(
            2,
            "Ile perkusji na swoich koncertach posiada słynny zespół King Crimson?",
            R.drawable.ic_launcher_foreground,
            "1",
            "2",
            "3",
            "4",
            3
        );
        questionsList.add(pyt2);
        val pyt3 = Pytania(
            3,
            "Co widzisz na tym obrazku?",
            R.drawable.porron,
            "Porron",
            "Maśniczka",
            "Flaczarka",
            "Bratrura",
            1
        );
        questionsList.add(pyt3);
        val pyt4 = Pytania(
            4,
            "Najsłynniejszy austriacki malarz to:",
            R.drawable.ic_launcher_foreground,
            "Karl Aigen",
            "Franz Biko",
            "Peter Fendi",
            "Gustav Klimt",
            4
        );
        questionsList.add(pyt4);
        val pyt5 = Pytania(
            5,
            "Jaki cytrus widnieje na zdjęciu?",
            R.drawable.poramancza,
            "Mandarynka",
            "Pomarańcza",
            "Nektarynka",
            "Grejpfrut",
            2,
        );
        questionsList.add(pyt5);

        val pyt6 = Pytania(
            6,
            "W którym odcinku animowanego serialu KAPITAN BOMBA możemy ujrzeć tego kosmite?",
            R.drawable.kosmita,
            "91",
            "102",
            "59",
            "105",
            4,
        );
        questionsList.add(pyt6);
        val pyt7 = Pytania(
            7,
            "Nanananananananana",
            R.drawable.ic_launcher_foreground,
            "Tańczę aż mnie bolą kolanna",
            "A na śniadanie była Kasza Manna",
            "O smaku bananna",
            "Ten quiz jest bardzo niedojrzały",
            1,
        );
        questionsList.add(pyt7);
        val pyt8 = Pytania(
            8,
            "Likier maraskino produkuje się z maraski, czyli odmiany jakiego owoca?",
            R.drawable.ic_launcher_foreground,
            "Figi",
            "Gruszki",
            "Wiśni",
            "Jabłka",
            3,
        );
        questionsList.add(pyt8);
        val pyt9 = Pytania(
            9,
            "Którą spawarką zespawasz cieńką blachę?",
            R.drawable.kosmita2,
            "Elektrodową",
            "Migomatem",
            "Elektrodową nietopliwą",
            "Spawarki nie istnieją",
            2,
        );
        questionsList.add(pyt9);
        val pyt10 = Pytania(
            10,
            "Którą potrawą świąteczną jest hamburger?",
            R.drawable.ic_launcher_foreground,
            "Pierwszą",
            "Drugą",
            "Trzecią",
            "Czwartą",
            4,
        );
        questionsList.add(pyt10);
        val pyt11 = Pytania(
            11,
            "Kto rządzi galaktyką KUJWDUBIE?",
            R.drawable.ic_launcher_foreground,
            "Sułtan kosmitów",
            "Armirał Gwiezdnej floty",
            "Papież",
            "Król Urlich Von Jungingen",
            3,
        );
        questionsList.add(pyt11);
        val pyt12 = Pytania(
            12,
            "Na co chłopom pozwala kodeks honorowy?",
            R.drawable.poramancza,
            "Na nic",
            "Na wszystko",
            "Tylko na uprawe roli",
            "Tylko na służbę szlachicom",
            2,
        );
        questionsList.add(pyt12);
        val pyt13 = Pytania(
            13,
            "Jak sie czuje C'qrwozaur po hipnozie?",
            R.drawable.ic_launcher_foreground,
            "Boli go głowa",
            "Nic się mu nie dzieje",
            "Umiera",
            "Przestaje widzieć na kilka minut",
            1,
        );
        questionsList.add(pyt13);
        val pyt14 = Pytania(
            14,
            "Dokończ cytat: Zobaczysz Paweł, za kilka miesięcy ...",
            R.drawable.ic_launcher_foreground,
            ".. Od Zera do klasy średniej",
            "To radyjko będzie hulało w lanosie",
            "Będziemy kimś",
            "Dorobimy się na tych borówkach, ale teraz pizzka",
            2,
        );
        questionsList.add(pyt14);
        val pyt15 = Pytania(
            15,
            "Jaki jest poprawny numer do sanepidu?",
            R.drawable.ic_launcher_foreground,
            "58 344 73 00",
            "7777",
            "02 222 222 11",
            "6666",
            1,
        );
        questionsList.add(pyt15);
        val pyt16 = Pytania(
            16,
            "Jak się nazywała druga część jednej z najsłynniejszych trylogii - Wściekłych Pięści Węża?",
            R.drawable.ic_launcher_foreground,
            "Wściekłe Pięści Węża",
            "Wściekłe Pięści Węża 2",
            "Sarnie żniwo",
            "Wściekły wąż kontra cyborg zombie",
            3,
        );
        questionsList.add(pyt16);
        val pyt17 = Pytania(
            17,
            "Co sprawia, że sniezny kockodan dostaje smergla, hej?",
            R.drawable.kosmita3,
            "Woń Łoscypka",
            "Woń Grylla",
            "Woń żurawiny",
            "Woń Solnika",
            1,
        );
        questionsList.add(pyt17);
        val pyt18 = Pytania(
            18,
            "Co zrobić gdy przeciwnik używa osłonki plazmowej?",
            R.drawable.ic_launcher_foreground,
            "Rzucić granata",
            "Uciekać",
            "To ja, typ niepokorny, nikt nie wie co we mnie tkwi...",
            "Walka Kutarate/Hudo",
            3,
        );
        questionsList.add(pyt18);
        val pyt19 = Pytania(
            19,
            "Jaki numer ma rakieta kapitana bomby?",
            R.drawable.ic_launcher_foreground,
            "2",
            "1",
            "3",
            "7",
            4,
        );
        questionsList.add(pyt19);
        val pyt20 = Pytania(
            20,
            "Jak nazywał się jeden z pierwszych kosmitów w gwiezdnej flocie?",
            R.drawable.ic_launcher_foreground,
            "Krzysztof Lufa",
            "Michał Głuś",
            "Papa słoń - Mariusz Pudzianowski",
            "Jachaś",
            2,
        );
        questionsList.add(pyt20);
        questionsList.shuffle();
        for( i in questionsList.size-1 downTo 10)
            questionsList.removeAt(i)
        return questionsList;
    }
}