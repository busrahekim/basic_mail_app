package com.example.lab6;

public class Messages {

    private String title;
    private String mail;
    private String subTitle;
    private String description;

    public static final Messages[] messages = {
            new Messages("Samsung Cloud",
                    "Bazı Özellikler için Samsung Cloud Hizmet Sonu Uyarısı",
                    "Değerli Samsung Cloud Müşterileri,\n" +
                            "2021-11-30 tarihinden başlayarak, Galeri\n Eşitleme ve Dosyalarım için" +
                            "Drive depolama\n artık Samsung Cloud tarafından\n desteklenmeyecektir" +
                            "ve verileriniz aşağıda\n ayrıntılı olarak açıklandığı şekilde silinecektir.",
                    "no-reply@samsungcloud.com"),
            new Messages("Garanti BBVA",
                    "Beymen'de 6 taksit ayrıcalığı!",
                    "Beymen İstinyePark Açıldı. Bütün alışveriş\n meraklılarını bekleriz.",
                    "no-reply@garantibbva.com"),
            new Messages("TÜBİTAK",
                    "[ARBİS] Dijital Dönüşüm Çağrısı",
                    "Değerli araştırmacımız, çağrımızda bulunan ekteki\ndosyayı inceleyiniz.",
                    "no-reply@tubitak.com"),
            new Messages("Pegasus",
                    "Güvenli Uçuş İçin Önlemlerimiz",
                    "Sağlığınız için uçak içindeki en önemli\nşey tertemiz bir ortamdır.",
                    "no-reply@pegasusfly.com")
    };


    private Messages(String title, String subTitle,String description,String mail) {
        this.title = title;
        this.description = description;
        this.subTitle = subTitle;
        this.mail = mail;
    }

    public String getMail(int id){
        return mail;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return this.title;
    }

    public String getSubTitle() {
        return subTitle;
    }
}
