/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CN;
import com.ak_0;
import com.nl_1;
import com.nv_2;
import java.io.IOException;
import java.lang.reflect.Type;

/*
 * Renamed from com.kx
 */
public class kx_2
implements ak_0 {
    public static kx_2 b = new kx_2();

    @Override
    public void u(nl_1 nl_12, Object object, Object object2, Type type, int n10) throws IOException {
        CN cN;
        block4: {
            CN cN2;
            block5: {
                cN2 = (CN)object;
                String string = nv_2.o();
                try {
                    try {
                        cN = cN2;
                        if (string == null) break block4;
                        if (cN != null) break block5;
                    }
                    catch (IOException iOException) {
                        throw kx_2.a(iOException);
                    }
                    nl_12.e();
                    return;
                }
                catch (IOException iOException) {
                    throw kx_2.a(iOException);
                }
            }
            cN = cN2;
        }
        cN.G(nl_12, object2, type, n10);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

