/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import javax.swing.tree.DefaultMutableTreeNode;

class aY
implements Comparator {
    final Collator H;

    aY(Collator collator) {
        this.H = collator;
    }

    public int w(DefaultMutableTreeNode defaultMutableTreeNode, DefaultMutableTreeNode defaultMutableTreeNode2) {
        block31: {
            String string;
            lv_2 lv_22;
            lv_2 lv_23;
            lv_2 lv_24;
            ky_2[] ky_2Array;
            block32: {
                block30: {
                    lv_2 lv_25;
                    Object object;
                    Object object2;
                    Object object3;
                    lv_2 lv_26;
                    Object object4;
                    Object object5;
                    Object object6;
                    ck_2 ck_22 = (ck_2)defaultMutableTreeNode.getUserObject();
                    ky_2Array = yt_1.c();
                    ck_2 ck_23 = (ck_2)defaultMutableTreeNode2.getUserObject();
                    try {
                        object6 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object5 = object6.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object4 = ck_22.d();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        lv_26 = (lv_2)object5.q(object4);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    lv_24 = lv_26;
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
                        object = ck_23.d();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        lv_25 = (lv_2)object2.q(object);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    lv_23 = lv_25;
                    lv_22 = lv_24;
                    if (ky_2Array == null) break block30;
                    if (lv_22 == null) break block31;
                    lv_22 = lv_23;
                }
                if (ky_2Array == null) break block32;
                if (lv_22 == null) break block31;
                lv_22 = lv_24;
            }
            try {
                string = (String)lv_22.F();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (ky_2Array != null) {
                if (string != null) {
                    try {
                        string = (String)lv_23.F();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            } else if (string != null) {
                String string2;
                String string3;
                try {
                    string3 = (String)lv_24.F();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    string2 = (String)lv_23.F();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                return ((Collator)this.H).compare(string3, string2);
            }
            return 1;
        }
        return 1;
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.w((Object)((DefaultMutableTreeNode)object), (Object)((DefaultMutableTreeNode)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

