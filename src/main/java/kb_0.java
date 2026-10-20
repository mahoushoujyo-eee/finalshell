/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Component;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from Kb
 */
public class kb_0
extends JFrame {
    JPanel G;
    JPanel V;
    z8 R;
    lv_2 o;
    ArrayList I;
    vg_0 c;
    aA S;
    DefaultMutableTreeNode m;
    DefaultMutableTreeNode Q;
    long H;
    kb_0 z;
    String A;
    public static boolean w;
    KQ a;
    DefaultMutableTreeNode y;
    z_ j;
    boolean q;
    DefaultMutableTreeNode g;
    String e;
    private static final String[] b;
    private static final String[] d;
    private static final long[] f;
    private static final Integer[] h;

    public kb_0(String string, KQ kQ, Window window, lv_2 lv_22, DefaultMutableTreeNode defaultMutableTreeNode) {
        U u10;
        Object object;
        Object object2;
        Object object3;
        int n10;
        block62: {
            kb_0 kb_02;
            block60: {
                Object object4;
                block61: {
                    JButton jButton;
                    DefaultMutableTreeNode defaultMutableTreeNode2;
                    block59: {
                        JButton jButton2;
                        block57: {
                            JButton jButton3;
                            block58: {
                                block56: {
                                    kb_0 kb_03;
                                    block54: {
                                        block55: {
                                            Object object5;
                                            Object object6;
                                            Object object7;
                                            String string2;
                                            int n11 = z7.m();
                                            this.I = new ArrayList();
                                            n10 = n11;
                                            this.c = null;
                                            this.S = null;
                                            this.m = null;
                                            this.q = false;
                                            this.g = defaultMutableTreeNode;
                                            this.o = lv_22;
                                            kb_03 = this;
                                            if (n10 == 0) break block54;
                                            if ((lv_2)kb_03.o == null) break block55;
                                            this.q = true;
                                            try {
                                                string2 = (String)this.o.F();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            this.setTitle(string2 + "-编辑");
                                            try {
                                                object7 = yt_1.i();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object6 = object7.v();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object5 = this.o.g();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object6.j(object5, (Object)this);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (n10 != 0) break block56;
                                        }
                                        kb_03 = this;
                                    }
                                    kb_03.setTitle("新建连接");
                                }
                                this.a = kQ;
                                this.A = string;
                                this.z = this;
                                this.setLayout(new MigLayout("insets 0 0 0 0", "[grow]", "[grow]0[]"));
                                this.G = new JPanel();
                                ((JPanel)this.G).setLayout(new MigLayout("insets 5 5 0 0", "[]0[grow]", "[grow]"));
                                this.add((Component)((JPanel)this.G), "growx ,growy,wrap");
                                JScrollPane jScrollPane = new JScrollPane();
                                jScrollPane.getVerticalScrollBar().setUnitIncrement(kb_0.a(17130, 3081665225335331916L));
                                ((JPanel)this.G).add((Component)jScrollPane, "width 170:: ,growx ,growy");
                                this.R = new z8();
                                zd_0 zd_02 = new zd_0((String)this.A, this.q);
                                ((ArrayList)this.I).add(zd_02);
                                try {
                                    this.R.c(zd_02);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                z9 z92 = new z9();
                                ((ArrayList)this.I).add(z92);
                                try {
                                    this.R.c(z92);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                this.S = new aA();
                                ((aA)this.S).setRootVisible(false);
                                ((aA)this.S).setFocusable(false);
                                ((aA)this.S).getSelectionModel().setSelectionMode(1);
                                jScrollPane.setViewportView((aA)this.S);
                                DefaultMutableTreeNode defaultMutableTreeNode3 = (DefaultMutableTreeNode)((aA)this.S).getModel().getRoot();
                                BJ bJ = new BJ();
                                try {
                                    bJ.o("远程桌面");
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    bJ.V(BJ.w);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                defaultMutableTreeNode3.setUserObject("root");
                                DefaultTreeModel defaultTreeModel = new DefaultTreeModel(defaultMutableTreeNode3);
                                defaultMutableTreeNode3.removeAllChildren();
                                defaultMutableTreeNode2 = new DefaultMutableTreeNode("Windows远程桌面");
                                defaultMutableTreeNode3.add(defaultMutableTreeNode2);
                                try {
                                    zd_02.Q(defaultMutableTreeNode2);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                this.y = new DefaultMutableTreeNode("代理服务器");
                                defaultMutableTreeNode2.add((DefaultMutableTreeNode)this.y);
                                this.j = new z_();
                                ((ArrayList)this.I).add((z_)this.j);
                                try {
                                    this.R.c(this.j);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                DefaultMutableTreeNode defaultMutableTreeNode4 = new DefaultMutableTreeNode("本地资源");
                                ((aA)this.S).setModel(defaultTreeModel);
                                try {
                                    this.S.J();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ((aA)this.S).addTreeSelectionListener(new k7_0(this, defaultMutableTreeNode2, zd_02));
                                ((aA)this.S).addMouseListener(new g6(this));
                                ((JPanel)this.G).add((Component)((z8)this.R), "growy,growx,wrap");
                                this.V = new JPanel();
                                this.add((Component)((JPanel)this.V), "growx,wrap");
                                ((JPanel)this.V).setLayout(new MigLayout("insets 7 5 7 15,align right"));
                                jButton3 = new JButton("确定");
                                jButton3.setFocusable(false);
                                ((JPanel)this.V).add(jButton3);
                                jButton2 = jButton3;
                                if (n10 == 0) break block57;
                                jButton2.addActionListener(new QN(this));
                                if (!this.q) break block58;
                                jButton = new JButton("应用");
                                jButton.setFocusable(false);
                                ((JPanel)this.V).add(jButton);
                                jButton.addActionListener(new J9(this));
                                if (n10 != 0) break block59;
                            }
                            jButton2 = jButton3;
                        }
                        jButton2.setText("确定");
                    }
                    jButton = new JButton("取消");
                    jButton.setFocusable(false);
                    ((JPanel)this.V).add(jButton);
                    jButton.addActionListener(new n_(this));
                    this.Q = defaultMutableTreeNode2;
                    try {
                        this.S.A(defaultMutableTreeNode2);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    kb_02 = this;
                    if (n10 == 0) break block60;
                    if (kb_02.q) break block61;
                    this.o = new lv_2();
                    try {
                        this.o.Z(this.A);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.o.T(kb_0.a(16252, 7124514169757704667L));
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.X(this.o);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (n10 != 0) break block62;
                }
                try {
                    object4 = this.o.F();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.e = object4;
                kb_02 = this;
            }
            try {
                kb_02.X(this.o);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        this.pack();
        try {
            object3 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = object3.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            u10 = (U)object.W();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.setLocationRelativeTo(u10);
        try {
            this.setVisible(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        kb_0.w = true;
        if (ky_2.F() != null) {
            z7.z(++n10);
        }
    }

    public void X(lv_2 lv_22) {
        Iterator iterator = ((ArrayList)this.I).iterator();
        int n10 = z7.M();
        while (iterator.hasNext()) {
            z7 z72 = (z7)iterator.next();
            try {
                z72.A(lv_22);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (n10 == 0) continue;
        }
    }

    @Override
    public void setVisible(boolean bl) {
        block21: {
            kb_0 kb_02;
            int n10;
            block20: {
                n10 = z7.m();
                kb_02 = this;
                if (n10 == 0) break block20;
                super.setVisible(bl);
                if (bl) break block21;
                kb_02 = this;
            }
            if (n10 != 0) {
                if ((KQ)kb_02.a != null) {
                    ((KQ)this.a).requestFocus();
                    try {
                        this.a.s(false);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.a.r(true);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                kb_02 = this;
            }
            if (n10 != 0) {
                if ((lv_2)kb_02.o != null) {
                    Object object;
                    Object object2;
                    Object object3;
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
                        object = this.o.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object2.N(object);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                kb_02 = this;
            }
            try {
                kb_02.j.S();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    boolean l() {
        boolean bl;
        block20: {
            boolean bl2;
            block21: {
                ArrayList arrayList;
                Object object;
                block19: {
                    Object object2;
                    int n10;
                    ArrayList<Object> arrayList2;
                    block18: {
                        this.c = null;
                        bl2 = true;
                        arrayList2 = new ArrayList<Object>();
                        n10 = z7.M();
                        for (Object object3 : (ArrayList)this.I) {
                            vg_0 vg_02;
                            try {
                                vg_02 = (vg_0)object3.c();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            object2 = vg_02;
                            try {
                                bl = (Boolean)object2.x();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (n10 == 0) {
                                if (n10 == 0 && !bl) {
                                    arrayList2.add(object2);
                                }
                                if (n10 == 0) continue;
                            }
                            break block18;
                        }
                        bl = arrayList2.size();
                    }
                    if (n10 != 0) break block20;
                    if (bl <= false) break block21;
                    object = arrayList2.iterator();
                    while (object.hasNext()) {
                        Object object3;
                        Object object4 = object3 = (vg_0)object.next();
                        block10: while (true) {
                            ArrayList arrayList3;
                            try {
                                arrayList3 = (ArrayList)object4.Q();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            object2 = arrayList3;
                            if (n10 != 0) break block19;
                            Iterator iterator = ((ArrayList)object2).iterator();
                            while (iterator.hasNext()) {
                                block23: {
                                    kb_0 kb_02;
                                    block22: {
                                        String string = (String)iterator.next();
                                        kb_02 = this;
                                        if (n10 != 0) break block22;
                                        object4 = (vg_0)kb_02.c;
                                        if (n10 != 0) continue block10;
                                        if (object4 != null) break block23;
                                        kb_02 = this;
                                    }
                                    kb_02.c = object3;
                                    if (n10 == 0) break block10;
                                }
                                if (n10 == 0) continue;
                            }
                            break;
                        }
                        if (n10 == 0) continue;
                    }
                    bl2 = false;
                }
                try {
                    arrayList = (ArrayList)this.c.Q();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                object = "错误: " + (String)arrayList.get(0);
            }
            bl = bl2;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void X(lv_2 var1_1, boolean var2_2) throws Exception {
        block57: {
            block56: {
                block55: {
                    block53: {
                        block54: {
                            block52: {
                                block51: {
                                    block50: {
                                        block49: {
                                            try {
                                                var1_1.Q(lv_2.F);
                                            }
                                            catch (InvocationTargetException v0) {
                                                throw v0.getTargetException();
                                            }
                                            try {
                                                v1 = ((Boolean)this.l()).booleanValue();
                                            }
                                            catch (InvocationTargetException v2) {
                                                throw v2.getTargetException();
                                            }
                                            var4_3 = v1;
                                            var3_4 = z7.m();
                                            try {
                                                v3 = var4_3;
                                                if (var3_4 == 0) break block49;
                                                if (v3 != 0) {
                                                }
                                                ** GOTO lbl118
                                            }
                                            catch (Exception v4) {
                                                throw kb_0.a(v4);
                                            }
                                            v3 = 0;
                                        }
                                        var5_5 = v3;
                                        var6_6 = ((DefaultMutableTreeNode)this.g).getUserObject();
                                        try {
                                            v5 = var6_6.getClass().equals(ck_2.class);
                                            if (var3_4 == 0) break block50;
                                            if (v5) {
                                            }
                                            ** GOTO lbl39
                                        }
                                        catch (Exception v6) {
                                            throw kb_0.a(v6);
                                        }
                                        var7_7 = (DefaultMutableTreeNode)((DefaultMutableTreeNode)this.g).getParent();
                                        var5_5 = var7_7.getIndex((DefaultMutableTreeNode)this.g);
                                        try {
                                            if (var3_4 != 0) break block51;
lbl39:
                                            // 2 sources

                                            v5 = var6_6.getClass().equals(tf_2.class);
                                        }
                                        catch (Exception v7) {
                                            throw kb_0.a(v7);
                                        }
                                    }
                                    if (v5) {
                                        // empty if block
                                    }
                                }
                                for (z7 var8_8 : (ArrayList)this.I) {
                                    try {
                                        try {
                                            var8_8.F(var1_1);
                                        }
                                        catch (InvocationTargetException v8) {
                                            throw v8.getTargetException();
                                        }
                                        if (var3_4 != 0) {
                                            if (var3_4 != 0) continue;
                                            break;
                                        }
                                        break block52;
                                    }
                                    catch (Exception v9) {
                                        throw kb_0.a(v9);
                                    }
                                }
                                try {
                                    var1_1.d(System.currentTimeMillis());
                                }
                                catch (InvocationTargetException v10) {
                                    throw v10.getTargetException();
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (var3_4 == 0) break block53;
                                        if ((String)this.e != null) {
                                        }
                                        break block54;
                                    }
                                    catch (Exception v11) {
                                        throw kb_0.a(v11);
                                    }
                                    try {
                                        v12 = (String)var1_1.F();
                                    }
                                    catch (InvocationTargetException v13) {
                                        throw v13.getTargetException();
                                    }
                                    if (!((String)this.e).equals(v12)) {
                                    }
                                    break block54;
                                }
                                catch (Exception v14) {
                                    throw kb_0.a(v14);
                                }
                                try {
                                    var1_1.x(System.currentTimeMillis());
                                }
                                catch (InvocationTargetException v15) {
                                    throw v15.getTargetException();
                                }
                            }
                            catch (Exception v16) {
                                throw kb_0.a(v16);
                            }
                        }
                        try {
                            v17 = yt_1.i();
                        }
                        catch (InvocationTargetException v18) {
                            throw v18.getTargetException();
                        }
                        try {
                            v19 = v17.g();
                        }
                        catch (InvocationTargetException v20) {
                            throw v20.getTargetException();
                        }
                        try {
                            v19.n((Object)var1_1, var5_5, this.q);
                        }
                        catch (InvocationTargetException v21) {
                            throw v21.getTargetException();
                        }
                    }
                    try {
                        if (var3_4 != 0) break block55;
lbl118:
                        // 2 sources

                        try {
                            this.s();
                        }
                        catch (InvocationTargetException v22) {
                            throw v22.getTargetException();
                        }
                    }
                    catch (Exception v23) {
                        throw kb_0.a(v23);
                    }
                }
                try {
                    v24 = var4_3;
                    if (var3_4 == 0) break block56;
                    if (v24 == 0) break block57;
                }
                catch (Exception v25) {
                    throw kb_0.a(v25);
                }
                v24 = var2_2;
            }
            try {
                if (v24 == 0) break block57;
                try {
                    this.setVisible(false);
                }
                catch (InvocationTargetException v26) {
                    throw v26.getTargetException();
                }
            }
            catch (Exception v27) {
                throw kb_0.a(v27);
            }
        }
    }

    void s() {
        ArrayList arrayList;
        Object object;
        try {
            object = this.c.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.R.P(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.S.A(this.Q);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            arrayList = (ArrayList)this.c.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JOptionPane.showMessageDialog((kb_0)this.z, arrayList.get(0), "消息", 2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[24];
                        var11_1 = 0;
                        var10_2 = "\u6d84\u604e\u0010{^\u00b4d\u00df\u0019\u0085\f\t\u00f5?\u00b9\u00c7\u00a3\u00f4e\u0004\u8f9c\u7a4b\u68a7\u9785\u0002\u5320\u6ddf\u000b\u00e0w\u00f0*`\u00fa\u00b2\u8fee\u7a1d\u68e9\u974f\u0004\u67f5\u5707\u8d6c\u6ea2\u0004\u00b2\u0016:\u00d0\u0002\u5e56\u7563\u000e\u00b0X\u001e)\u0018\u00bf\u0096+\u008b\u00fc\u0091\u008e\u0016\u0098\u0005\u4eb0\u74ce\u67bb\u525a\u5601\u0002\u7808\u5bd9\u001b_\u0099\u00e3\u0011\u00a7\u00b8a\u00c9u\u00e2NJ\u00ed\u00e6X\u00ba\u00c6vNh\u00acR\u00198\u009c\u0099L\n\n>\u009ah\u001b\u0098,< \u00f4\u0011\u00a1\u0005\u00ef\u000f\u00b5x\u00a2\u00b8\u00d2\u00cc\u00f5\u00d0+tJ+:\u0004\u65a5\u5e6c\u8ff3\u6369\u0006\u00d8\u00a4f\u00945m\u0006\u001d\u00a4\u00de\u0094\"m\u0019\u009c\u00c0Q\u00cc\u0018c\u0018\u008by\u00a5\u00c7[\u0089g\u001eU\u00b7\u00b4\u00fd\u00ed\u00b3\u0092\u00cf&\u00e6\u0002\u78b6\u5b79\u0004\u959f\u8b4b\u00cc\u00bf\u0003\u00f2\u7f73\u8f78\u000e\u00f8\u00c6\u0017\u00fa9\u00c5\u00b2a\u000f\u0015\u0001\u0016\u0004\u008b";
                        var12_3 = "\u6d84\u604e\u0010{^\u00b4d\u00df\u0019\u0085\f\t\u00f5?\u00b9\u00c7\u00a3\u00f4e\u0004\u8f9c\u7a4b\u68a7\u9785\u0002\u5320\u6ddf\u000b\u00e0w\u00f0*`\u00fa\u00b2\u8fee\u7a1d\u68e9\u974f\u0004\u67f5\u5707\u8d6c\u6ea2\u0004\u00b2\u0016:\u00d0\u0002\u5e56\u7563\u000e\u00b0X\u001e)\u0018\u00bf\u0096+\u008b\u00fc\u0091\u008e\u0016\u0098\u0005\u4eb0\u74ce\u67bb\u525a\u5601\u0002\u7808\u5bd9\u001b_\u0099\u00e3\u0011\u00a7\u00b8a\u00c9u\u00e2NJ\u00ed\u00e6X\u00ba\u00c6vNh\u00acR\u00198\u009c\u0099L\n\n>\u009ah\u001b\u0098,< \u00f4\u0011\u00a1\u0005\u00ef\u000f\u00b5x\u00a2\u00b8\u00d2\u00cc\u00f5\u00d0+tJ+:\u0004\u65a5\u5e6c\u8ff3\u6369\u0006\u00d8\u00a4f\u00945m\u0006\u001d\u00a4\u00de\u0094\"m\u0019\u009c\u00c0Q\u00cc\u0018c\u0018\u008by\u00a5\u00c7[\u0089g\u001eU\u00b7\u00b4\u00fd\u00ed\u00b3\u0092\u00cf&\u00e6\u0002\u78b6\u5b79\u0004\u959f\u8b4b\u00cc\u00bf\u0003\u00f2\u7f73\u8f78\u000e\u00f8\u00c6\u0017\u00fa9\u00c5\u00b2a\u000f\u0015\u0001\u0016\u0004\u008b".length();
                        var9_4 = 2;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 67;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00dd\u00d9H\u00be&y\u00a3\\:\t\u009f B\u00c8}*\u0085\u00d0J";
                            var12_3 = "\u00dd\u00d9H\u00be&y\u00a3\\:\t\u009f B\u00c8}*\u0085\u00d0J".length();
                            var9_4 = 9;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 7;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 26;
                                    break;
                                }
                                case 1: {
                                    v15 = 55;
                                    break;
                                }
                                case 2: {
                                    v15 = 87;
                                    break;
                                }
                                case 3: {
                                    v15 = 41;
                                    break;
                                }
                                case 4: {
                                    v15 = 115;
                                    break;
                                }
                                case 5: {
                                    v15 = 46;
                                    break;
                                }
                                default: {
                                    v15 = 10;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                kb_0.b = var13;
                kb_0.d = new String[24];
                var0_7 = 6480813445327176269L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u00a1>zO=\u00e8n\u00ab2\u009b\u0092\u00f8\u0010\u0084\u001e\u000b";
                var5_11 = "\u00a1>zO=\u00e8n\u00ab2\u009b\u0092\u00f8\u0010\u0084\u001e\u000b".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        kb_0.f = var6_8;
        kb_0.h = new Integer[2];
        kb_0.w = false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFE823) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 24;
                    break;
                }
                case 1: {
                    n14 = 255;
                    break;
                }
                case 2: {
                    n14 = 247;
                    break;
                }
                case 3: {
                    n14 = 106;
                    break;
                }
                case 4: {
                    n14 = 234;
                    break;
                }
                case 5: {
                    n14 = 68;
                    break;
                }
                case 6: {
                    n14 = 206;
                    break;
                }
                case 7: {
                    n14 = 74;
                    break;
                }
                case 8: {
                    n14 = 141;
                    break;
                }
                case 9: {
                    n14 = 220;
                    break;
                }
                case 10: {
                    n14 = 58;
                    break;
                }
                case 11: {
                    n14 = 99;
                    break;
                }
                case 12: {
                    n14 = 91;
                    break;
                }
                case 13: {
                    n14 = 147;
                    break;
                }
                case 14: {
                    n14 = 154;
                    break;
                }
                case 15: {
                    n14 = 43;
                    break;
                }
                case 16: {
                    n14 = 232;
                    break;
                }
                case 17: {
                    n14 = 170;
                    break;
                }
                case 18: {
                    n14 = 6;
                    break;
                }
                case 19: {
                    n14 = 178;
                    break;
                }
                case 20: {
                    n14 = 107;
                    break;
                }
                case 21: {
                    n14 = 148;
                    break;
                }
                case 22: {
                    n14 = 157;
                    break;
                }
                case 23: {
                    n14 = 185;
                    break;
                }
                case 24: {
                    n14 = 183;
                    break;
                }
                case 25: {
                    n14 = 7;
                    break;
                }
                case 26: {
                    n14 = 88;
                    break;
                }
                case 27: {
                    n14 = 224;
                    break;
                }
                case 28: {
                    n14 = 233;
                    break;
                }
                case 29: {
                    n14 = 55;
                    break;
                }
                case 30: {
                    n14 = 101;
                    break;
                }
                case 31: {
                    n14 = 189;
                    break;
                }
                case 32: {
                    n14 = 66;
                    break;
                }
                case 33: {
                    n14 = 115;
                    break;
                }
                case 34: {
                    n14 = 111;
                    break;
                }
                case 35: {
                    n14 = 128;
                    break;
                }
                case 36: {
                    n14 = 25;
                    break;
                }
                case 37: {
                    n14 = 211;
                    break;
                }
                case 38: {
                    n14 = 195;
                    break;
                }
                case 39: {
                    n14 = 230;
                    break;
                }
                case 40: {
                    n14 = 134;
                    break;
                }
                case 41: {
                    n14 = 72;
                    break;
                }
                case 42: {
                    n14 = 198;
                    break;
                }
                case 43: {
                    n14 = 112;
                    break;
                }
                case 44: {
                    n14 = 57;
                    break;
                }
                case 45: {
                    n14 = 212;
                    break;
                }
                case 46: {
                    n14 = 40;
                    break;
                }
                case 47: {
                    n14 = 146;
                    break;
                }
                case 48: {
                    n14 = 245;
                    break;
                }
                case 49: {
                    n14 = 53;
                    break;
                }
                case 50: {
                    n14 = 216;
                    break;
                }
                case 51: {
                    n14 = 190;
                    break;
                }
                case 52: {
                    n14 = 124;
                    break;
                }
                case 53: {
                    n14 = 249;
                    break;
                }
                case 54: {
                    n14 = 223;
                    break;
                }
                case 55: {
                    n14 = 127;
                    break;
                }
                case 56: {
                    n14 = 172;
                    break;
                }
                case 57: {
                    n14 = 144;
                    break;
                }
                case 58: {
                    n14 = 119;
                    break;
                }
                case 59: {
                    n14 = 9;
                    break;
                }
                case 60: {
                    n14 = 173;
                    break;
                }
                case 61: {
                    n14 = 120;
                    break;
                }
                case 62: {
                    n14 = 26;
                    break;
                }
                case 63: {
                    n14 = 77;
                    break;
                }
                case 64: {
                    n14 = 208;
                    break;
                }
                case 65: {
                    n14 = 37;
                    break;
                }
                case 66: {
                    n14 = 90;
                    break;
                }
                case 67: {
                    n14 = 133;
                    break;
                }
                case 68: {
                    n14 = 235;
                    break;
                }
                case 69: {
                    n14 = 160;
                    break;
                }
                case 70: {
                    n14 = 167;
                    break;
                }
                case 71: {
                    n14 = 35;
                    break;
                }
                case 72: {
                    n14 = 169;
                    break;
                }
                case 73: {
                    n14 = 162;
                    break;
                }
                case 74: {
                    n14 = 69;
                    break;
                }
                case 75: {
                    n14 = 225;
                    break;
                }
                case 76: {
                    n14 = 30;
                    break;
                }
                case 77: {
                    n14 = 113;
                    break;
                }
                case 78: {
                    n14 = 67;
                    break;
                }
                case 79: {
                    n14 = 45;
                    break;
                }
                case 80: {
                    n14 = 122;
                    break;
                }
                case 81: {
                    n14 = 243;
                    break;
                }
                case 82: {
                    n14 = 21;
                    break;
                }
                case 83: {
                    n14 = 59;
                    break;
                }
                case 84: {
                    n14 = 60;
                    break;
                }
                case 85: {
                    n14 = 23;
                    break;
                }
                case 86: {
                    n14 = 131;
                    break;
                }
                case 87: {
                    n14 = 241;
                    break;
                }
                case 88: {
                    n14 = 184;
                    break;
                }
                case 89: {
                    n14 = 98;
                    break;
                }
                case 90: {
                    n14 = 73;
                    break;
                }
                case 91: {
                    n14 = 118;
                    break;
                }
                case 92: {
                    n14 = 63;
                    break;
                }
                case 93: {
                    n14 = 168;
                    break;
                }
                case 94: {
                    n14 = 215;
                    break;
                }
                case 95: {
                    n14 = 135;
                    break;
                }
                case 96: {
                    n14 = 201;
                    break;
                }
                case 97: {
                    n14 = 104;
                    break;
                }
                case 98: {
                    n14 = 48;
                    break;
                }
                case 99: {
                    n14 = 117;
                    break;
                }
                case 100: {
                    n14 = 22;
                    break;
                }
                case 101: {
                    n14 = 78;
                    break;
                }
                case 102: {
                    n14 = 1;
                    break;
                }
                case 103: {
                    n14 = 228;
                    break;
                }
                case 104: {
                    n14 = 182;
                    break;
                }
                case 105: {
                    n14 = 15;
                    break;
                }
                case 106: {
                    n14 = 186;
                    break;
                }
                case 107: {
                    n14 = 52;
                    break;
                }
                case 108: {
                    n14 = 253;
                    break;
                }
                case 109: {
                    n14 = 240;
                    break;
                }
                case 110: {
                    n14 = 29;
                    break;
                }
                case 111: {
                    n14 = 18;
                    break;
                }
                case 112: {
                    n14 = 28;
                    break;
                }
                case 113: {
                    n14 = 17;
                    break;
                }
                case 114: {
                    n14 = 130;
                    break;
                }
                case 115: {
                    n14 = 64;
                    break;
                }
                case 116: {
                    n14 = 244;
                    break;
                }
                case 117: {
                    n14 = 152;
                    break;
                }
                case 118: {
                    n14 = 151;
                    break;
                }
                case 119: {
                    n14 = 116;
                    break;
                }
                case 120: {
                    n14 = 109;
                    break;
                }
                case 121: {
                    n14 = 61;
                    break;
                }
                case 122: {
                    n14 = 202;
                    break;
                }
                case 123: {
                    n14 = 87;
                    break;
                }
                case 124: {
                    n14 = 13;
                    break;
                }
                case 125: {
                    n14 = 70;
                    break;
                }
                case 126: {
                    n14 = 49;
                    break;
                }
                case 127: {
                    n14 = 187;
                    break;
                }
                case 128: {
                    n14 = 176;
                    break;
                }
                case 129: {
                    n14 = 82;
                    break;
                }
                case 130: {
                    n14 = 14;
                    break;
                }
                case 131: {
                    n14 = 83;
                    break;
                }
                case 132: {
                    n14 = 92;
                    break;
                }
                case 133: {
                    n14 = 231;
                    break;
                }
                case 134: {
                    n14 = 80;
                    break;
                }
                case 135: {
                    n14 = 94;
                    break;
                }
                case 136: {
                    n14 = 3;
                    break;
                }
                case 137: {
                    n14 = 44;
                    break;
                }
                case 138: {
                    n14 = 209;
                    break;
                }
                case 139: {
                    n14 = 50;
                    break;
                }
                case 140: {
                    n14 = 102;
                    break;
                }
                case 141: {
                    n14 = 32;
                    break;
                }
                case 142: {
                    n14 = 159;
                    break;
                }
                case 143: {
                    n14 = 126;
                    break;
                }
                case 144: {
                    n14 = 136;
                    break;
                }
                case 145: {
                    n14 = 221;
                    break;
                }
                case 146: {
                    n14 = 199;
                    break;
                }
                case 147: {
                    n14 = 105;
                    break;
                }
                case 148: {
                    n14 = 156;
                    break;
                }
                case 149: {
                    n14 = 51;
                    break;
                }
                case 150: {
                    n14 = 34;
                    break;
                }
                case 151: {
                    n14 = 177;
                    break;
                }
                case 152: {
                    n14 = 54;
                    break;
                }
                case 153: {
                    n14 = 125;
                    break;
                }
                case 154: {
                    n14 = 238;
                    break;
                }
                case 155: {
                    n14 = 132;
                    break;
                }
                case 156: {
                    n14 = 248;
                    break;
                }
                case 157: {
                    n14 = 217;
                    break;
                }
                case 158: {
                    n14 = 218;
                    break;
                }
                case 159: {
                    n14 = 250;
                    break;
                }
                case 160: {
                    n14 = 200;
                    break;
                }
                case 161: {
                    n14 = 153;
                    break;
                }
                case 162: {
                    n14 = 8;
                    break;
                }
                case 163: {
                    n14 = 205;
                    break;
                }
                case 164: {
                    n14 = 89;
                    break;
                }
                case 165: {
                    n14 = 79;
                    break;
                }
                case 166: {
                    n14 = 142;
                    break;
                }
                case 167: {
                    n14 = 100;
                    break;
                }
                case 168: {
                    n14 = 155;
                    break;
                }
                case 169: {
                    n14 = 27;
                    break;
                }
                case 170: {
                    n14 = 165;
                    break;
                }
                case 171: {
                    n14 = 97;
                    break;
                }
                case 172: {
                    n14 = 180;
                    break;
                }
                case 173: {
                    n14 = 163;
                    break;
                }
                case 174: {
                    n14 = 76;
                    break;
                }
                case 175: {
                    n14 = 86;
                    break;
                }
                case 176: {
                    n14 = 12;
                    break;
                }
                case 177: {
                    n14 = 108;
                    break;
                }
                case 178: {
                    n14 = 62;
                    break;
                }
                case 179: {
                    n14 = 181;
                    break;
                }
                case 180: {
                    n14 = 140;
                    break;
                }
                case 181: {
                    n14 = 11;
                    break;
                }
                case 182: {
                    n14 = 38;
                    break;
                }
                case 183: {
                    n14 = 150;
                    break;
                }
                case 184: {
                    n14 = 158;
                    break;
                }
                case 185: {
                    n14 = 192;
                    break;
                }
                case 186: {
                    n14 = 214;
                    break;
                }
                case 187: {
                    n14 = 149;
                    break;
                }
                case 188: {
                    n14 = 96;
                    break;
                }
                case 189: {
                    n14 = 219;
                    break;
                }
                case 190: {
                    n14 = 175;
                    break;
                }
                case 191: {
                    n14 = 36;
                    break;
                }
                case 192: {
                    n14 = 46;
                    break;
                }
                case 193: {
                    n14 = 10;
                    break;
                }
                case 194: {
                    n14 = 229;
                    break;
                }
                case 195: {
                    n14 = 226;
                    break;
                }
                case 196: {
                    n14 = 196;
                    break;
                }
                case 197: {
                    n14 = 103;
                    break;
                }
                case 198: {
                    n14 = 93;
                    break;
                }
                case 199: {
                    n14 = 237;
                    break;
                }
                case 200: {
                    n14 = 65;
                    break;
                }
                case 201: {
                    n14 = 42;
                    break;
                }
                case 202: {
                    n14 = 193;
                    break;
                }
                case 203: {
                    n14 = 227;
                    break;
                }
                case 204: {
                    n14 = 47;
                    break;
                }
                case 205: {
                    n14 = 161;
                    break;
                }
                case 206: {
                    n14 = 5;
                    break;
                }
                case 207: {
                    n14 = 75;
                    break;
                }
                case 208: {
                    n14 = 139;
                    break;
                }
                case 209: {
                    n14 = 16;
                    break;
                }
                case 210: {
                    n14 = 121;
                    break;
                }
                case 211: {
                    n14 = 33;
                    break;
                }
                case 212: {
                    n14 = 81;
                    break;
                }
                case 213: {
                    n14 = 2;
                    break;
                }
                case 214: {
                    n14 = 4;
                    break;
                }
                case 215: {
                    n14 = 31;
                    break;
                }
                case 216: {
                    n14 = 39;
                    break;
                }
                case 217: {
                    n14 = 236;
                    break;
                }
                case 218: {
                    n14 = 254;
                    break;
                }
                case 219: {
                    n14 = 210;
                    break;
                }
                case 220: {
                    n14 = 252;
                    break;
                }
                case 221: {
                    n14 = 129;
                    break;
                }
                case 222: {
                    n14 = 179;
                    break;
                }
                case 223: {
                    n14 = 242;
                    break;
                }
                case 224: {
                    n14 = 0;
                    break;
                }
                case 225: {
                    n14 = 194;
                    break;
                }
                case 226: {
                    n14 = 71;
                    break;
                }
                case 227: {
                    n14 = 164;
                    break;
                }
                case 228: {
                    n14 = 56;
                    break;
                }
                case 229: {
                    n14 = 20;
                    break;
                }
                case 230: {
                    n14 = 114;
                    break;
                }
                case 231: {
                    n14 = 222;
                    break;
                }
                case 232: {
                    n14 = 41;
                    break;
                }
                case 233: {
                    n14 = 143;
                    break;
                }
                case 234: {
                    n14 = 145;
                    break;
                }
                case 235: {
                    n14 = 191;
                    break;
                }
                case 236: {
                    n14 = 204;
                    break;
                }
                case 237: {
                    n14 = 251;
                    break;
                }
                case 238: {
                    n14 = 197;
                    break;
                }
                case 239: {
                    n14 = 188;
                    break;
                }
                case 240: {
                    n14 = 239;
                    break;
                }
                case 241: {
                    n14 = 95;
                    break;
                }
                case 242: {
                    n14 = 166;
                    break;
                }
                case 243: {
                    n14 = 174;
                    break;
                }
                case 244: {
                    n14 = 137;
                    break;
                }
                case 245: {
                    n14 = 203;
                    break;
                }
                case 246: {
                    n14 = 213;
                    break;
                }
                case 247: {
                    n14 = 19;
                    break;
                }
                case 248: {
                    n14 = 85;
                    break;
                }
                case 249: {
                    n14 = 171;
                    break;
                }
                case 250: {
                    n14 = 110;
                    break;
                }
                case 251: {
                    n14 = 246;
                    break;
                }
                case 252: {
                    n14 = 207;
                    break;
                }
                case 253: {
                    n14 = 138;
                    break;
                }
                case 254: {
                    n14 = 123;
                    break;
                }
                default: {
                    n14 = 84;
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
            kb_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1EA7;
        if (h[n11] == null) {
            kb_0.h[n11] = (int)(f[n11] ^ l2);
        }
        return h[n11];
    }
}

