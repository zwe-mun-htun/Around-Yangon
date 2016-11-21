package com.dev.zwemunhtun.aroundyangon.db;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class DataContract  {
    public static final String DATABASE_NAME="aroundyangon";
    public static final int DATABASE_VERSION=1;

    public class CinemaTable{
        public static final String TABLE_NAME="cinema";
        public static final String CINEMA_ID="c_id";
        public static final String CINEMA_NAME="c_name";
        public static final String CINEMA_URL="c_image";
        public static final String CINEMA_DESC="c_overview";
        public static final String CINEMA_LOC="c_loc";
        public static final String CINEMA_PHONE="c_ph";
        public static final String CINEMA_TIME="c_time";

    }
    public class RestaurantTable{
        public static final String TABLE_NAME="restaurant";
        public static final String RES_ID="res_id";
        public static final String RES_NAME="res_name";
        public static final String RES_IMG="res_img";
        public static final String RES_AVG_PRICE="res_price";
        public static final String RES_CUISINE="res_cui";
        public static final String RES_MEAL="res_meal";
        public static final String RES_FEATURE="res_fea";
        public static final String RES_COND="res_cond";
        public static final String RES_OPEN_HOUR="res_oh";
        public static final String RES_ADDRESS="res_add";
        public static final String RES_PH="res_ph";
    }

    public class UniversityTable{
        public static final String TABLE_NAME="university";
        public static final String UNI_NAME="uni_name";
        public static final String UNI_IMG="uni_img";
        public static final String UNI_DETAILS="uni_detail";
        public static final String UNI_ABOUT="uni_about";
        public static final String UNI_LOCATION="uni_loc";
        public static final String UNI_CONTACT="uni_contant";
        public static final String PHONE="ph";
    }
    public class PagodaTable{
        public static final String TABLE_NAME="pagoda";
        public static final String PAG_NAME="pag_name";
        public static final String PAG_IMG="pag_img";
        public static final String PAG_HISTORY="pag_history";
        public static final String PAG_MAP="pag_map";
    }
    public class HospitalTable{
        public static final String TABLE_NAME="hospital";
        public static final String HOS_NAME="hos_name";
        public static final String HOS_IMG="hos_img";
        public static final String HOS_TYPE="hos_type";
        public static final String HOS_AFF="hos_aff";
        public static final String HOS_EMD="hos_emd";
        public static final String HOS_BED="hos_bed";
        public static final String HOS_FOUNDED="hos_found";
        public static final String HOS_LOC="hos_loc";
        public static final String HOS_MAP="hos_map";
    }
    public class ParkTable{
        public static final String TABLE_NAME="park";
        public static final String PAK_NAME="pak_name";
        public static final String PAK_IMG="pak_img";
        public static final String PAK_HISTORY="pak_his";
        public static final String PAK_LOC="pak_loc";
        public static final String PAK_MAP="pak_map";
    }
    public class HotelTable{
        public static final String TABLE_NAME="hotel";
        public static final String HOT_NAME="hot_name";
        public static final String Hot_IMG="hot_img";
        public static final String HOT_LOC="hot_loc";
        public static final String HOT_Email="hot_email";
        public static final String HOT_CONTACT="hot_contact";
        public static final String HOT_PH="hot_ph";
    }
    public class ShoppingTable{
        public static final String TABLE_NAME="shoppingcenter";
        public static final String SHOP_NAME="shop_name";
        public static final String SHOP_IMG="shop_img";
        public static final String SHOP_ABOUT="shop_about";
        public static final String SHOP_LOC="shop_loc";
        public static final String SHOP_MAP="shop_map";
    }
}
