/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.hn_1;

/*
 * Renamed from com.hb
 */
public class hb_2
extends hn_1 {
    private static final String a;
    private static final long b;

    @Override
    public int C(int n10, int n11, int n12) {
        String[] stringArray = W5.q();
        int n13 = n10 & 1;
        if (stringArray != null) {
            if (n13 == (n11 & 1)) {
                return n12;
            }
            n13 = NM.n(0.25f, (int)b, n12);
        }
        return n13;
    }

    public String toString() {
        return a;
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
                char[] cArray3 = "BL{'\u000e[\u000b>rc=\u0006\u0001\"7~\"\u0018\u0013H\u001eaTg".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 15;
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
                            n17 = 30;
                            break;
                        }
                        case 1: {
                            n17 = 55;
                            break;
                        }
                        case 2: {
                            n17 = 13;
                            break;
                        }
                        case 3: {
                            n17 = 68;
                            break;
                        }
                        case 4: {
                            n17 = 104;
                            break;
                        }
                        case 5: {
                            n17 = 46;
                            break;
                        }
                        default: {
                            n17 = 97;
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
        long l2 = 1732358864890347191L;
        b = 0xB9917AC672D0272EL ^ l2;
    }
}

