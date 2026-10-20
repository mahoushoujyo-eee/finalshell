/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/*
 * Renamed from k_
 */
class k__0
implements ActionListener {
    final f3_0 j;

    k__0(f3_0 f3_02) {
        this.j = f3_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10 = ((ua_1)this.j.q).getSelectedRow();
        if (n10 > -1) {
            String string;
            ArrayList arrayList;
            try {
                arrayList = (ArrayList)this.j.K.N();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            L9 l9 = (L9)arrayList.get(n10);
            try {
                string = (String)l9.o();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string2 = string;
            if (string2 != null) {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                try {
                    object6 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object5 = object6.O();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object4 = object5.G();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object3 = object4.D();
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
                    object = object2.W();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object.z((Object)string2, null);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }
}

