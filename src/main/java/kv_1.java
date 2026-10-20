/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.HashSet;

/*
 * Renamed from kV
 */
class kv_1
implements YA {
    final lr_0 O;

    kv_1(lr_0 lr_02) {
        this.O = lr_02;
    }

    public boolean s(String string) {
        String[] stringArray;
        block6: {
            Object object;
            stringArray = string.split(" ");
            String[] stringArray2 = lr_0.Q();
            HashSet<String> hashSet = new HashSet<String>();
            int n10 = 2;
            while (n10 < stringArray.length) {
                String string2 = stringArray[n10].trim();
                if (stringArray2 == null) {
                    object = string2;
                    if (stringArray2 != null) break block6;
                    if (!((String)object).equals("")) {
                        HashSet<String> hashSet2;
                        hashSet.add(string2);
                        HashSet<String> hashSet3 = hashSet2 = (HashSet<String>)lr_0.h(this.O).get(string2);
                        if (stringArray2 == null) {
                            if (hashSet3 == null) {
                                hashSet2 = new HashSet<String>();
                            }
                            hashSet2.add(stringArray[0]);
                            hashSet3 = lr_0.h(this.O).put(string2, hashSet2);
                        }
                    }
                    ++n10;
                }
                if (stringArray2 == null) continue;
                ky_2.K(new String[2]);
                break;
            }
            object = lr_0.i(this.O).put(stringArray[0], hashSet);
        }
        stringArray = null;
        return false;
    }

    @Override
    public boolean w(Object object) {
        return this.s((String)object);
    }
}

