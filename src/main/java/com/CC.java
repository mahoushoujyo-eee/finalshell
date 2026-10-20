/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import com.G0;
import com.K3;
import com.WC;
import com.XR;
import com._Q;
import com.co_0;
import com.er_1;
import com.ii_2;
import com.iu_2;
import com.ol_2;
import com.ws_2;
import java.util.List;
import javax.swing.ListCellRenderer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CC
extends CI {
    protected boolean h = G0.n;
    private static final String a;
    private static final long b;

    public CC() {
        this(new er_1());
    }

    public CC(er_1 er_12) {
        this.setModel(er_12);
        this.setCellRenderer(new ii_2());
        this.addMouseListener(new ol_2(this));
        this.addKeyListener(new XR(this));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ii_2 A() {
        ListCellRenderer listCellRenderer = this.getCellRenderer();
        String string = co_0.U();
        ListCellRenderer listCellRenderer2 = listCellRenderer;
        if (string != null) {
            if (!(listCellRenderer2 instanceof ii_2)) return null;
            listCellRenderer2 = listCellRenderer;
        }
        ii_2 ii_22 = (ii_2)listCellRenderer2;
        return ii_22;
    }

    @Override
    public er_1 A() {
        return (er_1)this.getModel();
    }

    @Override
    protected K3 O() {
        return new ws_2();
    }

    public boolean q(int n10) {
        return this.A().o(n10);
    }

    public void x(int n10) {
        this.A().Y(n10);
        this.Y(n10);
    }

    public void h(int n10, boolean bl) {
        block3: {
            CC cC;
            block2: {
                String string = co_0.U();
                cC = this;
                if (string == null) break block2;
                if (!cC.A().Z(n10, bl)) break block3;
                cC = this;
            }
            cC.Y(n10);
        }
    }

    public List R() {
        return this.A().a();
    }

    protected void Y(int n10) {
        block4: {
            block3: {
                String string;
                block2: {
                    string = co_0.U();
                    if (string == null) break block2;
                    if (!_Q.v) break block3;
                    WC.s(a, b, new iu_2(this, n10));
                }
                if (string != null) break block4;
            }
            this.repaint(this.getCellBounds(n10, n10));
        }
    }

    public boolean w() {
        return this.h;
    }

    public void q(boolean bl) {
        this.h = bl;
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
                char[] cArray3 = "S\u001c]\u000f\u001e\u0002`o;P4:\u000eppW^\"\u001f\nbp\u0016M".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 88;
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
                            n17 = 92;
                            break;
                        }
                        case 1: {
                            n17 = 33;
                            break;
                        }
                        case 2: {
                            n17 = 103;
                            break;
                        }
                        case 3: {
                            n17 = 20;
                            break;
                        }
                        case 4: {
                            n17 = 46;
                            break;
                        }
                        case 5: {
                            n17 = 63;
                            break;
                        }
                        default: {
                            n17 = 91;
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
        a = new String(cArray).intern();
        long l2 = 434241459707055769L;
        b = 0x606BC4E90960EB1L ^ l2;
    }
}

