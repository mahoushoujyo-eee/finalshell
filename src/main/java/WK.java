/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.Icon;

public class WK
extends W2 {
    private static final String a;

    public WK() {
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
        ArrayList arrayList;
        String string = W2.F();
        try {
            arrayList = (ArrayList)this.p.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        arrayList.clear();
        String string2 = string;
        String string3 = (String)this.F;
        if (string2 != null) {
            if (string3 == null) {
                return;
            }
            string3 = (String)this.F;
        }
        try {
            stringArray = (String[])lk_0.B(string3);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String[] stringArray2 = stringArray;
        boolean bl = false;
        HashSet<String> hashSet = new HashSet<String>();
        int n10 = 0;
        while (n10 < stringArray2.length) {
            String string4 = stringArray2[n10].trim();
            String string5 = string4.trim();
            if (string2 != null) {
                if (!string5.contains("*") && !hashSet.contains(string5)) {
                    Icon icon;
                    ArrayList arrayList2;
                    L1 l1 = new L1("", string5);
                    try {
                        arrayList2 = (ArrayList)this.p.M();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    arrayList2.add(l1);
                    hashSet.add(string5);
                    bo_2 bo_22 = new bo_2(string5, string5, "-", null);
                    try {
                        icon = (Icon)lk_0.D(bo_22);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    Icon icon2 = icon;
                    try {
                        l1.v(icon2);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                ++n10;
            }
            if (string2 != null) continue;
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
                char[] cArray3 = "<aQITZ$8}QI,~\u0013\u00182\rM\bMgw(VM[\u001f`y2\rM\u001bM\" 2\\\u001b\\\u0018hw2\rM\u001bM\" 2_M\u0000\u001f4?`\u0005".toCharArray();
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
                            n17 = 41;
                            break;
                        }
                        case 1: {
                            n17 = 107;
                            break;
                        }
                        case 2: {
                            n17 = 8;
                            break;
                        }
                        case 3: {
                            n17 = 20;
                            break;
                        }
                        case 4: {
                            n17 = 5;
                            break;
                        }
                        case 5: {
                            n17 = 70;
                            break;
                        }
                        default: {
                            n17 = 62;
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

