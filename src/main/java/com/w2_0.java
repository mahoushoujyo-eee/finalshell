/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G6;
import com.OQ;
import com.co_0;
import com.cz_0;
import com.ep_1;
import com.ne_2;
import com.wo_1;
import com.wo_2;
import com.wx_2;
import com.xo_2;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;
import javax.swing.JList;

/*
 * Renamed from com.w2
 */
public class w2_0
extends wo_1 {
    protected Object t = null;

    @Override
    protected void W(JList jList) {
        this.Q = new xo_2(this, jList);
        jList.addKeyListener(this.Q);
    }

    @Override
    protected void H(JList jList) {
        jList.removeKeyListener(this.Q);
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean E(JList var1_1, int var2_2, wo_2 var3_3) {
        var4_4 = co_0.U();
        v0 = var3_3;
        if (var4_4 == null) ** GOTO lbl6
        if (v0 != null) {
            v0 = var3_3;
lbl6:
            // 2 sources

            v1 = v0.T();
        } else {
            v1 = null;
        }
        v2 = var5_5 = v1;
        if (var4_4 != null) {
            if (v2 == null) return false;
            v2 = var5_5;
        }
        v3 = cz_0.J(v2);
        if (var4_4 != null) {
            if (v3 == false) return false;
            v3 = super.T(var1_1, var2_2, var3_3);
        }
        if (var4_4 == null) return v3;
        if (v3 == false) return false;
        return true;
    }

    protected ne_2 r(JList jList, int n10, wo_2 wo_22) {
        ne_2 ne_22 = ne_2.r(true, wx_2.n, wx_2.y);
        String string = co_0.U();
        ne_22.c(false);
        String string2 = string;
        ne_2 ne_23 = ne_22;
        if (string2 != null) {
            cz_0.D(ne_23, wo_22.T());
            if (jList instanceof co_0) {
                int n11;
                int n12 = n11 = ((co_0)jList).Q().equals((Object)G6.tiles);
                if (string2 != null) {
                    n12 = n12 != 0 ? 2 : 0;
                }
                ne_22.setHorizontalAlignment(n12);
            }
            ne_23 = ne_22;
        }
        return ne_23;
    }

    protected Rectangle U(JList jList, int n10, wo_2 wo_22, Rectangle rectangle) {
        block3: {
            JList jList2;
            block2: {
                String string = co_0.U();
                jList2 = jList;
                if (string == null) break block2;
                if (!(jList2 instanceof co_0)) break block3;
                jList2 = jList;
            }
            OQ oQ = ((co_0)jList2).l();
            Rectangle rectangle2 = oQ.C();
            Dimension dimension = ((ne_2)this.d).getPreferredSize();
            return new Rectangle(rectangle2.x, rectangle2.y + rectangle2.height / 2 - dimension.height / 2, rectangle2.width, dimension.height);
        }
        return super.O(jList, n10, wo_22, rectangle);
    }

    public wo_2 e(JList jList, int n10, wo_2 wo_22) {
        wo_2 wo_23;
        block2: {
            block3: {
                File file;
                block5: {
                    block4: {
                        this.t = jList.getSelectedValue();
                        file = new File(wo_22.T().getParent(), ((ne_2)this.d).getText());
                        String string = co_0.U();
                        wo_23 = wo_22;
                        if (string == null) break block2;
                        if (!wo_23.T().renameTo(file)) break block3;
                        w2_0 w2_02 = this;
                        if (string == null) break block4;
                        if (w2_02.t != wo_22) break block5;
                        w2_02 = this;
                    }
                    w2_02.t = file;
                }
                return new wo_2(file);
            }
            wo_23 = wo_22;
        }
        return wo_23;
    }

    public boolean L(JList jList, int n10, wo_2 wo_22, wo_2 wo_23, boolean bl) {
        boolean bl2;
        block2: {
            block3: {
                boolean bl3;
                block4: {
                    block5: {
                        block8: {
                            block7: {
                                String string;
                                block6: {
                                    string = co_0.U();
                                    bl2 = jList.getModel() instanceof ep_1;
                                    if (string == null) break block2;
                                    if (!bl2) break block3;
                                    ep_1 ep_12 = (ep_1)jList.getModel();
                                    bl3 = wo_22.T().getAbsolutePath().equals(wo_23.T().getAbsolutePath());
                                    if (string == null) break block4;
                                    if (bl3) break block5;
                                    ep_12.X(wo_23, n10);
                                    if (string == null) break block6;
                                    if (this.t == null) break block7;
                                    jList.setSelectedValue(this.t, true);
                                }
                                if (string != null) break block8;
                            }
                            jList.clearSelection();
                        }
                        jList.repaint();
                        return true;
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = super.U(jList, n10, wo_22, wo_23, bl);
        }
        return bl2;
    }

    @Override
    public boolean U(JList jList, int n10, Object object, Object object2, boolean bl) {
        return this.L(jList, n10, (wo_2)object, (wo_2)object2, bl);
    }

    @Override
    protected Rectangle O(JList jList, int n10, Object object, Rectangle rectangle) {
        return this.U(jList, n10, (wo_2)object, rectangle);
    }

    @Override
    protected Component j(JList jList, int n10, Object object) {
        return this.r(jList, n10, (wo_2)object);
    }

    @Override
    public boolean T(JList jList, int n10, Object object) {
        return this.E(jList, n10, (wo_2)object);
    }

    @Override
    public Object E(JList jList, int n10, Object object) {
        return this.e(jList, n10, (wo_2)object);
    }
}

