
package com.example.viewpager2andtablayout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
/*
La7 ne7ke l youm 3ala l viewpager view:
ne7na 7kena 2abl 3an l viewpager l 3adeye w 7ekna eno howe nou3 mn anwa3 l application le mnest5dem feha fragment w 3mlna application w shofna keef mnerbet l tablayout ma3 l viewpager

ba3d heek shofna eno l addpter bel viewpager dupricated w nezel she tene:
Viewpager 2 nes5a a7san mn l viewpager l 3adeye w 2olo addpter tene 8eer le sta3mlne bel viewpager l 3ade
l fekra bel viewpager 2 ta3amoul ma3o nafs ta3amoul ma3 l viewpager 1 bas be code mo5talef w b class mo5talef
tab3an ta3amoul ma3 l viewpager 2 monazam aktar w a7san mn ta3amoul ma3 l viewpager 1

-2awl she brou7 3al xml w bdeef fee l viewpager 2 w l tablayout w badna nenebh eno ta3amoul ma3 l viewpager 2 mo5talef kolayn 3an l viewpager l 3ade howe nafs l fekra ta3et l viewpager 1 bas ta3moul ma3o 8eer
-hala2 ba3d ma defna l commponent 3ala l xml l hone l viewpager w tablayout tene 5etwe lezm hala2 2a3mel fragment l2no mtl ma 7kena abl l viewpager 2 2aw viewpager 1 howe n3ama 3ashen ndeef fe fragemnts w 2a3ml pagin baynetoun seeerr etna2al mn 5elel l swipe 2aw click 3lyhoun hala2 ba3mel fragment esmo product fragemnt
-ana bade 2a3ml fragemnt fe category id w mn5elel l category id te3red l data le bde5ela ya3ne howe nafs l fragemnt bas bseeer byet8yar data 7asab l category id
-hala2 b2lab l fragemnt xml ba3mel reccyel view bas ne7na mnetzakar bas na3mel recycle view lezm na3mel data w njaheza ,ba3den a3mel addpter
-hala2 ba3mel data class esmo   utils  feha data wahmeye ya3ne ne7na bokra bas nest5dem database 2aw she tene ma mna3mlo hala2 heda bas data wahmeye ba3mel class esmo product w b class l utils b3abe l arraylist feha product
-ba3d ma 3mlt class l product brou7 3a class l utils ba3mel tnen arraylist wa7de esma product wa7de esma categories l categories feha tasnefet mo3ayane metl iza food..etc
-5alst data w 5alst l addpter
-hala2 brou7 3ala l fragmnet bjeeb data mn l utils class mn 5elel l utils.getcategory(category) fa howe 7a yjeble l array list 7asab l category le 3atyto yeha btredele hay arraylist mn no3 product
-ba3den ba3mel addpter w berselo hay l arraylist w ba3mel l reccyele view kel haw ba3meloun bel oncreateview bel layoutmanager be7je la context b2lab l gragemnt 3ana ne7na getactivity,getcontext w getrequrecontext sat3ml l getrequre context l2no hay ma btrje3 null l be2e momke b7alet m3yane traje3 null
-hala2 mneje mna3mel setup lala mainactivity:
1-2awl ma tblesh l activity 2olo Utils.FillData(); hay stad3yneha 3ashen n3be l data l wahmeye
2-badna nshof kab tab bel tablayout bado ykoun mawjoud 3andak 3ala 3adad l category ya3ne 5amse fa mnje mna3mel arraylist of fragemnt lesh l2no l viewpager bye5od arraylist mn l fragemnt ba3den ba3mel for loop 3ala l 3adad l categors w b3abe l array list ta3et l fragemnt b2olo arraylist.add(Productfragemnt.newinstance w beb3tlo esm l category
3-badna  na3mel l addapter taba3 l viewpager 2 mnsame pageraddpter extends mn fragemntStateAddpter
4-ba3d ma 5alsna l addpter bteje bta3mel addapter l page w bta3te l arraylist le feha fragemnt
5-ba3den ba3mel viewpager2.setaddpter w b3te l addpter
6-hala2 e5er 5etwe eno keef la7 terbout l pager ma3 tablayout:
alak 3ande class esmo TablayoutMediator 3ebara 3an class bta3te tablayout w bta3te l viewpager w be2om byerbotalk yehoun ma3 ba3d

heda l class 2awl parameter howe tablayout tene wa7d howe l view pager telet wa7d:
telet wa7d howe listner la sho listner heda b2labo 2awl she method esma onconfiguretab hayda l method btestd3a 3end enshe2 tab la 2awl mara ya3ne kel ma yenshe2 tab la 2awal mara byestd3eha fa enta hayde l listner mna3mel joweta mna3ete esm la kel tab w heye bas btstd3a 2awl ma yenshe2 kel tab ba3d heek betbtel testd3a
ya3ne hayde l function le esma onconfiguration 2awl ma tenshe2 2awl tab bteb3tkl  yeha ma3 l postion ta3ela bterja3 btenshe2 tenye btesdt3a w bteb3tlk tab tenye w ma3 l postion heed la y5ales kel tabet bas 2awl mara ba3d heek btbtel testd3a
fa enta b2laba bt2olo 3atene hay tab.settext w bte5od Utils.categories.get(postion) ya3ne 3atene esm l category ta3el heda l postion w bten7at esm l category 3end kel tab
fa howe iza byenshe2 tab number 0 7a yjeeb l catgory number 0 w yrakeba w heek iza 3am yenshe2 tab ra2m wa7ad 7a yseejb l category ra2m wa7d w yrakeba


w feek kamen t7et icon la heda tab t2olo tab,seticon


bas kel heda l kalem 3mlto 3al fade iza ma 7atet e5er she ba3d l praces stad3et method l.attach hay l method btrakeb l 2e3dedetak 3ala shshe w tanfez l eshya le b2lab l onconfiguretab bas t7ot onattach btrou7 hay l onconfiguretab w bterkab 3al shshe w btetnfaz le bede5ela













*/











public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.FillData();
        tabLayout=findViewById(R.id.tablayout);
        viewPager2=findViewById(R.id.viewpager2);

        ArrayList<Fragment> fragments=new ArrayList<>();
        for (int i=0;i<Utils.categories.size();i++){
            fragments.add(ProductFragment.newInstance(Utils.categories.get(i)));
        }

        PageAddpter pageAddpter=new PageAddpter(this,fragments);
        viewPager2.setAdapter(pageAddpter);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(Utils.categories.get(position));

            }
        }).attach();

    }
}