public class Main {
    public static void main(String[] args) {

        //Günleri tanımlayalım;
        String[] günler = {"Pazartesi: ", "Salı: ", "Çarşamba: ", "Perşembe: ", "Cuma: "};


        //Dersleri tanımlayalım;
        String[] dersler = {"Matematik /", "Kimya /", "Biyoloji /", "Fizik /", "İngilizce /"};

        //Saatleri tanımlayalım;
        String[] saatler = {"9.15-10.15", "10.30-11.30", "11.45-12.45", "13.00-14.00", "14.15-15.15"};

        //ders programını çalıştırmak için for döngüsü düzenleyelim;
        for (int i = 0; i < günler.length; i++) {
            System.out.println(günler[i] + dersler[i] + saatler[i]);
        }

    }
}