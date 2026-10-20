/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Composite;

/*
 * Renamed from com.rA
 */
public abstract class ra_1
implements Composite {
    protected float l;
    private static String B;
    private static final String b;

    public ra_1() {
        this(1.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ra_1(float f10) {
        float f11;
        block7: {
            String string = ra_1.c();
            String string2 = string;
            try {
                try {
                    float f12 = f10 - 0.0f;
                    f11 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (string2 != null) break block7;
                    if (f11 < 0) throw new IllegalArgumentException(b);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ra_1.a(illegalArgumentException);
                }
                float f13 = f10 - 1.0f;
                f11 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ra_1.a(illegalArgumentException);
            }
        }
        try {
            if (f11 > 0) {
                throw new IllegalArgumentException(b);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ra_1.a(illegalArgumentException);
        }
        this.l = f10;
    }

    public float k() {
        return this.l;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.l);
    }

    public boolean equals(Object object) {
        float f10;
        block10: {
            block11: {
                Object object2;
                String string;
                block8: {
                    block9: {
                        string = ra_1.c();
                        try {
                            try {
                                object2 = object;
                                if (string != null) break block8;
                                if (object2 instanceof ra_1) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ra_1.a(illegalArgumentException);
                            }
                            return false;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ra_1.a(illegalArgumentException);
                        }
                    }
                    object2 = object;
                }
                ra_1 ra_12 = (ra_1)object2;
                try {
                    try {
                        float f11 = this.l - ra_12.l;
                        f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                        if (string != null) break block10;
                        if (f10 == false) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ra_1.a(illegalArgumentException);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ra_1.a(illegalArgumentException);
                }
            }
            f10 = 1.0f;
        }
        return (boolean)f10;
    }

    public static void C(String string) {
        B = string;
    }

    public static String c() {
        return B;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (ra_1.c() != null) {
                    ra_1.C("WrXAJ");
                }
                char[] cArray3 = "\u00023`w\u0002.\u007f?\u0007K@\by/1\u0018R\\\fcb%\u0007V\u0014\u000f&/2\u0011VC\b&apD\u0002U\u0003'/a".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 90;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 10;
                            break;
                        }
                        case 1: {
                            n17 = 46;
                            break;
                        }
                        case 2: {
                            n17 = 120;
                            break;
                        }
                        case 3: {
                            n17 = 110;
                            break;
                        }
                        case 4: {
                            n17 = 55;
                            break;
                        }
                        case 5: {
                            n17 = 25;
                            break;
                        }
                        default: {
                            n17 = 85;
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
        b = new String(cArray).intern();
    }
}

