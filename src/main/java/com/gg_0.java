/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.X4;
import com.ev_2;
import com.hi_0;
import com.yn_2;
import java.lang.reflect.Type;

/*
 * Renamed from com.Gg
 */
public class gg_0
implements X4 {
    public final Class X;
    private static final String a;
    private static final long b;

    public gg_0(Class clazz) {
        this.X = clazz;
    }

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        ev_2 ev_22;
        try {
            ev_22 = (ev_2)this.X.newInstance();
        }
        catch (Exception exception) {
            throw new hi_0(a);
        }
        Object object2 = yn_22.T(ev_22, object);
        return object2;
    }

    @Override
    public int j() {
        return (int)b;
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
                char[] cArray3 = "U%F`\u0005n$_9Tq\u0010egSwBw\u0003dv".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 19;
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
                            n17 = 37;
                            break;
                        }
                        case 1: {
                            n17 = 68;
                            break;
                        }
                        case 2: {
                            n17 = 52;
                            break;
                        }
                        case 3: {
                            n17 = 22;
                            break;
                        }
                        case 4: {
                            n17 = 98;
                            break;
                        }
                        case 5: {
                            n17 = 24;
                            break;
                        }
                        default: {
                            n17 = 23;
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
        a = new String(cArray).intern();
        long l2 = 5290744250019118495L;
        b = 0xAB61AE0223D47D93L ^ l2;
    }
}

