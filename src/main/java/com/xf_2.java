/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ph_0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/*
 * Renamed from com.xf
 */
public class xf_2
implements GenericArrayType {
    private final Type O;
    private static final String a;

    public xf_2(Type type) {
        int n10 = ph_0.w();
        int n11 = n10;
        if (n11 != 0) {
            assert (type != null);
            this.O = type;
        }
    }

    @Override
    public Type getGenericComponentType() {
        return this.O;
    }

    public String toString() {
        StringBuilder stringBuilder;
        block4: {
            Type type;
            block3: {
                int n10;
                block2: {
                    type = this.getGenericComponentType();
                    n10 = ph_0.u();
                    stringBuilder = new StringBuilder();
                    if (n10 != 0) break block2;
                    if (!(type instanceof Class)) break block3;
                    stringBuilder.append(((Class)type).getName());
                }
                if (n10 == 0) break block4;
            }
            stringBuilder.append(type.toString());
        }
        stringBuilder.append(a);
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        int n10 = ph_0.w();
        boolean bl = object instanceof GenericArrayType;
        if (n10 != 0) {
            if (bl) {
                GenericArrayType genericArrayType = (GenericArrayType)object;
                return this.O.equals(genericArrayType.getGenericComponentType());
            }
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return this.O.hashCode();
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
                char[] cArray3 = "J%".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 96;
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
                            n17 = 113;
                            break;
                        }
                        case 1: {
                            n17 = 24;
                            break;
                        }
                        case 2: {
                            n17 = 120;
                            break;
                        }
                        case 3: {
                            n17 = 48;
                            break;
                        }
                        case 4: {
                            n17 = 55;
                            break;
                        }
                        case 5: {
                            n17 = 70;
                            break;
                        }
                        default: {
                            n17 = 96;
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

