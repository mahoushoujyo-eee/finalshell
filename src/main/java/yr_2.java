/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/*
 * Renamed from yr
 */
public class yr_2 {
    private static Unsafe E;

    public static void s(Field field, Object object) throws Exception {
        Object object2 = ((Unsafe)yr_2.E).staticFieldBase(field);
        long l2 = ((Unsafe)yr_2.E).staticFieldOffset(field);
        ((Unsafe)yr_2.E).putObject(object2, l2, object);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        char[] cArray;
        block14: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block13: {
                char[] cArray3 = "e(p2.\u0011<w%".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 9;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block13;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block14;
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
                            n17 = 24;
                            break;
                        }
                        case 1: {
                            n17 = 73;
                            break;
                        }
                        case 2: {
                            n17 = 28;
                            break;
                        }
                        case 3: {
                            n17 = 110;
                            break;
                        }
                        case 4: {
                            n17 = 73;
                            break;
                        }
                        case 5: {
                            n17 = 107;
                            break;
                        }
                        default: {
                            n17 = 84;
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
        String string = new String(cArray).intern();
        try {
            Field field = Unsafe.class.getDeclaredField(string);
            field.setAccessible(true);
            yr_2.E = (Unsafe)field.get(null);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

