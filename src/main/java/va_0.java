/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from Va
 */
class va_0
implements Runnable {
    final TreeExpansionEvent E;
    final a3 Y;
    private static final String a;

    va_0(a3 a32, TreeExpansionEvent treeExpansionEvent) {
        this.Y = a32;
        this.E = treeExpansionEvent;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block52: {
            List list;
            tf_2 tf_22;
            tf_2 tf_23;
            int[] nArray;
            block56: {
                boolean bl;
                block54: {
                    block55: {
                        Class<?> clazz;
                        DefaultMutableTreeNode defaultMutableTreeNode;
                        block53: {
                            boolean bl2;
                            Class<?> clazz2;
                            block51: {
                                block62: {
                                    defaultMutableTreeNode = (DefaultMutableTreeNode)((TreeExpansionEvent)this.E).getPath().getLastPathComponent();
                                    nArray = a3.I();
                                    clazz2 = defaultMutableTreeNode.getUserObject();
                                    bl2 = defaultMutableTreeNode.equals((DefaultMutableTreeNode)this.Y.w);
                                    if (nArray == null) break block51;
                                    if (bl2) break block52;
                                    break block62;
                                    catch (Exception exception) {
                                        throw va_0.a(exception);
                                    }
                                }
                                try {
                                    block63: {
                                        clazz = clazz2.getClass();
                                        if (nArray == null) break block53;
                                        break block63;
                                        catch (Exception exception) {
                                            throw va_0.a(exception);
                                        }
                                    }
                                    bl2 = clazz.equals(tf_2.class);
                                }
                                catch (Exception exception) {
                                    throw va_0.a(exception);
                                }
                            }
                            if (!bl2) break block52;
                            clazz = clazz2;
                        }
                        tf_23 = (tf_2)((Object)clazz);
                        try {
                            String string;
                            try {
                                string = (String)tf_23.k();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            bl = ((HashSet)this.Y.Z).contains(string);
                            if (nArray == null) break block54;
                            if (bl) break block55;
                        }
                        catch (Exception exception) {
                            throw va_0.a(exception);
                        }
                        try {
                            try {
                                this.Y.w((Object)defaultMutableTreeNode, (Object)tf_23, true, (Object)true, null, false);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                        }
                    }
                    try {
                        tf_22 = tf_23;
                        if (nArray == null) break block56;
                        try {
                            bl = (Boolean)tf_22.z();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    catch (Exception exception) {
                        throw va_0.a(exception);
                    }
                }
                if (!bl) break block52;
                tf_22 = tf_23;
            }
            try {
                list = (List)tf_22.f();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            List list2 = list;
            for (tf_2 tf_24 : list2) {
                int n10;
                DefaultMutableTreeNode defaultMutableTreeNode;
                DefaultMutableTreeNode defaultMutableTreeNode2;
                block59: {
                    int n11;
                    block60: {
                        block66: {
                            block57: {
                                String string;
                                block58: {
                                    block64: {
                                        String string2;
                                        String string3;
                                        File file;
                                        String string4;
                                        try {
                                            string4 = (String)tf_23.k();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        defaultMutableTreeNode2 = (DefaultMutableTreeNode)((HashMap)this.Y.r).get(string4);
                                        try {
                                            file = (File)tf_24.M();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        if (file.getName().equals(a)) {
                                            // empty if block
                                        }
                                        try {
                                            string3 = (String)tf_24.k();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.Y.r).get(string3);
                                        n11 = 0;
                                        try {
                                            string2 = (String)tf_24.k();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        n10 = ((HashSet)this.Y.Z).contains(string2);
                                        if (nArray == null) break block57;
                                        if (n10 != 0) break block58;
                                        break block64;
                                        catch (Exception exception) {
                                            throw va_0.a(exception);
                                        }
                                    }
                                    try {
                                        block65: {
                                            String string5;
                                            try {
                                                string5 = (String)tf_24.k();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            n10 = ((HashSet)this.Y.P).contains(string5) ? 1 : 0;
                                            if (nArray == null) break block57;
                                            break block65;
                                            catch (Exception exception) {
                                                throw va_0.a(exception);
                                            }
                                        }
                                        if (n10 != 0) break block58;
                                    }
                                    catch (Exception exception) {
                                        throw va_0.a(exception);
                                    }
                                    n11 = 1;
                                }
                                try {
                                    string = (String)tf_24.k();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                n10 = ((HashSet)this.Y.Z).contains(string) ? 1 : 0;
                            }
                            if (nArray == null) break block59;
                            if (n10 == 0) break block60;
                            break block66;
                            catch (Exception exception) {
                                throw va_0.a(exception);
                            }
                        }
                        try {
                            block67: {
                                n10 = defaultMutableTreeNode.getChildCount();
                                if (nArray == null) break block59;
                                break block67;
                                catch (Exception exception) {
                                    throw va_0.a(exception);
                                }
                            }
                            if (n10 != 0) break block60;
                        }
                        catch (Exception exception) {
                            throw va_0.a(exception);
                        }
                        n11 = 1;
                    }
                    n10 = n11;
                }
                if (n10 != 0) {
                    try {
                        try {
                            this.Y.w((Object)defaultMutableTreeNode2, (Object)tf_24, true, (Object)false, (Object)defaultMutableTreeNode, false);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                if (nArray != null) continue;
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "N\u001e/\u00144.".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 45;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 51;
                            break;
                        }
                        case 1: {
                            n17 = 70;
                            break;
                        }
                        case 2: {
                            n17 = 96;
                            break;
                        }
                        case 3: {
                            n17 = 85;
                            break;
                        }
                        case 4: {
                            n17 = 112;
                            break;
                        }
                        case 5: {
                            n17 = 96;
                            break;
                        }
                        default: {
                            n17 = 52;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

