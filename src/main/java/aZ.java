/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class aZ
implements ActionListener {
    final nx_0 H;

    aZ(nx_0 nx_02) {
        this.H = nx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        Object object2;
        ArrayList arrayList;
        String string;
        String string2;
        try {
            string2 = (String)this.H.U.d();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)lk_0.N(new File(string2).getName());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string3 = string;
        try {
            arrayList = (ArrayList)this.H.y.d();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ArrayList arrayList2 = arrayList;
        arrayList2.add(string3);
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = this.H.s.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.Y(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

