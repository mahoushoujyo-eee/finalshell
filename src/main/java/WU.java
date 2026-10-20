/*
 * Decompiled with CFR 0.152.
 */
import com.IR;
import com._y_0;
import com.c;
import java.lang.reflect.InvocationTargetException;

class WU
extends W2 {
    final ty_0 D;
    private static final String a;

    WU(ty_0 ty_02) {
        this.D = ty_02;
        try {
            this.G(a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void O() {
        String[] stringArray = KV.b();
        String string = (String)this.F;
        if (stringArray == null) {
            String[] stringArray2;
            if (string == null) {
                return;
            }
            try {
                stringArray2 = (String[])lk_0.B(this.F);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.F = stringArray2[0];
            string = (String)this.F;
        }
        String string2 = string;
        IR iR = (IR)((_y_0)this.D.F).O();
        iR.L(string2);
        try {
            this.D.U.s(string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
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
                char[] cArray3 = "`[2".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 19;
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
                            n17 = 63;
                            break;
                        }
                        case 2: {
                            n17 = 69;
                            break;
                        }
                        case 3: {
                            n17 = 46;
                            break;
                        }
                        case 4: {
                            n17 = 5;
                            break;
                        }
                        case 5: {
                            n17 = 44;
                            break;
                        }
                        default: {
                            n17 = 33;
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

