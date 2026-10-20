/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.ak_0;
import com.nl_1;
import com.nv_2;
import com.ym_1;
import java.io.IOException;
import java.lang.reflect.Type;

/*
 * Renamed from com.Nl
 */
public class nl_0
implements ak_0 {
    public static final nl_0 v = new nl_0();

    @Override
    public void u(nl_1 nl_12, Object object, Object object2, Type type, int n10) throws IOException {
        block2: {
            block3: {
                String string = nv_2.o();
                try {
                    if (string == null) break block2;
                    if (object != null) break block3;
                }
                catch (IOException iOException) {
                    throw nl_0.a(iOException);
                }
                ym_1 ym_12 = nl_12.w;
                ym_12.x(EP.WriteNullStringAsEmpty);
                return;
            }
            nl_12.l(object.toString());
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

