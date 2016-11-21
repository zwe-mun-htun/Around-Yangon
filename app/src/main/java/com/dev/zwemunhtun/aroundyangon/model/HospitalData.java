package com.dev.zwemunhtun.aroundyangon.model;

import android.content.Context;

import com.dev.zwemunhtun.aroundyangon.db.DataProvider;

/**
 * Created by ZweMunHtun on 7/29/2016.
 */
public class HospitalData {

    public static void HospitalInfo(Context context){
        DataProvider provider=new DataProvider(context);
        provider.addHospital(new RvHospitalModel(
                "North Okkalapa General Hospital",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/NOGH.jpg/220px-NOGH.jpg",
                "Teaching",
                "University of Medicine 2, Yangon",
                "Yes",
                "800",
                "1970",
                "North Okkalapa Township, Yangon Region, Burma",
                "https://goo.gl/maps/aYHyi2BzZUu"));

        provider.addHospital(new RvHospitalModel(
                "500–bed Specialty Hospital, Yangon",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/500%E2%80%93bed_Specialty_Hospital,_Yangon.jpg/2048px-500%E2%80%93bed_Specialty_Hospital,_Yangon.jpg",
                "Teaching",
                "University of Medicine 1, Yangon, University of Medicine 2, Yangon",
                "Yes",
                "500",
                "2014",
                "Lanmadaw, Yangon, Yangon Region, Myanmar (Burma)",
                "https://goo.gl/maps/21K5tdrMUTz"
        ));
        provider.addHospital(new RvHospitalModel(
                "Insein General Hospital",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Insein_General_Hospital.jpg/220px-Insein_General_Hospital.jpg",
                "Teaching",
                "University of Medicine 2, Yangon, University of Medical Technology, Yangon, University of Pharmacy, Yangon, University of Nursing, Yangon",
                "Yes",
                "300",
                "1930",
                "Mingyi Road, Taungthugone Quarter, Insein Township, Yangon, Yangon Region, Myanmar",
                "https://goo.gl/maps/aqNTrb2mtJy"
        ));
        provider.addHospital(new RvHospitalModel(
                "New Yangon General Hospital",
                "http://cityguide.com.mm/wp-content/uploads/2013/12/NewYangonGeneralHospital01-654x435.jpg",
                "Teaching",
                "University of Medicine 1,Yangon",
                "Yes",
                "250",
                "1984",
                "Lanmadaw Township, Yangon, Yangon Region, Myanmar",
                "https://goo.gl/maps/zQP5EWrM6iD2"
        ));
        provider.addHospital(new RvHospitalModel(
                "South Okkalapa Maternal and Child Hospital",
                "http://america.pink/MyThumb.php?file=images/3/2/6/2/7/5/3/en/1-north-okkalapa-general-hospital.jpg&size=200",
                "Teaching",
                "University of Medicine 2,Yangon",
                "Yes",
                "150",
                "1961",
                "Myitta Road, South Okkalapa Township, Yangon, Yangon Region, Myanmar",
                "https://goo.gl/maps/i4SA6zd82XG2"
        ));
        provider.addHospital(new RvHospitalModel(
                "Thingangyun Sanpya Hospital",
                "http://www.isc.niigata-u.ac.jp/~globalstrategy/img/myanmardonation/myanmardonation1.jpg",
                "Teaching",
                "University of Medicine 2,Yangon",
                "Yes",
                "500",
                "1994",
                "Kyaikkasan Pagoda Road, Thingangyun Township, Yangon, Yangon Region, Myanmar",
                "https://goo.gl/maps/SEES1NVuH2t"
        ));
        provider.addHospital(new RvHospitalModel(
                "West Yangon General Hospital",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Westygh.jpg/220px-Westygh.jpg",
                "Teaching",
                "University of Medicine 1,Yangon",
                "Yes",
                "750",
                "1950",
                "Kyimyindaing, Yangon, Yangon Division, Myanmar",
                "https://goo.gl/maps/XAjqMbZWKbK2"
        ));
        provider.addHospital(new RvHospitalModel(
                "East Yangon General Hospital",
                "http://photos.wikimapia.org/p/00/03/11/87/36_big.jpg",
                "public,Teaching",
                "University of Medicine1,Yangon",
                "Yes",
                "250",
                "1950",
                "Botahtaung , Yangon, Yangon Division, Myanmar",
                "https://goo.gl/maps/cY5d4wbFHy12"
        ));
    }
}
