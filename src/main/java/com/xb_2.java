/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DE;
import com.FU;
import com.PU;
import com.co_0;
import com.cz_0;
import com.oq_1;
import com.wo_2;
import com.xg_0;
import java.awt.Dimension;
import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.xb
 */
public class xb_2
implements Runnable {
    protected static final ExecutorService Q;
    protected static final Map H;
    protected static final Object z;
    private final co_0 W;
    private final wo_2 g;
    private final boolean t;
    private boolean L;
    private static final long[] a;
    private static final Integer[] b;

    public xb_2(co_0 co_02, wo_2 wo_22, boolean bl) {
        this.W = co_02;
        this.g = wo_22;
        this.t = bl;
        this.L = false;
    }

    public co_0 k() {
        return this.W;
    }

    public wo_2 J() {
        return this.g;
    }

    public boolean g() {
        return this.t;
    }

    public boolean s() {
        return this.L;
    }

    public void P() {
        this.L = true;
    }

    @Override
    public void run() {
        xb_2 xb_22;
        block8: {
            boolean bl;
            block7: {
                String string = co_0.U();
                bl = this.L;
                if (string != null) {
                    if (bl) {
                        this.J();
                        return;
                    }
                    this.v(this.g.T(), this.W.R());
                    bl = this.L;
                }
                if (string == null) break block7;
                if (bl) {
                    this.J();
                    return;
                }
                SwingUtilities.invokeLater(new FU(this));
                xb_22 = this;
                if (string == null) break block8;
                bl = xb_22.L;
            }
            if (bl) {
                this.J();
                return;
            }
            xb_22 = this;
        }
        xb_22.J();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void J() {
        Object object = z;
        synchronized (object) {
            String string = co_0.U();
            xb_2 xb_22 = (xb_2)H.get(this.g);
            Object object2 = xb_22;
            if (string != null) {
                if (object2 == this) {
                    Object object3 = this.g.S();
                    synchronized (object3) {
                        this.g.F(false);
                        this.g.y(false);
                    }
                    H.remove(this.g);
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    private void v(File file, boolean bl) {
        block12: {
            block8: {
                String string;
                block11: {
                    block10: {
                        block9: {
                            ImageIcon imageIcon;
                            oq_1 oq_12;
                            oq_1 oq_13;
                            block7: {
                                oq_13 = this.W.p();
                                string = co_0.U();
                                oq_12 = oq_13;
                                if (string == null) break block7;
                                if (oq_12 == null) break block8;
                                oq_12 = oq_13;
                            }
                            if (!oq_12.accept(file)) break block8;
                            Dimension dimension = new Dimension(xb_2.a(7878, 3744201369438838872L), xb_2.a(7878, 3744201369438838872L));
                            ImageIcon imageIcon2 = this.g.k();
                            if (string != null) {
                                imageIcon2 = imageIcon = imageIcon2 != null ? this.g.k() : oq_13.Y(file, dimension, bl);
                            }
                            if (string == null) break block9;
                            if (imageIcon == null) break block10;
                            this.z(imageIcon);
                        }
                        if (string != null) break block11;
                    }
                    this.G(file, bl);
                }
                if (string != null) break block12;
            }
            this.G(file, bl);
        }
    }

    private void G(File file, boolean bl) {
        block12: {
            block8: {
                String string;
                block11: {
                    block10: {
                        block9: {
                            ImageIcon imageIcon;
                            boolean bl2;
                            block7: {
                                String string2 = cz_0.G(file.getName(), false).toLowerCase();
                                string = co_0.U();
                                bl2 = bl;
                                if (string == null) break block7;
                                if (!bl2) break block8;
                                bl2 = DE.o.contains(string2);
                            }
                            if (!bl2) break block8;
                            ImageIcon imageIcon2 = this.g.k();
                            if (string != null) {
                                imageIcon2 = imageIcon = imageIcon2 != null ? this.g.k() : xg_0.l(file.getAbsolutePath(), xb_2.a(11701, 7336052200513950506L));
                            }
                            if (string == null) break block9;
                            if (imageIcon == null) break block10;
                            this.z(imageIcon);
                        }
                        if (string != null) break block11;
                    }
                    this.p(file);
                }
                if (string != null) break block12;
            }
            this.p(file);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void z(ImageIcon imageIcon) {
        String string = co_0.U();
        Object object = this;
        if (string != null) {
            if (((xb_2)object).L) {
                return;
            }
            object = this.g.S();
        }
        Object object2 = object;
        synchronized (object) {
            block13: {
                wo_2 wo_22;
                block15: {
                    boolean bl;
                    block14: {
                        Object object3 = this.g;
                        if (string != null) {
                            if (((wo_2)object3).Y()) {
                                this.g.U(imageIcon);
                            }
                            object3 = object2;
                        }
                        // ** MonitorExit[v1] (shouldn't be in output)
                        boolean bl2 = this.L;
                        if (string != null) {
                            if (bl2) {
                                return;
                            }
                            bl2 = this.t;
                        }
                        if (!bl2) break block13;
                        object2 = xg_0.J(imageIcon);
                        bl = this.L;
                        if (string == null) break block14;
                        if (bl) {
                            return;
                        }
                        wo_22 = this.g;
                        if (string == null) break block15;
                        bl = wo_22.Z();
                    }
                    if (!bl) break block13;
                    wo_22 = this.g;
                }
                wo_22.C((ImageIcon)object2);
            }
            return;
        }
    }

    private void p(File file) {
        block11: {
            wo_2 wo_22;
            ImageIcon imageIcon;
            block13: {
                boolean bl;
                block12: {
                    String string = co_0.U();
                    if (this.L) {
                        return;
                    }
                    ImageIcon imageIcon2 = cz_0.a(file, true, true);
                    boolean bl2 = this.L;
                    if (string != null) {
                        if (bl2) {
                            return;
                        }
                        bl2 = this.g.Y();
                    }
                    if (string != null) {
                        if (bl2) {
                            this.g.U(imageIcon2);
                        }
                        bl2 = this.L;
                    }
                    if (string != null) {
                        if (bl2) {
                            return;
                        }
                        bl2 = this.t;
                    }
                    if (!bl2) break block11;
                    imageIcon = cz_0.a(file, true, false);
                    bl = this.L;
                    if (string == null) break block12;
                    if (bl) {
                        return;
                    }
                    wo_22 = this.g;
                    if (string == null) break block13;
                    bl = wo_22.Z();
                }
                if (!bl) break block11;
                wo_22 = this.g;
            }
            wo_22.C(imageIcon);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void r(co_0 co_02, wo_2 wo_22, boolean bl) {
        Object object = wo_22.S();
        synchronized (object) {
            wo_22.F(true);
            wo_22.y(bl);
        }
        object = z;
        synchronized (object) {
            xb_2 xb_22 = new xb_2(co_02, wo_22, bl);
            H.put(wo_22, xb_22);
            Q.submit(xb_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void G(wo_2 wo_22) {
        Object object = z;
        synchronized (object) {
            String string = co_0.U();
            xb_2 xb_22 = (xb_2)H.get(wo_22);
            Object object2 = xb_22;
            if (string != null) {
                if (object2 != null) {
                    xb_22.P();
                }
                object2 = wo_22.S();
            }
            xb_2 xb_23 = object2;
            synchronized (object2) {
                wo_22.U(null);
                wo_22.F(false);
                wo_22.C(null);
                wo_22.y(false);
                // ** MonitorExit[var4_4] (shouldn't be in output)
            }
        }
    }

    static wo_2 z(xb_2 xb_22) {
        return xb_22.g;
    }

    static co_0 X(xb_2 xb_22) {
        return xb_22.W;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2092753370335783284L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00b1B\u007fJ\u0080\u0006\u00fal\u00d7\u008f\u0095\u0095\u00e9\u00b3I\u001e";
        int n11 = "\u00b1B\u007fJ\u0080\u0006\u00fal\u00d7\u008f\u0095\u0095\u00e9\u00b3I\u001e".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
        Q = Executors.newSingleThreadExecutor(new PU());
        H = new WeakHashMap();
        z = new Object();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7E9F;
        if (b[n11] == null) {
            xb_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

