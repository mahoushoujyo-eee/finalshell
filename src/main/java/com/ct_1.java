/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ak_0;
import com.nl_1;
import com.np_2;
import com.nv_2;
import com.ym_1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/*
 * Renamed from com.cT
 */
public class ct_1
implements ak_0 {
    public static final ct_1 Q;
    private static final String a;

    /*
     * Loose catch block
     */
    @Override
    public void u(nl_1 nl_12, Object object, Object object2, Type type, int n10) throws IOException {
        ym_1 ym_12 = nl_12.w;
        String string = nv_2.o();
        np_2 np_22 = np_2.a;
        try {
            Object object3;
            block6: {
                Field field;
                block7: {
                    field = object.getClass().getDeclaredField(a);
                    object3 = field;
                    if (string == null) break block6;
                    try {
                        block8: {
                            if (!Modifier.isPrivate(((Field)object3).getModifiers())) break block7;
                            break block8;
                            catch (Exception exception) {
                                throw ct_1.a(exception);
                            }
                        }
                        field.setAccessible(true);
                    }
                    catch (Exception exception) {
                        throw ct_1.a(exception);
                    }
                }
                object3 = field.get(object);
            }
            Field field = object3;
            np_22.u(nl_12, field, object2, type, n10);
        }
        catch (Exception exception) {
            ym_12.Y();
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
                char[] cArray3 = "z\u0005Q".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 26;
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
                            n17 = 13;
                            break;
                        }
                        case 1: {
                            n17 = 126;
                            break;
                        }
                        case 2: {
                            n17 = 59;
                            break;
                        }
                        case 3: {
                            n17 = 31;
                            break;
                        }
                        case 4: {
                            n17 = 72;
                            break;
                        }
                        case 5: {
                            n17 = 75;
                            break;
                        }
                        default: {
                            n17 = 79;
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
        Q = new ct_1();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

