package com.yunus.carsymbol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;



import com.yunus.carsymbol.databinding.ActivityMainBinding;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> arrayListLandmark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        arrayListLandmark = new ArrayList<Landmark>();

        Landmark bmw = new Landmark("BMW","Bavarian Motor Works isminin kısaltması olan BMW, ilk olarak sadece uçak üretiyordu. Bu yüzden logonun iç kısmındaki mavi bölümler gökyüzünü simgelerken, beyaz bölümler ise uçağın pervanesini oluşturuyor. Başka bir iddia ise amblemdeki mavi beyaz renklerin Bavyera eyaletinin renklerinden geldiği yönünde",R.drawable.bmw);
        Landmark audi = new Landmark("AUDİ","Şirketin kurucusu August Horch, kendi soyismini verdiği şirketten ayrılmıştı ve aynı ismin bir daha kullanılması yasaktı. Daha sonra August’un oğlu Latincede Horch ile aynı anlama geldiğini söyleyerek Audi ismini önerdi. Audi logosu olan iç içe geçmiş 4 halka ise 1932 yılında Almanya’da birleşerek güç birlği oluşturan dört adet otomobil firmasını (Audi, DKW, Horch ve Wanderer) temsil eder. Gümüş renk de Almanya’nın ulusal yarış renginden geliyor.",R.drawable.audi);
        Landmark astonmartin = new Landmark("ASTONMARTİN","Aston Martin ismi şirketin kurucularından olan Lionel Martin’in soyadından ve başarıyı bulduğu yer olan Aston Hill Climb’den geliyor. Amblemde yer alan kanatlar hızı simgelemesi için logoya 1927 yılında eklenmiş ve Bentley’nin kanatlı kaput üstü logosundan ilham alındığı düşünülüyor.",R.drawable.astonmartin);
        Landmark bentley = new Landmark("BENTLEY","Bentley, ilk olark 1. Dünya Savaşı sırasında uçak motorları yaparak adını duyurmuştu. Amblemdeki kanatların nedeni de bu. Logonun gümüş rengi ise entellektüelliği simgeliyor. Amblemin her iki tarafındaki kanatların ise farklı sayıda tüye ev sahipliği yaptığı görülüyor, bunlar markanın tarihi boyunca değişim göstermiş.",R.drawable.bentley);
        Landmark mercedes = new Landmark("MERCEDES BENZ","Mercedes-Benz’in kurucusu Karl Benz, motor fabrikası Deutz ve Köln manzaralı evinin tepesine bir yıldız amblemi koymuş ve eşine yazdığı mektupta, bu yıldızın bir gün başarıyı ve gücü temsil edeceğinden bahsetmiş. Yıllar içinde logoda değişiklik olsa da “karada, havada, suda” fikrini simgeleyen yıldız kalıcı olmuş.",R.drawable.mercedesbenz);
        Landmark ferrari = new Landmark("FERRARİ","Logonun üst tarafında İtalya bayrağı yer alırken, fontu oluşturan sarı renk ise Modena şehrinin rengi. Scuderia Ferrari’nin ilk harfleri de logodaki yerini almış. Logoda en dikkat çeken şahlanan siyah atı hikayesine gelirsek: 1. Dünya Savaşı sırasında hayatını kaybeden bir pilotun annesi olan Kontes Paolina’nın Enzo Ferrari’ye oğlunun uçağı üzerindeki şaha kalkan at figürünü arabalarında kullanmasını ve bunun ona iyi şans getireceğini söyler. ",R.drawable.ferrari);
        Landmark ford = new Landmark("FORD","Mavi oval ilk olarak 1927 yılında kullanıldı. Şirketin kurucusu Henry Ford’un imzası, 1909 yılında ilk kullanıldığından bu güne neredeyse değişmeden geldi.",R.drawable.ford);
        Landmark hyundai = new Landmark("HYUNDAİ","Hyundai’nin logosu her ne kadar italik yazılmış bir ‘H’ harfi gbi görünse de gizli bir anlam içeriyor. Logo aslında üretici ve tüketici arasında güveni gösteren iki kişinin tokalaşmasını simgeliyor.",R.drawable.hyundai);
        Landmark tesla = new Landmark("TESLA","Markanın ismi alternatif akımı bulan Nikola Tesla’dan geliyor. Logoda yer alan stilize edilmiş T harfinin dik kısmı rotor direğini ve bunun üzerine eğri çizgi ise sabit bobinin bir kısmını temsil ederek, elektrik motorunun kesitini bizlere gösteriyor.",R.drawable.tesla);
        Landmark volkswagen = new Landmark("VOLKSWAGEN","Alman üretici ortaya çıkardığı ilk araba modelinin tek tip ve halka hitap ettiğinden amblemlerinde de aynı amacı ve sadeliği ifade etmek istemiş. Bu yüzden de Almanca “halk” anlamına gelen “volks” kelimesiyle araba anlamına gelen “wagen” kelimesinin baş harflerini üst üste koyup bugünkü amblemi oluşturmuşlar.",R.drawable.volkswagen);
        Landmark maserati = new Landmark("MASERATİ","Maserati kardeşlerin doğduğu Bologna’da bulunan fıskiyeli havuz logoya ilham vermiş. Neptün’ün deprem, fırtına ve atların tanrısı olmasından da etkilenen kardeşler, üçlü çatallı mızrağı da kendilerine logo olarak seçmiş.",R.drawable.maserati);

        arrayListLandmark.add(bmw);
        arrayListLandmark.add(audi);
        arrayListLandmark.add(astonmartin);
        arrayListLandmark.add(bentley);
        arrayListLandmark.add(mercedes);
        arrayListLandmark.add(ferrari);
        arrayListLandmark.add(ford);
        arrayListLandmark.add(hyundai);
        arrayListLandmark.add(tesla);
        arrayListLandmark.add(volkswagen);
        arrayListLandmark.add(maserati);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(arrayListLandmark);
        binding.recyclerView.setAdapter(landmarkAdapter);



    }
}