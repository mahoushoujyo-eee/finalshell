/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

class WN
extends MouseAdapter {
    final uo_0 w;

    WN(uo_0 uo_02) {
        this.w = uo_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block22: {
            int n10;
            int n11;
            n_0 n_02;
            block23: {
                boolean bl;
                block20: {
                    int n12;
                    block21: {
                        n_0 n_03;
                        Object object;
                        Object object2;
                        Object object3;
                        Object object4;
                        Object object5;
                        n12 = ((uo_0)this.w).columnAtPoint(mouseEvent.getPoint());
                        String string = ((uo_0)this.w).getColumnName(n12);
                        bl = uo_0.i();
                        try {
                            object5 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object4 = object5.O();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object3 = object4.G();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object2 = object3.D();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object = object2.D();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n_03 = (n_0)object.U();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n_02 = n_03;
                        n11 = n12;
                        n10 = 2;
                        if (bl) break block20;
                        if (n11 != n10) break block21;
                        if (this.w.T == 2) break block22;
                        try {
                            n_02.h(ka_1.a);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (!bl) break block22;
                    }
                    n11 = n12;
                    n10 = 3;
                }
                if (bl) break block23;
                if (n11 != n10) break block22;
                n11 = this.w.T;
                n10 = 3;
            }
            if (n11 != n10) {
                try {
                    n_02.h(ka_1.O);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }
}

