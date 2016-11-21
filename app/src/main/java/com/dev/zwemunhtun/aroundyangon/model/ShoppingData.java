package com.dev.zwemunhtun.aroundyangon.model;

import android.content.Context;

import com.dev.zwemunhtun.aroundyangon.db.DataProvider;

/**
 * Created by ZweMunHtun on 7/31/2016.
 */
public class ShoppingData {

    public static void ShoppingInfo(Context context){

        DataProvider provider=new DataProvider(context);

        provider.addShopping(new RvShoppingModel(
                "Bogyoke Aung San Market",
                "http://www.hotelkankaw.com/wp-content/uploads/2014/02/Yangon-colonial-architecture-Bogyoke-Aung-San-market-Myanmar-2010-01.jpg",
                "Bogyoke Aung San Market is situa ted in the heart of Yangon - on Bogyoke Aung San Road. There are 1800 shops selling luxury items, handicrafts, foodstuffs, clothing, jewellery, fashion and consumer goods. Bogyoke Market was first built and inaugurated on the present premises in 1926. Also known as Scott Market, it is a must see destination on every tourist’s itinerary. The market is open from 10:00 am to 5:00 pm except Mondays and Gazette holidays.",
                "Bogyoke Street, Pabedan Township, Yangon",
                "https://goo.gl/maps/94EzuXYG25y"
        ));

        provider.addShopping(new RvShoppingModel(
                "Theingyi Market",
                "http://www.myanmarcompanion.com/wp-content/uploads/2015/03/theingyi_zay_market-800x420.jpg",
                "Theingyi zei is the biggest market for locals in Myanmar. All the consumer goods can be available at this huge market. Theingyi zei is the whole sale market comprising thousand of shops distributing commodities to Yangon, Ayeyarwaddy and Bago divisions. These commodities comprises principle food stuff such as rice, edible oils, onion, dried fish, fish paste, fish sauce etc , cloths, clothing, stationary, cosmetics, toiletries and miscellaneous items like raw herbal medicines, bee wax and toys. The existing building was built, after 1988 and the former old building was a huge iron structured shed covered a whole block between Anawyahta street and Mahabandoola street. There are two annexes ' D ' shed for textiles and ' E ' shed for hard wares.",
                "Shwedagon Pagoda Road, Pabedan Township, Yangon",
                "https://goo.gl/maps/r4rMVA6P5A62"

        ));

        provider.addShopping(new RvShoppingModel(
                "Yuzana Plaza",
                "http://2vfinx3dr03gflz3227fpf2152k.wpengine.netdna-cdn.com/wp-content/uploads/2013/10/00215-654x435.jpg",
                "Yuzana Plaza is a popular shopping venue for locals. More than a modern shopping mall than a traditional market, its ground floor is dominated by wholesale outlets. Shops on the other floors offer a vast range of imported fashions and household appliances, as well as domestically made products. The plaza is open from 8:30 am to 5 pm. It closes on full moon days.",
                "Banyadhala Road, Tamwe Township, Yangon",
                "https://goo.gl/maps/dqd4FYw9cXy"
        ));

        provider.addShopping(new RvShoppingModel(
                "Blazon Shopping Centre",
                "http://static.asiawebdirect.com/m/bangkok/portals/myanmar/homepage/yangon/shopping/allParagraphs/013/image/blazon.jpg",
                "Shops on the ground floor selling the latest fashions in jeans, trousers and shirts, branded cosmetics and sportswear attract young customers. The open floor plan of this shopping centre on U Wisara Road makes it convenient for browsing. The centre has its own supermarket and snack shops on upper floors. There is a kid recreation ground next door where many parents leave their children while they shop.",
                "72, U Wisara Road, Kamayut Township, Yangon",
                "https://goo.gl/maps/9HxSDANJ95K2"
        ));

        provider.addShopping(new RvShoppingModel(
                "Dagon Centre Shopping Mall",
                "http://www.goldenplacemyanmar.com/wp-content/uploads//759f405441ace5784de929e2aab29b88.jpg",
                "Dagon centre shopping mall is one of the city’s busiest, located at a junction of Pyay Road and Bargayar Road. The Itwo4 DJ Lounge, City Mart supermarket and MK Fashion shop dominate the ground floor. Modern branded shoes, bags and fabrics are on sale and also snack shops and café in the mall include. This is one of the few shopping centers in Yangon with an internet café.",
                "No.262-264, Pyay Road, Myaynigone, Sanchaung Township, Yangon",
                "https://goo.gl/maps/z28ZoZgJeYG2"
        ));
        provider.addShopping(new RvShoppingModel(
                "FMI Centre",
                "http://www.myanmarbravo.com/images/fmi.jpg",
                "In a prime downtown area, FMI Centre is next to the famous Bogyoke Aung San Market. The first three floors of FMI Centre have a range of retail outlets where visitors can shop in air-conditioned comfort. It’s a popular destination for buyers of men’s and women’s fashions.",
                "380, Bogyoke Aung San Road, Pabedan Township, Yangon",
                "https://goo.gl/maps/9eVrmizvGeM2"
        ));
        provider.addShopping(new RvShoppingModel(
                "Junction 8 Shopping Centre",
                "http://www.hitachi-infra.com.sg/projects/images/retail_junction8.jpg",
                "This shopping centre is at the junction of Pyay Road and Kyaik Wine Road. Its layout is similar to some other shopping centers, with a City Mart supermarket on its first level, along with Bakery and beauty salon is also in the same floor. Shops and boutiques on both levels of this centre sell fabrics, fashion, shoes, cosmetics, bags and suitcases.",
                "Kyaik Waing Pagoda Street, Mayangone Township, Yangon.",
                "https://goo.gl/maps/sEzgpT4Vyc62"
        ));
        provider.addShopping(new RvShoppingModel(
                "La Pyaut Wun Plaza",
                "http://www.myanmarbravo.com/images/lapyaywon.jpg",
                "Situated in downtown area and filled with stores and boutiques, including those selling well-known brands. Supermarket and fashion shop where can get branded fabrics are on the first floor and food shops, beauty salon and other boutiques are on the upper floors.",
                "Alan Pya Pagoda Road, Dagon Township, Yangon",
                "https://goo.gl/maps/LR7gWXgPRjy"
        ));
        provider.addShopping(new RvShoppingModel(
                "North Point Shopping Centre",
                "http://www.myanmarbravo.com/images/ocean.jpg",
                "The North Point Shopping Centre on Pyay Road between the busy Eight Mile junction and Yangon International Airport is one of the most spacious in Yangon. Its main attraction is the international-standard Ocean Super Centre, which sells a huge range of consumer products, including computers, laptops, electrical appliances, fashion wear and accessories, sporting equipment, furniture, household utensils and toys. A food court at the shopping centre has restaurants and cafes which serve Myanmar, Chinese, Indian, Thai and western dishes. The upper floor of the shopping centre houses brand-name fashion shops, beauty salons and an internet café.",
                "Corner of Pyay Road and Thiri Road, Thiri Condominium, Mayangone Township, Yangon.",
                "https://goo.gl/maps/9RqiBhbYhd22"
        ));
        provider.addShopping(new RvShoppingModel(
                "Yankin Centre",
                "http://yangonlife.cdn3.mspiral.biz/cdn/farfuture/VZ1izljiAL01pqsv91yHDmHZrYyuhEfi66eNrMxF_MM/mtime:1407462349/sites/yangonlife.com.mm/files/styles/directory_detail_image/public/directory_photo/2013-10-28_10904.jpg?itok=RS2Sk0xe",
                "The basement has supermarket, Bakery and restaurant where Western, Asian and local dishes are available. Coffee and snack shops are on the ground floor, half of which is occupied by and MK fashion shop. There are hair salons on both floors. Shops on the first floor specialize in clothing, bags and shoes for the younger generation. There is much to keep children occupied here with toy and baby accessories shops and a computer game centre.",
                "Saya San Road, Yankin Township, Yangon",
                "https://goo.gl/maps/3Ct59xVpFo22"
        ));provider.addShopping(new RvShoppingModel(
                "Sein Gay Har Super Centre",
                "http://cityguide.com.mm/wp-content/uploads/2013/10/imgg26.jpg",
                "Two story building on Pyay road near downtown area. Fashion wear for men and women, gold shop and cosmetics are on the ground floor. On 1st floor silk, watch, camera, phone, electrical appliances, bags and safe are available and toys, sporting equipment, cloths for children, a kid recreation ground and internet cafe are on 2nd floor.",
                "No. 44, Pyay Road, Dagon Township, Yangon",
                "https://goo.gl/maps/T6EX7vFaMZG2"
        ));
    }
}
