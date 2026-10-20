/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WX;
import com.nv_2;

/*
 * Renamed from com.Pd
 */
public class pd_0
implements WX {
    @Override
    public String g(Object object, String string, Object object2) {
        String string2;
        block4: {
            block5: {
                String string3;
                block2: {
                    block3: {
                        String string4 = nv_2.o();
                        string3 = string;
                        if (string4 == null) break block2;
                        if (string3 == null) break block3;
                        string2 = string;
                        if (string4 == null) break block4;
                        if (string2.length() != 0) break block5;
                    }
                    string3 = string;
                }
                return string3;
            }
            string2 = string;
        }
        char[] cArray = string2.toCharArray();
        cArray[0] = Character.toUpperCase(cArray[0]);
        String string5 = new String(cArray);
        return string5;
    }
}

