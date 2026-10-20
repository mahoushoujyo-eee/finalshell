/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.F.c;
import org.V.J;
import org.V.N;
import org.v.h_0;

/*
 * Renamed from org.V.t
 */
public class t_0
extends J {
    private final ZipFile g;
    private static final String b;

    public t_0(ZipFile zipFile) {
        this.g = zipFile;
    }

    public final String toString() {
        return b + this.g.getName();
    }

    @Override
    @c
    public final N J(String string) {
        ZipEntry zipEntry = this.g.getEntry(string);
        if (zipEntry == null) {
            return null;
        }
        return new h_0(this, string, zipEntry);
    }

    static ZipFile S(t_0 t_02) {
        return t_02.g;
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
                char[] cArray3 = "\u0015>6.".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 84;
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
                            n17 = 59;
                            break;
                        }
                        case 1: {
                            n17 = 3;
                            break;
                        }
                        case 2: {
                            n17 = 18;
                            break;
                        }
                        case 3: {
                            n17 = 64;
                            break;
                        }
                        case 4: {
                            n17 = 113;
                            break;
                        }
                        case 5: {
                            n17 = 119;
                            break;
                        }
                        default: {
                            n17 = 15;
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

