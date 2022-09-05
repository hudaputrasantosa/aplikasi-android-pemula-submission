package com.huda.aplikasiku

import java.util.*

object ArticleData {

    private val articleTitle = arrayOf(
        "Alasan Mengapa Kurma Menjadi Makanan Terbaik Saat Ramadhan",
        "Cara Mengelola Stress Dan Emosi Negatif",
        "Beberapa Hal Yang Perlu Diterapkan Agar Sukses",
        "5 Rahasia Mengatur Keuangan Bulanan",
        "Rahasia Mendapatkan Laptop Dengan Harga Terbaik",
        "Peluang Usaha Online Tanpa Modal",
        "Makanan Hemat Untuk Anak Kosan",
        "Tujuh Hal Paling Menakutkan Dalam Dunia Kesehatan",
        "Siapa Yang Ingin Menjadi Orang Sukses?",
        "Gadget Paling Top Untuk Digunakan Sehari-Hari"
    )

    private val articleDescription = arrayOf(
        "Kurma merupakan sumber energi, serat dan gula yang sehat bila tidak dikonsumsi secara berlebihan. Buah yang berwarna coklat kehitaman ini mengandung vitamin A, B, dan C, potasium, serat, magnesium, seng dan selenium. Nutrisi tersebut dapat membantu tubuh mempertahankan energi lebih lama setelah berpuasa",
        "1. Jangan mengisolasi diri\n" +
                "\n" +
                "Saat butuh waktu sendiri, jangan menganggap kita tak perlu bantuan orang lain. Meski Anda merasa tidak bisa bersosialisasi, tetap luangkan waktu untuk berada di dekat orang lain membantu membuang pikiran negatif. Atau jika tidak ingin bersosialisasi dengan teman atau keluarga Anda bisa menjadi sukarelawan dalam organisasi atau komunitas.\n" +
                "\n" +
                "2. Cobalah meditasi\n" +
                "\n" +
                "Dengan berfokus pada ketenangan, Anda dapat mengarahkan pikiran untuk berhenti mengkhawatirkan hal yang negatif. Seperti dari teknik pernapasan yang teratur yang memberi manfaat menenangkan. Anda juga bisa melatih diri secara sensorik dengan menggunakan rangsangan seperti bau untuk menenangkan diri.",
        "Meraih kesuksesan tidaklah mudah. Kesuksesan tidak bisa dicapai seperti membalikan telapak tangan. Salah satu faktor yang bisa menentukan kesuksesan adalah kebiasaan dan kedisplinan seseorang. Mulai dari kebiasaan sekecil apapun itu memberikan dampak pada tingkat kesuksesanmu. Menurut penelitian terbaru dari Phillippa Lally dari University College London yang dipublikasikan dalam European Joumal Of Social Psychology, ternyata waktu yang diperlukan untuk menciptakan kebiasaan itu bervariasi tergantung tingkat kesulitan perilaku yang diinginkan, kurang lebih antara 21 hari-66 hari (sekitar 2 bulan)",
        "Saling terbuka dengan pasangan mengenai kondisi keuangan. ...\n" +
                "Buat pos anggaran secara cermat. ...\n" +
                "Tentukan rekening yang dipakai untuk kebutuhan rumah tangga. ...\n" +
                "Sebisa mungkin hindari pinjaman. ...\n" +
                "Sisihkan tabungan untuk dana darurat.",
        "Laptop menjadi benda penting sekarang ini. Alasannya, selain untuk kerja, gadget yang lumrah disebut notebook ini juga bisa digunakan mencari hiburan. Mulai dari media sosial, video, musik, sampai main game. Maka tak heran banyak orang rela membeli laptop meski harga mahal. Pikir mereka yang penting berkualitas.",
        "Peluang bisnis online tanpa modal semakin terbuka luas di era digital saat ini. Apalagi bagi kamu yang memiliki keahlian khusus dan niat untuk membangun usaha mandiri.  Hanya dengan bermodalkan fasilitas smartphone beserta jaringan internet, Anda bisa menekuni peluang bisnis online tanpa modal, karena sebagian besar menawarkan jasa dan keahlian.  \n" +
                "\n" +
                "Artikel ini telah tayang di www.inews.id dengan judul \" 12 Peluang Bisnis Online Tanpa Modal, Bisa Langsung Dicoba \", Klik untuk baca: https://www.inews.id/finance/bisnis/12-peluang-bisnis-online-tanpa-modal-bisa-langsung-dicoba.\n" +
                "\n" +
                "\n" +
                "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
                "https://www.inews.id/apps",
        "Memang sih ada banyak warung mudah di sekitar kosan kamu, tapi pasti lama-kelamaan uang kiriman orang tua kamu habis juga. Belum lagi uang transport kamu buat bolak-balik ke kampus dan uang budget buat kebutuhan lainnya. Karena itu, mungkin di antara kamu ada yang merasa kesusahan saat cari menu makanan yang pas dengan selera sekaligus pas dengan kantong kamu.\n" +
                "\n" +
                "Menu makanan anak kost memang bermacam-macam, bisa dimasak sendiri atau dibeli di warung terdekat. Yang jelas, mahasiswa pasti ada aja akal panjang untuk memenuhi kebutuhan perut. Dari berbagai akal panjangnya itu, biasanya ada 5 menu makanan yang jadi favorit.",
        "Shiloh Pepin dan Tiffany Yorks berhasil membungkam pertanyaan orang-orang karena bertahan hidup dengan apa yang dikenal sindrom putri duyung. Dikenal juga sebagai sirenomelia, sindrom putri duyung menyebabkan kaki seseorang sepenuhnya bergabung.\n" +
                "\n" +
                "Tak ada yang bisa memecahkan penyebabnya. Sirenomelia adalah cacat lahir acak tanpa alasan atau pola yang jelas. Teori yang ada saat ini adalah bahwa faktor lingkungan dapat berperan dalam perkembangan janin, tapi mereka tak dapat memastikan.",
        "Kesuksesan merupakan impian semua orang yang ada di dunia. Akan tetapi, pernahkah terbesit dipikiran mengenai bagaimana cara menjadi orang sukses? Dalam mencapai sebuah kesuksesan tentu membutuhkan usaha yang maksimal dan semangat pantang menyerah.",
        "Kamu memang membutuhkan judul artikel yang sesuai dengan optimasi SEO agar dapat naik peringkat. Akan tetapi, Kamu harus menyesuikan juga dengan kebutuhan pembaca yang membuat judul tidak terlalu kaku.",
    )

    private val articleWriter = arrayOf("Huda Putra Santosa",
        "M. Mirza Thariq",
        "Restu Aditya",
        "M. Ikhsanudin",
        "Rendi Putra P.",
        "Felis Tigris H.",
        "Haidar Alif",
        "Thoriq Alburuj",
        "Ikhsan Maulana",
        "Maulana Bachri")

    private val articleDate = arrayOf("17 Agustus 2022",
        "27 Agustus 2022",
        "7 Agustus 2022",
        "12 Agustus 2022",
        "1 Agustus 2022",
        "1 September 2022",
        "5 September 2022",
        "7 September 2022",
        "10 September 2022",
        "12 September 2022")

    private val articleImages = intArrayOf(
        R.drawable.article_1,
        R.drawable.article_2,
        R.drawable.article_3,
        R.drawable.article_4,
        R.drawable.article_5,
        R.drawable.article_6,
        R.drawable.article_7,
        R.drawable.article_8,
        R.drawable.article_9,
        R.drawable.article_10
    )

    val listData: ArrayList<Article>
        get() {
            val list = arrayListOf<Article>()
            for (position in articleTitle.indices) {
                val article = Article()
                article.title = articleTitle[position]
                article.description = articleDescription[position]
                article.writer = articleWriter[position]
                article.date = articleDate[position]
                article.photo = articleImages[position]
                list.add(article)
            }
            return list
        }



}