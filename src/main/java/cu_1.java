/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

/*
 * Renamed from cU
 */
public class cu_1
extends JLabel {
    boolean e;
    boolean U;
    boolean x;
    boolean r;
    li_1 W;

    public cu_1() {
        this.e = false;
        this.U = false;
        this.x = false;
    }

    @Override
    public void paint(Graphics graphics) {
        block21: {
            int n10;
            float f10;
            int n11;
            Graphics2D graphics2D;
            block31: {
                block32: {
                    float f11;
                    String[] stringArray;
                    block29: {
                        float f12;
                        block30: {
                            float f13;
                            cu_1 cu_12;
                            int n12;
                            int n13;
                            block28: {
                                boolean bl;
                                block22: {
                                    block23: {
                                        block27: {
                                            int n14;
                                            block26: {
                                                long l2;
                                                block24: {
                                                    double d2;
                                                    double d3;
                                                    block25: {
                                                        long l3;
                                                        float f14;
                                                        block20: {
                                                            String[] stringArray2 = F8.y();
                                                            super.paint(graphics);
                                                            graphics2D = (Graphics2D)graphics;
                                                            stringArray = stringArray2;
                                                            bl = this.e;
                                                            if (stringArray != null) break block20;
                                                            if (bl) break block21;
                                                            bl = this.x;
                                                        }
                                                        if (stringArray != null) break block22;
                                                        if (!bl) break block23;
                                                        graphics2D.setColor((Color)cy_1.l);
                                                        try {
                                                            f14 = ((Float)this.W.c()).floatValue();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        d3 = f14 * 0.01f;
                                                        n13 = 3;
                                                        n12 = 0;
                                                        n11 = 5;
                                                        f10 = (int)((double)((float)this.getWidth() - (float)n11) * d3) + n12;
                                                        n14 = n13;
                                                        try {
                                                            l3 = (Long)this.W.c();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        long l4 = l3 - 0L;
                                                        l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                                        if (stringArray != null) break block24;
                                                        if (l2 <= 0) break block25;
                                                        l2 = (long)f10;
                                                        if (stringArray != null) break block24;
                                                        if (l2 == false) {
                                                            f10 = 1.0f;
                                                        }
                                                    }
                                                    l2 = (d2 = d3 - 0.0) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                                                }
                                                if (l2 <= 0) break block26;
                                                graphics2D.fillRect(this.getWidth() - f10, n14, (int)f10, this.getHeight() - 2 * n13);
                                                if (stringArray == null) break block27;
                                            }
                                            graphics2D.setColor((Color)cy_1.l);
                                            graphics2D.fillRect(this.getWidth() - f10, n14, (int)f10, this.getHeight() - 2 * n13);
                                        }
                                        if (stringArray == null) break block21;
                                    }
                                    cu_12 = this;
                                    if (stringArray != null) break block28;
                                    bl = cu_12.U;
                                }
                                if (!bl) break block21;
                                graphics2D.setColor((Color)cy_1.t);
                                cu_12 = this;
                            }
                            try {
                                f13 = ((Float)cu_12.W.r()).floatValue();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            f11 = f13 * 0.01f;
                            n10 = 3;
                            n13 = 0;
                            n12 = 5;
                            n11 = (int)(((float)this.getWidth() - (float)n12) * f11) + n13;
                            float f15 = f11 - 0.0f;
                            f12 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                            if (stringArray != null) break block29;
                            if (f12 <= 0) break block30;
                            f12 = n11;
                            if (stringArray != null) break block29;
                            if (f12 == false) {
                                n11 = 1;
                            }
                        }
                        f12 = f10 = (float)n10;
                    }
                    if (stringArray != null) break block31;
                    if (!(f11 > 0.0f)) break block32;
                    graphics2D.fillRect(this.getWidth() - n11, (int)f10, n11, this.getHeight() - 2 * n10);
                    if (stringArray == null) break block21;
                }
                graphics2D.setColor((Color)cy_1.t);
            }
            graphics2D.fillRect(this.getWidth() - n11, (int)f10, n11, this.getHeight() - 2 * n10);
        }
    }

    public boolean Y() {
        return this.r;
    }

    public void L(boolean bl) {
        this.r = bl;
    }

    public boolean D() {
        return this.e;
    }

    public void x(boolean bl) {
        this.e = bl;
    }

    public li_1 x() {
        return (li_1)this.W;
    }

    public void n(li_1 li_12) {
        this.W = li_12;
    }

    public boolean d() {
        return this.U;
    }

    public void w(boolean bl) {
        this.U = bl;
    }

    public boolean W() {
        return this.x;
    }

    public void Z(boolean bl) {
        this.x = bl;
    }

    public li_1 w() {
        return (li_1)this.W;
    }

    public void i(li_1 li_12) {
        this.W = li_12;
    }
}

