/*
 * Decompiled with CFR 0.152.
 */
import com.DI;
import com.KD;
import com.LS;
import com.XF;
import com._y_0;
import com.c;
import com.cj_2;
import com.cp_2;
import com.cs_1;
import com.fv_0;
import com.ky_2;
import com.pa_1;
import com.qe_0;
import com.sx_0;
import com.xf_1;
import com.xt_1;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MenuComponent;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class U
extends JFrame
implements cs_1,
ms_0,
aL,
fb_0 {
    Random hP;
    private static final Map m;
    public static KQ y;
    public static JDialog b;
    int hH;
    _y_0 hr;
    int hm;
    JButton hU;
    JToggleButton hi;
    int z;
    int hv;
    boolean h4;
    public static String hI;
    String hA;
    UU hG;
    aE d;
    float W;
    int hD;
    int J;
    public static int H;
    JPanel a;
    JPanel h0;
    int v;
    aj_0 h1;
    public static ah_0 i;
    _y_0 hn;
    kx_2 R;
    public static ox_2 K;
    public static da_1 f;
    JSplitPane r;
    yp_2 D;
    nY F;
    long X;
    boolean T;
    Rectangle Y;
    Rectangle A;
    Rectangle B;
    int t;
    aM C;
    ge_0 o;
    KV Q;
    F8 P;
    F5 hp;
    CT N;
    CE w;
    C_ O;
    JPanel q;
    public static String j;
    public static String c;
    public static String hY;
    U1 e;
    boolean I;
    JMenu k;
    JPopupMenu hb;
    public static C5 u;
    C_ l;
    Color s;
    Color g;
    RenderingHints h;
    JPanel ha;
    JPanel hg;
    int L;
    int U;
    fx_2 Z;
    m6 hM;
    gH E;
    SystemTray hW;
    TrayIcon V;
    long hQ;
    long n;
    boolean S;
    static long p;
    static long hc;
    int x;
    int hO;
    long G;
    private static String M;
    private static final String[] ab;
    private static final String[] bb;
    private static final long[] cb;
    private static final Integer[] db;
    private static final long[] eb;
    private static final Long[] fb;

    public U() {
        super((String)yy_2.V);
        Object object;
        this.hP = new Random();
        this.hH = 1;
        this.hm = 0;
        this.z = -1;
        this.hv = U.a(20630, 8580117942563997816L);
        this.h4 = false;
        this.hA = "";
        this.W = 1.0f;
        this.hD = U.a(7618, 1402006728911439145L);
        this.J = U.a(25099, 1307261021286185702L);
        this.hn = null;
        this.T = false;
        this.t = 0;
        this.Q = new KV();
        this.I = false;
        this.s = new Color(U.a(17215, 5362272149277547463L), U.a(17215, 5362272149277547463L), U.a(17215, 5362272149277547463L));
        this.g = new Color(U.a(18166, 2359152542876802590L), U.a(17215, 5362272149277547463L), U.a(6637, 1130080905756295431L));
        this.h = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.L = U.a(22423, 1750005948873314171L);
        this.U = ((Random)this.hP).nextInt();
        this.hQ = U.b(11436, 7702393800341353154L);
        try {
            object = lk_0.B("OWkdLCgGVzl0SWM4eyBaAk8HEgwhlkIkF7k0ej7DGBm+iSjM5lniwgOWzqYeRtHL7mPb5Q==");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        U.hI = object;
        this.n = System.currentTimeMillis();
        this.S = false;
        this.x = 0;
        this.hO = -1;
        this.G = System.currentTimeMillis();
    }

    @Override
    public void setLocation(int n10, int n11) {
        super.setLocation(n10, n11);
    }

    public void s() {
        try {
            lk_0.V(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void a(boolean bl) {
        QP qP;
        block86: {
            block85: {
                String[] stringArray;
                block84: {
                    Object object;
                    zG zG2;
                    Object object2;
                    Object object3;
                    zG zG3;
                    u6_0 u6_02;
                    int n10;
                    u6_0 u6_03;
                    block83: {
                        block79: {
                            Rectangle rectangle;
                            block82: {
                                block81: {
                                    Rectangle rectangle2;
                                    int n11;
                                    int n12;
                                    block80: {
                                        Rectangle rectangle3;
                                        block78: {
                                            Rectangle rectangle4;
                                            u6_0 u6_04;
                                            Object object4;
                                            long l2 = System.currentTimeMillis();
                                            stringArray = F8.y();
                                            try {
                                                object4 = yt_1.i();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                u6_04 = (u6_0)object4.h();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            u6_03 = u6_04;
                                            try {
                                                rectangle4 = (Rectangle)u6_03.B();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (stringArray == null) {
                                                if (rectangle4 == null) {
                                                    this.setSize(this.hD, this.J);
                                                }
                                                try {
                                                    rectangle4 = (Rectangle)u6_03.B();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                            }
                                            rectangle3 = rectangle = rectangle4;
                                            if (stringArray != null) break block78;
                                            if (rectangle3 == null) break block79;
                                            rectangle3 = rectangle;
                                        }
                                        n12 = rectangle3.x;
                                        if (stringArray == null) {
                                            if (n12 < 0) {
                                                rectangle.x = 0;
                                            }
                                            n12 = rectangle.y;
                                        }
                                        if (stringArray == null) {
                                            if (n12 < 0) {
                                                rectangle.y = 0;
                                            }
                                            n12 = rectangle.width;
                                        }
                                        n11 = U.a(6578, 5223317279511200083L);
                                        if (stringArray != null) break block80;
                                        if (n12 < n11) {
                                            rectangle.width = U.a(6637, 1130080905756295431L);
                                        }
                                        rectangle2 = rectangle;
                                        if (stringArray != null) break block81;
                                        n12 = rectangle2.height;
                                        n11 = U.a(6637, 1130080905756295431L);
                                    }
                                    if (n12 >= n11) break block82;
                                    rectangle2 = rectangle;
                                }
                                rectangle2.height = U.a(6637, 1130080905756295431L);
                            }
                            this.setBounds(rectangle);
                            if (stringArray == null) break block83;
                        }
                        this.setLocationRelativeTo(null);
                    }
                    try {
                        n10 = ((Boolean)u6_03.d()).booleanValue();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray == null) {
                        int n13;
                        int n14;
                        if (n10 != 0) {
                            this.setExtendedState(this.getExtendedState() | U.a(1289, 6556516967129669109L));
                        }
                        try {
                            n14 = (Integer)u6_03.a();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        U.H = n14;
                        try {
                            n13 = (Integer)u6_03.R();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        this.v = n13;
                        n10 = ((JPanel)com.c.c((long)187791590270141607L).get((Object)this)).getMinimumSize().width;
                    }
                    int n15 = n10;
                    int n16 = U.H;
                    if (stringArray == null) {
                        Object object5;
                        if (n16 < n15) {
                            U.H = n15;
                        }
                        ((JSplitPane)this.r).setDividerLocation(U.H);
                        try {
                            object5 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            u6_02 = (u6_0)object5.h();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (stringArray == null) {
                            try {
                                n16 = ((Boolean)u6_02.B()).booleanValue() ? 1 : 0;
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                    } else {
                        Object object6;
                        Object object7;
                        if (n16 == 0) {
                            ((yp_2)this.D).removeAll();
                            ((yp_2)this.D).add((Component)((JPanel)this.a), "growx ,growy");
                        }
                        try {
                            object7 = yt_1.F.V((Object)new qn_0(this), U.a(22329, 2348891917367250896L));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        this.E = object7;
                        try {
                            object6 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            u6_02 = (u6_0)object6.h();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    try {
                        zG3 = (zG)u6_02.L(US.A);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    zG zG4 = zG3;
                    try {
                        object3 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object2 = object3.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        zG2 = (zG)object2.L(US.W);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    zG zG5 = zG2;
                    qP = new QP(this, this, zG4, zG5);
                    try {
                        object = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object.B(this);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray != null) break block84;
                    if (yt_1.yi) {
                        try {
                            this.setVisible(true);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.setVisible(false);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block85;
                }
                if (stringArray == null) break block86;
            }
            try {
                this.setVisible(bl);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        SwingUtilities.invokeLater(new mz_0(this));
        try {
            yt_1.F.J(new O7(this, qP));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new ka_2(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void k() {
        ((aE)this.d).setDividerLocation(((aE)this.d).getHeight());
        ((aE)this.d).setDividerSize(0);
        this.validate();
        this.doLayout();
    }

    public void N(boolean bl) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        try {
            object5 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object4 = object5.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.Z = object4;
        try {
            object3 = this.Z.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.hM = object3;
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
        this.R = object;
        try {
            yt_1.F.J(new l0_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String[] stringArray = F8.y();
        try {
            yt_1.F.J(new yb_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new xt_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.a = new JPanel();
        String[] stringArray2 = stringArray;
        this.n = System.currentTimeMillis();
        try {
            yt_1.F.J(new BB(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new fj_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new KF(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.l();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.addWindowListener(new BK(this));
        this.addComponentListener(new dc_0(this));
        this.addWindowStateListener(new TV(this));
        if (stringArray2 == null) {
            if ((ah_0)U.i == null) {
                U.i = new ah_0();
            }
            try {
                yt_1.F.J(new OM(this));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.addWindowListener(new x6(this));
            this.addWindowListener(new f6_0(this));
        }
    }

    /*
     * Loose catch block
     */
    void f() {
        block13: {
            Object object;
            PopupMenu popupMenu;
            block12: {
                String[] stringArray = F8.y();
                if (!SystemTray.isSupported()) break block13;
                popupMenu = new PopupMenu();
                this.hW = SystemTray.getSystemTray();
                this.V = new TrayIcon((Image)cy_1.r, "FinalShell", popupMenu);
                ((TrayIcon)this.V).setImageAutoSize(true);
                ((TrayIcon)this.V).setImageAutoSize(true);
                ((TrayIcon)this.V).addMouseListener(new bn_2(this));
                try {
                    ((SystemTray)this.hW).add((TrayIcon)this.V);
                }
                catch (AWTException aWTException) {
                    aWTException.printStackTrace();
                }
                try {
                    MenuItem menuItem = new MenuItem("Show Window");
                    menuItem.setFont((Font)fx_2.j);
                    object = new yb_2(this);
                    MenuItem menuItem2 = menuItem;
                    if (stringArray != null) break block12;
                    try {
                        block14: {
                            boolean bl;
                            menuItem2.addActionListener((ActionListener)object);
                            try {
                                bl = (Boolean)vk_0.g();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (!bl) break block12;
                            break block14;
                            catch (AWTException aWTException) {
                                throw U.a(aWTException);
                            }
                        }
                        menuItem2 = popupMenu.add(menuItem);
                    }
                    catch (AWTException aWTException) {
                        throw U.a(aWTException);
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            try {
                object = new MenuItem("Close");
                ((MenuComponent)object).setFont((Font)fx_2.j);
                js_0 js_02 = new js_0(this);
                ((MenuItem)object).addActionListener(js_02);
                popupMenu.add((MenuItem)object);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public boolean l() {
        return this.S;
    }

    public static void P() {
        U.b = new JDialog();
        ((JDialog)U.b).setSize(0, 0);
        ((JDialog)U.b).setVisible(false);
    }

    public void h() {
        t3_0 t3_02;
        CL cL;
        try {
            cL = (CL)this.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        CL cL2 = cL;
        try {
            t3_02 = (t3_0)cL2.X();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            t3_03.I("新标签页");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            t3_03.X(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            t3_03.e();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void H(File file, boolean bl) {
        ArrayList arrayList;
        try {
            arrayList = (ArrayList)this.C.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.w((Object)file, bl, arrayList.size());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void w(File var1_1, boolean var2_2, int var3_3) {
        block140: {
            block146: {
                block147: {
                    block145: {
                        block144: {
                            block155: {
                                block143: {
                                    block142: {
                                        block141: {
                                            block127: {
                                                block139: {
                                                    block137: {
                                                        block138: {
                                                            block135: {
                                                                block136: {
                                                                    block152: {
                                                                        block153: {
                                                                            block134: {
                                                                                block133: {
                                                                                    block132: {
                                                                                        block131: {
                                                                                            block130: {
                                                                                                block129: {
                                                                                                    block128: {
                                                                                                        block150: {
                                                                                                            block149: {
                                                                                                                block148: {
                                                                                                                    var5_4 = null;
                                                                                                                    var6_5 = false;
                                                                                                                    var4_6 = F8.y();
                                                                                                                    try {
                                                                                                                        v0 = (_y_0)this.n();
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException v1) {
                                                                                                                        throw v1.getTargetException();
                                                                                                                    }
                                                                                                                    var7_7 = v0;
                                                                                                                    try {
                                                                                                                        v2 = yt_1.i();
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException v3) {
                                                                                                                        throw v3.getTargetException();
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        v4 = v2.g();
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException v5) {
                                                                                                                        throw v5.getTargetException();
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        v6 = (lv_2)v4.q(var1_1.getAbsolutePath());
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException v7) {
                                                                                                                        throw v7.getTargetException();
                                                                                                                    }
                                                                                                                    var8_8 = v6;
                                                                                                                    try {
                                                                                                                        var8_8.n(System.currentTimeMillis());
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException v8) {
                                                                                                                        throw v8.getTargetException();
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        v9 = yt_1.i();
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException v10) {
                                                                                                                        throw v10.getTargetException();
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        v11 = v9.g();
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException v12) {
                                                                                                                        throw v12.getTargetException();
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        v11.K(var8_8);
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException v13) {
                                                                                                                        throw v13.getTargetException();
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        v14 = (Integer)var8_8.I();
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException v15) {
                                                                                                                        throw v15.getTargetException();
                                                                                                                    }
                                                                                                                    var9_9 = v14;
                                                                                                                    v16 = var9_9;
                                                                                                                    v17 = lv_2.C;
                                                                                                                    if (var4_6 != null) break block127;
                                                                                                                    if (v16 != v17) ** GOTO lbl198
                                                                                                                    break block148;
                                                                                                                    catch (Exception v18) {
                                                                                                                        throw U.a(v18);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    v19 = this.o();
                                                                                                                }
                                                                                                                catch (InvocationTargetException v20) {
                                                                                                                    throw v20.getTargetException();
                                                                                                                }
                                                                                                                try {
                                                                                                                    v21 = (ArrayList)v19.g();
                                                                                                                }
                                                                                                                catch (InvocationTargetException v22) {
                                                                                                                    throw v22.getTargetException();
                                                                                                                }
                                                                                                                v23 = v21.size();
                                                                                                                if (var4_6 != null) break block128;
                                                                                                                break block149;
                                                                                                                catch (Exception v24) {
                                                                                                                    throw U.a(v24);
                                                                                                                }
                                                                                                            }
                                                                                                            if (!v23) ** GOTO lbl95
                                                                                                            break block150;
                                                                                                            catch (Exception v25) {
                                                                                                                throw U.a(v25);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            block151: {
                                                                                                                if (var7_7 != null) break block129;
                                                                                                                break block151;
                                                                                                                catch (Exception v26) {
                                                                                                                    throw U.a(v26);
                                                                                                                }
                                                                                                            }
                                                                                                            v23 = true;
                                                                                                        }
                                                                                                        catch (Exception v27) {
                                                                                                            throw U.a(v27);
                                                                                                        }
                                                                                                    }
                                                                                                    var6_5 = v23;
                                                                                                    if (var4_6 == null) break block135;
                                                                                                }
                                                                                                var10_10 = null;
                                                                                                try {
                                                                                                    v28 = var7_7;
                                                                                                    if (var4_6 != null) break block130;
                                                                                                    if (v28 == null) break block131;
                                                                                                }
                                                                                                catch (Exception v29) {
                                                                                                    throw U.a(v29);
                                                                                                }
                                                                                                v28 = var7_7;
                                                                                            }
                                                                                            var10_10 = (cj_2)v28.s();
                                                                                        }
                                                                                        var11_11 = null;
                                                                                        try {
                                                                                            v30 = var10_10;
                                                                                            if (var4_6 != null) break block132;
                                                                                            if (v30 == null) break block133;
                                                                                        }
                                                                                        catch (Exception v31) {
                                                                                            throw U.a(v31);
                                                                                        }
                                                                                        v30 = var10_10;
                                                                                    }
                                                                                    var11_11 = v30.e();
                                                                                }
                                                                                try {
                                                                                    v32 = var11_11;
                                                                                    if (var4_6 != null) break block134;
                                                                                    if (v32 == null) break block135;
                                                                                }
                                                                                catch (Exception v33) {
                                                                                    throw U.a(v33);
                                                                                }
                                                                                v32 = var11_11;
                                                                            }
                                                                            v34 = v32.t();
                                                                            if (var4_6 != null) break block136;
                                                                            if (v34) break block152;
                                                                            break block153;
                                                                            catch (Exception v35) {
                                                                                throw U.a(v35);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block154: {
                                                                                v34 = var11_11.i();
                                                                                if (var4_6 != null) break block136;
                                                                                break block154;
                                                                                catch (Exception v36) {
                                                                                    throw U.a(v36);
                                                                                }
                                                                            }
                                                                            if (!v34) break block135;
                                                                        }
                                                                        catch (Exception v37) {
                                                                            throw U.a(v37);
                                                                        }
                                                                    }
                                                                    v34 = true;
                                                                }
                                                                var6_5 = v34;
                                                            }
                                                            var10_10 = null;
                                                            try {
                                                                v38 = var2_2;
                                                                if (var4_6 != null) break block137;
                                                                if (!v38) break block138;
                                                            }
                                                            catch (Exception v39) {
                                                                throw U.a(v39);
                                                            }
                                                            var6_5 = true;
                                                        }
                                                        v38 = var6_5;
                                                    }
                                                    if (v38) {
                                                        try {
                                                            v40 = (_y_0)this.Y(var3_3);
                                                        }
                                                        catch (InvocationTargetException v41) {
                                                            throw v41.getTargetException();
                                                        }
                                                        var10_10 = v40;
                                                    } else {
                                                        var10_10 = var7_7;
                                                    }
                                                    try {
                                                        if (var9_9 != lv_2.C) break block139;
                                                        try {
                                                            this.A(var10_10, (Object)var1_1.getAbsolutePath(), var6_5);
                                                        }
                                                        catch (InvocationTargetException v42) {
                                                            throw v42.getTargetException();
                                                        }
                                                    }
                                                    catch (Exception v43) {
                                                        throw U.a(v43);
                                                    }
                                                }
                                                try {
                                                    if (var4_6 == null) break block140;
lbl198:
                                                    // 2 sources

                                                    v16 = var9_9;
                                                    v17 = lv_2.F;
                                                }
                                                catch (Exception v44) {
                                                    throw U.a(v44);
                                                }
                                            }
                                            if (v16 != v17) break block140;
                                            var5_4 = var8_8;
                                            var10_10 = Toolkit.getDefaultToolkit().getScreenSize();
                                            try {
                                                v45 = (Integer)var5_4.u();
                                            }
                                            catch (InvocationTargetException v46) {
                                                throw v46.getTargetException();
                                            }
                                            var11_12 = v45;
                                            try {
                                                v47 = (Integer)var5_4.j();
                                            }
                                            catch (InvocationTargetException v48) {
                                                throw v48.getTargetException();
                                            }
                                            var12_13 = v47;
                                            var13_14 = (var10_10.width - var11_12) / 2;
                                            var14_15 = (var10_10.height - var12_13) / 2;
                                            var15_16 = null;
                                            try {
                                                v49 = (Boolean)var5_4.v();
                                            }
                                            catch (InvocationTargetException v50) {
                                                throw v50.getTargetException();
                                            }
                                            if (v49) {
                                                var15_16 = File.listRoots();
                                            }
                                            var16_17 = "";
                                            try {
                                                v51 = (String)var5_4.E();
                                            }
                                            catch (InvocationTargetException v52) {
                                                throw v52.getTargetException();
                                            }
                                            var18_19 = var17_18 = v51;
                                            try {
                                                v53 = var18_19.contains("@");
                                                if (var4_6 != null) break block141;
                                                if (v53) {
                                                }
                                                ** GOTO lbl253
                                            }
                                            catch (Exception v54) {
                                                throw U.a(v54);
                                            }
                                            var19_20 = var18_19.indexOf("@");
                                            var17_18 = var18_19.substring(0, var19_20);
                                            var16_17 = var18_19.substring(var19_20 + 1);
                                            try {
                                                if (var4_6 == null) break block142;
lbl253:
                                                // 2 sources

                                                v53 = var18_19.contains("\\");
                                            }
                                            catch (Exception v55) {
                                                throw U.a(v55);
                                            }
                                        }
                                        try {
                                            if (var4_6 != null) break block143;
                                            if (!v53) break block142;
                                        }
                                        catch (Exception v56) {
                                            throw U.a(v56);
                                        }
                                        var19_20 = var18_19.indexOf("\\");
                                        var16_17 = var18_19.substring(0, var19_20);
                                        var17_18 = var18_19.substring(var19_20 + 1);
                                    }
                                    try {
                                        v53 = (Boolean)var5_4.o();
                                    }
                                    catch (InvocationTargetException v57) {
                                        throw v57.getTargetException();
                                    }
                                }
                                if (var4_6 != null) break block144;
                                if (v53) break block145;
                                break block155;
                                catch (Exception v58) {
                                    throw U.a(v58);
                                }
                            }
                            try {
                                block156: {
                                    try {
                                        v59 = (String)var5_4.i();
                                    }
                                    catch (InvocationTargetException v60) {
                                        throw v60.getTargetException();
                                    }
                                    if (var4_6 != null) break block146;
                                    break block156;
                                    catch (Exception v61) {
                                        throw U.a(v61);
                                    }
                                }
                                v53 = v59.equals("0");
                            }
                            catch (Exception v62) {
                                throw U.a(v62);
                            }
                        }
                        if (v53) ** GOTO lbl372
                    }
                    try {
                        v63 = (String)var5_4.F();
                    }
                    catch (InvocationTargetException v64) {
                        throw v64.getTargetException();
                    }
                    var19_21 = v63 + "(加速)";
                    try {
                        try {
                            v65 = (String)var5_4.i();
                        }
                        catch (InvocationTargetException v66) {
                            throw v66.getTargetException();
                        }
                        if (var4_6 == null) {
                            if (!v65.equals("0")) {
                            }
                            break block147;
                        }
                        ** GOTO lbl333
                    }
                    catch (Exception v67) {
                        throw U.a(v67);
                    }
                    try {
                        v68 = (String)var5_4.F();
                    }
                    catch (InvocationTargetException v69) {
                        throw v69.getTargetException();
                    }
                    var19_21 = v68 + "(代理服务器)";
                }
                try {
                    v65 = (String)dd_1.W;
lbl333:
                    // 2 sources

                    try {
                        v70 = var5_4.v();
                    }
                    catch (InvocationTargetException v71) {
                        throw v71.getTargetException();
                    }
                    try {
                        v72 = (Integer)var5_4.X();
                    }
                    catch (InvocationTargetException v73) {
                        throw v73.getTargetException();
                    }
                    try {
                        v74 = (xB)cf_0.C((Object)v65, dd_1.E, v70, v72, (Object)var5_4, dd_1.P);
                    }
                    catch (InvocationTargetException v75) {
                        throw v75.getTargetException();
                    }
                    var20_22 = v74;
                    try {
                        v76 = (String)var5_4.r();
                    }
                    catch (InvocationTargetException v77) {
                        throw v77.getTargetException();
                    }
                    try {
                        v78 = (Integer)var20_22.H();
                    }
                    catch (InvocationTargetException v79) {
                        throw v79.getTargetException();
                    }
                    try {
                        v80 = (Boolean)var5_4.O();
                    }
                    catch (InvocationTargetException v81) {
                        throw v81.getTargetException();
                    }
                    sx_0.e(var19_21, true, v76, var17_18, "127.0.0.1:" + v78, var16_17, var13_14, var14_15, var11_12, var12_13, var15_16, v80);
                }
                catch (Exception var20_23) {
                    var20_23.printStackTrace();
                }
                try {
                    if (var4_6 == null) break block140;
lbl372:
                    // 2 sources

                    try {
                        v59 = (String)var5_4.F();
                    }
                    catch (InvocationTargetException v82) {
                        throw v82.getTargetException();
                    }
                }
                catch (Exception v83) {
                    throw U.a(v83);
                }
            }
            try {
                v84 = (String)var5_4.r();
            }
            catch (InvocationTargetException v85) {
                throw v85.getTargetException();
            }
            try {
                v86 = (String)var5_4.v();
            }
            catch (InvocationTargetException v87) {
                throw v87.getTargetException();
            }
            try {
                v88 = (Integer)var5_4.X();
            }
            catch (InvocationTargetException v89) {
                throw v89.getTargetException();
            }
            try {
                v90 = (Boolean)var5_4.O();
            }
            catch (InvocationTargetException v91) {
                throw v91.getTargetException();
            }
            sx_0.e(v59, true, v84, var17_18, v86 + ":" + v88, var16_17, var13_14, var14_15, var11_12, var12_13, var15_16, v90);
        }
        try {
            try {
                v92 = yt_1.i();
            }
            catch (InvocationTargetException v93) {
                throw v93.getTargetException();
            }
            try {
                v94 = v92.h();
            }
            catch (InvocationTargetException v95) {
                throw v95.getTargetException();
            }
            try {
                v96 = (Boolean)v94.i();
            }
            catch (InvocationTargetException v97) {
                throw v97.getTargetException();
            }
            if (v96) {
                SwingUtilities.invokeLater(new x5(this));
            }
        }
        catch (Exception v98) {
            throw U.a(v98);
        }
    }

    @Override
    protected void processWindowEvent(WindowEvent windowEvent) {
        block10: {
            block11: {
                int n10;
                int n11;
                block12: {
                    boolean bl;
                    Object object;
                    Object object2;
                    String[] stringArray = F8.y();
                    if (stringArray != null) break block10;
                    try {
                        object2 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = object2.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        bl = (Boolean)object.c();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl) break block11;
                    n11 = windowEvent.getID();
                    if (stringArray != null) break block12;
                    if (n11 != U.a(30423, 4174033386881592874L)) break block11;
                    n11 = JOptionPane.showConfirmDialog(this, "确定关闭窗口吗?", "消息", 0);
                }
                if ((n10 = n11) != 0) {
                    return;
                }
            }
            super.processWindowEvent(windowEvent);
        }
    }

    public nY k() {
        return (nY)this.F;
    }

    public void Z(nY nY2) {
        this.F = nY2;
    }

    public yp_2 n() {
        return (yp_2)this.D;
    }

    public void n(yp_2 yp_22) {
        this.D = yp_22;
    }

    void u() {
        U.p = System.currentTimeMillis();
    }

    void V() {
        ((Hashtable)lk_0.X).put(kx_2.q, U.b(6827, 7846952360063419587L));
    }

    void j() {
        long l2 = System.currentTimeMillis() - this.X;
        String[] stringArray = F8.y();
        if (stringArray == null) {
            if (l2 >= 0L && l2 < U.b(6843, 491614487839655127L)) {
                this.Y = new Rectangle(((Rectangle)com.c.c((long)620488187317011732L).get((Object)this)).x, ((Rectangle)com.c.c((long)620488187317011732L).get((Object)this)).y, ((Rectangle)com.c.c((long)620488187317011732L).get((Object)this)).width, ((Rectangle)com.c.c((long)620488187317011732L).get((Object)this)).height);
            }
            this.B = this.A;
            this.A = this.getBounds();
        }
    }

    void A() {
        String[] stringArray;
        u6_0 u6_02;
        block28: {
            U u10;
            u6_0 u6_03;
            block26: {
                block27: {
                    u6_0 u6_04;
                    Object object;
                    try {
                        object = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        u6_04 = (u6_0)object.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    u6_02 = u6_04;
                    stringArray = F8.y();
                    u6_03 = u6_02;
                    u10 = this;
                    if (stringArray != null) break block26;
                    try {
                        u6_03.o(u10.T);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (this.T) break block27;
                    try {
                        u6_02.v(this.getBounds());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray == null) break block28;
                }
                u6_03 = u6_02;
                u10 = this;
            }
            try {
                u6_03.v(u10.Y);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        try {
            u6_02.Y(((JSplitPane)this.r).getDividerLocation());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (stringArray == null) {
            Object object;
            int n10;
            try {
                n10 = (Integer)this.d.getDividerLocation();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (n10 != ((aE)this.d).getHeight()) {
                int n11;
                try {
                    n11 = (Integer)this.d.getDividerLocation();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                int n12 = ((aE)this.d).getHeight() - n11 - this.L;
                try {
                    u6_02.n(n12);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
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
    }

    public void z() {
        Object object;
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void e() {
        try {
            this.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.X();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void w() {
        String[] stringArray = F8.y();
        if (stringArray == null) {
            int n10;
            boolean bl;
            Object object;
            Object object2;
            try {
                object2 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.h();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                bl = (Boolean)object.c();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (bl && (n10 = JOptionPane.showConfirmDialog(this, "确定关闭窗口吗?", "消息", 0)) != 0) {
                return;
            }
            try {
                this.A();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.R();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.X();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void r() {
        block18: {
            U u10;
            block16: {
                block17: {
                    boolean bl;
                    Object object;
                    Object object2;
                    String[] stringArray = F8.y();
                    try {
                        this.A();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String[] stringArray2 = stringArray;
                    u10 = this;
                    if (stringArray2 != null) break block16;
                    try {
                        u10.R();
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
                        object = object2.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        bl = (Boolean)object.Z();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl) break block17;
                    try {
                        this.setVisible(false);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray2 == null) break block18;
                }
                u10 = this;
            }
            try {
                u10.X();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    private void R() {
        ArrayList arrayList;
        try {
            arrayList = (ArrayList)this.C.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ArrayList arrayList2 = arrayList;
        String[] stringArray = F8.y();
        for (t3_0 t3_02 : arrayList2) {
            block8: {
                DI dI;
                block9: {
                    DI dI2;
                    F8 f82;
                    block7: {
                        F8 f83;
                        F8 f84;
                        try {
                            f84 = (F8)t3_02.P();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        f82 = f83 = f84;
                        if (stringArray != null) break block7;
                        if (!f82.getClass().equals(_y_0.class)) break block8;
                        f82 = f83;
                    }
                    _y_0 _y_02 = (_y_0)f82;
                    dI = dI2 = _y_02.s().e();
                    if (stringArray != null) break block9;
                    if (dI == null) break block8;
                    dI = dI2;
                }
                dI.G();
            }
            if (stringArray == null) continue;
        }
    }

    private void X() {
        int n10;
        m6 m62;
        Object object;
        Object object2;
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            m62 = (m6)object.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        m6 m63 = m62;
        String[] stringArray = F8.y();
        try {
            m63.o(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String[] stringArray2 = stringArray;
        try {
            this.E.Z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.C.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        U u10 = this;
        if (stringArray2 == null) {
            if ((SystemTray)u10.hW != null) {
                ((SystemTray)this.hW).remove((TrayIcon)this.V);
            }
            try {
                this.setVisible(false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            u10 = this;
        }
        u10.dispose();
        try {
            n10 = (Integer)m63.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (n10 == 0) {
            Object object3;
            try {
                object3 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object3.o();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
    }

    public synchronized void t() {
        block91: {
            U u10;
            block111: {
                boolean bl;
                block109: {
                    String[] stringArray;
                    block110: {
                        _y_0 _y_02;
                        KV kV;
                        Object object;
                        Object object2;
                        block105: {
                            block106: {
                                block108: {
                                    Object object3;
                                    KV kV2;
                                    ty_0 ty_02;
                                    block107: {
                                        _y_0 _y_03;
                                        block103: {
                                            block104: {
                                                _y_0 _y_04;
                                                block101: {
                                                    block102: {
                                                        lv_2 lv_22;
                                                        KV kV3;
                                                        block92: {
                                                            block93: {
                                                                U u11;
                                                                block94: {
                                                                    block95: {
                                                                        block100: {
                                                                            block97: {
                                                                                block99: {
                                                                                    Object object4;
                                                                                    Object object5;
                                                                                    block98: {
                                                                                        KV kV4;
                                                                                        Object object6;
                                                                                        block96: {
                                                                                            F8 f82;
                                                                                            block89: {
                                                                                                block90: {
                                                                                                    stringArray = F8.y();
                                                                                                    U u12 = this;
                                                                                                    if (stringArray == null) {
                                                                                                        if ((aj_0)u12.h1 == null) {
                                                                                                            return;
                                                                                                        }
                                                                                                        try {
                                                                                                            this.Q.E(this);
                                                                                                        }
                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                        }
                                                                                                        u12 = this;
                                                                                                    }
                                                                                                    f82 = (F8)u12.P;
                                                                                                    if (stringArray != null) break block89;
                                                                                                    if (f82 != null) break block90;
                                                                                                    try {
                                                                                                        this.h1.I(this.Q, null);
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    if (stringArray == null) break block91;
                                                                                                }
                                                                                                f82 = (F8)this.P;
                                                                                            }
                                                                                            bl = f82.getClass().equals(_y_0.class);
                                                                                            if (stringArray != null) break block92;
                                                                                            if (!bl) break block93;
                                                                                            u11 = this;
                                                                                            if (stringArray != null) break block94;
                                                                                            if ((_y_0)u11.hr == null) break block95;
                                                                                            object6 = object2 = ((_y_0)this.hr).M();
                                                                                            if (stringArray != null) break block96;
                                                                                            if (object6 == null) break block97;
                                                                                            object6 = object2;
                                                                                        }
                                                                                        try {
                                                                                            kV4 = (KV)object6.p();
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                        object5 = object = kV4;
                                                                                        if (stringArray != null) break block98;
                                                                                        if (object5 == null) break block99;
                                                                                        try {
                                                                                            object.E(this);
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                        object5 = object;
                                                                                    }
                                                                                    try {
                                                                                        object5.O(this.hr);
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        object4 = ((_y_0)this.hr).a().g();
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        this.h1.I(object, object4);
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                }
                                                                                if (stringArray == null) break block100;
                                                                            }
                                                                            try {
                                                                                this.h1.I(this.Q, null);
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                        }
                                                                        if (stringArray == null) break block91;
                                                                    }
                                                                    u11 = this;
                                                                }
                                                                try {
                                                                    u11.h1.I(this.Q, null);
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                if (stringArray == null) break block91;
                                                            }
                                                            bl = ((F8)this.P).getClass().equals(F5.class);
                                                        }
                                                        if (stringArray != null) break block101;
                                                        if (!bl) break block102;
                                                        try {
                                                            kV3 = (KV)this.hp.G();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        object2 = kV3;
                                                        object = null;
                                                        try {
                                                            lv_22 = (lv_2)this.hp.t();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        if (stringArray == null) {
                                                            if (lv_22 != null) {
                                                                try {
                                                                    lv_22 = (lv_2)this.hp.t();
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                            }
                                                        } else {
                                                            String string;
                                                            try {
                                                                string = (String)lv_22.g();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            object = string;
                                                        }
                                                        try {
                                                            this.h1.I(object2, object);
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            this.h1.P();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        if (stringArray == null) break block91;
                                                    }
                                                    bl = ((F8)this.P).getClass().equals(CT.class);
                                                }
                                                if (stringArray != null) break block103;
                                                if (!bl) break block104;
                                                try {
                                                    _y_04 = (_y_0)this.N.t();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                object2 = _y_04;
                                                object = ((_y_0)object2).M();
                                                if (object != null) {
                                                    String string;
                                                    String string2;
                                                    try {
                                                        string2 = (String)((_y_0)object2).a().g();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        string = (String)this.N.T();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    if (string2.equals(string)) {
                                                        Object object7;
                                                        KV kV5;
                                                        try {
                                                            kV5 = (KV)object.p();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        kV = kV5;
                                                        try {
                                                            object7 = this.N.T();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            this.h1.I((Object)kV, object7);
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                    }
                                                }
                                                if (stringArray == null) break block91;
                                            }
                                            bl = ((F8)this.P).getClass().equals(C4.class);
                                        }
                                        if (stringArray != null) break block105;
                                        if (!bl) break block106;
                                        try {
                                            _y_03 = (_y_0)this.P.t();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        object2 = _y_03;
                                        object = ((_y_0)object2).M();
                                        ty_02 = object;
                                        if (stringArray != null) break block107;
                                        if (ty_02 == null) break block108;
                                        ty_02 = object;
                                    }
                                    try {
                                        kV2 = (KV)ty_02.p();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    kV = kV2;
                                    try {
                                        object3 = this.P.T();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        this.h1.I((Object)kV, object3);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                                if (stringArray == null) break block91;
                            }
                            bl = ((F8)this.P).getClass().equals(CE.class);
                        }
                        if (stringArray != null) break block109;
                        if (!bl) break block110;
                        try {
                            _y_02 = (_y_0)this.w.t();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        object2 = _y_02;
                        object = ((_y_0)object2).M();
                        if (object != null) {
                            String string;
                            String string3;
                            try {
                                string3 = (String)((_y_0)object2).a().g();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                string = (String)this.w.T();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (string3.equals(string)) {
                                Object object8;
                                KV kV6;
                                try {
                                    kV6 = (KV)object.p();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                kV = kV6;
                                try {
                                    object8 = this.w.T();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    this.h1.I((Object)kV, object8);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                        }
                        if (stringArray == null) break block91;
                    }
                    u10 = this;
                    if (stringArray != null) break block111;
                    bl = ((F8)u10.P).getClass().equals(CL.class);
                }
                if (!bl) break block91;
                try {
                    this.h1.I(this.Q, null);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                u10 = this;
            }
            try {
                u10.h1.a();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    JSplitPane l(JFrame jFrame) {
        Object object;
        u6_0 u6_02;
        Object object2;
        C_ c_;
        Object object3;
        Object object4;
        Object object5;
        this.d = new aE(0);
        ((aE)this.d).setBorder(null);
        String[] stringArray = F8.y();
        ((aE)this.d).setResizeWeight(this.W);
        ((aE)this.d).setOpaque(false);
        ((aE)this.d).setDividerSize(0);
        String[] stringArray2 = stringArray;
        SwingUtilities.invokeLater(new ux_0(this));
        this.hg = new JPanel();
        ((JPanel)this.hg).setBorder(null);
        ((JPanel)this.hg).setOpaque(false);
        ((JPanel)this.hg).setLayout(new MigLayout("insets 0 0 0 0", "[]0", "[]0[]0[]0"));
        this.C = new aM(true);
        try {
            this.C.m(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.C.d(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.C.J(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.C.G(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.q = new JPanel();
        ((JPanel)this.q).setLayout(new MigLayout("insets 0 10 0 10", "[]0[]", "[]0[]"));
        ((JPanel)this.q).setOpaque(false);
        try {
            object5 = lk_0.U("\uf115");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.O = object5;
        Color color = new Color(U.a(4340, 4217835602806884368L), U.a(19666, 3820787202038273077L), U.a(1718, 1428167295437659728L));
        ((C_)this.O).setForeground(color);
        Color color2 = new Color(U.a(28163, 5913372509456938732L), U.a(17215, 5362272149277547463L), U.a(26933, 7737798623767048654L));
        try {
            this.O.M(this.h);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((C_)this.O).setFont((Font)fx_2.g);
        ((C_)this.O).setBorder(BorderFactory.createEmptyBorder(3, 0, 2, 1));
        ((C_)this.O).addMouseListener(new FW(this, color2, color));
        ((C_)this.O).setFocusable(false);
        ((C_)this.O).addActionListener(new LT(this));
        ((C_)this.O).addActionListener(new LV(this));
        ((JPanel)this.q).add((C_)this.O);
        try {
            this.C.q(this.q);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object4 = lk_0.U("\uf009");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.l = object4;
        ((C_)this.l).setFont((Font)fx_2.H);
        ((C_)this.l).setForeground((Color)this.s);
        ((C_)this.l).setBackground((Color)cy_1.I);
        ((C_)this.l).setBorder(BorderFactory.createEmptyBorder(U.a(24772, 9259802474854433L), 0, 0, 2));
        try {
            this.l.M(this.h);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((C_)this.l).addActionListener(new bk_1(this));
        try {
            object3 = this.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.hb = object3;
        try {
            c_ = (C_)lk_0.U("\uf0c9");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        C_ c_2 = c_;
        try {
            c_2.M(this.h);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        c_2.setBackground((Color)cy_1.I);
        c_2.setBorder(BorderFactory.createEmptyBorder(5, 3, 0, 4));
        c_2.setFont((Font)fx_2.k);
        c_2.setForeground(new Color(U.a(17215, 5362272149277547463L), U.a(17215, 5362272149277547463L), U.a(17215, 5362272149277547463L)));
        y1_0 y1_02 = new y1_0(c_2, (JPopupMenu)this.hb);
        c_2.addMouseListener(new Y4(this, y1_02, c_2));
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            u6_02 = (u6_0)object2.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        u6_0 u6_03 = u6_02;
        this.ha = new X(this, new MigLayout("insets 0 0 0 0", "[]0[]", "[align top]0[]0[]0"), u6_03);
        ((JPanel)this.ha).setOpaque(false);
        ((JPanel)this.ha).add((Component)((aM)this.C), "width 0:10240:,height ::500,growx,growy");
        ((JPanel)this.ha).add((C_)this.l);
        ((JPanel)this.ha).add(c_2);
        ((JPanel)this.ha).setOpaque(true);
        ((JPanel)this.ha).setBackground(((aM)this.C).getBackground());
        MatteBorder matteBorder = BorderFactory.createMatteBorder(2, 0, 0, 0, (Color)cy_1.I);
        MatteBorder matteBorder2 = BorderFactory.createMatteBorder(0, 0, 2, 0, (Color)cy_1.j);
        CompoundBorder compoundBorder = BorderFactory.createCompoundBorder(matteBorder, matteBorder2);
        ((JPanel)this.ha).setBorder(compoundBorder);
        ((JPanel)this.hg).add((Component)((JPanel)this.ha), "width 0::,height ::,growx,growy,wrap");
        try {
            object = this.C.v();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.o = object;
        try {
            this.G(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JPanel)this.hg).add((Component)((ge_0)this.o), "width :10000:10000,height :10000:10000,growx,growy,wrap");
        try {
            this.C.c(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((aE)this.d).setTopComponent((JPanel)this.hg);
        this.hG = new UU();
        ((UU)this.hG).setMinimumSize(new Dimension(0, 0));
        ((UU)this.hG).setOpaque(false);
        ((UU)this.hG).setLayout(new MigLayout("insets 0 0 0 0"));
        ((aE)this.d).setBottomComponent((UU)this.hG);
        aE aE2 = (aE)this.d;
        if (ky_2.F() != null) {
            F8.D(new String[5]);
        }
        return aE2;
    }

    public void w(boolean bl) {
        block4: {
            C_ c_;
            block3: {
                block2: {
                    String[] stringArray = F8.y();
                    if (!bl) break block2;
                    c_ = (C_)this.l;
                    if (stringArray != null) break block3;
                    if (c_ == null) break block2;
                    ((C_)this.l).setForeground((Color)this.g);
                    if (stringArray == null) break block4;
                }
                c_ = (C_)this.l;
            }
            c_.setForeground((Color)this.s);
        }
    }

    public void b() {
        Point point = ((C_)this.l).getLocationOnScreen();
        int n10 = point.x - ((C5)U.u).getWidth() + ((C_)this.l).getWidth();
        ((C5)U.u).setLocation(n10, point.y + ((C_)this.l).getHeight() + 2);
        ((C5)U.u).setVisible(true);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public synchronized void P(Y9 var1_1) {
        block46: {
            block45: {
                block43: {
                    block44: {
                        try {
                            v0 = (t3_0)var1_1.l();
                        }
                        catch (InvocationTargetException v1) {
                            throw v1.getTargetException();
                        }
                        var3_2 = v0;
                        try {
                            v2 = (F8)var3_2.P();
                        }
                        catch (InvocationTargetException v3) {
                            throw v3.getTargetException();
                        }
                        var4_3 = v2;
                        var2_4 = F8.y();
                        var5_5 = var4_3;
                        try {
                            v4 = ((Boolean)var1_1.R()).booleanValue();
                        }
                        catch (InvocationTargetException v5) {
                            throw v5.getTargetException();
                        }
                        if (var2_4 == null) {
                            if (v4 == 0) {
                                try {
                                    var5_5.S();
                                }
                                catch (InvocationTargetException v6) {
                                    throw v6.getTargetException();
                                }
                            }
                            v4 = var4_3.getClass().equals(_y_0.class);
                        }
                        if (var2_4 != null) break block43;
                        if (v4 == 0) break block44;
                        var6_6 = (_y_0)var4_3;
                        if (var6_6 != null) {
                            try {
                                v7 = (Boolean)var1_1.R();
                            }
                            catch (InvocationTargetException v8) {
                                throw v8.getTargetException();
                            }
                            if (!v7) {
                                var6_6.q();
                            }
                        }
                        if (var2_4 == null) break block45;
                    }
                    v4 = var4_3.getClass().equals(CE.class);
                }
                if (var2_4 != null) break block46;
                if (v4 != 0) {
                    var6_6 = (CE)var4_3;
                    try {
                        v4 = ((Boolean)var1_1.R()).booleanValue();
                    }
                    catch (InvocationTargetException v9) {
                        throw v9.getTargetException();
                    }
                    if (var2_4 == null) {
                        if (v4 == 0) {
                            try {
                                v10 = var6_6.F();
                            }
                            catch (InvocationTargetException v11) {
                                throw v11.getTargetException();
                            }
                            try {
                                v12 = v10.O();
                            }
                            catch (InvocationTargetException v13) {
                                throw v13.getTargetException();
                            }
                            try {
                                v12.d(false);
                            }
                            catch (InvocationTargetException v14) {
                                throw v14.getTargetException();
                            }
                        } else {
                            ** GOTO lbl79
                        }
                    } else {
                        ** GOTO lbl78
                    }
                }
                break block45;
lbl78:
                // 2 sources

                break block46;
            }
            try {
                v15 = (ArrayList)this.C.g();
            }
            catch (InvocationTargetException v16) {
                throw v16.getTargetException();
            }
            v4 = v15.size();
        }
        v17 = var6_7 = v4;
        if (var2_4 == null) {
            if (v17 == 0) {
                this.hr = null;
                this.hp = null;
                this.P = null;
                this.N = null;
                this.w = null;
                ((aE)this.d).setDividerSize(0);
                try {
                    this.d();
                }
                catch (InvocationTargetException v18) {
                    throw v18.getTargetException();
                }
            }
            try {
                this.l();
            }
            catch (InvocationTargetException v19) {
                throw v19.getTargetException();
            }
            v17 = var6_7;
        }
        if (var2_4 == null) {
            if (v17 == 0) {
                try {
                    this.G(false);
                }
                catch (InvocationTargetException v20) {
                    throw v20.getTargetException();
                }
            }
            v17 = var6_7;
        }
        if (var2_4 == null) {
            if (v17 == 0) {
                try {
                    v17 = (int)((Boolean)this.C.L()).booleanValue();
                }
                catch (InvocationTargetException v21) {
                    throw v21.getTargetException();
                }
            }
        } else if (v17 == 0) {
            SwingUtilities.invokeLater(new no_0(this));
        }
    }

    void G(boolean bl) {
        if (!bl) {
            ((ge_0)this.o).setBorder(null);
        }
    }

    public void h(F8 f82) {
        block19: {
            block17: {
                block18: {
                    int n10;
                    boolean bl;
                    kj_0 kj_02;
                    int n11;
                    u6_0 u6_02;
                    Object object;
                    try {
                        object = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        u6_02 = (u6_0)object.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    u6_0 u6_03 = u6_02;
                    String[] stringArray = F8.y();
                    try {
                        n11 = (Integer)u6_03.t();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    int n12 = n11;
                    int n13 = 0;
                    try {
                        kj_02 = (kj_0)f82.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    kj_0 kj_03 = kj_02;
                    if (stringArray != null) break block17;
                    try {
                        bl = (Boolean)kj_03.l();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl) break block18;
                    ((aE)this.d).setDividerSize(this.L);
                    try {
                        n10 = (Integer)kj_03.j();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    int n14 = n13 = n10;
                    int n15 = U.a(6637, 1130080905756295431L);
                    if (stringArray == null) {
                        if (n14 < n15) {
                            n13 = U.a(6637, 1130080905756295431L);
                        }
                        n14 = ((aE)this.d).getHeight() - n13;
                        n15 = this.L;
                    }
                    int n16 = n14 - n15;
                    ((aE)this.d).setDividerLocation(n16);
                    if (stringArray == null) break block19;
                }
                ((aE)this.d).setDividerLocation(((aE)this.d).getHeight());
            }
            ((aE)this.d).setDividerSize(0);
        }
    }

    @Override
    public void v(Y9 y9) {
        try {
            this.V(y9);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void V(Y9 y9) {
        block82: {
            U u10;
            block81: {
                ArrayList arrayList;
                String[] stringArray;
                block73: {
                    block70: {
                        Object object;
                        int n10;
                        int n11;
                        block80: {
                            int n12;
                            block78: {
                                block79: {
                                    Object object2;
                                    block76: {
                                        block77: {
                                            block74: {
                                                block75: {
                                                    Object object3;
                                                    block67: {
                                                        block68: {
                                                            U u11;
                                                            s s2;
                                                            block71: {
                                                                block72: {
                                                                    _y_0 _y_02;
                                                                    block69: {
                                                                        int n13;
                                                                        kj_0 kj_02;
                                                                        Object object4;
                                                                        t3_0 t3_02;
                                                                        stringArray = F8.y();
                                                                        U u12 = this;
                                                                        if (stringArray == null) {
                                                                            if ((aj_0)u12.h1 == null) {
                                                                                return;
                                                                            }
                                                                            u12 = this;
                                                                        }
                                                                        u12.hQ = System.currentTimeMillis();
                                                                        try {
                                                                            t3_02 = (t3_0)y9.l();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        t3_0 t3_03 = t3_02;
                                                                        try {
                                                                            object4 = t3_03.P();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        this.P = object4;
                                                                        s2 = null;
                                                                        try {
                                                                            kj_02 = (kj_0)this.P.i();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        kj_0 kj_03 = kj_02;
                                                                        try {
                                                                            n13 = (Integer)kj_03.j();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        n12 = n13;
                                                                        n11 = ((F8)this.P).getClass().equals(_y_0.class);
                                                                        if (stringArray != null) break block67;
                                                                        if (n11 == 0) break block68;
                                                                        try {
                                                                            this.h1.A();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        U u13 = this;
                                                                        if (stringArray == null) {
                                                                            ArrayList arrayList2;
                                                                            try {
                                                                                arrayList2 = (ArrayList)u13.C.g();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            if (arrayList2.size() > 0) {
                                                                                this.hr = (_y_0)this.P;
                                                                            }
                                                                            u13 = this;
                                                                        }
                                                                        _y_02 = (_y_0)u13.hr;
                                                                        if (stringArray != null) break block69;
                                                                        if (_y_02 == null) break block70;
                                                                        _y_02 = (_y_0)this.hr;
                                                                    }
                                                                    _y_02.W(this);
                                                                    U u14 = this;
                                                                    if (stringArray == null) {
                                                                        if (u14.isFocused()) {
                                                                            ((_y_0)this.hr).O().requestFocus();
                                                                        }
                                                                        u14 = this;
                                                                    }
                                                                    s2 = ((_y_0)u14.hr).q();
                                                                    try {
                                                                        s2.L();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    u11 = this;
                                                                    if (stringArray != null) break block71;
                                                                    if (((_y_0)u11.hr).u()) break block72;
                                                                    u10 = this;
                                                                    if (stringArray != null) break block73;
                                                                    if (((aE)u10.d).getBottomComponent() == null) break block70;
                                                                    try {
                                                                        this.d();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    if (stringArray == null) break block70;
                                                                }
                                                                u11 = this;
                                                            }
                                                            try {
                                                                u11.L(s2);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                        }
                                                        n11 = ((F8)this.P).getClass().equals(F5.class);
                                                    }
                                                    if (stringArray != null) break block74;
                                                    if (n11 == 0) break block75;
                                                    n10 = ((aE)this.d).getHeight() - n12;
                                                    ((aE)this.d).setDividerLocation(n10);
                                                    this.hp = (F5)this.P;
                                                    try {
                                                        this.h1.P();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    this.hr = null;
                                                    try {
                                                        this.d();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        object3 = this.hp.V();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        this.L(object3);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    if (stringArray == null) break block70;
                                                }
                                                n11 = ((F8)this.P).getClass().equals(CL.class);
                                            }
                                            if (stringArray != null) break block76;
                                            if (n11 == 0) break block77;
                                            this.hr = null;
                                            try {
                                                this.d();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            ((aE)this.d).setDividerLocation(((aE)this.d).getHeight());
                                            ((aE)this.d).setDividerSize(0);
                                            if (stringArray == null) break block70;
                                        }
                                        n11 = ((F8)this.P).getClass().equals(CT.class) ? 1 : 0;
                                    }
                                    if (stringArray != null) break block78;
                                    if (n11 == 0) break block79;
                                    n10 = ((aE)this.d).getHeight() - n12;
                                    ((aE)this.d).setDividerLocation(n10);
                                    this.N = (CT)this.P;
                                    try {
                                        this.h1.A();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    this.hr = null;
                                    try {
                                        this.d();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        object2 = this.N.z();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        this.t(object2);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (stringArray == null) break block70;
                                }
                                n11 = ((F8)this.P).getClass().equals(CE.class) ? 1 : 0;
                            }
                            if (stringArray != null) break block80;
                            if (n11 == 0) break block70;
                            n11 = ((aE)this.d).getHeight() - n12;
                        }
                        n10 = n11;
                        ((aE)this.d).setDividerLocation(n10);
                        this.w = (CE)this.P;
                        try {
                            this.h1.A();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        this.hr = null;
                        try {
                            this.d();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object = this.w.W();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.w(object);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    try {
                        this.t();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.h(this.P);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.l();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    u10 = this;
                }
                if (stringArray != null) break block81;
                try {
                    arrayList = (ArrayList)u10.C.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (arrayList.size() <= 0) break block82;
                u10 = this;
            }
            try {
                u10.G(true);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    void w(yx_1 yx_12) {
        ((UU)this.hG).removeAll();
        ((UU)this.hG).add(yx_12);
        ((UU)this.hG).validate();
    }

    void t(dg_1 dg_12) {
        ((UU)this.hG).removeAll();
        ((UU)this.hG).add(dg_12);
        ((UU)this.hG).validate();
    }

    void L(fy_1 fy_12) {
        ((UU)this.hG).removeAll();
        ((UU)this.hG).add(fy_12);
        ((UU)this.hG).validate();
    }

    void L(s s2) {
        ((UU)this.hG).removeAll();
        ((UU)this.hG).add(s2);
        ((UU)this.hG).validate();
    }

    void d() {
        ((UU)this.hG).removeAll();
        ((UU)this.hG).validate();
    }

    @Override
    public void U(Y9 y9) {
        F8 f82;
        t3_0 t3_02;
        try {
            t3_02 = (t3_0)y9.l();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            f82 = (F8)t3_03.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        F8 f83 = f82;
        if (f83.getClass().equals(_y_0.class)) {
            // empty if block
        }
    }

    void l() {
        boolean bl = false;
        Object var2_2 = null;
    }

    public CT Y(_y_0 _y_02) {
        t3_0 t3_02;
        String string;
        try {
            string = (String)_y_02.a().g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        CT cT = new CT(_y_02.M(), false, string);
        try {
            cT.E(_y_02);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            t3_02 = (t3_0)this.C.m((Object)cT, (Object)"unknow");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            cT.U(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            cT.Y(_y_02.M());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return cT;
    }

    public ch_0 b(_y_0 _y_02) {
        t3_0 t3_02;
        ch_0 ch_02 = new ch_0();
        try {
            ch_02.E(_y_02);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            t3_02 = (t3_0)this.C.m((Object)ch_02, (Object)"unknow");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            ch_02.U(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return ch_02;
    }

    public C4 s(_y_0 _y_02) {
        t3_0 t3_02;
        String string;
        try {
            string = (String)_y_02.a().g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        C4 c4 = new C4(_y_02.M(), string);
        try {
            c4.E(_y_02);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            t3_02 = (t3_0)this.C.m((Object)c4, (Object)"unknow");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            c4.U(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            c4.i(_y_02.M());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return c4;
    }

    public CE q(String string, _y_0 _y_02) {
        t3_0 t3_02;
        String string2;
        try {
            string2 = (String)_y_02.a().g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        CE cE = new CE(string, _y_02.M(), true, string2);
        try {
            cE.E(_y_02);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            t3_02 = (t3_0)this.C.m((Object)cE, (Object)"unknow");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            cE.U(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            cE.W(_y_02.M());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return cE;
    }

    public F5 W(String string, lv_2 lv_22) {
        t3_0 t3_02;
        F5 f52 = new F5(string, lv_22);
        try {
            t3_02 = (t3_0)this.C.m((Object)f52, (Object)"unknow");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            f52.U(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return f52;
    }

    public CL u() {
        t3_0 t3_02;
        CL cL = new CL();
        try {
            t3_02 = (t3_0)this.C.l((Object)cL, (Object)"unknow", 0, false, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            cL.U(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return cL;
    }

    public _y_0 Y(int n10) {
        t3_0 t3_02;
        _y_0 _y_02;
        block18: {
            int n11;
            int n12;
            block16: {
                int n13;
                block17: {
                    int n14;
                    Object object;
                    Object object2;
                    xf_1 xf_12;
                    _y_02 = new _y_0(new XF());
                    _y_02.W(this);
                    _y_02.Y(this);
                    try {
                        xf_12 = (xf_1)this.F.B();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    _y_02.setBackground(new Color(xf_12.p()));
                    s s2 = new s(_y_02);
                    String[] stringArray = F8.y();
                    _y_02.K(s2);
                    String[] stringArray2 = stringArray;
                    try {
                        object2 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = object2.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        n14 = (Integer)object.t();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n12 = n13 = n14;
                    n11 = u6_0.nG;
                    if (stringArray2 != null) break block16;
                    if (n12 != n11) break block17;
                    _y_02.N();
                    _y_02.d();
                    if (stringArray2 == null) break block18;
                }
                n12 = n13;
                n11 = u6_0.nh;
            }
            if (n12 == n11) {
                _y_02.N();
            }
        }
        try {
            t3_02 = (t3_0)this.C.l((Object)_y_02, (Object)"unknow", n10, true, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            t3_03.D(_y_02);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        _y_02.U(t3_03);
        return _y_02;
    }

    @Override
    public _y_0 c() {
        _y_0 _y_02;
        ArrayList arrayList;
        try {
            arrayList = (ArrayList)this.C.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n10 = arrayList.size();
        try {
            _y_02 = (_y_0)this.Y(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        _y_0 _y_03 = _y_02;
        return _y_03;
    }

    public void T() {
        ArrayList arrayList;
        try {
            arrayList = (ArrayList)this.C.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ArrayList arrayList2 = arrayList;
        String[] stringArray = F8.y();
        for (t3_0 t3_02 : arrayList2) {
            block12: {
                _y_0 _y_02;
                F8 f82;
                block11: {
                    F8 f83;
                    F8 f84;
                    try {
                        f84 = (F8)t3_02.P();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    f82 = f83 = f84;
                    if (stringArray != null) break block11;
                    if (!f82.getClass().equals(_y_0.class)) break block12;
                    f82 = f83;
                }
                if ((_y_02 = (_y_0)f82).R()) {
                    try {
                        this.d(_y_02);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            }
            if (stringArray == null) continue;
        }
    }

    public boolean G() {
        boolean bl;
        block7: {
            ArrayList arrayList;
            boolean bl2 = false;
            try {
                arrayList = (ArrayList)this.C.g();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ArrayList arrayList2 = arrayList;
            String[] stringArray = F8.y();
            for (t3_0 t3_02 : arrayList2) {
                block9: {
                    block10: {
                        F8 f82;
                        block8: {
                            F8 f83;
                            F8 f84;
                            try {
                                f84 = (F8)t3_02.P();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            f82 = f83 = f84;
                            if (stringArray != null) break block8;
                            bl = f82.getClass().equals(_y_0.class);
                            if (stringArray != null) break block7;
                            if (!bl) break block9;
                            f82 = f83;
                        }
                        _y_0 _y_02 = (_y_0)f82;
                        boolean bl3 = _y_02.R();
                        if (stringArray != null) break block10;
                        if (!bl3) break block9;
                        bl3 = bl2 = true;
                    }
                    if (stringArray == null) break;
                }
                if (stringArray == null) continue;
            }
            bl = bl2;
        }
        return bl;
    }

    public void d(_y_0 _y_02) {
        if (_y_02.R()) {
            Object object;
            try {
                object = _y_02.a().G();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.A((Object)_y_02, object, false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Exception decompiling
     */
    public void A(_y_0 var1_1, String var2_2, boolean var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
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

    public void H() {
        block3: {
            F8 f82;
            block2: {
                String[] stringArray = F8.y();
                this.requestFocus();
                String[] stringArray2 = stringArray;
                f82 = (F8)this.P;
                if (stringArray2 != null) break block2;
                if (!f82.getClass().equals(_y_0.class)) break block3;
                f82 = (F8)this.P;
            }
            _y_0 _y_02 = (_y_0)f82;
            _y_02.C();
        }
    }

    JPopupMenu o() {
        String string;
        block8: {
            JPopupMenu jPopupMenu;
            block6: {
                block7: {
                    String[] stringArray = F8.y();
                    jPopupMenu = (JPopupMenu)this.hb;
                    if (stringArray != null) break block6;
                    if (jPopupMenu != null) break block7;
                    this.hb = new JPopupMenu();
                    if (stringArray == null) break block8;
                }
                jPopupMenu = (JPopupMenu)this.hb;
            }
            jPopupMenu.removeAll();
        }
        JMenu jMenu = new JMenu("文件");
        ((JPopupMenu)this.hb).add(jMenu);
        JMenuItem jMenuItem = new JMenuItem("退出");
        jMenu.add(jMenuItem);
        jMenuItem.addActionListener(new OO(this));
        JMenu jMenu2 = new JMenu("菜单");
        JMenuItem jMenuItem2 = new JMenuItem("全局设置");
        jMenu2.add(jMenuItem2);
        jMenu2.addSeparator();
        JMenuItem jMenuItem3 = new JMenuItem("连接属性");
        jMenu2.add(jMenuItem3);
        jMenu2.addSeparator();
        JMenuItem jMenuItem4 = new JMenuItem("主机密钥");
        jMenu2.add(jMenuItem4);
        JMenuItem jMenuItem5 = new JMenuItem("用户密钥");
        jMenu2.add(jMenuItem5);
        jMenu2.addSeparator();
        JMenuItem jMenuItem6 = new JMenuItem("快速命令");
        jMenu2.add(jMenuItem6);
        this.k = new JMenu("查看");
        ((JPopupMenu)this.hb).add((JMenu)this.k);
        try {
            this.x();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JMenu)this.k).addMenuListener(new ys_2(this));
        JMenuItem jMenuItem7 = new JMenuItem("选项");
        ((JPopupMenu)this.hb).add(jMenuItem7);
        jMenuItem7.addActionListener(new z0(this));
        ((JPopupMenu)this.hb).addSeparator();
        JMenuItem jMenuItem8 = new JMenuItem("密钥管理器");
        ((JPopupMenu)this.hb).add(jMenuItem8);
        jMenuItem8.addActionListener(new ze_0(this));
        ((JPopupMenu)this.hb).addSeparator();
        JMenuItem jMenuItem9 = new JMenuItem("云端同步");
        ((JPopupMenu)this.hb).add(jMenuItem9);
        jMenuItem9.addActionListener(new UP(this));
        ((JPopupMenu)this.hb).addSeparator();
        JMenuItem jMenuItem10 = new JMenuItem("");
        ((JPopupMenu)this.hb).add(jMenuItem10);
        jMenuItem10.addActionListener(new TP(this));
        try {
            string = (String)lk_0.B("ShdFJhBzdiwdFXQ3b0hGVEEcExZRzjJhyCQ08EgsVIULefzJ");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jMenuItem10.setText(string);
        JMenuItem jMenuItem11 = new JMenuItem("软件更新");
        ((JPopupMenu)this.hb).add(jMenuItem11);
        jMenuItem11.addActionListener(new FJ(this));
        ((JPopupMenu)this.hb).addSeparator();
        JMenu jMenu3 = new JMenu("帮助");
        ((JPopupMenu)this.hb).add(jMenu3);
        JMenuItem jMenuItem12 = new JMenuItem("访问网站");
        jMenu3.add(jMenuItem12);
        jMenuItem12.addActionListener(new jd_0(this));
        JMenuItem jMenuItem13 = new JMenuItem("终端使用帮助");
        jMenu3.add(jMenuItem13);
        jMenuItem13.addActionListener(new od_2(this));
        JMenuItem jMenuItem14 = new JMenuItem("常见问题解决");
        jMenu3.add(jMenuItem14);
        jMenuItem14.addActionListener(new bo_0(this));
        return (JPopupMenu)this.hb;
    }

    public static ox_2 s() {
        String[] stringArray = F8.y();
        ox_2 ox_22 = (ox_2)U.K;
        if (stringArray == null) {
            if (!ox_22.isVisible()) {
                U u10;
                Object object;
                try {
                    object = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    u10 = (U)object.J();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((ox_2)U.K).setLocationRelativeTo(u10);
            }
            try {
                U.K.setVisible(true);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((ox_2)U.K).requestFocus();
            ox_22 = (ox_2)U.K;
        }
        return ox_22;
    }

    void x() {
        block19: {
            JMenuItem jMenuItem;
            block18: {
                JMenuItem jMenuItem2;
                boolean bl;
                kj_0 kj_02;
                Object object;
                Object object2;
                boolean bl2;
                Object object3;
                Object object4;
                String[] stringArray = F8.y();
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
                    bl2 = (Boolean)object3.B();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("侧栏", bl2);
                ((JMenu)this.k).add(jCheckBoxMenuItem);
                String[] stringArray2 = stringArray;
                jCheckBoxMenuItem.addActionListener(new tw_2(this, jCheckBoxMenuItem));
                try {
                    object2 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = object2.f();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    kj_02 = (kj_0)object.I();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                kj_0 kj_03 = kj_02;
                try {
                    bl = (Boolean)kj_03.l();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("底栏-终端", bl);
                ((JMenu)this.k).add(jCheckBoxMenuItem2);
                jCheckBoxMenuItem2.addActionListener(new lf_0(this, jCheckBoxMenuItem2, kj_03));
                try {
                    jMenuItem2 = (JMenuItem)xK.T(US.V, (Object)new od_0(this, "全屏"));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                jMenuItem = jMenuItem2;
                ((JMenu)this.k).add(jMenuItem);
                if (stringArray2 != null) break block18;
                if (this.P instanceof _y_0) break block19;
                jCheckBoxMenuItem2.setEnabled(false);
            }
            jMenuItem.setEnabled(false);
        }
    }

    void I(boolean n10) {
        block10: {
            U u10;
            block11: {
                int n11;
                block9: {
                    String[] stringArray;
                    block8: {
                        Rectangle rectangle;
                        block6: {
                            block7: {
                                stringArray = F8.y();
                                if (stringArray != null) break block6;
                                if (n10 == 0) break block7;
                                ((JSplitPane)this.r).setRightComponent((JPanel)this.a);
                                ((yp_2)this.D).removeAll();
                                ((yp_2)this.D).add((Component)((JSplitPane)this.r), "growx ,growy");
                                rectangle = this.getBounds();
                                rectangle.x -= ((JSplitPane)this.r).getDividerLocation() + ((JSplitPane)this.r).getDividerSize();
                                rectangle.width += ((JSplitPane)this.r).getDividerLocation();
                                this.setBounds(rectangle);
                                if (stringArray == null) break block8;
                            }
                            this.x = ((JSplitPane)this.r).getDividerLocation();
                            ((yp_2)this.D).removeAll();
                            ((yp_2)this.D).add((Component)((JPanel)this.a), "growx ,growy");
                        }
                        rectangle = this.getBounds();
                        rectangle.x += ((JSplitPane)this.r).getDividerLocation() + ((JSplitPane)this.r).getDividerSize();
                        rectangle.width -= ((JSplitPane)this.r).getDividerLocation() + ((JSplitPane)this.r).getDividerSize();
                        this.setBounds(rectangle);
                    }
                    try {
                        this.K();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.rootPane.validate();
                    n11 = n10;
                    if (stringArray != null) break block9;
                    if (n11 == 0) break block10;
                    u10 = this;
                    if (stringArray != null) break block11;
                    n11 = u10.x;
                }
                if (n11 <= 0) break block10;
                u10 = this;
            }
            ((JSplitPane)u10.r).setDividerLocation(this.x);
        }
    }

    public void g() {
        String[] stringArray;
        block13: {
            U u10;
            block11: {
                block12: {
                    stringArray = F8.y();
                    u10 = this;
                    if (stringArray != null) break block11;
                    if (!u10.I) break block12;
                    try {
                        this.B();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray == null) break block13;
                }
                u10 = this;
            }
            try {
                u10.E();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        U u11 = this;
        if (stringArray == null) {
            if ((_y_0)u11.hr != null) {
                ((_y_0)this.hr).U();
            }
            u11 = this;
        }
        try {
            u11.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void E() {
        block18: {
            block17: {
                v0 = F8.y();
                this.I = true;
                var1_1 = v0;
                v1 = this;
                if (var1_1 == null) {
                    if ((F8)v1.P != null) {
                        v1 = this;
                        if (var1_1 == null) {
                            if (((F8)v1.P).getClass().equals(_y_0.class)) {
                                var2_2 = (_y_0)this.P;
                                v2 = (U1)this.e;
                                if (var1_1 == null) {
                                    if (v2 == null) {
                                        var3_3 = null;
                                        try {
                                            v3 = (Boolean)vk_0.s();
                                        }
                                        catch (InvocationTargetException v4) {
                                            throw v4.getTargetException();
                                        }
                                        if (v3) {
                                            var3_3 = this;
                                        }
                                        this.e = new U1(var3_3);
                                    }
                                    v2 = (U1)this.e;
                                }
                                try {
                                    v2.r(var2_2);
                                }
                                catch (InvocationTargetException v5) {
                                    throw v5.getTargetException();
                                }
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 4 sources

                    {
                        v1 = this;
                    }
                }
                v6 = (_y_0)v1.hr;
                if (var1_1 != null) break block17;
                if (v6 == null) break block18;
                v6 = (_y_0)this.hr;
            }
            v6.U();
        }
    }

    public void B() {
        block7: {
            _y_0 _y_02;
            block6: {
                this.I = false;
                String[] stringArray = F8.y();
                try {
                    this.C.N(this.P);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.e.K();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String[] stringArray2 = stringArray;
                _y_02 = (_y_0)this.hr;
                if (stringArray2 != null) break block6;
                if (_y_02 == null) break block7;
                _y_02 = (_y_0)this.hr;
            }
            _y_02.O().requestFocus();
        }
    }

    void K() {
        block21: {
            ArrayList arrayList;
            Object object;
            Object object2;
            Object object3;
            String[] stringArray = F8.y();
            try {
                object3 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2 = object3.Z();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.F();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.F = object;
            ((JPanel)this.a).setOpaque(false);
            try {
                zg_0.K();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                arrayList = (ArrayList)this.C.g();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ArrayList arrayList2 = arrayList;
            String[] stringArray2 = stringArray;
            for (t3_0 t3_02 : arrayList2) {
                block24: {
                    F8 f82;
                    JPanel jPanel;
                    block27: {
                        boolean bl;
                        F8 f83;
                        block25: {
                            block26: {
                                block22: {
                                    block23: {
                                        F8 f84;
                                        try {
                                            f84 = (F8)t3_02.P();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        f83 = f84;
                                        if (stringArray2 != null) break block21;
                                        bl = f83.getClass().equals(_y_0.class);
                                        if (stringArray2 != null) break block22;
                                        if (!bl) break block23;
                                        jPanel = (_y_0)f83;
                                        jPanel.n();
                                        if (stringArray2 == null) break block24;
                                    }
                                    bl = f83.getClass().equals(F5.class);
                                }
                                if (stringArray2 != null) break block25;
                                if (!bl) break block26;
                                jPanel = (F5)f83;
                                try {
                                    jPanel.c();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (stringArray2 == null) break block24;
                            }
                            f82 = f83;
                            if (stringArray2 != null) break block27;
                            bl = f82.getClass().equals(s.class);
                        }
                        if (!bl) break block24;
                        f82 = f83;
                    }
                    jPanel = (s)((Object)f82);
                    try {
                        jPanel.u();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                if (stringArray2 == null) continue;
            }
            try {
                this.C.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public ArrayList x() {
        ArrayList arrayList;
        ArrayList<_y_0> arrayList2 = new ArrayList<_y_0>();
        String[] stringArray = F8.y();
        try {
            arrayList = (ArrayList)this.C.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ArrayList arrayList3 = arrayList;
        for (t3_0 t3_02 : arrayList3) {
            block8: {
                F8 f82;
                block7: {
                    F8 f83;
                    F8 f84;
                    try {
                        f84 = (F8)t3_02.P();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    f82 = f83 = f84;
                    if (stringArray != null) break block7;
                    if (!f82.getClass().equals(_y_0.class)) break block8;
                    f82 = f83;
                }
                _y_0 _y_02 = (_y_0)f82;
                arrayList2.add(_y_02);
            }
            if (stringArray == null) continue;
        }
        return arrayList2;
    }

    public void j(String string) {
        ArrayList arrayList;
        try {
            arrayList = (ArrayList)this.C.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ArrayList arrayList2 = arrayList;
        String[] stringArray = F8.y();
        for (t3_0 t3_02 : arrayList2) {
            block23: {
                String string2;
                F8 f82;
                block22: {
                    F8 f83;
                    F8 f84;
                    try {
                        f84 = (F8)t3_02.P();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    f82 = f83 = f84;
                    if (stringArray != null) break block22;
                    if (!f82.getClass().equals(_y_0.class)) break block23;
                    f82 = f83;
                }
                _y_0 _y_02 = (_y_0)f82;
                lv_2 lv_22 = _y_02.a();
                try {
                    string2 = (String)lv_22.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (string.equals(string2)) {
                    Object object;
                    lv_2 lv_23;
                    Object object2;
                    Object object3;
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
                        lv_23 = (lv_2)object2.E(_y_02);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    lv_2 lv_24 = lv_23;
                    try {
                        object = lv_24.F();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        t3_02.I(object);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        t3_02.e();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            }
            if (stringArray == null) continue;
        }
    }

    public aM o() {
        return (aM)this.C;
    }

    public void x(aM aM2) {
        this.C = aM2;
    }

    void v(String string) {
        try {
            Desktop.getDesktop().browse(new URI(string));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        catch (URISyntaxException uRISyntaxException) {
            uRISyntaxException.printStackTrace();
        }
    }

    boolean U() {
        String[] stringArray = F8.y();
        int n10 = this.z;
        if (stringArray == null) {
            n10 = n10 > this.hv ? 1 : 0;
        }
        return n10 != 0;
    }

    void W() {
        KD kD;
        KD kD2;
        Object object;
        xt_1 xt_12 = new xt_1(0);
        xt_12.setOpaque(false);
        xt_12.setLayout(new MigLayout("inset 0 0 0 0", "[][]", ""));
        xt_12.O(true);
        xt_12.setBorder(null);
        xt_12.f(2, 2, 2, 2);
        xt_12.setBorderPainted(false);
        xt_12.setFloatable(false);
        xt_12.X(LS.attached);
        xt_12.O(new Color(U.a(1275, 5080696519888100379L), U.a(20630, 8580117942563997816L), U.a(20630, 8580117942563997816L)));
        xt_12.T(new Color(U.a(29762, 4695122850733960376L), U.a(3459, 3602834727550014817L), U.a(3459, 3602834727550014817L), U.a(3459, 3602834727550014817L)));
        xt_12.setFloatable(false);
        try {
            object = this.x("断开");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.hU = object;
        ((JButton)this.hU).addActionListener(new FX(this));
        this.hi = new JToggleButton("文件管理");
        ((JToggleButton)this.hi).setFocusable(false);
        ((JToggleButton)this.hi).setFocusPainted(false);
        ((JToggleButton)this.hi).addActionListener(new WO(this));
        try {
            kD2 = (KD)this.x("传输");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        KD kD3 = kD2;
        qe_0 qe_02 = new qe_0("侧边栏");
        qe_02.k(3);
        qe_02.t(0);
        qe_02.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.red), BorderFactory.createEmptyBorder(3, U.a(24772, 9259802474854433L), 3, U.a(24772, 9259802474854433L))));
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new MigLayout("inset 0 0 0 0,align right"));
        jPanel.setOpaque(false);
        try {
            kD = (KD)this.x("HostBuf.com");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        KD kD4 = kD;
        kD4.G(true);
        kD4.setForeground(new Color(U.a(9624, 3463077069245873505L), U.a(17215, 5362272149277547463L), U.a(17215, 5362272149277547463L)));
        kD4.t(new Color(U.a(17215, 5362272149277547463L), U.a(17215, 5362272149277547463L), U.a(17215, 5362272149277547463L)));
        kD4.addActionListener(new fd_2(this));
        jPanel.add((Component)new JLabel(), "width 5::");
    }

    public void v() {
        String[] stringArray = F8.y();
        if (stringArray == null) {
            if (System.currentTimeMillis() - this.G > U.b(25440, 3593803201574059277L)) {
                Object object;
                try {
                    object = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object.P();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        } else {
            try {
                U.y.s(this.O);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void c() {
        try {
            U.y.setVisible(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public KQ F() {
        return (KQ)U.y;
    }

    KD x(String string) {
        KD kD = new KD(string);
        try {
            lk_0.W(kD);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        kD.setMargin(new Insets(0, 0, 0, 0));
        kD.setFocusPainted(false);
        kD.setFocusable(false);
        return kD;
    }

    public ImageIcon J(String string) {
        ImageIcon imageIcon;
        try {
            imageIcon = (ImageIcon)this.o(this.getClass(), (Object)string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return imageIcon;
    }

    public ImageIcon o(Class clazz, String string) {
        String string2 = clazz.getCanonicalName() + ":" + string;
        String[] stringArray = F8.y();
        Map map = (Map)U.m;
        String string3 = string2;
        if (stringArray == null) {
            if (!map.containsKey(string3)) {
                ((Map)U.m).put(string2, new ImageIcon(clazz.getResource("/" + string)));
            }
            map = (Map)U.m;
            string3 = string2;
        }
        return (ImageIcon)map.get(string3);
    }

    @Override
    public List n() {
        return null;
    }

    @Override
    public cs_1 c() {
        return null;
    }

    @Override
    public void Y(cs_1 cs_12) {
    }

    public KQ i() {
        return (KQ)U.y;
    }

    @Override
    public void M(yl_2 yl_22) {
        block40: {
            ty_0 ty_02;
            block43: {
                Object object;
                Object object2;
                int n10;
                int n11;
                _y_0 _y_02;
                String[] stringArray;
                block41: {
                    int n12;
                    block42: {
                        block38: {
                            block39: {
                                boolean bl;
                                Object object3;
                                String string;
                                String string2;
                                DI dI;
                                DI dI2;
                                int n13;
                                String[] stringArray2 = F8.y();
                                try {
                                    this.l();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                stringArray = stringArray2;
                                try {
                                    n13 = (Integer)yl_22.e();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                n12 = n13;
                                try {
                                    dI2 = (DI)yl_22.o();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                _y_02 = dI2.a();
                                lv_2 lv_22 = _y_02.a();
                                _y_02.M();
                                n11 = n12;
                                n10 = yl_2.I;
                                if (stringArray != null) break block38;
                                if (n11 != n10) break block39;
                                try {
                                    dI = (DI)yl_22.o();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                object2 = dI;
                                object = _y_02.q();
                                if (object == null) {
                                    return;
                                }
                                try {
                                    string2 = (String)lv_22.g();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    string = (String)object.H();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (!string2.equals(string)) {
                                    try {
                                        yt_1.F.J(new oz_1(this, (s)object, yl_22, lv_22));
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                                try {
                                    object3 = lv_22.g();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    object.H(object3);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ty_0 ty_03 = _y_02.M();
                                if (ty_03 == null) {
                                    return;
                                }
                                try {
                                    bl = (Boolean)lv_22.I();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (bl) {
                                    try {
                                        ty_03.m();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                                try {
                                    yt_1.F.J(new dh_2(this, _y_02));
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    yt_1.F.J(new ye_2(this, lv_22, yl_22));
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (stringArray == null) break block40;
                            }
                            n11 = n12;
                            n10 = yl_2.O;
                        }
                        if (stringArray != null) break block41;
                        if (n11 != n10) break block42;
                        try {
                            yt_1.F.J(new wg_0(this, _y_02));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (stringArray == null) break block40;
                    }
                    n11 = n12;
                    n10 = yl_2.l;
                }
                if (n11 != n10) break block40;
                object2 = _y_02.q();
                object = _y_02.M();
                ty_02 = object;
                if (stringArray != null) break block43;
                if (ty_02 == null) break block40;
                ty_02 = object;
            }
            try {
                ty_02.p();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Loose catch block
     */
    void z(_y_0 _y_02) {
        block33: {
            _y_0 _y_03;
            block34: {
                String string;
                String string2;
                int n10;
                String string3;
                _y_0 _y_04;
                Object object;
                lv_2 lv_22;
                String[] stringArray;
                _y_0 _y_05;
                block36: {
                    boolean bl;
                    block31: {
                        block32: {
                            JComponent jComponent;
                            Object object2;
                            _y_05 = _y_02.N();
                            _y_05.setFocusable(true);
                            String[] stringArray2 = F8.y();
                            _y_05.W((U)null);
                            _y_05.Y((cs_1)null);
                            stringArray = stringArray2;
                            _y_05.O().w();
                            lv_22 = _y_02.a();
                            pa_1 pa_12 = _y_05.O();
                            try {
                                try {
                                    bl = (Boolean)U.i.J(pa_12);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (stringArray != null) break block31;
                                if (!bl) {
                                }
                                break block32;
                            }
                            catch (InterruptedException interruptedException) {
                                throw U.a(interruptedException);
                            }
                            try {
                                object2 = lv_22.F();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                jComponent = (JComponent)U.i.n(object2, (Object)pa_12);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            object = jComponent;
                            try {
                                U.i.H(object);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        bl = _y_05.v();
                    }
                    if (bl) {
                        // empty if block
                    }
                    _y_04 = _y_05;
                    if (stringArray != null) break block36;
                    try {
                        block37: {
                            if (!_y_04.v()) break block33;
                            break block37;
                            catch (InterruptedException interruptedException) {
                                throw U.a(interruptedException);
                            }
                        }
                        _y_04 = _y_05;
                    }
                    catch (InterruptedException interruptedException) {
                        throw U.a(interruptedException);
                    }
                }
                _y_04.t(_y_02.s().e());
                try {
                    string3 = (String)lv_22.v();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    n10 = (Integer)lv_22.X();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    string2 = (String)lv_22.E();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    string = (String)lv_22.r();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                object = new cp_2(string3, n10, string2, string, lv_22);
                _y_0 _y_06 = _y_05.f((fv_0)object);
                for (int i2 = 0; i2 < U.a(32341, 9193618709285250742L); ++i2) {
                    block35: {
                        _y_03 = _y_02;
                        if (stringArray != null) break block34;
                        try {
                            block38: {
                                if (!_y_03.s().K()) break block35;
                                break block38;
                                catch (InterruptedException interruptedException) {
                                    throw U.a(interruptedException);
                                }
                            }
                            if (stringArray == null) break;
                        }
                        catch (InterruptedException interruptedException) {
                            throw U.a(interruptedException);
                        }
                    }
                    try {
                        Thread.sleep(U.b(2654, 4065653079701705777L));
                        continue;
                    }
                    catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    if (stringArray == null) continue;
                }
                _y_03 = _y_06;
            }
            _y_03.N(-1);
        }
    }

    public F8 q() {
        return (F8)this.P;
    }

    public void Y(F8 f82) {
        this.P = f82;
    }

    public _y_0 n() {
        return (_y_0)this.hr;
    }

    public aj_0 D() {
        return (aj_0)this.h1;
    }

    public void c(aj_0 aj_02) {
        this.h1 = aj_02;
    }

    @Override
    public void K(Y9 y9) {
    }

    @Override
    public void D(Y9 y9) {
    }

    public U1 D() {
        return (U1)this.e;
    }

    public void Y(U1 u12) {
        this.e = u12;
    }

    public boolean o() {
        return this.I;
    }

    public void g(boolean bl) {
        this.I = bl;
    }

    @Override
    public void O(ty_2 ty_22) {
        int n10;
        try {
            n10 = (Integer)ty_22.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n11 = n10;
        if (n11 == ty_2.Y) {
            try {
                this.o();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    private void o() {
        Object object;
        Object object2;
        boolean bl;
        Object object3;
        Object object4;
        try {
            object4 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3 = object4.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            bl = (Boolean)object3.v();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        boolean bl2 = bl;
        try {
            this.h1.j(bl2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = U.u.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.j(bl2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = U.y.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.g(bl2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public static JDialog T() {
        return (JDialog)U.b;
    }

    public static void W(JDialog jDialog) {
        U.b = jDialog;
    }

    public int d() {
        return this.U;
    }

    public void P(int n10) {
        this.U = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block46: {
            block45: {
                block44: {
                    block43: {
                        block42: {
                            block41: {
                                var21 = new String[60];
                                var19_1 = 0;
                                var18_2 = "\u512e\u5c1b\u8bfc\u7f63\u000eGK=\u0089\u0093nqRg\u00ae\u00ce\u008e8\u000e\u0005\u5e4c\u68f8a\u7e1f\u7a16\u0006\u7e62\u7ad3\u4f00\u7566\u5ee3\u52ad\u0006\u5e51\u89f8\u9519\u9858\u89ae\u51d6\b\u78fb\u5b75\u514d\u95ac\u7a7e\u53c3\u5464j\u0003\u4fd3\u8f85\u68c4$\u00de\u00f4\u00c4\u0088E.$i\u00c5\u009e\u008bB\u0098?\u008dU\u0016L\u0081=\u00f3\u00ce\u00d7p&\u00e61\u00dep\u00dd\u0017(\u009e;\u00f2\u0099\u0002\u9044\u98a9\u0002\u653f\u4ecd\b\u7875\u5b49\u519c\u952b\u7a44\u5333\u5423t\u0002\u4f85\u8f28\u0004\u5f64\u9068\u5485\u4e33\r\u00c2\u0088\u008d\u00f1\u00852\u00a3\u00f0?\u00f8\u00c7F\u001b\u0002\u8323\u5330H\u008br^\u00b1\u00dcx\u00e0\u00d1\u008c\rG\u00f9\u00bf\u008714Ek~\u00bf]c\u00b7\u00c0\u00aac*V\u0002\u0089\nz:\u009b{ A\u00ba\u00f0imz\u00dd#\u00f0_mzfu|\u00c4}\u00e6\u009c\u00d9\u00fd\u00ba1K[1\u00e2\"g\u000eK>\u00e3a`'\t\u00a9(\u00d7\u008e\u00cc4\u00ed_\u00f0\u0002\u51e0\u5ca9\t\u00a86\n\u00d0\u009c%\u001a\b\u00a7\u0010\u00e5bi\u00ac\u0019\u00ca \u00c6M=\u009b\u00cd\u0090d\u00a7\u00d5\u000e\u00b8\u00d3\u00c2\u009al\f\u008e\u001e\u0098'1\u00bf\u00c7(\u0002\u65cf\u5f0d\u0004\u65ae\u4e68\u7be1\u7405\u0005\u00a8\u00ed\u00b3\t\u00cc\f\u00aa\u00f1SS\u00cd6;7\u00f1\u00e0S\u00ba\u0007t\u4e26\u7447\u6770\u52d2\u562f?\u0004\u6551\u68d0\u7b10\u98ae\u0004\u4e54\u6773\u5bf2\u9490\u0004\u75be\u6248\u5bde\u945b\n\u00dd\u00be\u00b9\u00d4\u00a5a\u00e4\u00c2\u00d8\u001f\u0012\u00e9\u00b5\u0083\u00b4\u00abY\u0007N\u00e6\u00a1%'\u00ecV/*lc\u0002\u6d82\u60d47\u00ce'\u00c6\u00f2\u0005a&\u008b\u00c4\u00b4\u00b8\u00cd\u00feg \u0086\u00e0\u00f0[\u00a5~\n,\u008f\\\u00e9\u00ae\u00f1*T\u00a1\u00aae\u00b78cL\u0088\u00b5\u001d\u0088\u009e\u00e8dJ\u00ba\u00cfVk\u0083\u0095\u00b3O\u00d3@\u0004\u8f20\u4e02\u6690\u65fe\u0006\u00e0\\N`\u00fd=0\u001b\u0001\u00b9\u00a6Vj\u00e6+\u00d6\u00f5\u000bq\u00ce\u00bf\u00c2=\u001d\u00b2\u0000\r\u00fdV\u0097\u0004g\u00ad\u0007\u00f6\u00c3g\u0080m\u00a0\u008e&\u00f6\u00063\u00044y\u0096r\u0017*\u00d9\u00f3\u009b06\u00db\u00ddW?np\u00eb\u00e4}\u00a0\u00e3\u00bf8bd\u0015gy2\u00b79\u00e3\u0089\u0001\u0006\u00dad\u0010\u00ed\u00b1\u00dc;_j\u00e2g\u00b3\u00f4\u00a0\u00fa\u00a3B\"{\u00b6\u0081\u0007\u0002\u6de8\u60c00:\u00ef\u00f8\u00f8\u00e0\u001c\u0084.\u00b3{\u00cf\u0012\u00c3+\u0015HYJ0\u00dd\u00ec\u00e3\t\u0010\u00af(\u00a7\u00f9-\u00008i \u00ee\u00datU\u001f\u00d4 \u00a2\u0089/P\u009d\u008f]\u00f4\u000bF\u00bc|\u00a3p_\u009a\u008a>\u007f~'\u00fb\u001e`\u00d5\u00d1\u0085\u00b6\u001c\u009c,\u0090\u00da\u00b3\n\u00de\u0019\u00f5\tM\u00e8\u008f\u00ea|\u00a1\u00e1$zG\u00ac~\u0093\u00a2\u00d5\u0004s\u00e9\u00c7\u0094%\u0019\u00e0\u00b2\u00c9\u00b6\r\u00da\u00b2\u00ed\u001d[\u00832\u0093\u0097\u0097z4\u00ef\u00f1\u00b36\u0089\u00d0\u00ff\u00c3\u0004\u8b12\u957c\u7fb9\u7a43\u0004\u0093\u00da\u00fb\u00d6\u0004\u8fa5\u6383\u5c0d\u6060\u0005\u5b52\u94d4\u7b17\u74ab\u5642\u0005p\u00fa\u00ec\u00d4\u00ab\u0002\u4f8b\u689a\u0004\u4e5f\u7aed\u54a6\u6bec\u0005\u0083z\u0092\u00c4d\u0002\u67bf\u7714\u000b\u00b6\u00fc\u0006O\u00c2\u0083\u00ed79\u0080c06pBW\u00dc\u00e9R\u00a6B\u00b2\u00aeQ\u00d5\u00f0V\u0089\u000f\u00cd\u00f6\u00c7Y\u00cbq\u0010M=\u00c7\u00ea\u00df\u000bg\u0088\u0091\u00f7\u0082\u00e7#\u00f7\u007fo=p//L\u009d\u00eeJ\u0003\u001f;\u0001\u0004\u00aa\u5277\u9085U\f\u0011\u00d6$\u00b7#\u00aa\u00e6\u00a4J\u0092$\u00f4\n\u0016\u0007\u0000\u009c\u00bc\u00b3H\u0001C\u0013\u0006\u00e0ENC\u00fdY";
                                var20_3 = "\u512e\u5c1b\u8bfc\u7f63\u000eGK=\u0089\u0093nqRg\u00ae\u00ce\u008e8\u000e\u0005\u5e4c\u68f8a\u7e1f\u7a16\u0006\u7e62\u7ad3\u4f00\u7566\u5ee3\u52ad\u0006\u5e51\u89f8\u9519\u9858\u89ae\u51d6\b\u78fb\u5b75\u514d\u95ac\u7a7e\u53c3\u5464j\u0003\u4fd3\u8f85\u68c4$\u00de\u00f4\u00c4\u0088E.$i\u00c5\u009e\u008bB\u0098?\u008dU\u0016L\u0081=\u00f3\u00ce\u00d7p&\u00e61\u00dep\u00dd\u0017(\u009e;\u00f2\u0099\u0002\u9044\u98a9\u0002\u653f\u4ecd\b\u7875\u5b49\u519c\u952b\u7a44\u5333\u5423t\u0002\u4f85\u8f28\u0004\u5f64\u9068\u5485\u4e33\r\u00c2\u0088\u008d\u00f1\u00852\u00a3\u00f0?\u00f8\u00c7F\u001b\u0002\u8323\u5330H\u008br^\u00b1\u00dcx\u00e0\u00d1\u008c\rG\u00f9\u00bf\u008714Ek~\u00bf]c\u00b7\u00c0\u00aac*V\u0002\u0089\nz:\u009b{ A\u00ba\u00f0imz\u00dd#\u00f0_mzfu|\u00c4}\u00e6\u009c\u00d9\u00fd\u00ba1K[1\u00e2\"g\u000eK>\u00e3a`'\t\u00a9(\u00d7\u008e\u00cc4\u00ed_\u00f0\u0002\u51e0\u5ca9\t\u00a86\n\u00d0\u009c%\u001a\b\u00a7\u0010\u00e5bi\u00ac\u0019\u00ca \u00c6M=\u009b\u00cd\u0090d\u00a7\u00d5\u000e\u00b8\u00d3\u00c2\u009al\f\u008e\u001e\u0098'1\u00bf\u00c7(\u0002\u65cf\u5f0d\u0004\u65ae\u4e68\u7be1\u7405\u0005\u00a8\u00ed\u00b3\t\u00cc\f\u00aa\u00f1SS\u00cd6;7\u00f1\u00e0S\u00ba\u0007t\u4e26\u7447\u6770\u52d2\u562f?\u0004\u6551\u68d0\u7b10\u98ae\u0004\u4e54\u6773\u5bf2\u9490\u0004\u75be\u6248\u5bde\u945b\n\u00dd\u00be\u00b9\u00d4\u00a5a\u00e4\u00c2\u00d8\u001f\u0012\u00e9\u00b5\u0083\u00b4\u00abY\u0007N\u00e6\u00a1%'\u00ecV/*lc\u0002\u6d82\u60d47\u00ce'\u00c6\u00f2\u0005a&\u008b\u00c4\u00b4\u00b8\u00cd\u00feg \u0086\u00e0\u00f0[\u00a5~\n,\u008f\\\u00e9\u00ae\u00f1*T\u00a1\u00aae\u00b78cL\u0088\u00b5\u001d\u0088\u009e\u00e8dJ\u00ba\u00cfVk\u0083\u0095\u00b3O\u00d3@\u0004\u8f20\u4e02\u6690\u65fe\u0006\u00e0\\N`\u00fd=0\u001b\u0001\u00b9\u00a6Vj\u00e6+\u00d6\u00f5\u000bq\u00ce\u00bf\u00c2=\u001d\u00b2\u0000\r\u00fdV\u0097\u0004g\u00ad\u0007\u00f6\u00c3g\u0080m\u00a0\u008e&\u00f6\u00063\u00044y\u0096r\u0017*\u00d9\u00f3\u009b06\u00db\u00ddW?np\u00eb\u00e4}\u00a0\u00e3\u00bf8bd\u0015gy2\u00b79\u00e3\u0089\u0001\u0006\u00dad\u0010\u00ed\u00b1\u00dc;_j\u00e2g\u00b3\u00f4\u00a0\u00fa\u00a3B\"{\u00b6\u0081\u0007\u0002\u6de8\u60c00:\u00ef\u00f8\u00f8\u00e0\u001c\u0084.\u00b3{\u00cf\u0012\u00c3+\u0015HYJ0\u00dd\u00ec\u00e3\t\u0010\u00af(\u00a7\u00f9-\u00008i \u00ee\u00datU\u001f\u00d4 \u00a2\u0089/P\u009d\u008f]\u00f4\u000bF\u00bc|\u00a3p_\u009a\u008a>\u007f~'\u00fb\u001e`\u00d5\u00d1\u0085\u00b6\u001c\u009c,\u0090\u00da\u00b3\n\u00de\u0019\u00f5\tM\u00e8\u008f\u00ea|\u00a1\u00e1$zG\u00ac~\u0093\u00a2\u00d5\u0004s\u00e9\u00c7\u0094%\u0019\u00e0\u00b2\u00c9\u00b6\r\u00da\u00b2\u00ed\u001d[\u00832\u0093\u0097\u0097z4\u00ef\u00f1\u00b36\u0089\u00d0\u00ff\u00c3\u0004\u8b12\u957c\u7fb9\u7a43\u0004\u0093\u00da\u00fb\u00d6\u0004\u8fa5\u6383\u5c0d\u6060\u0005\u5b52\u94d4\u7b17\u74ab\u5642\u0005p\u00fa\u00ec\u00d4\u00ab\u0002\u4f8b\u689a\u0004\u4e5f\u7aed\u54a6\u6bec\u0005\u0083z\u0092\u00c4d\u0002\u67bf\u7714\u000b\u00b6\u00fc\u0006O\u00c2\u0083\u00ed79\u0080c06pBW\u00dc\u00e9R\u00a6B\u00b2\u00aeQ\u00d5\u00f0V\u0089\u000f\u00cd\u00f6\u00c7Y\u00cbq\u0010M=\u00c7\u00ea\u00df\u000bg\u0088\u0091\u00f7\u0082\u00e7#\u00f7\u007fo=p//L\u009d\u00eeJ\u0003\u001f;\u0001\u0004\u00aa\u5277\u9085U\f\u0011\u00d6$\u00b7#\u00aa\u00e6\u00a4J\u0092$\u00f4\n\u0016\u0007\u0000\u009c\u00bc\u00b3H\u0001C\u0013\u0006\u00e0ENC\u00fdY".length();
                                var17_4 = 4;
                                var16_5 = -1;
                                U.O(null);
lbl8:
                                // 2 sources

                                while (true) {
                                    v0 = 101;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block41;
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
                                    var18_2 = "\u5e06\u52a1\u0002\u90f2\u51e6";
                                    var20_3 = "\u5e06\u52a1\u0002\u90f2\u51e6".length();
                                    var17_4 = 2;
                                    var16_5 = -1;
lbl23:
                                    // 2 sources

                                    while (true) {
                                        v0 = 115;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block41;
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
                                    break block42;
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
                                            v15 = 114;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 102;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 101;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 35;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 56;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 72;
                                            break;
                                        }
                                        default: {
                                            v15 = 23;
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
                        U.ab = var21;
                        U.bb = new String[60];
                        var8_7 = 1863692338662630556L;
                        var14_8 = new long[22];
                        var11_9 = 0;
                        var12_10 = "`\u009a\f\u00036\u00ech\u00a4'RTT\u00c1\u00bb\u00fad\u0005\u00ea\u00cc\u00bc\u00d1\u00e3%\u00f9\u008b\u009c\u0089&c\u0094%\u00ff\u00cb\u00dd\u00ff\u00c0\u00ca\u00e0]D\u00d5Vj\u00c3\u00b1\u00f0k\u00e4i7\u00e5CB'\u00d2\u0090\u008f\u00c1x\u0019\u00f9\u00e1\u00ec\u0014\u000e4\u00c1\u00fa\u00fa\u00f6\u00a5\u00ab\u00c1eV&'\u00e48w\u000f)\u00a4\u00f5_\u00cfA\u00c2_\u00d0\u00ec4P\u00951\u0002N\u00f6`}\r\u00ae\\\u00bbq]\u00ff\u0084\u00f2\u00d6\u00ac\u0094:\u008b\u001e\u00b9KC\u00f0*\u00c5V\u009a\\l\u00fe:\u001bt[\u00bd\u001c\u00c6\u00a9\u0019\u00856@\u00db\u00f6>2\u00ff#mk{\u00b7\u00c1\u00beU`\u00c4\u00161\u009d\u0096KH\u00db";
                        var13_11 = "`\u009a\f\u00036\u00ech\u00a4'RTT\u00c1\u00bb\u00fad\u0005\u00ea\u00cc\u00bc\u00d1\u00e3%\u00f9\u008b\u009c\u0089&c\u0094%\u00ff\u00cb\u00dd\u00ff\u00c0\u00ca\u00e0]D\u00d5Vj\u00c3\u00b1\u00f0k\u00e4i7\u00e5CB'\u00d2\u0090\u008f\u00c1x\u0019\u00f9\u00e1\u00ec\u0014\u000e4\u00c1\u00fa\u00fa\u00f6\u00a5\u00ab\u00c1eV&'\u00e48w\u000f)\u00a4\u00f5_\u00cfA\u00c2_\u00d0\u00ec4P\u00951\u0002N\u00f6`}\r\u00ae\\\u00bbq]\u00ff\u0084\u00f2\u00d6\u00ac\u0094:\u008b\u001e\u00b9KC\u00f0*\u00c5V\u009a\\l\u00fe:\u001bt[\u00bd\u001c\u00c6\u00a9\u0019\u00856@\u00db\u00f6>2\u00ff#mk{\u00b7\u00c1\u00beU`\u00c4\u00161\u009d\u0096KH\u00db".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block43;
                            break;
                        }
lbl113:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u00e5K\u00bc\u0096\u00d1(\u00ca\u007f\u0013\u00deq\u00b0]\u000f\u00b9o";
                            var13_11 = "\u00e5K\u00bc\u0096\u00d1(\u00ca\u007f\u0013\u00deq\u00b0]\u000f\u00b9o".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block43;
                                break;
                            }
                            break;
                        }
lbl126:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block44;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
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
                U.cb = var14_8;
                U.db = new Integer[22];
                var0_14 = 4248027791631800568L;
                var6_15 = new long[5];
                var3_16 = 0;
                var4_17 = "<&\u0096\u0001^-\u001d\u00db\u000b+\u00c6<jH\u00eeM\u00af\u00ef\u009fa6H\u00d5\u00c5";
                var5_18 = "<&\u0096\u0001^-\u001d\u00db\u000b+\u00c6<jH\u00eeM\u00af\u00ef\u009fa6H\u00d5\u00c5".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block45;
                    break;
                }
lbl154:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "\u0002\u0098\u001f+\u0097\u00a4\u008c\u00f5V\u0011\u00ff\\J\u00cd\u001d\u0087";
                    var5_18 = "\u0002\u0098\u001f+\u0097\u00a4\u008c\u00f5V\u0011\u00ff\\J\u00cd\u001d\u0087".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block45;
                        break;
                    }
                    break;
                }
lbl167:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block46;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl178:
                // 1 sources

                ** continue;
            }
        }
        U.eb = var6_15;
        U.fb = new Long[5];
        U.m = new HashMap<K, V>();
        try {
            v27 = lk_0.B("ZSwFPhJLFAN3bVpFYT8EalZjTEUyjMY+RMqOaOpjIcZcZQ+g");
        }
        catch (InvocationTargetException v28) {
            throw v28.getTargetException();
        }
        U.j = v27;
        try {
            v29 = lk_0.B("DA5cJnM7C31DYQUUD2JOBkRJCi49K2s3Mt0AQdEclaNVVH/u");
        }
        catch (InvocationTargetException v30) {
            throw v30.getTargetException();
        }
        U.c = v29;
        try {
            v31 = lk_0.B("AwQ9GEZ9VlksLUlxFDprZytzIEnw2mngNMlqnPAUu64x4jYb");
        }
        catch (InvocationTargetException v32) {
            throw v32.getTargetException();
        }
        U.hY = v31;
        try {
            yt_1.F.V((Object)new C3(), U.a(32341, 9193618709285250742L));
        }
        catch (InvocationTargetException v33) {
            throw v33.getTargetException();
        }
        U.p = 0L;
    }

    public static void O(String string) {
        M = string;
    }

    public static String N() {
        return M;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x5A6) & 0xFFFF;
        if (bb[n12] == null) {
            int n13;
            int n14;
            char[] cArray = ab[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 24;
                    break;
                }
                case 1: {
                    n14 = 125;
                    break;
                }
                case 2: {
                    n14 = 112;
                    break;
                }
                case 3: {
                    n14 = 193;
                    break;
                }
                case 4: {
                    n14 = 111;
                    break;
                }
                case 5: {
                    n14 = 158;
                    break;
                }
                case 6: {
                    n14 = 203;
                    break;
                }
                case 7: {
                    n14 = 117;
                    break;
                }
                case 8: {
                    n14 = 25;
                    break;
                }
                case 9: {
                    n14 = 147;
                    break;
                }
                case 10: {
                    n14 = 202;
                    break;
                }
                case 11: {
                    n14 = 63;
                    break;
                }
                case 12: {
                    n14 = 28;
                    break;
                }
                case 13: {
                    n14 = 90;
                    break;
                }
                case 14: {
                    n14 = 89;
                    break;
                }
                case 15: {
                    n14 = 151;
                    break;
                }
                case 16: {
                    n14 = 221;
                    break;
                }
                case 17: {
                    n14 = 212;
                    break;
                }
                case 18: {
                    n14 = 157;
                    break;
                }
                case 19: {
                    n14 = 234;
                    break;
                }
                case 20: {
                    n14 = 233;
                    break;
                }
                case 21: {
                    n14 = 62;
                    break;
                }
                case 22: {
                    n14 = 107;
                    break;
                }
                case 23: {
                    n14 = 167;
                    break;
                }
                case 24: {
                    n14 = 81;
                    break;
                }
                case 25: {
                    n14 = 169;
                    break;
                }
                case 26: {
                    n14 = 35;
                    break;
                }
                case 27: {
                    n14 = 177;
                    break;
                }
                case 28: {
                    n14 = 127;
                    break;
                }
                case 29: {
                    n14 = 20;
                    break;
                }
                case 30: {
                    n14 = 227;
                    break;
                }
                case 31: {
                    n14 = 38;
                    break;
                }
                case 32: {
                    n14 = 21;
                    break;
                }
                case 33: {
                    n14 = 144;
                    break;
                }
                case 34: {
                    n14 = 27;
                    break;
                }
                case 35: {
                    n14 = 156;
                    break;
                }
                case 36: {
                    n14 = 75;
                    break;
                }
                case 37: {
                    n14 = 192;
                    break;
                }
                case 38: {
                    n14 = 131;
                    break;
                }
                case 39: {
                    n14 = 180;
                    break;
                }
                case 40: {
                    n14 = 58;
                    break;
                }
                case 41: {
                    n14 = 34;
                    break;
                }
                case 42: {
                    n14 = 2;
                    break;
                }
                case 43: {
                    n14 = 94;
                    break;
                }
                case 44: {
                    n14 = 141;
                    break;
                }
                case 45: {
                    n14 = 4;
                    break;
                }
                case 46: {
                    n14 = 250;
                    break;
                }
                case 47: {
                    n14 = 210;
                    break;
                }
                case 48: {
                    n14 = 216;
                    break;
                }
                case 49: {
                    n14 = 15;
                    break;
                }
                case 50: {
                    n14 = 201;
                    break;
                }
                case 51: {
                    n14 = 254;
                    break;
                }
                case 52: {
                    n14 = 189;
                    break;
                }
                case 53: {
                    n14 = 162;
                    break;
                }
                case 54: {
                    n14 = 106;
                    break;
                }
                case 55: {
                    n14 = 1;
                    break;
                }
                case 56: {
                    n14 = 61;
                    break;
                }
                case 57: {
                    n14 = 199;
                    break;
                }
                case 58: {
                    n14 = 255;
                    break;
                }
                case 59: {
                    n14 = 247;
                    break;
                }
                case 60: {
                    n14 = 244;
                    break;
                }
                case 61: {
                    n14 = 214;
                    break;
                }
                case 62: {
                    n14 = 48;
                    break;
                }
                case 63: {
                    n14 = 47;
                    break;
                }
                case 64: {
                    n14 = 128;
                    break;
                }
                case 65: {
                    n14 = 225;
                    break;
                }
                case 66: {
                    n14 = 230;
                    break;
                }
                case 67: {
                    n14 = 86;
                    break;
                }
                case 68: {
                    n14 = 93;
                    break;
                }
                case 69: {
                    n14 = 171;
                    break;
                }
                case 70: {
                    n14 = 3;
                    break;
                }
                case 71: {
                    n14 = 217;
                    break;
                }
                case 72: {
                    n14 = 101;
                    break;
                }
                case 73: {
                    n14 = 198;
                    break;
                }
                case 74: {
                    n14 = 54;
                    break;
                }
                case 75: {
                    n14 = 78;
                    break;
                }
                case 76: {
                    n14 = 6;
                    break;
                }
                case 77: {
                    n14 = 163;
                    break;
                }
                case 78: {
                    n14 = 11;
                    break;
                }
                case 79: {
                    n14 = 70;
                    break;
                }
                case 80: {
                    n14 = 12;
                    break;
                }
                case 81: {
                    n14 = 114;
                    break;
                }
                case 82: {
                    n14 = 59;
                    break;
                }
                case 83: {
                    n14 = 115;
                    break;
                }
                case 84: {
                    n14 = 87;
                    break;
                }
                case 85: {
                    n14 = 186;
                    break;
                }
                case 86: {
                    n14 = 239;
                    break;
                }
                case 87: {
                    n14 = 248;
                    break;
                }
                case 88: {
                    n14 = 46;
                    break;
                }
                case 89: {
                    n14 = 240;
                    break;
                }
                case 90: {
                    n14 = 69;
                    break;
                }
                case 91: {
                    n14 = 31;
                    break;
                }
                case 92: {
                    n14 = 146;
                    break;
                }
                case 93: {
                    n14 = 105;
                    break;
                }
                case 94: {
                    n14 = 17;
                    break;
                }
                case 95: {
                    n14 = 99;
                    break;
                }
                case 96: {
                    n14 = 10;
                    break;
                }
                case 97: {
                    n14 = 209;
                    break;
                }
                case 98: {
                    n14 = 243;
                    break;
                }
                case 99: {
                    n14 = 43;
                    break;
                }
                case 100: {
                    n14 = 66;
                    break;
                }
                case 101: {
                    n14 = 161;
                    break;
                }
                case 102: {
                    n14 = 68;
                    break;
                }
                case 103: {
                    n14 = 33;
                    break;
                }
                case 104: {
                    n14 = 205;
                    break;
                }
                case 105: {
                    n14 = 170;
                    break;
                }
                case 106: {
                    n14 = 118;
                    break;
                }
                case 107: {
                    n14 = 238;
                    break;
                }
                case 108: {
                    n14 = 142;
                    break;
                }
                case 109: {
                    n14 = 116;
                    break;
                }
                case 110: {
                    n14 = 132;
                    break;
                }
                case 111: {
                    n14 = 168;
                    break;
                }
                case 112: {
                    n14 = 229;
                    break;
                }
                case 113: {
                    n14 = 109;
                    break;
                }
                case 114: {
                    n14 = 100;
                    break;
                }
                case 115: {
                    n14 = 29;
                    break;
                }
                case 116: {
                    n14 = 119;
                    break;
                }
                case 117: {
                    n14 = 220;
                    break;
                }
                case 118: {
                    n14 = 154;
                    break;
                }
                case 119: {
                    n14 = 231;
                    break;
                }
                case 120: {
                    n14 = 152;
                    break;
                }
                case 121: {
                    n14 = 174;
                    break;
                }
                case 122: {
                    n14 = 184;
                    break;
                }
                case 123: {
                    n14 = 153;
                    break;
                }
                case 124: {
                    n14 = 44;
                    break;
                }
                case 125: {
                    n14 = 49;
                    break;
                }
                case 126: {
                    n14 = 18;
                    break;
                }
                case 127: {
                    n14 = 72;
                    break;
                }
                case 128: {
                    n14 = 102;
                    break;
                }
                case 129: {
                    n14 = 120;
                    break;
                }
                case 130: {
                    n14 = 74;
                    break;
                }
                case 131: {
                    n14 = 148;
                    break;
                }
                case 132: {
                    n14 = 9;
                    break;
                }
                case 133: {
                    n14 = 224;
                    break;
                }
                case 134: {
                    n14 = 139;
                    break;
                }
                case 135: {
                    n14 = 126;
                    break;
                }
                case 136: {
                    n14 = 30;
                    break;
                }
                case 137: {
                    n14 = 52;
                    break;
                }
                case 138: {
                    n14 = 60;
                    break;
                }
                case 139: {
                    n14 = 79;
                    break;
                }
                case 140: {
                    n14 = 206;
                    break;
                }
                case 141: {
                    n14 = 5;
                    break;
                }
                case 142: {
                    n14 = 197;
                    break;
                }
                case 143: {
                    n14 = 22;
                    break;
                }
                case 144: {
                    n14 = 82;
                    break;
                }
                case 145: {
                    n14 = 194;
                    break;
                }
                case 146: {
                    n14 = 19;
                    break;
                }
                case 147: {
                    n14 = 91;
                    break;
                }
                case 148: {
                    n14 = 173;
                    break;
                }
                case 149: {
                    n14 = 0;
                    break;
                }
                case 150: {
                    n14 = 175;
                    break;
                }
                case 151: {
                    n14 = 71;
                    break;
                }
                case 152: {
                    n14 = 50;
                    break;
                }
                case 153: {
                    n14 = 179;
                    break;
                }
                case 154: {
                    n14 = 166;
                    break;
                }
                case 155: {
                    n14 = 232;
                    break;
                }
                case 156: {
                    n14 = 159;
                    break;
                }
                case 157: {
                    n14 = 183;
                    break;
                }
                case 158: {
                    n14 = 164;
                    break;
                }
                case 159: {
                    n14 = 155;
                    break;
                }
                case 160: {
                    n14 = 108;
                    break;
                }
                case 161: {
                    n14 = 123;
                    break;
                }
                case 162: {
                    n14 = 228;
                    break;
                }
                case 163: {
                    n14 = 37;
                    break;
                }
                case 164: {
                    n14 = 246;
                    break;
                }
                case 165: {
                    n14 = 136;
                    break;
                }
                case 166: {
                    n14 = 211;
                    break;
                }
                case 167: {
                    n14 = 222;
                    break;
                }
                case 168: {
                    n14 = 88;
                    break;
                }
                case 169: {
                    n14 = 223;
                    break;
                }
                case 170: {
                    n14 = 252;
                    break;
                }
                case 171: {
                    n14 = 122;
                    break;
                }
                case 172: {
                    n14 = 77;
                    break;
                }
                case 173: {
                    n14 = 241;
                    break;
                }
                case 174: {
                    n14 = 32;
                    break;
                }
                case 175: {
                    n14 = 172;
                    break;
                }
                case 176: {
                    n14 = 185;
                    break;
                }
                case 177: {
                    n14 = 65;
                    break;
                }
                case 178: {
                    n14 = 42;
                    break;
                }
                case 179: {
                    n14 = 96;
                    break;
                }
                case 180: {
                    n14 = 83;
                    break;
                }
                case 181: {
                    n14 = 14;
                    break;
                }
                case 182: {
                    n14 = 135;
                    break;
                }
                case 183: {
                    n14 = 237;
                    break;
                }
                case 184: {
                    n14 = 242;
                    break;
                }
                case 185: {
                    n14 = 51;
                    break;
                }
                case 186: {
                    n14 = 160;
                    break;
                }
                case 187: {
                    n14 = 137;
                    break;
                }
                case 188: {
                    n14 = 39;
                    break;
                }
                case 189: {
                    n14 = 226;
                    break;
                }
                case 190: {
                    n14 = 138;
                    break;
                }
                case 191: {
                    n14 = 133;
                    break;
                }
                case 192: {
                    n14 = 110;
                    break;
                }
                case 193: {
                    n14 = 85;
                    break;
                }
                case 194: {
                    n14 = 56;
                    break;
                }
                case 195: {
                    n14 = 219;
                    break;
                }
                case 196: {
                    n14 = 149;
                    break;
                }
                case 197: {
                    n14 = 143;
                    break;
                }
                case 198: {
                    n14 = 80;
                    break;
                }
                case 199: {
                    n14 = 253;
                    break;
                }
                case 200: {
                    n14 = 150;
                    break;
                }
                case 201: {
                    n14 = 188;
                    break;
                }
                case 202: {
                    n14 = 92;
                    break;
                }
                case 203: {
                    n14 = 55;
                    break;
                }
                case 204: {
                    n14 = 207;
                    break;
                }
                case 205: {
                    n14 = 191;
                    break;
                }
                case 206: {
                    n14 = 165;
                    break;
                }
                case 207: {
                    n14 = 145;
                    break;
                }
                case 208: {
                    n14 = 182;
                    break;
                }
                case 209: {
                    n14 = 57;
                    break;
                }
                case 210: {
                    n14 = 7;
                    break;
                }
                case 211: {
                    n14 = 23;
                    break;
                }
                case 212: {
                    n14 = 103;
                    break;
                }
                case 213: {
                    n14 = 113;
                    break;
                }
                case 214: {
                    n14 = 64;
                    break;
                }
                case 215: {
                    n14 = 76;
                    break;
                }
                case 216: {
                    n14 = 190;
                    break;
                }
                case 217: {
                    n14 = 178;
                    break;
                }
                case 218: {
                    n14 = 40;
                    break;
                }
                case 219: {
                    n14 = 26;
                    break;
                }
                case 220: {
                    n14 = 208;
                    break;
                }
                case 221: {
                    n14 = 121;
                    break;
                }
                case 222: {
                    n14 = 218;
                    break;
                }
                case 223: {
                    n14 = 104;
                    break;
                }
                case 224: {
                    n14 = 196;
                    break;
                }
                case 225: {
                    n14 = 134;
                    break;
                }
                case 226: {
                    n14 = 67;
                    break;
                }
                case 227: {
                    n14 = 236;
                    break;
                }
                case 228: {
                    n14 = 130;
                    break;
                }
                case 229: {
                    n14 = 215;
                    break;
                }
                case 230: {
                    n14 = 195;
                    break;
                }
                case 231: {
                    n14 = 140;
                    break;
                }
                case 232: {
                    n14 = 95;
                    break;
                }
                case 233: {
                    n14 = 53;
                    break;
                }
                case 234: {
                    n14 = 235;
                    break;
                }
                case 235: {
                    n14 = 98;
                    break;
                }
                case 236: {
                    n14 = 187;
                    break;
                }
                case 237: {
                    n14 = 249;
                    break;
                }
                case 238: {
                    n14 = 181;
                    break;
                }
                case 239: {
                    n14 = 8;
                    break;
                }
                case 240: {
                    n14 = 204;
                    break;
                }
                case 241: {
                    n14 = 251;
                    break;
                }
                case 242: {
                    n14 = 245;
                    break;
                }
                case 243: {
                    n14 = 213;
                    break;
                }
                case 244: {
                    n14 = 200;
                    break;
                }
                case 245: {
                    n14 = 73;
                    break;
                }
                case 246: {
                    n14 = 45;
                    break;
                }
                case 247: {
                    n14 = 84;
                    break;
                }
                case 248: {
                    n14 = 16;
                    break;
                }
                case 249: {
                    n14 = 36;
                    break;
                }
                case 250: {
                    n14 = 97;
                    break;
                }
                case 251: {
                    n14 = 41;
                    break;
                }
                case 252: {
                    n14 = 176;
                    break;
                }
                case 253: {
                    n14 = 13;
                    break;
                }
                case 254: {
                    n14 = 124;
                    break;
                }
                default: {
                    n14 = 129;
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
            U.bb[n12] = new String(cArray).intern();
        }
        return bb[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x58E9;
        if (db[n11] == null) {
            U.db[n11] = (int)(cb[n11] ^ l2);
        }
        return db[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x5E6C) & Short.MAX_VALUE;
        if (fb[n11] == null) {
            U.fb[n11] = eb[n11] ^ l2;
        }
        return fb[n11];
    }
}

