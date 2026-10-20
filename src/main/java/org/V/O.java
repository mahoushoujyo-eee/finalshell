/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.F.c;
import org.V.N;
import org.V.T;
import org.V.U;
import org.V.f;
import org.v.e_0;
import org.y.k;

class O
extends U {
    final ClassLoader u;
    private static final String b;

    O(ClassLoader classLoader) {
        this.u = classLoader;
    }

    @Override
    @c
    public N J(String string) {
        URL uRL;
        int[] nArray = f.h();
        String string2 = string;
        if (nArray == null && string2.startsWith("/")) {
            string2 = string = string.substring(1);
        }
        if ((uRL = this.u.getResource(string)) == null) {
            return null;
        }
        String string3 = string;
        return e_0.v(uRL, string3);
    }

    @Override
    @c
    public Iterable E(String string, boolean bl) throws IOException {
        Map map = k.D(this.u, string, false, bl);
        ArrayList<T> arrayList = new ArrayList<T>(map.size());
        Iterator iterator = map.entrySet().iterator();
        int[] nArray = f.h();
        while (iterator.hasNext()) {
            block4: {
                boolean bl2;
                Map.Entry entry = iterator.next();
                String string2 = (String)entry.getKey();
                URL uRL = (URL)entry.getValue();
                try {
                    bl2 = string2.endsWith(b);
                    if (nArray != null) break block4;
                    if (!bl2) {
                        continue;
                    }
                }
                catch (IOException iOException) {
                    throw O.a(iOException);
                }
                bl2 = arrayList.add(e_0.v(uRL, string2));
            }
            if (nArray == null) continue;
        }
        return arrayList;
    }

    private static IOException a(IOException iOException) {
        return iOException;
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
                char[] cArray3 = "\u001ao\u0010\u000b\u0012\u000b".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 123;
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
                            n17 = 79;
                            break;
                        }
                        case 1: {
                            n17 = 119;
                            break;
                        }
                        case 2: {
                            n17 = 7;
                            break;
                        }
                        case 3: {
                            n17 = 17;
                            break;
                        }
                        case 4: {
                            n17 = 26;
                            break;
                        }
                        case 5: {
                            n17 = 3;
                            break;
                        }
                        default: {
                            n17 = 1;
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
        b = new String(cArray).intern();
    }
}

