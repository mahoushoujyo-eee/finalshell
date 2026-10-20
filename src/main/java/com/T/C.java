/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.L;
import com.t.W;
import com.t.n_0;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C
extends MouseAdapter {
    private boolean l;
    final L w;
    private static final long[] a;
    private static final Integer[] b;

    private C(L l2) {
        this.w = l2;
        this.l = false;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.l = true;
        L.R(this.w, true);
        this.b(mouseEvent.getPoint());
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        this.b(mouseEvent.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block3: {
            L l2;
            block2: {
                this.l = false;
                int n10 = n_0.g();
                L.R(this.w, false);
                l2 = this.w;
                if (n10 != 0) break block2;
                if (L.N(l2).getVisibleRect().contains(mouseEvent.getPoint())) break block3;
                l2 = this.w;
            }
            l2.setCursor(Cursor.getDefaultCursor());
        }
    }

    private void b(Point point) {
        L l2;
        block15: {
            block14: {
                int n10;
                int n11;
                block12: {
                    int n12;
                    block13: {
                        block11: {
                            block10: {
                                block8: {
                                    block9: {
                                        int n13 = n_0.W();
                                        L.u(this.w, point);
                                        n12 = n13;
                                        n11 = L.H((L)this.w).x;
                                        n10 = 2;
                                        if (n12 == 0) break block8;
                                        if (n11 >= n10) break block9;
                                        L.H((L)this.w).x = 2;
                                        if (n12 != 0) break block10;
                                    }
                                    n11 = L.H((L)this.w).x;
                                    n10 = C.a(16814, 2416795011955695764L);
                                }
                                if (n12 == 0) break block11;
                                if (n11 > n10) {
                                    L.H((L)this.w).x = C.a(22101, 6800546665711974254L);
                                }
                            }
                            n11 = L.H((L)this.w).y;
                            n10 = 2;
                        }
                        if (n12 == 0) break block12;
                        if (n11 >= n10) break block13;
                        L.H((L)this.w).y = 2;
                        if (n12 != 0) break block14;
                    }
                    l2 = this.w;
                    if (n12 == 0) break block15;
                    n11 = L.H((L)l2).y;
                    n10 = C.a(22101, 6800546665711974254L);
                }
                if (n11 > n10) {
                    L.H((L)this.w).y = C.a(22101, 6800546665711974254L);
                }
            }
            l2 = this.w;
        }
        l2.p(L.l(this.w).X(L.H((L)this.w).x, L.H((L)this.w).y));
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.w.setCursor(L.z(this.w));
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        block3: {
            C c2;
            block2: {
                int n10 = n_0.g();
                c2 = this;
                if (n10 != 0) break block2;
                if (c2.l) break block3;
                c2 = this;
            }
            c2.w.setCursor(Cursor.getDefaultCursor());
        }
    }

    C(L l2, W w2) {
        this(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 574130379787635079L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "U\u0093s+\u00e8\u008e\u00a8\u0011\u00c5\u00d7v\u00aa\u00be:?\u00eb";
        int n11 = "U\u0093s+\u00e8\u008e\u00a8\u0011\u00c5\u00d7v\u00aa\u00be:?\u00eb".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x613A;
        if (b[n11] == null) {
            C.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

