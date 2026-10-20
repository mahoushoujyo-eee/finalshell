/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ak_0;
import com.hi_0;
import com.nl_1;
import com.nv_2;
import com.ym_1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class GH
implements ak_0 {
    private final Member P;
    public static final GH T;
    private static final String a;

    public GH() {
        this.P = null;
    }

    public GH(Member member) {
        this.P = member;
    }

    @Override
    public void u(nl_1 nl_12, Object object, Object object2, Type type, int n10) throws IOException {
        Object object3;
        block7: {
            String string = nv_2.o();
            if (this.P == null) {
                ym_1 ym_12 = nl_12.w;
                ym_12.V((Enum)object);
                return;
            }
            object3 = null;
            try {
                Object object4;
                block5: {
                    block6: {
                        try {
                            object4 = this.P;
                            if (string == null) break block5;
                            if (!(object4 instanceof Field)) break block6;
                        }
                        catch (Exception exception) {
                            throw GH.a(exception);
                        }
                        object3 = ((Field)this.P).get(object);
                        break block7;
                    }
                    object4 = ((Method)this.P).invoke(object, new Object[0]);
                }
                object3 = object4;
            }
            catch (Exception exception) {
                throw new hi_0(a, exception);
            }
        }
        nl_12.B(object3);
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
                char[] cArray3 = "[|0r\u0000tujx(B\u000b!}Nk+E".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 58;
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
                            n17 = 6;
                            break;
                        }
                        case 1: {
                            n17 = 35;
                            break;
                        }
                        case 2: {
                            n17 = 126;
                            break;
                        }
                        case 3: {
                            n17 = 13;
                            break;
                        }
                        case 4: {
                            n17 = 84;
                            break;
                        }
                        case 5: {
                            n17 = 59;
                            break;
                        }
                        default: {
                            n17 = 34;
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
        T = new GH();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

