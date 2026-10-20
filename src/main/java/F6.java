/*
 * Decompiled with CFR 0.152.
 */
import com.DI;
import com.KD;
import com._y_0;
import com.c;
import com.db_1;
import com.ky_2;
import com.qe_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.RenderingHints;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import net.miginfocom.swing.MigLayout;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class F6
extends F8
implements td_2 {
    zD E;
    zD o;
    JPanel s;
    bi_0 t;
    a3 S;
    km_0 h;
    kl_2 P;
    ArrayList g;
    String y;
    lv_2 L;
    nh_0 A;
    String W;
    _y_0 C;
    boolean j;
    boolean l;
    fm_0 k;
    s X;
    dv_0 J;
    t_0 r;
    static SimpleDateFormat F;
    JButton B;
    JButton a;
    JButton b;
    JButton G;
    JButton Y;
    JButton e;
    JScrollPane x;
    public boolean Z;
    private static boolean M;
    private static final String[] d;
    private static final String[] i;
    private static final long[] m;
    private static final Integer[] n;

    public F6() {
        this.g = new ArrayList();
        this.W = null;
        this.j = true;
        this.l = false;
        this.Z = false;
        try {
            this.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void F() {
        this.setLayout(new MigLayout("inset 0 0 0 0", "[]0[]0[]0[]0[]", "[]0[]2[]0[]0[]"));
        this.setOpaque(false);
        this.setBackground(Color.yellow);
        try {
            this.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void u() {
        block11: {
            zD zD2;
            block10: {
                boolean bl = F6.g();
                zD2 = (zD)this.E;
                if (!bl) {
                    if (zD2 != null) {
                        try {
                            this.E.p();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    zD2 = (zD)this.o;
                }
                if (bl) break block10;
                if (zD2 == null) break block11;
                zD2 = (zD)this.o;
            }
            try {
                zD2.p();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void q() {
        F6 f62;
        block36: {
            zD zD2;
            block35: {
                this.l = true;
                boolean bl = F6.g();
                try {
                    this.k.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.S.y();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.h.v();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                boolean bl2 = bl;
                ((JScrollPane)this.x).setViewportView(null);
                this.removeAll();
                try {
                    lk_0.C(this.J);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    lk_0.C(this.B);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    lk_0.C(this.e);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    lk_0.C(this.a);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    lk_0.C(this.b);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    lk_0.C(this.G);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    lk_0.C(this.Y);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    lk_0.C(this.x);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    lk_0.C(this.h);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                zD2 = (zD)this.E;
                if (bl2) break block35;
                if (zD2 != null) {
                    try {
                        this.E.N();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                f62 = this;
                if (bl2) break block36;
                zD2 = (zD)f62.o;
            }
            if (zD2 != null) {
                try {
                    this.o.N();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                lk_0.C(this);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            f62 = this;
        }
        try {
            f62.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void m(DI dI, lv_2 lv_22) {
        boolean bl = F6.i();
        F6 f62 = this;
        if (bl) {
            if (f62.l) {
                return;
            }
            this.L = lv_22;
            this.E = new zD(lv_22, dI, zD.s);
            f62 = this;
        }
        try {
            f62.E.k(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new df_1(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new un_1(this, dI));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private void Q(DI dI) throws Exception {
        this.o = new zD((lv_2)this.L, dI, zD.E);
        try {
            this.o.k(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void T(String string) {
        String string2;
        boolean bl;
        block5: {
            ArrayList arrayList;
            block4: {
                this.y = string;
                ((dv_0)this.J).setText(string);
                boolean bl2 = F6.i();
                ((dv_0)this.J).setCaretPosition(((dv_0)this.J).getDocument().getLength());
                bl = bl2;
                string2 = null;
                arrayList = (ArrayList)this.g;
                if (!bl) break block4;
                if (arrayList.size() <= 0) break block5;
                arrayList = ((ArrayList)this.g).get(((ArrayList)this.g).size() - 1);
            }
            string2 = (String)((Object)arrayList);
        }
        boolean bl3 = string.equals(string2);
        if (bl && !bl3) {
            bl3 = ((ArrayList)this.g).add(string);
        }
    }

    public void D() {
        Color color;
        Color color2;
        Color color3;
        Color color4;
        nY nY2;
        Object object;
        Object object2;
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.Z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            nY2 = (nY)object.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        nY nY3 = nY2;
        try {
            color4 = (Color)nY3.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Color color5 = color4;
        try {
            color3 = (Color)nY3.L();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Color color6 = color3;
        try {
            color2 = (Color)lk_0.j(color5);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        color5 = color2;
        try {
            color = (Color)nY3.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        MatteBorder matteBorder = BorderFactory.createMatteBorder(2, 0, 0, 0, color);
    }

    void N() {
        yd_0 yd_02;
        Object object;
        Object object2;
        this.s = new JPanel();
        this.add((Component)((JPanel)this.s), "growy,growx,wrap");
        ((JPanel)this.s).setOpaque(false);
        ((JPanel)this.s).setLayout(new MigLayout("inset 0 0 0 0", "[]0[]0[]0[]0[]", "[]0[]0[]0[]0[]"));
        this.t = new bi_0();
        ((bi_0)this.t).setLayout(new MigLayout("inset 0 0 0 5", "1[]1[]1[]0[]0[]0[]0[]", ""));
        ((bi_0)this.t).setOpaque(false);
        ((JPanel)this.s).add((Component)((bi_0)this.t), "growx,wrap");
        JPanel jPanel = new JPanel();
        jPanel.setOpaque(false);
        jPanel.setLayout(new MigLayout("insets 0 0 0 0", "", "[]0[]0[]0"));
        try {
            object2 = lk_0.l("地址栏");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.J = object2;
        try {
            object = lk_0.s("\uf1da");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.r = object;
        ((t_0)this.r).setOpaque(false);
        ((t_0)this.r).setForeground((Color)cy_1.W);
        ((t_0)this.r).setFont((Font)fx_2.b);
        jPanel.add((Component)((dv_0)this.J), "width 50:600: ,growx,growy");
        try {
            YJ.o(this.J);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.k = new fm_0(this, (dv_0)this.J);
        ((bi_0)this.t).add((Component)jPanel, "");
        boolean bl = F6.g();
        ((dv_0)this.J).addKeyListener(new BV(this));
        this.B = _y_0.K("\uf060");
        ((JButton)this.B).addActionListener(new TL(this));
        this.e = _y_0.K("\uf061");
        RenderingHints renderingHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.a = _y_0.K("\uf021");
        ((bi_0)this.t).add((JButton)this.a);
        ((JButton)this.a).addActionListener(new wc_0(this));
        this.b = _y_0.K("\uf148");
        ((bi_0)this.t).add((JButton)this.b);
        ((JButton)this.b).addActionListener(new c__0(this));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new MigLayout("inset 0 0 0 0", "0[]0[]0", "0[]0[]0"));
        qe_0 qe_02 = new qe_0("\uf0ec");
        qe_02.setSelected(this.j);
        qe_02.setFont((Font)fx_2.S);
        qe_02.setForeground(new Color(F6.b(27327, 6395458649089044064L), F6.b(24089, 146975349765003971L), F6.b(24089, 146975349765003971L)));
        qe_02.r(new Color(F6.b(12643, 4798910445343323578L), F6.b(11378, 5217342361567307945L), F6.b(11378, 5217342361567307945L)));
        jPanel2.add(qe_02);
        KD kD = new KD("立即");
        kD.G(true);
        this.G = _y_0.K("\uf019");
        ((JButton)this.G).setFocusable(false);
        ((JButton)this.G).addActionListener(new l_0(this));
        ((bi_0)this.t).add((JButton)this.G);
        boolean bl2 = bl;
        this.Y = _y_0.K("\uf093");
        ((JButton)this.Y).setFocusable(false);
        ((JButton)this.Y).addActionListener(new OH(this));
        ((bi_0)this.t).add((JButton)this.Y);
        JSplitPane jSplitPane = new JSplitPane(1);
        jSplitPane.setOpaque(false);
        ((JPanel)this.s).add((Component)jSplitPane, "width :10240:,height :10240:,growx,wrap");
        this.P = new kl_2(false);
        this.S = new a3(false, (kl_2)this.P);
        ((a3)this.S).setOpaque(false);
        try {
            this.S.t(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.h = new km_0(this, (a3)this.S, false);
        ((km_0)this.h).setAutoResizeMode(0);
        try {
            this.h.v(this.P);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((km_0)this.h).setOpaque(false);
        try {
            this.S.C(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.S.W(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JScrollPane jScrollPane = new JScrollPane((a3)this.S);
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);
        jScrollPane.getVerticalScrollBar().setOpaque(false);
        jScrollPane.getHorizontalScrollBar().setOpaque(false);
        jScrollPane.setBorder(null);
        jSplitPane.setLeftComponent(jScrollPane);
        try {
            this.S.h(this.h);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.x = new VJ(this, (km_0)this.h);
        ((JScrollPane)this.x).setOpaque(false);
        ((JScrollPane)this.x).getViewport().setOpaque(false);
        ((JScrollPane)this.x).setViewportView((km_0)this.h);
        try {
            yd_02 = (yd_0)this.h.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JScrollPane)this.x).setTransferHandler(yd_02);
        ((JScrollPane)this.x).addMouseListener(new JW(this));
        ((km_0)this.h).addMouseListener(new O6(this));
        JPanel jPanel3 = new JPanel();
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new T3());
        this.A = new nh_0();
        jPanel3.add((nh_0)this.A);
        jPanel3.add((JScrollPane)this.x);
        jSplitPane.setRightComponent(jPanel3);
        jSplitPane.setDividerLocation(F6.b(31529, 9008234764252970993L));
        jSplitPane.setResizeWeight(0.1f);
        try {
            this.c(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((a3)this.S).setRootVisible(false);
        if (ky_2.F() != null) {
            F6.W(!bl2);
        }
    }

    public void Y() {
        try {
            yt_1.F.J(new yy_1(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void V(tf_2 tf_22) {
        ArrayList<tf_2> arrayList = new ArrayList<tf_2>();
        arrayList.add(tf_22);
        try {
            this.h(arrayList);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void h(ArrayList var1_1) {
        block157: {
            block134: {
                block142: {
                    block135: {
                        block133: {
                            var2_2 = F6.i();
                            try {
                                v0 = yt_1.i();
                            }
                            catch (InvocationTargetException v1) {
                                throw v1.getTargetException();
                            }
                            try {
                                v2 = v0.h();
                            }
                            catch (InvocationTargetException v3) {
                                throw v3.getTargetException();
                            }
                            try {
                                v4 = (Boolean)v2.I();
                            }
                            catch (InvocationTargetException v5) {
                                throw v5.getTargetException();
                            }
                            if (!var2_2) break block133;
                            try {
                                block154: {
                                    if (!v4) break block134;
                                    break block154;
                                    catch (Exception v6) {
                                        throw F6.a(v6);
                                    }
                                }
                                try {
                                    v7 = yt_1.i();
                                }
                                catch (InvocationTargetException v8) {
                                    throw v8.getTargetException();
                                }
                                try {
                                    v9 = v7.P();
                                }
                                catch (InvocationTargetException v10) {
                                    throw v10.getTargetException();
                                }
                                try {
                                    v4 = (Boolean)v9.v();
                                }
                                catch (InvocationTargetException v11) {
                                    throw v11.getTargetException();
                                }
                            }
                            catch (Exception v12) {
                                throw F6.a(v12);
                            }
                        }
                        if (!v4) break block134;
                        var3_3 = null;
                        var4_4 = "";
                        for (Object var6_6 : var1_1) {
                            block139: {
                                block141: {
                                    block140: {
                                        block136: {
                                            block137: {
                                                block138: {
                                                    v13 = var6_6.getClass().equals(tf_2.class);
                                                    if (!var2_2) break block135;
                                                    try {
                                                        block155: {
                                                            if (!var2_2) break block136;
                                                            break block155;
                                                            catch (Exception v14) {
                                                                throw F6.a(v14);
                                                            }
                                                        }
                                                        if (v13) {
                                                        }
                                                        ** GOTO lbl101
                                                    }
                                                    catch (Exception v15) {
                                                        throw F6.a(v15);
                                                    }
                                                    var7_7 = (tf_2)var6_6;
                                                    try {
                                                        v16 = (zD)this.S.N();
                                                    }
                                                    catch (InvocationTargetException v17) {
                                                        throw v17.getTargetException();
                                                    }
                                                    var8_8 = v16;
                                                    try {
                                                        v18 = (String)var7_7.M();
                                                    }
                                                    catch (InvocationTargetException v19) {
                                                        throw v19.getTargetException();
                                                    }
                                                    var9_9 = v18;
                                                    try {
                                                        v20 = var3_3;
                                                        if (!var2_2) break block137;
                                                        if (v20 == null) {
                                                        }
                                                        break block138;
                                                    }
                                                    catch (Exception v21) {
                                                        throw F6.a(v21);
                                                    }
                                                    try {
                                                        v22 = var7_7.k();
                                                    }
                                                    catch (InvocationTargetException v23) {
                                                        throw v23.getTargetException();
                                                    }
                                                    try {
                                                        v24 = (String)lk_0.M(v22);
                                                    }
                                                    catch (InvocationTargetException v25) {
                                                        throw v25.getTargetException();
                                                    }
                                                    var3_3 = v24;
                                                }
                                                v20 = var4_4 + " \"" + var9_9 + "\"";
                                            }
                                            var4_4 = v20;
                                            if (var2_2) break block139;
lbl101:
                                            // 2 sources

                                            try {
                                                block156: {
                                                    v26 = var6_6.getClass();
                                                    if (!var2_2) break block140;
                                                    break block156;
                                                    catch (Exception v27) {
                                                        throw F6.a(v27);
                                                    }
                                                }
                                                v28 = v26.equals(ck_2.class);
                                            }
                                            catch (Exception v29) {
                                                throw F6.a(v29);
                                            }
                                        }
                                        if (!v28) break block139;
                                        v26 = var6_6;
                                    }
                                    var7_7 = (ck_2)v26;
                                    try {
                                        v30 = (String)var7_7.a();
                                    }
                                    catch (InvocationTargetException v31) {
                                        throw v31.getTargetException();
                                    }
                                    var8_8 = v30;
                                    try {
                                        v32 = var3_3;
                                        if (!var2_2) break block139;
                                        if (v32 == null) {
                                        }
                                        break block141;
                                    }
                                    catch (Exception v33) {
                                        throw F6.a(v33);
                                    }
                                    try {
                                        v34 = var7_7.d();
                                    }
                                    catch (InvocationTargetException v35) {
                                        throw v35.getTargetException();
                                    }
                                    try {
                                        v36 = (String)lk_0.M(v34);
                                    }
                                    catch (InvocationTargetException v37) {
                                        throw v37.getTargetException();
                                    }
                                    var3_3 = v36;
                                }
                                v32 = var4_4 = (String)var4_4 + " \"" + (String)var8_8 + "\"";
                            }
                            if (var2_2) continue;
                        }
                        try {
                            v38 = var4_4;
                            if (!var2_2) break block142;
                            v13 = v38.endsWith(",");
                        }
                        catch (Exception v39) {
                            throw F6.a(v39);
                        }
                    }
                    if (v13) {
                        var4_4 = var4_4.substring(0, var4_4.length() - 1);
                    }
                    try {
                        v40 = (String)this.G();
                    }
                    catch (InvocationTargetException v41) {
                        throw v41.getTargetException();
                    }
                    v38 = v40 + "download_pack_" + ((SimpleDateFormat)F6.F).format(new Date()) + ".tar.gz";
                }
                var5_5 = v38;
                try {
                    v42 = (String)this.G();
                }
                catch (InvocationTargetException v43) {
                    throw v43.getTargetException();
                }
                var6_6 = "cd " + var3_3 + ";mkdir -p " + v42 + ";tar -czvf " + var5_5 + " " + (String)var4_4;
                try {
                    this.Q(var6_6, var5_5);
                }
                catch (InvocationTargetException v44) {
                    throw v44.getTargetException();
                }
                if (var2_2) break block157;
            }
            var3_3 = new ArrayList<gZ>();
            var4_4 = null;
            var5_5 = var1_1.iterator();
            while (var5_5.hasNext()) {
                block149: {
                    block151: {
                        block150: {
                            block143: {
                                block148: {
                                    block147: {
                                        block146: {
                                            var6_6 = var5_5.next();
                                            v45 = var6_6.getClass().equals(tf_2.class);
                                            if (!var2_2) ** GOTO lbl336
                                            try {
                                                block158: {
                                                    if (!var2_2) break block143;
                                                    break block158;
                                                    catch (Exception v46) {
                                                        throw F6.a(v46);
                                                    }
                                                }
                                                if (v45) {
                                                }
                                                ** GOTO lbl274
                                            }
                                            catch (Exception v47) {
                                                throw F6.a(v47);
                                            }
                                            var7_7 = (tf_2)var6_6;
                                            try {
                                                v48 = (zD)this.S.N();
                                            }
                                            catch (InvocationTargetException v49) {
                                                throw v49.getTargetException();
                                            }
                                            var8_8 = v48;
                                            try {
                                                v50 = (String)var7_7.k();
                                            }
                                            catch (InvocationTargetException v51) {
                                                throw v51.getTargetException();
                                            }
                                            var9_9 = v50;
                                            var10_10 = new ArrayList<E>();
                                            var11_11 = new fp_2(SwingUtilities.getWindowAncestor(this));
                                            var12_12 = null;
                                            try {
                                                try {
                                                    var8_8.G((Object)var9_9, var10_10, var11_11, true);
                                                }
                                                catch (InvocationTargetException v52) {
                                                    throw v52.getTargetException();
                                                }
                                            }
                                            catch (Exception var13_13) {
                                                var13_13.printStackTrace();
                                                var12_12 = "打开文件夹失败!" + var13_13;
                                            }
                                            try {
                                                block145: {
                                                    try {
                                                        if (var12_12 == null) break block145;
                                                        JOptionPane.showMessageDialog(this, var12_12);
                                                        if (var2_2) break block146;
                                                    }
                                                    catch (Exception v53) {
                                                        throw F6.a(v53);
                                                    }
                                                }
                                                var11_11.setVisible(false);
                                            }
                                            catch (Exception v54) {
                                                throw F6.a(v54);
                                            }
                                        }
                                        try {
                                            try {
                                                var3_3.addAll(var10_10);
                                                v55 = var4_4;
                                                if (!var2_2) break block147;
                                                if (v55 == null) {
                                                }
                                                break block148;
                                            }
                                            catch (Exception v56) {
                                                throw F6.a(v56);
                                            }
                                            try {
                                                v57 = var7_7.k();
                                            }
                                            catch (InvocationTargetException v58) {
                                                throw v58.getTargetException();
                                            }
                                            try {
                                                v55 = (String)lk_0.M(v57);
                                            }
                                            catch (InvocationTargetException v59) {
                                                throw v59.getTargetException();
                                            }
                                        }
                                        catch (Exception v60) {
                                            throw F6.a(v60);
                                        }
                                    }
                                    var4_4 = v55;
                                }
                                try {
                                    try {
                                        if (var2_2) break block149;
lbl274:
                                        // 2 sources

                                        v61 = var6_6.getClass();
                                        if (!var2_2) break block150;
                                    }
                                    catch (Exception v62) {
                                        throw F6.a(v62);
                                    }
                                    v63 = v61.equals(ck_2.class);
                                }
                                catch (Exception v64) {
                                    throw F6.a(v64);
                                }
                            }
                            if (!v63) break block149;
                            v61 = var6_6;
                        }
                        var7_7 = (ck_2)v61;
                        try {
                            v65 = (String)var7_7.d();
                        }
                        catch (InvocationTargetException v66) {
                            throw v66.getTargetException();
                        }
                        var8_8 = v65;
                        try {
                            try {
                                try {
                                    v67 = (Long)var7_7.m();
                                }
                                catch (InvocationTargetException v68) {
                                    throw v68.getTargetException();
                                }
                                try {
                                    v69 = (Integer)var7_7.v();
                                }
                                catch (InvocationTargetException v70) {
                                    throw v70.getTargetException();
                                }
                                var3_3.add(new gZ((String)var8_8, v67, v69, false));
                                v71 = var4_4;
                                if (!var2_2) break block151;
                                if (v71 == null) {
                                }
                                break block149;
                            }
                            catch (Exception v72) {
                                throw F6.a(v72);
                            }
                            try {
                                v73 = var7_7.d();
                            }
                            catch (InvocationTargetException v74) {
                                throw v74.getTargetException();
                            }
                            try {
                                v71 = (String)lk_0.M(v73);
                            }
                            catch (InvocationTargetException v75) {
                                throw v75.getTargetException();
                            }
                        }
                        catch (Exception v76) {
                            throw F6.a(v76);
                        }
                    }
                    var4_4 = v71;
                }
                if (var2_2) continue;
            }
            var5_5 = var3_3.iterator();
            do {
                block152: {
                    block153: {
                        v45 = var5_5.hasNext();
lbl336:
                        // 2 sources

                        if (!v45) break;
                        var6_6 = (gZ)var5_5.next();
                        try {
                            v77 = yt_1.i();
                        }
                        catch (InvocationTargetException v78) {
                            throw v78.getTargetException();
                        }
                        try {
                            v79 = v77.h();
                        }
                        catch (InvocationTargetException v80) {
                            throw v80.getTargetException();
                        }
                        try {
                            v81 = (String)v79.J();
                        }
                        catch (InvocationTargetException v82) {
                            throw v82.getTargetException();
                        }
                        var7_7 = v81;
                        try {
                            v83 = (String)var6_6.z();
                        }
                        catch (InvocationTargetException v84) {
                            throw v84.getTargetException();
                        }
                        var8_8 = v83;
                        var9_9 = var8_8.substring(var4_4.length());
                        try {
                            v85 = File.separator;
                            if (!var2_2) break block152;
                            if (!v85.equals("\\")) break block153;
                        }
                        catch (Exception v86) {
                            throw F6.a(v86);
                        }
                        var9_9 = var9_9.replaceAll("/", "\\");
                    }
                    v85 = (String)var7_7 + File.separator + var9_9;
                }
                var10_10 = v85;
                try {
                    v87 = (Boolean)var6_6.F();
                }
                catch (InvocationTargetException v88) {
                    throw v88.getTargetException();
                }
                if (!v87) {
                    try {
                        v89 = (lv_2)this.q();
                    }
                    catch (InvocationTargetException v90) {
                        throw v90.getTargetException();
                    }
                    var11_11 = new YI((zD)this.o, v89, (String)var4_4, (String)var7_7, (String)var8_8, (String)var10_10, true);
                    try {
                        v91 = (Long)var6_6.z();
                    }
                    catch (InvocationTargetException v92) {
                        throw v92.getTargetException();
                    }
                    try {
                        var11_11.R(v91);
                    }
                    catch (InvocationTargetException v93) {
                        throw v93.getTargetException();
                    }
                    try {
                        v94 = yt_1.i();
                    }
                    catch (InvocationTargetException v95) {
                        throw v95.getTargetException();
                    }
                    try {
                        v96 = v94.E();
                    }
                    catch (InvocationTargetException v97) {
                        throw v97.getTargetException();
                    }
                    try {
                        v96.z(var11_11);
                    }
                    catch (InvocationTargetException v98) {
                        throw v98.getTargetException();
                    }
                    if (var2_2) continue;
                }
                var11_11 = new File((String)var10_10);
                var11_11.mkdirs();
            } while (var2_2);
        }
    }

    String G() {
        String string;
        Object object;
        try {
            object = this.s();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)object.d();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string;
        String string3 = string2 + "/.finalshell/temp/";
        return string3;
    }

    public void H() {
        block6: {
            int[] nArray = ((km_0)this.h).getSelectedRows();
            ArrayList<Object> arrayList = new ArrayList<Object>();
            int[] nArray2 = nArray;
            boolean bl = F6.g();
            for (int n10 : nArray2) {
                Object object;
                try {
                    object = this.h.L(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                Object object2 = object;
                arrayList.add(object2);
                if (!bl) {
                    if (!bl) continue;
                }
                break block6;
            }
            try {
                this.h(arrayList);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    void Q(String string, String string2) {
        new JA(SwingUtilities.getWindowAncestor(this), this, string, string2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void x(Component var1_1) {
        block87: {
            block95: {
                block85: {
                    block88: {
                        block86: {
                            block101: {
                                block100: {
                                    block99: {
                                        block98: {
                                            block83: {
                                                block84: {
                                                    var3_2 = (JFrame)SwingUtilities.getWindowAncestor(this);
                                                    try {
                                                        v0 = (zD)this.S.N();
                                                    }
                                                    catch (InvocationTargetException v1) {
                                                        throw v1.getTargetException();
                                                    }
                                                    var4_3 = v0;
                                                    var5_4 = null;
                                                    var2_5 = F6.g();
                                                    try {
                                                        v2 = (tf_2)this.P.V();
                                                    }
                                                    catch (InvocationTargetException v3) {
                                                        throw v3.getTargetException();
                                                    }
                                                    var6_6 = v2;
                                                    try {
                                                        v4 = var6_6;
                                                        if (var2_5) break block83;
                                                        if (v4 != null) break block84;
                                                    }
                                                    catch (Exception v5) {
                                                        throw F6.a(v5);
                                                    }
                                                    return;
                                                }
                                                v4 = var6_6;
                                            }
                                            try {
                                                v6 = (String)v4.k();
                                            }
                                            catch (InvocationTargetException v7) {
                                                throw v7.getTargetException();
                                            }
                                            var7_7 = v6;
                                            var8_8 = new xw_0((Window)var3_2, "选择上传文件");
                                            var8_8.setLocationRelativeTo(var3_2);
                                            var8_8.setVisible(true);
                                            try {
                                                v8 = (Integer)var8_8.V();
                                            }
                                            catch (InvocationTargetException v9) {
                                                throw v9.getTargetException();
                                            }
                                            var9_9 = v8;
                                            if (var9_9 != YB.O) break block87;
                                            try {
                                                v10 = (String)var8_8.M();
                                            }
                                            catch (InvocationTargetException v11) {
                                                throw v11.getTargetException();
                                            }
                                            var10_10 = v10;
                                            try {
                                                v12 = this.S.f();
                                            }
                                            catch (InvocationTargetException v13) {
                                                throw v13.getTargetException();
                                            }
                                            try {
                                                v14 = (String)v12.k();
                                            }
                                            catch (InvocationTargetException v15) {
                                                throw v15.getTargetException();
                                            }
                                            var11_11 = v14;
                                            try {
                                                v16 = (ArrayList)var8_8.b();
                                            }
                                            catch (InvocationTargetException v17) {
                                                throw v17.getTargetException();
                                            }
                                            var12_12 = v16;
                                            try {
                                                v18 = yt_1.i();
                                            }
                                            catch (InvocationTargetException v19) {
                                                throw v19.getTargetException();
                                            }
                                            try {
                                                v20 = v18.h();
                                            }
                                            catch (InvocationTargetException v21) {
                                                throw v21.getTargetException();
                                            }
                                            try {
                                                v22 = ((Boolean)v20.I()).booleanValue();
                                            }
                                            catch (InvocationTargetException v23) {
                                                throw v23.getTargetException();
                                            }
                                            if (var2_5) break block85;
                                            if (v22 == 0) ** GOTO lbl235
                                            break block98;
                                            catch (Exception v24) {
                                                throw F6.a(v24);
                                            }
                                        }
                                        try {
                                            v25 = yt_1.i();
                                        }
                                        catch (InvocationTargetException v26) {
                                            throw v26.getTargetException();
                                        }
                                        try {
                                            v27 = v25.P();
                                        }
                                        catch (InvocationTargetException v28) {
                                            throw v28.getTargetException();
                                        }
                                        try {
                                            v22 = (int)((Boolean)v27.v()).booleanValue();
                                        }
                                        catch (InvocationTargetException v29) {
                                            throw v29.getTargetException();
                                        }
                                        if (var2_5) break block85;
                                        break block99;
                                        catch (Exception v30) {
                                            throw F6.a(v30);
                                        }
                                    }
                                    if (v22 == 0) ** GOTO lbl235
                                    break block100;
                                    catch (Exception v31) {
                                        throw F6.a(v31);
                                    }
                                }
                                v32 = var12_12;
                                if (var2_5) break block86;
                                break block101;
                                catch (Exception v33) {
                                    throw F6.a(v33);
                                }
                            }
                            try {
                                block102: {
                                    if (v32.size() <= 0) break block87;
                                    break block102;
                                    catch (Exception v34) {
                                        throw F6.a(v34);
                                    }
                                }
                                v32 = new ArrayList<E>();
                            }
                            catch (Exception v35) {
                                throw F6.a(v35);
                            }
                        }
                        var13_13 = v32;
                        for (Class<?> var15_15 : var12_12) {
                            block92: {
                                block93: {
                                    block91: {
                                        block89: {
                                            block90: {
                                                var16_17 = var10_10;
                                                try {
                                                    v36 = (File)lk_0.E(var15_15);
                                                }
                                                catch (InvocationTargetException v37) {
                                                    throw v37.getTargetException();
                                                }
                                                var17_18 = v36;
                                                var18_19 = var17_18.getAbsolutePath();
                                                v38 = var18_19;
                                                if (var2_5) break block88;
                                                try {
                                                    block103: {
                                                        v39 = v38.startsWith(var10_10);
                                                        if (var2_5) break block89;
                                                        break block103;
                                                        catch (Exception v40) {
                                                            throw F6.a(v40);
                                                        }
                                                    }
                                                    if (v39) break block90;
                                                }
                                                catch (Exception v41) {
                                                    throw F6.a(v41);
                                                }
                                                var16_17 = var17_18.getParent();
                                            }
                                            v39 = var15_15.getClass().equals(tf_2.class);
                                        }
                                        try {
                                            if (var2_5) break block91;
                                            if (v39) {
                                            }
                                            ** GOTO lbl187
                                        }
                                        catch (Exception v42) {
                                            throw F6.a(v42);
                                        }
                                        var19_20 /* !! */  = (tf_2)var15_15;
                                        try {
                                            v43 = (String)var19_20 /* !! */.k();
                                        }
                                        catch (InvocationTargetException v44) {
                                            throw v44.getTargetException();
                                        }
                                        var13_13.add(new File(v43));
                                        if (!var2_5) break block92;
lbl187:
                                        // 2 sources

                                        try {
                                            block104: {
                                                v45 = var15_15.getClass();
                                                if (var2_5) break block93;
                                                break block104;
                                                catch (Exception v46) {
                                                    throw F6.a(v46);
                                                }
                                            }
                                            v39 = v45.equals(ck_2.class);
                                        }
                                        catch (Exception v47) {
                                            throw F6.a(v47);
                                        }
                                    }
                                    if (!v39) break block92;
                                    v45 = var15_15;
                                }
                                var19_20 /* !! */  = (ck_2)v45;
                                try {
                                    v48 = (String)var19_20 /* !! */.d();
                                }
                                catch (InvocationTargetException v49) {
                                    throw v49.getTargetException();
                                }
                                var13_13.add(new File(v48));
                            }
                            if (!var2_5) continue;
                        }
                        try {
                            v38 = (String)F6.C(var10_10);
                        }
                        catch (InvocationTargetException v50) {
                            throw v50.getTargetException();
                        }
                    }
                    var14_14 = v38;
                    try {
                        var15_15 = new nq_0(SwingUtilities.getWindowAncestor(this), this);
                        try {
                            yt_1.F.J(new Q1(this, (nq_0)var15_15, var13_13, var10_10, var11_11, (String)var14_14));
                        }
                        catch (InvocationTargetException v51) {
                            throw v51.getTargetException();
                        }
                    }
                    catch (Exception var15_16) {
                        var15_16.printStackTrace();
                    }
                    try {
                        try {
                            if (!var2_5) break block87;
lbl235:
                            // 3 sources

                            v52 = var12_12;
                            if (var2_5) break block95;
                        }
                        catch (Exception v53) {
                            throw F6.a(v53);
                        }
                        v22 = v52.size();
                    }
                    catch (Exception v54) {
                        throw F6.a(v54);
                    }
                }
                if (v22 <= 0) break block87;
                v52 = var12_12;
            }
            for (Object var14_14 : v52) {
                block96: {
                    block97: {
                        var15_15 = var10_10;
                        try {
                            v55 = (File)lk_0.E(var14_14);
                        }
                        catch (InvocationTargetException v56) {
                            throw v56.getTargetException();
                        }
                        var16_17 = v55;
                        var17_18 = var16_17.getAbsolutePath();
                        try {
                            if (var2_5) break block96;
                            if (var17_18.startsWith(var10_10)) break block97;
                        }
                        catch (Exception v57) {
                            throw F6.a(v57);
                        }
                        var15_15 = var16_17.getParent();
                    }
                    try {
                        this.w((Object)var15_15, (Object)var11_11, var14_14);
                    }
                    catch (InvocationTargetException v58) {
                        throw v58.getTargetException();
                    }
                }
                if (!var2_5) continue;
            }
        }
    }

    public static String C(String string) {
        String string2 = System.getProperty("java.io.tmpdir");
        String string3 = new File(string2) + File.separator + "upload_pack_" + ((SimpleDateFormat)F6.F).format(new Date()) + ".tar.gz";
        return string3;
    }

    void w(String string, String string2, Object clazz) {
        block14: {
            ArrayList<File> arrayList;
            ArrayList<File> arrayList2;
            block19: {
                String string3;
                Class<?> clazz2;
                Serializable serializable;
                block20: {
                    boolean bl;
                    block15: {
                        boolean bl2;
                        block16: {
                            ArrayList arrayList3;
                            Object object;
                            String string4;
                            arrayList2 = new ArrayList<File>();
                            bl2 = F6.g();
                            arrayList = new ArrayList<File>();
                            bl = clazz.getClass().equals(tf_2.class);
                            if (bl2) break block15;
                            if (!bl) break block16;
                            serializable = (tf_2)((Object)clazz);
                            try {
                                string4 = (String)serializable.k();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            arrayList2.add(new File(string4));
                            try {
                                object = serializable.k();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                arrayList3 = (ArrayList)lk_0.a(object);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            ArrayList arrayList4 = arrayList3;
                            for (File file : arrayList4) {
                                block17: {
                                    boolean bl3;
                                    block18: {
                                        if (bl2) break block14;
                                        bl3 = file.isDirectory();
                                        if (bl2) break block17;
                                        if (!bl3) break block18;
                                        arrayList2.add(file);
                                        if (!bl2) break block17;
                                    }
                                    bl3 = arrayList.add(file);
                                }
                                if (!bl2) continue;
                            }
                            if (!bl2) break block19;
                        }
                        clazz2 = clazz.getClass();
                        if (bl2) break block20;
                        bl = clazz2.equals(ck_2.class);
                    }
                    if (!bl) break block19;
                    clazz2 = clazz;
                }
                serializable = (ck_2)((Object)clazz2);
                try {
                    string3 = (String)serializable.d();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                arrayList.add(new File(string3));
            }
            try {
                yt_1.F.J(new O0(this, arrayList2, string, string2, arrayList));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public YI F(File file, String string, String string2, boolean bl) {
        Object object;
        Object object2;
        lv_2 lv_22;
        zD zD2;
        String string3;
        String string4;
        File file2 = new File(file.getPath());
        boolean bl2 = F6.g();
        String string5 = file.getPath();
        String string6 = string4 = string5.substring(string.length());
        if (!bl2) {
            if (string6.contains("\\")) {
                string4 = string4.replaceAll("\\", "/");
            }
            string6 = string2 + "/" + string4;
        }
        String string7 = string6;
        try {
            string3 = (String)lk_0.b(string7);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        string7 = string3;
        try {
            zD2 = (zD)this.e();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lv_22 = (lv_2)this.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        YI yI = new YI(zD2, lv_22, string, string2, string5, string7, false);
        try {
            yI.R(file2.length());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.E();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.z(yI);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string8 = string7;
        if (bl) {
            try {
                yI.w(new CR(this, yI, string8));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        return yI;
    }

    public YI z(File file, String string, String string2) {
        YI yI;
        try {
            yI = (YI)this.F((Object)file, (Object)string, (Object)string2, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return yI;
    }

    public void c(YI yI, String string) {
        try {
            this.S.P((Object)yI, (Object)string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Exception decompiling
     */
    public void j(String var1_1, String var2_2) throws Exception {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [51[DOLOOP]], but top level block is 9[TRYBLOCK]
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

    public void t() {
    }

    /*
     * Unable to fully structure code
     */
    public void I(Component var1_1, String var2_2, String var3_3, boolean var4_4, boolean var5_5) throws Exception {
        block48: {
            block47: {
                block46: {
                    block42: {
                        block44: {
                            block45: {
                                block43: {
                                    block41: {
                                        block40: {
                                            var7_6 = this.hashCode();
                                            var6_7 = F6.i();
                                            try {
                                                v0 = (zD)this.S.N();
                                            }
                                            catch (InvocationTargetException v1) {
                                                throw v1.getTargetException();
                                            }
                                            var8_8 = v0;
                                            var9_9 = null;
                                            try {
                                                v2 = (String)lk_0.e(var2_2);
                                            }
                                            catch (InvocationTargetException v3) {
                                                throw v3.getTargetException();
                                            }
                                            var10_10 = v2;
                                            var11_11 = var2_2 + var10_10 + var3_3;
                                            try {
                                                try {
                                                    v4 = var11_11;
                                                    if (!var6_7) break block40;
                                                    if (!v4.startsWith("//")) break block41;
                                                }
                                                catch (Exception v5) {
                                                    throw F6.a(v5);
                                                }
                                                v4 = var11_11.substring(1);
                                            }
                                            catch (Exception v6) {
                                                throw F6.a(v6);
                                            }
                                        }
                                        var11_11 = v4;
                                    }
                                    var12_12 = null;
                                    try {
                                        v7 = (tf_2)var8_8.q(var11_11);
                                    }
                                    catch (InvocationTargetException v8) {
                                        throw v8.getTargetException();
                                    }
                                    var12_12 = v7;
                                    try {
                                        if (!var6_7) break block42;
                                        if (var12_12 != null) {
                                        }
                                        ** GOTO lbl94
                                    }
                                    catch (Exception v9) {
                                        throw F6.a(v9);
                                    }
                                    try {
                                        v10 = (DefaultMutableTreeNode)this.S.M(var2_2);
                                    }
                                    catch (InvocationTargetException v11) {
                                        throw v11.getTargetException();
                                    }
                                    var13_13 = v10;
                                    try {
                                        try {
                                            v12 = var13_13;
                                            if (!var6_7) break block43;
                                            if (v12 == null) break block44;
                                        }
                                        catch (Exception v13) {
                                            throw F6.a(v13);
                                        }
                                        v12 = var13_13.getUserObject();
                                    }
                                    catch (Exception v14) {
                                        throw F6.a(v14);
                                    }
                                }
                                var14_15 = v12;
                                try {
                                    v15 = var14_15;
                                    if (!var6_7) break block45;
                                    if (v15 == null) break block44;
                                }
                                catch (Exception v16) {
                                    throw F6.a(v16);
                                }
                                v15 = var14_15;
                            }
                            var15_16 = (tf_2)v15;
                            try {
                                v17 = var15_16.k();
                            }
                            catch (InvocationTargetException v18) {
                                throw v18.getTargetException();
                            }
                            try {
                                this.S.H((Object)var12_12, v17, (Object)var3_3, var4_4);
                            }
                            catch (InvocationTargetException v19) {
                                throw v19.getTargetException();
                            }
                        }
                        try {
                            if (var6_7) break block46;
lbl94:
                            // 2 sources

                            try {
                                this.h.Z(var11_11);
                            }
                            catch (InvocationTargetException v20) {
                                throw v20.getTargetException();
                            }
                        }
                        catch (Exception v21) {
                            throw F6.a(v21);
                        }
                    }
                    var13_14 = ((km_0)this.h).getSelectedRow();
                    try {
                        try {
                            v22 = var13_14;
                            if (!var6_7) break block47;
                            if (v22 > -1) {
                            }
                            break block46;
                        }
                        catch (Exception v23) {
                            throw F6.a(v23);
                        }
                        try {
                            this.h.V(var13_14);
                        }
                        catch (InvocationTargetException v24) {
                            throw v24.getTargetException();
                        }
                    }
                    catch (Exception v25) {
                        throw F6.a(v25);
                    }
                }
                v22 = (int)var5_5;
            }
            try {
                try {
                    if (v22 == 0 || var9_9 == null) break block48;
                }
                catch (Exception v26) {
                    throw F6.a(v26);
                }
                JOptionPane.showMessageDialog(var1_1, var9_9);
            }
            catch (Exception v27) {
                throw F6.a(v27);
            }
        }
    }

    public void r(Component component) {
        block8: {
            int n10;
            int[] nArray = ((km_0)this.h).getSelectedRows();
            boolean bl = F6.g();
            int n11 = n10 = JOptionPane.showConfirmDialog(component, "确定要删除这些文件吗?", "警告", 0);
            if (!bl) {
                if (n11 != 0) {
                    return;
                }
                n11 = 0;
            }
            int n12 = n11;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (int n13 : nArray) {
                Object object;
                try {
                    object = this.h.L(n13);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                Object object2 = object;
                arrayList.add(object2);
                if (!bl) {
                    if (!bl) continue;
                }
                break block8;
            }
            try {
                this.w(arrayList, (Object)component, false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void R(tf_2 tf_22) {
        ArrayList<tf_2> arrayList = new ArrayList<tf_2>();
        arrayList.add(tf_22);
        yu_1 yu_12 = new yu_1(this, arrayList, SwingUtilities.getWindowAncestor(this));
    }

    public void E() {
        int[] nArray = ((km_0)this.h).getSelectedRows();
        boolean bl = false;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object = nArray;
        int n10 = ((int[])object).length;
        boolean bl2 = F6.i();
        for (int i2 = 0; i2 < n10; ++i2) {
            Object object2;
            int n11 = object[i2];
            try {
                object2 = this.h.L(n11);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            Object object3 = object2;
            arrayList.add(object3);
            if (bl2) continue;
        }
        object = new yu_1(this, arrayList, SwingUtilities.getWindowAncestor(this));
    }

    public void Y(Component component, boolean bl) {
        block7: {
            int[] nArray = ((km_0)this.h).getSelectedRows();
            int n10 = JOptionPane.showConfirmDialog(component, "确定要删除这些文件吗?", "警告", 0);
            boolean bl2 = F6.g();
            if (n10 != 0) {
                return;
            }
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (int n11 : nArray) {
                Object object;
                try {
                    object = this.h.L(n11);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                Object object2 = object;
                arrayList.add(object2);
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block7;
            }
            try {
                this.j(arrayList, (Object)component, bl);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void J(Object object, Component component, boolean bl) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(object);
        try {
            this.w(arrayList, (Object)component, bl);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void E(tf_2 tf_22, Component component, boolean bl) {
        ArrayList<tf_2> arrayList = new ArrayList<tf_2>();
        arrayList.add(tf_22);
        try {
            this.j(arrayList, (Object)component, bl);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void j(ArrayList var1_1, Component var2_2, boolean var3_3) {
        block115: {
            block114: {
                block109: {
                    block107: {
                        block108: {
                            block106: {
                                block105: {
                                    block98: {
                                        var5_4 = null;
                                        var6_5 = "";
                                        var4_6 = F6.i();
                                        for (Object var8_8 : var1_1) {
                                            block102: {
                                                block104: {
                                                    block103: {
                                                        block99: {
                                                            block100: {
                                                                block101: {
                                                                    v0 = var8_8.getClass().equals(tf_2.class);
                                                                    if (!var4_6) break block98;
                                                                    try {
                                                                        block119: {
                                                                            if (!var4_6) break block99;
                                                                            break block119;
                                                                            catch (Exception v1) {
                                                                                throw F6.a(v1);
                                                                            }
                                                                        }
                                                                        if (v0) {
                                                                        }
                                                                        ** GOTO lbl59
                                                                    }
                                                                    catch (Exception v2) {
                                                                        throw F6.a(v2);
                                                                    }
                                                                    var9_9 = (tf_2)var8_8;
                                                                    try {
                                                                        v3 = (zD)this.S.N();
                                                                    }
                                                                    catch (InvocationTargetException v4) {
                                                                        throw v4.getTargetException();
                                                                    }
                                                                    var10_10 = v3;
                                                                    try {
                                                                        v5 = (String)var9_9.M();
                                                                    }
                                                                    catch (InvocationTargetException v6) {
                                                                        throw v6.getTargetException();
                                                                    }
                                                                    var11_12 = v5;
                                                                    try {
                                                                        v7 = var5_4;
                                                                        if (!var4_6) break block100;
                                                                        if (v7 == null) {
                                                                        }
                                                                        break block101;
                                                                    }
                                                                    catch (Exception v8) {
                                                                        throw F6.a(v8);
                                                                    }
                                                                    try {
                                                                        v9 = var9_9.k();
                                                                    }
                                                                    catch (InvocationTargetException v10) {
                                                                        throw v10.getTargetException();
                                                                    }
                                                                    try {
                                                                        v11 = (String)lk_0.M(v9);
                                                                    }
                                                                    catch (InvocationTargetException v12) {
                                                                        throw v12.getTargetException();
                                                                    }
                                                                    var5_4 = v11;
                                                                }
                                                                v7 = var6_5 + " \"" + var11_12 + "\"";
                                                            }
                                                            var6_5 = v7;
                                                            if (var4_6) break block102;
lbl59:
                                                            // 2 sources

                                                            try {
                                                                block120: {
                                                                    v13 = var8_8.getClass();
                                                                    if (!var4_6) break block103;
                                                                    break block120;
                                                                    catch (Exception v14) {
                                                                        throw F6.a(v14);
                                                                    }
                                                                }
                                                                v15 = v13.equals(ck_2.class);
                                                            }
                                                            catch (Exception v16) {
                                                                throw F6.a(v16);
                                                            }
                                                        }
                                                        if (!v15) break block102;
                                                        v13 = var8_8;
                                                    }
                                                    var9_9 = (ck_2)v13;
                                                    try {
                                                        v17 = (String)var9_9.a();
                                                    }
                                                    catch (InvocationTargetException v18) {
                                                        throw v18.getTargetException();
                                                    }
                                                    var10_10 = v17;
                                                    try {
                                                        v19 = var5_4;
                                                        if (!var4_6) break block102;
                                                        if (v19 == null) {
                                                        }
                                                        break block104;
                                                    }
                                                    catch (Exception v20) {
                                                        throw F6.a(v20);
                                                    }
                                                    try {
                                                        v21 = var9_9.d();
                                                    }
                                                    catch (InvocationTargetException v22) {
                                                        throw v22.getTargetException();
                                                    }
                                                    try {
                                                        v23 = (String)lk_0.M(v21);
                                                    }
                                                    catch (InvocationTargetException v24) {
                                                        throw v24.getTargetException();
                                                    }
                                                    var5_4 = v23;
                                                }
                                                v19 = var6_5 = var6_5 + " \"" + (String)var10_10 + "\"";
                                            }
                                            if (var4_6) continue;
                                        }
                                        try {
                                            v25 = var6_5;
                                            if (!var4_6) break block105;
                                            v0 = v25.endsWith(",");
                                        }
                                        catch (Exception v26) {
                                            throw F6.a(v26);
                                        }
                                    }
                                    if (v0) {
                                        var6_5 = var6_5.substring(0, var6_5.length() - 1);
                                    }
                                    v25 = "cd " + var5_4 + ";rm -rf " + var6_5;
                                }
                                var7_7 = v25;
                                try {
                                    v27 = (zD)this.s();
                                }
                                catch (InvocationTargetException v28) {
                                    throw v28.getTargetException();
                                }
                                var8_8 = v27;
                                var9_9 = null;
                                try {
                                    var8_8.S();
                                }
                                catch (InvocationTargetException v29) {
                                    throw v29.getTargetException();
                                }
                                try {
                                    v30 = (db_1)var8_8.J(var7_7);
                                }
                                catch (InvocationTargetException v31) {
                                    throw v31.getTargetException();
                                }
                                var9_9 = v30;
                                var10_10 = new BufferedReader(new InputStreamReader(var9_9.s(), "UTF-8"));
                                var9_9.I();
                                var12_13 = var9_9;
                                try {
                                    yt_1.F.J(new tx_1(this, (db_1)var12_13));
                                }
                                catch (InvocationTargetException v32) {
                                    throw v32.getTargetException();
                                }
                                var13_14 = 0;
                                while ((var11_12 = var10_10.readLine()) != null) {
                                    try {
                                        ++var13_14;
                                        if (var4_6) {
                                            if (var4_6) continue;
                                            break;
                                        }
                                        break block106;
                                    }
                                    catch (Exception v33) {
                                        throw F6.a(v33);
                                    }
                                }
                                var10_10.close();
                            }
                            var14_15 = 0;
                            var14_15 = var9_9.o();
                            if (!var4_6) break block108;
                            try {
                                block121: {
                                    if (var3_3) break block107;
                                    break block121;
                                    catch (Exception v34) {
                                        throw F6.a(v34);
                                    }
                                }
                                try {
                                    this.Y();
                                }
                                catch (InvocationTargetException v35) {
                                    throw v35.getTargetException();
                                }
                            }
                            catch (Exception v36) {
                                throw F6.a(v36);
                            }
                        }
                        if (var4_6) break block109;
                    }
                    var15_16 = null;
                    for (E var17_18 : var1_1) {
                        block112: {
                            block113: {
                                block110: {
                                    block111: {
                                        if (!var4_6) break block109;
                                        try {
                                            block122: {
                                                v37 = var17_18.getClass().equals(tf_2.class);
                                                if (!var4_6) break block110;
                                                break block122;
                                                catch (Exception v38) {
                                                    throw F6.a(v38);
                                                }
                                            }
                                            if (v37) {
                                            }
                                            ** GOTO lbl246
                                        }
                                        catch (Exception v39) {
                                            throw F6.a(v39);
                                        }
                                        var18_19 /* !! */  = (tf_2)var17_18;
                                        var19_20 = new ArrayList<gZ>();
                                        try {
                                            v40 = (String)var18_19 /* !! */.k();
                                        }
                                        catch (InvocationTargetException v41) {
                                            throw v41.getTargetException();
                                        }
                                        var20_21 = v40;
                                        try {
                                            v42 = (Integer)var18_19 /* !! */.y();
                                        }
                                        catch (InvocationTargetException v43) {
                                            throw v43.getTargetException();
                                        }
                                        var19_20.add(new gZ(var20_21, 0L, v42, true));
                                        for (gZ var22_23 : var19_20) {
                                            try {
                                                try {
                                                    v44 = var22_23.z();
                                                }
                                                catch (InvocationTargetException v45) {
                                                    throw v45.getTargetException();
                                                }
                                                try {
                                                    this.S.m(v44);
                                                }
                                                catch (InvocationTargetException v46) {
                                                    throw v46.getTargetException();
                                                }
                                                if (var4_6) {
                                                    if (var4_6) continue;
                                                    break;
                                                }
                                                break block111;
                                            }
                                            catch (Exception v47) {
                                                throw F6.a(v47);
                                            }
                                        }
                                        try {
                                            v48 = (String)var18_19 /* !! */.k();
                                        }
                                        catch (InvocationTargetException v49) {
                                            throw v49.getTargetException();
                                        }
                                        var15_16 = v48;
                                    }
                                    if (var4_6) break block112;
lbl246:
                                    // 2 sources

                                    try {
                                        block123: {
                                            v50 = var17_18.getClass();
                                            if (!var4_6) break block113;
                                            break block123;
                                            catch (Exception v51) {
                                                throw F6.a(v51);
                                            }
                                        }
                                        v37 = v50.equals(ck_2.class);
                                    }
                                    catch (Exception v52) {
                                        throw F6.a(v52);
                                    }
                                }
                                if (!v37) break block112;
                                v50 = var17_18;
                            }
                            var18_19 /* !! */  = (ck_2)v50;
                            try {
                                v53 = var18_19 /* !! */.d();
                            }
                            catch (InvocationTargetException v54) {
                                throw v54.getTargetException();
                            }
                            try {
                                this.S.i(v53);
                            }
                            catch (InvocationTargetException v55) {
                                throw v55.getTargetException();
                            }
                        }
                        if (var4_6) continue;
                    }
                    try {
                        v56 = lk_0.M(var15_16);
                    }
                    catch (InvocationTargetException v57) {
                        throw v57.getTargetException();
                    }
                    try {
                        this.t(v56, false, false);
                    }
                    catch (InvocationTargetException v58) {
                        throw v58.getTargetException();
                    }
                }
                try {
                    v59 = var9_9;
                    if (!var4_6) break block114;
                    if (v59 == null) break block115;
                }
                catch (Exception v60) {
                    throw F6.a(v60);
                }
                v59 = var9_9;
            }
            v59.r();
            break block115;
            catch (Exception var10_11) {
                block116: {
                    try {
                        var10_11.printStackTrace();
                        v61 = var9_9;
                        if (!var4_6) break block116;
                    }
                    catch (Throwable var23_24) {
                        block118: {
                            block117: {
                                try {
                                    v62 = var9_9;
                                    if (!var4_6) break block117;
                                    if (v62 == null) break block118;
                                }
                                catch (Exception v63) {
                                    throw F6.a(v63);
                                }
                                v62 = var9_9;
                            }
                            v62.r();
                        }
                        throw var23_24;
                    }
                    if (v61 == null) break block115;
                    v61 = var9_9;
                }
                v61.r();
            }
        }
    }

    public void M(ArrayList arrayList, Component component, boolean bl) {
        Iterator iterator = arrayList.iterator();
        boolean bl2 = F6.g();
        while (iterator.hasNext()) {
            block13: {
                Object object;
                Serializable serializable;
                block14: {
                    boolean bl3;
                    Object e2;
                    block11: {
                        block12: {
                            String string;
                            zD zD2;
                            e2 = iterator.next();
                            bl3 = e2.getClass().equals(tf_2.class);
                            if (bl2) break block11;
                            if (!bl3) break block12;
                            serializable = (tf_2)e2;
                            try {
                                zD2 = (zD)this.S.N();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            zD zD3 = zD2;
                            try {
                                string = (String)serializable.k();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            String string2 = string;
                            ArrayList arrayList2 = new ArrayList();
                            fp_2 fp_22 = new fp_2(SwingUtilities.getWindowAncestor(this));
                            try {
                                yt_1.F.J(new vy_0(this, zD3, string2, arrayList2, fp_22, (tf_2)serializable, bl, component));
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (!bl2) break block13;
                        }
                        object = e2.getClass();
                        if (bl2) break block14;
                        bl3 = object.equals(ck_2.class);
                    }
                    if (!bl3) break block13;
                    object = e2;
                }
                serializable = (ck_2)object;
                try {
                    yt_1.F.J(new OV(this, (ck_2)serializable));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            if (!bl2) continue;
        }
    }

    public void w(ArrayList arrayList, Component component, boolean bl) {
        Iterator iterator = arrayList.iterator();
        boolean bl2 = F6.g();
        while (iterator.hasNext()) {
            block13: {
                Object object;
                Serializable serializable;
                block14: {
                    boolean bl3;
                    Object e2;
                    block11: {
                        block12: {
                            String string;
                            zD zD2;
                            e2 = iterator.next();
                            bl3 = e2.getClass().equals(tf_2.class);
                            if (bl2) break block11;
                            if (!bl3) break block12;
                            serializable = (tf_2)e2;
                            try {
                                zD2 = (zD)this.S.N();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            zD zD3 = zD2;
                            try {
                                string = (String)serializable.k();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            String string2 = string;
                            ArrayList arrayList2 = new ArrayList();
                            fp_2 fp_22 = new fp_2(SwingUtilities.getWindowAncestor(this));
                            try {
                                yt_1.F.J(new zH(this, zD3, string2, arrayList2, fp_22, (tf_2)serializable, bl, component));
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (!bl2) break block13;
                        }
                        object = e2.getClass();
                        if (bl2) break block14;
                        bl3 = object.equals(ck_2.class);
                    }
                    if (!bl3) break block13;
                    object = e2;
                }
                serializable = (ck_2)object;
                try {
                    yt_1.F.J(new uk_0(this, (ck_2)serializable));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            if (!bl2) continue;
        }
    }

    public void g(ArrayList arrayList, Component component) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Y(boolean bl) {
        Object object;
        Object object2;
        bl = true;
        int n10 = ((km_0)this.h).getSelectedRow();
        boolean bl2 = F6.g();
        if (n10 < 0) {
            return;
        }
        try {
            object2 = this.h.L(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object object3 = object2;
        ck_2 ck_22 = null;
        Object object4 = object3;
        if (!bl2) {
            if (object4 == null) return;
            object4 = object3;
        }
        Object object5 = object4.getClass();
        if (!bl2) {
            if (!object5.equals(ck_2.class)) return;
            object5 = object3;
        }
        ck_22 = (ck_2)object5;
        try {
            object = ck_22.d();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.i(object, bl);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void i(String var1_1, boolean var2_2) {
        block93: {
            block95: {
                block94: {
                    try {
                        this.H((Object)var1_1, false);
                    }
                    catch (InvocationTargetException v0) {
                        throw v0.getTargetException();
                    }
                    try {
                        v1 = yt_1.i();
                    }
                    catch (InvocationTargetException v2) {
                        throw v2.getTargetException();
                    }
                    try {
                        v3 = (u6_0)v1.h();
                    }
                    catch (InvocationTargetException v4) {
                        throw v4.getTargetException();
                    }
                    var4_3 = v3;
                    try {
                        v5 = (String)lk_0.N(var1_1);
                    }
                    catch (InvocationTargetException v6) {
                        throw v6.getTargetException();
                    }
                    var5_4 = v5;
                    try {
                        v7 = (ArrayList)var4_3.d();
                    }
                    catch (InvocationTargetException v8) {
                        throw v8.getTargetException();
                    }
                    var6_5 = v7;
                    var3_6 = F6.g();
                    v9 = var6_5.contains(var5_4);
                    if (!var3_6) {
                        if (v9) {
                            var2_2 = false;
                        }
                        v9 = var2_2;
                    }
                    if (!v9) break block93;
                    try {
                        v10 = (String)var4_3.O();
                    }
                    catch (InvocationTargetException v11) {
                        throw v11.getTargetException();
                    }
                    var7_7 = v10;
                    var8_8 = false;
                    if (var7_7 == null) ** GOTO lbl52
                    v12 = new File(var7_7).exists();
                    if (!var3_6) {
                        if (v12 != 0) {
                            var8_8 = true;
                        }
lbl52:
                        // 4 sources

                        v13 = var4_3;
                        if (!var3_6) {
                            try {
                                v12 = (Integer)v13.g();
                            }
                            catch (InvocationTargetException v14) {
                                throw v14.getTargetException();
                            }
                        }
                    } else {
                        if (v12 == 1 && !var8_8) {
                            try {
                                lk_0.j(this);
                            }
                            catch (InvocationTargetException v15) {
                                throw v15.getTargetException();
                            }
                        }
                        v13 = var4_3;
                    }
                    try {
                        v16 = (String)v13.O();
                    }
                    catch (InvocationTargetException v17) {
                        throw v17.getTargetException();
                    }
                    var7_7 = v16;
                    if (var7_7 == null) break block94;
                    v18 = new File(var7_7).exists();
                    if (var3_6) break block95;
                    if (v18) {
                        var8_8 = true;
                    }
                }
                v18 = var8_8;
            }
            if (!v18) {
                // empty if block
            }
        }
        try {
            v19 = (String)lk_0.M(var1_1);
        }
        catch (InvocationTargetException v20) {
            throw v20.getTargetException();
        }
        var7_7 = v19;
        var8_9 = (String)dd_1.c;
        var9_10 = var1_1;
        var10_11 = var9_10.substring(var7_7.length());
        v21 = File.separator;
        if (!var3_6) {
            if (v21.equals("\\")) {
                var10_11 = var10_11.replaceAll("/", "\\");
            }
            v21 = var8_9 + File.separator + var10_11;
        }
        var11_12 = v21;
        try {
            v22 = (String)lk_0.j(var11_12);
        }
        catch (InvocationTargetException v23) {
            throw v23.getTargetException();
        }
        var12_13 = v22;
        try {
            v24 = yt_1.i();
        }
        catch (InvocationTargetException v25) {
            throw v25.getTargetException();
        }
        try {
            v26 = v24.E();
        }
        catch (InvocationTargetException v27) {
            throw v27.getTargetException();
        }
        try {
            v28 = this.q();
        }
        catch (InvocationTargetException v29) {
            throw v29.getTargetException();
        }
        try {
            v30 = (Integer)v26.u((Object)var12_13, (Object)var9_10, v28);
        }
        catch (InvocationTargetException v31) {
            throw v31.getTargetException();
        }
        var13_14 = v30;
        try {
            v32 = yt_1.i();
        }
        catch (InvocationTargetException v33) {
            throw v33.getTargetException();
        }
        try {
            v34 = v32.E();
        }
        catch (InvocationTargetException v35) {
            throw v35.getTargetException();
        }
        try {
            v36 = this.q();
        }
        catch (InvocationTargetException v37) {
            throw v37.getTargetException();
        }
        try {
            v34.g((Object)var12_13, (Object)var9_10, v36, var13_14);
        }
        catch (InvocationTargetException v38) {
            throw v38.getTargetException();
        }
        var14_15 = "";
        if (var13_14 > 0) {
            var14_15 = "(" + var13_14 + ")";
        }
        try {
            v39 = (String)lk_0.j(var11_12);
        }
        catch (InvocationTargetException v40) {
            throw v40.getTargetException();
        }
        var15_16 = v39;
        try {
            v41 = (String)lk_0.J(var15_16);
        }
        catch (InvocationTargetException v42) {
            throw v42.getTargetException();
        }
        var16_17 = v41;
        try {
            v43 = (String)lk_0.N(var15_16);
        }
        catch (InvocationTargetException v44) {
            throw v44.getTargetException();
        }
        var17_18 = v43;
        var18_19 = var16_17;
        v45 = var17_18;
        if (!var3_6) {
            if (!v45.equals("")) {
                var18_19 = var18_19 + "." + var17_18;
            }
            try {
                v46 = (String)lk_0.M(var11_12);
            }
            catch (InvocationTargetException v47) {
                throw v47.getTargetException();
            }
            try {
                v48 = this.q();
            }
            catch (InvocationTargetException v49) {
                throw v49.getTargetException();
            }
            try {
                v50 = (String)v48.F();
            }
            catch (InvocationTargetException v51) {
                throw v51.getTargetException();
            }
            v45 = v46 + File.separator + v50 + "_" + var16_17 + var14_15 + "." + var17_18;
        }
        var11_12 = v45;
        try {
            v52 = (zD)this.e();
        }
        catch (InvocationTargetException v53) {
            throw v53.getTargetException();
        }
        try {
            v54 = (lv_2)this.q();
        }
        catch (InvocationTargetException v55) {
            throw v55.getTargetException();
        }
        var19_20 = new YI(v52, v54, var7_7, var8_9, var9_10, var11_12, true);
        try {
            var19_20.g(true);
        }
        catch (InvocationTargetException v56) {
            throw v56.getTargetException();
        }
        try {
            v57 = yt_1.i();
        }
        catch (InvocationTargetException v58) {
            throw v58.getTargetException();
        }
        try {
            v59 = v57.E();
        }
        catch (InvocationTargetException v60) {
            throw v60.getTargetException();
        }
        try {
            v59.z(var19_20);
        }
        catch (InvocationTargetException v61) {
            throw v61.getTargetException();
        }
        try {
            v62 = (zD)this.e();
        }
        catch (InvocationTargetException v63) {
            throw v63.getTargetException();
        }
        try {
            v64 = (lv_2)this.q();
        }
        catch (InvocationTargetException v65) {
            throw v65.getTargetException();
        }
        var20_21 = new YI(v62, v64, var8_9, var7_7, var11_12, var9_10, false);
        try {
            var20_21.v(this);
        }
        catch (InvocationTargetException v66) {
            throw v66.getTargetException();
        }
        try {
            v67 = yt_1.i();
        }
        catch (InvocationTargetException v68) {
            throw v68.getTargetException();
        }
        try {
            v69 = v67.U();
        }
        catch (InvocationTargetException v70) {
            throw v70.getTargetException();
        }
        try {
            v69.l((Object)var11_12, (Object)var20_21);
        }
        catch (InvocationTargetException v71) {
            throw v71.getTargetException();
        }
    }

    public boolean O() {
        return this.Z;
    }

    public void e(boolean bl) {
        this.Z = bl;
    }

    public synchronized void t(String string, boolean bl, boolean bl2) {
        try {
            yt_1.F.J(new VZ(this, string, bl, bl2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public synchronized void H(String string, boolean bl) {
        block25: {
            fm_0 fm_02;
            block24: {
                L1 l1 = new L1("", string);
                String string2 = "file";
                boolean bl2 = F6.g();
                if (!bl2) {
                    Object object;
                    Object object2;
                    Object object3;
                    Object object4;
                    if (bl) {
                        string2 = "dir";
                    }
                    try {
                        l1.n(string2);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        l1.m(0);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object4 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object3 = object4.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object2 = object3.f();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object2.h(l1);
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
                }
                fm_02 = (fm_0)this.k;
                if (bl2) break block24;
                if (fm_02 == null) break block25;
                fm_02 = (fm_0)this.k;
            }
            try {
                fm_02.Z();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public ck_2 g(String string) {
        ck_2 ck_22;
        try {
            ck_22 = (ck_2)this.S.q(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return ck_22;
    }

    public tf_2 W(String string) {
        tf_2 tf_22;
        try {
            tf_22 = (tf_2)this.S.c(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return tf_22;
    }

    void s(String string) {
        String string2 = "";
        if (!string.startsWith("/")) {
            // empty if block
        }
    }

    void s(String string, boolean bl, boolean bl2) {
        try {
            this.S.j((Object)string, bl, bl2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public a3 M() {
        return (a3)this.S;
    }

    public void c(a3 a32) {
        this.S = a32;
    }

    @Override
    public synchronized void E(uf_2 uf_22) {
        block40: {
            String string;
            Object object;
            String string2;
            tf_2 tf_22;
            tf_2 tf_23;
            block41: {
                tf_2 tf_24;
                ck_2 ck_22;
                Serializable serializable;
                int n10;
                int n11;
                boolean bl;
                block36: {
                    int n12;
                    block37: {
                        block39: {
                            String string3;
                            Object object2;
                            String string4;
                            tf_2 tf_25;
                            block38: {
                                tf_2 tf_26;
                                int n13;
                                try {
                                    n13 = (Integer)uf_22.Q();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                n12 = n13;
                                bl = F6.i();
                                n11 = n12;
                                n10 = uf_2.e;
                                if (!bl) break block36;
                                if (n11 != n10) break block37;
                                try {
                                    tf_26 = (tf_2)uf_22.n();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                serializable = tf_26;
                                try {
                                    tf_25 = (tf_2)this.P.V();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (!bl) break block38;
                                if (tf_25 == null) break block39;
                                tf_25 = serializable;
                            }
                            try {
                                string4 = (String)tf_25.k();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object2 = this.P.V();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                string3 = (String)object2.k();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (string4.equals(string3)) {
                                try {
                                    this.P.O(serializable);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    this.c(false);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                        }
                        if (bl) break block40;
                    }
                    n11 = n12;
                    n10 = uf_2.P;
                }
                if (n11 != n10) break block40;
                try {
                    ck_22 = (ck_2)uf_22.v();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                serializable = ck_22;
                try {
                    tf_24 = (tf_2)uf_22.n();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                tf_23 = tf_24;
                try {
                    tf_22 = (tf_2)this.P.V();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (!bl) break block41;
                if (tf_22 == null) break block40;
                tf_22 = tf_23;
            }
            try {
                string2 = (String)tf_22.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = this.P.V();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                string = (String)object.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (string2.equals(string)) {
                try {
                    this.P.O(tf_23);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    public s D() {
        return (s)this.X;
    }

    public void W(s s2) {
        this.X = s2;
    }

    public void c(boolean bl) {
        ((nh_0)this.A).setVisible(bl);
        this.repaint();
    }

    public zD s() {
        return (zD)this.E;
    }

    public zD e() {
        return (zD)this.o;
    }

    public void l(zD zD2) {
        this.o = zD2;
    }

    public lv_2 q() {
        return (lv_2)this.L;
    }

    public void K(lv_2 lv_22) {
        this.L = lv_22;
    }

    @Override
    public _y_0 t() {
        return (_y_0)this.C;
    }

    @Override
    public void E(_y_0 _y_02) {
        this.C = _y_02;
    }

    public boolean f() {
        return this.j;
    }

    public void g(boolean bl) {
        this.j = bl;
    }

    public bi_0 A() {
        return (bi_0)this.t;
    }

    public void o(bi_0 bi_02) {
        this.t = bi_02;
    }

    @Override
    public void h() {
        this.E = null;
        this.o = null;
        this.s = null;
        this.t = null;
        this.S = null;
        this.h = null;
        this.P = null;
        this.g = null;
        this.y = null;
        this.L = null;
        this.A = null;
        this.W = null;
        this.C = null;
        this.k = null;
        this.X = null;
        this.J = null;
        this.r = null;
        this.B = null;
        this.a = null;
        this.b = null;
        this.G = null;
        this.Y = null;
        this.e = null;
        this.x = null;
    }

    @Override
    public void K() {
        try {
            yt_1.F.W((Object)new qk_0(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    static void n(F6 f62, DI dI) throws Exception {
        try {
            f62.Q(dI);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[44];
                        var11_1 = 0;
                        var10_2 = "\u00bd\u0090\f\u000fC`?]\u0004\u00cf\u00bd\u0004\u009c\u00e0\u0012\u0003'^\u00fd\u001a\u000f\u00f2*(\u0014\u00da\u00a4\u00ea\u0015k\u00a9|<\u00efs\u0096\u0083p\u00ea\u00f1\u009e\u008b \u00a3\t^\u000e\u00c7\u00feQu\u000eg7\u00af\u00dc[\b\u00a7\"\u00d2\u0011\u00a4\r\u008d\u00c8{\u0007\u0099\u00c5\u009b\u000e=\u0018\u0011\u00c6\u00c9\u00bee\u0007\u00a1\u0080\u0088\u00de\u00a3\u0085\u0093\u0002\u008e\u00a2\u0015\u00fa\u00a8#R\u0018\u0005t\u00a8\u00ec#v\u00de\u00cb\u0000\u00b7(m(|\u00ad\u0092\u0002\u0081\u0092\u000e~\u00f0\u00f9\u00f5\u0085\u00bbk\u00b9E\u00ac\u0085D\u0018\u0095'6}\r\u00d9\u00f0\u00e47,\u0083\u00964G\u000b\u0084\u00d1t\u0000f\u00fd6\u008c\u00a3\u00ac\u000f\u00f62\u009f\u00b8L%d\u0006\u0016?\u0001B\u00d3\u0086p\u0002\u8b9f\u549d\u000e\u00c2\u000eYA\u0093\u0097\u00dez\u00f7\u007f\u00bc8\u0096w\u000e\u00ab\u0000C\u00eb\u00d2z\u0081\u00c3\u0018\u00e3.\u00adm\u00a8\u000b\u78a7\u5b21\u89e0\u528b\u9618\u8f89\u4e06\u65f1\u4ef6\u5468\u008f\u0003\u0016-n\t\u6289\u5fd6\u65b9\u4e6a\u59a8\u5951\u8d58\u00b9\u00a8\u0007\u00da\u0007\u0006\u00a6\u00bc\u00ba\u00e1\tL\u0082\u00bf\u00bbMrr\u0080f\u0012\u0007\u0085ztZ\u00ae\u00f2N\u00ff\u0087\u00b0\u0084\u00dds\u00b1\u00d1\u00b9\u0093\u000e\u00979\u0095M\u00f5\u0088L\u00deWk&\u0018\u00d6\u00ef\u0002\u8b52\u5435\u0006\u90a8\u62d7\u4e01\u4f48\u653d\u4ede\u00055|):B\u0003\u57ac\u57f8\u689a\u000e|\u00ad\u00b9^\u008d\u00cej\u0017ey\u0081\u00fe\u0098\u00c2\r\u00ec\u0090\u009c\u0092+\u00be\u00d9v\u0015\u00fc\u00e2J_\u0002\u00d5\t\r\u00ca\u00edX=\u00b3K\u00ca\u00c8w+\u00ae\u00b0\u00d6\u0010\u0097\u00f1 3.\u00d6\u0082\u00a4\u009c\u00e9/Y\u00e0\u0086A\u00b4\u000b\u78c4\u5b5e\u898c\u5264\u9695\u8f74\u4eb7\u654e\u4ec0\u549fI\b\u0014\u0083\u0085*\u008c\u0016\t{\u0004rB\u00be/\u0002W\u00e9\n1\u0011'\u00c0Z\u0087YDW\u0016\u000b\u00aa>^\tw5\u00df\u00f1\u00aa[\u008b\u0003\u0099\u00ba*\u0007\u00985\u00afhGS\u000f\u0007\u00b9\u0089jw1\u0080P\nC\u00cf\u00ba\u00f4|.\u00f9\u00bb\u00ef\r\n\u5b93\u57b4\u541b\u54f0\u65b8\u4e41\u6200\u764b\u5fa9M";
                        var12_3 = "\u00bd\u0090\f\u000fC`?]\u0004\u00cf\u00bd\u0004\u009c\u00e0\u0012\u0003'^\u00fd\u001a\u000f\u00f2*(\u0014\u00da\u00a4\u00ea\u0015k\u00a9|<\u00efs\u0096\u0083p\u00ea\u00f1\u009e\u008b \u00a3\t^\u000e\u00c7\u00feQu\u000eg7\u00af\u00dc[\b\u00a7\"\u00d2\u0011\u00a4\r\u008d\u00c8{\u0007\u0099\u00c5\u009b\u000e=\u0018\u0011\u00c6\u00c9\u00bee\u0007\u00a1\u0080\u0088\u00de\u00a3\u0085\u0093\u0002\u008e\u00a2\u0015\u00fa\u00a8#R\u0018\u0005t\u00a8\u00ec#v\u00de\u00cb\u0000\u00b7(m(|\u00ad\u0092\u0002\u0081\u0092\u000e~\u00f0\u00f9\u00f5\u0085\u00bbk\u00b9E\u00ac\u0085D\u0018\u0095'6}\r\u00d9\u00f0\u00e47,\u0083\u00964G\u000b\u0084\u00d1t\u0000f\u00fd6\u008c\u00a3\u00ac\u000f\u00f62\u009f\u00b8L%d\u0006\u0016?\u0001B\u00d3\u0086p\u0002\u8b9f\u549d\u000e\u00c2\u000eYA\u0093\u0097\u00dez\u00f7\u007f\u00bc8\u0096w\u000e\u00ab\u0000C\u00eb\u00d2z\u0081\u00c3\u0018\u00e3.\u00adm\u00a8\u000b\u78a7\u5b21\u89e0\u528b\u9618\u8f89\u4e06\u65f1\u4ef6\u5468\u008f\u0003\u0016-n\t\u6289\u5fd6\u65b9\u4e6a\u59a8\u5951\u8d58\u00b9\u00a8\u0007\u00da\u0007\u0006\u00a6\u00bc\u00ba\u00e1\tL\u0082\u00bf\u00bbMrr\u0080f\u0012\u0007\u0085ztZ\u00ae\u00f2N\u00ff\u0087\u00b0\u0084\u00dds\u00b1\u00d1\u00b9\u0093\u000e\u00979\u0095M\u00f5\u0088L\u00deWk&\u0018\u00d6\u00ef\u0002\u8b52\u5435\u0006\u90a8\u62d7\u4e01\u4f48\u653d\u4ede\u00055|):B\u0003\u57ac\u57f8\u689a\u000e|\u00ad\u00b9^\u008d\u00cej\u0017ey\u0081\u00fe\u0098\u00c2\r\u00ec\u0090\u009c\u0092+\u00be\u00d9v\u0015\u00fc\u00e2J_\u0002\u00d5\t\r\u00ca\u00edX=\u00b3K\u00ca\u00c8w+\u00ae\u00b0\u00d6\u0010\u0097\u00f1 3.\u00d6\u0082\u00a4\u009c\u00e9/Y\u00e0\u0086A\u00b4\u000b\u78c4\u5b5e\u898c\u5264\u9695\u8f74\u4eb7\u654e\u4ec0\u549fI\b\u0014\u0083\u0085*\u008c\u0016\t{\u0004rB\u00be/\u0002W\u00e9\n1\u0011'\u00c0Z\u0087YDW\u0016\u000b\u00aa>^\tw5\u00df\u00f1\u00aa[\u008b\u0003\u0099\u00ba*\u0007\u00985\u00afhGS\u000f\u0007\u00b9\u0089jw1\u0080P\nC\u00cf\u00ba\u00f4|.\u00f9\u00bb\u00ef\r\n\u5b93\u57b4\u541b\u54f0\u65b8\u4e41\u6200\u764b\u5fa9M".length();
                        F6.W(true);
                        var9_4 = 2;
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 109;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00ea\u00b7\u00cf\u00e5\u00d2\u00c3uJ\u0013\u00e8\u00b1[\u00a3\u0002\u7a38\u534f";
                            var12_3 = "\u00ea\u00b7\u00cf\u00e5\u00d2\u00c3uJ\u0013\u00e8\u00b1[\u00a3\u0002\u7a38\u534f".length();
                            var9_4 = 13;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 88;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 100;
                                    break;
                                }
                                case 1: {
                                    v15 = 71;
                                    break;
                                }
                                case 2: {
                                    v15 = 122;
                                    break;
                                }
                                case 3: {
                                    v15 = 110;
                                    break;
                                }
                                case 4: {
                                    v15 = 94;
                                    break;
                                }
                                case 5: {
                                    v15 = 8;
                                    break;
                                }
                                default: {
                                    v15 = 125;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                F6.d = var13;
                F6.i = new String[44];
                var0_7 = 5649825827842990381L;
                var6_8 = new long[5];
                var3_9 = 0;
                var4_10 = "I\u00b3\u0087\u00163\u00b9\u0089\u00de85TjN\u0013\u00fb\u0096|\u00e4\u008c\u00f7\u00d4\u00f1\u0014\u00cd";
                var5_11 = "I\u00b3\u0087\u00163\u00b9\u0089\u00de85TjN\u0013\u00fb\u0096|\u00e4\u008c\u00f7\u00d4\u00f1\u0014\u00cd".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = ".\u00e1\u00d0\u00a3_\u00f7\u00deh\u00b5\u0012\u00ab\r\u00bd\u00ceO5";
                    var5_11 = ".\u00e1\u00d0\u00a3_\u00f7\u00deh\u00b5\u0012\u00ab\r\u00bd\u00ceO5".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl137:
                // 1 sources

                ** continue;
            }
        }
        F6.m = var6_8;
        F6.n = new Integer[5];
        F6.F = new SimpleDateFormat("yyyyMMddhhmmssSSS");
    }

    public static void W(boolean bl) {
        M = bl;
    }

    public static boolean i() {
        return M;
    }

    public static boolean g() {
        boolean bl = F6.i();
        return !bl;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x4E56) & 0xFFFF;
        if (i[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 7;
                    break;
                }
                case 1: {
                    n14 = 40;
                    break;
                }
                case 2: {
                    n14 = 33;
                    break;
                }
                case 3: {
                    n14 = 26;
                    break;
                }
                case 4: {
                    n14 = 71;
                    break;
                }
                case 5: {
                    n14 = 53;
                    break;
                }
                case 6: {
                    n14 = 235;
                    break;
                }
                case 7: {
                    n14 = 201;
                    break;
                }
                case 8: {
                    n14 = 24;
                    break;
                }
                case 9: {
                    n14 = 84;
                    break;
                }
                case 10: {
                    n14 = 82;
                    break;
                }
                case 11: {
                    n14 = 169;
                    break;
                }
                case 12: {
                    n14 = 225;
                    break;
                }
                case 13: {
                    n14 = 148;
                    break;
                }
                case 14: {
                    n14 = 69;
                    break;
                }
                case 15: {
                    n14 = 48;
                    break;
                }
                case 16: {
                    n14 = 58;
                    break;
                }
                case 17: {
                    n14 = 119;
                    break;
                }
                case 18: {
                    n14 = 68;
                    break;
                }
                case 19: {
                    n14 = 243;
                    break;
                }
                case 20: {
                    n14 = 152;
                    break;
                }
                case 21: {
                    n14 = 29;
                    break;
                }
                case 22: {
                    n14 = 237;
                    break;
                }
                case 23: {
                    n14 = 206;
                    break;
                }
                case 24: {
                    n14 = 101;
                    break;
                }
                case 25: {
                    n14 = 60;
                    break;
                }
                case 26: {
                    n14 = 22;
                    break;
                }
                case 27: {
                    n14 = 51;
                    break;
                }
                case 28: {
                    n14 = 34;
                    break;
                }
                case 29: {
                    n14 = 251;
                    break;
                }
                case 30: {
                    n14 = 200;
                    break;
                }
                case 31: {
                    n14 = 153;
                    break;
                }
                case 32: {
                    n14 = 163;
                    break;
                }
                case 33: {
                    n14 = 236;
                    break;
                }
                case 34: {
                    n14 = 85;
                    break;
                }
                case 35: {
                    n14 = 10;
                    break;
                }
                case 36: {
                    n14 = 165;
                    break;
                }
                case 37: {
                    n14 = 14;
                    break;
                }
                case 38: {
                    n14 = 18;
                    break;
                }
                case 39: {
                    n14 = 185;
                    break;
                }
                case 40: {
                    n14 = 205;
                    break;
                }
                case 41: {
                    n14 = 130;
                    break;
                }
                case 42: {
                    n14 = 103;
                    break;
                }
                case 43: {
                    n14 = 191;
                    break;
                }
                case 44: {
                    n14 = 161;
                    break;
                }
                case 45: {
                    n14 = 21;
                    break;
                }
                case 46: {
                    n14 = 160;
                    break;
                }
                case 47: {
                    n14 = 99;
                    break;
                }
                case 48: {
                    n14 = 232;
                    break;
                }
                case 49: {
                    n14 = 186;
                    break;
                }
                case 50: {
                    n14 = 109;
                    break;
                }
                case 51: {
                    n14 = 92;
                    break;
                }
                case 52: {
                    n14 = 140;
                    break;
                }
                case 53: {
                    n14 = 221;
                    break;
                }
                case 54: {
                    n14 = 203;
                    break;
                }
                case 55: {
                    n14 = 192;
                    break;
                }
                case 56: {
                    n14 = 218;
                    break;
                }
                case 57: {
                    n14 = 64;
                    break;
                }
                case 58: {
                    n14 = 81;
                    break;
                }
                case 59: {
                    n14 = 151;
                    break;
                }
                case 60: {
                    n14 = 226;
                    break;
                }
                case 61: {
                    n14 = 54;
                    break;
                }
                case 62: {
                    n14 = 52;
                    break;
                }
                case 63: {
                    n14 = 90;
                    break;
                }
                case 64: {
                    n14 = 95;
                    break;
                }
                case 65: {
                    n14 = 98;
                    break;
                }
                case 66: {
                    n14 = 46;
                    break;
                }
                case 67: {
                    n14 = 6;
                    break;
                }
                case 68: {
                    n14 = 202;
                    break;
                }
                case 69: {
                    n14 = 155;
                    break;
                }
                case 70: {
                    n14 = 162;
                    break;
                }
                case 71: {
                    n14 = 79;
                    break;
                }
                case 72: {
                    n14 = 184;
                    break;
                }
                case 73: {
                    n14 = 242;
                    break;
                }
                case 74: {
                    n14 = 27;
                    break;
                }
                case 75: {
                    n14 = 19;
                    break;
                }
                case 76: {
                    n14 = 89;
                    break;
                }
                case 77: {
                    n14 = 56;
                    break;
                }
                case 78: {
                    n14 = 210;
                    break;
                }
                case 79: {
                    n14 = 233;
                    break;
                }
                case 80: {
                    n14 = 176;
                    break;
                }
                case 81: {
                    n14 = 187;
                    break;
                }
                case 82: {
                    n14 = 126;
                    break;
                }
                case 83: {
                    n14 = 135;
                    break;
                }
                case 84: {
                    n14 = 36;
                    break;
                }
                case 85: {
                    n14 = 246;
                    break;
                }
                case 86: {
                    n14 = 190;
                    break;
                }
                case 87: {
                    n14 = 74;
                    break;
                }
                case 88: {
                    n14 = 207;
                    break;
                }
                case 89: {
                    n14 = 209;
                    break;
                }
                case 90: {
                    n14 = 76;
                    break;
                }
                case 91: {
                    n14 = 30;
                    break;
                }
                case 92: {
                    n14 = 212;
                    break;
                }
                case 93: {
                    n14 = 253;
                    break;
                }
                case 94: {
                    n14 = 229;
                    break;
                }
                case 95: {
                    n14 = 166;
                    break;
                }
                case 96: {
                    n14 = 67;
                    break;
                }
                case 97: {
                    n14 = 249;
                    break;
                }
                case 98: {
                    n14 = 141;
                    break;
                }
                case 99: {
                    n14 = 125;
                    break;
                }
                case 100: {
                    n14 = 41;
                    break;
                }
                case 101: {
                    n14 = 105;
                    break;
                }
                case 102: {
                    n14 = 49;
                    break;
                }
                case 103: {
                    n14 = 121;
                    break;
                }
                case 104: {
                    n14 = 216;
                    break;
                }
                case 105: {
                    n14 = 88;
                    break;
                }
                case 106: {
                    n14 = 193;
                    break;
                }
                case 107: {
                    n14 = 136;
                    break;
                }
                case 108: {
                    n14 = 179;
                    break;
                }
                case 109: {
                    n14 = 39;
                    break;
                }
                case 110: {
                    n14 = 239;
                    break;
                }
                case 111: {
                    n14 = 127;
                    break;
                }
                case 112: {
                    n14 = 42;
                    break;
                }
                case 113: {
                    n14 = 183;
                    break;
                }
                case 114: {
                    n14 = 145;
                    break;
                }
                case 115: {
                    n14 = 231;
                    break;
                }
                case 116: {
                    n14 = 144;
                    break;
                }
                case 117: {
                    n14 = 167;
                    break;
                }
                case 118: {
                    n14 = 80;
                    break;
                }
                case 119: {
                    n14 = 188;
                    break;
                }
                case 120: {
                    n14 = 156;
                    break;
                }
                case 121: {
                    n14 = 219;
                    break;
                }
                case 122: {
                    n14 = 112;
                    break;
                }
                case 123: {
                    n14 = 150;
                    break;
                }
                case 124: {
                    n14 = 28;
                    break;
                }
                case 125: {
                    n14 = 252;
                    break;
                }
                case 126: {
                    n14 = 159;
                    break;
                }
                case 127: {
                    n14 = 158;
                    break;
                }
                case 128: {
                    n14 = 57;
                    break;
                }
                case 129: {
                    n14 = 197;
                    break;
                }
                case 130: {
                    n14 = 108;
                    break;
                }
                case 131: {
                    n14 = 247;
                    break;
                }
                case 132: {
                    n14 = 143;
                    break;
                }
                case 133: {
                    n14 = 9;
                    break;
                }
                case 134: {
                    n14 = 174;
                    break;
                }
                case 135: {
                    n14 = 117;
                    break;
                }
                case 136: {
                    n14 = 12;
                    break;
                }
                case 137: {
                    n14 = 164;
                    break;
                }
                case 138: {
                    n14 = 5;
                    break;
                }
                case 139: {
                    n14 = 137;
                    break;
                }
                case 140: {
                    n14 = 61;
                    break;
                }
                case 141: {
                    n14 = 47;
                    break;
                }
                case 142: {
                    n14 = 199;
                    break;
                }
                case 143: {
                    n14 = 97;
                    break;
                }
                case 144: {
                    n14 = 244;
                    break;
                }
                case 145: {
                    n14 = 132;
                    break;
                }
                case 146: {
                    n14 = 220;
                    break;
                }
                case 147: {
                    n14 = 102;
                    break;
                }
                case 148: {
                    n14 = 142;
                    break;
                }
                case 149: {
                    n14 = 129;
                    break;
                }
                case 150: {
                    n14 = 43;
                    break;
                }
                case 151: {
                    n14 = 128;
                    break;
                }
                case 152: {
                    n14 = 250;
                    break;
                }
                case 153: {
                    n14 = 211;
                    break;
                }
                case 154: {
                    n14 = 138;
                    break;
                }
                case 155: {
                    n14 = 44;
                    break;
                }
                case 156: {
                    n14 = 110;
                    break;
                }
                case 157: {
                    n14 = 55;
                    break;
                }
                case 158: {
                    n14 = 238;
                    break;
                }
                case 159: {
                    n14 = 134;
                    break;
                }
                case 160: {
                    n14 = 114;
                    break;
                }
                case 161: {
                    n14 = 224;
                    break;
                }
                case 162: {
                    n14 = 2;
                    break;
                }
                case 163: {
                    n14 = 72;
                    break;
                }
                case 164: {
                    n14 = 50;
                    break;
                }
                case 165: {
                    n14 = 86;
                    break;
                }
                case 166: {
                    n14 = 113;
                    break;
                }
                case 167: {
                    n14 = 87;
                    break;
                }
                case 168: {
                    n14 = 11;
                    break;
                }
                case 169: {
                    n14 = 149;
                    break;
                }
                case 170: {
                    n14 = 230;
                    break;
                }
                case 171: {
                    n14 = 255;
                    break;
                }
                case 172: {
                    n14 = 168;
                    break;
                }
                case 173: {
                    n14 = 93;
                    break;
                }
                case 174: {
                    n14 = 228;
                    break;
                }
                case 175: {
                    n14 = 146;
                    break;
                }
                case 176: {
                    n14 = 240;
                    break;
                }
                case 177: {
                    n14 = 77;
                    break;
                }
                case 178: {
                    n14 = 66;
                    break;
                }
                case 179: {
                    n14 = 131;
                    break;
                }
                case 180: {
                    n14 = 154;
                    break;
                }
                case 181: {
                    n14 = 181;
                    break;
                }
                case 182: {
                    n14 = 59;
                    break;
                }
                case 183: {
                    n14 = 208;
                    break;
                }
                case 184: {
                    n14 = 115;
                    break;
                }
                case 185: {
                    n14 = 222;
                    break;
                }
                case 186: {
                    n14 = 245;
                    break;
                }
                case 187: {
                    n14 = 223;
                    break;
                }
                case 188: {
                    n14 = 133;
                    break;
                }
                case 189: {
                    n14 = 111;
                    break;
                }
                case 190: {
                    n14 = 241;
                    break;
                }
                case 191: {
                    n14 = 45;
                    break;
                }
                case 192: {
                    n14 = 173;
                    break;
                }
                case 193: {
                    n14 = 217;
                    break;
                }
                case 194: {
                    n14 = 15;
                    break;
                }
                case 195: {
                    n14 = 122;
                    break;
                }
                case 196: {
                    n14 = 13;
                    break;
                }
                case 197: {
                    n14 = 96;
                    break;
                }
                case 198: {
                    n14 = 178;
                    break;
                }
                case 199: {
                    n14 = 213;
                    break;
                }
                case 200: {
                    n14 = 195;
                    break;
                }
                case 201: {
                    n14 = 17;
                    break;
                }
                case 202: {
                    n14 = 78;
                    break;
                }
                case 203: {
                    n14 = 106;
                    break;
                }
                case 204: {
                    n14 = 35;
                    break;
                }
                case 205: {
                    n14 = 8;
                    break;
                }
                case 206: {
                    n14 = 73;
                    break;
                }
                case 207: {
                    n14 = 248;
                    break;
                }
                case 208: {
                    n14 = 214;
                    break;
                }
                case 209: {
                    n14 = 139;
                    break;
                }
                case 210: {
                    n14 = 194;
                    break;
                }
                case 211: {
                    n14 = 20;
                    break;
                }
                case 212: {
                    n14 = 16;
                    break;
                }
                case 213: {
                    n14 = 215;
                    break;
                }
                case 214: {
                    n14 = 25;
                    break;
                }
                case 215: {
                    n14 = 120;
                    break;
                }
                case 216: {
                    n14 = 171;
                    break;
                }
                case 217: {
                    n14 = 23;
                    break;
                }
                case 218: {
                    n14 = 38;
                    break;
                }
                case 219: {
                    n14 = 0;
                    break;
                }
                case 220: {
                    n14 = 1;
                    break;
                }
                case 221: {
                    n14 = 175;
                    break;
                }
                case 222: {
                    n14 = 75;
                    break;
                }
                case 223: {
                    n14 = 37;
                    break;
                }
                case 224: {
                    n14 = 116;
                    break;
                }
                case 225: {
                    n14 = 180;
                    break;
                }
                case 226: {
                    n14 = 147;
                    break;
                }
                case 227: {
                    n14 = 172;
                    break;
                }
                case 228: {
                    n14 = 4;
                    break;
                }
                case 229: {
                    n14 = 32;
                    break;
                }
                case 230: {
                    n14 = 63;
                    break;
                }
                case 231: {
                    n14 = 124;
                    break;
                }
                case 232: {
                    n14 = 65;
                    break;
                }
                case 233: {
                    n14 = 104;
                    break;
                }
                case 234: {
                    n14 = 170;
                    break;
                }
                case 235: {
                    n14 = 177;
                    break;
                }
                case 236: {
                    n14 = 234;
                    break;
                }
                case 237: {
                    n14 = 3;
                    break;
                }
                case 238: {
                    n14 = 123;
                    break;
                }
                case 239: {
                    n14 = 107;
                    break;
                }
                case 240: {
                    n14 = 62;
                    break;
                }
                case 241: {
                    n14 = 204;
                    break;
                }
                case 242: {
                    n14 = 70;
                    break;
                }
                case 243: {
                    n14 = 227;
                    break;
                }
                case 244: {
                    n14 = 196;
                    break;
                }
                case 245: {
                    n14 = 83;
                    break;
                }
                case 246: {
                    n14 = 31;
                    break;
                }
                case 247: {
                    n14 = 254;
                    break;
                }
                case 248: {
                    n14 = 189;
                    break;
                }
                case 249: {
                    n14 = 157;
                    break;
                }
                case 250: {
                    n14 = 182;
                    break;
                }
                case 251: {
                    n14 = 100;
                    break;
                }
                case 252: {
                    n14 = 198;
                    break;
                }
                case 253: {
                    n14 = 118;
                    break;
                }
                case 254: {
                    n14 = 91;
                    break;
                }
                default: {
                    n14 = 94;
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
            F6.i[n12] = new String(cArray).intern();
        }
        return i[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4DB;
        if (n[n11] == null) {
            F6.n[n11] = (int)(m[n11] ^ l2);
        }
        return n[n11];
    }
}

