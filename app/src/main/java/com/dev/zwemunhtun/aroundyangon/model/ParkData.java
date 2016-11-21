package com.dev.zwemunhtun.aroundyangon.model;

import android.content.Context;

import com.dev.zwemunhtun.aroundyangon.db.DataProvider;

/**
 * Created by ZweMunHtun on 7/30/2016.
 */
public class ParkData {
    public static void ParkInfo(Context context){
        DataProvider provider=new DataProvider(context);

        provider.addPark(new RvParkModel(
                "Hlawga National Park",
        "http://yangonlife.cdn3.mspiral.biz/cdn/farfuture/Ke3bN2RmGtAno7A48cnKOEzH0p4XLeTzX-8WNSzUO3o/mtime:1454925321/sites/yangonlife.com.mm/files/styles/article_detail_image/public/article_images/IMG_0871.JPG?itok=bc2U1jVM",
        "Hlawga National Park (Burmese: လှော်ကားအမျိုးသားဥယျာဉ်) is a national park located in Mingaladon, Yangon Division, Myanmar, 22 miles (35 km) north of Yangon. The 1540-acre (623-hectare) park includes an 818-acre (313 hectare) wildlife park, a 62-acre (25-hectare) mini-zoo and a 660-acre (267-hectare) buffer zone.[1]\n" +
                        "\n" +
                        "First established as an environmental education center in 1982, the national park is a popular day-trip destination with Yangonites and ecotourists.",
        "Mingaladon, Yangon Region, Myanmar",
                "https://goo.gl/maps/ce12gF6hBpz"));

        provider.addPark(new RvParkModel(
                "People park and people square",
                "https://peterandjessie.files.wordpress.com/2014/11/wpid-photo-201411071615088.jpg",
                "The People's Square and Park (Burmese: ပြည်သူ့ဥယျာဉ်) is one of the major parks surrounding the Shwedagon Pagoda in Yangon, Myanmar. Located west of the great pagoda to the former Pyithu Hluttaw (People's Parliament) complex, the 135.72 acre (54.92-hectare) park is bounded by Pyay Road to its west, U Wisara Road to its east, Dhammazedi Road to its north and Ahlone Road to its south.[1]\n" +
                        "\n" +
                        "The area had been part of the palace grounds of Queen Shin Sawbu and later a golf course for some years during the colonial days.\n" +
                        "\n" +
                        "A little over half of the complex is the 70.3-acre (284,000 m2) People's Square. A flower- and tree-lined marble esplanade starting from Pyithu Hluttaw towards the Shwedagon Pagoda is the center piece of the square. Over a thousand trees and plants from 52 species make up the square. Pyidaungsu Ayeyeik Nyein occupies a corner of the Square and holds a permanent exhibition of dioramas of various Burmese ethnic groups, specimens of valuable timber and gemstones from various parts of the country.[1]\n" +
                        "\n" +
                        "People's Park occupies 65.42 acres (264,700 m2) adjacent to the square in the north. Over 3,000 plants including 72 species of trees, 12 species of bamboo and 50 species of shrubs and climbers indigenous to various parts of the country are planted in this park. botanical maze, flower displays, fruit trees and medicinal herbs account for an additional 17,000 flowering plants.",
                "UWisara road,Yangon",
                "https://goo.gl/maps/G4M1dDnrGFp"));
        provider.addPark(new RvParkModel(
                "Maha Bandula Park",
                "http://burmasenses.com/wp-content/uploads/2013/12/%E2%80%8BMaha-Bandula-Monument.jpg",
                "The park dates to 1867 to 1868, founded as Fytche Square in honour of the then Chief Commissioner of British Burma, Albert Fytche.[2] The site was previously a vacant, swampy site originally known as Tank Square, which was cleared and laid out as a public recreation ground.[3] A white marble statue of Queen Victoria was placed in the center of the park in 1896, gifted by a wealthy Armenian firm in Rangoon.[4][5] After 1935, the park was renamed Bandula Square, reflecting rising nationalist sentiment.[5]\n" +
                        "\n" +
                        "After 1948, the Independence Monument, an obelisk in commemoration of Burmese independence from the British in 1948, was installed at the center of the park, replacing the statue of Queen Victoria.The statue of Queen Victoria was brought back to England after Myanmar Independence. The architect of this Independence Monument Sithu U Tin who is the same architect for City Hall.[6] The park was remodelled in 2012.",
                "Near Sule Pagoda,MahaBandula Road,Yangon",
                "https://goo.gl/maps/uVoW2R4ZyE62"
        ));
        provider.addPark(new RvParkModel(
                "Kandawgyi Lake",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Karaweik-Palace.JPG/1024px-Karaweik-Palace.JPG",
                "Kandawgyi Lake (Burmese: ကန်တော်ကြီး pronounced: [kàndɔ̀dʑí]; literally \"great royal lake\", formerly Royal Lake), is one of two major lakes in Yangon, Burma (Myanmar). Located east of the Shwedagon Pagoda, the lake is artificial; water from Inya Lake is channelled through a series of pipes to Kandawgyi Lake. It was created to provide a clean water supply to the city during the British colonial administration.[1][2] It is approximately 5 miles (8 km) in circumference, and has a depth of 20 to 45 inches (50 to 115 cm).[3]\n" +
                        "\n" +
                        "The 150-acre (61 ha) lake is surrounded by the 110-acre (45 ha) Kandawgyi Nature Park,[4] and the 69.25-acre (28-hectare) Yangon Zoological Gardens, which consists of a zoo, an aquarium and an amusement park.[5]\n" +
                        "\n" +
                        "\n" +
                        "The Karaweik is a famous icon along Kandawgyi Lake's shores.\n" +
                        "The lake itself is bounded by Natmauk Street to its north and east, Bahan Street to its west, and Kanyeiktha Street to its south. Along the eastern shorelines of the lake is the famous Karaweik, a concrete replica of a Burmese royal barge built in 1972.[6] It houses a buffet restaurant today.\n" +
                        "\n" +
                        "\n" +
                        "Kandawgyi Lake in 1895\n" +
                        "On 15 April 2010, three bombs exploded in a road near to the lake in the afternoon during the Burmese New Year festival; 10 people were killed and 178 injured.",
                "kanyikethar Road,Yangon",
                "https://goo.gl/maps/gAWqTvdjSLA2"
        ));
        provider.addPark(new RvParkModel(
                "Inya Lake",
                "http://cdn.akairan.com/akairan/user/12/201576162513326a.jpg",
                "Inya Lake (Burmese: အင်းလျားကန် [ʔíɴjá kàɴ]; formerly, Lake Victoria) is the largest lake in Yangon, Burma (Myanmar), a popular recreational area for Yangonites, and a famous location for romance in popular culture. Located 6 miles (10 km) north of downtown Yangon, Inya Lake is bounded by Parami Road on the north, Pyay Road on the west, Inya Road on the southwest, University Avenue on the south, and Kaba Aye Pagoda Road on the east.",
                "Pyay Road, Yangon",
                "https://goo.gl/maps/SVX2DP8jGS72"
        ));
    }
}
