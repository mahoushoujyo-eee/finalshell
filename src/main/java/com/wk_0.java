/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.P7;
import com.X4;
import com.ak_0;
import com.nl_1;
import com.nv_2;
import com.ym_1;
import com.yn_2;
import java.io.IOException;
import java.lang.reflect.Type;

/*
 * Renamed from com.Wk
 */
public class wk_0
implements ak_0,
X4 {
    public static wk_0 b;
    private static final long[] a;
    private static final Integer[] c;

    @Override
    public void u(nl_1 nl_12, Object object, Object object2, Type type, int n10) throws IOException {
        this.X(nl_12, (String)object);
    }

    public void X(nl_1 nl_12, String string) {
        ym_1 ym_12 = nl_12.w;
        String string2 = nv_2.o();
        if (string2 != null) {
            if (string == null) {
                ym_12.x(EP.WriteNullStringAsEmpty);
                return;
            }
            ym_12.y(string);
        }
    }

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        Object object2;
        block12: {
            Class clazz;
            String string;
            block11: {
                string = nv_2.o();
                object2 = type;
                clazz = StringBuffer.class;
                if (string == null) break block11;
                if (object2 == clazz) {
                    P7 p7;
                    P7 p72 = yn_22.N;
                    Object object3 = p72;
                    if (string != null) {
                        if (object3.P() == 4) {
                            String string2 = p72.z();
                            p72.S(wk_0.a(19544, 8077850927720458294L));
                            return new StringBuffer(string2);
                        }
                        object3 = yn_22.M();
                    }
                    if ((p7 = object3) == null) {
                        return null;
                    }
                    return new StringBuffer(p7.toString());
                }
                object2 = type;
                if (string == null) break block12;
                clazz = StringBuilder.class;
            }
            if (object2 == clazz) {
                P7 p7;
                P7 p73 = yn_22.N;
                Object object4 = p73;
                if (string != null) {
                    if (object4.P() == 4) {
                        String string3 = p73.z();
                        p73.S(wk_0.a(19544, 8077850927720458294L));
                        return new StringBuilder(string3);
                    }
                    object4 = yn_22.M();
                }
                if ((p7 = object4) == null) {
                    return null;
                }
                return new StringBuilder(p7.toString());
            }
            object2 = wk_0.t(yn_22);
        }
        return object2;
    }

    public static Object t(yn_2 yn_22) {
        Object object;
        Object object2;
        String string;
        block8: {
            int n10;
            int n11;
            P7 p7;
            block7: {
                p7 = yn_22.E();
                string = nv_2.o();
                n11 = p7.P();
                n10 = 4;
                if (string == null) break block7;
                if (n11 == n10) {
                    String string2 = p7.z();
                    p7.S(wk_0.a(21857, 6585532094204834062L));
                    return string2;
                }
                object2 = p7;
                if (string == null) break block8;
                n11 = object2.P();
                n10 = 2;
            }
            if (n11 == n10) {
                String string3 = p7.c();
                p7.S(wk_0.a(19544, 8077850927720458294L));
                return string3;
            }
            object2 = yn_22.M();
        }
        Object object3 = object = object2;
        if (string != null) {
            if (object3 == null) {
                return null;
            }
            object3 = object;
        }
        return object3.toString();
    }

    @Override
    public int j() {
        return 4;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6519255642992993200L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "N\u00d2b\u00e3\u00cc\u008d\u0092\u00ae\u00e8<\u00a0IW\u00d8\u008b\u0096";
        int n11 = "N\u00d2b\u00e3\u00cc\u008d\u0092\u00ae\u00e8<\u00a0IW\u00d8\u008b\u0096".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        c = new Integer[2];
        b = new wk_0();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x246F;
        if (c[n11] == null) {
            wk_0.c[n11] = (int)(a[n11] ^ l2);
        }
        return c[n11];
    }
}

