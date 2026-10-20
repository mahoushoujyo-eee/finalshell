/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O4;
import com.xy_1;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Renamed from com.xQ
 */
@O4(Z={"type", "id", "bbox", "coordinates", "properties"})
public class xq_1
extends xy_1 {
    private String L;
    private xy_1 H;
    private Map G = new LinkedHashMap();
    private static final String a;

    public xq_1() {
        super(a);
    }

    public xy_1 a() {
        return this.H;
    }

    public void O(xy_1 xy_12) {
        this.H = xy_12;
    }

    public Map k() {
        return this.G;
    }

    public void l(Map map) {
        this.G = map;
    }

    public String f() {
        return this.L;
    }

    public void K(String string) {
        this.L = string;
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
                char[] cArray3 = "2oYA\u0004<K".toCharArray();
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
                            n17 = 32;
                            break;
                        }
                        case 1: {
                            n17 = 94;
                            break;
                        }
                        case 2: {
                            n17 = 108;
                            break;
                        }
                        case 3: {
                            n17 = 97;
                            break;
                        }
                        case 4: {
                            n17 = 37;
                            break;
                        }
                        case 5: {
                            n17 = 26;
                            break;
                        }
                        default: {
                            n17 = 122;
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

