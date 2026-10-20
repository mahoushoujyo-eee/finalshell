/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from t_
 */
public class t__0
implements zv_0 {
    private static final String a;

    @Override
    public boolean l(Object object) {
        boolean bl;
        block8: {
            boolean bl2;
            block9: {
                boolean bl3;
                block10: {
                    block11: {
                        String string;
                        String string2;
                        ck_2 ck_22 = (ck_2)object;
                        try {
                            string2 = (String)ck_22.d();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        File file = new File(string2);
                        String string3 = km_0.U();
                        bl2 = false;
                        bl = file.exists();
                        if (string3 != null) break block8;
                        if (!bl) break block9;
                        try {
                            string = (String)lk_0.N(file.getName());
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        String string4 = string;
                        try {
                            bl3 = (Boolean)vk_0.s();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (string3 != null) break block10;
                        if (!bl3) break block11;
                        bl = string4.toLowerCase().equals(a);
                        if (string3 != null) break block8;
                        if (!bl) break block9;
                        bl2 = true;
                        if (string3 == null) break block9;
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl = bl2;
        }
        return bl;
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
                char[] cArray3 = "h\u0017\u007f".toCharArray();
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
                            n17 = 103;
                            break;
                        }
                        case 1: {
                            n17 = 5;
                            break;
                        }
                        case 2: {
                            n17 = 112;
                            break;
                        }
                        case 3: {
                            n17 = 15;
                            break;
                        }
                        case 4: {
                            n17 = 63;
                            break;
                        }
                        case 5: {
                            n17 = 120;
                            break;
                        }
                        default: {
                            n17 = 43;
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

