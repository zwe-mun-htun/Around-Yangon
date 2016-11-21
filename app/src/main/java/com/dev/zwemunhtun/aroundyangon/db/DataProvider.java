package com.dev.zwemunhtun.aroundyangon.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.view.GestureDetector;

import com.dev.zwemunhtun.aroundyangon.model.RvCinemaModel;
import com.dev.zwemunhtun.aroundyangon.model.RvHospitalModel;
import com.dev.zwemunhtun.aroundyangon.model.RvHotelModel;
import com.dev.zwemunhtun.aroundyangon.model.RvPagodasModel;
import com.dev.zwemunhtun.aroundyangon.model.RvParkModel;
import com.dev.zwemunhtun.aroundyangon.model.RvRestaurantModel;
import com.dev.zwemunhtun.aroundyangon.model.RvShoppingModel;
import com.dev.zwemunhtun.aroundyangon.model.RvUniversityModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class DataProvider extends SQLiteOpenHelper {
    public DataProvider(Context context) {
        super(context, DataContract.DATABASE_NAME, null,DataContract.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
          db.execSQL("CREATE TABLE " + DataContract.CinemaTable.TABLE_NAME + "("
                  + DataContract.CinemaTable.CINEMA_ID + " Integer Primary key AutoIncrement,"
                  +DataContract.CinemaTable.CINEMA_NAME + " Text,"
                  +DataContract.CinemaTable.CINEMA_URL + " Text,"
                  +DataContract.CinemaTable.CINEMA_DESC + " Text,"
                  +DataContract.CinemaTable.CINEMA_LOC + " Text,"
                  +DataContract.CinemaTable.CINEMA_PHONE + " Text,"
                  +DataContract.CinemaTable.CINEMA_TIME + " Text)");

          db.execSQL("CREATE TABLE " + DataContract.RestaurantTable.TABLE_NAME + "("
                  +DataContract.RestaurantTable.RES_ID + " Integer Primary key AutoIncrement,"
                  +DataContract.RestaurantTable.RES_NAME + " Text,"
                  +DataContract.RestaurantTable.RES_IMG + " Text,"
                  +DataContract.RestaurantTable.RES_AVG_PRICE + " Text,"
                  +DataContract.RestaurantTable.RES_CUISINE + " Text,"
                  +DataContract.RestaurantTable.RES_MEAL + " Text,"
                  +DataContract.RestaurantTable.RES_FEATURE + " Text,"
                  +DataContract.RestaurantTable.RES_COND + " Text,"
                  +DataContract.RestaurantTable.RES_OPEN_HOUR + " Text,"
                  +DataContract.RestaurantTable.RES_ADDRESS + " Text,"
                  +DataContract.RestaurantTable.RES_PH + " Text)");

          db.execSQL("CREATE TABLE " + DataContract.UniversityTable.TABLE_NAME + "("
                  +DataContract.UniversityTable.UNI_NAME + " Text,"
                  +DataContract.UniversityTable.UNI_IMG + " Text,"
                  +DataContract.UniversityTable.UNI_DETAILS + " Text,"
                  +DataContract.UniversityTable.UNI_ABOUT + " Text,"
                  +DataContract.UniversityTable.UNI_LOCATION + " Text,"
                  +DataContract.UniversityTable.UNI_CONTACT + " Text,"
                  +DataContract.UniversityTable.PHONE+ " Text)");

          db.execSQL("CREATE TABLE " + DataContract.PagodaTable.TABLE_NAME + "("
                  +DataContract.PagodaTable.PAG_NAME + " Text,"
                  +DataContract.PagodaTable.PAG_IMG + " Text,"
                  +DataContract.PagodaTable.PAG_HISTORY + " Text,"
                  +DataContract.PagodaTable.PAG_MAP + " Text)");

          db.execSQL("CREATE TABLE " + DataContract.HospitalTable.TABLE_NAME + "("
                  +DataContract.HospitalTable.HOS_NAME + " Text,"
                  +DataContract.HospitalTable.HOS_IMG + " Text,"
                  +DataContract.HospitalTable.HOS_TYPE + " Text,"
                  +DataContract.HospitalTable.HOS_AFF + " Text,"
                  +DataContract.HospitalTable.HOS_EMD + " Text,"
                  +DataContract.HospitalTable.HOS_BED + " Text,"
                  +DataContract.HospitalTable.HOS_FOUNDED + " Text,"
                  +DataContract.HospitalTable.HOS_LOC + " Text,"
                  +DataContract.HospitalTable.HOS_MAP + " Text)");

          db.execSQL("CREATE TABLE " + DataContract.ParkTable.TABLE_NAME + "("
                  +DataContract.ParkTable.PAK_NAME + " Text,"
                  +DataContract.ParkTable.PAK_IMG + " Text,"
                  +DataContract.ParkTable.PAK_HISTORY + " Text,"
                  +DataContract.ParkTable.PAK_LOC + " Text,"
                  +DataContract.ParkTable.PAK_MAP + " Text)");

          db.execSQL("CREATE TABLE " + DataContract.HotelTable.TABLE_NAME + "("
                  +DataContract.HotelTable.HOT_NAME + " Text,"
                  +DataContract.HotelTable.Hot_IMG + " Text,"
                  +DataContract.HotelTable.HOT_LOC + " Text,"
                  +DataContract.HotelTable.HOT_Email + " Text,"
                  +DataContract.HotelTable.HOT_CONTACT + " Text,"
                  +DataContract.HotelTable.HOT_PH + " Text)");

          db.execSQL("CREATE TABLE " + DataContract.ShoppingTable.TABLE_NAME + "("
                  +DataContract.ShoppingTable.SHOP_NAME + " Text,"
                  +DataContract.ShoppingTable.SHOP_IMG + " Text,"
                  +DataContract.ShoppingTable.SHOP_ABOUT + " Text,"
                  +DataContract.ShoppingTable.SHOP_LOC + " Text,"
                  +DataContract.ShoppingTable.SHOP_MAP + " Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DataContract.CinemaTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DataContract.RestaurantTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DataContract.UniversityTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DataContract.PagodaTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DataContract.HospitalTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DataContract.ParkTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DataContract.HotelTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DataContract.ShoppingTable.TABLE_NAME);
        onCreate(db);
    }
    public void addCinemas(RvCinemaModel rvCinemaModel){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(DataContract.CinemaTable.CINEMA_NAME,rvCinemaModel.getCinemaName());
        values.put(DataContract.CinemaTable.CINEMA_URL,rvCinemaModel.getCinemaImageUrl());
        values.put(DataContract.CinemaTable.CINEMA_DESC,rvCinemaModel.getCinemaDesc());
        values.put(DataContract.CinemaTable.CINEMA_LOC,rvCinemaModel.getCinemaLoc());
        values.put(DataContract.CinemaTable.CINEMA_PHONE,rvCinemaModel.getCinemaPh());
        values.put(DataContract.CinemaTable.CINEMA_TIME,rvCinemaModel.getCinemaTime());
        db.insert(DataContract.CinemaTable.TABLE_NAME,null,values);
        db.close();
    }

    public void addRestaurant(RvRestaurantModel rvRestaurantModel){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(DataContract.RestaurantTable.RES_NAME,rvRestaurantModel.getResName());
        values.put(DataContract.RestaurantTable.RES_IMG,rvRestaurantModel.getResImage());
        values.put(DataContract.RestaurantTable.RES_AVG_PRICE,rvRestaurantModel.getResPrice());
        values.put(DataContract.RestaurantTable.RES_CUISINE,rvRestaurantModel.getResCuisine());
        values.put(DataContract.RestaurantTable.RES_MEAL,rvRestaurantModel.getResMeal());
        values.put(DataContract.RestaurantTable.RES_FEATURE,rvRestaurantModel.getResFea());
        values.put(DataContract.RestaurantTable.RES_COND,rvRestaurantModel.getResCond());
        values.put(DataContract.RestaurantTable.RES_OPEN_HOUR,rvRestaurantModel.getResHour());
        values.put(DataContract.RestaurantTable.RES_ADDRESS,rvRestaurantModel.getResAdd());
        values.put(DataContract.RestaurantTable.RES_PH,rvRestaurantModel.getResPh());
        db.insert(DataContract.RestaurantTable.TABLE_NAME,null,values);
        db.close();
    }

    public void addUniversity(RvUniversityModel rvUniversityModel){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(DataContract.UniversityTable.UNI_NAME, rvUniversityModel.getUniName());
        values.put(DataContract.UniversityTable.UNI_IMG, rvUniversityModel.getUniImg());
        values.put(DataContract.UniversityTable.UNI_DETAILS, rvUniversityModel.getUniDetails());
        values.put(DataContract.UniversityTable.UNI_ABOUT, rvUniversityModel.getUniAbout());
        values.put(DataContract.UniversityTable.UNI_LOCATION, rvUniversityModel.getUniLoc());
        values.put(DataContract.UniversityTable.UNI_CONTACT, rvUniversityModel.getUniPh());
        values.put(DataContract.UniversityTable.PHONE, rvUniversityModel.getCallPhone());
        db.insert(DataContract.UniversityTable.TABLE_NAME,null,values);
        db.close();
    }

    public void addPagodas(RvPagodasModel rvPagodasModel){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(DataContract.PagodaTable.PAG_NAME,rvPagodasModel.getPagName());
        values.put(DataContract.PagodaTable.PAG_IMG,rvPagodasModel.getPagImg());
        values.put(DataContract.PagodaTable.PAG_HISTORY,rvPagodasModel.getPagHistory());
        values.put(DataContract.PagodaTable.PAG_MAP,rvPagodasModel.getPagMap());
        db.insert(DataContract.PagodaTable.TABLE_NAME,null,values);
        db.close();
    }

    public void addHospital(RvHospitalModel rvHospitalModel){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(DataContract.HospitalTable.HOS_NAME,rvHospitalModel.getHosName());
        values.put(DataContract.HospitalTable.HOS_IMG,rvHospitalModel.getHosIMG());
        values.put(DataContract.HospitalTable.HOS_TYPE,rvHospitalModel.getHosTYPE());
        values.put(DataContract.HospitalTable.HOS_AFF,rvHospitalModel.getHosAFF());
        values.put(DataContract.HospitalTable.HOS_EMD,rvHospitalModel.getHosEMD());
        values.put(DataContract.HospitalTable.HOS_BED,rvHospitalModel.getHosBed());
        values.put(DataContract.HospitalTable.HOS_FOUNDED,rvHospitalModel.getHosFound());
        values.put(DataContract.HospitalTable.HOS_LOC,rvHospitalModel.getHosLoc());
        values.put(DataContract.HospitalTable.HOS_MAP,rvHospitalModel.getHosMap());
        db.insert(DataContract.HospitalTable.TABLE_NAME,null,values);
        db.close();
    }

    public void addPark(RvParkModel rvParkModel){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(DataContract.ParkTable.PAK_NAME,rvParkModel.getPakName());
        values.put(DataContract.ParkTable.PAK_IMG,rvParkModel.getPakImg());
        values.put(DataContract.ParkTable.PAK_HISTORY,rvParkModel.getPakHistory());
        values.put(DataContract.ParkTable.PAK_LOC,rvParkModel.getPakLoc());
        values.put(DataContract.ParkTable.PAK_MAP,rvParkModel.getPakMap());
        db.insert(DataContract.ParkTable.TABLE_NAME,null,values);
        db.close();
    }

    public void addShopping(RvShoppingModel rvShoppingModel){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(DataContract.ShoppingTable.SHOP_NAME,rvShoppingModel.getShopName());
        values.put(DataContract.ShoppingTable.SHOP_IMG,rvShoppingModel.getShopImg());
        values.put(DataContract.ShoppingTable.SHOP_ABOUT,rvShoppingModel.getShopAbout());
        values.put(DataContract.ShoppingTable.SHOP_LOC,rvShoppingModel.getShopLoc());
        values.put(DataContract.ShoppingTable.SHOP_MAP,rvShoppingModel.getShopMap());
        db.insert(DataContract.ShoppingTable.TABLE_NAME,null,values);
        db.close();
    }

    public void addHotel(RvHotelModel rvHotelModel){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(DataContract.HotelTable.HOT_NAME,rvHotelModel.getHotName());
        values.put(DataContract.HotelTable.Hot_IMG,rvHotelModel.getHotImg());
        values.put(DataContract.HotelTable.HOT_LOC,rvHotelModel.getHotLoc());
        values.put(DataContract.HotelTable.HOT_Email,rvHotelModel.getHotEmail());
        values.put(DataContract.HotelTable.HOT_CONTACT,rvHotelModel.getHotContact());
        values.put(DataContract.HotelTable.HOT_PH,rvHotelModel.getHotPh());
        db.insert(DataContract.HotelTable.TABLE_NAME,null,values);
        db.close();
    }

    public List<RvCinemaModel> getAllCinema() {
        List<RvCinemaModel> cinemaList= new ArrayList<>();

        String query = "SELECT * FROM "+ DataContract.CinemaTable.TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor=db.rawQuery(query,null);
        if (cursor.moveToFirst()){
            do{
                RvCinemaModel cinema=new RvCinemaModel();
                cinema.setCinemaName(cursor.getString(1));
                cinema.setCinemaImageUrl(cursor.getString(2));
                cinema.setCinemaDesc(cursor.getString(3));
                cinema.setCinemaLoc(cursor.getString(4));
                cinema.setCinemaPh(cursor.getString(5));
                cinema.setCinemaTime(cursor.getString(6));
                cinemaList.add(cinema);

            }while (cursor.moveToNext());
        }

        return cinemaList;
    }

    public List<RvRestaurantModel> getAllRestruant(){

        List<RvRestaurantModel> restaurantList = new ArrayList<>();

        String query="SELECT * FROM " + DataContract.RestaurantTable.TABLE_NAME;

        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery(query,null);

        if (cursor.moveToFirst()){

            do{
                RvRestaurantModel rvRestaurantModel=new RvRestaurantModel();
                rvRestaurantModel.setResName(cursor.getString(1));
                rvRestaurantModel.setResImage(cursor.getString(2));
                rvRestaurantModel.setResPrice(cursor.getString(3));
                rvRestaurantModel.setResCuisine(cursor.getString(4));
                rvRestaurantModel.setResMeal(cursor.getString(5));
                rvRestaurantModel.setResFea(cursor.getString(6));
                rvRestaurantModel.setResCond(cursor.getString(7));
                rvRestaurantModel.setResHour(cursor.getString(8));
                rvRestaurantModel.setResAdd(cursor.getString(9));
                rvRestaurantModel.setResPh(cursor.getString(10));
                restaurantList.add(rvRestaurantModel);

            }while (cursor.moveToNext());
        }
        return restaurantList;
    }

    public List<RvUniversityModel> getAllUniversity(){

        List<RvUniversityModel> universityList=new ArrayList<>();

        String query="SELECT * FROM " + DataContract.UniversityTable.TABLE_NAME;

        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery(query,null);

        if (cursor.moveToFirst()){

            do {
                RvUniversityModel rvUniversityModel=new RvUniversityModel();
                rvUniversityModel.setUniName(cursor.getString(0));
                rvUniversityModel.setUniImg(cursor.getString(1));
                rvUniversityModel.setUniDetails(cursor.getString(2));
                rvUniversityModel.setUniAbout(cursor.getString(3));
                rvUniversityModel.setUniLoc(cursor.getString(4));
                rvUniversityModel.setUniPh(cursor.getString(5));
                rvUniversityModel.setCallPhone(cursor.getString(6));
                universityList.add(rvUniversityModel);

            }while (cursor.moveToNext());
        }
        return universityList;
    }

    public List<RvPagodasModel> getAllPagoda(){
        List<RvPagodasModel> pagodaList=new ArrayList<>();

        String query="SELECT * FROM " + DataContract.PagodaTable.TABLE_NAME;

        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery(query,null);

        if (cursor.moveToFirst()){
            do {
                RvPagodasModel rvPagodasModel=new RvPagodasModel();
                rvPagodasModel.setPagName(cursor.getString(0));
                rvPagodasModel.setPagImg(cursor.getString(1));
                rvPagodasModel.setPagHistory(cursor.getString(2));
                rvPagodasModel.setPagMap(cursor.getString(3));
                pagodaList.add(rvPagodasModel);
            }while (cursor.moveToNext());
        }
        return pagodaList;
    }

    public List<RvHospitalModel> getAllHospital(){
        List<RvHospitalModel> hospitalList=new ArrayList<>();

        String query="SELECT * FROM " +DataContract.HospitalTable.TABLE_NAME;
        SQLiteDatabase db=this.getWritableDatabase();

        Cursor cursor=db.rawQuery(query,null);

        if (cursor.moveToFirst()){
            do {
                RvHospitalModel rvHospitalModel=new RvHospitalModel();
                rvHospitalModel.setHosName(cursor.getString(0));
                rvHospitalModel.setHosIMG(cursor.getString(1));
                rvHospitalModel.setHosTYPE(cursor.getString(2));
                rvHospitalModel.setHosAFF(cursor.getString(3));
                rvHospitalModel.setHosEMD(cursor.getString(4));
                rvHospitalModel.setHosBed(cursor.getString(5));
                rvHospitalModel.setHosFound(cursor.getString(6));
                rvHospitalModel.setHosLoc(cursor.getString(7));
                rvHospitalModel.setHosMap(cursor.getString(8));
                hospitalList.add(rvHospitalModel);
            }while (cursor.moveToNext());
        }
        return hospitalList;
    }
    public List<RvParkModel> getAllPark(){
        List<RvParkModel> parkList=new ArrayList<>();

        String query="SELECT * FROM " +DataContract.ParkTable.TABLE_NAME;
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery(query,null);

        if (cursor.moveToFirst()){
            do {
                RvParkModel rvParkModel=new RvParkModel();
                rvParkModel.setPakName(cursor.getString(0));
                rvParkModel.setPakImg(cursor.getString(1));
                rvParkModel.setPakHistory(cursor.getString(2));
                rvParkModel.setPakLoc(cursor.getString(3));
                rvParkModel.setPakMap(cursor.getString(4));
                parkList.add(rvParkModel);
            }while(cursor.moveToNext());
        }
        return parkList;
    }
    public List<RvHotelModel> getAllHotel(){
        List<RvHotelModel> hotelList=new ArrayList<>();
        String query="SELECT * FROM " + DataContract.HotelTable.TABLE_NAME;
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery(query,null);
        if (cursor.moveToFirst()){
            do {
                RvHotelModel rvHotelModel=new RvHotelModel();
                rvHotelModel.setHotName(cursor.getString(0));
                rvHotelModel.setHotImg(cursor.getString(1));
                rvHotelModel.setHotLoc(cursor.getString(2));
                rvHotelModel.setHotEmail(cursor.getString(3));
                rvHotelModel.setHotContact(cursor.getString(4));
                rvHotelModel.setHotPh(cursor.getString(5));
                hotelList.add(rvHotelModel);
            }while (cursor.moveToNext());
        }
        return hotelList;
    }

    public List<RvShoppingModel> getAllShopping(){
        List<RvShoppingModel> shoppingList=new ArrayList<>();
        String query="SELECT * FROM " + DataContract.ShoppingTable.TABLE_NAME;
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery(query,null);
        if (cursor.moveToFirst()){
            do {
                RvShoppingModel rvShoppingModel=new RvShoppingModel();
                rvShoppingModel.setShopName(cursor.getString(0));
                rvShoppingModel.setShopImg(cursor.getString(1));
                rvShoppingModel.setShopAbout(cursor.getString(2));
                rvShoppingModel.setShopLoc(cursor.getString(3));
                rvShoppingModel.setShopMap(cursor.getString(4));
                shoppingList.add(rvShoppingModel);
            }while (cursor.moveToNext());
        }
        return shoppingList;
    }
}
