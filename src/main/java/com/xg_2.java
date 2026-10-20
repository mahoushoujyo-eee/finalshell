/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O4;
import com.xy_1;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from com.xg
 */
@O4(Z={"type", "bbox", "coordinates"})
public class xg_2
extends xy_1 {
    private List n = new ArrayList();
    private static final String a;

    public xg_2() {
        super(a);
    }

    public List x() {
        return this.n;
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
                char[] cArray3 = "T\r\u007f%,m8Q\u0007r=<|){\u0007p".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 37;
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
                            n17 = 55;
                            break;
                        }
                        case 1: {
                            n17 = 77;
                            break;
                        }
                        case 2: {
                            n17 = 59;
                            break;
                        }
                        case 3: {
                            n17 = 116;
                            break;
                        }
                        case 4: {
                            n17 = 124;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 120;
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

