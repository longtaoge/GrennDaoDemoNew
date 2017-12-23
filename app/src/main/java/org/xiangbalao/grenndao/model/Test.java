package org.xiangbalao.grenndao.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by longtaoge on 2017/12/17.
 */

@Entity
public class Test extends  BaseModel {


    @Id
    private int id;

    @Generated(hash = 442027691)
    public Test(int id) {
        this.id = id;
    }

    @Generated(hash = 372557997)
    public Test() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
