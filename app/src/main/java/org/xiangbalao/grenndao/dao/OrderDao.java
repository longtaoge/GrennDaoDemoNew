package org.xiangbalao.grenndao.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import org.xiangbalao.grenndao.model.Order;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ORDER".
*/
public class OrderDao extends AbstractDao<Order, Long> {

    public static final String TABLENAME = "ORDER";

    /**
     * Properties of entity Order.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ReceiptType = new Property(1, String.class, "receiptType", false, "RECEIPT_TYPE");
        public final static Property ReceiptId = new Property(2, String.class, "receiptId", false, "RECEIPT_ID");
        public final static Property PrintCount = new Property(3, int.class, "printCount", false, "PRINT_COUNT");
        public final static Property Isoffline = new Property(4, int.class, "isoffline", false, "ISOFFLINE");
        public final static Property Op = new Property(5, String.class, "op", false, "OP");
        public final static Property RDate = new Property(6, java.util.Date.class, "rDate", false, "R_DATE");
        public final static Property RTime = new Property(7, java.util.Date.class, "rTime", false, "R_TIME");
        public final static Property AntiFakeCode = new Property(8, String.class, "antiFakeCode", false, "ANTI_FAKE_CODE");
        public final static Property Discount = new Property(9, double.class, "discount", false, "DISCOUNT");
        public final static Property ATotal = new Property(10, double.class, "aTotal", false, "A_TOTAL");
        public final static Property Total = new Property(11, double.class, "total", false, "TOTAL");
        public final static Property Tax = new Property(12, double.class, "tax", false, "TAX");
        public final static Property Cash = new Property(13, double.class, "cash", false, "CASH");
        public final static Property Change = new Property(14, double.class, "change", false, "CHANGE");
        public final static Property Ejsn = new Property(15, String.class, "ejsn", false, "EJSN");
        public final static Property EjActiDate = new Property(16, java.util.Date.class, "ejActiDate", false, "EJ_ACTI_DATE");
        public final static Property PayWay = new Property(17, int.class, "payWay", false, "PAY_WAY");
        public final static Property PayAmount = new Property(18, double.class, "payAmount", false, "PAY_AMOUNT");
        public final static Property TaxPayerId = new Property(19, Long.class, "taxPayerId", false, "TAX_PAYER_ID");
        public final static Property Currency = new Property(20, int.class, "currency", false, "CURRENCY");
        public final static Property CreatedTime = new Property(21, java.util.Date.class, "createdTime", false, "CREATED_TIME");
        public final static Property CreatorId = new Property(22, String.class, "creatorId", false, "CREATOR_ID");
    }


    public OrderDao(DaoConfig config) {
        super(config);
    }
    
    public OrderDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ORDER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"RECEIPT_TYPE\" TEXT," + // 1: receiptType
                "\"RECEIPT_ID\" TEXT," + // 2: receiptId
                "\"PRINT_COUNT\" INTEGER NOT NULL ," + // 3: printCount
                "\"ISOFFLINE\" INTEGER NOT NULL ," + // 4: isoffline
                "\"OP\" TEXT," + // 5: op
                "\"R_DATE\" INTEGER," + // 6: rDate
                "\"R_TIME\" INTEGER," + // 7: rTime
                "\"ANTI_FAKE_CODE\" TEXT," + // 8: antiFakeCode
                "\"DISCOUNT\" REAL NOT NULL ," + // 9: discount
                "\"A_TOTAL\" REAL NOT NULL ," + // 10: aTotal
                "\"TOTAL\" REAL NOT NULL ," + // 11: total
                "\"TAX\" REAL NOT NULL ," + // 12: tax
                "\"CASH\" REAL NOT NULL ," + // 13: cash
                "\"CHANGE\" REAL NOT NULL ," + // 14: change
                "\"EJSN\" TEXT," + // 15: ejsn
                "\"EJ_ACTI_DATE\" INTEGER," + // 16: ejActiDate
                "\"PAY_WAY\" INTEGER NOT NULL ," + // 17: payWay
                "\"PAY_AMOUNT\" REAL NOT NULL ," + // 18: payAmount
                "\"TAX_PAYER_ID\" INTEGER," + // 19: taxPayerId
                "\"CURRENCY\" INTEGER NOT NULL ," + // 20: currency
                "\"CREATED_TIME\" INTEGER," + // 21: createdTime
                "\"CREATOR_ID\" TEXT);"); // 22: creatorId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ORDER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Order entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String receiptType = entity.getReceiptType();
        if (receiptType != null) {
            stmt.bindString(2, receiptType);
        }
 
        String receiptId = entity.getReceiptId();
        if (receiptId != null) {
            stmt.bindString(3, receiptId);
        }
        stmt.bindLong(4, entity.getPrintCount());
        stmt.bindLong(5, entity.getIsoffline());
 
        String op = entity.getOp();
        if (op != null) {
            stmt.bindString(6, op);
        }
 
        java.util.Date rDate = entity.getRDate();
        if (rDate != null) {
            stmt.bindLong(7, rDate.getTime());
        }
 
        java.util.Date rTime = entity.getRTime();
        if (rTime != null) {
            stmt.bindLong(8, rTime.getTime());
        }
 
        String antiFakeCode = entity.getAntiFakeCode();
        if (antiFakeCode != null) {
            stmt.bindString(9, antiFakeCode);
        }
        stmt.bindDouble(10, entity.getDiscount());
        stmt.bindDouble(11, entity.getATotal());
        stmt.bindDouble(12, entity.getTotal());
        stmt.bindDouble(13, entity.getTax());
        stmt.bindDouble(14, entity.getCash());
        stmt.bindDouble(15, entity.getChange());
 
        String ejsn = entity.getEjsn();
        if (ejsn != null) {
            stmt.bindString(16, ejsn);
        }
 
        java.util.Date ejActiDate = entity.getEjActiDate();
        if (ejActiDate != null) {
            stmt.bindLong(17, ejActiDate.getTime());
        }
        stmt.bindLong(18, entity.getPayWay());
        stmt.bindDouble(19, entity.getPayAmount());
 
        Long taxPayerId = entity.getTaxPayerId();
        if (taxPayerId != null) {
            stmt.bindLong(20, taxPayerId);
        }
        stmt.bindLong(21, entity.getCurrency());
 
        java.util.Date createdTime = entity.getCreatedTime();
        if (createdTime != null) {
            stmt.bindLong(22, createdTime.getTime());
        }
 
        String creatorId = entity.getCreatorId();
        if (creatorId != null) {
            stmt.bindString(23, creatorId);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Order entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String receiptType = entity.getReceiptType();
        if (receiptType != null) {
            stmt.bindString(2, receiptType);
        }
 
        String receiptId = entity.getReceiptId();
        if (receiptId != null) {
            stmt.bindString(3, receiptId);
        }
        stmt.bindLong(4, entity.getPrintCount());
        stmt.bindLong(5, entity.getIsoffline());
 
        String op = entity.getOp();
        if (op != null) {
            stmt.bindString(6, op);
        }
 
        java.util.Date rDate = entity.getRDate();
        if (rDate != null) {
            stmt.bindLong(7, rDate.getTime());
        }
 
        java.util.Date rTime = entity.getRTime();
        if (rTime != null) {
            stmt.bindLong(8, rTime.getTime());
        }
 
        String antiFakeCode = entity.getAntiFakeCode();
        if (antiFakeCode != null) {
            stmt.bindString(9, antiFakeCode);
        }
        stmt.bindDouble(10, entity.getDiscount());
        stmt.bindDouble(11, entity.getATotal());
        stmt.bindDouble(12, entity.getTotal());
        stmt.bindDouble(13, entity.getTax());
        stmt.bindDouble(14, entity.getCash());
        stmt.bindDouble(15, entity.getChange());
 
        String ejsn = entity.getEjsn();
        if (ejsn != null) {
            stmt.bindString(16, ejsn);
        }
 
        java.util.Date ejActiDate = entity.getEjActiDate();
        if (ejActiDate != null) {
            stmt.bindLong(17, ejActiDate.getTime());
        }
        stmt.bindLong(18, entity.getPayWay());
        stmt.bindDouble(19, entity.getPayAmount());
 
        Long taxPayerId = entity.getTaxPayerId();
        if (taxPayerId != null) {
            stmt.bindLong(20, taxPayerId);
        }
        stmt.bindLong(21, entity.getCurrency());
 
        java.util.Date createdTime = entity.getCreatedTime();
        if (createdTime != null) {
            stmt.bindLong(22, createdTime.getTime());
        }
 
        String creatorId = entity.getCreatorId();
        if (creatorId != null) {
            stmt.bindString(23, creatorId);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Order readEntity(Cursor cursor, int offset) {
        Order entity = new Order( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // receiptType
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // receiptId
            cursor.getInt(offset + 3), // printCount
            cursor.getInt(offset + 4), // isoffline
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // op
            cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)), // rDate
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)), // rTime
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // antiFakeCode
            cursor.getDouble(offset + 9), // discount
            cursor.getDouble(offset + 10), // aTotal
            cursor.getDouble(offset + 11), // total
            cursor.getDouble(offset + 12), // tax
            cursor.getDouble(offset + 13), // cash
            cursor.getDouble(offset + 14), // change
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // ejsn
            cursor.isNull(offset + 16) ? null : new java.util.Date(cursor.getLong(offset + 16)), // ejActiDate
            cursor.getInt(offset + 17), // payWay
            cursor.getDouble(offset + 18), // payAmount
            cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19), // taxPayerId
            cursor.getInt(offset + 20), // currency
            cursor.isNull(offset + 21) ? null : new java.util.Date(cursor.getLong(offset + 21)), // createdTime
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22) // creatorId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Order entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setReceiptType(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setReceiptId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPrintCount(cursor.getInt(offset + 3));
        entity.setIsoffline(cursor.getInt(offset + 4));
        entity.setOp(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setRDate(cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)));
        entity.setRTime(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
        entity.setAntiFakeCode(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setDiscount(cursor.getDouble(offset + 9));
        entity.setATotal(cursor.getDouble(offset + 10));
        entity.setTotal(cursor.getDouble(offset + 11));
        entity.setTax(cursor.getDouble(offset + 12));
        entity.setCash(cursor.getDouble(offset + 13));
        entity.setChange(cursor.getDouble(offset + 14));
        entity.setEjsn(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setEjActiDate(cursor.isNull(offset + 16) ? null : new java.util.Date(cursor.getLong(offset + 16)));
        entity.setPayWay(cursor.getInt(offset + 17));
        entity.setPayAmount(cursor.getDouble(offset + 18));
        entity.setTaxPayerId(cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19));
        entity.setCurrency(cursor.getInt(offset + 20));
        entity.setCreatedTime(cursor.isNull(offset + 21) ? null : new java.util.Date(cursor.getLong(offset + 21)));
        entity.setCreatorId(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Order entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Order entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Order entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
