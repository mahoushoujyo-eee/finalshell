/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nv_2;
import com.wy_2;
import java.util.Arrays;

/*
 * Renamed from com.Pf
 */
class pf_0
implements wy_2 {
    private String[] a;
    private String[] j;

    public pf_0(String[] stringArray, String[] stringArray2) {
        block6: {
            Object[] objectArray;
            block5: {
                String string = nv_2.o();
                String string2 = string;
                objectArray = stringArray;
                if (string2 != null) {
                    if (objectArray != null) {
                        this.a = new String[stringArray.length];
                        System.arraycopy(stringArray, 0, this.a, 0, stringArray.length);
                        Arrays.sort(this.a);
                    }
                    objectArray = stringArray2;
                }
                if (string2 == null) break block5;
                if (objectArray == null) break block6;
                this.j = new String[stringArray2.length];
                System.arraycopy(stringArray2, 0, this.j, 0, stringArray2.length);
                objectArray = this.j;
            }
            Arrays.sort(objectArray);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean F(String string) {
        String string2 = nv_2.o();
        Object[] objectArray = this.j;
        if (string2 != null) {
            if (objectArray != null) {
                boolean bl = Arrays.binarySearch(this.j, string);
                if (string2 == null) return bl;
                if (bl >= false) return false;
                return true;
            }
            objectArray = this.a;
        }
        if (string2 != null) {
            if (objectArray == null) return 0 != 0;
            objectArray = this.a;
        }
        int n10 = Arrays.binarySearch(objectArray, string);
        if (string2 == null) return n10 != 0;
        if (n10 < 0) return 0 != 0;
        return 1 != 0;
    }
}

