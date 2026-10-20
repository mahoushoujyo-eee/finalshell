/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.thoughtworks.xstream.converters.SingleValueConverter;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class XY
implements SingleValueConverter {
    private static final SimpleDateFormat I;

    @Override
    public boolean canConvert(Class clazz) {
        return Long.class.getCanonicalName().equals(clazz.getCanonicalName());
    }

    @Override
    public String toString(Object object) {
        if (object == null) {
            return "";
        }
        return I.format(new Date((Long)object));
    }

    @Override
    public Object fromString(String string) {
        try {
            return I.parse(string).getTime();
        }
        catch (Throwable throwable) {
            try {
                return Long.parseLong(string);
            }
            catch (Throwable throwable2) {
                return 0L;
            }
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "=}m:|g~ `:".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 38;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 127;
                            break;
                        }
                        case 1: {
                            n17 = 63;
                            break;
                        }
                        case 2: {
                            n17 = 101;
                            break;
                        }
                        case 3: {
                            n17 = 81;
                            break;
                        }
                        case 4: {
                            n17 = 23;
                            break;
                        }
                        case 5: {
                            n17 = 111;
                            break;
                        }
                        default: {
                            n17 = 33;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        String string = new String(cArray).intern();
        I = new SimpleDateFormat(string);
    }
}

