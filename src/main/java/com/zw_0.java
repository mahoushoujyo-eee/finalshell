/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hi_0;
import com.ph_2;
import com.z8;

/*
 * Renamed from com.zw
 */
class zw_0
extends z8 {
    private final Object d;
    private boolean o;
    private static final String c;

    public zw_0(String string, boolean bl, Object object, boolean bl2) {
        block4: {
            block5: {
                String string2 = hi_0.C();
                super(string, bl);
                this.o = true;
                String string3 = string2;
                try {
                    try {
                        if (string3 != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw zw_0.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException(c);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw zw_0.a(illegalArgumentException);
                }
            }
            this.d = object;
            this.o = bl2;
        }
    }

    @Override
    public boolean x(ph_2 ph_22, Object object, Object object2, Object object3) {
        boolean bl;
        block6: {
            boolean bl2;
            block7: {
                boolean bl3;
                block8: {
                    block9: {
                        Object object4 = this.H(ph_22, object, object3);
                        String string = hi_0.C();
                        bl2 = this.d.equals(object4);
                        try {
                            try {
                                try {
                                    bl = this.o;
                                    if (string != null) break block6;
                                    if (bl) break block7;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw zw_0.a(illegalArgumentException);
                                }
                                bl3 = bl2;
                                if (string != null) break block8;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw zw_0.a(illegalArgumentException);
                            }
                            if (bl3) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw zw_0.a(illegalArgumentException);
                        }
                        bl3 = true;
                        break block8;
                    }
                    bl3 = false;
                }
                bl2 = bl3;
            }
            bl = bl2;
        }
        return bl;
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
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "Z<*? ^T_}(?)\u0012".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 34;
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
                            n17 = 14;
                            break;
                        }
                        case 1: {
                            n17 = 127;
                            break;
                        }
                        case 2: {
                            n17 = 100;
                            break;
                        }
                        case 3: {
                            n17 = 104;
                            break;
                        }
                        case 4: {
                            n17 = 103;
                            break;
                        }
                        case 5: {
                            n17 = 92;
                            break;
                        }
                        default: {
                            n17 = 31;
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
        c = new String(cArray).intern();
    }
}

