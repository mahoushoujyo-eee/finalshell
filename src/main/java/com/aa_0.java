/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ak_0;
import com.nl_1;
import com.nv_2;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Renamed from com.aa
 */
public class aa_0
implements ak_0 {
    private final String h;

    public aa_0(String string) {
        this.h = string;
    }

    @Override
    public void u(nl_1 nl_12, Object object, Object object2, Type type, int n10) throws IOException {
        Object object3;
        block4: {
            block5: {
                String string = nv_2.o();
                try {
                    try {
                        object3 = object;
                        if (string == null) break block4;
                        if (object3 != null) break block5;
                    }
                    catch (IOException iOException) {
                        throw aa_0.a(iOException);
                    }
                    nl_12.w.Y();
                    return;
                }
                catch (IOException iOException) {
                    throw aa_0.a(iOException);
                }
            }
            object3 = object;
        }
        Date date = (Date)object3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.h, nl_12.y);
        simpleDateFormat.setTimeZone(nl_12.D);
        String string = simpleDateFormat.format(date);
        nl_12.l(string);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

