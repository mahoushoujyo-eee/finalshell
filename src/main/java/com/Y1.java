/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Y1 {
    public static List B(Object[] objectArray) {
        ArrayList arrayList = new ArrayList(objectArray.length);
        Collections.addAll(arrayList, objectArray);
        return arrayList;
    }

    public static boolean d(int n10, int[] nArray) {
        String string = FV.D();
        boolean bl = Y1.x(n10, nArray);
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    public static boolean z(long l2, long[] lArray) {
        String string = FV.D();
        boolean bl = Y1.a(l2, lArray);
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    public static boolean v(float f10, float[] fArray) {
        String string = FV.D();
        boolean bl = Y1.A(f10, fArray);
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    public static boolean f(double d2, double[] dArray) {
        String string = FV.D();
        boolean bl = Y1.N(d2, dArray);
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    public static boolean B(char c2, char[] cArray) {
        String string = FV.D();
        boolean bl = Y1.a(c2, cArray);
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    public static boolean C(byte by, byte[] byArray) {
        String string = FV.D();
        boolean bl = Y1.l(by, byArray);
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    public static boolean L(String string, String[] stringArray) {
        String string2 = FV.D();
        boolean bl = Y1.V(string, stringArray);
        if (string2 == null) {
            bl = !bl;
        }
        return bl;
    }

    public static boolean g(Object object, Object[] objectArray) {
        String string = FV.D();
        boolean bl = Y1.q(object, objectArray);
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    public static int x(int n10, int[] nArray) {
        int n11;
        block3: {
            String string = FV.D();
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                n11 = nArray[i2];
                if (string == null) {
                    int n12;
                    if (string == null) {
                        if (n11 != n10) continue;
                        n12 = i2;
                    }
                    return n12;
                }
                break block3;
            }
            n11 = -1;
        }
        return n11;
    }

    public static int a(long l2, long[] lArray) {
        int n10;
        block3: {
            String string = FV.D();
            for (int i2 = 0; i2 < lArray.length; ++i2) {
                long l3 = lArray[i2] - l2;
                n10 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                if (string == null) {
                    int n11;
                    if (string == null) {
                        if (n10 != 0) continue;
                        n11 = i2;
                    }
                    return n11;
                }
                break block3;
            }
            n10 = -1;
        }
        return n10;
    }

    public static int A(float f10, float[] fArray) {
        int n10;
        block3: {
            String string = FV.D();
            for (int i2 = 0; i2 < fArray.length; ++i2) {
                float f11 = fArray[i2] - f10;
                n10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                if (string == null) {
                    int n11;
                    if (string == null) {
                        if (n10 != 0) continue;
                        n11 = i2;
                    }
                    return n11;
                }
                break block3;
            }
            n10 = -1;
        }
        return n10;
    }

    public static int N(double d2, double[] dArray) {
        int n10;
        block3: {
            String string = FV.D();
            for (int i2 = 0; i2 < dArray.length; ++i2) {
                double d3 = dArray[i2] - d2;
                n10 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                if (string == null) {
                    int n11;
                    if (string == null) {
                        if (n10 != 0) continue;
                        n11 = i2;
                    }
                    return n11;
                }
                break block3;
            }
            n10 = -1;
        }
        return n10;
    }

    public static int a(char c2, char[] cArray) {
        char c3;
        block3: {
            String string = FV.D();
            for (int i2 = 0; i2 < cArray.length; ++i2) {
                c3 = cArray[i2];
                if (string == null) {
                    int n10;
                    if (string == null) {
                        if (c3 != c2) continue;
                        n10 = i2;
                    }
                    return n10;
                }
                break block3;
            }
            c3 = '\uffffffff';
        }
        return c3;
    }

    public static int l(byte by, byte[] byArray) {
        byte by2;
        block3: {
            String string = FV.D();
            for (int i2 = 0; i2 < byArray.length; ++i2) {
                by2 = byArray[i2];
                if (string == null) {
                    int n10;
                    if (string == null) {
                        if (by2 != by) continue;
                        n10 = i2;
                    }
                    return n10;
                }
                break block3;
            }
            by2 = -1;
        }
        return by2;
    }

    public static int V(String string, String[] stringArray) {
        return Y1.w(string, stringArray, false);
    }

    public static int w(String string, String[] stringArray, boolean n10) {
        String string2 = FV.D();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            int n11;
            block8: {
                block5: {
                    block6: {
                        String string3;
                        block7: {
                            String string4;
                            block3: {
                                block4: {
                                    string4 = string3 = stringArray[i2];
                                    if (string2 != null) break block3;
                                    if (string4 != null) break block4;
                                    string4 = string;
                                    if (string2 != null) break block3;
                                    if (string4 == null) break block5;
                                }
                                string4 = string3;
                            }
                            if (string2 == null) {
                                if (string4 == null) continue;
                                string4 = string;
                            }
                            if (string4 == null) continue;
                            n11 = n10;
                            if (string2 != null) break block6;
                            if (n11 == 0) break block7;
                            if (!string3.equalsIgnoreCase(string)) continue;
                            break block5;
                        }
                        n11 = string3.equals(string) ? 1 : 0;
                    }
                    if (string2 == null) {
                        if (n11 == 0) continue;
                    }
                    break block8;
                }
                n11 = i2;
            }
            return n11;
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int q(Object object, Object[] objectArray) {
        String string = FV.D();
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            int n10;
            block8: {
                Object object2;
                Object object3;
                block6: {
                    block7: {
                        object2 = object3 = objectArray[i2];
                        if (string != null) break block6;
                        if (object2 != null) break block7;
                        object2 = object;
                        if (string != null) break block6;
                        if (object2 == null) break block8;
                    }
                    object2 = object3;
                }
                if (string == null) {
                    if (object2 == null) continue;
                    object2 = object;
                }
                if (string == null) {
                    if (object2 == null) continue;
                    object2 = object3;
                }
                n10 = object2.equals(object) ? 1 : 0;
                if (string != null) return n10;
                if (n10 == 0) continue;
            }
            n10 = i2;
            return n10;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static Object[] E(Object[] objectArray, Object object) {
        Object[] objectArray2 = Y1.R(objectArray, objectArray.length - 1);
        int n10 = 0;
        String string = FV.D();
        int n11 = 0;
        do {
            block5: {
                block4: {
                    int n12;
                    Object[] objectArray3;
                    block3: {
                        if (n11 >= objectArray.length) return objectArray2;
                        if (n10 != 0) break block3;
                        objectArray3 = objectArray;
                        n12 = n11;
                        if (string != null) break block4;
                        if (objectArray3[n12] != object) break block3;
                        n10 = -1;
                        if (string == null) break block5;
                    }
                    objectArray3 = objectArray2;
                    n12 = n11 + n10;
                }
                objectArray3[n12] = objectArray[n11];
            }
            ++n11;
        } while (string == null);
        return objectArray2;
    }

    public static int[] e(int[] nArray, int n10) {
        int[] nArray2 = new int[nArray.length - 1];
        int n11 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            block4: {
                block3: {
                    int n12 = i2;
                    if (string != null) break block3;
                    if (n12 != n10) break block4;
                    n12 = n11 = -1;
                }
                if (string == null) continue;
            }
            nArray2[i2 + n11] = nArray[i2];
            if (string == null) continue;
        }
        return nArray2;
    }

    public static float[] k(float[] fArray, float f10) {
        float[] fArray2 = new float[fArray.length - 1];
        int n10 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            block4: {
                block3: {
                    float f11 = (float)i2 - f10;
                    float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (string != null) break block3;
                    if (f12 != false) break block4;
                    n10 = (int)((float)-1);
                    f12 = n10;
                }
                if (string == null) continue;
            }
            fArray2[i2 + n10] = fArray[i2];
            if (string == null) continue;
        }
        return fArray2;
    }

    public static double[] A(double[] dArray, double d2) {
        double[] dArray2 = new double[dArray.length - 1];
        int n10 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < dArray.length; ++i2) {
            block4: {
                block3: {
                    double d3 = (double)i2 - d2;
                    double d4 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                    if (string != null) break block3;
                    if (d4 != false) break block4;
                    n10 = (int)((double)-1);
                    d4 = n10;
                }
                if (string == null) continue;
            }
            dArray2[i2 + n10] = dArray[i2];
            if (string == null) continue;
        }
        return dArray2;
    }

    public static char[] h(char[] cArray, char c2) {
        char[] cArray2 = new char[cArray.length - 1];
        int n10 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            block4: {
                block3: {
                    int n11 = i2;
                    if (string != null) break block3;
                    if (n11 != c2) break block4;
                    n11 = n10 = -1;
                }
                if (string == null) continue;
            }
            cArray2[i2 + n10] = cArray[i2];
            if (string == null) continue;
        }
        return cArray2;
    }

    public static byte[] F(byte[] byArray, byte by) {
        byte[] byArray2 = new byte[byArray.length - 1];
        int n10 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            block4: {
                block3: {
                    int n11 = i2;
                    if (string != null) break block3;
                    if (n11 != by) break block4;
                    n11 = n10 = -1;
                }
                if (string == null) continue;
            }
            byArray2[i2 + n10] = byArray[i2];
            if (string == null) continue;
        }
        return byArray2;
    }

    public static boolean[] i(boolean[] blArray, int n10) {
        boolean[] blArray2 = new boolean[blArray.length - 1];
        int n11 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < blArray.length; ++i2) {
            block4: {
                block3: {
                    int n12 = i2;
                    if (string != null) break block3;
                    if (n12 != n10) break block4;
                    n12 = n11 = -1;
                }
                if (string == null) continue;
            }
            blArray2[i2 + n11] = blArray[i2];
            if (string == null) continue;
        }
        return blArray2;
    }

    public static Object[] X(Object[] objectArray, int n10) {
        Object[] objectArray2 = Y1.R(objectArray, objectArray.length - 1);
        int n11 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            block4: {
                block3: {
                    int n12 = i2;
                    if (string != null) break block3;
                    if (n12 != n10) break block4;
                    n12 = n11 = -1;
                }
                if (string == null) continue;
            }
            objectArray2[i2 + n11] = objectArray[i2];
            if (string == null) continue;
        }
        return objectArray2;
    }

    public static int[] C(int[] nArray, int n10, int n11) {
        int[] nArray2 = new int[nArray.length + 1];
        int n12 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            block4: {
                int n13;
                block3: {
                    n13 = i2;
                    if (string != null) break block3;
                    if (n13 != n10) break block4;
                    nArray2[i2] = n11;
                    n13 = 1;
                }
                n12 = n13;
            }
            nArray2[i2 + n12] = nArray[i2];
            if (string == null) continue;
        }
        return nArray2;
    }

    public static float[] g(float[] fArray, int n10, float f10) {
        float[] fArray2 = new float[fArray.length + 1];
        int n11 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            block4: {
                int n12;
                block3: {
                    n12 = i2;
                    if (string != null) break block3;
                    if (n12 != n10) break block4;
                    fArray2[i2] = f10;
                    n12 = 1;
                }
                n11 = n12;
            }
            fArray2[i2 + n11] = fArray[i2];
            if (string == null) continue;
        }
        return fArray2;
    }

    public static double[] I(double[] dArray, int n10, double d2) {
        double[] dArray2 = new double[dArray.length + 1];
        int n11 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < dArray.length; ++i2) {
            block4: {
                int n12;
                block3: {
                    n12 = i2;
                    if (string != null) break block3;
                    if (n12 != n10) break block4;
                    dArray2[i2] = d2;
                    n12 = 1;
                }
                n11 = n12;
            }
            dArray2[i2 + n11] = dArray[i2];
            if (string == null) continue;
        }
        return dArray2;
    }

    public static char[] a(char[] cArray, int n10, char c2) {
        char[] cArray2 = new char[cArray.length + 1];
        int n11 = 0;
        String string = FV.D();
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            block4: {
                int n12;
                block3: {
                    n12 = i2;
                    if (string != null) break block3;
                    if (n12 != n10) break block4;
                    cArray2[i2] = c2;
                    n12 = 1;
                }
                n11 = n12;
            }
            cArray2[i2 + n11] = cArray[i2];
            if (string == null) continue;
        }
        return cArray2;
    }

    public static byte[] L(byte[] byArray, int n10, byte by) {
        byte[] byArray2 = new byte[byArray.length + 1];
        String string = FV.D();
        int n11 = 0;
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            block4: {
                int n12;
                block3: {
                    n12 = i2;
                    if (string != null) break block3;
                    if (n12 != n10) break block4;
                    byArray2[i2] = by;
                    n12 = 1;
                }
                n11 = n12;
            }
            byArray2[i2 + n11] = byArray[i2];
            if (string == null) continue;
        }
        return byArray2;
    }

    public static boolean[] W(boolean[] blArray, int n10, boolean bl) {
        boolean[] blArray2 = new boolean[blArray.length + 1];
        String string = FV.D();
        int n11 = 0;
        for (int i2 = 0; i2 < blArray.length; ++i2) {
            block4: {
                int n12;
                block3: {
                    n12 = i2;
                    if (string != null) break block3;
                    if (n12 != n10) break block4;
                    blArray2[i2] = bl;
                    n12 = 1;
                }
                n11 = n12;
            }
            blArray2[i2 + n11] = blArray[i2];
            if (string == null) continue;
        }
        return blArray2;
    }

    public static Object[] a(Object[] objectArray, int n10, Object object) {
        Object[] objectArray2 = Y1.R(objectArray, objectArray.length + 1);
        String string = FV.D();
        int n11 = 0;
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            block4: {
                int n12;
                block3: {
                    n12 = i2;
                    if (string != null) break block3;
                    if (n12 != n10) break block4;
                    objectArray2[i2] = object;
                    n12 = 1;
                }
                n11 = n12;
            }
            objectArray2[i2 + n11] = objectArray[i2];
            if (string == null) continue;
        }
        return objectArray2;
    }

    public static Object[] R(Object[] objectArray, int n10) {
        return Y1.T(objectArray.getClass().getComponentType(), n10);
    }

    public static Object[] T(Class clazz, int n10) {
        return (Object[])Array.newInstance(clazz, n10);
    }
}

