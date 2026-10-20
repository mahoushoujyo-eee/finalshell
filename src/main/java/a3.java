/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.DropMode;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a3
extends aA {
    LE i;
    fy_0 y;
    a3 K;
    HashMap r;
    tf_2 D;
    DefaultMutableTreeNode w;
    FileSystemView d;
    long m;
    boolean U;
    TreePath s;
    Object F;
    DefaultMutableTreeNode B;
    int a;
    boolean S;
    int Y;
    lu_2 I;
    HashSet Z;
    HashSet P;
    boolean c;
    zD X;
    kl_2 z;
    km_0 h;
    F6 o;
    tf_2 V;
    HashSet T;
    String E;
    ArrayList g;
    Object p;
    boolean j;
    long W;
    boolean J;
    String f;
    File e;
    long k;
    String t;
    private static int[] M;
    private static final String[] l;
    private static final String[] n;
    private static final long[] A;
    private static final Integer[] C;
    private static final long[] G;
    private static final Long[] H;

    public a3(boolean bl, kl_2 kl_22) {
        block21: {
            KeyListener[] keyListenerArray;
            int[] nArray;
            block26: {
                boolean bl2;
                block25: {
                    Object object;
                    Object object2;
                    block24: {
                        block22: {
                            block23: {
                                boolean bl3;
                                super(new DefaultMutableTreeNode("treeroot", true));
                                this.r = new HashMap();
                                this.D = null;
                                this.U = false;
                                this.S = false;
                                this.Y = a3.b(4479, 8254247404394555649L);
                                int[] nArray2 = a3.I();
                                this.Z = new HashSet();
                                this.P = new HashSet();
                                this.c = true;
                                this.T = new HashSet();
                                nArray = nArray2;
                                this.E = null;
                                this.g = new ArrayList();
                                this.p = this;
                                this.j = true;
                                this.J = true;
                                this.d = FileSystemView.getFileSystemView();
                                if (nArray == null) break block22;
                                try {
                                    bl3 = (Boolean)vk_0.s();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (!bl3) break block23;
                                this.e = ((FileSystemView)this.d).getHomeDirectory();
                                this.f = ((File)this.e).getAbsolutePath();
                                if (nArray != null) break block24;
                                ky_2.K(new String[1]);
                            }
                            this.f = "/";
                        }
                        this.e = new File((String)this.f);
                    }
                    this.z = kl_22;
                    this.c = bl;
                    try {
                        object2 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = object2.d();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.I = object;
                    this.setBorder(null);
                    this.K = this;
                    this.getSelectionModel().setSelectionMode(1);
                    this.setAutoscrolls(false);
                    this.B = new DefaultMutableTreeNode("root");
                    this.y = new fy_0((DefaultMutableTreeNode)this.B);
                    this.setModel((fy_0)this.y);
                    this.i = new LE();
                    this.setCellRenderer((LE)this.i);
                    this.setEditable(true);
                    DN dN = new DN();
                    KC kC = new KC(this, dN);
                    this.setCellEditor(kC);
                    ((a3)this.K).setDragEnabled(true);
                    ((a3)this.K).setDropMode(DropMode.ON);
                    ((a3)this.K).setTransferHandler(new nK((a3)this.K));
                    ((a3)this.K).getSelectionModel().setSelectionMode(4);
                    ((a3)this.K).setEditable(true);
                    this.getSelectionModel().addTreeSelectionListener(new ve_0(this));
                    this.addMouseListener(new VY(this));
                    ((a3)this.K).addTreeWillExpandListener(new LD(this));
                    ((a3)this.K).addMouseMotionListener(new DO(this));
                    this.D = new tf_2();
                    File file = new File((String)dd_1.d);
                    bl2 = file.exists();
                    if (nArray == null) break block25;
                    if (!bl2) {
                        file.mkdirs();
                    }
                    try {
                        this.D.t(file);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.D.D("连接");
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ((fy_0)this.y).nodeStructureChanged((DefaultMutableTreeNode)this.B);
                    if (nArray == null) break block26;
                    bl2 = bl;
                }
                if (bl2) {
                    try {
                        this.f(true);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                this.getSelectionModel().addTreeSelectionListener(new zJ(this, kl_22));
                this.addMouseListener(new qy_0(this));
            }
            for (KeyListener keyListener : keyListenerArray = this.getKeyListeners()) {
                this.removeKeyListener(keyListener);
                if (nArray != null) {
                    if (nArray != null) continue;
                }
                break block21;
            }
            this.addKeyListener(new cg_1(this));
            this.addKeyListener(new fk_2(this));
        }
    }

    public void y() {
        try {
            lk_0.C(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public ck_2 q(String string) {
        block3: {
            Object object;
            block2: {
                DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.r).get(string);
                int[] nArray = a3.I();
                object = defaultMutableTreeNode;
                if (nArray == null) break block2;
                if (object == null) break block3;
                object = defaultMutableTreeNode.getUserObject();
            }
            return (ck_2)object;
        }
        return null;
    }

    public tf_2 c(String string) {
        block3: {
            Object object;
            block2: {
                DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.r).get(string);
                int[] nArray = a3.I();
                object = defaultMutableTreeNode;
                if (nArray == null) break block2;
                if (object == null) break block3;
                object = defaultMutableTreeNode.getUserObject();
            }
            return (tf_2)object;
        }
        return null;
    }

    public tf_2 f() {
        DefaultMutableTreeNode defaultMutableTreeNode;
        try {
            defaultMutableTreeNode = (DefaultMutableTreeNode)this.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode;
        tf_2 tf_22 = (tf_2)defaultMutableTreeNode2.getUserObject();
        return tf_22;
    }

    public void U(DefaultMutableTreeNode defaultMutableTreeNode, tf_2 tf_22) {
        block13: {
            List list;
            int[] nArray = a3.I();
            try {
                try {
                    this.w(tf_22);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                list = (List)tf_22.f();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            for (tf_2 tf_23 : list) {
                DefaultMutableTreeNode defaultMutableTreeNode2;
                try {
                    defaultMutableTreeNode2 = (DefaultMutableTreeNode)this.r((Object)defaultMutableTreeNode, (Object)tf_23);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                DefaultMutableTreeNode defaultMutableTreeNode3 = defaultMutableTreeNode2;
                try {
                    if (nArray != null) {
                        if (nArray != null) continue;
                        break;
                    }
                    break block13;
                }
                catch (Exception exception) {
                    throw a3.a(exception);
                }
            }
            ((fy_0)this.y).nodeChanged(defaultMutableTreeNode);
        }
    }

    public void s(DefaultMutableTreeNode defaultMutableTreeNode, tf_2 tf_22, TreePath treePath, String string, boolean bl, boolean bl2) {
        block36: {
            a3 a32;
            block38: {
                block39: {
                    boolean bl3;
                    int[] nArray;
                    block37: {
                        String string2;
                        block34: {
                            block35: {
                                Object object;
                                Object object2;
                                String string3;
                                String string4;
                                String string5;
                                int[] nArray2 = a3.I();
                                this.V = tf_22;
                                nArray = nArray2;
                                try {
                                    string5 = (String)tf_22.k();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                bl3 = ((HashSet)this.Z).contains(string5);
                                if (nArray == null) break block34;
                                if (bl3) break block35;
                                try {
                                    string4 = (String)tf_22.k();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                bl3 = ((HashSet)this.P).contains(string4);
                                if (nArray == null) break block34;
                                if (bl3) break block35;
                                try {
                                    string3 = (String)tf_22.k();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)((HashMap)this.r).get(string3);
                                try {
                                    object2 = tf_22.k();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    this.H(object2);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    object = tf_22.k();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    this.v(object);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (nArray != null) {
                                    boolean bl4;
                                    try {
                                        bl4 = (Boolean)tf_22.z();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (!bl4) {
                                        try {
                                            this.o.c(true);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                    }
                                    try {
                                        yt_1.F.J(new kq_0(this, defaultMutableTreeNode, tf_22, defaultMutableTreeNode2, bl2, treePath, string, bl));
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                                if (nArray != null) break block36;
                            }
                            try {
                                bl3 = (Boolean)tf_22.z();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        if (nArray == null) break block37;
                        if (bl3) break block36;
                        a32 = this;
                        if (nArray == null) break block38;
                        try {
                            string2 = (String)tf_22.k();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        bl3 = ((HashSet)a32.P).contains(string2);
                    }
                    if (!bl3) break block39;
                    try {
                        this.o.c(true);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (nArray != null) break block36;
                }
                a32 = this;
            }
            try {
                a32.o.c(false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void X(String string, boolean bl) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.r).get(string);
        try {
            this.A(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        SwingUtilities.invokeLater(new bu_2(this, bl));
    }

    public Rectangle h() {
        Rectangle rectangle;
        Object object;
        try {
            object = this.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            rectangle = (Rectangle)this.f(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return rectangle;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public DefaultMutableTreeNode C(TreePath treePath) {
        int[] nArray = a3.I();
        Object object = treePath;
        if (nArray != null) {
            if (object == null) return null;
            object = treePath.getLastPathComponent();
        }
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)object;
        return defaultMutableTreeNode;
    }

    @Override
    public DefaultMutableTreeNode i(int n10) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        try {
            defaultMutableTreeNode = (DefaultMutableTreeNode)this.C(this.getPathForRow(n10));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return defaultMutableTreeNode;
    }

    public int p(Point point) {
        int n10;
        try {
            n10 = (Integer)this.Y((Object)point, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }

    @Override
    public DefaultMutableTreeNode o(Point point) {
        int n10;
        DefaultMutableTreeNode defaultMutableTreeNode = null;
        try {
            n10 = (Integer)this.p(point);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n11 = n10;
        if (n11 > -1) {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            try {
                defaultMutableTreeNode2 = (DefaultMutableTreeNode)this.i(n11);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            defaultMutableTreeNode = defaultMutableTreeNode2;
        }
        return defaultMutableTreeNode;
    }

    public int Y(Point point, boolean bl) {
        int n10;
        block7: {
            int[] nArray = a3.I();
            if ((a3)this.K != null) {
                int n11 = 0;
                while (n11 < ((a3)this.K).getRowCount()) {
                    Rectangle rectangle;
                    try {
                        rectangle = (Rectangle)this.m(n11, bl);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    Rectangle rectangle2 = rectangle;
                    if (nArray != null) {
                        n10 = rectangle2.contains(point) ? 1 : 0;
                        if (nArray == null) break block7;
                        if (n10 != 0) {
                            return n11;
                        }
                        ++n11;
                    }
                    if (nArray != null) continue;
                }
            }
            n10 = -1;
        }
        return n10;
    }

    public Rectangle m(int n10, boolean bl) {
        Rectangle rectangle;
        if (bl) {
            try {
                rectangle = (Rectangle)this.M(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } else {
            rectangle = ((a3)this.K).getRowBounds(n10);
        }
        return rectangle;
    }

    public Rectangle l(DefaultMutableTreeNode defaultMutableTreeNode) {
        Rectangle rectangle;
        int n10;
        try {
            n10 = (Integer)this.r(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            rectangle = (Rectangle)this.M(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return rectangle;
    }

    public int r(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath;
        try {
            treePath = (TreePath)this.y(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return this.getRowForPath(treePath);
    }

    public Rectangle M(int n10) {
        Rectangle rectangle = ((a3)this.K).getRowBounds(n10);
        int[] nArray = a3.I();
        Rectangle rectangle2 = rectangle;
        if (nArray != null) {
            if (rectangle2 != null) {
                Insets insets = ((a3)this.K).getInsets();
                rectangle.x = insets.left;
                rectangle.width = ((a3)this.K).getWidth() - insets.left - insets.right;
            }
            rectangle2 = rectangle;
        }
        return rectangle2;
    }

    @Override
    public void A(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath;
        try {
            treePath = (TreePath)this.y(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        TreePath treePath2 = treePath;
        if (treePath2 != null) {
            this.setSelectionPath(treePath2);
        }
    }

    public DefaultMutableTreeNode M(String string) {
        return (DefaultMutableTreeNode)((HashMap)this.r).get(string);
    }

    public void Y(String string) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        try {
            defaultMutableTreeNode = (DefaultMutableTreeNode)this.K.M(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode;
        ((fy_0)this.y).removeNodeFromParent(defaultMutableTreeNode2);
    }

    /*
     * Unable to fully structure code
     */
    public tf_2 Z(String var1_1, String var2_2, String var3_3, boolean var4_4, tf_2 var5_5, DefaultMutableTreeNode var6_6) {
        block44: {
            block43: {
                var7_7 = a3.I();
                v0 = var6_6;
                if (var7_7 == null) break block43;
                if (v0 != null) break block44;
                v0 = (DefaultMutableTreeNode)((HashMap)this.r).get(var1_1);
            }
            var6_6 = v0;
        }
        var8_8 = null;
        var9_9 = (DefaultMutableTreeNode)var6_6.getParent();
        var9_9.getUserObject();
        var10_10 = (tf_2)var9_9.getUserObject();
        try {
            v1 = (String)var5_5.k();
        }
        catch (InvocationTargetException v2) {
            throw v2.getTargetException();
        }
        var11_11 = v1;
        var12_12 = (DefaultMutableTreeNode)((HashMap)this.r).get(var11_11);
        ((HashMap)this.r).remove(var11_11);
        try {
            this.u((Object)var2_2, (Object)var12_12);
        }
        catch (InvocationTargetException v3) {
            throw v3.getTargetException();
        }
        v4 = var5_5;
        if (var7_7 == null) ** GOTO lbl43
        try {
            v5 = (Boolean)v4.z();
        }
        catch (InvocationTargetException v6) {
            throw v6.getTargetException();
        }
        if (v5) {
            var8_8 = new tf_2(new File(var2_2));
        } else {
            v4 = var5_5;
lbl43:
            // 2 sources

            var8_8 = v4;
            try {
                var8_8.u(var2_2);
            }
            catch (InvocationTargetException v7) {
                throw v7.getTargetException();
            }
            try {
                var8_8.h(var3_3);
            }
            catch (InvocationTargetException v8) {
                throw v8.getTargetException();
            }
        }
        var12_12.setUserObject(var8_8);
        try {
            var10_10.q();
        }
        catch (InvocationTargetException v9) {
            throw v9.getTargetException();
        }
        try {
            var10_10.f();
        }
        catch (InvocationTargetException v10) {
            throw v10.getTargetException();
        }
        try {
            v11 = (Integer)var10_10.y(var2_2);
        }
        catch (InvocationTargetException v12) {
            throw v12.getTargetException();
        }
        var13_13 = v11;
        try {
            v13 = (Boolean)this.x(var9_9);
        }
        catch (InvocationTargetException v14) {
            throw v14.getTargetException();
        }
        var14_14 = v13;
        try {
            v15 = (Boolean)this.x(var12_12);
        }
        catch (InvocationTargetException v16) {
            throw v16.getTargetException();
        }
        var15_15 = v15;
        ((fy_0)this.y).removeNodeFromParent(var12_12);
        try {
            this.d((Object)var12_12, (Object)var9_9, var13_13);
        }
        catch (InvocationTargetException v17) {
            throw v17.getTargetException();
        }
        v18 = var14_14;
        if (var7_7 != null) {
            if (v18) {
                this.expandPath(new TreePath(var9_9.getPath()));
            }
            v18 = var15_15;
        }
        if (var7_7 != null) {
            if (v18) {
                this.expandPath(new TreePath(var12_12.getPath()));
            }
            v18 = var4_4;
        }
        if (var7_7 != null) {
            if (v18) {
                try {
                    this.A(var12_12);
                }
                catch (InvocationTargetException v19) {
                    throw v19.getTargetException();
                }
            }
            v18 = ((HashSet)this.Z).contains(var1_1);
        }
        if (var7_7 != null) {
            if (v18) {
                try {
                    this.H(var2_2);
                }
                catch (InvocationTargetException v20) {
                    throw v20.getTargetException();
                }
            }
            ((HashSet)this.Z).remove(var1_1);
            v18 = ((HashSet)this.P).remove(var1_1);
        }
        try {
            this.i((Object)var6_6, (Object)var2_2, var1_1);
        }
        catch (InvocationTargetException v21) {
            throw v21.getTargetException();
        }
        ((km_0)this.h).getRowSorter().allRowsChanged();
        if (ky_2.F() != null) {
            a3.h(new int[3]);
        }
        return var8_8;
    }

    public ck_2 F(String string, String string2, String string3) {
        ck_2 ck_22;
        String string4;
        try {
            string4 = (String)lk_0.M(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string5 = string4;
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.r).get(string5);
        tf_2 tf_22 = (tf_2)defaultMutableTreeNode.getUserObject();
        try {
            ck_22 = (ck_2)tf_22.o(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ck_2 ck_23 = ck_22;
        try {
            ck_23.o(string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            ck_23.T(string3);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            tf_22.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            tf_22.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((km_0)this.h).getRowSorter().allRowsChanged();
        return ck_23;
    }

    void i(DefaultMutableTreeNode defaultMutableTreeNode, String string, String string2) {
        Object object;
        block6: {
            int[] nArray = a3.I();
            for (int i2 = 0; i2 < defaultMutableTreeNode.getChildCount(); ++i2) {
                DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)defaultMutableTreeNode.getChildAt(i2);
                object = this;
                if (nArray != null) {
                    try {
                        object.G((Object)defaultMutableTreeNode2, (Object)string, string2);
                        continue;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                break block6;
            }
            object = defaultMutableTreeNode.getUserObject();
        }
        tf_2 tf_22 = (tf_2)object;
        try {
            this.O((Object)tf_22, (Object)string, string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void f(String string, String string2) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        int[] nArray = a3.I();
        HashSet<Object> hashSet = (HashSet)this.Z;
        if (nArray != null) {
            if (hashSet.contains(string2)) {
                ((HashSet)this.Z).remove(string2);
                try {
                    this.H(string);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            hashSet = ((HashMap)this.r).remove(string2);
        }
        if ((defaultMutableTreeNode = (DefaultMutableTreeNode)((Object)hashSet)) != null) {
            try {
                this.u((Object)string, (Object)defaultMutableTreeNode);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    void O(tf_2 tf_22, String string, String string2) {
        List list;
        try {
            list = (List)tf_22.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        List list2 = list;
        Iterator iterator = list2.iterator();
        int[] nArray = a3.I();
        while (iterator.hasNext()) {
            String string3;
            String string4;
            ck_2 ck_22 = (ck_2)iterator.next();
            try {
                string4 = (String)ck_22.d();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string5 = string4;
            try {
                string3 = (String)this.n((Object)string5, (Object)string, string2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string6 = string3;
            try {
                ck_22.o(string6);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (nArray != null) continue;
        }
    }

    void G(DefaultMutableTreeNode defaultMutableTreeNode, String string, String string2) {
        block19: {
            boolean bl;
            block20: {
                Object object;
                block21: {
                    String string3;
                    String string4;
                    object = defaultMutableTreeNode.getUserObject();
                    int[] nArray = a3.I();
                    bl = object.getClass().equals(tf_2.class);
                    if (nArray == null) break block20;
                    if (!bl) break block21;
                    tf_2 tf_22 = (tf_2)object;
                    try {
                        string4 = (String)tf_22.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String string5 = string4;
                    try {
                        string3 = (String)this.n((Object)string5, (Object)string, string2);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String string6 = string3;
                    try {
                        tf_22.u(string6);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.O((Object)tf_22, (Object)string, string2);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.f((Object)string6, (Object)string5);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    for (int i2 = 0; i2 < defaultMutableTreeNode.getChildCount(); ++i2) {
                        DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)defaultMutableTreeNode.getChildAt(i2);
                        try {
                            this.G((Object)defaultMutableTreeNode2, (Object)string, string2);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (nArray != null) {
                            if (nArray != null) continue;
                        }
                        break block19;
                    }
                    if (nArray != null) break block19;
                }
                bl = object.getClass().equals(ck_2.class);
            }
            if (bl) {
                // empty if block
            }
        }
    }

    String n(String string, String string2, String string3) {
        String string4 = string2 + string.substring(string3.length());
        return string4;
    }

    public void m(String string) {
        block8: {
            DefaultMutableTreeNode defaultMutableTreeNode;
            int[] nArray;
            DefaultMutableTreeNode defaultMutableTreeNode2;
            block7: {
                defaultMutableTreeNode2 = (DefaultMutableTreeNode)((HashMap)this.r).get(string);
                nArray = a3.I();
                defaultMutableTreeNode = defaultMutableTreeNode2;
                if (nArray == null) break block7;
                if (defaultMutableTreeNode == null) break block8;
                defaultMutableTreeNode = (DefaultMutableTreeNode)defaultMutableTreeNode2.getParent();
            }
            DefaultMutableTreeNode defaultMutableTreeNode3 = defaultMutableTreeNode;
            tf_2 tf_22 = (tf_2)defaultMutableTreeNode3.getUserObject();
            try {
                tf_22.m(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((HashMap)this.r).remove(string);
            ((HashSet)this.Z).remove(string);
            a3 a32 = this;
            if (nArray != null) {
                ((HashSet)a32.P).remove(string);
                if (defaultMutableTreeNode2 != null) {
                    ((fy_0)this.y).removeNodeFromParent(defaultMutableTreeNode2);
                }
                a32 = this;
            }
            try {
                a32.z.O(tf_22);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void i(String string) {
        block8: {
            Object object;
            block7: {
                String string2;
                try {
                    string2 = (String)lk_0.M(string);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string3 = string2;
                int[] nArray = a3.I();
                DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.r).get(string3);
                object = defaultMutableTreeNode;
                if (nArray == null) break block7;
                if (object == null) break block8;
                object = defaultMutableTreeNode.getUserObject();
            }
            tf_2 tf_22 = (tf_2)object;
            try {
                tf_22.F(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.z.O(tf_22);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public ck_2 G(String string, String string2, boolean bl) {
        ck_2 ck_22 = null;
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.r).get(string);
        ((HashMap)this.r).remove(string);
        try {
            this.u((Object)string2, (Object)defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.f((Object)string2, (Object)string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ck_22 = new ck_2(new File(string2));
        defaultMutableTreeNode.setUserObject(ck_22);
        ((fy_0)this.y).nodeChanged(defaultMutableTreeNode);
        return ck_22;
    }

    public ck_2 U(String string, String string2, boolean bl) {
        ck_2 ck_22 = null;
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.r).get(string);
        ((HashMap)this.r).remove(string);
        try {
            this.u((Object)string2, (Object)defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ck_22 = new ck_2(new File(string2));
        defaultMutableTreeNode.setUserObject(ck_22);
        ((fy_0)this.y).nodeChanged(defaultMutableTreeNode);
        return ck_22;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String convertValueToText(Object object, boolean bl, boolean bl2, boolean bl3, int n10, boolean bl4) {
        String string;
        int[] nArray = a3.I();
        Object object2 = object;
        if (nArray != null) {
            if (object2 == null) return "";
            object2 = object;
        }
        String string2 = string = object2.toString();
        if (nArray == null) return string2;
        if (string2 == null) return "";
        return string;
    }

    /*
     * Loose catch block
     */
    public void f(boolean bl) {
        block23: {
            DefaultMutableTreeNode defaultMutableTreeNode;
            block21: {
                this.setRootVisible(false);
                int[] nArray = a3.I();
                try {
                    this.j(this.f, bl, true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                int[] nArray2 = nArray;
                tf_2 tf_22 = (tf_2)((DefaultMutableTreeNode)((HashMap)this.r).get((String)this.f)).getUserObject();
                try {
                    this.z.O(tf_22);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                File[] fileArray = File.listRoots();
                String string = fileArray[0].getAbsolutePath();
                for (int i2 = 0; i2 < a3.b(4348, 3302863423431288961L); ++i2) {
                    block22: {
                        DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)((HashMap)this.r).get(string);
                        if (nArray2 == null) continue;
                        try {
                            block24: {
                                defaultMutableTreeNode = defaultMutableTreeNode2;
                                if (nArray2 == null) break block21;
                                break block24;
                                catch (InterruptedException interruptedException) {
                                    throw a3.a(interruptedException);
                                }
                            }
                            if (defaultMutableTreeNode == null) break block22;
                        }
                        catch (InterruptedException interruptedException) {
                            throw a3.a(interruptedException);
                        }
                        try {
                            this.A(defaultMutableTreeNode2);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        DefaultMutableTreeNode defaultMutableTreeNode3 = (DefaultMutableTreeNode)((DefaultMutableTreeNode)this.B).getChildAt(0);
                        try {
                            this.A(defaultMutableTreeNode3);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (nArray2 != null) break;
                    }
                    try {
                        Thread.sleep(a3.c(24859, 2150559354459530008L));
                        continue;
                    }
                    catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    if (nArray2 != null) continue;
                }
                try {
                    boolean bl2;
                    try {
                        bl2 = (Boolean)vk_0.s();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl2) break block23;
                    defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.r).get("/");
                }
                catch (InterruptedException interruptedException) {
                    throw a3.a(interruptedException);
                }
            }
            DefaultMutableTreeNode defaultMutableTreeNode4 = defaultMutableTreeNode;
            try {
                this.X(defaultMutableTreeNode4);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Exception decompiling
     */
    public void j(String var1_1, boolean var2_2, boolean var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [62[DOLOOP]], but top level block is 6[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    void g(TreeExpansionEvent treeExpansionEvent) {
        this.W = System.currentTimeMillis();
        try {
            yt_1.F.J(new va_0(this, treeExpansionEvent));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public DefaultMutableTreeNode J(DefaultMutableTreeNode defaultMutableTreeNode, tf_2 tf_22, int n10) {
        int[] nArray;
        ArrayList<Serializable> arrayList;
        DefaultMutableTreeNode defaultMutableTreeNode2;
        block23: {
            Iterator iterator;
            block22: {
                List list;
                List list2;
                Object object;
                int[] nArray2 = a3.I();
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(tf_22);
                try {
                    object = tf_22.k();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.u(object, (Object)defaultMutableTreeNode2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.d((Object)defaultMutableTreeNode2, (Object)defaultMutableTreeNode, n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                arrayList = new ArrayList<Serializable>();
                try {
                    list2 = (List)tf_22.f();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                iterator = list2.iterator();
                nArray = nArray2;
                while (iterator.hasNext()) {
                    tf_2 serializable = (tf_2)iterator.next();
                    arrayList.add(serializable);
                    if (nArray != null) {
                        if (nArray != null) continue;
                    }
                    break block22;
                }
                try {
                    list = (List)tf_22.M();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                iterator = list.iterator();
            }
            while (iterator.hasNext()) {
                ck_2 ck_22 = (ck_2)iterator.next();
                arrayList.add(ck_22);
                if (nArray != null) {
                    if (nArray != null) continue;
                }
                break block23;
            }
            Collections.sort(arrayList, new mZ(this));
        }
        for (Object e2 : arrayList) {
            block26: {
                String string;
                Object object;
                Serializable serializable;
                String string2;
                block27: {
                    boolean bl;
                    block24: {
                        block25: {
                            String string3;
                            string2 = "";
                            bl = e2.getClass().equals(ck_2.class);
                            if (nArray == null) break block24;
                            if (!bl) break block25;
                            serializable = (ck_2)e2;
                            try {
                                string3 = (String)serializable.d();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            string2 = string3;
                            if (nArray != null) break block26;
                        }
                        object = e2.getClass();
                        if (nArray == null) break block27;
                        bl = object.equals(tf_2.class);
                    }
                    if (!bl) break block26;
                    object = e2;
                }
                serializable = (tf_2)object;
                try {
                    string = (String)serializable.k();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                string2 = string;
                try {
                    this.J((Object)defaultMutableTreeNode2, (Object)serializable, defaultMutableTreeNode2.getChildCount());
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            if (nArray != null) continue;
        }
        return defaultMutableTreeNode2;
    }

    int V(Object object) {
        int n10;
        block22: {
            int n11;
            block21: {
                Serializable serializable;
                int[] nArray;
                block19: {
                    block20: {
                        int n12;
                        int n13;
                        Object object2;
                        n11 = 0;
                        nArray = a3.I();
                        n10 = object.getClass().equals(ck_2.class);
                        if (nArray == null) break block19;
                        if (n10 == 0) break block20;
                        serializable = (ck_2)object;
                        try {
                            object2 = serializable.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n13 = (Integer)this.I.Q(object2);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            serializable.l(n13);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n12 = (Integer)serializable.p();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n11 = n12;
                        if (nArray != null) break block21;
                    }
                    n10 = object.getClass().equals(tf_2.class) ? 1 : 0;
                }
                if (nArray == null) break block22;
                if (n10 != 0) {
                    int n14;
                    int n15;
                    Object object3;
                    serializable = (tf_2)object;
                    try {
                        object3 = serializable.M();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        n15 = (Integer)this.I.Q(object3);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        serializable.z(n15);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        n14 = (Integer)serializable.r();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n11 = n14;
                }
            }
            n10 = n11;
        }
        return n10;
    }

    public void F(DefaultMutableTreeNode defaultMutableTreeNode, ck_2 ck_22) {
        Object object;
        try {
            object = ck_22.d();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.u(object, (Object)defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void u(String string, DefaultMutableTreeNode defaultMutableTreeNode) {
        ((HashMap)this.r).put(string, defaultMutableTreeNode);
    }

    public void c(DefaultMutableTreeNode defaultMutableTreeNode, tf_2 tf_22) {
        Object object;
        try {
            object = tf_22.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.u(object, (Object)defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void M(String string) {
        ((HashMap)this.r).remove(string);
    }

    public void w(DefaultMutableTreeNode defaultMutableTreeNode, tf_2 tf_22, boolean bl, Boolean bl2, DefaultMutableTreeNode defaultMutableTreeNode2, boolean bl3) throws Exception {
        List list;
        HashSet<String> hashSet;
        int[] nArray;
        block28: {
            block26: {
                block27: {
                    DefaultMutableTreeNode defaultMutableTreeNode3;
                    nArray = a3.I();
                    try {
                        if (defaultMutableTreeNode2 != null) break block26;
                        if (bl3) {
                        }
                        break block27;
                    }
                    catch (Exception exception) {
                        throw a3.a(exception);
                    }
                    try {
                        defaultMutableTreeNode3 = (DefaultMutableTreeNode)this.r((Object)defaultMutableTreeNode, (Object)tf_22);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    defaultMutableTreeNode2 = defaultMutableTreeNode3;
                    if (nArray != null) break block26;
                }
                defaultMutableTreeNode2 = defaultMutableTreeNode;
            }
            hashSet = new HashSet<String>();
            for (int i2 = 0; i2 < defaultMutableTreeNode2.getChildCount(); ++i2) {
                DefaultMutableTreeNode defaultMutableTreeNode4 = (DefaultMutableTreeNode)defaultMutableTreeNode2.getChildAt(i2);
                tf_2 tf_23 = (tf_2)defaultMutableTreeNode4.getUserObject();
                try {
                    String string;
                    try {
                        string = (String)tf_23.M();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    hashSet.add(string);
                    if (nArray != null) {
                        if (nArray != null) continue;
                        break;
                    }
                    break block28;
                }
                catch (Exception exception) {
                    throw a3.a(exception);
                }
            }
            try {
                this.w(tf_22);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        ArrayList<DefaultMutableTreeNode> arrayList = new ArrayList<DefaultMutableTreeNode>();
        try {
            list = (List)tf_22.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        for (tf_2 tf_23 : list) {
            String string;
            try {
                string = (String)tf_23.M();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (!hashSet.contains(string)) {
                DefaultMutableTreeNode defaultMutableTreeNode5;
                try {
                    defaultMutableTreeNode5 = (DefaultMutableTreeNode)this.r((Object)defaultMutableTreeNode2, (Object)tf_23);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                DefaultMutableTreeNode defaultMutableTreeNode6 = defaultMutableTreeNode5;
                arrayList.add(defaultMutableTreeNode6);
            }
            if (nArray != null) continue;
        }
    }

    synchronized DefaultMutableTreeNode r(DefaultMutableTreeNode defaultMutableTreeNode, tf_2 tf_22) {
        Object object;
        DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode(tf_22);
        try {
            object = tf_22.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.u(object, (Object)defaultMutableTreeNode2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.d((Object)defaultMutableTreeNode2, (Object)defaultMutableTreeNode, defaultMutableTreeNode.getChildCount());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return defaultMutableTreeNode2;
    }

    public void w(String string, String string2, boolean bl) {
        block34: {
            a3 a32;
            tf_2 tf_22;
            block30: {
                block31: {
                    a3 a33;
                    int[] nArray;
                    DefaultMutableTreeNode defaultMutableTreeNode;
                    block32: {
                        block33: {
                            List list;
                            Object object;
                            String string3;
                            String string4;
                            String string5;
                            int n10;
                            DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)((HashMap)this.r).get(string);
                            defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.r).get(string2);
                            DefaultMutableTreeNode defaultMutableTreeNode3 = (DefaultMutableTreeNode)defaultMutableTreeNode2.getParent();
                            DefaultMutableTreeNode defaultMutableTreeNode4 = (DefaultMutableTreeNode)defaultMutableTreeNode.getParent();
                            tf_2 tf_23 = (tf_2)defaultMutableTreeNode2.getUserObject();
                            tf_2 tf_24 = (tf_2)defaultMutableTreeNode.getUserObject();
                            tf_22 = (tf_2)defaultMutableTreeNode3.getUserObject();
                            int[] nArray2 = a3.I();
                            ((fy_0)this.y).removeNodeFromParent(defaultMutableTreeNode2);
                            nArray = nArray2;
                            try {
                                n10 = (Integer)this.X((Object)defaultMutableTreeNode, (Object)tf_23);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            int n11 = n10;
                            try {
                                this.d((Object)defaultMutableTreeNode2, (Object)defaultMutableTreeNode, n11);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                tf_22.m(string);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                string5 = (String)lk_0.e(string2);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            String string6 = string5;
                            try {
                                string4 = (String)tf_24.k();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                string3 = (String)tf_23.M();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            String string7 = string4 + string6 + string3;
                            a32 = this;
                            if (nArray == null) break block30;
                            try {
                                object = tf_23.k();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                a32.G((Object)defaultMutableTreeNode2, (Object)string7, object);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                list = (List)tf_24.f();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            list.add(tf_23);
                            try {
                                tf_23.u(string7);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                tf_24.q();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (!bl) break block31;
                            a33 = this;
                            if (nArray == null) break block32;
                            if (!a33.isExpanded(new TreePath(defaultMutableTreeNode.getPath()))) break block33;
                            try {
                                this.A(defaultMutableTreeNode2);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (nArray != null) break block34;
                        }
                        a33 = this;
                    }
                    try {
                        a33.A(defaultMutableTreeNode);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (nArray != null) break block34;
                }
                a32 = this;
            }
            try {
                a32.z.O(tf_22);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void P(String string, String string2, String string3) {
        String string4;
        ck_2 ck_22;
        String string5;
        String string6;
        try {
            string6 = (String)lk_0.M(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string7 = string6;
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.r).get(string7);
        tf_2 tf_22 = (tf_2)defaultMutableTreeNode.getUserObject();
        try {
            string5 = (String)lk_0.e(string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string8 = string5;
        String string9 = string2 + string8 + string3;
        try {
            ck_22 = (ck_2)tf_22.o(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ck_2 ck_23 = ck_22;
        try {
            ck_23.o(string9);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            ck_23.T(string3);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string4 = (String)lk_0.M(string9);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string10 = string4;
        DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)((HashMap)this.r).get(string10);
        tf_2 tf_23 = (tf_2)defaultMutableTreeNode2.getUserObject();
        try {
            tf_23.I(ck_23);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            tf_23.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            tf_22.F(string9);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.z.O(tf_22);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public synchronized void d(MutableTreeNode mutableTreeNode, MutableTreeNode mutableTreeNode2, int n10) {
        ((fy_0)this.y).insertNodeInto(mutableTreeNode, mutableTreeNode2, n10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void x(tf_2 var1_1) {
        block91: {
            block90: {
                block89: {
                    try {
                        v0 = (List)var1_1.f();
                    }
                    catch (InvocationTargetException v1) {
                        throw v1.getTargetException();
                    }
                    var3_2 = v0;
                    try {
                        v2 = (List)var1_1.M();
                    }
                    catch (InvocationTargetException v3) {
                        throw v3.getTargetException();
                    }
                    var4_3 = v2;
                    var2_4 = a3.I();
                    try {
                        v4 = (String)var1_1.k();
                    }
                    catch (InvocationTargetException v5) {
                        throw v5.getTargetException();
                    }
                    var5_5 = (DefaultMutableTreeNode)((HashMap)this.r).get(v4);
                    v6 = var5_5;
                    if (var2_4 != null) {
                        if (v6 == null) {
                            return;
                        }
                        v6 = var5_5.getUserObject();
                    }
                    var6_6 = (tf_2)v6;
                    var7_7 = new ArrayList<String>();
                    try {
                        v7 = (List)var6_6.f();
                    }
                    catch (InvocationTargetException v8) {
                        throw v8.getTargetException();
                    }
                    var8_8 = v7.iterator();
                    while (var8_8.hasNext()) {
                        block93: {
                            block92: {
                                var9_9 = (tf_2)var8_8.next();
                                v9 /* !! */  = var3_2;
                                if (var2_4 == null) break block92;
                                try {
                                    v10 = var9_9.k();
                                }
                                catch (InvocationTargetException v11) {
                                    throw v11.getTargetException();
                                }
                                try {
                                    v12 = (Boolean)lk_0.K((Object)v9 /* !! */, v10);
                                }
                                catch (InvocationTargetException v13) {
                                    throw v13.getTargetException();
                                }
                                if (var2_4 == null) ** GOTO lbl83
                                if (v12) break block93;
                                try {
                                    v14 = (String)var9_9.k();
                                }
                                catch (InvocationTargetException v15) {
                                    throw v15.getTargetException();
                                }
                                v9 /* !! */  = ((HashMap)this.r).get(v14);
                            }
                            var10_10 = (DefaultMutableTreeNode)v9 /* !! */ ;
                            try {
                                v16 = (String)var9_9.k();
                            }
                            catch (InvocationTargetException v17) {
                                throw v17.getTargetException();
                            }
                            var7_7.add(v16);
                            try {
                                this.N(var10_10);
                            }
                            catch (InvocationTargetException v18) {
                                throw v18.getTargetException();
                            }
                        }
                        if (var2_4 != null) continue;
                    }
                    var8_8 = var7_7.iterator();
                    do {
                        v12 = var8_8.hasNext();
lbl83:
                        // 2 sources

                        if (!v12) break;
                        var9_9 = (String)var8_8.next();
                        try {
                            var6_6.m(var9_9);
                        }
                        catch (InvocationTargetException v19) {
                            throw v19.getTargetException();
                        }
                        if (var2_4 == null) break block89;
                    } while (var2_4 != null);
                    var8_8 = var3_2.iterator();
                }
                while (var8_8.hasNext()) {
                    var9_9 = (tf_2)var8_8.next();
                    try {
                        v20 = var6_6.f();
                    }
                    catch (InvocationTargetException v21) {
                        throw v21.getTargetException();
                    }
                    try {
                        v22 = var9_9.k();
                    }
                    catch (InvocationTargetException v23) {
                        throw v23.getTargetException();
                    }
                    try {
                        v24 = (Boolean)lk_0.K(v20, v22);
                    }
                    catch (InvocationTargetException v25) {
                        throw v25.getTargetException();
                    }
                    if (!v24) {
                        var10_10 = new DefaultMutableTreeNode(var9_9);
                        try {
                            v26 = var9_9.k();
                        }
                        catch (InvocationTargetException v27) {
                            throw v27.getTargetException();
                        }
                        try {
                            this.u(v26, var10_10);
                        }
                        catch (InvocationTargetException v28) {
                            throw v28.getTargetException();
                        }
                        try {
                            v29 = (List)var6_6.f();
                        }
                        catch (InvocationTargetException v30) {
                            throw v30.getTargetException();
                        }
                        v29.add(var9_9);
                        try {
                            var6_6.q();
                        }
                        catch (InvocationTargetException v31) {
                            throw v31.getTargetException();
                        }
                        try {
                            v32 = var6_6.f();
                        }
                        catch (InvocationTargetException v33) {
                            throw v33.getTargetException();
                        }
                        try {
                            v34 = (Integer)lk_0.b(v32, var9_9);
                        }
                        catch (InvocationTargetException v35) {
                            throw v35.getTargetException();
                        }
                        var11_11 = v34;
                        try {
                            this.d(var10_10, (Object)var5_5, var11_11);
                        }
                        catch (InvocationTargetException v36) {
                            throw v36.getTargetException();
                        }
                    }
                    if (var2_4 != null) continue;
                }
                var8_8 = new ArrayList<E>();
                try {
                    v37 = (List)var6_6.M();
                }
                catch (InvocationTargetException v38) {
                    throw v38.getTargetException();
                }
                var9_9 = v37.iterator();
                while (var9_9.hasNext()) {
                    var10_10 = (ck_2)var9_9.next();
                    try {
                        v39 = var10_10.d();
                    }
                    catch (InvocationTargetException v40) {
                        throw v40.getTargetException();
                    }
                    try {
                        v41 = (Boolean)lk_0.E((Object)var4_3, v39);
                    }
                    catch (InvocationTargetException v42) {
                        throw v42.getTargetException();
                    }
                    if (var2_4 != null) {
                        if (var2_4 != null && !v41) {
                            try {
                                v43 = (String)var10_10.d();
                            }
                            catch (InvocationTargetException v44) {
                                throw v44.getTargetException();
                            }
                            var8_8.add(v43);
                        }
                        if (var2_4 != null) continue;
                    }
                    ** GOTO lbl197
                }
                var9_9 = var8_8.iterator();
                do {
                    v41 = var9_9.hasNext();
lbl197:
                    // 2 sources

                    if (!v41) break;
                    var10_10 = (String)var9_9.next();
                    try {
                        var6_6.F(var10_10);
                    }
                    catch (InvocationTargetException v45) {
                        throw v45.getTargetException();
                    }
                    if (var2_4 == null) break block90;
                } while (var2_4 != null);
                var9_9 = var4_3.iterator();
            }
            while (var9_9.hasNext()) {
                block95: {
                    block94: {
                        var10_10 = (ck_2)var9_9.next();
                        v46 = var6_6;
                        if (var2_4 == null) break block91;
                        try {
                            v47 = v46.M();
                        }
                        catch (InvocationTargetException v48) {
                            throw v48.getTargetException();
                        }
                        try {
                            v49 = var10_10.d();
                        }
                        catch (InvocationTargetException v50) {
                            throw v50.getTargetException();
                        }
                        try {
                            v51 = (Boolean)lk_0.E(v47, v49);
                        }
                        catch (InvocationTargetException v52) {
                            throw v52.getTargetException();
                        }
                        if (var2_4 == null) break block94;
                        if (v51) break block95;
                        try {
                            v53 = (List)var6_6.M();
                        }
                        catch (InvocationTargetException v54) {
                            throw v54.getTargetException();
                        }
                        v51 = v53.add(var10_10);
                    }
                    try {
                        var6_6.f();
                    }
                    catch (InvocationTargetException v55) {
                        throw v55.getTargetException();
                    }
                }
                if (var2_4 != null) continue;
            }
            try {
                v56 = var1_1.f();
            }
            catch (InvocationTargetException v57) {
                throw v57.getTargetException();
            }
            try {
                var6_6.b(v56);
            }
            catch (InvocationTargetException v58) {
                throw v58.getTargetException();
            }
            v46 = var6_6;
        }
        try {
            v59 = var1_1.M();
        }
        catch (InvocationTargetException v60) {
            throw v60.getTargetException();
        }
        try {
            v46.P(v59);
        }
        catch (InvocationTargetException v61) {
            throw v61.getTargetException();
        }
        var9_9 = new uf_2(uf_2.e);
        try {
            var9_9.w(var1_1);
        }
        catch (InvocationTargetException v62) {
            throw v62.getTargetException();
        }
        try {
            this.r(var9_9);
        }
        catch (InvocationTargetException v63) {
            throw v63.getTargetException();
        }
    }

    public void W(td_2 td_22) {
        ((ArrayList)this.g).add(td_22);
    }

    public void r(uf_2 uf_22) {
        SwingUtilities.invokeLater(new KI(this, uf_22));
    }

    void N(DefaultMutableTreeNode defaultMutableTreeNode) {
        block7: {
            String string;
            Object object;
            int n10;
            DefaultMutableTreeNode defaultMutableTreeNode2;
            int[] nArray;
            block9: {
                Object object2;
                block8: {
                    nArray = a3.I();
                    object2 = defaultMutableTreeNode;
                    if (nArray == null) break block8;
                    if (object2 == null) break block7;
                    object2 = defaultMutableTreeNode.getUserObject();
                }
                defaultMutableTreeNode2 = object2;
                int n11 = defaultMutableTreeNode2.getClass().equals(tf_2.class);
                if (nArray == null) break block9;
                if (n11 == 0) break block7;
                n11 = n10 = 0;
            }
            while (n10 < defaultMutableTreeNode.getChildCount()) {
                object = (DefaultMutableTreeNode)defaultMutableTreeNode.getChildAt(n10);
                try {
                    this.N(object);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ++n10;
                if (nArray != null) {
                    if (nArray != null) continue;
                }
                break block7;
            }
            tf_2 tf_22 = (tf_2)((Object)defaultMutableTreeNode2);
            try {
                string = (String)tf_22.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            object = string;
            ((HashSet)this.Z).remove(object);
            ((HashMap)this.r).remove(object);
            ((fy_0)this.y).removeNodeFromParent(defaultMutableTreeNode);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void H(tf_2 var1_1, String var2_2, String var3_3, boolean var4_4) {
        block50: {
            block49: {
                block48: {
                    block47: {
                        var6_5 = (DefaultMutableTreeNode)((HashMap)this.r).get(var2_2);
                        var7_6 = (tf_2)var6_5.getUserObject();
                        try {
                            v0 = var7_6.k();
                        }
                        catch (InvocationTargetException v1) {
                            throw v1.getTargetException();
                        }
                        try {
                            v2 = (String)lk_0.e(v0);
                        }
                        catch (InvocationTargetException v3) {
                            throw v3.getTargetException();
                        }
                        var8_7 = v2;
                        try {
                            v4 = (String)var7_6.k();
                        }
                        catch (InvocationTargetException v5) {
                            throw v5.getTargetException();
                        }
                        var9_8 = v4 + var8_7 + var3_3;
                        var5_9 = a3.I();
                        this.E = var9_8;
                        var10_10 = null;
                        try {
                            v6 = (String)var7_6.k();
                        }
                        catch (InvocationTargetException v7) {
                            throw v7.getTargetException();
                        }
                        v8 = ((HashSet)this.Z).contains(v6);
                        if (var5_9 == null) break block47;
                        if (!v8) break block48;
                        try {
                            v9 = (String)var7_6.k();
                        }
                        catch (InvocationTargetException v10) {
                            throw v10.getTargetException();
                        }
                        v8 = ((HashSet)this.P).contains(v9);
                    }
                    if (v8) break block48;
                    var11_11 = null;
                    v11 = var1_1;
                    if (var5_9 == null) ** GOTO lbl51
                    if (v11 != null) {
                        var11_11 = var1_1;
                    } else {
                        v11 = new tf_2();
lbl51:
                        // 2 sources

                        var11_11 = v11;
                        try {
                            var11_11.t(false);
                        }
                        catch (InvocationTargetException v12) {
                            throw v12.getTargetException();
                        }
                        try {
                            var11_11.u(var9_8);
                        }
                        catch (InvocationTargetException v13) {
                            throw v13.getTargetException();
                        }
                        try {
                            var11_11.h(var3_3);
                        }
                        catch (InvocationTargetException v14) {
                            throw v14.getTargetException();
                        }
                        try {
                            var11_11.W(System.currentTimeMillis());
                        }
                        catch (InvocationTargetException v15) {
                            throw v15.getTargetException();
                        }
                    }
                    try {
                        v16 = (DefaultMutableTreeNode)this.g((Object)var6_5, var11_11);
                    }
                    catch (InvocationTargetException v17) {
                        throw v17.getTargetException();
                    }
                    var10_10 = v16;
                    try {
                        v18 = (List)var7_6.f();
                    }
                    catch (InvocationTargetException v19) {
                        throw v19.getTargetException();
                    }
                    v18.add(var11_11);
                    ** if (!var4_4) goto lbl104
                }
                var11_11 = new TreePath(var6_5.getPath());
                try {
                    this.s((Object)var6_5, (Object)var7_6, var11_11, null, false, false);
                }
                catch (InvocationTargetException v20) {
                    throw v20.getTargetException();
                }
                if (var4_4) {
                    // empty if block
                } else {
                    ** GOTO lbl104
                }
lbl-1000:
                // 1 sources

                {
                    // empty if block
                }
lbl104:
                // 5 sources

                v21 = var7_6;
                if (var5_9 != null) {
                    try {
                        v21.q();
                    }
                    catch (InvocationTargetException v22) {
                        throw v22.getTargetException();
                    }
                    if (var4_4) {
                        try {
                            this.A(var6_5);
                        }
                        catch (InvocationTargetException v23) {
                            throw v23.getTargetException();
                        }
                    }
                    try {
                        v21 = (tf_2)this.z.V();
                    }
                    catch (InvocationTargetException v24) {
                        throw v24.getTargetException();
                    }
                }
                try {
                    v25 = (String)v21.k();
                }
                catch (InvocationTargetException v26) {
                    throw v26.getTargetException();
                }
                var11_11 = v25;
                v27 = var2_2.equals(var11_11);
                if (var5_9 == null) break block49;
                if (v27 == 0) break block50;
                try {
                    this.z.O(var7_6);
                }
                catch (InvocationTargetException v28) {
                    throw v28.getTargetException();
                }
                try {
                    this.h.Z(var9_8);
                }
                catch (InvocationTargetException v29) {
                    throw v29.getTargetException();
                }
                v27 = ((km_0)this.h).getSelectedRow();
            }
            if ((var12_12 = v27) > -1) {
                try {
                    this.h.V(var12_12);
                }
                catch (InvocationTargetException v30) {
                    throw v30.getTargetException();
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void P(YI var1_1, String var2_2) {
        try {
            v0 = (String)lk_0.M(var2_2);
        }
        catch (InvocationTargetException v1) {
            throw v1.getTargetException();
        }
        var4_3 = v0;
        try {
            v2 = (String)lk_0.j(var2_2);
        }
        catch (InvocationTargetException v3) {
            throw v3.getTargetException();
        }
        var5_4 = v2;
        var3_5 = a3.I();
        var6_6 = (DefaultMutableTreeNode)((HashMap)this.r).get(var4_3);
        v4 = var6_6;
        if (var3_5 != null) {
            if (v4 == null) {
                return;
            }
            v4 = var6_6.getUserObject();
        }
        var7_7 = (tf_2)v4;
        try {
            v5 = var7_7.k();
        }
        catch (InvocationTargetException v6) {
            throw v6.getTargetException();
        }
        try {
            v7 = (String)lk_0.e(v5);
        }
        catch (InvocationTargetException v8) {
            throw v8.getTargetException();
        }
        var8_8 = v7;
        v9 = this;
        if (var3_5 != null) {
            try {
                v10 = (String)var7_7.k();
            }
            catch (InvocationTargetException v11) {
                throw v11.getTargetException();
            }
            if (((HashSet)v9.Z).contains(v10)) {
                v9 = this;
                if (var3_5 != null) {
                    try {
                        v12 = (String)var7_7.k();
                    }
                    catch (InvocationTargetException v13) {
                        throw v13.getTargetException();
                    }
                    if (!((HashSet)v9.P).contains(v12)) {
                        block40: {
                            try {
                                v14 = (ck_2)var1_1.Y();
                            }
                            catch (InvocationTargetException v15) {
                                throw v15.getTargetException();
                            }
                            var9_9 = v14;
                            try {
                                v16 = (List)var7_7.M();
                            }
                            catch (InvocationTargetException v17) {
                                throw v17.getTargetException();
                            }
                            var10_10 = v16;
                            var11_11 = -1;
                            var12_12 = 0;
                            while (var12_12 < var10_10.size()) {
                                var13_13 = (ck_2)var10_10.get(var12_12);
                                if (var3_5 != null) {
                                    try {
                                        v18 = (String)var13_13.a();
                                    }
                                    catch (InvocationTargetException v19) {
                                        throw v19.getTargetException();
                                    }
                                    try {
                                        v20 = (String)var9_9.a();
                                    }
                                    catch (InvocationTargetException v21) {
                                        throw v21.getTargetException();
                                    }
                                    v22 = (int)v18.equals(v20);
                                    if (var3_5 == null) break block40;
                                    if (v22 != 0) {
                                        var11_11 = var12_12;
                                    }
                                    ++var12_12;
                                }
                                if (var3_5 != null) continue;
                            }
                            v22 = var11_11;
                        }
                        if (var3_5 != null) {
                            if (v22 > -1) {
                                var10_10.remove(var11_11);
                            }
                            v22 = (int)var10_10.add(var9_9);
                        }
                        try {
                            var7_7.f();
                        }
                        catch (InvocationTargetException v23) {
                            throw v23.getTargetException();
                        }
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 4 sources

            {
                v9 = this;
            }
        }
        try {
            v24 = v9.z.V();
        }
        catch (InvocationTargetException v25) {
            throw v25.getTargetException();
        }
        try {
            v26 = (String)v24.k();
        }
        catch (InvocationTargetException v27) {
            throw v27.getTargetException();
        }
        var9_9 = v26;
        if (var4_3.equals(var9_9)) {
            SwingUtilities.invokeLater(new ni_0(this, var7_7, var2_2));
        }
    }

    DefaultMutableTreeNode g(DefaultMutableTreeNode defaultMutableTreeNode, tf_2 tf_22) {
        int n10;
        Object object;
        DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode(tf_22);
        try {
            object = tf_22.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.u(object, (Object)defaultMutableTreeNode2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)this.X((Object)defaultMutableTreeNode, (Object)tf_22);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n11 = n10;
        try {
            this.d((Object)defaultMutableTreeNode2, (Object)defaultMutableTreeNode, n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return defaultMutableTreeNode2;
    }

    int X(DefaultMutableTreeNode defaultMutableTreeNode, tf_2 tf_22) {
        int n10 = defaultMutableTreeNode.getChildCount();
        int[] nArray = a3.I();
        int n11 = defaultMutableTreeNode.getUserObject().getClass().equals(tf_2.class);
        if (nArray != null) {
            if (n11 != 0) {
                int n12;
                Object object;
                tf_2 tf_23 = (tf_2)defaultMutableTreeNode.getUserObject();
                try {
                    object = tf_23.f();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    n12 = (Integer)lk_0.b(object, (Object)tf_22);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                n10 = n12;
            }
            n11 = n10;
        }
        return n11;
    }

    boolean J(tf_2 tf_22) {
        boolean bl;
        block10: {
            boolean bl2;
            block9: {
                String string;
                String string2;
                tf_2 tf_23;
                int[] nArray;
                block8: {
                    bl2 = false;
                    nArray = a3.I();
                    tf_23 = (tf_2)this.V;
                    if (nArray == null) break block8;
                    if (tf_23 == null) break block9;
                    tf_23 = tf_22;
                }
                try {
                    string2 = (String)tf_23.k();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    string = (String)this.V.k();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bl = string2.equals(string);
                if (nArray == null) break block10;
                if (bl) {
                    bl2 = true;
                }
            }
            bl = bl2;
        }
        return bl;
    }

    void H(String string) {
        ((HashSet)this.Z).add(string);
    }

    void v(String string) {
        ((HashSet)this.P).add(string);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void w(tf_2 var1_1) throws Exception {
        block122: {
            block121: {
                block116: {
                    block134: {
                        block107: {
                            block115: {
                                block114: {
                                    block113: {
                                        block129: {
                                            block111: {
                                                block112: {
                                                    block127: {
                                                        block110: {
                                                            block125: {
                                                                block124: {
                                                                    block108: {
                                                                        block109: {
                                                                            block106: {
                                                                                v0 = a3.I();
                                                                                try {
                                                                                    v1 = var1_1.k();
                                                                                }
                                                                                catch (InvocationTargetException v2) {
                                                                                    throw v2.getTargetException();
                                                                                }
                                                                                try {
                                                                                    this.H(v1);
                                                                                }
                                                                                catch (InvocationTargetException v3) {
                                                                                    throw v3.getTargetException();
                                                                                }
                                                                                try {
                                                                                    v4 = var1_1.k();
                                                                                }
                                                                                catch (InvocationTargetException v5) {
                                                                                    throw v5.getTargetException();
                                                                                }
                                                                                try {
                                                                                    this.v(v4);
                                                                                }
                                                                                catch (InvocationTargetException v6) {
                                                                                    throw v6.getTargetException();
                                                                                }
                                                                                var2_2 = v0;
                                                                                var3_3 = System.currentTimeMillis();
                                                                                var5_4 = new Vector<E>();
                                                                                var6_5 = new Vector<E>();
                                                                                var7_6 = true;
                                                                                try {
                                                                                    try {
                                                                                        v7 = (Boolean)var1_1.z();
                                                                                    }
                                                                                    catch (InvocationTargetException v8) {
                                                                                        throw v8.getTargetException();
                                                                                    }
                                                                                    if (var2_2 == null) break block106;
                                                                                    if (!v7) break block107;
                                                                                }
                                                                                catch (Exception v9) {
                                                                                    throw a3.a(v9);
                                                                                }
                                                                                v7 = false;
                                                                            }
                                                                            var8_7 = v7;
                                                                            try {
                                                                                v10 = (String)var1_1.g();
                                                                            }
                                                                            catch (InvocationTargetException v11) {
                                                                                throw v11.getTargetException();
                                                                            }
                                                                            if (var2_2 == null) break block109;
                                                                            try {
                                                                                block123: {
                                                                                    if (v10 == null) break block108;
                                                                                    break block123;
                                                                                    catch (Exception v12) {
                                                                                        throw a3.a(v12);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    v10 = (String)var1_1.g();
                                                                                }
                                                                                catch (InvocationTargetException v13) {
                                                                                    throw v13.getTargetException();
                                                                                }
                                                                            }
                                                                            catch (Exception v14) {
                                                                                throw a3.a(v14);
                                                                            }
                                                                        }
                                                                        var8_7 = v10.equals("网络");
                                                                    }
                                                                    v15 = var8_7;
                                                                    if (var2_2 == null) break block110;
                                                                    if (!v15) ** GOTO lbl96
                                                                    break block124;
                                                                    catch (Exception v16) {
                                                                        throw a3.a(v16);
                                                                    }
                                                                }
                                                                try {
                                                                    v17 = (String)var1_1.k();
                                                                }
                                                                catch (InvocationTargetException v18) {
                                                                    throw v18.getTargetException();
                                                                }
                                                                v15 = v17.contains("::");
                                                                if (var2_2 == null) break block110;
                                                                break block125;
                                                                catch (Exception v19) {
                                                                    throw a3.a(v19);
                                                                }
                                                            }
                                                            try {
                                                                block126: {
                                                                    if (v15) break block111;
                                                                    break block126;
                                                                    catch (Exception v20) {
                                                                        throw a3.a(v20);
                                                                    }
                                                                }
                                                                try {
                                                                    v21 = (String)var1_1.k();
                                                                }
                                                                catch (InvocationTargetException v22) {
                                                                    throw v22.getTargetException();
                                                                }
                                                                v15 = v21.contains("F02C1A0D-BE21-4350-88B0-7367FC96EF3C");
                                                            }
                                                            catch (Exception v23) {
                                                                throw a3.a(v23);
                                                            }
                                                        }
                                                        if (var2_2 == null) break block112;
                                                        if (v15) break block111;
                                                        break block127;
                                                        catch (Exception v24) {
                                                            throw a3.a(v24);
                                                        }
                                                    }
                                                    try {
                                                        block128: {
                                                            v25 = var1_1;
                                                            if (var2_2 == null) break block113;
                                                            break block128;
                                                            catch (Exception v26) {
                                                                throw a3.a(v26);
                                                            }
                                                        }
                                                        try {
                                                            v27 = (String)v25.k();
                                                        }
                                                        catch (InvocationTargetException v28) {
                                                            throw v28.getTargetException();
                                                        }
                                                        v15 = v27.contains("031E4825-7B94-4DC3-B131-E946B44C8DD5");
                                                    }
                                                    catch (Exception v29) {
                                                        throw a3.a(v29);
                                                    }
                                                }
                                                if (!v15) break block129;
                                            }
                                            return;
                                        }
                                        v25 = var1_1;
                                    }
                                    try {
                                        v30 = (File)v25.M();
                                    }
                                    catch (InvocationTargetException v31) {
                                        throw v31.getTargetException();
                                    }
                                    var9_9 = v30;
                                    try {
                                        var1_1.t(var9_9);
                                    }
                                    catch (InvocationTargetException v32) {
                                        throw v32.getTargetException();
                                    }
                                    var10_11 = var9_9.listFiles();
                                    try {
                                        v33 = (ArrayList)lk_0.i(var10_11);
                                    }
                                    catch (InvocationTargetException v34) {
                                        throw v34.getTargetException();
                                    }
                                    var11_12 = v33;
                                    try {
                                        v35 = var11_12;
                                        if (var2_2 == null) break block114;
                                        if (v35 == null) break block115;
                                    }
                                    catch (Exception v36) {
                                        throw a3.a(v36);
                                    }
                                    v35 = var11_12;
                                }
                                for (File var13_14 : v35) {
                                    block117: {
                                        block118: {
                                            block119: {
                                                block120: {
                                                    block131: {
                                                        v37 = var13_14.isDirectory();
                                                        if (var2_2 == null) break block116;
                                                        try {
                                                            block130: {
                                                                if (var2_2 == null) break block117;
                                                                break block130;
                                                                catch (Exception v38) {
                                                                    throw a3.a(v38);
                                                                }
                                                            }
                                                            if (!v37) break block118;
                                                        }
                                                        catch (Exception v39) {
                                                            throw a3.a(v39);
                                                        }
                                                        var14_15 /* !! */  = new tf_2();
                                                        try {
                                                            var14_15 /* !! */.t(var13_14);
                                                        }
                                                        catch (InvocationTargetException v40) {
                                                            throw v40.getTargetException();
                                                        }
                                                        var15_16 = true;
                                                        try {
                                                            v41 = (Boolean)vk_0.s();
                                                        }
                                                        catch (InvocationTargetException v42) {
                                                            throw v42.getTargetException();
                                                        }
                                                        if (var2_2 == null) break block119;
                                                        if (!v41) break block120;
                                                        break block131;
                                                        catch (Exception v43) {
                                                            throw a3.a(v43);
                                                        }
                                                    }
                                                    try {
                                                        block132: {
                                                            v41 = var13_14.getPath().equals((String)this.f);
                                                            if (var2_2 == null) break block119;
                                                            break block132;
                                                            catch (Exception v44) {
                                                                throw a3.a(v44);
                                                            }
                                                        }
                                                        if (!v41) break block120;
                                                    }
                                                    catch (Exception v45) {
                                                        throw a3.a(v45);
                                                    }
                                                    var15_16 = false;
                                                }
                                                v41 = var15_16;
                                            }
                                            if (var2_2 == null) break block117;
                                            try {
                                                block133: {
                                                    if (!v41) break block118;
                                                    break block133;
                                                    catch (Exception v46) {
                                                        throw a3.a(v46);
                                                    }
                                                }
                                                var5_4.add(var14_15 /* !! */ );
                                            }
                                            catch (Exception v47) {
                                                throw a3.a(v47);
                                            }
                                        }
                                        v41 = var13_14.isFile();
                                    }
                                    if (v41) {
                                        var14_15 /* !! */  = new ck_2();
                                        try {
                                            var14_15 /* !! */.N(var13_14);
                                        }
                                        catch (InvocationTargetException v48) {
                                            throw v48.getTargetException();
                                        }
                                        var6_5.add(var14_15 /* !! */ );
                                    }
                                    if (var2_2 != null) continue;
                                }
                            }
                            if (var2_2 != null) break block134;
                        }
                        var8_8 = null;
                        try {
                            try {
                                v49 = var1_1.k();
                            }
                            catch (InvocationTargetException v50) {
                                throw v50.getTargetException();
                            }
                            try {
                                v51 = (tf_2)this.X.o(v49);
                            }
                            catch (InvocationTargetException v52) {
                                throw v52.getTargetException();
                            }
                            var8_8 = v51;
                            try {
                                v53 = (List)var8_8.f();
                            }
                            catch (InvocationTargetException v54) {
                                throw v54.getTargetException();
                            }
                            var5_4 = v53;
                            try {
                                v55 = (List)var8_8.M();
                            }
                            catch (InvocationTargetException v56) {
                                throw v56.getTargetException();
                            }
                            var6_5 = v55;
                        }
                        catch (Exception var9_10) {
                            var9_10.printStackTrace();
                            var7_6 = false;
                        }
                    }
                    try {
                        try {
                            v57 = (String)var1_1.k();
                        }
                        catch (InvocationTargetException v58) {
                            throw v58.getTargetException();
                        }
                        ((HashSet)this.P).remove(v57);
                        if (var2_2 == null) break block121;
                        v37 = var7_6;
                    }
                    catch (Exception v59) {
                        throw a3.a(v59);
                    }
                }
                try {
                    if (v37) {
                        try {
                            var1_1.b(var5_4);
                        }
                        catch (InvocationTargetException v60) {
                            throw v60.getTargetException();
                        }
                        try {
                            var1_1.P(var6_5);
                        }
                        catch (InvocationTargetException v61) {
                            throw v61.getTargetException();
                        }
                        try {
                            var1_1.r(true);
                        }
                        catch (InvocationTargetException v62) {
                            throw v62.getTargetException();
                        }
                        try {
                            this.x(var1_1);
                            break block121;
                        }
                        catch (InvocationTargetException v63) {
                            throw v63.getTargetException();
                        }
                    }
                    ** GOTO lbl331
                }
                catch (Exception v64) {
                    throw a3.a(v64);
                }
            }
            try {
                if (var2_2 != null) break block122;
lbl331:
                // 2 sources

                throw new Exception("加载目录失败");
            }
            catch (Exception v65) {
                throw a3.a(v65);
            }
        }
    }

    public HashMap c() {
        HashMap hashMap;
        block13: {
            HashMap hashMap2 = new HashMap();
            int[] nArray = a3.I();
            block8: for (String string : ((HashMap)this.r).keySet()) {
                block17: {
                    Serializable serializable;
                    Iterator iterator;
                    block14: {
                        List list;
                        List list2;
                        Class<?> clazz;
                        Serializable serializable2;
                        block18: {
                            boolean bl;
                            Class<?> clazz2;
                            block15: {
                                block16: {
                                    hashMap = (HashMap)this.r;
                                    if (nArray == null) break block13;
                                    DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)hashMap.get(string);
                                    clazz2 = defaultMutableTreeNode.getUserObject();
                                    bl = clazz2.getClass().equals(ck_2.class);
                                    if (nArray == null) break block15;
                                    if (!bl) break block16;
                                    serializable2 = (ck_2)((Object)clazz2);
                                    hashMap2.put(string, serializable2);
                                    if (nArray != null) break block17;
                                }
                                clazz = clazz2.getClass();
                                if (nArray == null) break block18;
                                bl = clazz.equals(tf_2.class);
                            }
                            if (!bl) break block17;
                            clazz = clazz2;
                        }
                        serializable2 = (tf_2)((Object)clazz);
                        try {
                            list2 = (List)serializable2.f();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        iterator = list2.iterator();
                        while (iterator.hasNext()) {
                            String string2;
                            serializable = (tf_2)iterator.next();
                            try {
                                string2 = (String)serializable.k();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            hashMap2.put(string2, serializable);
                            if (nArray != null) {
                                if (nArray != null) continue;
                            }
                            break block14;
                        }
                        try {
                            list = (List)serializable2.M();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        iterator = list.iterator();
                    }
                    while (iterator.hasNext()) {
                        String string3;
                        serializable = (ck_2)iterator.next();
                        try {
                            string3 = (String)serializable.d();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        hashMap2.put(string3, serializable);
                        if (nArray == null) continue block8;
                        if (nArray != null) continue;
                    }
                }
                if (nArray != null) continue;
            }
            hashMap = hashMap2;
        }
        return hashMap;
    }

    public void W(TreeNode treeNode) {
        ((fy_0)this.y).removeNodeFromParent((MutableTreeNode)treeNode);
    }

    @Override
    public int getClosestRowForLocation(int n10, int n11) {
        int n12 = this.getRowForPath(this.getClosestPathForLocation(n10, n11));
        return n12;
    }

    int M() {
        a3 a32 = this;
        int n10 = 0;
        try {
            Field field = JTree.DropLocation.class.getDeclaredField("expandRow");
            field.setAccessible(true);
            n10 = field.getInt(a32);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return n10;
    }

    int x(int n10) {
        a3 a32 = this;
        int n11 = 0;
        try {
            Field field = JTree.DropLocation.class.getDeclaredField("expandRow");
            field.setAccessible(true);
            field.setInt(a32, n10);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return n11;
    }

    JTree.DropLocation h(Point point, TreePath treePath, int n10) {
        Class<JTree.DropLocation> clazz = JTree.DropLocation.class;
        JTree.DropLocation dropLocation = null;
        try {
            Constructor constructor = clazz.getDeclaredConstructor(Point.class, TreePath.class, Integer.class);
            constructor.setAccessible(true);
            dropLocation = (JTree.DropLocation)constructor.newInstance(point, treePath, n10);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return dropLocation;
    }

    @Override
    public Rectangle f(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath;
        try {
            treePath = (TreePath)this.y(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return this.getPathBounds(treePath);
    }

    @Override
    public TreePath y(DefaultMutableTreeNode defaultMutableTreeNode) {
        return defaultMutableTreeNode != null ? new TreePath(defaultMutableTreeNode.getPath()) : null;
    }

    private void p(File file) {
        File[] fileArray;
        File[] fileArray2 = fileArray = file.listFiles();
        int n10 = fileArray2.length;
        int[] nArray = a3.I();
        for (int i2 = 0; i2 < n10; ++i2) {
            File file2 = fileArray2[i2];
            if (!file2.isDirectory()) continue;
        }
    }

    private void G() {
    }

    public boolean P() {
        return this.c;
    }

    public void s(boolean bl) {
        this.c = bl;
    }

    public zD N() {
        return (zD)this.X;
    }

    public void k(zD zD2) {
        this.X = zD2;
    }

    public kl_2 H() {
        return (kl_2)this.z;
    }

    public F6 R() {
        return (F6)this.o;
    }

    public void C(F6 f62) {
        this.o = f62;
    }

    public km_0 a() {
        return (km_0)this.h;
    }

    public void h(km_0 km_02) {
        this.h = km_02;
    }

    public boolean u() {
        return this.j;
    }

    public void u(boolean bl) {
        this.j = bl;
    }

    public boolean n() {
        return this.J;
    }

    public void t(boolean bl) {
        this.J = bl;
    }

    public String f() {
        return (String)this.t;
    }

    public void P(String string) {
        this.t = string;
    }

    public static void h(int[] nArray) {
        M = nArray;
    }

    public static int[] I() {
        return M;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block27: {
                block26: {
                    block25: {
                        block24: {
                            block23: {
                                var21 = new String[10];
                                var19_1 = 0;
                                var18_2 = "\u0017\u00e0\u0004T\u0015x\u00c8$\u00e5`\u001a\u0080X\u00bc\u00e9\u00c4\u00df\u009d\u00adc\u00f2=\u0081\u00d0`y2A\u009dH.\u00d0\u000b\u0093\u00c18\u0091x\u00adb\u0007Z\u00f9\u00eb\t\r\u008a\u00b9\u00db\u001f+p\u00bb\u00da\u0002\u8f9e\u63dc\u0002\u7f4c\u7ec4$\u00e8\u008d\u0000X}\u0018\u00eaw\u00fd\u00c1\u00ee8x<u\u0087\u0088\t\u0097V \u00ee\u00b0[\u008b\u00e8\u00ef\u001d\u0012\u008aT\u00d0\u00e9\u00d5\u0081.\u0006\u52cd\u8f76\u7642\u5fd5\u5972\u8d19";
                                var20_3 = "\u0017\u00e0\u0004T\u0015x\u00c8$\u00e5`\u001a\u0080X\u00bc\u00e9\u00c4\u00df\u009d\u00adc\u00f2=\u0081\u00d0`y2A\u009dH.\u00d0\u000b\u0093\u00c18\u0091x\u00adb\u0007Z\u00f9\u00eb\t\r\u008a\u00b9\u00db\u001f+p\u00bb\u00da\u0002\u8f9e\u63dc\u0002\u7f4c\u7ec4$\u00e8\u008d\u0000X}\u0018\u00eaw\u00fd\u00c1\u00ee8x<u\u0087\u0088\t\u0097V \u00ee\u00b0[\u008b\u00e8\u00ef\u001d\u0012\u008aT\u00d0\u00e9\u00d5\u0081.\u0006\u52cd\u8f76\u7642\u5fd5\u5972\u8d19".length();
                                var17_4 = 2;
                                a3.h(new int[4]);
                                var16_5 = -1;
lbl8:
                                // 2 sources

                                while (true) {
                                    v0 = 23;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block23;
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "?%\u0013\u00ab+`\u009ei\t<'U\u00a4H\u000eP\u00d5\u0014";
                                    var20_3 = "?%\u0013\u00ab+`\u009ei\t<'U\u00a4H\u000eP\u00d5\u0014".length();
                                    var17_4 = 8;
                                    var16_5 = -1;
lbl23:
                                    // 2 sources

                                    while (true) {
                                        v0 = 56;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block23;
                                        break;
                                    }
                                    break;
                                }
lbl29:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block24;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl86
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 8;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 33;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 85;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 77;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 103;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 37;
                                            break;
                                        }
                                        default: {
                                            v15 = 123;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
                                    v8 = v11;
                                    if (v11 != 0) break;
                                    v11 = v8;
                                    v9 = v9;
                                    v14 = v8;
                                    v12 = v9;
                                    v13 = v8;
                                }
lbl86:
                                // 2 sources

                                v16 = v9;
                                v10 = v10;
                            } while (v10 > var22_6);
                            v4 = new String(v16);
                            switch (v3) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl96:
                                // 1 sources

                                ** continue;
                            }
                        }
                        a3.l = var21;
                        a3.n = new String[10];
                        var8_7 = 1404591937481773002L;
                        var14_8 = new long[3];
                        var11_9 = 0;
                        var12_10 = "\u000e\u00f3Jp\u00d4\"7\u00c4\u00d7\u00ce\u00fd@\u0018\u00ba'UhX6\u0012\u00d4\u00da'\u00e7";
                        var13_11 = "\u000e\u00f3Jp\u00d4\"7\u00c4\u00d7\u00ce\u00fd@\u0018\u00ba'UhX6\u0012\u00d4\u00da'\u00e7".length();
                        var10_12 = 0;
                        while (true) {
                            break block25;
                            break;
                        }
lbl108:
                        // 1 sources

                        while (true) {
                            var14_8[v17] = (((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L) ^ var8_7;
                            if (var10_12 < var13_11) ** continue;
                            break block26;
                            break;
                        }
                    }
                    var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                    v17 = var11_9++;
                    ** while (true)
                }
                a3.A = var14_8;
                a3.C = new Integer[3];
                var0_14 = 9133816610172933324L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = "c\u0019\u0087\u0086\u00ea\u001f\u00b7\u00b0\u0010\u00e3\u00aa\u00b9\u00d2\u00dc\u00e3J";
                var5_18 = "c\u0019\u0087\u0086\u00ea\u001f\u00b7\u00b0\u0010\u00e3\u00aa\u00b9\u00d2\u00dc\u00e3J".length();
                var2_19 = 0;
                while (true) {
                    break block27;
                    break;
                }
lbl130:
                // 1 sources

                while (true) {
                    var6_15[v18] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block28;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v18 = var3_16++;
            ** while (true)
        }
        a3.G = var6_15;
        a3.H = new Long[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1388) & 0xFFFF;
        if (n[n12] == null) {
            int n13;
            int n14;
            char[] cArray = l[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 49;
                    break;
                }
                case 1: {
                    n14 = 87;
                    break;
                }
                case 2: {
                    n14 = 20;
                    break;
                }
                case 3: {
                    n14 = 39;
                    break;
                }
                case 4: {
                    n14 = 144;
                    break;
                }
                case 5: {
                    n14 = 169;
                    break;
                }
                case 6: {
                    n14 = 133;
                    break;
                }
                case 7: {
                    n14 = 223;
                    break;
                }
                case 8: {
                    n14 = 177;
                    break;
                }
                case 9: {
                    n14 = 19;
                    break;
                }
                case 10: {
                    n14 = 181;
                    break;
                }
                case 11: {
                    n14 = 156;
                    break;
                }
                case 12: {
                    n14 = 123;
                    break;
                }
                case 13: {
                    n14 = 104;
                    break;
                }
                case 14: {
                    n14 = 42;
                    break;
                }
                case 15: {
                    n14 = 86;
                    break;
                }
                case 16: {
                    n14 = 140;
                    break;
                }
                case 17: {
                    n14 = 252;
                    break;
                }
                case 18: {
                    n14 = 243;
                    break;
                }
                case 19: {
                    n14 = 77;
                    break;
                }
                case 20: {
                    n14 = 220;
                    break;
                }
                case 21: {
                    n14 = 137;
                    break;
                }
                case 22: {
                    n14 = 204;
                    break;
                }
                case 23: {
                    n14 = 155;
                    break;
                }
                case 24: {
                    n14 = 91;
                    break;
                }
                case 25: {
                    n14 = 24;
                    break;
                }
                case 26: {
                    n14 = 235;
                    break;
                }
                case 27: {
                    n14 = 142;
                    break;
                }
                case 28: {
                    n14 = 85;
                    break;
                }
                case 29: {
                    n14 = 26;
                    break;
                }
                case 30: {
                    n14 = 202;
                    break;
                }
                case 31: {
                    n14 = 147;
                    break;
                }
                case 32: {
                    n14 = 208;
                    break;
                }
                case 33: {
                    n14 = 173;
                    break;
                }
                case 34: {
                    n14 = 67;
                    break;
                }
                case 35: {
                    n14 = 102;
                    break;
                }
                case 36: {
                    n14 = 80;
                    break;
                }
                case 37: {
                    n14 = 141;
                    break;
                }
                case 38: {
                    n14 = 216;
                    break;
                }
                case 39: {
                    n14 = 165;
                    break;
                }
                case 40: {
                    n14 = 78;
                    break;
                }
                case 41: {
                    n14 = 54;
                    break;
                }
                case 42: {
                    n14 = 159;
                    break;
                }
                case 43: {
                    n14 = 108;
                    break;
                }
                case 44: {
                    n14 = 124;
                    break;
                }
                case 45: {
                    n14 = 9;
                    break;
                }
                case 46: {
                    n14 = 113;
                    break;
                }
                case 47: {
                    n14 = 221;
                    break;
                }
                case 48: {
                    n14 = 69;
                    break;
                }
                case 49: {
                    n14 = 128;
                    break;
                }
                case 50: {
                    n14 = 179;
                    break;
                }
                case 51: {
                    n14 = 22;
                    break;
                }
                case 52: {
                    n14 = 117;
                    break;
                }
                case 53: {
                    n14 = 149;
                    break;
                }
                case 54: {
                    n14 = 121;
                    break;
                }
                case 55: {
                    n14 = 195;
                    break;
                }
                case 56: {
                    n14 = 60;
                    break;
                }
                case 57: {
                    n14 = 146;
                    break;
                }
                case 58: {
                    n14 = 171;
                    break;
                }
                case 59: {
                    n14 = 164;
                    break;
                }
                case 60: {
                    n14 = 64;
                    break;
                }
                case 61: {
                    n14 = 189;
                    break;
                }
                case 62: {
                    n14 = 65;
                    break;
                }
                case 63: {
                    n14 = 11;
                    break;
                }
                case 64: {
                    n14 = 14;
                    break;
                }
                case 65: {
                    n14 = 21;
                    break;
                }
                case 66: {
                    n14 = 109;
                    break;
                }
                case 67: {
                    n14 = 50;
                    break;
                }
                case 68: {
                    n14 = 227;
                    break;
                }
                case 69: {
                    n14 = 244;
                    break;
                }
                case 70: {
                    n14 = 71;
                    break;
                }
                case 71: {
                    n14 = 175;
                    break;
                }
                case 72: {
                    n14 = 194;
                    break;
                }
                case 73: {
                    n14 = 38;
                    break;
                }
                case 74: {
                    n14 = 161;
                    break;
                }
                case 75: {
                    n14 = 145;
                    break;
                }
                case 76: {
                    n14 = 245;
                    break;
                }
                case 77: {
                    n14 = 162;
                    break;
                }
                case 78: {
                    n14 = 35;
                    break;
                }
                case 79: {
                    n14 = 46;
                    break;
                }
                case 80: {
                    n14 = 43;
                    break;
                }
                case 81: {
                    n14 = 92;
                    break;
                }
                case 82: {
                    n14 = 213;
                    break;
                }
                case 83: {
                    n14 = 58;
                    break;
                }
                case 84: {
                    n14 = 94;
                    break;
                }
                case 85: {
                    n14 = 197;
                    break;
                }
                case 86: {
                    n14 = 212;
                    break;
                }
                case 87: {
                    n14 = 150;
                    break;
                }
                case 88: {
                    n14 = 83;
                    break;
                }
                case 89: {
                    n14 = 240;
                    break;
                }
                case 90: {
                    n14 = 138;
                    break;
                }
                case 91: {
                    n14 = 251;
                    break;
                }
                case 92: {
                    n14 = 236;
                    break;
                }
                case 93: {
                    n14 = 130;
                    break;
                }
                case 94: {
                    n14 = 34;
                    break;
                }
                case 95: {
                    n14 = 16;
                    break;
                }
                case 96: {
                    n14 = 170;
                    break;
                }
                case 97: {
                    n14 = 36;
                    break;
                }
                case 98: {
                    n14 = 246;
                    break;
                }
                case 99: {
                    n14 = 166;
                    break;
                }
                case 100: {
                    n14 = 218;
                    break;
                }
                case 101: {
                    n14 = 17;
                    break;
                }
                case 102: {
                    n14 = 7;
                    break;
                }
                case 103: {
                    n14 = 93;
                    break;
                }
                case 104: {
                    n14 = 115;
                    break;
                }
                case 105: {
                    n14 = 61;
                    break;
                }
                case 106: {
                    n14 = 183;
                    break;
                }
                case 107: {
                    n14 = 88;
                    break;
                }
                case 108: {
                    n14 = 135;
                    break;
                }
                case 109: {
                    n14 = 184;
                    break;
                }
                case 110: {
                    n14 = 63;
                    break;
                }
                case 111: {
                    n14 = 2;
                    break;
                }
                case 112: {
                    n14 = 215;
                    break;
                }
                case 113: {
                    n14 = 72;
                    break;
                }
                case 114: {
                    n14 = 232;
                    break;
                }
                case 115: {
                    n14 = 224;
                    break;
                }
                case 116: {
                    n14 = 73;
                    break;
                }
                case 117: {
                    n14 = 48;
                    break;
                }
                case 118: {
                    n14 = 248;
                    break;
                }
                case 119: {
                    n14 = 226;
                    break;
                }
                case 120: {
                    n14 = 126;
                    break;
                }
                case 121: {
                    n14 = 103;
                    break;
                }
                case 122: {
                    n14 = 3;
                    break;
                }
                case 123: {
                    n14 = 187;
                    break;
                }
                case 124: {
                    n14 = 188;
                    break;
                }
                case 125: {
                    n14 = 122;
                    break;
                }
                case 126: {
                    n14 = 62;
                    break;
                }
                case 127: {
                    n14 = 47;
                    break;
                }
                case 128: {
                    n14 = 82;
                    break;
                }
                case 129: {
                    n14 = 217;
                    break;
                }
                case 130: {
                    n14 = 191;
                    break;
                }
                case 131: {
                    n14 = 53;
                    break;
                }
                case 132: {
                    n14 = 253;
                    break;
                }
                case 133: {
                    n14 = 90;
                    break;
                }
                case 134: {
                    n14 = 13;
                    break;
                }
                case 135: {
                    n14 = 152;
                    break;
                }
                case 136: {
                    n14 = 168;
                    break;
                }
                case 137: {
                    n14 = 111;
                    break;
                }
                case 138: {
                    n14 = 106;
                    break;
                }
                case 139: {
                    n14 = 1;
                    break;
                }
                case 140: {
                    n14 = 219;
                    break;
                }
                case 141: {
                    n14 = 242;
                    break;
                }
                case 142: {
                    n14 = 98;
                    break;
                }
                case 143: {
                    n14 = 84;
                    break;
                }
                case 144: {
                    n14 = 76;
                    break;
                }
                case 145: {
                    n14 = 250;
                    break;
                }
                case 146: {
                    n14 = 110;
                    break;
                }
                case 147: {
                    n14 = 8;
                    break;
                }
                case 148: {
                    n14 = 28;
                    break;
                }
                case 149: {
                    n14 = 153;
                    break;
                }
                case 150: {
                    n14 = 41;
                    break;
                }
                case 151: {
                    n14 = 254;
                    break;
                }
                case 152: {
                    n14 = 203;
                    break;
                }
                case 153: {
                    n14 = 10;
                    break;
                }
                case 154: {
                    n14 = 120;
                    break;
                }
                case 155: {
                    n14 = 185;
                    break;
                }
                case 156: {
                    n14 = 131;
                    break;
                }
                case 157: {
                    n14 = 116;
                    break;
                }
                case 158: {
                    n14 = 241;
                    break;
                }
                case 159: {
                    n14 = 105;
                    break;
                }
                case 160: {
                    n14 = 45;
                    break;
                }
                case 161: {
                    n14 = 52;
                    break;
                }
                case 162: {
                    n14 = 222;
                    break;
                }
                case 163: {
                    n14 = 178;
                    break;
                }
                case 164: {
                    n14 = 55;
                    break;
                }
                case 165: {
                    n14 = 157;
                    break;
                }
                case 166: {
                    n14 = 112;
                    break;
                }
                case 167: {
                    n14 = 125;
                    break;
                }
                case 168: {
                    n14 = 18;
                    break;
                }
                case 169: {
                    n14 = 139;
                    break;
                }
                case 170: {
                    n14 = 134;
                    break;
                }
                case 171: {
                    n14 = 193;
                    break;
                }
                case 172: {
                    n14 = 51;
                    break;
                }
                case 173: {
                    n14 = 29;
                    break;
                }
                case 174: {
                    n14 = 79;
                    break;
                }
                case 175: {
                    n14 = 176;
                    break;
                }
                case 176: {
                    n14 = 129;
                    break;
                }
                case 177: {
                    n14 = 57;
                    break;
                }
                case 178: {
                    n14 = 255;
                    break;
                }
                case 179: {
                    n14 = 230;
                    break;
                }
                case 180: {
                    n14 = 233;
                    break;
                }
                case 181: {
                    n14 = 119;
                    break;
                }
                case 182: {
                    n14 = 225;
                    break;
                }
                case 183: {
                    n14 = 4;
                    break;
                }
                case 184: {
                    n14 = 59;
                    break;
                }
                case 185: {
                    n14 = 101;
                    break;
                }
                case 186: {
                    n14 = 89;
                    break;
                }
                case 187: {
                    n14 = 167;
                    break;
                }
                case 188: {
                    n14 = 249;
                    break;
                }
                case 189: {
                    n14 = 15;
                    break;
                }
                case 190: {
                    n14 = 75;
                    break;
                }
                case 191: {
                    n14 = 97;
                    break;
                }
                case 192: {
                    n14 = 74;
                    break;
                }
                case 193: {
                    n14 = 68;
                    break;
                }
                case 194: {
                    n14 = 237;
                    break;
                }
                case 195: {
                    n14 = 200;
                    break;
                }
                case 196: {
                    n14 = 136;
                    break;
                }
                case 197: {
                    n14 = 143;
                    break;
                }
                case 198: {
                    n14 = 192;
                    break;
                }
                case 199: {
                    n14 = 214;
                    break;
                }
                case 200: {
                    n14 = 151;
                    break;
                }
                case 201: {
                    n14 = 196;
                    break;
                }
                case 202: {
                    n14 = 186;
                    break;
                }
                case 203: {
                    n14 = 205;
                    break;
                }
                case 204: {
                    n14 = 231;
                    break;
                }
                case 205: {
                    n14 = 40;
                    break;
                }
                case 206: {
                    n14 = 127;
                    break;
                }
                case 207: {
                    n14 = 114;
                    break;
                }
                case 208: {
                    n14 = 5;
                    break;
                }
                case 209: {
                    n14 = 201;
                    break;
                }
                case 210: {
                    n14 = 25;
                    break;
                }
                case 211: {
                    n14 = 160;
                    break;
                }
                case 212: {
                    n14 = 207;
                    break;
                }
                case 213: {
                    n14 = 37;
                    break;
                }
                case 214: {
                    n14 = 99;
                    break;
                }
                case 215: {
                    n14 = 56;
                    break;
                }
                case 216: {
                    n14 = 247;
                    break;
                }
                case 217: {
                    n14 = 211;
                    break;
                }
                case 218: {
                    n14 = 81;
                    break;
                }
                case 219: {
                    n14 = 180;
                    break;
                }
                case 220: {
                    n14 = 6;
                    break;
                }
                case 221: {
                    n14 = 234;
                    break;
                }
                case 222: {
                    n14 = 198;
                    break;
                }
                case 223: {
                    n14 = 132;
                    break;
                }
                case 224: {
                    n14 = 118;
                    break;
                }
                case 225: {
                    n14 = 44;
                    break;
                }
                case 226: {
                    n14 = 239;
                    break;
                }
                case 227: {
                    n14 = 228;
                    break;
                }
                case 228: {
                    n14 = 163;
                    break;
                }
                case 229: {
                    n14 = 31;
                    break;
                }
                case 230: {
                    n14 = 100;
                    break;
                }
                case 231: {
                    n14 = 30;
                    break;
                }
                case 232: {
                    n14 = 154;
                    break;
                }
                case 233: {
                    n14 = 66;
                    break;
                }
                case 234: {
                    n14 = 174;
                    break;
                }
                case 235: {
                    n14 = 70;
                    break;
                }
                case 236: {
                    n14 = 27;
                    break;
                }
                case 237: {
                    n14 = 182;
                    break;
                }
                case 238: {
                    n14 = 210;
                    break;
                }
                case 239: {
                    n14 = 32;
                    break;
                }
                case 240: {
                    n14 = 209;
                    break;
                }
                case 241: {
                    n14 = 95;
                    break;
                }
                case 242: {
                    n14 = 12;
                    break;
                }
                case 243: {
                    n14 = 229;
                    break;
                }
                case 244: {
                    n14 = 23;
                    break;
                }
                case 245: {
                    n14 = 107;
                    break;
                }
                case 246: {
                    n14 = 190;
                    break;
                }
                case 247: {
                    n14 = 0;
                    break;
                }
                case 248: {
                    n14 = 238;
                    break;
                }
                case 249: {
                    n14 = 158;
                    break;
                }
                case 250: {
                    n14 = 199;
                    break;
                }
                case 251: {
                    n14 = 148;
                    break;
                }
                case 252: {
                    n14 = 172;
                    break;
                }
                case 253: {
                    n14 = 206;
                    break;
                }
                case 254: {
                    n14 = 96;
                    break;
                }
                default: {
                    n14 = 33;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            a3.n[n12] = new String(cArray).intern();
        }
        return n[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x387C;
        if (C[n11] == null) {
            a3.C[n11] = (int)(A[n11] ^ l2);
        }
        return C[n11];
    }

    private static long c(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x4203) & Short.MAX_VALUE;
        if (H[n11] == null) {
            a3.H[n11] = G[n11] ^ l2;
        }
        return H[n11];
    }
}

