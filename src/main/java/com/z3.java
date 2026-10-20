/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ak_0;
import com.nl_1;
import com.nv_2;
import com.ym_1;
import java.io.IOException;
import java.lang.reflect.Type;

public class z3
implements ak_0 {
    public static final z3 L = new z3();

    @Override
    public void u(nl_1 nl_12, Object object, Object object2, Type type, int n10) throws IOException {
        Object object3;
        ym_1 ym_12;
        block4: {
            block5: {
                ym_12 = nl_12.w;
                String string = nv_2.o();
                try {
                    try {
                        object3 = object;
                        if (string == null) break block4;
                        if (object3 != null) break block5;
                    }
                    catch (IOException iOException) {
                        throw z3.a(iOException);
                    }
                    ym_12.Y();
                    return;
                }
                catch (IOException iOException) {
                    throw z3.a(iOException);
                }
            }
            object3 = object;
        }
        String string = object3.toString();
        ym_12.y(string);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

