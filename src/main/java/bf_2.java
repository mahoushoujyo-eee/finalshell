/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from bf
 */
class bf_2
extends MouseAdapter {
    final n_0 G;
    final JR C;

    bf_2(JR jR, n_0 n_02) {
        this.C = jR;
        this.G = n_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block12: {
            int n10;
            int n11;
            block13: {
                int n12;
                ky_2[] ky_2Array;
                block10: {
                    int n13;
                    block11: {
                        int n14;
                        int n15 = ((JR)this.C).columnAtPoint(mouseEvent.getPoint());
                        n13 = ((JR)this.C).convertColumnIndexToModel(n15);
                        String string = ((JR)this.C).getColumnName(n15);
                        ky_2Array = ka_1.y();
                        try {
                            n14 = (Integer)this.G.R();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n12 = n14;
                        n11 = n13;
                        if (ky_2Array != null) break block10;
                        if (n11 != 0) break block11;
                        if (n12 == ka_1.a) break block12;
                        try {
                            this.G.h(ka_1.a);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (ky_2Array == null) break block12;
                    }
                    n11 = n13;
                }
                n10 = 1;
                if (ky_2Array != null) break block13;
                if (n11 != n10) break block12;
                n11 = n12;
                n10 = ka_1.O;
            }
            if (n11 != n10) {
                try {
                    this.G.h(ka_1.O);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }
}

