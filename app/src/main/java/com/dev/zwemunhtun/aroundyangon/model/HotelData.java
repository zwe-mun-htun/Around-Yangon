package com.dev.zwemunhtun.aroundyangon.model;

import android.content.Context;

import com.dev.zwemunhtun.aroundyangon.db.DataProvider;

/**
 * Created by ZweMunHtun on 7/30/2016.
 */
public class HotelData {
    public static void HotelInfo(Context context){

        DataProvider provider=new DataProvider(context);

        provider.addHotel(new RvHotelModel(
                "Traders Hotel",
                "http://www.myanmarbravo.com/images/Traders%20Hotel.jpg",
                "Blending elegance and gracious hospitality, Traders Hotel, Yangon is the perfect base for taking in the city's distinctive and fascinating culture.",
                "No.223 Sule Pagoda Road,G.P.O Box 888,Myanmar",
                "(95-1)242828",
                "01242828"));

        provider.addHotel(new RvHotelModel(
                "Summit Park View Hotel",
                "http://www.myanmarbravo.com/images/Summit%20Parkview%20Hotel.jpg",
                "The first international hotel in Yangon, Summit Parkview Hotel is the preferred choice among business and international travelers from all over the world. A total of 140 tastefully furnished guest rooms and hotel apartments equipped with modern amenities to provide you with quality comfort of home.",
                "350, Ahlone Road,Dagon Township, Yangon.",
                "(95-1) 211888",
                "01211888"));

        provider.addHotel(new RvHotelModel(
                "The Strand Hotel",
                "http://www.myanmarbravo.com/images/Strend%20Hotel.jpg",
                "Built in 1901 as part of a chain of deluxe hotels in Asia including Raffles Hotel in Singapore. The Strand Hotel in Yangon, stands for all that were wondrous and opulent in a bygone era. Restored to its former glory, the Victorian-styled Strand combines the charms of the 1920s and 1930s with lavish modern-day amenities. ",
                "No. 92, Strand Road, Kyauktada, Yangon,Myanmar",
                "95-1-243377",
                "01243377"));

        provider.addHotel(new RvHotelModel(
                "The Governor's Residence",
                "http://www.myanmarbravo.com/images/The%20Governor'sResidence.jpg",
                "The Governor's Residence is an imposing Burmese two-story mansion built as the official home of one of the governor's from the southern states of the country. It is surrounded by a verdant lotus garden which is overlooked by the hotel's many glorious verandas. The hotel emanates style and history in a delightful setting.",
                "35 Taw Win Road, Dagon Township,Yangon, Myanmar",
                "95-1-229860",
                "0122860"));


        provider.addHotel(new RvHotelModel(
                "Savoy Hotel",
                "http://www.myanmarbravo.com/images/savoy-hotel.jpg",
                "The Savoy Hotel is a small colonial style Boutique Hotel. Rooms are comfortably furnished in wood fitting with traditional Myanmar antiques and beautifully appointed bathrooms. Hotel offers to the guests to feel automatically at home. ",
                "129, Dhammazedi Road,Yangon, Myanmar",
                "95-1526289, 526298, 526305",
                "01526289"));

        provider.addHotel(new RvHotelModel(
                "Micasa Hotel",
                "http://www.myanmarbravo.com/images/micasa-hotel.jpg",
                "Micasa is residence hotel provide precisely the homely ambience with personal touch and comfort to the business and leisure travellers.",
                "No 17, Kaba Aye Pagoda Road, Yankin Township,Yangon, Myanmar.",
                "951-650 933",
                "01650933"));


        provider.addHotel(new RvHotelModel(
                "Dusit Inya Lake Hotel",
                "http://www.myanmarbravo.com/images/inya-lake.jpg",
                "The Hotel's 211 guest rooms and suites, sumptuously decorated with traditional Burmese teak furniture and flooring, offer spectacular views of the gardens and lake. The hotel's experienced team also caters for seminars, conferences and banquets, backed by international standard facilities and impeccable yet discreet service.",
                "37, Kaba Aye Pagoda Rd,Yangon, Myanmar",
                "951-662866",
                "01662866"));

        provider.addHotel(new RvHotelModel(
                "The Grand Mee Yahta Hotel",
                "http://www.myanmarbravo.com/japan/jpimages/grandmeeyahta-1.jpg",
                "The Grand Mee Ya Hta Executive Residences with 96 luxury serviced apartments is situated on the actual site of the legendary ‘Old Burma Railway Headquarters’ which was built in 1908. With the renowned Bogyoke Market right adjacent to the property, The Grand Mee YaHta offers a walking access and unbeatable convenience to many of the city’s attractions as well as established business venues and offices.",
                "370, Bogyoke Aung San Road, Pabedan Township, Yangon, Myanmar.",
                "(951)256355, 256356",
                "01256355"));

        provider.addHotel(new RvHotelModel(
                "Espace Avenir Hotel",
                "http://www.myanmarbravo.com/images/Espace%20Avenir%20Hotel.jpg",
                "The best choice for stay in Myanmar. Panoramic view of the green city and an impressive vision of Yangon famous pagoda. Espace Avenir Hotel joins the top group of hotels in Yangon Serving guests in the tradition of internationals hotels.",
                "523,Pyay Road , Kamayut Township, Yangon.",
                "(95-1) 505222 , 505213",
                "01505222"));


        provider.addHotel(new RvHotelModel(
                "Hotel Yangon",
                "http://www.myanmarbravo.com/images/HOTEL%20YANGON.jpg",
                "Hotel Yangon sits majestically on a beautifully landscaped garden with a panoramic view of different parts of Yangon city.",
                "91/93, 8th Mile Junction, Mayangone Township, Yangon, Myanmar.",
                "951667708, 667688,",
                "01667708"));


        provider.addHotel(new RvHotelModel(
                "Panda Hotel",
                "http://www.myanmarbravo.com/images/Panda%20Hotel.jpg",
                "Pleasant, comfortable and fully facilitated. The best choice for stay in Myanmar.Panda Hotel is well suited to both casual international travelers and busy executive.",
                "No.205, Comerof Wadan Street & Min Ye Kyaw Swa Road, Lanmadaw Township, Yangon.",
                "(09-1) 212850, 229358",
                "01212850"));
        provider.addHotel(new RvHotelModel(
                "City Star Hotel",
                "http://www.myanmarbravo.com/images/City%20star%20Hotel.jpg",
                "The hotel can be classified as three-star hotel. Also is decorated with tasteful furniture in a traditional way. The uniqueness of our homely service gradually attracts many guests. City Star Tastefully furnished with teak wood in traditional style.",
                "No.169/171, Mahabandoola Garden Street, Kyauktada Tsp, (near yangon city hall) Yangon, Myanmar.",
                "95-1-370920, 370921, 370922, 370923,370924, 250291, 245365",
                "01370920"));

        provider.addHotel(new RvHotelModel(
                "Yuzana Garden Hotel",
                "http://www.myanmarbravo.com/images/Yuzana%20garden%20Hotel.jpg",
                "Yuzana Garden Hotel is colonial lifestyle hotel in this 21st century. It is the only Hotel that has a Garden Compound built on a 4.12 acre situated in Yangon City Centre.",
                "No.44, Alanpya Paya Road , Yangon , Myanmar.",
                "(951)248944/ 248941-7",
                "012488944"));


        provider.addHotel(new RvHotelModel(
                "Central Hotel",
                "http://www.myanmarbravo.com/japan/jpimages/central-hotel.jpg",
                "The Central Hotel offers personal and efficient services, ensuring that the guest feel pampered and comfortable through out their stay. This attention to detail extends to every aspect of the Central Hotel: from the well-trained staff to the comprehensive business, leisure and meeting facilities.",
                "No.335-337, Bogyoke Aung San Street, Pabedan Township, Yangon.",
                "(95-1)241007",
                "01241007"));
        provider.addHotel(new RvHotelModel(
                "Eastern Hotel",
                "http://www.myanmarbravo.com/images/Eastern%20Hotel.jpg",
                "Reasonable rate charges guaranteed. Eastern Hotel has her own lift and generator which can be useful in case of emergencies.",
                "37, Kaba Aye Pagoda Rd,Yangon, Myanmar",
                "1-662866",
                "01662866"));

        provider.addHotel(new RvHotelModel(
                "Excel Treasure Hotel",
                "http://www.myanmarbravo.com/images/excel-treasure.jpg",
                "We have special rates for long stay guests, tour agent and diplomats. Our most modern facilities and our efficient make you feel satisfy.",
                "No.520, Kaba Aye Pagoda Road,Shwe Gon Dine,Bahan Township, Yangon, Myanmar",
                "(951) 559150",
                "01559150"));

        provider.addHotel(new RvHotelModel(
                "Seasons of Yangon Hotel",
                "http://www.myanmarbravo.com/images/Season%20of%20Yangon.jpg",
                "Hotel is also known as Airport Hotel. This 3-star property offers travelers a choice of 120 pleasant rooms are cozy, fairly designed and overlook the courtyard and poolside areas.",
                "International Airport Mingaladon",
                "951-666 337, 666 979, 666 699",
                "01666337"));

        provider.addHotel(new RvHotelModel(
                "Beauty Land II Hotel ",
                "http://www.myanmarbravo.com/images/Beauty-land-2.jpg",
                "Beauty Land II is located near by Sule Pagoda & MTT (Tourist Information Center). Within very easy reach of Yangon Railway Station, Bogyoke Market, Airlines Offices and several other highlights of the city",
                "No. 188-192, 33rd Street Kyauktada Township, Yangon, Myanmar.",
                "95-1-243952, 95-1-240054, 95-1-240227",
                "01243952"));

        provider.addHotel(new RvHotelModel(
                "Yuzana Hotel",
                "http://www.myanmarbravo.com/images/Yuzana%20Hotel.jpg",
                "Yuzana hotel is the only hotel in Yangon which is under the shadow of the world famous Shwedagon Pagoda and an ideal place for both international traveler and busy executives. The first hotel which has built-in supermarket. Combining comfort and luxury, each of the hotel’s 198 spacious guestrooms and suites which overlook the skyline of the Yangon city, pagodas and traditionally built Buddhist monasteries is tastefully decorated with Myanmar teak furniture.",
                "No. 130, Shwe Gon Dine Road, Bahan Township,Yangon, Myanmar",
                "95 1 549600, 543370",
                "01543835"));

        provider.addHotel(new RvHotelModel(
                "Panorama Hotel",
                "http://www.myanmarbravo.com/images/Panorama.jpg",
                "Panorama is ten-storey building with a beautiful view of the city. All the (104) superior/suite rooms are tastefully decorated with modern amenities and facilities.",
                "No.294-300, Pansodan Street, Kyauktada Township, Yangon.",
                "(951)253 077 (10-lines)",
                "01253077"));


        provider.addHotel(new RvHotelModel(
                "Shwe Taung Tan Hotel",
                "http://www.myanmarbravo.com/images/shwe-taung-tan%200.JPG",
                "Shwe Taung Tan Hotel is located 30 mins from Yangon International Airport and 10 mins from main tourist attractions. We have fully furnished 23 Rooms: 2 Catagories ( Standard & Superior ). It is also convience to make sightseeing: such as Shwedagon Pagoda, Bogyoke Market, etc. Hotel environment is secure and walking distance with famous Restaurants, Coffee Shops, Beer Pubs and Karaoke. Professional and Energetic team will welcome you upon arrival. We will make sure that your stay will be pleasant and memorable.",
                "No. 32-G, Kokkine Swimming Pool Street,Bahan Township, Yangon, Myanmar.",
                "95-1-543400, 95-1-553657",
                "01543400"));


        provider.addHotel(new RvHotelModel(
                "Clover Hotel",
                "http://www.myanmarbravo.com/images/clover01.jpg",
                "With its central location, Clover Hotel is within easy reach of most tourist attractions and business addresses in Yangon. All 48 at this 3-star property offers well-furnished rooms and attentive service. This hotel combines first-class service and the most modern facilities. The staff are friendly and most speak English, some staff can speak Mandarin.",
                "7A, Wingabar Road, Bahan Township, Yangon, Yangon, Myanmar.",
                "+95 9 73177781, +95 9 73177782\n" +
                        "+95 9 73177783, +95 9 73177784",
                "09971377781"));


        provider.addHotel(new RvHotelModel(
                "Beauty Land I Hotel ",
                "http://www.myanmarbravo.com/images/beauty-land-1.jpg",
                "Beauty Land I is located near by Shwedagon Pagoda & Kandawgyi Lake.A few minutes walk to Shwedagon Pagoda and five minute drive to central of Yangon, Sule Pagoda.",
                "No. 9, Bo Cho Street,Bahan Township, Yangon, Myanmar.",
                "95-1-540092, 95-1-549772",
                "01540092"));


        provider.addHotel(new RvHotelModel(
                "East Hotel",
                "http://www.myanmarbravo.com/japan/jpimages/east-main.jpg",
                "Situated in the heart of Yangon downtown area, within walking distance and easily accessible to main shopping area and commercial centers.　New concept boutique hotel with all rooms are designed carefully to appreciate local design and craft, 45 guest rooms and 3 service apartments and most of the rooms have Pagoda views, service provided by warm and friendly staff.",
                "No. 234-240, (1) Quarter, Sule Pagoda Road,Kyauktada Township, Yangon,Myanmar",
                "95 9 73135311, 73135299",
                "0973135311"));

        provider.addHotel(new RvHotelModel(
                "Guest Care Hotel",
                "http://www.myanmarbravo.com/images/guest-care.jpg",
                "Winner of the \"Europe Award for Quality,\" Guest Care Hotel offers accommodations ranging from spacious individual rooms to beautifully decorated suites with exceptional customer service. All guest accommodations include daily breakfast. All guests have access to the hotel's top floor open area for an excellent view of the world's renowned Shwedagon Pagoda and the surroundings. Snacks and Drinks Services are available while enjoying the view or sitting out at night.",
                "107 (A), Dhamma Zedi Road, Kamayut Township, Yangon, Myanmar.",
                "95-1-511118, 95-1-526902, 95-1-527770 ",
                "01511118"));

        provider.addHotel(new RvHotelModel(
                "Sedona Hotel",
                "http://www.myanmarbravo.com/images/sedona-hotel.jpg",
                "Sedona Hotel, a modern living combined with warm yet un-intrusive hospitality, has time and again made us the choice accommodation amongst the guests. It is sitting majestically on eight acres of beautifully landscaped gardens. ",
                "No.1 Kaba Aye Pagoda Road, Yankin Township, Yangon, Myanmar.",
                "(95) 1 8605377",
                "018605377"));

        provider.addHotel(new RvHotelModel(
                "Park Royal Hotel",
                "http://www.myanmarbravo.com/images/park-royal.jpg",
                "Park Royal Hotel is the ultimate hotel that will give you comfort coupled with convenience like Myanmar’s hospitality combined with first-class service and facilities.",
                "3 Alan Pya Phaya Road, Dagon Township,Yangon, Myanmar",
                "(951)250388",
                "01250388"));
        provider.addHotel(new RvHotelModel(
                "Kandawgyi Palace Hotel",
                "http://www.myanmarbravo.com/japan/jpimages/kandawgyi-palace.jpg",
                "Kandawgyi Palace Hotel was designed to blend in with the nature. Natural Rain forest trees attractively surround to the Hotel. Seven thousand tons of Myanmar Golden Teak Wood describes the Beauty of the hotel. The wood, the trees and the lake smoothly blends the beauty of Burmese architecture and design with all of the modern comforts of any international standard hotel. The original Kandawgyi Building provides the experience a unique mix of eastern and western cultures to local residents and visitors. Coolly fresh air and beautiful scene of Kandawgyi Lake nearby Kandawgyi Hotel welcome to enjoy trekking and exercises. ",
                "Kan Yeik Tha Road,Yangon, Myanmar.",
                "9512492559, 3948425",
                "012492559"));
        provider.addHotel(new RvHotelModel(
                "Chatrium Hotel",
                "http://www.myanmarbravo.com/images/chatrium-hotel.jpg",
                "Hotel is managed by Member of Chartrium Suite Hotels and Residence under the brand name of Chatrium Hotel. Hotel was opened on 1st April 2008 on the total land area of 15,111m2 and floor area of 25,500 m2. The land was once owned by the renowned family of Tiger Balm in 1900’s and later the prosperous land spot was called “Tiger Hill”.",
                "40, Natmauk Road, Tamwe Township, Yangon.",
                "(95-1)544 500 ",
                "01544500"));
    }
}
