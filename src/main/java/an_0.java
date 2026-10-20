/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * Renamed from an
 */
class an_0
extends as_0 {
    final GradientPaint m;
    final uv_1 s;

    an_0(uv_1 uv_12, nj_0 nj_02, aJ aJ2, GradientPaint gradientPaint) {
        this.s = uv_12;
        this.m = gradientPaint;
        super(nj_02, aJ2);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setPaint((GradientPaint)this.m);
        graphics2D.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}

