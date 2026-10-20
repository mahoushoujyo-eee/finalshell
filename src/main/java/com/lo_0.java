/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.RV;
import com.lt_2;
import com.lz_0;
import com.xg_0;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/*
 * Renamed from com.Lo
 */
public class lo_0
extends lz_0 {
    protected TexturePaint I = null;
    protected lt_2 q = null;

    public lo_0(ImageIcon imageIcon) {
        this(imageIcon.getImage());
    }

    public lo_0(Image image) {
        this(xg_0.v(image));
    }

    public lo_0(BufferedImage bufferedImage) {
        this.X(bufferedImage);
    }

    public lo_0(lt_2 lt_22) {
        this.F(lt_22);
    }

    public lt_2 V() {
        return this.q;
    }

    /*
     * Unable to fully structure code
     */
    public void F(lt_2 var1_1) {
        this.q = var1_1;
        var2_2 = lz_0.M();
        v0 = var1_1;
        if (var2_2 != null) ** GOTO lbl9
        if (v0 == null) {
            v1 = null;
        } else {
            v0 = var1_1;
lbl9:
            // 2 sources

            v1 = v0.O();
        }
        this.X(v1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public BufferedImage o() {
        int[] nArray = lz_0.M();
        TexturePaint texturePaint = this.I;
        if (nArray == null) {
            if (texturePaint == null) return null;
            texturePaint = this.I;
        }
        BufferedImage bufferedImage = texturePaint.getImage();
        return bufferedImage;
    }

    public void I(BufferedImage bufferedImage) {
        this.X(bufferedImage);
    }

    protected void X(BufferedImage bufferedImage) {
        this.I = bufferedImage != null ? new TexturePaint(bufferedImage, new Rectangle(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight())) : null;
        this.l();
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        block2: {
            Object object;
            Rectangle rectangle2;
            block4: {
                int n10;
                block3: {
                    int[] nArray = lz_0.M();
                    if (this.I == null) break block2;
                    rectangle2 = jComponent.getVisibleRect().intersection(rectangle);
                    n10 = rectangle2.width;
                    if (nArray != null) break block3;
                    if (n10 <= 0) break block2;
                    object = rectangle2;
                    if (nArray != null) break block4;
                    n10 = ((Rectangle)object).height;
                }
                if (n10 <= 0) break block2;
                object = RV.O(graphics2D);
            }
            Object object2 = object;
            graphics2D.setPaint(this.I);
            graphics2D.fillRect(rectangle2.x, rectangle2.y, rectangle2.width, rectangle2.height);
            RV.N(graphics2D, object2);
        }
    }
}

