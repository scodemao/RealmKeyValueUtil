package mao.scode.com.realmutils.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by maoweiwei on 16/7/6
 * RealmKeyValueUtil
 */

public class KeyValueRealmObject extends RealmObject {

    @PrimaryKey
    private String sMkey;
    private String sMValue;

    public String getSMkey() {
        return sMkey;
    }

    public void setSMkey(String sMkey) {
        this.sMkey = sMkey;
    }

    public String getSMValue() {
        return sMValue;
    }

    public void setSMValue(String sMValue) {
        this.sMValue = sMValue;
    }
}
