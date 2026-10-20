/*
 * Decompiled with CFR 0.152.
 */
package org.T;

import java.io.File;
import java.util.ArrayList;
import org.F.c;

public final class N {
    private static boolean G;

    private N() {
    }

    public static File[] H(String string) {
        int n10 = 0;
        boolean bl = N.m();
        ArrayList<File> arrayList = new ArrayList<File>();
        do {
            int n11;
            int n12;
            int n13;
            block7: {
                block5: {
                    block6: {
                        if ((n13 = string.indexOf(File.pathSeparatorChar, n10)) != -1) break block5;
                        int n14 = n10;
                        if (bl) break block6;
                        n12 = string.length();
                        if (bl) break block7;
                        if (n14 == n12) break;
                        n14 = arrayList.add(new File(string.substring(n10))) ? 1 : 0;
                    }
                    if (!bl) break;
                }
                n11 = n13;
                n12 = n10;
            }
            if (!bl) {
                if (n11 != n12) {
                    arrayList.add(new File(string.substring(n10, n13)));
                }
                n11 = n13;
                n12 = 1;
            }
            n10 = n11 + n12;
        } while (!bl);
        return arrayList.toArray(new File[arrayList.size()]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @c
    public static File[] U(@c String string) {
        boolean bl = N.m();
        String string2 = string;
        if (!bl) {
            if (string2 == null) {
                return null;
            }
            string2 = string;
        }
        File[] fileArray = N.H(string2);
        return fileArray;
    }

    public static void U(boolean bl) {
        G = bl;
    }

    public static boolean R() {
        return G;
    }

    public static boolean m() {
        boolean bl = N.R();
        return !bl;
    }

    static {
        if (N.m()) {
            N.U(true);
        }
    }
}

