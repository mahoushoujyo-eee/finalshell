/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.Comparator;

/*
 * Renamed from Bl
 */
public class bl_0
implements Comparator {
    public int O(nD nD2, nD nD3) {
        int n10;
        block9: {
            int n11;
            block6: {
                ky_2[] ky_2Array;
                block12: {
                    float f10;
                    float f11;
                    block13: {
                        block10: {
                            block11: {
                                int n12;
                                block7: {
                                    int n13;
                                    int n14;
                                    block8: {
                                        block4: {
                                            block5: {
                                                n11 = 0;
                                                ky_2Array = a6.P();
                                                f11 = 1.0f - nD3.k.g;
                                                f10 = 1.0f - nD2.k.g;
                                                n14 = nD3.k.t;
                                                n13 = nD2.k.t;
                                                n10 = n14;
                                                n12 = n13;
                                                if (ky_2Array == null) break block4;
                                                if (n10 >= n12) break block5;
                                                n11 = 1;
                                                if (ky_2Array != null) break block6;
                                            }
                                            n10 = n14;
                                            n12 = n13;
                                        }
                                        if (ky_2Array == null) break block7;
                                        if (n10 <= n12) break block8;
                                        n11 = -1;
                                        if (ky_2Array != null) break block6;
                                    }
                                    n10 = n14;
                                    if (ky_2Array == null) break block9;
                                    n12 = n13;
                                }
                                if (n10 != n12) break block6;
                                n10 = f11 == f10 ? 0 : (f11 < f10 ? -1 : 1);
                                if (ky_2Array == null) break block10;
                                if (n10 >= 0) break block11;
                                n11 = 1;
                                if (ky_2Array != null) break block6;
                            }
                            n10 = f11 == f10 ? 0 : (f11 > f10 ? 1 : -1);
                        }
                        if (ky_2Array == null) break block12;
                        if (n10 <= 0) break block13;
                        n11 = -1;
                        if (ky_2Array != null) break block6;
                    }
                    n10 = f11 == f10 ? 0 : (f11 > f10 ? 1 : -1);
                }
                if (ky_2Array == null) break block9;
                if (n10 == 0) {
                    n11 = 0;
                }
            }
            n10 = n11;
        }
        return n10;
    }

    public int compare(Object object, Object object2) {
        return this.O((nD)object, (nD)object2);
    }
}

