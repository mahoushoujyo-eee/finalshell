/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/*
 * Renamed from Wt
 */
public class wt_0
extends W2 {
    HashMap D;
    HashMap A;
    private static final String a;

    public wt_0() {
        try {
            this.G(a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.D = new HashMap();
        this.A = new HashMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void O() {
        String string = W2.F();
        try {
            String[] stringArray;
            try {
                stringArray = (String[])lk_0.B(this.F);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String[] stringArray2 = stringArray;
            for (int i2 = 0; i2 < stringArray2.length; ++i2) {
                String string2 = stringArray2[i2].trim();
                String[] stringArray3 = string2.split(":");
                String string3 = stringArray3[0];
                int n10 = Integer.parseInt(stringArray3[2]);
                int n11 = Integer.parseInt(stringArray3[2]);
                try {
                    ((HashMap)this.D).put(n10, string3);
                    ((HashMap)this.A).put(n11, string3);
                    try {
                        this.p.Y(this.D);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.p.H(this.A);
                        continue;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                catch (Exception exception) {
                    throw wt_0.a(exception);
                    return;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public HashMap j() {
        return (HashMap)this.D;
    }

    public void o(HashMap hashMap) {
        this.D = hashMap;
    }

    public HashMap q() {
        return (HashMap)this.A;
    }

    public void k(HashMap hashMap) {
        this.A = hashMap;
    }

    private static Exception a(Exception exception) {
        return exception;
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
                char[] cArray3 = "fV=5k<9f\u00189t7*:a".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 100;
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
                            n17 = 97;
                            break;
                        }
                        case 1: {
                            n17 = 83;
                            break;
                        }
                        case 2: {
                            n17 = 45;
                            break;
                        }
                        case 3: {
                            n17 = 113;
                            break;
                        }
                        case 4: {
                            n17 = 32;
                            break;
                        }
                        case 5: {
                            n17 = 61;
                            break;
                        }
                        default: {
                            n17 = 41;
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

