/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import com.ky_2;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

class mH
implements ItemListener {
    final u6_0 u;
    final JCheckBox N;
    final zM C;

    mH(zM zM2, u6_0 u6_02, JCheckBox jCheckBox) {
        this.C = zM2;
        this.u = u6_02;
        this.N = jCheckBox;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        zM zM2;
        block23: {
            Object object;
            block24: {
                Object object2;
                Object object3;
                block21: {
                    block22: {
                        Object object4;
                        Object object5;
                        Object object6;
                        ky_2[] ky_2Array = zM.I();
                        try {
                            this.u.X(((JCheckBox)this.N).isSelected());
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        ky_2[] ky_2Array2 = ky_2Array;
                        if (ky_2Array2 == null) break block21;
                        if (!((JCheckBox)this.N).isSelected()) break block22;
                        zM2 = (zM)this.C;
                        if (ky_2Array2 == null) break block23;
                        if (zM2.F) break block24;
                        try {
                            object6 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object5 = object6.h();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object4 = object5.Y();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.C.g(object4);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (ky_2Array2 != null) break block24;
                    }
                    _y_0.v();
                }
                try {
                    object3 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object2 = object3.O();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object2.L();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                object = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.S();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            zM2 = (zM)this.C;
        }
        zM2.F = false;
    }
}

