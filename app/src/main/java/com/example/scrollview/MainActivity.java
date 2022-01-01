package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //01. Daftarkan Widget
    TextView tvDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //02. daftarkan ID widget
        tvDeskripsi = (TextView) findViewById(R.id.textView3);

        //03. Coding Fungsi
        
        
        tvDeskripsi.setText("Bola.com, Singapura - Mantan pelatih Thailand, Sirisak Yodyardthai, yakin pasukan Alexandre Polking bakal meraih gelar Piala AFF 2020. Pada leg 2 final Piala AFF 2020 melawan Timnas Indonesia, Sabtu (1/1/2022), Thailand diprediksi bakal kembali meraih kemenangan.\n" +
                "\n" +
                "Thailand memang selangkah lagi meraih gelar Piala AFF 2020. Pasukan Gajah Perang berhasil meraih kemenangan 4-0 pada leg 1 melawan Timnas Indonesia sehingga sangat diunggulkan pada leg 2 nanti.\n" +
                "\n" +
                "Shin Tae-yong Sarankan Pemain Timnas Indonesia Berkarier di Jepang, Korea Selatan, hingga Eropa Setelah Piala AFF 2020\n" +
                "Namun, Sirisak Yodyardthai memprediksi Thailand bakal mendapatkan tekanan dari Timnas Indonesia pada leg 2 dan harus kerja keras. Meski demikian, Teerasil Dangda dkk diprediksi tetap akan menang dengan skor tipis 1-0.\n" +
                "\n" +
                "\"Saya rasa hasil pertandingan seperti biasa akan memihak pada kami. Namun, Thailand juga harus mampu membaca apa yang akan dilakukan Indonesia,\" kata Sirisak Yodyardthai seperti dikutip Siam Sport.\n" +
                "\n" +
                "\"Sulit memang bagi mereka untuk mencetak lima gol ke gawang kami. Saya memprediksi, Thailand akan menang dengan skor 1-0 dan yakin mereka memainkan permainan yang bagus seperti sebelumnya,\" ucap Sirisak Yodyardthai.\n" +
                "\n" +
                "Secara matematis, Thailand cukup membutuhkan hasil imbang dengan skor berapapun melawan Timnas Indonesia. Namun, Indonesia tentu bakal memberikan perlawanan yang ketat dalam pertandingan penentuan nanti.");

    }
}