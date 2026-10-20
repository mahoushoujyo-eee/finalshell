/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from dv
 */
public class dv_2
implements zv_0 {
    private static final String a;

    @Override
    public boolean l(Object object) {
        boolean bl;
        block6: {
            boolean bl2;
            block7: {
                boolean bl3;
                block8: {
                    block9: {
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
                        bl2 = false;
                        ky_2[] ky_2Array = vk_0.y();
                        bl = file.exists();
                        if (ky_2Array == null) break block6;
                        if (!bl) break block7;
                        try {
                            string = (String)lk_0.N(file.getName());
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        String string3 = string;
                        bl3 = string3.toLowerCase().equals(a);
                        if (ky_2Array == null) break block8;
                        if (!bl3) break block9;
                        bl2 = true;
                        if (ky_2Array != null) break block7;
                    }
                    bl3 = false;
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
                char[] cArray3 = "l\u001b\u0003?".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 124;
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
                            n17 = 122;
                            break;
                        }
                        case 1: {
                            n17 = 20;
                            break;
                        }
                        case 2: {
                            n17 = 16;
                            break;
                        }
                        case 3: {
                            n17 = 45;
                            break;
                        }
                        case 4: {
                            n17 = 67;
                            break;
                        }
                        case 5: {
                            n17 = 52;
                            break;
                        }
                        default: {
                            n17 = 125;
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

