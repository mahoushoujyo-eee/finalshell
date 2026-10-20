/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;

class BY
implements ActionListener {
    final l5_0 y;

    BY(l5_0 l5_02) {
        this.y = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block41: {
            JDialog jDialog;
            File file;
            JFrame jFrame;
            lv_2 lv_22;
            block43: {
                JFrame jFrame2;
                String string;
                block42: {
                    int n10;
                    int n11;
                    JFrame jFrame3;
                    block37: {
                        block38: {
                            JDialog jDialog2;
                            block40: {
                                JFrame jFrame4;
                                block39: {
                                    JFrame jFrame5;
                                    Object object;
                                    Object object2;
                                    Object object3;
                                    lv_2 lv_23;
                                    File file2;
                                    Object object4;
                                    Object object5;
                                    try {
                                        this.y.P.s(true);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        object5 = yt_1.i();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        object4 = object5.g();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        file2 = (File)this.y.u.i();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        lv_23 = (lv_2)object4.q(file2.getAbsolutePath());
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    lv_22 = lv_23;
                                    try {
                                        object3 = yt_1.i();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        object2 = object3.v();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        object = lv_22.g();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        jFrame5 = (JFrame)object2.c(object);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    jFrame3 = jFrame5;
                                    string = aA.z();
                                    try {
                                        n11 = (Integer)this.y.u.I();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    n10 = lv_2.C;
                                    if (string != null) break block37;
                                    if (n11 != n10) break block38;
                                    jFrame4 = jFrame3;
                                    if (string != null) break block39;
                                    if (jFrame4 == null) break block40;
                                    jFrame4 = jFrame3;
                                }
                                jFrame = (km_2)jFrame4;
                                try {
                                    jFrame.setVisible(true);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (string == null) break block41;
                            }
                            try {
                                this.y.P.S();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                jDialog2 = (JDialog)U.T();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            jFrame = new km_2(null, null, jDialog2, lv_22, null);
                            if (string == null) break block41;
                        }
                        try {
                            n11 = (Integer)this.y.u.I();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n10 = lv_2.F;
                    }
                    if (n11 != n10) break block41;
                    jFrame2 = jFrame3;
                    if (string != null) break block42;
                    if (jFrame2 == null) break block43;
                    jFrame2 = jFrame3;
                }
                jFrame = (kb_0)jFrame2;
                try {
                    jFrame.setVisible(true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (string == null) break block41;
            }
            try {
                file = (File)this.y.u.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string = file.getParent();
            KQ kQ = (KQ)this.y.P;
            try {
                this.y.P.S();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                jDialog = (JDialog)U.T();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            jFrame = new kb_0(string, kQ, jDialog, lv_22, (DefaultMutableTreeNode)this.y.B);
        }
    }
}

