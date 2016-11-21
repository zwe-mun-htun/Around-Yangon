package com.dev.zwemunhtun.aroundyangon.model;

import android.content.Context;

import com.dev.zwemunhtun.aroundyangon.db.DataProvider;

/**
 * Created by ZweMunHtun on 7/24/2016.
 */
public class UniversityData {

    public static void UniversityInfo(Context context){

        DataProvider provider=new DataProvider(context);

        provider.addUniversity(new RvUniversityModel(
                "University of Computer Studies, Yangon",
                "http://www.ucsy.edu.mm/ucsy/gallery/ucsy/01.jpg",
                        "Motto \tမြန်မှန်တွက်ချက် တိုင်းပြည်တွက်\n" +
                        "Established \t1971\n" +
                        "Rector \tDr. Mie Mie Thet Thwin\n" +
                        "Colors \tTurquoise     \n" +
                        "Affiliations \tSOI Asia\n" +
                        "Website \twww.ucsy.edu.mm",
                "The University of Computer Studies, Yangon (UCSY) (Burmese: ရန်ကုန်ကွန်ပျူတာတက္ကသိုလ် [jàɴɡòʊɴ kʊ̀ɴpjùtà tɛʔkəθò]), located in the outskirts of Yangon (Hlaw Gar), is the leading IT and computer science university of Myanmar.[1] The university, administered by the Ministry of Science and Technology, offers undergraduate and graduate degree programs in computer science and technology. The language of instruction at UCSY is English. Along with the University of Computer Studies, Mandalay, UCSY is one of two senior universities specialized in computer studies, and also one of the most selective universities in the country.",
                "Yangon, Myanmar Myanmar",
                "01 610655",
                "01610655") );

        provider.addUniversity(new RvUniversityModel(
                "Defence Services Medical Academy (DSMA)",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Dsma0.jpg/250px-Dsma0.jpg",
                "Former names\n" +
                        "\tDefence Services Institute of Medicine (DSIM)\n" +
                        "Motto \tVictorious medical practitioner soldiers\n" +
                        "သမားဇာနည် အောင်စစ်သည်\n" +
                        "Type \tPublic\n" +
                        "Established \t19 November 1992[1]\n" +
                        "Rector \tProf. Col. Ko Ko Lwin\n" +
                        "Principal \tBrig-Gen. Myo Zaw Thein[2]\n" +
                        "Postgraduates \t242 (2010)\n" +
                        "Colors \tRed, Green, White, Yellow,Orange, Blue                     \n" +
                        "Nickname \tDSMA\n" +
                        "Affiliations \tDirectorate of Medical Services (Burma), Ministry of Health, Universities Central Council, the Government of the Union of Myanmar[Burma]",
                "The Defence Services Medical Academy (DSMA) (Burmese: တပ်မတော် ဆေး တက္ကသိုလ်, pronounced: [taʔmədɔ̀ sʰé tɛʔkəθò]), located in Mingaladon, Yangon, is the University of Medicine of the Myanmar Armed Forces. One of the most selective universities in the country, the academy offers M.B., B.S. (equivalent of the M.D.) degree programs. Upon graduation, most DSMA cadets are commissioned with the rank of Lieutenant in the Myanmar Army Medical Corps. The military physicians are to serve the healthcare needs of rural people when they are assigned in the country's remote regions where access to healthcare is poor.",
                "Mindaladon,Yangon,Burma",
                "09792438469",
                "09792438469"
        ));
        provider.addUniversity(new RvUniversityModel(
                "Dagon University",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Dagon_Signboard.JPG/1024px-Dagon_Signboard.JPG",
                "Motto \tBorn to be the outstanding generation\n" +
                        "Type \tpublic\n" +
                        "Established \t1993; 23 years ago\n" +
                        "Rector \tDr. Hla Htay\n" +
                        "Students \t60,000\n" +
                        "Yangon Region, Myanmar\n" +
                        "Coordinates: 16°54′47″N 96°12′44″E\n" +
                        "Website \tdagonuniversity.edu.mm",
                "North Dagon, Yangon",
                "Dagon University (Burmese: ဒဂုံ တက္ကသိုလ်), located in North Dagon, Yangon, is one of the largest universities in Myanmar. The university, established in 1993, offers bachelor's and master's degrees in liberal arts and sciences to full-time, part-time and online students. Dagon University also offers a full-time four-year law degree program. The university's 1,582-acre (6.40 km2) campus in the outskirts of Yangon is one of the largest campuses in the country",
                "-",
                "-"
        ));
        provider.addUniversity(new RvUniversityModel(
                "University of East Yangon",
                "http://uzo.sakura.ne.jp/blog/images/R0010175-thumb.jpg",
                "Rector \tDr. Kyaw Kyaw Hkaung\n" +
                        "Students \t11,000 (2006)",
                "The University of East Yangon (Burmese: ရန်ကုန် အရှေ့ပိုင်း တက္ကသိုလ်), located in Thanlyin in the southeastern suburbs of Yangon, is a liberal arts and sciences university in Myanmar. The university offers bachelor's degree programs in liberal arts and science and law.[2]\n" +
                        "\n" +
                        "A train service opened in 2006 connects the university campus to downtown Yangon. About 2000 students use the service daily.[3]\n" +
                        "\n" +
                        "New Convocation Hall building is finished and had been grandly opened on 25 November 2014",
                "Thanlyin,Yangon Division, Myanmar",
                "-",
                "-"
        ));
        provider.addUniversity(new RvUniversityModel(
                "Myanmar Maritime University",
                "https://upload.wikimedia.org/wikipedia/en/thumb/0/06/Mmu_pic1.jpg/220px-Mmu_pic1.jpg",
                "Established \t1 August 2002[1]\n" +
                        "Rector \tMyat Lwin\n" +
                        "Students \t450 per intake of 2010[2]\n" +
                        "Undergraduates \t1741 (2007)[3]\n" +
                        "Yangon Region, Myanmar\n" +
                        "Coordinates: 16°42′11″N 96°15′51″E\n" +
                        "Affiliations \tYangon Technological University, Korea Maritime University, Nagaoka University, Nihon University, Tokyo University of Marine Science and Technology\n" +
                        "Website \twww.mot.gov.mm/mmu/",
                "Myanmar Maritime University (MMU) (Burmese: မြန်မာနိုင်ငံ ရေကြောင်းပညာ တက္ကသိုလ် [mjəmà nàɪɴŋàɴ jèdʑáʊɴ pjɪ̀ɴɲà tɛʔkəθò]), located in Thanlyin in the outskirts of Yangon, is the premier university of maritime education in Myanmar. MMU, administered by the Ministry of Transportation, offers six-year bachelor's degree programs and two-year post-graduate diplomas in various marine and naval disciplines.[1] In 2007, the school had about 1,800 graduate students, pursuing international STCW-95-standards compliant maritime education.[3]\n" +
                        "\n" +
                        "MMU is one of the most selective universities in Myanmar as many of its students find job opportunities abroad.",
                "Thilawa, Thanlyin 11293\n" +
                        "Yangon Region, Myanmar",
                "-",
                "-"
        ));
        provider.addUniversity(new RvUniversityModel(
                "University of West Yangon",
                "https://img.youtube.com/vi/rmO_hNf-aos/mqdefault.jpg",
                "Motto \tTo develop the knowledge for benefit of the country\n" +
                        "Type \tpublic\n" +
                        "Established \t27 June 2002\n" +
                        "Rector \tDr. Khine Mye [1]\n" +
                        "Students \t7100 (2012)[2]\n" +
                        "Undergraduates \tBA, BSc\n" +
                        "Postgraduates \tMA, MSc, MRes",
                "The University of West Yangon (Burmese: ရန်ကုန် အနောက်ပိုင်း တက္ကသိုလ် [jàɴɡòʊɴ ʔənaʊʔpáɪɴ tɛʔkəθò]), located in Htantabin, Yangon Division, is a liberal arts and sciences university in Myanmar. The university offers bachelor's and master's degree programs in liberal arts and science.[3] Students who wish to pursue post-graduate (especially PhD course)studies typically go to Yangon University.",
                "Htantabin,Yangon Division, Myanmar",
                "-",
                "-"
        ));
        provider.addUniversity(new RvUniversityModel(
                "University of Dental Medicine, Yangon",
                "https://upload.wikimedia.org/wikipedia/commons/a/a1/University_of_Dental_Medicine%2C_Yangon.jpg",
                "Established \t1964\n" +
                        "Rector \tShwe Toe , Dr (2015 Feb - Present)\n" +
                        "Coordinates: 16°50′3.2″N 96°12′32.3″E\n" +
                        "Affiliations \tMinistry of Health",
                "The University of Dental Medicine, Yangon (Burmese: သွားဘက်\u200Cဆိုင်ရာ ဆေး တက္ကသိုလ် (ရန်ကုန်) [θwábɛʔ sʰàɪɴjà sʰé tɛʔkəθò (jàɴɡòʊɴ)]), is the leading university of dental medicine, located in Yangon, Myanmar. The university, along with the University of Dental Medicine, Mandalay, is only one of two universities of dental medicine in the country. The annual intake into both dental universities is only 300.The country with a population of over 50 million had only about 1500 dentists in 2005",
                "Thingangyun,Yangon Division, Myanmar",
                "-",
                "-"
        ));
        provider.addUniversity(new RvUniversityModel(
                "University of Foreign Languages, Yangon",
                "https://upload.wikimedia.org/wikipedia/en/thumb/8/89/University_of_Foreign_Language.jpg/1024px-University_of_Foreign_Language.jpg",
                "Motto \tLet's serve our country with foreign languages.\n" +
                        "Type \tpublic\n" +
                        "Established \t1964\n" +
                        "Rector \tDr. Lwin Lwin Soe",
                "The University of Foreign Languages, Yangon (Burmese: နိုင်ငံခြားဘာသာတက္ကသိုလ် (ရန်ကုန်) [nàɪɴŋàɴdʑá bàðà tɛʔkəθò jàɴɡòʊɴ]), located in Yangon, is the leading university for the study of foreign languages in Myanmar. The university offers full-time four-year bachelor's degree programs, and part-time diploma programs in the study of several Asian and European languages. The university is popular with students interested in careers in the tourism industry or finding work overseas",
                "119-131 University Avenue\n" +
                        "Kamayut,Yangon Division, Myanmar",
                "-",
                "-"
        ));
        provider.addUniversity(new RvUniversityModel(
                "University of Medicine 1, Yangon",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Main_building_of_the_University_of_Medicine_1%2C_Yangon%2C_2009.jpg/1024px-Main_building_of_the_University_of_Medicine_1%2C_Yangon%2C_2009.jpg",
                "Former names\n" +
                        "\tInstitute of Medicine 1 (IM-1), Medical College 1 (MC-1)\n" +
                        "Motto \tဥပဌာနံ၊ အနုကမ္မာ၊ ဒယာ\n" +
                        "(Pali: upaṭhānaṃ, anukammā, dayā)\n" +
                        "Motto in English\n" +
                        "\tService, Sympathy, Humanity\n" +
                        "Type \tPublic\n" +
                        "Established \t2 February 1927\n" +
                        "Rector \tZaw Wai Soe\n" +
                        "Academic staff\n" +
                        "\t685\n" +
                        "Students \t2969 (2002–2003)[1]\n" +
                        "Undergraduates \t3000\n" +
                        "Postgraduates \t500\n" +
                        "Coordinates: 16°49′9″N 96°8′2″E\n" +
                        "Campus \t\n" +
                        "\n" +
                        "    Lanmadaw (Main)\n" +
                        "    Pyay Road\n" +
                        "    Thahton Road\n" +
                        "\n" +
                        "Colors \tRed, Black, White, Yellow                 \n" +
                        "Affiliations \tMinistry of Health\n" +
                        "Website \twww.um1ygn.edu.mm",
                "The University of Medicine 1, Yangon (Burmese: ဆေးတက္ကသိုလ်(၁) ရန်ကုန် [sʰé tɛʔkəθò tɪʔ (jàɴɡòʊɴ)]; formerly the Institute of Medicine 1), located in Yangon, it is the oldest medical school in Myanmar. The university offers M.B.,B.S. (equivalent of the M.D.) degrees and graduate (diploma, master's and doctoral) degrees in medical science.[2] The university is perhaps the most selective university in the country, and admits approximately 400 students annually based solely on their University Entrance Examination scores.\n" +
                        "\n" +
                        "The University of Medicine 1 comprises three campuses: Lanmadaw campus (also known as St. John's), Pyay Road campus and Thaton Road campus.\n" +
                        "\n" +
                        "University of Medicine 1, Yangon is one of four schools in Burma recognized by the Educational Commission for Foreign Medical Graduates.",
                "Location \tYangon, Yangon Region, Myanmar",
                "-",
                "-"
        ));
        provider.addUniversity(new RvUniversityModel(
                "University of Medicine 2,Yangon",
                "https://upload.wikimedia.org/wikipedia/commons/0/0e/University_of_Medicine_2%2C_Yangon.jpg",
                "Motto \tဥပဌာနံ အနုကမ္မာ ဒယာ\n" +
                        "(Pali: upaṭhānaṃ, anukammā, dayā)\n" +
                        "Motto in English\n" +
                        "\tService, Sympathy, Humanity\n" +
                        "Type \tPublic\n" +
                        "Established \t15 July 1963\n" +
                        "Rector \tAye Aung\n" +
                        "Students \t391 (2015-2016)[1]\n" +
                        "Coordinates: 16°54′9.36″N 96°9′17.82″E\n" +
                        "Affiliations \tMinistry of Health\n" +
                        "Website \twww.um2ygn.gov.mm",
                "The University of Medicine 2, Yangon (Burmese: ဆေးတက္ကသိုလ်(၂) ရန်ကုန် [sʰé tɛʔkəθò n̥ɪʔ (jàɴɡòʊɴ)]; formerly, Institute of Medicine 2) is a university of medicine, located in North Okkalapa, Yangon, Myanmar. The university offers M.B.,B.S. degrees and graduate (diploma, master's and doctoral) degrees in medical science.[2] The university is one of the most selective in the country, and accepts approximately 300 students annually based solely on their University Entrance Examination scores.\n" +
                        "\n" +
                        "University of Medicine 2, Yangon is one of 5 medical schools in Burma recognized by the Educational Commission for Foreign Medical Graduates.",
                "North Okkalapa, Yangon, Yangon Division, Myanmar",
                "-",
                "-"
        ));
    }
}
