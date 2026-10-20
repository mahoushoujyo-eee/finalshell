/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.W6;
import com.gi_0;
import com.ky_2;
import com.tk_0;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Gf
 */
public class gf_0
extends gi_0 {
    protected ImageIcon rZ = W6.H;
    protected int r6 = W6.A;
    protected int rq = W6.v;

    public static ComponentUI createUI(JComponent jComponent) {
        return new gf_0();
    }

    public ImageIcon g() {
        return this.rZ;
    }

    public void o(ImageIcon imageIcon) {
        this.rZ = imageIcon;
    }

    public int U() {
        return this.r6;
    }

    public void g(int n10) {
        this.r6 = n10;
    }

    public int O() {
        return this.rq;
    }

    public void T(int n10) {
        this.rq = n10;
    }

    @Override
    protected Insets g() {
        Insets insets;
        block4: {
            int n10;
            block3: {
                boolean bl;
                block2: {
                    insets = super.g();
                    bl = tk_0.B();
                    boolean bl2 = this.b.getComponentOrientation().isLeftToRight();
                    n10 = this.rZ.getIconWidth() + 1 + this.r6 * 2 + this.rq;
                    if (bl) break block2;
                    if (!bl2) break block3;
                    insets.right += n10;
                }
                if (!bl) break block4;
            }
            insets.left += n10;
        }
        return insets;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void paint(Graphics var1_1, JComponent var2_2) {
        v0 = tk_0.B();
        super.paint(var1_1, var2_2);
        var3_3 = v0;
        var4_4 = var2_2.getComponentOrientation().isLeftToRight();
        var5_5 = this.D(var2_2);
        var6_6 = var5_5.x + var5_5.width / 2 - this.rZ.getIconWidth() / 2;
        var7_7 = var5_5.y + var5_5.height / 2 - this.rZ.getIconHeight() / 2;
        var1_1.drawImage(this.rZ.getImage(), var6_6, var7_7, null);
        v1 = var4_4;
        if (var3_3) ** GOTO lbl16
        if (v1 != 0) {
            v2 = var5_5.x;
        } else {
            v1 = var5_5.x + var5_5.width;
lbl16:
            // 2 sources

            v2 = v1 - 1;
        }
        var8_8 = v2;
        var1_1.setColor(var2_2.isEnabled() != false ? GO.N : GO.FX);
        var1_1.drawLine(var8_8, var5_5.y + 1, var8_8, var5_5.y + var5_5.height - 2);
        if (ky_2.F() != null) {
            tk_0.U(var3_3 == false);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Rectangle D(JComponent var1_1) {
        var3_2 = var1_1.getComponentOrientation().isLeftToRight();
        var2_3 = tk_0.B();
        var4_4 = var1_1.getInsets();
        v0 = this.G;
        if (var2_3) ** GOTO lbl10
        if (v0 != 0) {
            v0 = this.C + 1;
        } else {
            v0 = this.D;
lbl10:
            // 2 sources

            if (!var2_3) {
                v0 = v0 != 0 ? 1 : 0;
            }
        }
        var5_5 = v0;
        var6_6 = var1_1.getHeight() - var4_4.top - var4_4.bottom;
        v1 = var3_2;
        if (!var2_3) {
            if (v1 != 0) {
                var7_7 = var4_4.right - this.rq - var5_5;
                return new Rectangle(var1_1.getWidth() - var4_4.right + this.rq, var4_4.top, var7_7, var6_6);
            }
            v1 = var4_4.left - this.rq - var5_5;
        }
        var7_8 = v1;
        return new Rectangle(var5_5, var4_4.top, var7_8, var6_6);
    }

    public Rectangle o(JComponent jComponent) {
        boolean bl = jComponent.getComponentOrientation().isLeftToRight();
        Insets insets = jComponent.getInsets();
        return bl ? new Rectangle(jComponent.getWidth() - insets.right + this.rq, 0, insets.right - this.rq, jComponent.getHeight()) : new Rectangle(0, 0, insets.left - this.rq, jComponent.getHeight());
    }
}

