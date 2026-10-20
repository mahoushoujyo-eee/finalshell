/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from cp
 */
class cp_2
implements Comparator {
    final Collator D;

    cp_2(Collator collator) {
        this.D = collator;
    }

    public int z(DefaultMutableTreeNode defaultMutableTreeNode, DefaultMutableTreeNode defaultMutableTreeNode2) {
        String string;
        String string2;
        lo_1 lo_12;
        Object object;
        Object object2;
        Object object3;
        lo_1 lo_13;
        Object object4;
        Object object5;
        Object object6;
        tf_2 tf_22 = (tf_2)defaultMutableTreeNode.getUserObject();
        tf_2 tf_23 = (tf_2)defaultMutableTreeNode2.getUserObject();
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
            object4 = tf_22.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lo_13 = (lo_1)object5.m(object4);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        lo_1 lo_14 = lo_13;
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
            object = tf_23.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lo_12 = (lo_1)object2.m(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        lo_1 lo_15 = lo_12;
        try {
            string2 = (String)lo_14.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)lo_15.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return ((Collator)this.D).compare(string2, string);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.z((Object)((DefaultMutableTreeNode)object), (Object)((DefaultMutableTreeNode)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

