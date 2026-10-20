/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.WC;
import com.a.y_0;
import com.ds_0;
import com.gw_0;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DO
extends y_0
implements ActionListener,
WindowFocusListener,
WindowListener {
    private float F = 0.9f;
    private float f = 0.3f;
    private int w = (int)c;
    private float z = 1.0f;
    private WC T = new WC(b, GO.L, (ActionListener)this);
    private static final String b;
    private static final long c;

    public DO() {
        this.addWindowFocusListener(this);
        this.addWindowListener(this);
    }

    public float E() {
        return this.F;
    }

    public void c(float f10) {
        this.F = f10;
    }

    public float v() {
        return this.f;
    }

    public void r(float f10) {
        this.f = f10;
    }

    public int g() {
        return this.w;
    }

    public void G(int n10) {
        this.w = n10;
    }

    @Override
    public void windowGainedFocus(WindowEvent windowEvent) {
        this.T.Y();
        this.z = this.F;
        this.g();
    }

    @Override
    public void windowLostFocus(WindowEvent windowEvent) {
        block3: {
            DO dO;
            block2: {
                int[] nArray = ds_0.U();
                dO = this;
                if (nArray != null) break block2;
                if (!dO.isShowing()) break block3;
                dO = this;
            }
            dO.T.u();
        }
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        this.T.Y();
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        float f10;
        block27: {
            DO dO;
            block7: {
                block8: {
                    int[] nArray;
                    block11: {
                        int n10;
                        block16: {
                            int n11;
                            int n12;
                            block25: {
                                Rectangle rectangle;
                                Point point;
                                block26: {
                                    block23: {
                                        block24: {
                                            block19: {
                                                block20: {
                                                    int n13;
                                                    int n14;
                                                    block21: {
                                                        block22: {
                                                            block12: {
                                                                block13: {
                                                                    int n15;
                                                                    int n16;
                                                                    block17: {
                                                                        block18: {
                                                                            block14: {
                                                                                block15: {
                                                                                    block9: {
                                                                                        block10: {
                                                                                            nArray = ds_0.U();
                                                                                            dO = this;
                                                                                            if (nArray != null) break block7;
                                                                                            if (dO.isActive()) break block8;
                                                                                            point = MouseInfo.getPointerInfo().getLocation();
                                                                                            rectangle = this.getBounds();
                                                                                            n12 = rectangle.contains(point);
                                                                                            if (nArray != null) break block9;
                                                                                            if (n12 == 0) break block10;
                                                                                            f10 = this.F;
                                                                                            if (nArray == null) break block11;
                                                                                        }
                                                                                        n12 = point.y;
                                                                                    }
                                                                                    n11 = rectangle.y;
                                                                                    if (nArray != null) break block12;
                                                                                    if (n12 >= n11) break block13;
                                                                                    n16 = point.x;
                                                                                    n15 = rectangle.x;
                                                                                    if (nArray != null) break block14;
                                                                                    if (n16 >= n15) break block15;
                                                                                    n10 = this.w - gw_0.t((double)(gw_0.t(rectangle.y - point.y) + gw_0.t(rectangle.x - point.x)));
                                                                                    if (nArray == null) break block16;
                                                                                }
                                                                                n16 = point.x;
                                                                                n15 = rectangle.x + rectangle.width;
                                                                            }
                                                                            if (nArray != null) break block17;
                                                                            if (n16 <= n15) break block18;
                                                                            n10 = this.w - gw_0.t((double)(gw_0.t(rectangle.y - point.y) + gw_0.t(point.x - rectangle.x - rectangle.width)));
                                                                            if (nArray == null) break block16;
                                                                        }
                                                                        n16 = this.w;
                                                                        n15 = rectangle.y - point.y;
                                                                    }
                                                                    n10 = n16 - n15;
                                                                    if (nArray == null) break block16;
                                                                }
                                                                n12 = point.y;
                                                                n11 = rectangle.y;
                                                            }
                                                            if (nArray != null) break block19;
                                                            if (n12 <= n11) break block20;
                                                            n12 = point.y;
                                                            n11 = rectangle.y + rectangle.height;
                                                            if (nArray != null) break block19;
                                                            if (n12 >= n11) break block20;
                                                            n14 = point.x;
                                                            n13 = rectangle.x;
                                                            if (nArray != null) break block21;
                                                            if (n14 >= n13) break block22;
                                                            n10 = this.w - (rectangle.x - point.x);
                                                            if (nArray == null) break block16;
                                                        }
                                                        n14 = this.w;
                                                        n13 = point.x - rectangle.x - rectangle.width;
                                                    }
                                                    n10 = n14 - n13;
                                                    if (nArray == null) break block16;
                                                }
                                                n12 = point.x;
                                                n11 = rectangle.x;
                                            }
                                            if (nArray != null) break block23;
                                            if (n12 >= n11) break block24;
                                            n10 = this.w - gw_0.t((double)(gw_0.t(point.y - rectangle.y - rectangle.height) + gw_0.t(rectangle.x - point.x)));
                                            if (nArray == null) break block16;
                                        }
                                        n12 = point.x;
                                        n11 = rectangle.x + rectangle.width;
                                    }
                                    if (nArray != null) break block25;
                                    if (n12 <= n11) break block26;
                                    n10 = this.w - gw_0.t((double)(gw_0.t(point.y - rectangle.y - rectangle.height) + gw_0.t(point.x - rectangle.x - rectangle.width)));
                                    if (nArray == null) break block16;
                                }
                                n12 = this.w;
                                n11 = point.y - rectangle.y - rectangle.height;
                            }
                            n10 = n12 - n11;
                        }
                        f10 = this.f + (this.F - this.f) * ((float)Math.max(0, n10) / (float)this.w);
                    }
                    if (nArray == null) break block27;
                }
                dO = this;
            }
            f10 = dO.F;
        }
        if (f10 != this.z) {
            this.z = f10;
            this.g();
        }
    }

    private void g() {
        this.v(this.z);
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
                char[] cArray3 = ")\u0006WuB~\\:\nT_L}\u0017\u000b\u0013QRW\u007fK".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 19;
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
                            n17 = 109;
                            break;
                        }
                        case 1: {
                            n17 = 112;
                            break;
                        }
                        case 2: {
                            n17 = 38;
                            break;
                        }
                        case 3: {
                            n17 = 32;
                            break;
                        }
                        case 4: {
                            n17 = 48;
                            break;
                        }
                        case 5: {
                            n17 = 9;
                            break;
                        }
                        default: {
                            n17 = 42;
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
        long l2 = 5353804280115467894L;
        c = 0x61B4C782893F96BEL ^ l2;
    }
}

