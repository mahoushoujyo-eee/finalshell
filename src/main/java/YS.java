/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Dimension;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JComponent;

class YS
implements Runnable {
    final gE C;
    private static final long a;

    YS(gE gE2) {
        this.C = gE2;
    }

    @Override
    public void run() {
        block6: {
            Object object;
            int n10;
            Dimension dimension;
            JComponent jComponent;
            block9: {
                int n11;
                block7: {
                    block8: {
                        bq_0 bq_02;
                        jComponent = (JComponent)((aM)this.C.Q).getParent();
                        String[] stringArray = aM.s();
                        if (jComponent == null) break block6;
                        dimension = ((aM)this.C.Q).getPreferredSize();
                        Dimension dimension2 = ((aM)this.C.Q).getSize();
                        Insets insets = ((aM)this.C.Q).getBorder().getBorderInsets((aM)this.C.Q);
                        n10 = insets.bottom + insets.top;
                        n11 = ((ArrayList)this.C.Q.c).size();
                        if (stringArray != null) break block7;
                        if (n11 <= 0) break block8;
                        object = (t3_0)((ArrayList)this.C.Q.c).get(((ArrayList)this.C.Q.c).size() - 1);
                        try {
                            bq_02 = (bq_0)object.k();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        bq_0 bq_03 = bq_02;
                        n10 = (int)((double)n10 + (bq_03.getLocation().getY() + (double)bq_03.getHeight()));
                        if (stringArray == null) break block9;
                    }
                    n11 = (int)dimension.getHeight();
                }
                n10 = n11;
            }
            object = new Dimension((int)dimension.getWidth(), (int)a);
            ((Dimension)object).setSize((int)dimension.getWidth(), n10);
            ((aM)this.C.Q).setMinimumSize((Dimension)object);
            jComponent.validate();
            jComponent.revalidate();
            jComponent.doLayout();
            jComponent.repaint();
            try {
                this.C.Q.U();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1129047837595683427L;
        a = 0x129F206ABE504A51L ^ l2;
    }
}

