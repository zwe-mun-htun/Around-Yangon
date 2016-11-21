package com.dev.zwemunhtun.aroundyangon.model;

import android.content.Context;

import com.dev.zwemunhtun.aroundyangon.db.DataProvider;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class CinemaData {

    public static void CinemaInfo(Context context){

        DataProvider provider=new DataProvider(context);

        provider.addCinemas(new RvCinemaModel("Mingalar san pya cineplex",
                "http://2.bp.blogspot.com/_fgqXBhsYtOM/THSaGy_MLrI/AAAAAAAADQ0/jC5IJr0su6I/s1600/16+Myanmar+3+008.jpg",
                "Screens both foreign and Burmese films \n The newest of the cinema complexes",
                "202/206 Anawrahta Road, Lanmadaw, Yangon, Myanmar",
                "0973176000",
                "Showtimes: 10:00am, 12:30pm, 3:30pm, 6:30pm, and 9:30pm"
                ));

        provider.addCinemas(new RvCinemaModel("Twin Cinema",
                "https://swoleear.files.wordpress.com/2011/10/day243.jpeg",
                "Screens mostly Burmese films, and is more downbeat than the modern complexes." +
                        "\n Great place to check out the local scene and soak up the atmosphere. " +
                        "\nCheap and homely.",
                "309 Bogyote Aung San Road, Kyautata Township",
                "01372594",
                "Showtimes: 10:00am, 12:30pm, 3:30pm, 6:30pm, and 9:30pm"
        ));

        provider.addCinemas(new RvCinemaModel("Shae Saung Cinema",
                "https://www.myanmore.com/yangon/activities-directory/photos/2031/file/1243/shae.jpg?size=large",
                "An 800-seat cinema operated by the Mingalar group, this is another architectural landmark of Myanmar cinema. \n" +
                        "Early 1970s chic. Exhibits domestic Myanmar films, Hollywood & Bollywood films, as well as Chinese films." +
                        "\n Great place to check out the local scene and soak up the atmosphere. " +
                        "\nCheap and homely.",
                "No. 198/200 Sule Pagoda Road, Kyautata Tsp, Yangon",
                "01246962",
                "Showtimes: 10:00am, 12:30pm, 3:30pm, 6:30pm, and 9:30pm."
        ));

        provider.addCinemas(new RvCinemaModel("Thamada Cinema",
                "https://www.myanmore.com/yangon/activities-directory/photos/2029/file/1242/tham.png?size=large",
                "An 800-seat cinema operated by the Mingalar group, this is another architectural landmark of Myanmar cinema. \n" +
                        "Thamada is a national treasure. With its beautiful design and architecture, \n" +
                         "it’s worth visiting just to experience it’s pure 1950 retro feel. Screens mostly Burmese films, especially comedies.",
                "No. 5 Alanpaya Road, Dagon Tsp, Yangon, Myanmar",
                "01246963",
                "Showtimes: 10:00am, 12:30pm, 3:30pm, 6:30pm, and 9:30pm."
        ));

        provider.addCinemas(new RvCinemaModel("Nay Pyi Daw Cinema",
                "http://1.bp.blogspot.com/_fgqXBhsYtOM/TH6hB1IFAiI/AAAAAAAADRM/j6UoEomEXJM/s1600/16+Myanmar+3+100.jpg",
                "Yangon’s most popular cinema screens a lot of foreign movies and sometimes hosts international film festivals. \n" +
                        "Its 1970s chic, and has 3D offerings and very cool aircon. The local popcorn is worth a try, sweet not salty." +
                        " It has a great architectural façade, that is very funky.",
                "No. 242/248 Sule Pagoda Road, Kyautata Tsp, Yangon",
                "01251277",
                "Showtimes: 10:00am, 12:30pm, 3:30pm, 6:30pm, and 9:30pm."
        ));

        provider.addCinemas(new RvCinemaModel("Junction Cineplex at Junction Square ",
                "https://www.myanmore.com/yangon/activities-directory/photos/2025/file/1240/jun%20cp.jpg?size=large",
                "Screens both foreign and Burmese films. Modern and clean.",
                "Kyun Taw Road, Yangon, Yangon Region, Republic of the Union of Myanmar",
                "01527055",
                "Showtimes: 10:00am, 12:30pm, 3:30pm, 6:30pm, and 9:30pm."
        ));

        provider.addCinemas(new RvCinemaModel("Junction Cineplex at Junction Mawtin ",
                "https://www.myanmore.com/yangon/activities-directory/photos/2023/file/1239/junc.jpg?size=large",
                "Screens both foreign and Burmese films",
                "Bohmu Ba Htoo Road, Yangon, Burma",
                "01225244",
                "Showtimes: Sun – Thurs: 10AM, 1PM, 4PM, 7PM\n" +
                        "Fri – Sat: 10AM, 1PM, 4PM, 7PM, 9.30PM"
        ));

        provider.addCinemas(new RvCinemaModel("Mingalar Cinema @ Dagon Center II",
                "http://s.wsj.net/public/resources/images/OB-UF565_titani_E_20120819041954.jpg",
                "Screens both foreign and Burmese films",
                "268 Pyay Road, Myay Ni Gone Ward, San Chaung Township, Yangon",
                "0973254091",
                "Showtimes: 10:00am, 12:30pm, 3:30pm, 6:30pm, and 9:30pm."
        ));

        provider.addCinemas(new RvCinemaModel("Mingalar Cinema",
                "https://www.myanmore.com/yangon/activities-directory/photos/3269/file/1994/mingalar.jpg?size=large",
                "Screening mostly Burmese films, this is an old style cinema complex.",
                "5th Floor, Theingyizay Blk D, Latha Township, Yangon, Myanmar",
                "01241057",
                "Showtimes: 10:00am, 12:30pm, 3:30pm, 6:30pm, and 9:30pm."
        ));


    }

}
