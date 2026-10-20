/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from dt
 */
class dt_2
implements ActionListener {
    final l5_0 U;

    dt_2(l5_0 l5_02) {
        this.U = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block32: {
            Object object;
            Object object2;
            lv_2 lv_22;
            File file;
            Object object3;
            Object object4;
            Object object5;
            mi_0 mi_02;
            block31: {
                DefaultMutableTreeNode defaultMutableTreeNode;
                mi_0 mi_03;
                Object object6;
                U u10;
                Object object7;
                Object object8;
                Object object9;
                try {
                    object9 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object8 = object9.O();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object7 = object8.G();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    u10 = (U)object7.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                U u11 = u10;
                try {
                    object6 = u11.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    mi_03 = (mi_0)object6.W();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                mi_02 = mi_03;
                String string = aA.z();
                try {
                    defaultMutableTreeNode = (DefaultMutableTreeNode)this.U.D.u();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode;
                object5 = defaultMutableTreeNode2.getUserObject().getClass();
                if (string != null) break block31;
                if (!object5.equals(ck_2.class)) break block32;
                object5 = defaultMutableTreeNode2.getUserObject();
            }
            ck_2 ck_22 = (ck_2)object5;
            try {
                object4 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object3 = object4.g();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                file = (File)ck_22.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                lv_22 = (lv_2)object3.q(file.getAbsolutePath());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            lv_2 lv_23 = lv_22;
            try {
                object2 = lv_23.v();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = lv_23.F();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                mi_02.z(object2, object);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.U.P.setVisible(false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

