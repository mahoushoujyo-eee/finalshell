/*
 * Decompiled with CFR 0.152.
 */
package com.I;

import com.I.w;
import com.I.x;
import com.cz_0;
import com.kp_0;
import com.ky_2;
import com.on_0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;
import javax.swing.ImageIcon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class P {
    public static final w N = new w();
    private String k;
    private x o;

    public P(x x10) {
        this.l(x10);
    }

    public String z() {
        return this.k;
    }

    public void o(String string) {
        this.k = string;
    }

    public x u() {
        return this.o;
    }

    public void l(x x10) {
        this.o = x10;
    }

    /*
     * Unable to fully structure code
     */
    public List h(x var1_1) {
        var2_2 = x.w();
        v0 = var1_1;
        if (var2_2 == null) ** GOTO lbl8
        if (v0 != null) {
            v1 = var1_1.G();
        } else {
            v0 = this.u();
lbl8:
            // 2 sources

            v1 = v0.G();
        }
        var3_3 = v1;
        Collections.sort(var3_3, P.N);
        return var3_3;
    }

    public x o(String string) {
        return this.D(string, this.u());
    }

    private x D(String string, x x10) {
        Iterator iterator = x10.G().iterator();
        int[] nArray = x.w();
        while (iterator.hasNext()) {
            block7: {
                x x11;
                block6: {
                    x x12;
                    x x13;
                    x x14 = x13 = (x)iterator.next();
                    if (nArray != null) {
                        if (cz_0.Z(x14.v()).equals(string)) {
                            return x13;
                        }
                        x14 = this.D(string, x13);
                    }
                    x11 = x12 = x14;
                    if (nArray == null) break block6;
                    if (x11 == null) break block7;
                    x11 = x12;
                }
                return x11;
            }
            if (nArray != null) continue;
        }
        return null;
    }

    public List f(String string) {
        return this.t(string.toLowerCase(), null);
    }

    public List t(String string, on_0 on_02) {
        return this.W(string.toLowerCase(), this.u(), on_02, new ArrayList());
    }

    private List W(String string, x x10, on_0 on_02, List list) {
        List list2;
        block6: {
            x x11;
            int[] nArray;
            block7: {
                block8: {
                    boolean bl;
                    block10: {
                        on_0 on_03;
                        block9: {
                            nArray = x.w();
                            x11 = x10;
                            if (nArray == null) break block7;
                            if (!x11.v().toLowerCase().contains(string)) break block8;
                            on_03 = on_02;
                            if (nArray == null) break block9;
                            if (on_03 == null) break block10;
                            on_03 = on_02;
                        }
                        bl = on_03.n(x10);
                        if (nArray == null || !bl) break block8;
                    }
                    bl = list.add(x10);
                }
                x11 = x10;
            }
            for (x x12 : x11.G()) {
                list2 = this.W(string, x12, on_02, list);
                if (nArray != null) {
                    if (nArray != null) continue;
                }
                break block6;
            }
            list2 = list;
        }
        return list2;
    }

    public x w(Class clazz) {
        String[] stringArray = kp_0.n(clazz);
        String string = kp_0.G(clazz);
        int[] nArray = x.w();
        int n10 = 0;
        x x10 = this.u();
        while (x10 != null) {
            block4: {
                block3: {
                    if (n10 >= stringArray.length) break block3;
                    x10 = x10.q(stringArray[n10]);
                    if (nArray != null) break block4;
                }
                x10 = x10.q(string);
                if (nArray != null) break;
            }
            ++n10;
            if (nArray != null) continue;
        }
        return x10;
    }

    public void W(Package package_, ImageIcon imageIcon) {
        this.I(package_.getName(), imageIcon);
    }

    public void I(String string, ImageIcon imageIcon) {
        x x10;
        block5: {
            String[] stringArray = kp_0.K(string);
            x x11 = this.u();
            String[] stringArray2 = stringArray;
            int n10 = stringArray2.length;
            int[] nArray = x.w();
            for (int i2 = 0; i2 < n10; ++i2) {
                block7: {
                    block6: {
                        String string2 = stringArray2[i2];
                        x10 = x11;
                        if (nArray == null) break block5;
                        if (nArray == null) break block6;
                        if (x10 == null) break block7;
                        x x12 = x11 = x11.q(string2);
                    }
                    if (nArray != null) continue;
                }
                return;
            }
            x10 = x11;
        }
        x10.n(imageIcon);
        if (ky_2.F() != null) {
            x.q(new int[2]);
        }
    }

    public void Q(Class clazz, ImageIcon imageIcon) {
        block3: {
            x x10;
            block2: {
                x x11 = this.w(clazz);
                int[] nArray = x.w();
                x10 = x11;
                if (nArray == null) break block2;
                if (x10 == null) break block3;
                x10 = x11;
            }
            x10.n(imageIcon);
        }
    }

    public InputStream w(x x10) throws IOException {
        return new ZipFile(this.z()).getInputStream(x10.H());
    }
}

