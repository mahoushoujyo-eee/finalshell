/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JFrame;

class FR
implements ActionListener {
    final _y_0 w;

    FR(_y_0 _y_02) {
        this.w = _y_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block28: {
            JDialog jDialog;
            km_2 km_22;
            lv_2 lv_22;
            block30: {
                U u10;
                int n10;
                block29: {
                    U u11;
                    lv_2 lv_23;
                    Object object;
                    Object object2;
                    Object object3;
                    int n11 = _y_0.y();
                    this.w.kj.requestFocus();
                    n10 = n11;
                    try {
                        object3 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object2 = object3.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = this.w.C.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        lv_23 = (lv_2)object2.S(object);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    lv_22 = lv_23;
                    if (lv_22 == null) break block28;
                    JFrame jFrame = this.w.kD;
                    if (n10 == 0) {
                        Object object4;
                        Object object5;
                        Object object6;
                        boolean bl;
                        try {
                            bl = (Boolean)jFrame.o();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (bl) {
                            try {
                                this.w.kD.g();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        try {
                            object6 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object5 = object6.v();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object4 = lv_22.g();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            jFrame = (JFrame)object5.c(object4);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    u10 = u11 = jFrame;
                    if (n10 != 0) break block29;
                    if (u10 == null) break block30;
                    u10 = u11;
                }
                km_22 = (km_2)((Object)u10);
                try {
                    km_22.setVisible(true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (n10 == 0) break block28;
            }
            U cfr_ignored_0 = this.w.kD;
            try {
                jDialog = (JDialog)U.T();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            km_22 = new km_2(null, null, jDialog, lv_22, null);
        }
    }
}

