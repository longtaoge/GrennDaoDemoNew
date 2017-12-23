package org.xiangbalao.common.grenndaodemo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.internal.util.LogUtil;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.greenrobot.greendao.query.QueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xiangbalao.common.GsonUtil;
import org.xiangbalao.grenndao.app.MApplication;
import org.xiangbalao.grenndao.dao.DaoSession;
import org.xiangbalao.grenndao.model.GeneraOrder;
import org.xiangbalao.grenndao.model.Order;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

        DaoSession daoSession =MApplication.getDaoSession();


        public  String TAG ="TESTS";


    @Test
    public  void insertTestData(){


        // 通用发票MODEL
        GeneraOrder mGeneralOrder = new GeneraOrder();
        mGeneralOrder.setId(null); //ID 自增
        mGeneralOrder.setAntiFakeCode("20位防伪码");//20位防伪码
        mGeneralOrder.setATotal(23.09); //商品总额
        mGeneralOrder.setCash(100); // 支付金额
        mGeneralOrder.setCreatorId("1");
        mGeneralOrder.setCurrency(1);//币种
        mGeneralOrder.setDiscount(0.00); //折扣
        mGeneralOrder.setTax(18.00);//税额
        mGeneralOrder.setReceiptId("发票唯一识别码");//发票唯一码
        mGeneralOrder.setReceiptType("发票类型");//发票类型
        mGeneralOrder.setPayWay(2);
        mGeneralOrder.setReceiptType("发票类型");
        mGeneralOrder.setTotal(0);//折扣、扣税后的商品总额
        mGeneralOrder.setOp("张三");  //操作人
        mGeneralOrder.setChange(0.00);//找零
        mGeneralOrder.setEjsn("123456789");
        mGeneralOrder.setPayWay(1); // 付款方式
        mGeneralOrder.setCurrency(1); //币种

        MApplication.getDaoSession().getGeneraOrderDao().insert(mGeneralOrder);


        Order mOder = new Order();


        mOder.setId(null); //ID 自增
        mOder.setAntiFakeCode("20位防伪码");//20位防伪码
        mOder.setATotal(23.09); //商品总额
        mOder.setCash(100); // 支付金额
        mOder.setCreatorId("1");
        mOder.setCurrency(1);//币种
        mOder.setDiscount(0.00); //折扣
        mOder.setTax(18.00);//税额
        mOder.setReceiptId("发票唯一识别码");//发票唯一码
        mOder.setReceiptType("发票类型");//发票类型
        mOder.setPayWay(2);
        mOder.setReceiptType("发票类型");
        mOder.setTotal(0);//折扣、扣税后的商品总额
        mOder.setOp("张三");  //操作人
        mOder.setChange(0.00);//找零
        mOder.setEjsn("123456789");
        mOder.setPayWay(1); // 付款方式
        mOder.setCurrency(1); //币种


        MApplication.getDaoSession().getOrderDao().insert(mOder);






    }




    public void joinTest(){




    }




    @Test
    public  void  getTestData(){
        List<GeneraOrder> mlist = daoSession.getGeneraOrderDao().loadAll();

        List<Order>  mOrder =  daoSession.getOrderDao().loadAll();


    QueryBuilder orderBuider=  daoSession.getOrderDao().queryBuilder();





        for (GeneraOrder item:mlist){
            Log.i(TAG, GsonUtil.createGsonString(item));
        }


        for (Order item:mOrder){
            Log.i(TAG, GsonUtil.createGsonString(item));
        }




    }



    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("org.xiangbalao.common.grenndaodemo", appContext.getPackageName());
    }
}
