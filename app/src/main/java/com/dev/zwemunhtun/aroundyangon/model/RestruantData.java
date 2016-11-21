package com.dev.zwemunhtun.aroundyangon.model;


import android.content.Context;

import com.dev.zwemunhtun.aroundyangon.db.DataProvider;

/**
 * Created by ZweMunHtun on 7/16/2016.
 */
public class RestruantData {


   public static void RestruantInfo(Context context){

       DataProvider provider=new DataProvider(context);

       provider.addRestaurant(new RvRestaurantModel("999 Shan Noodle House",
               "https://media-cdn.tripadvisor.com/media/photo-s/06/36/0e/a5/999-shan-noodle-house.jpg",
               "MMK 2403",
               "Asian, Soups, Burmese",
               "Brunch, Breakfast, Lunch, Dinner",
               "Takeout, Seating, Waitstaff",
               "Local cuisine, Families with children, Dining on a budget",
               "Sunday\n" +
                       "6:00 am - 7:00 pm\n" +
                       "Monday\n" +
                       "6:00 am - 7:00 pm\n" +
                       "Tuesday\n" +
                       "6:00 am - 7:00 pm\n" +
                       "Wednesday\n" +
                       "6:00 am - 7:00 pm\n" +
                       "Thursday\n" +
                       "6:00 am - 7:00 pm\n" +
                       "Friday\n" +
                       "6:00 am - 7:00 pm\n" +
                       "Saturday\n" +
                       "6:00 am - 7:00 pm",
               "No. 130 B 34th Street | Kyauktada Township, Yangon (Rangoon), Myanmar",
               "09450061616"
               ));

       provider.addRestaurant(new RvRestaurantModel("Le Planteur",
               "https://media-cdn.tripadvisor.com/media/photo-s/07/86/95/8d/le-planteur.jpg",
               "-",
               "French, European, Fusion",
               "Brunch, Lunch, Dinner, Late Night",
               "Parking Available, Accepts Mastercard, Accepts Visa, Reservations, Outdoor Seating, Private Dining, Seating, Waitstaff, Wheelchair Accessible, Serves Alcohol, Full Bar, Free Wifi",
               "Large groups, Romantic, Special occasions, Business meetings, Scenic view, Families with children",
               "Sunday\n" +
                       "11:30 am - 11:30 pm\n" +
                       "Monday\n" +
                       "11:30 am - 11:30 pm\n" +
                       "Tuesday\n" +
                       "11:30 am - 11:30 pm\n" +
                       "Wednesday\n" +
                       "11:30 am - 11:30 pm\n" +
                       "Thursday\n" +
                       "11:30 am - 11:30 pm\n" +
                       "Friday\n" +
                       "11:30 am - 11:30 pm\n" +
                       "Saturday\n"   +
                       "11:30 am - 11:30 pm",
               "80 University Avenue | Bahan Township, Yangon (Rangoon), Myanmar",
               "01514230"));

       provider.addRestaurant(new RvRestaurantModel(
               "Shwe Sa Bwe",
               "https://media-cdn.tripadvisor.com/media/photo-s/05/74/03/ba/shwe-sa-bwe.jpg",
               "-",
               "French, European ",
               " Lunch, Dinner",
               "Seating, Parking Available, Validated Parking, Cash Only, Free Wifi, Reservations, Outdoor Seating, Waitstaff, Serves Alcohol ",
               "Large groups, Special occasions, Business meetings, Families with children ",
               "\n" +
                       "Sunday\n" +
                       "12:00 pm - 12:00 am\n" +
                       "Monday\n" +
                       "12:00 pm - 12:00 am\n" +
                       "Tuesday\n" +
                       "12:00 pm - 12:00 am\n" +
                       "Wednesday\n" +
                       "12:00 pm - 12:00 am\n" +
                       "Thursday\n" +
                       "12:00 pm - 12:00 am\n" +
                       "Friday\n" +
                       "12:00 pm - 12:00 am\n" +
                       "Saturday\n" +
                       "12:00 pm - 12:00 am",
               "20 Malikha Road | Mayangone, Yangon (Rangoon), Myanmar ",
               "09421005085"
       ));

       provider.addRestaurant(new RvRestaurantModel(
               "Green Gallery",
               "https://media-cdn.tripadvisor.com/media/photo-s/0a/40/33/c6/photo0jpg.jpg",
               "-",
               "Asian, Thai, Vegetarian ",
               "Lunch, Dinner, Late Night ",
               "Takeout, Reservations, Seating, Waitstaff, Serves Alcohol ",
               "Families with children, Dining on a budget ",
               "\n" +
                       "Sunday\n" +
                       "1:00 pm - 10:00 pm\n" +
                       "Tuesday\n" +
                       "12:00 pm - 10:00 pm\n" +
                       "Wednesday\n" +
                       "12:00 pm - 10:00 pm\n" +
                       "Thursday\n" +
                       "12:00 pm - 10:00 pm\n" +
                       "Friday\n" +
                       "12:00 pm - 10:00 pm\n" +
                       "Saturday\n" +
                       "1:00 pm - 10:00 pm",
               " No 58, 52nd Street Lower Block, Yangon (Rangoon), Myanmar ",
               "0931315131"

       ));
       provider.addRestaurant(new RvRestaurantModel(
             "Shan Yoe Yar",
               "https://media-cdn.tripadvisor.com/media/photo-s/04/2b/7a/d5/getlstd-property-photo.jpg",
               "-",
               "Asian, Burmese ",
               " Brunch, Breakfast, Lunch, Dinner",
               "Takeout, Reservations, Private Dining, Seating, Waitstaff, Parking Available, Wheelchair Accessible, Serves Alcohol, Free Wifi ",
               " Large groups, Local cuisine, Business meetings, Families with children, Special occasions ",
               "\n" +
                       "Sunday\n" +
                       "6:00 am - 10:00 pm\n" +
                       "Monday\n" +
                       "6:00 am - 10:00 pm\n" +
                       "Tuesday\n" +
                       "6:00 am - 10:00 pm\n" +
                       "Wednesday\n" +
                       "6:00 am - 10:00 pm\n" +
                       "Thursday\n" +
                       "6:00 am - 10:00 pm\n" +
                       "Friday\n" +
                       "6:00 am - 10:00 pm\n" +
                       "Saturday\n" +
                       "6:00 am - 10:00 pm",
               " 169, War Tan Street, Lanmadaw Township, Yangon, Myanmar., Yangon (Rangoon) 11131, Myanmar ",
               "09250566695"
       ));
       provider.addRestaurant(new RvRestaurantModel(
               "Gekko Co.Ltd",
               "https://media-cdn.tripadvisor.com/media/photo-s/06/5a/7b/a4/lots-of-space.jpg",
               " MMK 11,923 - MMK 35,770 ",
               "Japanese, Sushi, Asian ",
               "Breakfast, Lunch, Dinner, Late Night, Drinks ",
               " Delivery, Takeout, Reservations, Seating, Waitstaff, Serves Alcohol, Full Bar, Free Wifi ",
               " Bar scene, Business meetings, Families with children, Large groups ",
               "\n" +
                       "Sunday\n" +
                       "9:00 am - 11:00 pm\n" +
                       "Monday\n" +
                       "9:00 am - 11:00 pm\n" +
                       "Tuesday\n" +
                       "9:00 am - 11:00 pm\n" +
                       "Wednesday\n" +
                       "9:00 am - 11:00 pm\n" +
                       "Thursday\n" +
                       "9:00 am - 11:00 pm\n" +
                       "Friday\n" +
                       "9:00 am - 11:00 pm\n" +
                       "Saturday\n" +
                       "9:00 am - 11:00 pm",
               " 535 Merchant Road | Kyauktada Township, Yangon (Rangoon) 001, Myanmar ",
               "01386986"

       ));
       provider.addRestaurant(new RvRestaurantModel(
              "House of Memories",
               "https://media-cdn.tripadvisor.com/media/photo-s/02/7f/b2/f8/filename-img-5719-jpg.jpg",
               "-",
               "Asian, Burmese ",
               "Lunch, Dinner, Late Night ",
               " Reservations, Outdoor Seating, Private Dining, Seating, Waitstaff, Serves ",
               " Romantic, Business meetings, Families with children, Large groups, Local cuisine, Special occasions ",
               "-",
               "290 U Wisara Road, Yangon (Rangoon), Myanmar (Formerly House of memories)",
               "01534242"
       ));
       provider.addRestaurant(new RvRestaurantModel(
              "Mandalay Restaurant",
               "https://media-cdn.tripadvisor.com/media/photo-s/02/8f/36/ec/mandalay-restaurant-at.jpg",
               " MMK 8,346 - MMK 62,001 ",
               " European, Asian, Burmese ",
               " Breakfast, Lunch, Dinner, Brunch, Late Night, Drinks ",
               " Takeout, Outdoor Seating, Seating, Waitstaff, Parking Available, Highchairs Available, Wheelchair Accessible, Serves Alcohol, Full Bar, Accepts Mastercard, Accepts Visa, Free Wifi, Reservations, Validated Parking ",
               "Scenic view, Romantic, Business meetings, Families with children, Special occasions ",
               "-",
               " 35 Taw Win Road | The Governor's Residence, Yangon (Rangoon) 11191, Myanmar ",
               "01229860"
       ));
       provider.addRestaurant(new RvRestaurantModel(
               "Feel Myanmar",
               "https://media-cdn.tripadvisor.com/media/photo-s/01/c5/42/4c/entrance.jpg",
               " MMK 1,192 ",
               " Asian, Burmese ",
               " Brunch, Breakfast, Lunch, Dinner, Late Night ",
               " Takeout, Seating, Waitstaff, Serves Alcohol ",
               " Large groups, Local cuisine, Dining on a budget, Families with children ",
               "\n" +
                       "Monday\n" +
                       "12:00 am - 11:59 pm\n" +
                       "Tuesday\n" +
                       "12:00 am - 11:59 pm\n" +
                       "Wednesday\n" +
                       "12:00 am - 11:59 pm\n" +
                       "Friday\n" +
                       "12:00 am - 11:59 pm",
               " 124 Pyi Htaung Su Yeikthar Street, Yangon (Rangoon), Myanmar ",
               "0973208132"
       ));
       provider.addRestaurant(new RvRestaurantModel(
               "Cafe Sule",
               "https://media-cdn.tripadvisor.com/media/photo-s/03/e7/d1/1e/traders-cafe.jpg",
               " MMK 11,923 - MMK 38,154 ",
               " Chinese, Asian, Indian, International, Burmese ",
               "Breakfast, Lunch, Dinner, Brunch, Late Night ",
               "Reservations, Seating, Waitstaff, Parking Available, Validated Parking, Highchairs Available, Wheelchair Accessible, Serves Alcohol, Full Bar, Free Wifi, Buffet ",
               "Business meetings, Families with children, Large groups ",
               "-",
               " Sule Shangri-La,Yangon | 223 Sule Pagoda Road, Yangon (Rangoon), Myanmar (Formerly Traders Café) ",
               "091242828"
       ));

   }
}
