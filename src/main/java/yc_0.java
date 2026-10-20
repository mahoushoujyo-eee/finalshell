/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * Renamed from Yc
 */
class yc_0 {
    private Map e = new HashMap();
    private static final String a;

    public Map x() {
        return this.e;
    }

    public boolean b(String string) {
        HashSet<String> hashSet;
        int n10 = D5.K();
        char c2 = string.startsWith(a);
        if (n10 != 0) {
            if (c2 != '\u0000') {
                return true;
            }
            c2 = string.charAt(0);
        }
        char c3 = c2;
        String string2 = string.substring(2, string.length());
        HashSet<String> hashSet2 = hashSet = (HashSet<String>)this.e.get(Character.valueOf(c3));
        if (n10 != 0) {
            if (hashSet2 == null) {
                hashSet = new HashSet<String>();
            }
            hashSet.add(string2);
            hashSet2 = this.e.put(Character.valueOf(c3), hashSet);
        }
        return true;
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
                char[] cArray3 = "FT".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 106;
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
                            n17 = 3;
                            break;
                        }
                        case 1: {
                            n17 = 17;
                            break;
                        }
                        case 2: {
                            n17 = 52;
                            break;
                        }
                        case 3: {
                            n17 = 25;
                            break;
                        }
                        case 4: {
                            n17 = 16;
                            break;
                        }
                        case 5: {
                            n17 = 92;
                            break;
                        }
                        default: {
                            n17 = 7;
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

