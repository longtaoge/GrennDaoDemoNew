package org.xiangbalao.grenndao.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import org.xiangbalao.grenndao.dao.DaoMaster;
import org.xiangbalao.grenndao.dao.DaoSession;

/**
 * Created by longtaoge on 2017/12/17.
 */


public class MApplication extends Application {


    public static   DaoSession getDaoSession() {
        return daoSession;
    }



    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        initDb();
    }








    /**
     * 指定数据库存储路径或名称
     *
     * @param name
     * @return
     */
    public static String getDbPath(String name) {

        boolean sdExist = android.os.Environment.MEDIA_MOUNTED.equals(android.os.Environment.getExternalStorageState());
        if (sdExist) {
            String dbDir = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
            name = dbDir + "/xiangbalao/" + name;
        }

        return name;

    }

    private void initDb() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(getApplicationContext(), getDbPath
                ("greendao.db"), null); //数据库名称
         SQLiteDatabase database = devOpenHelper.getWritableDatabase();
        daoSession = new DaoMaster(database).newSession();


    }
}

