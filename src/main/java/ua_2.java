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
 * Renamed from ua
 */
class ua_2
implements ActionListener {
    final l5_0 E;

    ua_2(l5_0 l5_02) {
        this.E = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block28: {
            Object object;
            lv_2 lv_22;
            File file;
            Object object2;
            Object object3;
            Object object4;
            block27: {
                DefaultMutableTreeNode defaultMutableTreeNode;
                mi_0 mi_02;
                Object object5;
                U u10;
                Object object6;
                Object object7;
                Object object8;
                try {
                    object8 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object7 = object8.O();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object6 = object7.G();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    u10 = (U)object6.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                U u11 = u10;
                try {
                    object5 = u11.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    mi_02 = (mi_0)object5.W();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                mi_0 mi_03 = mi_02;
                String string = aA.z();
                try {
                    defaultMutableTreeNode = (DefaultMutableTreeNode)this.E.D.u();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode;
                object4 = defaultMutableTreeNode2.getUserObject().getClass();
                if (string != null) break block27;
                if (!object4.equals(ck_2.class)) break block28;
                object4 = defaultMutableTreeNode2.getUserObject();
            }
            ck_2 ck_22 = (ck_2)object4;
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
                file = (File)ck_22.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                lv_22 = (lv_2)object2.q(file.getAbsolutePath());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            lv_2 lv_23 = lv_22;
            try {
                object = lv_23.v();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                lk_0.u(object);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

