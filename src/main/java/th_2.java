/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from th
 */
class th_2
implements ActionListener {
    final nx_0 B;

    th_2(nx_0 nx_02) {
        this.B = nx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        boolean bl;
        block24: {
            boolean bl2;
            block23: {
                String string;
                String string2;
                u6_0 u6_02;
                block22: {
                    block21: {
                        String string3;
                        Object object;
                        u6_0 u6_03;
                        Object object2;
                        try {
                            object2 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            u6_03 = (u6_0)object2.h();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        u6_02 = u6_03;
                        string2 = km_0.U();
                        try {
                            u6_02.t(1);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
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
                        bl2 = false;
                        if (string2 != null) break block21;
                        try {
                            string3 = (String)u6_02.O();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (string3 != null) break block22;
                        bl2 = true;
                    }
                    if (string2 == null) break block23;
                }
                try {
                    string = (String)u6_02.O();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                File file = new File(string);
                bl = file.exists();
                if (string2 != null) break block24;
                if (!bl) {
                    bl2 = true;
                }
            }
            bl = bl2;
        }
        if (bl) {
            try {
                lk_0.j(this.B.s);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

