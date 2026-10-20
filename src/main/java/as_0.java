/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;

/*
 * Renamed from as
 */
public class as_0
extends JComponent {
    aJ U;
    tv_0 V;
    dy_2 q;

    public as_0(nj_0 nj_02, aJ aJ2) {
        this.q = new dy_2();
        this.setLayout((dy_2)this.q);
        this.U = aJ2;
        this.V = new tv_0(nj_02, (aJ)this.U);
        this.add((tv_0)this.V);
        this.add((aJ)this.U);
        try {
            this.U.b(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public Dimension getPreferredSize() {
        String string = aA.z();
        aJ aJ2 = (aJ)this.U;
        if (string == null) {
            if (aJ2 == null) {
                return super.getPreferredSize();
            }
            aJ2 = (aJ)this.U;
        }
        return aJ2.getPreferredSize();
    }

    public dy_2 C() {
        return (dy_2)this.q;
    }

    public void Z(dy_2 dy_22) {
        this.q = dy_22;
    }

    public tv_0 Y() {
        return (tv_0)this.V;
    }

    public void P(tv_0 tv_02) {
        this.V = tv_02;
    }
}

