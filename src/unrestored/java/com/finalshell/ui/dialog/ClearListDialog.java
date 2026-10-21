package com.finalshell.ui.dialog;

import com.finalshell.core.Du2;
import com.finalshell.core.Dv2;
import com.finalshell.core.Dx4_2;
import com.finalshell.core.KD;
import com.finalshell.core.KT3;
import com.finalshell.core.Kn2;
import com.finalshell.core.L1;
import com.finalshell.core.TP3;
import com.finalshell.core.Tq4;
import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.A5;
import com.finalshell.task.O9;
import com.finalshell.task.V0;
import com.finalshell.task.Yw4;
import com.finalshell.ui.listener.A8;
import com.finalshell.ui.listener.B7;
import com.finalshell.ui.listener.ConfirmClearHistoryListener;
import com.finalshell.ui.listener.DH_3;
import com.finalshell.ui.listener.GW;
import com.finalshell.ui.listener.Lk4;
import com.finalshell.ui.listener.N22;
import com.finalshell.ui.listener.QH;
import com.finalshell.ui.listener.UF;
import com.finalshell.ui.listener.XS;
import com.finalshell.ui.listener.Xa2;
import com.finalshell.ui.model.Cc4;
import com.finalshell.ui.model.FT;
import com.finalshell.ui.model.Ub4;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.Fg4;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.OG3;
import com.finalshell.ui.panel.US3;
import com.finalshell.ui.panel.Ws2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.swingx.JXList;

public abstract class ClearListDialog extends JDialog implements Kn2 {
   public FT H;
   public Tq4 s;
   public JScrollPane lC;
   public JScrollPane W;
   public String l9;
   public int lV;
   public boolean T;
   public boolean N;
   public String lU;
   public boolean a;
   public Dimension q;
   public ConnectionProperty o;
   public boolean u;
   public String h;
   public boolean L;
   public boolean b;
   public boolean i;
   public int ll;
   public int Y;
   public Dv2 lD;
   public Dv2 Z;
   public KD j;
   public long V;
   public long g;
   public boolean d;
   public static JDialog C;
   public static JFrame S;
   public boolean lx;
   public boolean lF;
   public boolean B;
   public long l_;
   public boolean lQ;
   public boolean l;
   public Backspace x;
   public JPanel I;
   public boolean O;
   public boolean m;
   public boolean p;
   public Ws2 X;
   public int k;
   public long f;
   public boolean P;
   public boolean n;
   public Window c;
   public JPanel U;
   public boolean t;
   public boolean F;
   public KD A;
   public Du2 v;
   public long R;
   public JXList l1;
   public boolean w;
   public boolean lz;
   public US3 z;
   public int l2;
   public int J;
   public int lI;
   public Fg4 r;
   public boolean E;
   public int e;
   public boolean M;
   public MouseListener y;
   public int Q;
   public int lT;
   public int lj;
   public boolean K;
   public AWTEventListener D;
   public static String[] G;
   public static String[] ab;
   public static String[] bb;
   public static long[] eb;
   public static Integer[] fb;
   public static long[] ib;
   public static Long[] jb;

   public int R$int() {
      return Registry.lookupField(568433753069106815L).getInt(this);
   }

   public int b() {
      return Registry.lookupField(132462760774120245L).getInt(this);
   }

   public void c(int var1) {
      Registry.lookupField(132462760774120245L).setInt(this, var1);
   }

   public void S(int var1) {
      Registry.lookupField(568433753069106815L).setInt(this, var1);
   }

   public void e(int var1, int var2) {
      Registry.lookupField(173564240323200101L).setInt(this, var1);
      Registry.lookupField(121864494913095536L).setInt(this, var2);
      this.setSize(Registry.lookupField(173564240323200101L).getInt(this), var2);
   }

   public ClearListDialog(Dv2 var1, boolean var2, boolean var3) {
      this(var1, true, false, var2, var3, false, true);
      Object var4 = 308394982418497131L;
      Ref.g(308394982418497131L, var4);
      Object[] var10002 = Registry.packArgs(true);
      long var7 = 200783620674826162L;
      Object[] var6 = var10002;
      Ref.h(200783620674826162L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public ClearListDialog(Dv2 var1, boolean var2) {
      this(var1, true, false, var2, false, false, false);
   }

   public ClearListDialog(Dv2 var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      long var26;
      Object[] var65;
      long var66;
      Dv2 var73;
      String var10001 = a(16020, -21725);
      long var10 = 621802534541065536L;
      String var9 = var10001;
      Ref.s(621802534541065536L, var9, var10);
      Registry.lookupField(421266703871298745L).setInt(this, 0);
      Registry.lookupField(346170058577391982L).setBoolean(this, false);
      i$arrString();
      Registry.lookupField(600941127808801108L).setBoolean(this, false);
      String var10003 = a(16031, 11145);
      long var12 = 516041024875871057L;
      String var11 = var10003;
      Ref.s(516041024875871057L, var11, var12);
      Registry.lookupField(278860969542151097L).setBoolean(this, false);
      long var14 = 122775213065710024L;
      Object var13 = null;
      Ref.s(122775213065710024L, var13, var14);
      Registry.lookupField(132980032346783161L).setBoolean(this, false);
      long var16 = 410025015855556821L;
      String var15 = "";
      Ref.s(410025015855556821L, var15, var16);
      Registry.lookupField(373160888351879443L).setBoolean(this, true);
      Registry.lookupField(351258023918549839L).setBoolean(this, false);
      Registry.lookupField(297692429440577111L).setBoolean(this, false);
      Registry.lookupField(121864494913095536L).setInt(this, a(6992, 4475965135867929457L));
      Registry.lookupField(173564240323200101L).setInt(this, a(18718, 5887525620647211316L));
      Registry.lookupField(251701947004354642L).setLong(this, c(14216, 5971579523824780468L));
      Registry.lookupField(617402198595332969L).setBoolean(this, false);
      Registry.lookupField(162130310027014887L).setBoolean(this, true);
      Registry.lookupField(475628264768682265L).setBoolean(this, true);
      Registry.lookupField(187877731600446636L).setBoolean(this, true);
      Registry.lookupField(355644003217252401L).setBoolean(this, true);
      Registry.lookupField(400344822529996732L).setBoolean(this, false);
      Registry.lookupField(614822648460925381L).setBoolean(this, false);
      Registry.lookupField(208862359481951532L).setBoolean(this, true);
      Registry.lookupField(433591404553967252L).setBoolean(this, true);
      Registry.lookupField(320099007409396099L).setBoolean(this, false);
      Registry.lookupField(261823546936210785L).setBoolean(this, true);
      Registry.lookupField(546619646805113494L).setBoolean(this, false);
      Registry.lookupField(177310480747231389L).setBoolean(this, false);
      Registry.lookupField(461146548297071424L).setBoolean(this, false);
      Registry.lookupField(151984047746765220L).setInt(this, -1);
      Registry.lookupField(210701759688696485L).setBoolean(this, false);
      Registry.lookupField(594717380361478836L).setInt(this, 0);
      Registry.lookupField(286814358747038838L).setInt(this, 0);
      Registry.lookupField(410723057057853227L).setBoolean(this, false);
      Registry.lookupField(177310480747231389L).setBoolean(this, var7);
      Registry.lookupField(546619646805113494L).setBoolean(this, var6);
      Registry.lookupField(535560258141699810L).setBoolean(this, var5);
      Registry.lookupField(261823546936210785L).setBoolean(this, var4);
      Registry.lookupField(355644003217252401L).setBoolean(this, var2);
      Registry.lookupField(400344822529996732L).setBoolean(this, var3);
      this.setUndecorated(true);
      this.setAlwaysOnTop(true);
      long var18 = 334241381080505095L;
      Ref.s(334241381080505095L, var1, var18);
      JPanel var10006 = new JPanel();
      long var20 = 201109810837008677L;
      JPanel var19 = var10006;
      Ref.s(201109810837008677L, var19, var20);
      Object var21 = 201109810837008677L;
      ((JPanel)Ref.g(201109810837008677L, var21)).setOpaque(false);
      Object var23 = 201109810837008677L;
      ((JPanel)Ref.g(201109810837008677L, var23)).setLayout(new MigLayout(a(16003, 26023), a(16006, 13141), a(16006, 13141)));
      boolean var10008 = var5;
      if (this == null) {
         if (var5) {
            KD var10009 = new KD(a(16018, -2541));
            var26 = 376708942717725433L;
            KD var25 = var10009;
            Ref.s(376708942717725433L, var25, var26);
            Object var27 = 201109810837008677L;
            JPanel var10010 = (JPanel)Ref.g(201109810837008677L, var27);
            Object var29 = 376708942717725433L;
            this.add((KD)Ref.g(376708942717725433L, var29));
         }

         var10008 = var3;
      }

      if (this == null) {
         if (!var10008) {
            KD var72 = new KD(a(16026, -2173));
            long var32 = 282658375549611139L;
            KD var31 = var72;
            Ref.s(282658375549611139L, var31, var32);
            Object[] var74 = Registry.emptyArgs();
            long var34 = 220872586276736931L;
            Object[] var33 = var74;
            Ref.h(220872586276736931L, var33, var34);

            try {
               ;
            } catch (InvocationTargetException var71) {
               throw var71.getTargetException();
            }

            Object var35 = 201109810837008677L;
            JPanel var10011 = (JPanel)Ref.g(201109810837008677L, var35);
            Object var37 = 282658375549611139L;
            this.add((KD)Ref.g(282658375549611139L, var37));
            Object var39 = 282658375549611139L;
            ((KD)Ref.g(282658375549611139L, var39)).setFocusable(false);
            Object var41 = 334241381080505095L;
            Dv2 var10014 = (Dv2)Ref.g(334241381080505095L, var41);
            Object var43 = 201109810837008677L;
            this.z((JPanel)Ref.g(201109810837008677L, var43));
            Object var45 = 282658375549611139L;
            ((KD)Ref.g(282658375549611139L, var45)).addActionListener(new com.finalshell.ui.listener.Y2(this));
         }

         var73 = new Dv2();
         long var48 = 265132846717086219L;
         Dv2 var47 = var73;
         Ref.s(265132846717086219L, var47, var48);
         Object var49 = 265132846717086219L;
         ((Dv2)Ref.g(265132846717086219L, var49)).setFocusTraversalKeysEnabled(false);
         Object var51 = 265132846717086219L;
         ((Dv2)Ref.g(265132846717086219L, var51)).P(a(16004, 16257));
         Object var53 = 265132846717086219L;
         ((Dv2)Ref.g(265132846717086219L, var53))
            .setBackground(new Color(a(1943, 7724657239105241015L), a(20834, 7837820692826401092L), a(20834, 7837820692826401092L)));
         Object var55 = 265132846717086219L;
         Registry.packArgs(Ref.g(265132846717086219L, var55));
         long var57 = 322267315291882359L;
         Object var75 = Ref.h2(322267315291882359L, var57);

         try {
         } catch (InvocationTargetException var70) {
            throw var70.getTargetException();
         }
      }

      Object var59 = 265132846717086219L;
      ((Dv2)Ref.g(265132846717086219L, var59)).getDocument().addDocumentListener(new DH_3(this));
      this.addWindowFocusListener(new TP3(this));
      this.setFocusable(true);
      this.setAlwaysOnTop(true);
      Object var61 = 265132846717086219L;
      ((Dv2)Ref.g(265132846717086219L, var61)).addKeyListener(new XS(this, var6));
      Object var63 = 334241381080505095L;
      ((Dv2)Ref.g(334241381080505095L, var63)).addKeyListener(new B7(this, var3));
      this.setSize(new Dimension(Registry.lookupField(173564240323200101L).getInt(this), Registry.lookupField(121864494913095536L).getInt(this)));
      Object[] var10012 = Registry.emptyArgs();
      var66 = 254575819775712923L;
      var65 = var10012;
      Ref.h(254575819775712923L, var65, var66);

      try {
         ;
      } catch (InvocationTargetException var69) {
         throw var69.getTargetException();
      }

      Object var67 = 334241381080505095L;
      Registry.lookupField(421266703871298745L).setInt(this, ((Dv2)Ref.g(334241381080505095L, var67)).getCaretPosition());
      if (Ky4.F$arrString() != null) {
         J(new String[4]);
      }
   }

   public void M() {
   }

   public boolean A() {
      String[] var10000 = i$arrString();
      long var2 = System.currentTimeMillis() - Registry.lookupField(202023651119989609L).getLong(this);
      String[] var1 = var10000;
      long var5;
      int var4 = (var5 = var2 - c(27856, 3916665113666379759L)) == 0L ? 0 : (var5 < 0L ? -1 : 1);
      if (var1 == null) {
         if (var4 > 0) {
            return false;
         }

         var4 = 1;
      }

      return var4 != 0;
   }

   public void k$void() {
      Object var2 = 265132846717086219L;
      String var1 = ((Dv2)Ref.g(265132846717086219L, var2)).getText().trim();
      if (var1.length() == 0) {
         Object var4 = 265132846717086219L;
         ((Dv2)Ref.g(265132846717086219L, var4)).z(null);
      }
   }

   public void E() {
      i$arrString();
      Object var2 = 282658375549611139L;
      ((KD)Ref.g(282658375549611139L, var2)).setBorder(BorderFactory.createEmptyBorder(3, a(3236, 442276457065936006L), 3, a(19468, 6577395818337842219L)));
      Object var4 = 376708942717725433L;
      Object var10002 = (KD)Ref.g(376708942717725433L, var4);
      if (this == null) {
         if (var10002 == null) {
            return;
         }

         var10002 = this;
         Object var6 = 376708942717725433L;
         KD var10003 = (KD)Ref.g(376708942717725433L, var6);
      }

      ((KD)var10002).setBorder(BorderFactory.createEmptyBorder(3, a(19468, 6577395818337842219L), 3, a(19468, 6577395818337842219L)));
   }

   public abstract boolean p(L1 var1);

   public abstract Dx4_2 k$dx_4();

   public abstract Dx4_2 n();

   public abstract void L(String var1);

   public abstract void k(L1 var1);

   public abstract void i(L1 var1, int var2);

   public abstract void u(KeyEvent var1);

   public abstract String c();

   public void v$void() {
      Integer var26;
      String[] var10000 = i$arrString();
      Registry.lookupField(594717380361478836L).setInt(this, 0);
      String[] var1 = var10000;
      Registry.lookupField(286814358747038838L).setInt(this, 0);
      Object var6 = 390003399451338430L;
      if ((US3)Ref.g(390003399451338430L, var6) != null) {
         int var2 = 0;

         do {
            Object var8 = 627738372728753803L;
            Object var10003 = Ref.g(627738372728753803L, var8);
            Object var10004 = Registry.emptyArgs();
            long var11 = 253718301466496149L;
            Object var10 = var10004;
            var10004 = Ref.h(253718301466496149L, var10, var11);

            try {
               var26 = (Integer)var10004;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            if (!(var10003 < var26)) {
               break;
            }

            Object var12 = 627738372728753803L;
            Ref.g(627738372728753803L, var12);
            L1 var10005 = (L1)(Registry.packArgs(var2));
            long var15 = 430610060651646114L;
            Object var14 = var10005;
            var10005 = Ref.h(430610060651646114L, var14, var15);

            try {
               var10005 = (L1)var10005;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            L1 var3 = var10005;
            Object var16 = 390003399451338430L;
            Ref.g(390003399451338430L, var16);
            Object var18 = 369475678680292668L;
            Component var10008 = (Component)(Registry.packArgs(Ref.g(369475678680292668L, var18), var3, var2, false, false));
            long var21 = 579113908691306655L;
            Object var20 = var10008;
            var10008 = Ref.h(579113908691306655L, var20, var21);

            try {
               var10008 = (Component)var10008;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }

            Component var4 = var10008;
            Dimension var5 = var4.getPreferredSize();
            Registry.lookupField(594717380361478836L).setInt(this, Math.max(var5.width, Registry.lookupField(594717380361478836L).getInt(this)));
            int var10009 = var5.height;
            Registry.lookupField(286814358747038838L).setInt(this, var10009);
            var2++;
         } while (var1 == null);
      }
   }

   public void a(int var1) {
      String[] var2 = i$arrString();
      Object var3 = 390003399451338430L;
      US3 var10001 = (US3)Ref.g(390003399451338430L, var3);
      if (var2 == null) {
         if (var10001 == null) {
            return;
         }

         Object var5 = 390003399451338430L;
         US3 var10002 = (US3)Ref.g(390003399451338430L, var5);
      }

      Object[] var10 = Registry.packArgs(var1);
      long var8 = 539372166451727373L;
      Object[] var7 = var10;
      Ref.h(539372166451727373L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public Rectangle S() {
      Object[] var43;
      Object var52;
      Integer var63;
      int var64;
      Object var66;
      boolean var73;
      i$arrString();
      Object[] var10002 = Registry.emptyArgs();
      long var16 = 477819205317189433L;
      Object[] var15 = var10002;
      Ref.h(477819205317189433L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      ClearListDialog var1;
      Object var3;
      label175: {
         boolean var2 = false;
         var1 = this;
         var3 = 0;
         byte var10001 = (byte)((Registry.lookupField(546619646805113494L).getBoolean(this)) ? 1 : 0);
         if (this == null) {
            if (var10001 == 0) {
               Object var10006;
               label166: {
                  label165: {
                     Object var17 = 618427502576624312L;
                     ((Tq4)Ref.g(618427502576624312L, var17)).getRowHeight();
                     Object var19 = 618427502576624312L;
                     int var4 = 0 * ((Tq4)Ref.g(618427502576624312L, var19)).getRowCount();
                     short var10003 = 19468;
                     Object var21 = 618427502576624312L;
                     var4 = ((Tq4)Ref.g(618427502576624312L, var21)).getPreferredSize().height;
                     int var5 = a((int)this, 6577395818337842219L);
                     Object var23 = 618427502576624312L;
                     Object var6 = ((Tq4)Ref.g(618427502576624312L, var23)).getRowHeight();
                     Object var25 = 529887570589696401L;
                     var52 = 0 + ((JPanel)Ref.g(529887570589696401L, var25)).getPreferredSize().height + 2;
                     var10006 = var52;
                     Object var10007 = Registry.lookupField(121864494913095536L).getInt(this);
                     if (this == null) {
                        if (var52 > var10007) {
                           var52 = Registry.lookupField(121864494913095536L).getInt(this);
                           if (this == null) {
                              break label165;
                           }
                        }

                        var10006 = var52;
                        if (this != null) {
                           break label166;
                        }

                        var10007 = var6;
                     }

                     if (var10006 < var10007) {
                        var52 = var6;
                     }
                  }

                  var10006 = this.getWidth();
               }

               var3 = var10006;
               if (this == null) {
                  break label175;
               }
            }

            var3 = 0;
            var10001 = 3;
         }

         byte var54 = var10001;
         int var56 = 1;
         Object var27 = 627738372728753803L;
         Ref.g(627738372728753803L, var27);
         Object var61 = Registry.emptyArgs();
         long var30 = 253718301466496149L;
         Object var29 = var61;
         var61 = Ref.h(253718301466496149L, var29, var30);

         try {
            var63 = (Integer)var61;
         } catch (InvocationTargetException var50) {
            throw var50.getTargetException();
         }

         int var59;
         label150: {
            label178: {
               var59 = var63;
               Registry.lookupField(467422017983063981L).setInt(this, 1);
               var64 = var59;
               if (this == null) {
                  if (var59 < Registry.lookupField(132462760774120245L).getInt(this)) {
                     Registry.lookupField(607893582657885022L).setInt(this, var59);
                     if (this == null) {
                        break label178;
                     }
                  }

                  Registry.lookupField(607893582657885022L).setInt(this, Registry.lookupField(132462760774120245L).getInt(this));
                  Registry.lookupField(467422017983063981L).setInt(this, var59 / Registry.lookupField(132462760774120245L).getInt(this));
                  var64 = var59;
               }

               float var7 = (float)var64 % (float)Registry.lookupField(132462760774120245L).getInt(this);
               float var74;
               var65 = (var74 = var7 - 0.0F) == 0.0F ? 0 : (var74 < 0.0F ? -1 : 1);
               if (this != null) {
                  break label150;
               }

               if (var65 > 0) {
                  Registry.lookupField(467422017983063981L).setInt(this, Registry.lookupField(467422017983063981L).getInt(this) + 1);
               }
            }

            var65 = Registry.lookupField(286814358747038838L).getInt(this);
         }

         int var60 = var65;
         int var8 = Registry.lookupField(607893582657885022L).getInt(this) * var60;
         Object var31 = 529887570589696401L;
         var52 = 0 + ((JPanel)Ref.g(529887570589696401L, var31)).getPreferredSize().height + 5;
         int var10004 = var59;
         if (this == null) {
            if (var59 == 0) {
               Object var33 = 529887570589696401L;
               var52 = ((JPanel)Ref.g(529887570589696401L, var33)).getPreferredSize().height;
            }

            var10004 = Registry.lookupField(467422017983063981L).getInt(this);
         }

         label138: {
            if (this == null) {
               if (var10004 <= var54) {
                  var56 = Registry.lookupField(467422017983063981L).getInt(this);
                  if (this == null) {
                     break label138;
                  }
               }

               var10004 = var54;
            }

            var56 = var10004;
         }

         byte var9 = 5;
         int var10 = var56 * Registry.lookupField(594717380361478836L).getInt(this) + var9;
         int var11 = 0;
         Object var12 = 0;

         Object var10005;
         label130: {
            while (var12 < Registry.lookupField(467422017983063981L).getInt(this)) {
               Object var13 = (var12 + 1) * Registry.lookupField(594717380361478836L).getInt(this);
               if (var1 == null) {
                  var66 = var13;
                  var10005 = Registry.lookupField(568433753069106815L).getInt(this);
                  if (var1 != null) {
                     break label130;
                  }

                  if (var13 < var10005) {
                     var11 = (var12 + 1) * Registry.lookupField(594717380361478836L).getInt(this) + var9;
                  }

                  var12++;
               }

               if (var1 != null) {
                  break;
               }
            }

            var3 = Math.max(var10, var11);
            var12 = a(5099, 1851954059984038851L);
            var66 = var3;
            var10005 = var12;
         }

         if (var1 == null) {
            if (var66 < var10005) {
               var3 = var12;
            }

            var66 = Registry.lookupField(467422017983063981L).getInt(this) * Registry.lookupField(594717380361478836L).getInt(this);
            var10005 = var3;
         }

         label181: {
            if (var1 == null) {
               if (var66 > var10005) {
                  var52 += 10;
               }

               var66 = var3;
               if (var1 != null) {
                  break label181;
               }

               var10005 = this;
               long var35 = 529887570589696401L;
            }

            if (var66 < var10005) {
               Object var37 = 529887570589696401L;
               var3 = ((JPanel)Ref.g(529887570589696401L, var37)).getPreferredSize().width;
            }

            boolean var67 = false;
         }

         int var14 = Registry.lookupField(594717380361478836L).getInt(this);
         Object var39 = 123884418036416875L;
         ((JScrollPane)Ref.g(123884418036416875L, var39)).getHorizontalScrollBar().setUnitIncrement(a(6756, 5967544358542991949L));
      }

      Rectangle var58;
      label110: {
         Object var41 = 334241381080505095L;
         Point var55 = ((Dv2)Ref.g(334241381080505095L, var41)).getLocationOnScreen();
         var58 = new Rectangle();
         Object var68 = var58;
         Rectangle var70 = var55.x;
         if (var1 == null) {
            var58.x = var55.x;
            var68 = this;
            Object[] var71 = Registry.emptyArgs();
            long var44 = 257476172962055898L;
            var43 = var71;
            var70 = (Rectangle)Ref.h(257476172962055898L, var43, var44);

            try {
               var73 = (Boolean)var70;
            } catch (InvocationTargetException var49) {
               throw var49.getTargetException();
            }

            if (var73) {
               Object var45 = 334241381080505095L;
               var55.y.y = 0 + ((Dv2)Ref.g(334241381080505095L, var45)).getHeight();
               if (var1 == null) {
                  break label110;
               }
            }

            var70 = var58;
            int var10008 = var55.y - var52;
         }

         ((Rectangle)var68).y = (int)var70;
      }

      var58.width = (int)var3;
      Rectangle var69 = var58;
      if (var1 == null) {
         var58.height = (int)var52;
         if (Registry.lookupField(208862359481951532L).getBoolean(this)) {
            Object var47 = 334241381080505095L;
            var58.x.x = 0 + (((Dv2)Ref.g(334241381080505095L, var47)).getWidth() - this.getWidth());
         }

         var69 = var58;
      }

      return var69;
   }

   public void l() {
      long var27;
      JXList var64;
      Integer var66;
      Object[] var73;
      String[] var1 = i$arrString();
      Boolean var10001 = (Boolean)(Registry.emptyArgs());
      long var5 = 257476172962055898L;
      Object var4 = var10001;
      var10001 = Ref.h(257476172962055898L, var4, var5);

      try {
         var10001 = (Boolean)var10001;
      } catch (InvocationTargetException var55) {
         throw var55.getTargetException();
      }

      label123: {
         label127: {
            if (var1 == null) {
               if (var10001 == null) {
                  var10001 = (Boolean)(this);
                  Object var6 = 618427502576624312L;
                  int var10002 = ((Tq4)Ref.g(618427502576624312L, var6)).getRowCount();
                  if (var1 != null) {
                     break label123;
                  }

                  if (var10002 <= 0) {
                     break label127;
                  }

                  Object var8 = 618427502576624312L;
                  int var2 = ((Tq4)Ref.g(618427502576624312L, var8)).getRowCount() - 1;
                  Dx4_2 var10004 = (Dx4_2)(Registry.emptyArgs());
                  long var11 = 424827586848941194L;
                  Object var10 = var10004;
                  var10004 = Ref.h(424827586848941194L, var10, var11);

                  try {
                     var10004 = (Dx4_2)var10004;
                  } catch (InvocationTargetException var54) {
                     throw var54.getTargetException();
                  }

                  Dx4_2 var3 = var10004;
                  if (var1 == null) {
                     if (var3 != null) {
                        ArrayList var10006 = Registry.emptyArgs();
                        long var13 = 596400151700218172L;
                        Object var12 = var10006;
                        var10006 = Ref.h(596400151700218172L, var12, var13);

                        try {
                           var10006 = (ArrayList)var10006;
                        } catch (InvocationTargetException var53) {
                           throw var53.getTargetException();
                        }

                        var2 = var3 - var10006.size();
                     }

                     Object var14 = 618427502576624312L;
                     ((Tq4)Ref.g(618427502576624312L, var14)).getSelectionModel().setSelectionInterval(var2, var2);
                     Object var16 = 618427502576624312L;
                     Ref.g(618427502576624312L, var16);
                     Rectangle var10008;
                     Object var18 = 618427502576624312L;
                     // [VF-super] super(((Tq4)Ref.g(618427502576624312L, var18)).getCellRect(var2, 0, true));
                     Object[] var76 = Registry.packArgs(var10008);
                     long var21 = 393507447655466815L;
                     Object[] var20 = var76;
                     Ref.h(393507447655466815L, var20, var21);

                     try {
                        ;
                     } catch (InvocationTargetException var52) {
                        throw var52.getTargetException();
                     }
                  }

                  if (var1 == null) {
                     break label127;
                  }
               }

               var10001 = (Boolean)(this);
               Object var22 = 618427502576624312L;
               ((Tq4)Ref.g(618427502576624312L, var22)).getRowCount();
            }

            if (var1 != null) {
               break label123;
            }

            if (var10001 > 0) {
               int var56 = 0;
               Dx4_2 var61 = (Dx4_2)(Registry.emptyArgs());
               long var25 = 424827586848941194L;
               Object var24 = var61;
               var61 = Ref.h(424827586848941194L, var24, var25);

               try {
                  var61 = (Dx4_2)var61;
               } catch (InvocationTargetException var51) {
                  throw var51.getTargetException();
               }

               Dx4_2 var58 = var61;
               if (var1 == null) {
                  if (var58 != null) {
                     ArrayList var70 = Registry.emptyArgs();
                     var27 = 596400151700218172L;
                     Object var26 = var70;
                     var70 = Ref.h(596400151700218172L, var26, var27);

                     try {
                        var70 = (ArrayList)var70;
                     } catch (InvocationTargetException var50) {
                        throw var50.getTargetException();
                     }

                     var56 = var58 + var70.size();
                  }

                  Object var28 = 618427502576624312L;
                  ((Tq4)Ref.g(618427502576624312L, var28)).getSelectionModel().setSelectionInterval(var56, var56);
               }

               Object var30 = 618427502576624312L;
               Ref.g(618427502576624312L, var30);
               Rectangle var10005;
               Object var32 = 618427502576624312L;
               // [VF-super] super(((Tq4)Ref.g(618427502576624312L, var32)).getCellRect(var56, 0, true));
               var73 = Registry.packArgs(var10005);
               long var35 = 393507447655466815L;
               Object[] var34 = var73;
               Ref.h(393507447655466815L, var34, var35);

               try {
                  ;
               } catch (InvocationTargetException var49) {
                  throw var49.getTargetException();
               }
            }
         }

         var10001 = false;
      }

      ClearListDialog var57 = var10001;
      if (var1 == null) {
         Object var36 = 627738372728753803L;
         Ref.g(627738372728753803L, var36);
         Object var10003 = Registry.emptyArgs();
         long var39 = 253718301466496149L;
         Object var38 = var10003;
         var10003 = Ref.h(253718301466496149L, var38, var39);

         try {
            var66 = (Integer)var10003;
         } catch (InvocationTargetException var48) {
            throw var48.getTargetException();
         }

         if (var66 > 0) {
            Object var40 = 369475678680292668L;
            ((JXList)Ref.g(369475678680292668L, var40)).setSelectedIndex((int)var57);
         }
      }

      Object var42 = 369475678680292668L;
      var64 = (JXList)Ref.g(369475678680292668L, var42);
      if (var1 == null) {
         if (var64.getCellBounds((int)var57, (int)var57) == null) {
            return;
         }

         Object var44 = 369475678680292668L;
         JXList var67 = (JXList)Ref.g(369475678680292668L, var44);
      }

      Object var46 = 369475678680292668L;
      this.scrollRectToVisible(((JXList)Ref.g(369475678680292668L, var46)).getCellBounds((int)var57, (int)var57));
   }

   public void f$void() {
      long var43;
      Integer var64;
      Object[] var65;
      Object var66;
      String[] var1 = i$arrString();
      Object var10000 = Registry.lookupField(546619646805113494L).getBoolean(this);
      if (var1 == null) {
         if (var10000 == null) {
            Boolean var10001 = (Boolean)(Registry.emptyArgs());
            long var5 = 257476172962055898L;
            Object var4 = var10001;
            var10001 = Ref.h(257476172962055898L, var4, var5);

            try {
               var10001 = (Boolean)var10001;
            } catch (InvocationTargetException var55) {
               throw var55.getTargetException();
            }

            if (var1 == null) {
               if (var10001 == null) {
                  Object var6 = 618427502576624312L;
                  int var2 = ((Tq4)Ref.g(618427502576624312L, var6)).getSelectedRow();
                  var2--;
                  if (var1 == null) {
                     if (var2 < 0) {
                        Object var8 = 618427502576624312L;
                        var2 = ((Tq4)Ref.g(618427502576624312L, var8)).getRowCount() - 1;
                     }

                     Object var10 = 618427502576624312L;
                     ((Tq4)Ref.g(618427502576624312L, var10)).getSelectionModel().setSelectionInterval(var2, var2);
                     Object var12 = 618427502576624312L;
                     Ref.g(618427502576624312L, var12);
                     Rectangle var10006;
                     Object var14 = 618427502576624312L;
                     // [VF-super] super(((Tq4)Ref.g(618427502576624312L, var14)).getCellRect(var2, 0, true));
                     Object[] var70 = Registry.packArgs(var10006);
                     long var17 = 393507447655466815L;
                     Object[] var16 = var70;
                     Ref.h(393507447655466815L, var16, var17);

                     try {
                        ;
                     } catch (InvocationTargetException var54) {
                        throw var54.getTargetException();
                     }
                  }

                  if (var1 == null) {
                     return;
                  }
               }

               var10001 = (Boolean)(this);
               Object var18 = 618427502576624312L;
               ((Tq4)Ref.g(618427502576624312L, var18)).getSelectedRow();
            }

            ClearListDialog var57 = var10001;
            ClearListDialog var62 = --var57;
            if (var1 == null) {
               if (var57 < 0) {
                  var65 = Registry.emptyArgs();
                  long var21 = 496821856781947383L;
                  Object[] var20 = var65;
                  Ref.h(496821856781947383L, var20, var21);

                  try {
                     return;
                  } catch (InvocationTargetException var50) {
                     throw var50.getTargetException();
                  }
               }

               var62 = var57;
            }

            if (var1 == null) {
               if (var62 < 0) {
                  Object var22 = 618427502576624312L;
                  var57 = (ClearListDialog)(((Tq4)Ref.g(618427502576624312L, var22)).getRowCount() - 1);
               }

               Object var24 = 618427502576624312L;
               ((Tq4)Ref.g(618427502576624312L, var24)).getSelectionModel().setSelectionInterval((int)var57, (int)var57);
            }

            Object var26 = 618427502576624312L;
            ((JComponent)((Tq4)Ref.g(618427502576624312L, var26)).getParent().getParent()).scrollRectToVisible(new Rectangle(0, 0, 0, 0));
            Object var28 = 618427502576624312L;
            ((JComponent)((Tq4)Ref.g(618427502576624312L, var28)).getParent()).scrollRectToVisible(new Rectangle(0, 0, 0, 0));
            Object var30 = 618427502576624312L;
            Ref.g(618427502576624312L, var30);
            Object[] var10005 = Registry.packArgs(new Rectangle(0, 0, 0, 0));
            long var33 = 393507447655466815L;
            Object[] var32 = var10005;
            Ref.h(393507447655466815L, var32, var33);

            try {
               ;
            } catch (InvocationTargetException var53) {
               throw var53.getTargetException();
            }

            if (var1 == null) {
               return;
            }
         }

         var10000 = 0;
      }

      ClearListDialog var59 = (ClearListDialog)var10000;
      if (var1 == null) {
         Object var34 = 627738372728753803L;
         Ref.g(627738372728753803L, var34);
         Object var10002 = Registry.emptyArgs();
         long var37 = 253718301466496149L;
         Object var36 = var10002;
         var10002 = Ref.h(253718301466496149L, var36, var37);

         try {
            var64 = (Integer)var10002;
         } catch (InvocationTargetException var52) {
            throw var52.getTargetException();
         }

         if (var64 > 0) {
            label131: {
               Object var38 = 369475678680292668L;
               var59 = (ClearListDialog)(((JXList)Ref.g(369475678680292668L, var38)).getSelectedIndex());
               ClearListDialog var10003 = var59;
               if (var1 == null) {
                  if (var59 == null) {
                     var59 = (ClearListDialog)(0);
                     if (var1 == null) {
                        break label131;
                     }
                  }

                  var10003 = --var59;
               }

               if (var1 == null) {
                  if (!(var10003 < 0)) {
                     break label131;
                  }

                  var10003 = this;
                  Object var40 = 627738372728753803L;
                  Ref.g(627738372728753803L, var40);
                  var66 = Registry.emptyArgs();
                  var43 = 253718301466496149L;
                  Object var42 = var66;
                  var66 = Ref.h(253718301466496149L, var42, var43);

                  try {
                     var68 = (Integer)var66;
                  } catch (InvocationTargetException var51) {
                     throw var51.getTargetException();
                  }

                  int var69 = var68 - 1;
               }

               var59 = var10003;
            }

            Object var44 = 369475678680292668L;
            ((JXList)Ref.g(369475678680292668L, var44)).setSelectedIndex((int)var59);
         }
      }

      Object var46 = 369475678680292668L;
      Rectangle var3 = ((JXList)Ref.g(369475678680292668L, var46)).getCellBounds((int)var59, (int)var59);
      if (var3 != null) {
         Object var48 = 369475678680292668L;
         ((JXList)Ref.g(369475678680292668L, var48)).scrollRectToVisible(var3);
      }
   }

   public void Y() {
      long var26;
      String[] var1 = i$arrString();
      ClearListDialog var10000 = Registry.lookupField(546619646805113494L).getBoolean(this);
      if (var1 == null) {
         if (var10000 == null) {
            Boolean var10001 = (Boolean)(Registry.emptyArgs());
            long var4 = 257476172962055898L;
            Object var3 = var10001;
            var10001 = Ref.h(257476172962055898L, var3, var4);

            try {
               var10001 = (Boolean)var10001;
            } catch (InvocationTargetException var42) {
               throw var42.getTargetException();
            }

            if (var1 == null) {
               if (var10001 == null) {
                  Object var5 = 618427502576624312L;
                  int var2 = ((Tq4)Ref.g(618427502576624312L, var5)).getSelectedRow();
                  var2++;
                  Object var7 = 618427502576624312L;
                  if (!(0 > ((Tq4)Ref.g(618427502576624312L, var7)).getRowCount() - 1)) {
                     Object var9 = 618427502576624312L;
                     ((Tq4)Ref.g(618427502576624312L, var9)).getSelectionModel().setSelectionInterval(var2, var2);
                  }

                  Object var11 = 618427502576624312L;
                  Ref.g(618427502576624312L, var11);
                  Rectangle var10006;
                  Object var13 = 618427502576624312L;
                  // [VF-super] super(((Tq4)Ref.g(618427502576624312L, var13)).getCellRect(var2, 0, true));
                  Object[] var55 = Registry.packArgs(var10006);
                  long var16 = 393507447655466815L;
                  Object[] var15 = var55;
                  Ref.h(393507447655466815L, var15, var16);

                  try {
                     ;
                  } catch (InvocationTargetException var41) {
                     throw var41.getTargetException();
                  }

                  if (var1 == null) {
                     return;
                  }
               }

               var10001 = (Boolean)(this);
               Object var17 = 618427502576624312L;
               ((Tq4)Ref.g(618427502576624312L, var17)).getSelectedRow();
            }

            ClearListDialog var44 = var10001;
            var44++;
            Object var19 = 618427502576624312L;
            ((Tq4)Ref.g(618427502576624312L, var19)).getSelectionModel().setSelectionInterval((int)var44, (int)var44);
            Object var21 = 618427502576624312L;
            Ref.g(618427502576624312L, var21);
            Rectangle var10005;
            Object var23 = 618427502576624312L;
            // [VF-super] super(((Tq4)Ref.g(618427502576624312L, var23)).getCellRect((int)var44, 0, true));
            Object[] var54 = Registry.packArgs(var10005);
            var26 = 393507447655466815L;
            Object[] var25 = var54;
            Ref.h(393507447655466815L, var25, var26);

            try {
               ;
            } catch (InvocationTargetException var40) {
               throw var40.getTargetException();
            }

            if (var1 == null) {
               return;
            }
         }

         var10000 = this;
         Object var27 = 369475678680292668L;
         ((JXList)Ref.g(369475678680292668L, var27)).getSelectedIndex();
      }

      ClearListDialog var46;
      label65: {
         label64: {
            var46 = var10000;
            var10000 = var46;
            ClearListDialog var50 = -1;
            if (var1 == null) {
               if (var46 == null) {
                  var46 = (ClearListDialog)(false);
                  if (var1 == null) {
                     break label64;
                  }
               }

               var46++;
               if (var1 != null) {
                  break label65;
               }

               var10000 = var46;
               var50 = this;
               Object var29 = 627738372728753803L;
               Ref.g(627738372728753803L, var29);
               Object var10003 = Registry.emptyArgs();
               long var32 = 253718301466496149L;
               Object var31 = var10003;
               var10003 = Ref.h(253718301466496149L, var31, var32);

               try {
                  var52 = (Integer)var10003;
               } catch (InvocationTargetException var39) {
                  throw var39.getTargetException();
               }

               int var53 = var52 - 1;
            }

            if (var10000 > var50) {
               var46 = (ClearListDialog)(false);
            }
         }

         Object var33 = 369475678680292668L;
         ((JXList)Ref.g(369475678680292668L, var33)).setSelectedIndex((int)var46);
      }

      Object var35 = 369475678680292668L;
      JXList var10002 = (JXList)Ref.g(369475678680292668L, var35);
      Object var37 = 369475678680292668L;
      this.scrollRectToVisible(((JXList)Ref.g(369475678680292668L, var37)).getCellBounds((int)var46, (int)var46));
   }

   public boolean v$boolean() {
      String[] var10000 = i$arrString();
      boolean var2 = false;
      String[] var1 = var10000;
      Object var3 = 334241381080505095L;
      Ref.g(334241381080505095L, var3);
      ClearListDialog var10002 = (ClearListDialog)(Registry.emptyArgs());
      long var6 = 518766954559532879L;
      Object var5 = var10002;
      var10002 = Ref.h(518766954559532879L, var5, var6);

      try {
         var10002 = (ClearListDialog)var10002;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      if (var1 != null) {
         boolean var15 = var10002.equals(this);
         if (var1 != null) {
            return var15;
         } else {
            if (!var15) {
               var2 = true;
            }

            return var2;
         }
      } else if (var10002 == null) {
         return var2;
      } else {
         var10002 = this;
         Object var7 = 334241381080505095L;
         Ref.g(334241381080505095L, var7);
         Object[] var10004 = Registry.emptyArgs();
         long var10 = 518766954559532879L;
         Object[] var9 = var10004;
         Ref.h(518766954559532879L, var9, var10);

         label23:
         try {
            break label23;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }
      }
   }

   public void Q() {
      SwingUtilities.invokeLater(new A5(this));
   }

   public void z() {
      Object[] var73;
      boolean var79;
      i$arrString();
      Object var4 = 334241381080505095L;
      Registry.lookupField(151984047746765220L).setInt(this, ((Dv2)Ref.g(334241381080505095L, var4)).getCaretPosition());
      if (this == null) {
         if (Registry.lookupField(251701947004354642L).getLong(this) > 0L
            && System.currentTimeMillis() - Registry.lookupField(251701947004354642L).getLong(this) < c(16215, 8781237576104741993L)) {
         }

         Registry.lookupField(351178736107776851L).setLong(this, System.currentTimeMillis());
         Registry.lookupField(635362383106512715L).setLong(this, System.currentTimeMillis());
         Object[] var10002 = Registry.emptyArgs();
         long var7 = 260951206679444801L;
         Object[] var6 = var10002;
         Ref.h(260951206679444801L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var65) {
            throw var65.getTargetException();
         }
      }

      Rectangle var66 = (Rectangle)(Registry.emptyArgs());
      long var9 = 590715370702654304L;
      Object var8 = var66;
      var66 = Ref.h(590715370702654304L, var8, var9);

      try {
         var66 = (Rectangle)var66;
      } catch (InvocationTargetException var64) {
         throw var64.getTargetException();
      }

      Rectangle var2 = var66;
      this.setBounds(var2);
      ClearListDialog var69 = this.isVisible();
      if (this == null) {
         if (var69 == null) {
            Object var10 = 618427502576624312L;
            ((Tq4)Ref.g(618427502576624312L, var10)).clearSelection();
            Object[] var10004 = Registry.packArgs(true);
            long var13 = 238155532020070409L;
            Object[] var12 = var10004;
            Ref.h(238155532020070409L, var12, var13);

            try {
               ;
            } catch (InvocationTargetException var63) {
               throw var63.getTargetException();
            }

            ClearListDialog var72 = this;
            if (this == null) {
               if (!Registry.lookupField(546619646805113494L).getBoolean(this)) {
                  Object[] var10005 = Registry.emptyArgs();
                  long var15 = 587140723221156561L;
                  Object[] var14 = var10005;
                  Ref.h(587140723221156561L, var14, var15);

                  try {
                     ;
                  } catch (InvocationTargetException var62) {
                     throw var62.getTargetException();
                  }
               }

               var72 = this;
            }

            Registry.packArgs(var72);
            long var16 = 219945543022327308L;
            Ref.h2(219945543022327308L, var16);

            try {
               ;
            } catch (InvocationTargetException var61) {
               throw var61.getTargetException();
            }
         }

         var69 = this;
         Object var18 = 334241381080505095L;
         Ref.g(334241381080505095L, var18);
         var73 = Registry.packArgs(this);
         long var21 = 364865744023011111L;
         Object[] var20 = var73;
         Ref.h(364865744023011111L, var20, var21);

         try {
            ;
         } catch (InvocationTargetException var60) {
            throw var60.getTargetException();
         }

         Registry.lookupField(546619646805113494L).getBoolean(this);
      }

      ClearListDialog var80;
      label146: {
         label147: {
            label148: {
               label134: {
                  label149: {
                     if (this == null) {
                        if (var69 == null) {
                           if (this == null) {
                              Object var22 = 618427502576624312L;
                              if (((Tq4)Ref.g(618427502576624312L, var22)).getRowCount() > 0) {
                                 Object var24 = 474737747013503076L;
                                 Ws2 var74 = (Ws2)Ref.g(474737747013503076L, var24);
                                 Object var26 = 600294071160604016L;
                                 JScrollPane var10006 = (JScrollPane)Ref.g(600294071160604016L, var26);
                                 Object var28 = 621802534541065536L;
                                 var10006.add(this, (String)Ref.g(621802534541065536L, var28), 0);
                                 if (this == null) {
                                    break label148;
                                 }
                              }
                           }

                           Object var30 = 474737747013503076L;
                           Ws2 var10003 = (Ws2)Ref.g(474737747013503076L, var30);
                           Object var32 = 600294071160604016L;
                           this.remove((JScrollPane)Ref.g(600294071160604016L, var32));
                           if (this == null) {
                              break label148;
                           }
                        }

                        var69 = this;
                        if (this != null) {
                           break label149;
                        }

                        Object var34 = 627738372728753803L;
                        Ref.g(627738372728753803L, var34);
                        Object[] var75 = Registry.emptyArgs();
                        long var37 = 253718301466496149L;
                        Object[] var36 = var75;
                        var75 = Ref.h(253718301466496149L, var36, var37);

                        try {
                        } catch (InvocationTargetException var59) {
                           throw var59.getTargetException();
                        }
                     }

                     if (var69 > 0) {
                        Object var38 = 474737747013503076L;
                        Ws2 var70 = (Ws2)Ref.g(474737747013503076L, var38);
                        Object var40 = 123884418036416875L;
                        JScrollPane var77 = (JScrollPane)Ref.g(123884418036416875L, var40);
                        Object var42 = 621802534541065536L;
                        var77.add(this, (String)Ref.g(621802534541065536L, var42), 0);
                        if (this == null) {
                           break label134;
                        }
                     }
                  }

                  Object var44 = 474737747013503076L;
                  Ws2 var71 = (Ws2)Ref.g(474737747013503076L, var44);
                  Object var46 = 123884418036416875L;
                  this.remove((JScrollPane)Ref.g(123884418036416875L, var46));
               }

               Object var48 = 265132846717086219L;
               Registry.packArgs(((Dv2)Ref.g(265132846717086219L, var48)).getText());
               long var50 = 330094358428833085L;
               var80 = (ClearListDialog)Ref.h2(330094358428833085L, var50);

               try {
                  var79 = (Boolean)var80;
               } catch (InvocationTargetException var58) {
                  throw var58.getTargetException();
               }

               if (this != null) {
                  break label147;
               }

               if (var79) {
                  Object var52 = 369475678680292668L;
                  ((JXList)Ref.g(369475678680292668L, var52)).clearSelection();
               }
            }

            this.validate();
            this.doLayout();
            var80 = this;
            if (this != null) {
               break label146;
            }

            var79 = Registry.lookupField(410723057057853227L).getBoolean(this);
         }

         if (!var79) {
            Object var54 = 265132846717086219L;
            ((Dv2)Ref.g(265132846717086219L, var54)).setText("");
         }

         var80 = this;
      }

      Registry.lookupField(410723057057853227L).setBoolean(var80, false);
      Rectangle var3 = new Rectangle();
      Object var56 = 369475678680292668L;
      ((JXList)Ref.g(369475678680292668L, var56)).scrollRectToVisible(var3);
   }

   @Override
   public void setVisible(boolean var1) {
      super.setVisible(var1);
   }

   public void t$void() {
      int var27;
      i$arrString();
      Object var4 = 618427502576624312L;
      int var2 = ((Tq4)Ref.g(618427502576624312L, var4)).getRowCount() - 1;
      Object var10002 = Registry.emptyArgs();
      long var7 = 257476172962055898L;
      Object var6 = var10002;
      var10002 = Ref.h(257476172962055898L, var6, var7);

      try {
         var27 = ((Boolean)var10002) ? 1 : 0;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      if (this == null) {
         if (var27 == 0) {
            if (var2 > -1) {
               Object var8 = 618427502576624312L;
               Ref.g(618427502576624312L, var8);
               Rectangle var10005;
               Object var10 = 618427502576624312L;
               // [VF-super] super(((Tq4)Ref.g(618427502576624312L, var10)).getCellRect(var2, 0, true));
               Object[] var28 = Registry.packArgs(var10005);
               long var13 = 393507447655466815L;
               Object[] var12 = var28;
               Ref.h(393507447655466815L, var12, var13);

               try {
                  ;
               } catch (InvocationTargetException var23) {
                  throw var23.getTargetException();
               }
            }

            Object var14 = 600294071160604016L;
            JScrollBar var3 = ((JScrollPane)Ref.g(600294071160604016L, var14)).getVerticalScrollBar();
            var3.setValue(var3.getMaximum());
            if (this == null) {
               return;
            }
         }

         var27 = var2;
      }

      if (var27 > -1) {
         Object var16 = 618427502576624312L;
         Ref.g(618427502576624312L, var16);
         Object[] var10004 = Registry.packArgs(new Rectangle(0, 0));
         long var19 = 393507447655466815L;
         Object[] var18 = var10004;
         Ref.h(393507447655466815L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }
      }

      Object var20 = 600294071160604016L;
      JScrollBar var25 = ((JScrollPane)Ref.g(600294071160604016L, var20)).getVerticalScrollBar();
      var25.setValue(0);
   }

   public void o$void() {
      SwingUtilities.invokeLater(new V0(this));
   }

   public void q() {
      String[] var10000 = i$arrString();
      Registry.lookupField(297692429440577111L).setBoolean(this, false);
      String[] var1 = var10000;
      if (var1 == null && this.isVisible()) {
         SwingUtilities.invokeLater(new O9(this));
         Registry.lookupField(132980032346783161L).setBoolean(this, false);
      }

      Object var2 = 334241381080505095L;
      Ref.g(334241381080505095L, var2);
      Object[] var10002 = Registry.packArgs(null);
      long var5 = 364865744023011111L;
      Object[] var4 = var10002;
      Ref.h(364865744023011111L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void b(KeyEvent var1, byte[] var2) {
      Object var4 = 556898288735746988L;
      ConnectHost var3 = ((ConnectionProperty)Ref.g(556898288735746988L, var4)).s$Fv_2().e();
      if (var3.t$boolean()) {
         Object var6 = 556898288735746988L;
         ((ConnectionProperty)Ref.g(556898288735746988L, var6)).O$pA_3().processKeyEvent(var1);
      }
   }

   public void N() {
      boolean var138;
      Object[] var26;
      long var27;
      Object var52;
      US3 var68;
      long var79;
      String[] var1 = i$arrString();
      Registry.emptyArgs();
      long var6 = 454647487873911743L;
      Object var10001 = Ref.h2(454647487873911743L, var6);

      try {
         var138 = (Boolean)var10001;
      } catch (InvocationTargetException var137) {
         throw var137.getTargetException();
      }

      if (var138) {
      }

      Ws2 var10002 = new Ws2();
      long var9 = 474737747013503076L;
      Ws2 var8 = var10002;
      Ref.s(474737747013503076L, var8, var9);
      Object var10 = 474737747013503076L;
      ((Ws2)Ref.g(474737747013503076L, var10)).setLayout(new MigLayout(a(16025, -9666), a(16028, -8861), a(16021, -5547)));
      Object var12 = 474737747013503076L;
      this.setContentPane((Ws2)Ref.g(474737747013503076L, var12));
      Object var14 = 474737747013503076L;
      ((Ws2)Ref.g(474737747013503076L, var14))
         .setBorder(BorderFactory.createLineBorder(new Color(a(27725, 8010486425011491944L), a(19523, 7945128525104854120L), a(19523, 7945128525104854120L))));
      FT var10006 = new FT();
      long var17 = 598800499692003827L;
      FT var16 = var10006;
      Ref.s(598800499692003827L, var16, var17);
      Tq4 var10008;
      Object var18 = 598800499692003827L;
      // [VF-super] super((FT)Ref.g(598800499692003827L, var18), Registry.lookupField(261823546936210785L).getBoolean(this));
      long var21 = 618427502576624312L;
      Tq4 var20 = var10008;
      Ref.s(618427502576624312L, var20, var21);
      Object var22 = 618427502576624312L;
      ((Tq4)Ref.g(618427502576624312L, var22)).setOpaque(false);
      Object var24 = 618427502576624312L;
      Ref.g(618427502576624312L, var24);
      Object[] var10011 = Registry.packArgs(this);
      var27 = 338047925324190448L;
      var26 = var10011;
      Ref.h(338047925324190448L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var136) {
         throw var136.getTargetException();
      }

      Fg4 var10012 = new Fg4();
      long var29 = 308394982418497131L;
      Fg4 var28 = var10012;
      Ref.s(308394982418497131L, var28, var29);
      Object var30 = 308394982418497131L;
      Ref.g(308394982418497131L, var30);
      Object[] var10014 = Registry.packArgs(true);
      long var33 = 121078351063561365L;
      Object[] var32 = var10014;
      Ref.h(121078351063561365L, var32, var33);

      try {
         ;
      } catch (InvocationTargetException var135) {
         throw var135.getTargetException();
      }

      Object var34 = 618427502576624312L;
      Tq4 var10015 = (Tq4)Ref.g(618427502576624312L, var34);
      Object var36 = 308394982418497131L;
      Object.class.setDefaultRenderer(this, (Fg4)Ref.g(308394982418497131L, var36));
      Object var38 = 618427502576624312L;
      ((Tq4)Ref.g(618427502576624312L, var38)).addMouseListener(new Lk4(this));
      Object var40 = 618427502576624312L;
      ((Tq4)Ref.g(618427502576624312L, var40)).getSelectionModel().addListSelectionListener(new GW(this));
      OG3 var2 = new OG3();
      Object var42 = 618427502576624312L;
      Ref.g(618427502576624312L, var42);
      Object var44 = 618427502576624312L;
      Object var10022 = Ref.g(618427502576624312L, var44);
      Object[] var10023 = Registry.emptyArgs();
      long var47 = 539631679650915390L;
      Object[] var46 = var10023;
      var10022 = Registry.packArgs(var10022, Ref.h(539631679650915390L, var46, var47));
      long var49 = 463398634651825457L;
      Object[] var48 = (Object[])var10022;
      Ref.h(463398634651825457L, var48, var49);

      try {
         ;
      } catch (InvocationTargetException var134) {
         throw var134.getTargetException();
      }

      Registry.packArgs(var2);
      long var50 = 232192692863267216L;
      Object var10024 = Ref.h2(232192692863267216L, var50);
      long var53 = 600294071160604016L;
      var52 = var10024;
      Ref.s(600294071160604016L, var52, var53);
      Object var54 = 600294071160604016L;
      ((JScrollPane)Ref.g(600294071160604016L, var54)).setOpaque(false);
      Object var56 = 600294071160604016L;
      ((JScrollPane)Ref.g(600294071160604016L, var56)).getViewport().setOpaque(false);
      Object var58 = 600294071160604016L;
      ((JScrollPane)Ref.g(600294071160604016L, var58)).setAutoscrolls(true);
      JXList var10028 = new JXList();
      long var61 = 369475678680292668L;
      JXList var60 = var10028;
      Ref.s(369475678680292668L, var60, var61);
      Object var62 = 369475678680292668L;
      ((JXList)Ref.g(369475678680292668L, var62)).setFocusable(false);
      Object var64 = 369475678680292668L;
      ((JXList)Ref.g(369475678680292668L, var64)).setSelectionMode(0);
      Object var66 = 369475678680292668L;
      ((JXList)Ref.g(369475678680292668L, var66)).addComponentListener(new UF(this));
      US3 var10032 = new US3();
      long var69 = 390003399451338430L;
      var68 = var10032;
      Ref.s(390003399451338430L, var68, var69);
      Object var70 = 369475678680292668L;
      JXList var10033 = (JXList)Ref.g(369475678680292668L, var70);
      Object var72 = 390003399451338430L;
      this.setCellRenderer((US3)Ref.g(390003399451338430L, var72));
      Object var74 = 369475678680292668L;
      ((JXList)Ref.g(369475678680292668L, var74)).setAutoscrolls(true);
      Object var76 = 369475678680292668L;
      ((JXList)Ref.g(369475678680292668L, var76)).setLayoutOrientation(1);
      Du2 var10037 = new Du2();
      var79 = 627738372728753803L;
      Du2 var78 = var10037;
      Ref.s(627738372728753803L, var78, var79);
      Object var80 = 369475678680292668L;
      JXList var10038 = (JXList)Ref.g(369475678680292668L, var80);
      Object var82 = 627738372728753803L;
      this.setModel((Du2)Ref.g(627738372728753803L, var82));
      Object var84 = 627738372728753803L;
      Ref.g(627738372728753803L, var84);
      Object[] var10041 = Registry.packArgs(new L1(a(16030, 22656), a(16029, 18042)));
      long var87 = 515455312059915564L;
      Object[] var86 = var10041;
      Ref.h(515455312059915564L, var86, var87);

      try {
         ;
      } catch (InvocationTargetException var133) {
         throw var133.getTargetException();
      }

      label97: {
         QH var10042 = new QH(this);
         long var89 = 607406499593010576L;
         QH var88 = var10042;
         Ref.s(607406499593010576L, var88, var89);
         Object var90 = 369475678680292668L;
         ((JXList)Ref.g(369475678680292668L, var90)).addMouseListener(new A8(this));
         Object var92 = 369475678680292668L;
         JXList var10044 = (JXList)Ref.g(369475678680292668L, var92);
         Object var94 = 607406499593010576L;
         this.addMouseListener((MouseListener)Ref.g(607406499593010576L, var94));
         Object var96 = 369475678680292668L;
         Registry.packArgs(Ref.g(369475678680292668L, var96));
         long var98 = 446320839558189071L;
         Object var10048 = Ref.h2(446320839558189071L, var98);
         long var101 = 123884418036416875L;
         Object var100 = var10048;
         Ref.s(123884418036416875L, var100, var101);
         Object var102 = 123884418036416875L;
         ((JScrollPane)Ref.g(123884418036416875L, var102)).setOpaque(false);
         Object var104 = 123884418036416875L;
         ((JScrollPane)Ref.g(123884418036416875L, var104)).getViewport().setOpaque(false);
         Object var106 = 123884418036416875L;
         ((JScrollPane)Ref.g(123884418036416875L, var106)).setAutoscrolls(true);
         Object var108 = 123884418036416875L;
         ((JScrollPane)Ref.g(123884418036416875L, var108)).getVerticalScrollBar().addAdjustmentListener(new N22(this, var2));
         JPanel var10053 = new JPanel();
         long var111 = 529887570589696401L;
         JPanel var110 = var10053;
         Ref.s(529887570589696401L, var110, var111);
         Object var112 = 529887570589696401L;
         ((JPanel)Ref.g(529887570589696401L, var112)).setLayout(new MigLayout(a(16003, 26023), a(16024, -31418), a(16022, 22913)));
         Object var114 = 474737747013503076L;
         Ws2 var10055 = (Ws2)Ref.g(474737747013503076L, var114);
         Object var116 = 529887570589696401L;
         this.add((JPanel)Ref.g(529887570589696401L, var116), a(16023, 5504));
         JPanel var3 = new JPanel();
         var3.setLayout(new MigLayout(a(16005, -8978), a(16006, 13141), a(16016, 29455)));
         JButton var4 = new JButton(a(16027, 26779));
         boolean var10056 = Registry.lookupField(261823546936210785L).getBoolean(this);
         if (var1 == null) {
            if (var10056) {
               Object var118 = 529887570589696401L;
               JPanel var10057 = (JPanel)Ref.g(529887570589696401L, var118);
               if (var1 == null) {
                  var10057.add(var3, a(16002, 9238));
                  if (Registry.lookupField(177310480747231389L).getBoolean(this)) {
                     JLabel var5 = new JLabel(a(16001, -10314));
                     var5.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                     var3.add(var5);
                  }

                  var10057 = var3;
               }

               var10057.add(var4, a(16017, -27024));
            }

            var4.addActionListener(new ConfirmClearHistoryListener(this));
            var3.add(new JLabel(), a(16019, 17404));
            if (var1 != null) {
               break label97;
            }

            var10056 = Registry.lookupField(355644003217252401L).getBoolean(this);
         }

         if (var10056) {
            Object var120 = 529887570589696401L;
            JPanel var140 = (JPanel)Ref.g(529887570589696401L, var120);
            Object var122 = 265132846717086219L;
            this.add((Dv2)Ref.g(265132846717086219L, var122), a(16000, -18337));
         }

         Object[] var141 = Registry.emptyArgs();
         long var125 = 306221011327708335L;
         Object[] var124 = var141;
         Ref.h(306221011327708335L, var124, var125);

         try {
            ;
         } catch (InvocationTargetException var132) {
            throw var132.getTargetException();
         }

         Object var126 = 334241381080505095L;
         ((Dv2)Ref.g(334241381080505095L, var126)).setFocusTraversalKeys(0, Collections.EMPTY_SET);
         Object var128 = 265132846717086219L;
         ((Dv2)Ref.g(265132846717086219L, var128)).getDocument().addDocumentListener(new Xa2(this));
      }

      KT3 var10060 = new KT3(this);
      long var131 = 409176125101239658L;
      KT3 var130 = var10060;
      Ref.s(409176125101239658L, var130, var131);
      if (var1 != null) {
         Ky4.K(new String[4]);
      }
   }

   @Override
   public void c(L1 var1, int var2) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 169866344859432552L;
      Object[] var3 = var10001;
      Ref.h(169866344859432552L, var3, var4);
      Object[] var10002 = Registry.packArgs(var1);
      long var6 = 190233821466993016L;
      Object[] var5 = var10002;
      Ref.h(190233821466993016L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Object[] var10003 = Registry.packArgs(var1, var2);
      long var8 = 426482273676708268L;
      Object[] var7 = var10003;
      Ref.h(426482273676708268L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void D() {
      Toolkit.getDefaultToolkit();
      Object var1 = 409176125101239658L;
      this.removeAWTEventListener((AWTEventListener)Ref.g(409176125101239658L, var1));
      Object[] var10002 = Registry.packArgs(false);
      long var4 = 238155532020070409L;
      Object[] var3 = var10002;
      Ref.h(238155532020070409L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      this.dispose();
   }

   public void C() {
      String[] var1 = i$arrString();
      ClearListDialog var10000 = this.isVisible();
      if (var1 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = this;
         Object[] var10001 = Registry.emptyArgs();
         long var3 = 496821856781947383L;
         Object[] var2 = var10001;
         Ref.h(496821856781947383L, var2, var3);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         Object var4 = 618427502576624312L;
         ((Tq4)Ref.g(618427502576624312L, var4)).getSelectedRow();
      }

      if (var10000 > -1) {
      }

      Registry.lookupField(373160888351879443L).setBoolean(this, false);
   }

   public int b(String var1, ArrayList var2) {
      ArrayList var4 = new ArrayList();
      i$arrString();
      Object var15 = 516041024875871057L;
      Pattern var5 = Pattern.compile((String)Ref.g(516041024875871057L, var15));
      ClearListDialog var3 = this;
      Matcher var6 = var5.matcher(var1);

      byte var10001;
      while (true) {
         if (var6.find()) {
            String var7 = var6.group();
            var10001 = (byte)((var4.add(var7)) ? 1 : 0);
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         var10001 = 0;
         break;
      }

      int var17 = var10001;
      HashSet var8 = new HashSet();
      HashSet var9 = new HashSet();
      Iterator var10 = var2.iterator();

      while (true) {
         if (var10.hasNext()) {
            String var11 = (String)var10.next();
            boolean var12 = false;
            var10001 = (byte)((var8.contains(var11)) ? 1 : 0);
            if (var3 != null) {
               break;
            }

            if (var10001 == 0) {
               Iterator var13 = var4.iterator();

               while (true) {
                  label52:
                  if (var13.hasNext()) {
                     String var14 = (String)var13.next();
                     boolean var20 = var14.contains(var11);
                     if (var3 != null) {
                        break;
                     }

                     label77: {
                        if (var3 == null) {
                           if (!var20) {
                              break label77;
                           }

                           var12 = true;
                           var20 = var9.contains(var14);
                        }

                        if (var3 == null) {
                           if (var20) {
                              break label77;
                           }

                           var17++;
                           var9.add(var14);
                        }

                        if (var3 == null) {
                           break label52;
                        }
                     }

                     if (var3 == null) {
                        continue;
                     }
                  }

                  var8.add(var11);
                  break;
               }
            }

            if (var3 == null) {
               continue;
            }
         }

         var10001 = (byte)(var17);
         break;
      }

      return var10001;
   }

   public void u$void() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public synchronized void Z() {
      boolean var143;
      Integer var153;
      Integer var161;
      Object[] var27;
      Object[] var43;
      long var52;
      Object[] var63;
      long var64;
      Object[] var65;
      long var66;
      long var68;
      Object[] var73;
      Object var15 = 598800499692003827L;
      Ref.g(598800499692003827L, var15);
      Object[] var10002 = Registry.emptyArgs();
      long var18 = 447348905967678196L;
      Object[] var17 = var10002;
      Ref.h(447348905967678196L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var106) {
         throw var106.getTargetException();
      }

      Dx4_2 var10003 = (Dx4_2)(Registry.emptyArgs());
      long var20 = 169866344859432552L;
      Object var19 = var10003;
      var10003 = Ref.h(169866344859432552L, var19, var20);

      try {
         var10003 = (Dx4_2)var10003;
      } catch (InvocationTargetException var105) {
         throw var105.getTargetException();
      }

      Dx4_2 var2 = var10003;
      i$arrString();
      String var10005 = Registry.emptyArgs();
      long var22 = 596400151700218172L;
      Object var21 = var10005;
      var10005 = Ref.h(596400151700218172L, var21, var22);

      try {
         var10005 = (ArrayList)var10005;
      } catch (InvocationTargetException var104) {
         throw var104.getTargetException();
      }

      ArrayList var3 = var10005;
      Dx4_2 var1 = var2;
      var10005 = Registry.emptyArgs();
      long var24 = 190716474264794564L;
      Object var23 = var10005;
      var10005 = Ref.h(190716474264794564L, var23, var24);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var103) {
         throw var103.getTargetException();
      }

      String var4 = var10005.toLowerCase();
      if (!Registry.lookupField(475628264768682265L).getBoolean(this)) {
         var4 = "";
      }

      ArrayList var5 = new ArrayList();
      Object var25 = 516041024875871057L;
      Pattern var6 = Pattern.compile((String)Ref.g(516041024875871057L, var25));
      Matcher var7 = var6.matcher(var4);

      String var8;
      while (true) {
         if (var7.find()) {
            var8 = var7.group();
            var5.add(var8);
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         var8 = var4;
         break;
      }

      int var9 = var4.indexOf(" ");
      if (var9 > -1) {
         var8 = var4.substring(0, var9);
      }

      new HashSet();
      Iterator var11 = var3.iterator();

      Object var10006;
      while (true) {
         if (var11.hasNext()) {
            L1 var12 = (L1)var11.next();
            var10006 = this;
            String var10008 = (String)(Registry.emptyArgs());
            long var28 = 542058094445767607L;
            var27 = var10008;
            var10008 = Ref.h(542058094445767607L, var27, var28);

            try {
               var10008 = (String)var10008;
            } catch (InvocationTargetException var101) {
               throw var101.getTargetException();
            }

            var10008 = Registry.packArgs(var10008.toLowerCase(), var5);
            long var30 = 550295940758831919L;
            Object var29 = var10008;
            var10008 = Ref.h(550295940758831919L, var29, var30);

            try {
               var136 = (Integer)var10008;
            } catch (InvocationTargetException var100) {
               throw var100.getTargetException();
            }

            int var13 = var136;
            if (var1 != null) {
               break;
            }

            Object[] var10009 = Registry.packArgs(var13);
            long var32 = 610207701387135922L;
            Object[] var31 = var10009;
            Ref.h(610207701387135922L, var31, var32);

            try {
               ;
            } catch (InvocationTargetException var102) {
               throw var102.getTargetException();
            }

            if (var1 == null) {
               continue;
            }
         }

         var10006 = var3.clone();
         break;
      }

      ArrayList var107 = (ArrayList)var10006;
      Object[] var10007 = Registry.packArgs(var107);
      long var34 = 157266429831448835L;
      Object[] var33 = var10007;
      Ref.h(157266429831448835L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var99) {
         throw var99.getTargetException();
      }

      ArrayList var110 = new ArrayList();
      Iterator var115 = var107.iterator();

      label487: {
         while (true) {
            if (var115.hasNext()) {
               L1 var14 = (L1)var115.next();
               var10007 = var14;
               String var137 = (String)(Registry.emptyArgs());
               long var36 = 542058094445767607L;
               Object var35 = var137;
               var137 = Ref.h(542058094445767607L, var35, var36);

               try {
                  var137 = (String)var137;
               } catch (InvocationTargetException var98) {
                  throw var98.getTargetException();
               }

               boolean var140 = var137.toLowerCase().startsWith(var8);
               if (var1 != null) {
                  break;
               }

               if (var140) {
                  var110.add(0, var14);
               }

               if (var1 == null) {
                  continue;
               }
            }

            var115 = var110.iterator();
            var10007 = var115.hasNext();
            break;
         }

         while (var10007 == null) {
            L1 var119 = (L1)var115.next();
            var107.remove(var119);
            var107.add(0, var119);
            if (var1 != null) {
               break label487;
            }

            if (var1 != null) {
               break;
            }

            var10007 = var115.hasNext();
         }

         var3 = var107;
      }

      var10007 = var4.equals("");
      if (var1 == null) {
         var10007 = var10007 == null ? 1 : 0;
      }

      Object var10 = var10007;
      if (var1 == null) {
         Object var141 = Registry.emptyArgs();
         long var38 = 257476172962055898L;
         Object var37 = var141;
         var141 = Ref.h(257476172962055898L, var37, var38);

         try {
            var143 = (Boolean)var141;
         } catch (InvocationTargetException var97) {
            throw var97.getTargetException();
         }

         label426:
         if (var143) {
            ArrayList var108 = new ArrayList();
            int var111 = 0;

            while (var111 < var3.size()) {
               var108.add((L1)var3.get(var3.size() - 1 - var111));
               var111++;
               if (var1 != null) {
                  break label426;
               }

               if (var1 != null) {
                  break;
               }
            }

            var3 = var108;
         }
      }

      Dx4_2 var144 = (Dx4_2)(Registry.emptyArgs());
      long var40 = 424827586848941194L;
      Object var39 = var144;
      var144 = Ref.h(424827586848941194L, var39, var40);

      try {
         var144 = (Dx4_2)var144;
      } catch (InvocationTargetException var96) {
         throw var96.getTargetException();
      }

      Dx4_2 var109 = var144;
      if (var1 != null || var109 != null) {
         ArrayList var147 = (ArrayList)(Registry.emptyArgs());
         long var42 = 596400151700218172L;
         Object var41 = var147;
         var147 = Ref.h(596400151700218172L, var41, var42);

         try {
            var147 = (ArrayList)var147;
         } catch (InvocationTargetException var95) {
            throw var95.getTargetException();
         }

         for (L1 var120 : var147) {
            var3.add(0, var120);
            if (var1 != null) {
               break;
            }
         }
      }

      int var113 = 0;

      Object var150;
      while (true) {
         if (var113 < var3.size()) {
            L1 var117 = (L1)var3.get(var3.size() - var113 - 1);
            Object var121 = true;
            var150 = var10;
            if (var1 != null) {
               break;
            }

            label402:
            if (var1 == null) {
               if (var10 != null) {
                  var150 = Registry.lookupField(614822648460925381L).getBoolean(this);
                  if (var1 != null) {
                     break label402;
                  }

                  if (var150 == null) {
                     var150 = var117;
                     Object var10010 = Registry.emptyArgs();
                     long var44 = 608348398594129275L;
                     var43 = var10010;
                     var10010 = Ref.h(608348398594129275L, var43, var44);

                     try {
                        var153 = (Integer)var10010;
                     } catch (InvocationTargetException var94) {
                        throw var94.getTargetException();
                     }

                     if (var1 != null) {
                        break label402;
                     }

                     if (var153 == 0) {
                        var121 = false;
                     }
                  }
               }

               var150 = Registry.lookupField(405381908665807611L).getBoolean(this);
            }

            label521: {
               label389: {
                  if (var1 == null) {
                     if (var150 == null) {
                        break label389;
                     }

                     var150 = var117;
                     if (var1 != null) {
                        break label389;
                     }

                     Object[] var154 = Registry.emptyArgs();
                     long var46 = 608348398594129275L;
                     Object[] var45 = var154;
                     var154 = Ref.h(608348398594129275L, var45, var46);

                     try {
                     } catch (InvocationTargetException var93) {
                        throw var93.getTargetException();
                     }
                  }

                  if (var150 > 0) {
                     Object[] var156 = Registry.packArgs(true);
                     long var48 = 399154179604294703L;
                     Object[] var47 = var156;
                     Ref.h(399154179604294703L, var47, var48);

                     try {
                        ;
                     } catch (InvocationTargetException var92) {
                        throw var92.getTargetException();
                     }

                     if (var1 == null) {
                        break label521;
                     }
                  }
               }

               Object[] var157 = Registry.packArgs(false);
               long var50 = 399154179604294703L;
               Object[] var49 = var157;
               Ref.h(399154179604294703L, var49, var50);

               try {
                  ;
               } catch (InvocationTargetException var91) {
                  throw var91.getTargetException();
               }
            }

            label501: {
               ClearListDialog var158 = (ClearListDialog)var121;
               if (var1 == null) {
                  if (var121 == null) {
                     break label501;
                  }

                  var158 = this;
                  Object[] var10011 = Registry.packArgs(var117);
                  var52 = 118404628279258671L;
                  Object[] var51 = var10011;
                  var10011 = Ref.h(118404628279258671L, var51, var52);

                  try {
                  } catch (InvocationTargetException var90) {
                     throw var90.getTargetException();
                  }
               }

               label503: {
                  if (var1 == null) {
                     if (var158 == null) {
                        break label501;
                     }

                     if (var1 != null) {
                        break label503;
                     }

                     var158 = (ClearListDialog)(Registry.lookupField(546619646805113494L).getBoolean(this));
                  }

                  if (var158 == null) {
                     break label501;
                  }
               }

               Object var53 = 598800499692003827L;
               Ref.g(598800499692003827L, var53);
               Object[] var10012 = Registry.packArgs(var117);
               long var56 = 333124989248955376L;
               Object[] var55 = var10012;
               Ref.h(333124989248955376L, var55, var56);

               try {
                  ;
               } catch (InvocationTargetException var89) {
                  throw var89.getTargetException();
               }
            }

            var113++;
            if (var1 == null) {
               continue;
            }
         }

         var150 = Registry.lookupField(546619646805113494L).getBoolean(this);
         break;
      }

      if (var1 == null) {
         if (var150 == null) {
            return;
         }

         var150 = this;
         Object var57 = 627738372728753803L;
         Ref.g(627738372728753803L, var57);
         Object[] var168 = Registry.emptyArgs();
         long var60 = 594662729979199781L;
         Object[] var59 = var168;
         Ref.h(594662729979199781L, var59, var60);

         try {
            ;
         } catch (InvocationTargetException var88) {
            throw var88.getTargetException();
         }

         boolean var169 = false;
      }

      Object var114 = var150;

      label507: {
         while (var114 < var3.size()) {
            L1 var118 = (L1)var3.get((int)var114);
            Object var122 = true;
            if (var1 != null) {
               break label507;
            }

            var150 = var10;
            label346:
            if (var1 == null) {
               if (var10 == null) {
                  var150 = Registry.lookupField(614822648460925381L).getBoolean(this);
                  if (var1 != null) {
                     break label346;
                  }

                  if (var150 == null) {
                     var150 = var118;
                     Object var159 = Registry.emptyArgs();
                     long var62 = 608348398594129275L;
                     Object var61 = var159;
                     var159 = Ref.h(608348398594129275L, var61, var62);

                     try {
                        var161 = (Integer)var159;
                     } catch (InvocationTargetException var87) {
                        throw var87.getTargetException();
                     }

                     if (var1 != null) {
                        break label346;
                     }

                     if (var161 == 0) {
                        var122 = false;
                     }
                  }
               }

               var150 = Registry.lookupField(405381908665807611L).getBoolean(this);
            }

            label522: {
               label333: {
                  if (var1 == null) {
                     if (var150 == null) {
                        break label333;
                     }

                     var150 = var118;
                     if (var1 != null) {
                        break label333;
                     }

                     Object[] var162 = Registry.emptyArgs();
                     var64 = 608348398594129275L;
                     var63 = var162;
                     var162 = Ref.h(608348398594129275L, var63, var64);

                     try {
                     } catch (InvocationTargetException var86) {
                        throw var86.getTargetException();
                     }
                  }

                  if (var150 > 0) {
                     Object[] var164 = Registry.packArgs(true);
                     var66 = 399154179604294703L;
                     var65 = var164;
                     Ref.h(399154179604294703L, var65, var66);

                     try {
                        ;
                     } catch (InvocationTargetException var85) {
                        throw var85.getTargetException();
                     }

                     if (var1 == null) {
                        break label522;
                     }
                  }
               }

               Object[] var165 = Registry.packArgs(false);
               var68 = 399154179604294703L;
               Object[] var67 = var165;
               Ref.h(399154179604294703L, var67, var68);

               try {
                  ;
               } catch (InvocationTargetException var84) {
                  throw var84.getTargetException();
               }
            }

            label513: {
               label514: {
                  ClearListDialog var166 = (ClearListDialog)var122;
                  if (var1 == null) {
                     if (var122 == null) {
                        break label513;
                     }

                     var166 = this;
                     if (var1 != null) {
                        break label514;
                     }

                     Object[] var170 = Registry.packArgs(var118);
                     long var70 = 118404628279258671L;
                     Object[] var69 = var170;
                     var170 = Ref.h(118404628279258671L, var69, var70);

                     try {
                     } catch (InvocationTargetException var83) {
                        throw var83.getTargetException();
                     }
                  }

                  if (var166 == null) {
                     break label513;
                  }
               }

               Object var71 = 627738372728753803L;
               Ref.g(627738372728753803L, var71);
               Object[] var173 = Registry.packArgs(var118);
               long var74 = 515455312059915564L;
               var73 = var173;
               Ref.h(515455312059915564L, var73, var74);

               try {
                  ;
               } catch (InvocationTargetException var82) {
                  throw var82.getTargetException();
               }
            }

            var114++;
            if (var1 != null) {
               break;
            }
         }

         Object var75 = 627738372728753803L;
         Ref.g(627738372728753803L, var75);
         Object[] var172 = Registry.emptyArgs();
         long var78 = 261272725694702287L;
         Object[] var77 = var172;
         Ref.h(261272725694702287L, var77, var78);

         try {
            ;
         } catch (InvocationTargetException var81) {
            throw var81.getTargetException();
         }
      }

      Object var79 = 369475678680292668L;
      ((JXList)Ref.g(369475678680292668L, var79)).clearSelection();
   }

   public void s(ArrayList var1) {
      Collections.sort(var1, new Cc4(this));
   }

   public void N(ArrayList var1) {
      Collections.sort(var1, new Ub4(this));
   }

   public void I(ArrayList var1, ArrayList var2) {
      String[] var10000 = i$arrString();
      int var4 = 0;
      String[] var3 = var10000;

      while (var4 < var1.size()) {
         L1 var5 = (L1)var1.get(var1.size() - var4 - 1);
         var2.add(var5);
         var4++;
         if (var3 != null) {
            break;
         }
      }
   }

   public boolean K$boolean() {
      return Registry.lookupField(546619646805113494L).getBoolean(this);
   }

   public void i(boolean var1) {
      Registry.lookupField(546619646805113494L).setBoolean(this, var1);
   }

   public Dimension f$Dimension() {
      Object var1 = 122775213065710024L;
      return (Dimension)Ref.g(122775213065710024L, var1);
   }

   public void f(Dimension var1) {
      long var3 = 122775213065710024L;
      Ref.s(122775213065710024L, var1, var3);
   }

   public boolean e() {
      return Registry.lookupField(132980032346783161L).getBoolean(this);
   }

   public void S(boolean var1) {
      Registry.lookupField(132980032346783161L).setBoolean(this, var1);
   }

   public boolean F() {
      return Registry.lookupField(373160888351879443L).getBoolean(this);
   }

   public void s(boolean var1) {
      Registry.lookupField(373160888351879443L).setBoolean(this, var1);
   }

   public String u$String() {
      Object var1 = 410025015855556821L;
      return (String)Ref.g(410025015855556821L, var1);
   }

   public void s(String var1) {
      long var3 = 410025015855556821L;
      Ref.s(410025015855556821L, var1, var3);
   }

   public boolean m() {
      return Registry.lookupField(351258023918549839L).getBoolean(this);
   }

   public void k(boolean var1) {
      Registry.lookupField(351258023918549839L).setBoolean(this, var1);
   }

   public Tq4 R$tq_4() {
      Object var1 = 618427502576624312L;
      return (Tq4)Ref.g(618427502576624312L, var1);
   }

   public void u(Tq4 var1) {
      long var3 = 618427502576624312L;
      Ref.s(618427502576624312L, var1, var3);
   }

   public boolean R$boolean() {
      return Registry.lookupField(297692429440577111L).getBoolean(this);
   }

   public boolean x() {
      return Registry.lookupField(617402198595332969L).getBoolean(this);
   }

   public void R(boolean var1) {
      Registry.lookupField(617402198595332969L).setBoolean(this, var1);
   }

   public boolean y() {
      return Registry.lookupField(162130310027014887L).getBoolean(this);
   }

   public void G(boolean var1) {
      Registry.lookupField(162130310027014887L).setBoolean(this, var1);
   }

   public boolean o$boolean() {
      return Registry.lookupField(475628264768682265L).getBoolean(this);
   }

   public void K(boolean var1) {
      Registry.lookupField(475628264768682265L).setBoolean(this, var1);
   }

   public boolean w() {
      return Registry.lookupField(187877731600446636L).getBoolean(this);
   }

   public void A(boolean var1) {
      Registry.lookupField(187877731600446636L).setBoolean(this, var1);
   }

   public long a() {
      return Registry.lookupField(447109474318907086L).getLong(this);
   }

   public void A(long var1) {
      Registry.lookupField(447109474318907086L).setLong(this, var1);
   }

   public boolean T() {
      return Registry.lookupField(355644003217252401L).getBoolean(this);
   }

   public Backspace f$F_() {
      Object var1 = 290899220595287832L;
      return (Backspace)Ref.g(290899220595287832L, var1);
   }

   public void F(Backspace var1) {
      long var3 = 290899220595287832L;
      Ref.s(290899220595287832L, var1, var3);
   }

   public boolean t$boolean() {
      return Registry.lookupField(405381908665807611L).getBoolean(this);
   }

   public void Y(boolean var1) {
      Registry.lookupField(405381908665807611L).setBoolean(this, var1);
   }

   public boolean g() {
      return Registry.lookupField(614822648460925381L).getBoolean(this);
   }

   public void z(boolean var1) {
      Registry.lookupField(614822648460925381L).setBoolean(this, var1);
   }

   public boolean i$boolean() {
      return Registry.lookupField(208862359481951532L).getBoolean(this);
   }

   public void f(boolean var1) {
      Registry.lookupField(208862359481951532L).setBoolean(this, var1);
   }

   public Dv2 r$Dv_2() {
      Object var1 = 334241381080505095L;
      return (Dv2)Ref.g(334241381080505095L, var1);
   }

   public void Y(Dv2 var1) {
      long var3 = 334241381080505095L;
      Ref.s(334241381080505095L, var1, var3);
   }

   public boolean L() {
      return Registry.lookupField(433591404553967252L).getBoolean(this);
   }

   public void t(boolean var1) {
      Registry.lookupField(433591404553967252L).setBoolean(this, var1);
   }

   public boolean r$boolean() {
      return Registry.lookupField(320099007409396099L).getBoolean(this);
   }

   public void e(boolean var1) {
      Registry.lookupField(320099007409396099L).setBoolean(this, var1);
   }

   public boolean f$boolean() {
      return Registry.lookupField(261823546936210785L).getBoolean(this);
   }

   public void y(boolean var1) {
      Registry.lookupField(261823546936210785L).setBoolean(this, var1);
   }

   public JButton j() {
      Object var1 = 376708942717725433L;
      return (KD)Ref.g(376708942717725433L, var1);
   }

   public void Z(KD var1) {
      long var3 = 376708942717725433L;
      Ref.s(376708942717725433L, var1, var3);
   }

   public JPanel H() {
      Object var1 = 529887570589696401L;
      return (JPanel)Ref.g(529887570589696401L, var1);
   }

   public void h() {
      long var26;
      long var2 = 598800499692003827L;
      Object var1 = null;
      Ref.s(598800499692003827L, var1, var2);
      long var4 = 618427502576624312L;
      Object var3 = null;
      Ref.s(618427502576624312L, var3, var4);
      long var6 = 600294071160604016L;
      Object var5 = null;
      Ref.s(600294071160604016L, var5, var6);
      long var8 = 123884418036416875L;
      Object var7 = null;
      Ref.s(123884418036416875L, var7, var8);
      long var10 = 621802534541065536L;
      Object var9 = null;
      Ref.s(621802534541065536L, var9, var10);
      long var12 = 516041024875871057L;
      Object var11 = null;
      Ref.s(516041024875871057L, var11, var12);
      long var14 = 122775213065710024L;
      Object var13 = null;
      Ref.s(122775213065710024L, var13, var14);
      long var16 = 556898288735746988L;
      Object var15 = null;
      Ref.s(556898288735746988L, var15, var16);
      long var18 = 410025015855556821L;
      Object var17 = null;
      Ref.s(410025015855556821L, var17, var18);
      long var20 = 334241381080505095L;
      Object var19 = null;
      Ref.s(334241381080505095L, var19, var20);
      long var22 = 265132846717086219L;
      Object var21 = null;
      Ref.s(265132846717086219L, var21, var22);
      long var24 = 282658375549611139L;
      Object var23 = null;
      Ref.s(282658375549611139L, var23, var24);
      var26 = 290899220595287832L;
      Object var25 = null;
      Ref.s(290899220595287832L, var25, var26);
      long var28 = 201109810837008677L;
      Object var27 = null;
      Ref.s(201109810837008677L, var27, var28);
      long var30 = 474737747013503076L;
      Object var29 = null;
      Ref.s(474737747013503076L, var29, var30);
      long var32 = 323217727522760645L;
      Object var31 = null;
      Ref.s(323217727522760645L, var31, var32);
      long var34 = 529887570589696401L;
      Object var33 = null;
      Ref.s(529887570589696401L, var33, var34);
      long var36 = 376708942717725433L;
      Object var35 = null;
      Ref.s(376708942717725433L, var35, var36);
      long var38 = 627738372728753803L;
      Object var37 = null;
      Ref.s(627738372728753803L, var37, var38);
      long var40 = 369475678680292668L;
      Object var39 = null;
      Ref.s(369475678680292668L, var39, var40);
      long var42 = 390003399451338430L;
      Object var41 = null;
      Ref.s(390003399451338430L, var41, var42);
      long var44 = 308394982418497131L;
      Object var43 = null;
      Ref.s(308394982418497131L, var43, var44);
      long var46 = 409176125101239658L;
      Object var45 = null;
      Ref.s(409176125101239658L, var45, var46);
   }

   public void K$void() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Yw4(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static void J(String[] var0) {
      G = var0;
   }

   public static String[] i$arrString() {
      return G;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 16016) & 65535;
      if (bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 92;
               break;
            case 1:
               var10000 = 24;
               break;
            case 2:
               var10000 = 161;
               break;
            case 3:
               var10000 = 238;
               break;
            case 4:
               var10000 = 123;
               break;
            case 5:
               var10000 = 9;
               break;
            case 6:
               var10000 = 61;
               break;
            case 7:
               var10000 = 181;
               break;
            case 8:
               var10000 = 190;
               break;
            case 9:
               var10000 = 28;
               break;
            case 10:
               var10000 = 19;
               break;
            case 11:
               var10000 = 86;
               break;
            case 12:
               var10000 = 36;
               break;
            case 13:
               var10000 = 194;
               break;
            case 14:
               var10000 = 209;
               break;
            case 15:
               var10000 = 136;
               break;
            case 16:
               var10000 = 189;
               break;
            case 17:
               var10000 = 79;
               break;
            case 18:
               var10000 = 141;
               break;
            case 19:
               var10000 = 44;
               break;
            case 20:
               var10000 = 200;
               break;
            case 21:
               var10000 = 139;
               break;
            case 22:
               var10000 = 226;
               break;
            case 23:
               var10000 = 247;
               break;
            case 24:
               var10000 = 227;
               break;
            case 25:
               var10000 = 155;
               break;
            case 26:
               var10000 = 22;
               break;
            case 27:
               var10000 = 21;
               break;
            case 28:
               var10000 = 25;
               break;
            case 29:
               var10000 = 135;
               break;
            case 30:
               var10000 = 93;
               break;
            case 31:
               var10000 = 63;
               break;
            case 32:
               var10000 = 11;
               break;
            case 33:
               var10000 = 146;
               break;
            case 34:
               var10000 = 212;
               break;
            case 35:
               var10000 = 35;
               break;
            case 36:
               var10000 = 10;
               break;
            case 37:
               var10000 = 4;
               break;
            case 38:
               var10000 = 151;
               break;
            case 39:
               var10000 = 248;
               break;
            case 40:
               var10000 = 165;
               break;
            case 41:
               var10000 = 156;
               break;
            case 42:
               var10000 = 33;
               break;
            case 43:
               var10000 = 159;
               break;
            case 44:
               var10000 = 223;
               break;
            case 45:
               var10000 = 250;
               break;
            case 46:
               var10000 = 88;
               break;
            case 47:
               var10000 = 68;
               break;
            case 48:
               var10000 = 125;
               break;
            case 49:
               var10000 = 241;
               break;
            case 50:
               var10000 = 99;
               break;
            case 51:
               var10000 = 83;
               break;
            case 52:
               var10000 = 244;
               break;
            case 53:
               var10000 = 160;
               break;
            case 54:
               var10000 = 173;
               break;
            case 55:
               var10000 = 179;
               break;
            case 56:
               var10000 = 97;
               break;
            case 57:
               var10000 = 96;
               break;
            case 58:
               var10000 = 199;
               break;
            case 59:
               var10000 = 233;
               break;
            case 60:
               var10000 = 82;
               break;
            case 61:
               var10000 = 105;
               break;
            case 62:
               var10000 = 29;
               break;
            case 63:
               var10000 = 180;
               break;
            case 64:
               var10000 = 118;
               break;
            case 65:
               var10000 = 58;
               break;
            case 66:
               var10000 = 78;
               break;
            case 67:
               var10000 = 183;
               break;
            case 68:
               var10000 = 222;
               break;
            case 69:
               var10000 = 186;
               break;
            case 70:
               var10000 = 12;
               break;
            case 71:
               var10000 = 6;
               break;
            case 72:
               var10000 = 134;
               break;
            case 73:
               var10000 = 3;
               break;
            case 74:
               var10000 = 211;
               break;
            case 75:
               var10000 = 234;
               break;
            case 76:
               var10000 = 197;
               break;
            case 77:
               var10000 = 175;
               break;
            case 78:
               var10000 = 7;
               break;
            case 79:
               var10000 = 203;
               break;
            case 80:
               var10000 = 217;
               break;
            case 81:
               var10000 = 219;
               break;
            case 82:
               var10000 = 16;
               break;
            case 83:
               var10000 = 126;
               break;
            case 84:
               var10000 = 254;
               break;
            case 85:
               var10000 = 94;
               break;
            case 86:
               var10000 = 47;
               break;
            case 87:
               var10000 = 69;
               break;
            case 88:
               var10000 = 253;
               break;
            case 89:
               var10000 = 230;
               break;
            case 90:
               var10000 = 38;
               break;
            case 91:
               var10000 = 210;
               break;
            case 92:
               var10000 = 48;
               break;
            case 93:
               var10000 = 133;
               break;
            case 94:
               var10000 = 31;
               break;
            case 95:
               var10000 = 216;
               break;
            case 96:
               var10000 = 191;
               break;
            case 97:
               var10000 = 228;
               break;
            case 98:
               var10000 = 100;
               break;
            case 99:
               var10000 = 124;
               break;
            case 100:
               var10000 = 2;
               break;
            case 101:
               var10000 = 187;
               break;
            case 102:
               var10000 = 39;
               break;
            case 103:
               var10000 = 115;
               break;
            case 104:
               var10000 = 208;
               break;
            case 105:
               var10000 = 232;
               break;
            case 106:
               var10000 = 157;
               break;
            case 107:
               var10000 = 138;
               break;
            case 108:
               var10000 = 176;
               break;
            case 109:
               var10000 = 122;
               break;
            case 110:
               var10000 = 172;
               break;
            case 111:
               var10000 = 26;
               break;
            case 112:
               var10000 = 152;
               break;
            case 113:
               var10000 = 249;
               break;
            case 114:
               var10000 = 144;
               break;
            case 115:
               var10000 = 236;
               break;
            case 116:
               var10000 = 168;
               break;
            case 117:
               var10000 = 52;
               break;
            case 118:
               var10000 = 27;
               break;
            case 119:
               var10000 = 204;
               break;
            case 120:
               var10000 = 218;
               break;
            case 121:
               var10000 = 150;
               break;
            case 122:
               var10000 = 130;
               break;
            case 123:
               var10000 = 225;
               break;
            case 124:
               var10000 = 84;
               break;
            case 125:
               var10000 = 112;
               break;
            case 126:
               var10000 = 113;
               break;
            case 127:
               var10000 = 221;
               break;
            case 128:
               var10000 = 30;
               break;
            case 129:
               var10000 = 103;
               break;
            case 130:
               var10000 = 184;
               break;
            case 131:
               var10000 = 41;
               break;
            case 132:
               var10000 = 132;
               break;
            case 133:
               var10000 = 171;
               break;
            case 134:
               var10000 = 14;
               break;
            case 135:
               var10000 = 59;
               break;
            case 136:
               var10000 = 54;
               break;
            case 137:
               var10000 = 5;
               break;
            case 138:
               var10000 = 220;
               break;
            case 139:
               var10000 = 73;
               break;
            case 140:
               var10000 = 142;
               break;
            case 141:
               var10000 = 185;
               break;
            case 142:
               var10000 = 127;
               break;
            case 143:
               var10000 = 170;
               break;
            case 144:
               var10000 = 182;
               break;
            case 145:
               var10000 = 80;
               break;
            case 146:
               var10000 = 98;
               break;
            case 147:
               var10000 = 74;
               break;
            case 148:
               var10000 = 166;
               break;
            case 149:
               var10000 = 95;
               break;
            case 150:
               var10000 = 23;
               break;
            case 151:
               var10000 = 67;
               break;
            case 152:
               var10000 = 237;
               break;
            case 153:
               var10000 = 137;
               break;
            case 154:
               var10000 = 246;
               break;
            case 155:
               var10000 = 177;
               break;
            case 156:
               var10000 = 53;
               break;
            case 157:
               var10000 = 8;
               break;
            case 158:
               var10000 = 224;
               break;
            case 159:
               var10000 = 120;
               break;
            case 160:
               var10000 = 71;
               break;
            case 161:
               var10000 = 56;
               break;
            case 162:
               var10000 = 64;
               break;
            case 163:
               var10000 = 117;
               break;
            case 164:
               var10000 = 251;
               break;
            case 165:
               var10000 = 188;
               break;
            case 166:
               var10000 = 162;
               break;
            case 167:
               var10000 = 195;
               break;
            case 168:
               var10000 = 77;
               break;
            case 169:
               var10000 = 62;
               break;
            case 170:
               var10000 = 154;
               break;
            case 171:
               var10000 = 202;
               break;
            case 172:
               var10000 = 252;
               break;
            case 173:
               var10000 = 215;
               break;
            case 174:
               var10000 = 140;
               break;
            case 175:
               var10000 = 20;
               break;
            case 176:
               var10000 = 104;
               break;
            case 177:
               var10000 = 34;
               break;
            case 178:
               var10000 = 148;
               break;
            case 179:
               var10000 = 242;
               break;
            case 180:
               var10000 = 66;
               break;
            case 181:
               var10000 = 106;
               break;
            case 182:
               var10000 = 214;
               break;
            case 183:
               var10000 = 90;
               break;
            case 184:
               var10000 = 178;
               break;
            case 185:
               var10000 = 42;
               break;
            case 186:
               var10000 = 240;
               break;
            case 187:
               var10000 = 119;
               break;
            case 188:
               var10000 = 158;
               break;
            case 189:
               var10000 = 235;
               break;
            case 190:
               var10000 = 145;
               break;
            case 191:
               var10000 = 0;
               break;
            case 192:
               var10000 = 85;
               break;
            case 193:
               var10000 = 205;
               break;
            case 194:
               var10000 = 213;
               break;
            case 195:
               var10000 = 72;
               break;
            case 196:
               var10000 = 206;
               break;
            case 197:
               var10000 = 149;
               break;
            case 198:
               var10000 = 207;
               break;
            case 199:
               var10000 = 107;
               break;
            case 200:
               var10000 = 198;
               break;
            case 201:
               var10000 = 40;
               break;
            case 202:
               var10000 = 87;
               break;
            case 203:
               var10000 = 229;
               break;
            case 204:
               var10000 = 245;
               break;
            case 205:
               var10000 = 17;
               break;
            case 206:
               var10000 = 128;
               break;
            case 207:
               var10000 = 13;
               break;
            case 208:
               var10000 = 45;
               break;
            case 209:
               var10000 = 55;
               break;
            case 210:
               var10000 = 15;
               break;
            case 211:
               var10000 = 201;
               break;
            case 212:
               var10000 = 143;
               break;
            case 213:
               var10000 = 60;
               break;
            case 214:
               var10000 = 65;
               break;
            case 215:
               var10000 = 18;
               break;
            case 216:
               var10000 = 255;
               break;
            case 217:
               var10000 = 70;
               break;
            case 218:
               var10000 = 196;
               break;
            case 219:
               var10000 = 169;
               break;
            case 220:
               var10000 = 193;
               break;
            case 221:
               var10000 = 76;
               break;
            case 222:
               var10000 = 51;
               break;
            case 223:
               var10000 = 129;
               break;
            case 224:
               var10000 = 101;
               break;
            case 225:
               var10000 = 116;
               break;
            case 226:
               var10000 = 108;
               break;
            case 227:
               var10000 = 243;
               break;
            case 228:
               var10000 = 1;
               break;
            case 229:
               var10000 = 163;
               break;
            case 230:
               var10000 = 167;
               break;
            case 231:
               var10000 = 37;
               break;
            case 232:
               var10000 = 174;
               break;
            case 233:
               var10000 = 50;
               break;
            case 234:
               var10000 = 192;
               break;
            case 235:
               var10000 = 147;
               break;
            case 236:
               var10000 = 111;
               break;
            case 237:
               var10000 = 91;
               break;
            case 238:
               var10000 = 109;
               break;
            case 239:
               var10000 = 164;
               break;
            case 240:
               var10000 = 131;
               break;
            case 241:
               var10000 = 32;
               break;
            case 242:
               var10000 = 89;
               break;
            case 243:
               var10000 = 49;
               break;
            case 244:
               var10000 = 153;
               break;
            case 245:
               var10000 = 43;
               break;
            case 246:
               var10000 = 110;
               break;
            case 247:
               var10000 = 102;
               break;
            case 248:
               var10000 = 75;
               break;
            case 249:
               var10000 = 114;
               break;
            case 250:
               var10000 = 231;
               break;
            case 251:
               var10000 = 46;
               break;
            case 252:
               var10000 = 239;
               break;
            case 253:
               var10000 = 121;
               break;
            case 254:
               var10000 = 81;
               break;
            default:
               var10000 = 57;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30754;
      if (fb[var3] == null) {
         fb[var3] = (int)(eb[var3] ^ var1);
      }

      return fb[var3];
   }

   public static long c(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 13118) & 32767;
      if (jb[var3] == null) {
         jb[var3] = ib[var3] ^ var1;
      }

      return jb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      long[] var27;
      char[] var43;
      byte var52;
      long var65;
      String[] var21 = new String[23];
      int var19 = 0;
      String var18 = "[Ü\u0013¾Ü\u0092\u0006i\u00121`£´!\tKo\u0007\u0080¤É\u007f%@Þ°M\u0002邗飽\u0016³Çó@+\u0097\n·3©èìB¸Ô$L £\u0004\u0084Î+çTy2zÙ }v\u0093@«WPv9\u0018\u0083)pÕKÈ6\u0097\u001f\u00adÉ>âô.þ\u00904¦òWc\u001eò\u000bB\u000ekÝ\u0015\u009e\u001c\u0096\u001eéüè|ÈgB\bÞÅ£\u009dÊöÄå\u001d%\u008b!Éq¦A\u009aF>\u008c\u001ezßà\u0081¤¦\u0010\u008béÅI:\u0014\u0092\u001c\u009a\u009f\u000bs\u009f\u0016Ö|\u009f\u0012È}ÌL\u000e]Ûä5 YîVæ´PEK\u009e\u0002厠卭\u0004溘窕務衧\u000eôQæ\u000fb¤Ñ¯\u0005 CÑ\u0080a\t\u0093`\u0095K\u0098\u0082ìù\f\u0004\u0093QÄ\u008a\u0010T(µv×\u000el\u0014\u0005yÓëºÑó¦\u001b\fX\u0004³ÕéÕ{ÈS\u009d¥ãH \u0098Pd\u009a\t} \u008a§=j\u0018\n捀巩厫收吼锣邍戶寱毟\u0017r¿ËO,vê\u00803}\"v¯ÒZ ó\u0092ú\u001d´\u000bå\u000e8äHÒµ¥\\É°G\u009a;\u0012Q\u0002撄緑";
      int var20 = "[Ü\u0013¾Ü\u0092\u0006i\u00121`£´!\tKo\u0007\u0080¤É\u007f%@Þ°M\u0002邗飽\u0016³Çó@+\u0097\n·3©èìB¸Ô$L £\u0004\u0084Î+çTy2zÙ }v\u0093@«WPv9\u0018\u0083)pÕKÈ6\u0097\u001f\u00adÉ>âô.þ\u00904¦òWc\u001eò\u000bB\u000ekÝ\u0015\u009e\u001c\u0096\u001eéüè|ÈgB\bÞÅ£\u009dÊöÄå\u001d%\u008b!Éq¦A\u009aF>\u008c\u001ezßà\u0081¤¦\u0010\u008béÅI:\u0014\u0092\u001c\u009a\u009f\u000bs\u009f\u0016Ö|\u009f\u0012È}ÌL\u000e]Ûä5 YîVæ´PEK\u009e\u0002厠卭\u0004溘窕務衧\u000eôQæ\u000fb¤Ñ¯\u0005 CÑ\u0080a\t\u0093`\u0095K\u0098\u0082ìù\f\u0004\u0093QÄ\u008a\u0010T(µv×\u000el\u0014\u0005yÓëºÑó¦\u001b\fX\u0004³ÕéÕ{ÈS\u009d¥ãH \u0098Pd\u009a\t} \u008a§=j\u0018\n捀巩厫收吼锣邍戶寱毟\u0017r¿ËO,vê\u00803}\"v¯ÒZ ó\u0092ú\u001d´\u000bå\u000e8äHÒµ¥\\É°G\u009a;\u0012Q\u0002撄緑"
         .length();
      J(null);
      char var17 = '\b';
      int var25 = -1;

      label79:
      while (true) {
         byte var10000 = 92;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
            label74: {
               char[] var49 = var10001.toCharArray();
               int var10004 = var49.length;
               int var22 = 0;
               var52 = var10000;
               var43 = var49;
               int var32 = var10004;
               byte var60;
               char[] var67;
               int var10006;
               if (var10004 <= 1) {
                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               } else {
                  var52 = var10000;
                  var32 = var10004;
                  if (var10004 <= var22) {
                     break label74;
                  }

                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var76 = var67[var10006];
                  byte var77;
                  switch (var22 % 7) {
                     case 0:
                        var77 = 44;
                        break;
                     case 1:
                        var77 = 9;
                        break;
                     case 2:
                        var77 = 42;
                        break;
                     case 3:
                        var77 = 126;
                        break;
                     case 4:
                        var77 = 71;
                        break;
                     case 5:
                        var77 = 93;
                        break;
                     default:
                        var77 = 15;
                  }

                  var67[var10006] = (char)(var76 ^ var60 ^ var77);
                  var22++;
                  if (var52 == 0) {
                     var10006 = var52;
                     var67 = var43;
                     var60 = var52;
                  } else {
                     if (var32 <= var22) {
                        break;
                     }

                     var67 = var43;
                     var60 = var52;
                     var10006 = var22;
                  }
               }
            }

            String var54 = new String(var43).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var54;
                  if ((var25 += var17) >= var20) {
                     ab = var21;
                     bb = new String[23];
                     long var8 = 1450781983818565127L;
                     long[] var14 = new long[12];
                     int var11 = 0;
                     String var12 = "+ÑlW3ä2\u008b\u0001I\u008cÒ\u0087#ýÂxôú·ä\u008e¹O\u0004j\u008bY\u0096z$æ1pzMÙ\u0015o¼\u0095ç\u001cFë r&\u0092°ÿã\u0010¼\u0090ïM]'&HìÒÅ)m²éÐºöñÙ\u0087¼qq¸rÅ";
                     int var13 = "+ÑlW3ä2\u008b\u0001I\u008cÒ\u0087#ýÂxôú·ä\u008e¹O\u0004j\u008bY\u0096z$æ1pzMÙ\u0015o¼\u0095ç\u001cFë r&\u0092°ÿã\u0010¼\u0090ïM]'&HìÒÅ)m²éÐºöñÙ\u0087¼qq¸rÅ"
                        .length();
                     byte var10 = 0;

                     label53:
                     while (true) {
                        byte var34 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var34, var10).getBytes("ISO-8859-1");
                        var27 = var14;
                        int var35 = var11++;
                        long var47 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var55 = -1;

                        while (true) {
                           var65 = var47 ^ var8;
                           switch (var55) {
                              case 0:
                                 var27[var35] = var65;
                                 if (var10 >= var13) {
                                    eb = var14;
                                    fb = new Integer[12];
                                    long var0 = 4364929194099190692L;
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = "ENnõ(\n§\u0005\nÉ\u009dÒ <u¿\u0091³çö\u0012nÐï";
                                    int var5 = "ENnõ(\n§\u0005\nÉ\u009dÒ <u¿\u0091³çö\u0012nÐï".length();
                                    byte var2 = 0;

                                    do {
                                       byte var37 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                       int var38 = var3++;
                                       var65 = (
                                             ((long)var7[0] & 255L) << 56
                                                | ((long)var7[1] & 255L) << 48
                                                | ((long)var7[2] & 255L) << 40
                                                | ((long)var7[3] & 255L) << 32
                                                | ((long)var7[4] & 255L) << 24
                                                | ((long)var7[5] & 255L) << 16
                                                | ((long)var7[6] & 255L) << 8
                                                | (long)var7[7] & 255L
                                          )
                                          ^ var0;
                                       byte var57 = -1;
                                       var6[var38] = var65;
                                    } while (var2 < var5);

                                    ib = var6;
                                    jb = new Long[3];
                                    Registry.lookupField(367745115098506391L).set(null, new JFrame());
                                    ((JFrame)Registry.lookupField(367745115098506391L).get(null))
                                       .setBounds(
                                          a(17282, 8378640599052008353L),
                                          a(11944, 8409189693881996940L),
                                          a(11944, 8409189693881996940L),
                                          a(11944, 8409189693881996940L)
                                       );
                                    Registry.lookupField(314340464831411797L).set(null, new JDialog());
                                    ((JDialog)Registry.lookupField(314340464831411797L).get(null)).setSize(0, 0);
                                    return;
                                 }
                                 break;
                              default:
                                 var27[var35] = var65;
                                 if (var10 < var13) {
                                    continue label53;
                                 }

                                 var12 = "®´\u0094¸Õº-\f\u000eö*7\u0010]¤^";
                                 var13 = "®´\u0094¸Õº-\f\u000eö*7\u0010]¤^".length();
                                 var10 = 0;
                           }

                           byte var36 = var10;
                           var10 += 8;
                           var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                           var27 = var14;
                           var35 = var11++;
                           var47 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var55 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var25);
                  break;
               default:
                  var21[var19++] = var54;
                  if ((var25 += var17) < var20) {
                     var17 = var18.charAt(var25);
                     continue label79;
                  }

                  var18 = "Ê\u0016\u0007\u009dM]RÅ`\u0097\u0091rbh\u0019\u000b1LO½FãDV¦\u000e&";
                  var20 = "Ê\u0016\u0007\u009dM]RÅ`\u0097\u0091rbh\u0019\u000b1LO½FãDV¦\u000e&".length();
                  var17 = 15;
                  var25 = -1;
            }

            var10000 = 6;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }
   private static Object var136;
}





