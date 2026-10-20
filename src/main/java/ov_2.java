/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from ov
 */
public class ov_2 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean i(String string) {
        int n10 = D5.K();
        String string2 = string;
        if (n10 != 0) {
            if (string2 == null) return true;
            string2 = string.trim();
        }
        boolean bl = string2.equals("");
        if (n10 == 0) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean G(Object[] objectArray) {
        int n10 = D5.K();
        Object[] objectArray2 = objectArray;
        if (n10 != 0) {
            if (objectArray2 == null) return true;
            objectArray2 = objectArray;
        }
        boolean bl = objectArray2.length;
        if (n10 == 0) return bl;
        if (bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean l(Collection collection) {
        int n10 = D5.K();
        Collection collection2 = collection;
        if (n10 != 0) {
            if (collection2 == null) return true;
            collection2 = collection;
        }
        boolean bl = collection2.size();
        if (n10 == 0) return bl;
        if (bl) return false;
        return true;
    }

    public static boolean m(Collection[] collectionArray) {
        boolean bl;
        block4: {
            Collection[] collectionArray2 = collectionArray;
            int n10 = D5.e();
            int n11 = collectionArray2.length;
            int n12 = 0;
            while (n12 < n11) {
                Collection collection = collectionArray2[n12];
                if (n10 == 0) {
                    bl = ov_2.l(collection);
                    if (n10 != 0) break block4;
                    if (!bl) {
                        return false;
                    }
                    ++n12;
                }
                if (n10 == 0) continue;
            }
            bl = true;
        }
        return bl;
    }

    public static boolean j(String[] stringArray) {
        boolean bl;
        block4: {
            String[] stringArray2 = stringArray;
            int n10 = stringArray2.length;
            int n11 = 0;
            int n12 = D5.e();
            while (n11 < n10) {
                String string = stringArray2[n11];
                if (n12 == 0) {
                    bl = ov_2.i(string);
                    if (n12 != 0) break block4;
                    if (!bl) {
                        return false;
                    }
                    ++n11;
                }
                if (n12 == 0) continue;
            }
            bl = true;
        }
        return bl;
    }

    public static boolean y(Collection[] collectionArray) {
        boolean bl;
        block4: {
            Collection[] collectionArray2 = collectionArray;
            int n10 = D5.K();
            int n11 = collectionArray2.length;
            int n12 = 0;
            while (n12 < n11) {
                Collection collection = collectionArray2[n12];
                if (n10 != 0) {
                    bl = ov_2.l(collection);
                    if (n10 == 0) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n12;
                }
                if (n10 != 0) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean l(String[] stringArray) {
        boolean bl;
        block4: {
            String[] stringArray2 = stringArray;
            int n10 = stringArray2.length;
            int n11 = D5.e();
            int n12 = 0;
            while (n12 < n10) {
                String string = stringArray2[n12];
                if (n11 == 0) {
                    bl = ov_2.i(string);
                    if (n11 != 0) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n12;
                }
                if (n11 == 0) continue;
            }
            bl = false;
        }
        return bl;
    }
}

