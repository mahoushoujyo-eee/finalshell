/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Renamed from Uc
 */
public class uc_0 {
    BufferedImage K;
    BufferedImage u;
    HashMap N;
    HashMap t;
    HashMap s;
    HashMap T;
    HashSet X;
    int F;
    int U;

    public uc_0() {
        this.N = new HashMap();
        this.t = new HashMap();
        this.s = new HashMap();
        this.T = new HashMap();
        this.X = new HashSet();
    }

    public void q() {
        Object object;
        Object object2;
        float f10;
        int n10;
        int n11;
        int n12;
        RenderingHints renderingHints;
        BufferedImage bufferedImage;
        BufferedImage bufferedImage2;
        block10: {
            float f11;
            float f12;
            block8: {
                block9: {
                    try {
                        this.E();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    bufferedImage2 = _y_0.z;
                    bufferedImage = _y_0.Y;
                    renderingHints = _y_0.n;
                    int n13 = bufferedImage2.getWidth();
                    int n14 = bufferedImage2.getHeight();
                    f12 = (float)n13 / (float)n14;
                    String[] stringArray = F8.y();
                    float f13 = (float)this.F / (float)this.U;
                    n12 = 0;
                    n11 = 0;
                    f11 = f12 == f13 ? 0 : (f12 > f13 ? 1 : -1);
                    if (stringArray != null) break block8;
                    if (f11 <= 0) break block9;
                    n10 = this.U;
                    f10 = (int)(f12 * (float)this.U);
                    n12 = -(f10 - this.F) / 2;
                    n11 = 0;
                    if (stringArray == null) break block10;
                }
                f11 = this.F;
            }
            f10 = f11;
            n10 = (int)((float)this.F / f12);
            n11 = -(n10 - this.U) / 2;
            n12 = 0;
        }
        try {
            object2 = lk_0.u(this.F, this.U);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.K = object2;
        Graphics2D graphics2D = (Graphics2D)((BufferedImage)this.K).getGraphics();
        graphics2D.setRenderingHints(renderingHints);
        graphics2D.drawImage(bufferedImage, n12, n11, (int)f10, n10, null);
        graphics2D.dispose();
        try {
            object = lk_0.u(this.F, this.U);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.u = object;
        Graphics2D graphics2D2 = (Graphics2D)((BufferedImage)this.u).getGraphics();
        graphics2D2.setRenderingHints(renderingHints);
        graphics2D2.drawImage(bufferedImage2, n12, n11, (int)f10, n10, null);
        graphics2D2.dispose();
    }

    public void E() {
        uc_0 uc_02;
        block6: {
            BufferedImage bufferedImage;
            block5: {
                String[] stringArray = F8.y();
                ((HashMap)this.N).clear();
                String[] stringArray2 = stringArray;
                ((HashMap)this.t).clear();
                ((HashMap)this.s).clear();
                ((HashMap)this.T).clear();
                bufferedImage = (BufferedImage)this.K;
                if (stringArray2 != null) break block5;
                if (bufferedImage != null) {
                    ((BufferedImage)this.K).getGraphics().dispose();
                }
                uc_02 = this;
                if (stringArray2 != null) break block6;
                bufferedImage = (BufferedImage)uc_02.u;
            }
            if (bufferedImage != null) {
                ((BufferedImage)this.u).getGraphics().dispose();
            }
            this.K = null;
            uc_02 = this;
        }
        uc_02.u = null;
    }

    public void a() {
        ((HashSet)this.X).clear();
    }

    public void T(int n10) {
        ((HashSet)this.X).add(n10);
    }

    public void P(int n10) {
        ((HashSet)this.X).remove(n10);
    }

    public int M() {
        return ((HashSet)this.X).size();
    }

    public BufferedImage V() {
        return (BufferedImage)this.K;
    }

    public void D(BufferedImage bufferedImage) {
        this.K = bufferedImage;
    }

    public BufferedImage D() {
        return (BufferedImage)this.u;
    }

    public void s(BufferedImage bufferedImage) {
        this.u = bufferedImage;
    }

    public HashMap S() {
        return (HashMap)this.N;
    }

    public HashMap g() {
        return (HashMap)this.t;
    }

    public HashMap u() {
        return (HashMap)this.s;
    }

    public HashMap o() {
        return (HashMap)this.T;
    }
}

