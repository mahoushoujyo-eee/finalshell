/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Wb
 */
public class wb_0
extends W2 {
    private static final String a;

    public wb_0() {
        try {
            this.G(a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void O() {
        String[] stringArray;
        try {
            stringArray = (String[])lk_0.B(this.F);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String[] stringArray2 = stringArray;
        int n10 = 0;
        String string = W2.F();
        while (n10 < stringArray2.length) {
            String string2 = stringArray2[n10].trim();
            if (string != null) {
                if (!string2.startsWith("\\")) {
                    String string3 = string2;
                    int n11 = string2.indexOf("\\");
                    if (string != null) {
                        if (n11 > -1) {
                            string3 = string3.substring(0, n11).trim();
                        }
                        this.p.h = string3;
                    }
                    if (string != null) break;
                }
                ++n10;
            }
            if (string != null) continue;
        }
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
                char[] cArray3 = "8sPgtP,8=W>(A=6?V\"7P9(w\u001f$:AxtwP$t\\+(gA".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 39;
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
                            n17 = 124;
                            break;
                        }
                        case 1: {
                            n17 = 53;
                            break;
                        }
                        case 2: {
                            n17 = 3;
                            break;
                        }
                        case 3: {
                            n17 = 96;
                            break;
                        }
                        case 4: {
                            n17 = 124;
                            break;
                        }
                        case 5: {
                            n17 = 18;
                            break;
                        }
                        default: {
                            n17 = 127;
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

