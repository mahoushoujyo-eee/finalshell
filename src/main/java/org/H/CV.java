/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import java.io.DataOutputStream;
import java.io.IOException;
import org.F.c;
import org.h.y_0;

class CV
implements y_0 {
    private static final String a;

    CV() {
    }

    @Override
    public int u() {
        return 1;
    }

    @Override
    public void H(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(1);
    }

    public String toString() {
        return a;
    }

    public int hashCode() {
        return 1;
    }

    public boolean equals(@c Object object) {
        return object == this;
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
                char[] cArray3 = "H\u001f_".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 122;
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
                            n17 = 91;
                            break;
                        }
                        case 1: {
                            n17 = 11;
                            break;
                        }
                        case 2: {
                            n17 = 81;
                            break;
                        }
                        case 3: {
                            n17 = 127;
                            break;
                        }
                        case 4: {
                            n17 = 82;
                            break;
                        }
                        case 5: {
                            n17 = 64;
                            break;
                        }
                        default: {
                            n17 = 2;
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

