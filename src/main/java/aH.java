/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

class aH
implements Callable {
    final String F;
    final String p;
    final ty_0 f;
    private static final String a;

    aH(ty_0 ty_02, String string, String string2) {
        this.f = ty_02;
        this.F = string;
        this.p = string2;
    }

    public Object call() throws Exception {
        try {
            this.f.Y((Object)a, this.F, this.p);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return null;
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
                char[] cArray3 = "yIQc\u0000{e?JTa\u00028".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 121;
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
                            n17 = 46;
                            break;
                        }
                        case 1: {
                            n17 = 86;
                            break;
                        }
                        case 2: {
                            n17 = 65;
                            break;
                        }
                        case 3: {
                            n17 = 116;
                            break;
                        }
                        case 4: {
                            n17 = 24;
                            break;
                        }
                        case 5: {
                            n17 = 110;
                            break;
                        }
                        default: {
                            n17 = 111;
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

