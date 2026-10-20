/*
 * Decompiled with CFR 0.152.
 */
package org;

import com.ky_2;
import org.F.c;
import org.I;

/*
 * Renamed from org.d
 */
public class d_0
extends Exception {
    @c
    private final I D;
    private static ky_2[] B;
    private static final String a;

    public d_0(String string, @c I i2) {
        super(string);
        this.D = i2;
    }

    public d_0(String string, @c I i2, @c Throwable throwable) {
        super(string, throwable);
        this.D = i2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String getMessage() {
        String string;
        ky_2[] ky_2Array = d_0.b();
        d_0 d_02 = this;
        if (ky_2Array != null) {
            if (d_02.D != null) {
                string = this.D.toString() + a + super.getMessage();
                return string;
            }
            d_02 = this;
        }
        string = super.getMessage();
        return string;
    }

    @c
    public I Z() {
        return this.D;
    }

    public static void N(ky_2[] ky_2Array) {
        B = ky_2Array;
    }

    public static ky_2[] b() {
        return B;
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
                if (d_0.b() == null) {
                    d_0.N(new ky_2[5]);
                }
                char[] cArray3 = "\u0018\t".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 109;
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
                            n17 = 79;
                            break;
                        }
                        case 1: {
                            n17 = 68;
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
                            n17 = 77;
                            break;
                        }
                        case 5: {
                            n17 = 45;
                            break;
                        }
                        default: {
                            n17 = 58;
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
    }
}

