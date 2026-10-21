package com.finalshell.ui.panel;

import com.finalshell.core.F52;
import com.finalshell.core.KV;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.T32;
import com.finalshell.core.RemoteProcessManager;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.C5;
import com.finalshell.ui.listener.A2;
import com.finalshell.ui.listener.Cw2;
import com.finalshell.ui.listener.Cw4;
import com.finalshell.ui.listener.Kg4;
import com.finalshell.ui.listener.MX;
import com.finalshell.ui.listener.TG3;
import com.finalshell.ui.listener.X0;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import net.miginfocom.swing.MigLayout;

public class CustomAcceleratePanel extends JPanel {
   public static RouteTraceAddressPanel n;
   public SystemInfoPanel z;
   public KV G;
   public String i;
   public static C5 C;
   public JButton g;
   public JButton J;
   public JButton x;
   public JButton q;
   public SelectDownloadFolderPanel B;
   public JPanel b;
   public JButton k;
   public AccelerateRdpHelpPanel w;
   public JButton p;
   public static Ky4[] u;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public CustomAcceleratePanel(C5 var1) {
      long var34;
      Object var45;
      long var77;
      Registry.lookupField(299249922317273977L).set(null, var1);
      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10002 = Registry.packArgs(this);
      long var16 = 186968322899323645L;
      Object[] var15 = var10002;
      Ref.h(186968322899323645L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var125) {
         throw var125.getTargetException();
      }

      this.setLayout(new MigLayout(a(-30333, -18720), a(-30313, -5790), a(-30320, -24913)));
      this.setBackground(new Color(a(17279, 4975311119002613184L), a(29937, 4977513989383684674L), a(29937, 4977513989383684674L)));
      this.setBorder(BorderFactory.createLineBorder(new Color(a(6824, 2357450231332727827L), a(6267, 3485414604983037639L), a(6267, 3485414604983037639L)), 1));
      SystemInfoPanel var10003 = new SystemInfoPanel();
      long var18 = 315550111871610189L;
      SystemInfoPanel var17 = var10003;
      Ref.s(315550111871610189L, var17, var18);
      JPanel var3 = new JPanel(new MigLayout(a(-30323, -12558), a(-30311, -30801), a(-30317, -17007)));
      var3.setBackground(new Color(a(29937, 4977513989383684674L), a(29937, 4977513989383684674L), a(29937, 4977513989383684674L)));
      var3.setBorder(
         BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(a(25191, 1373532374092387528L), a(27434, 4059267965095746946L), a(27434, 4059267965095746946L)))
      );
      this.add(var3, a(-30334, -18484));
      JPanel var4 = new JPanel(new MigLayout(a(-30318, -7578), a(-30311, -30801), a(-30311, -30801)));
      var3.add(var4, a(-30335, 32312));
      var4.setOpaque(false);
      var4.setLayout(new MigLayout(a(-30321, 28232), a(-30311, -30801), a(-30311, -30801)));
      var4.setBorder(null);
      JPanel var5 = new JPanel();
      var5.setOpaque(false);
      var5.setLayout(new MigLayout(a(-30316, 15452), a(-30311, -30801), a(-30311, -30801)));
      var4.add(var5);
      JPanel var6 = new JPanel();
      var6.setOpaque(false);
      var6.setLayout(new MigLayout(a(-30316, 15452), a(-30314, -30043), a(-30311, -30801)));
      var4.add(var6, a(-30335, 32312));
      Registry.packArgs(a(-30331, -12299));
      long var19 = 309317109240719579L;
      Object var10005 = Ref.h2(309317109240719579L, var19);
      long var22 = 461309651596412572L;
      Object var21 = var10005;
      Ref.s(461309651596412572L, var21, var22);
      Object var23 = 461309651596412572L;
      ((JButton)Ref.g(461309651596412572L, var23)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var25 = 461309651596412572L;
      ((JButton)Ref.g(461309651596412572L, var25)).setForeground((Color)Registry.lookupField(503018106388102479L).get(null));
      Object var27 = 461309651596412572L;
      ((JButton)Ref.g(461309651596412572L, var27)).addActionListener(new Cw4(this));
      Object var29 = 461309651596412572L;
      this.add((JButton)Ref.g(461309651596412572L, var29));
      Registry.packArgs(a(-30332, 23726));
      long var31 = 309317109240719579L;
      Object var10011 = Ref.h2(309317109240719579L, var31);
      var34 = 595726637974712292L;
      Object var33 = var10011;
      Ref.s(595726637974712292L, var33, var34);
      Object var35 = 595726637974712292L;
      ((JButton)Ref.g(595726637974712292L, var35)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var37 = 595726637974712292L;
      ((JButton)Ref.g(595726637974712292L, var37)).setForeground((Color)Registry.lookupField(503018106388102479L).get(null));
      Object var39 = 595726637974712292L;
      this.add((JButton)Ref.g(595726637974712292L, var39), a(-30306, 26376));
      X0 var7 = new X0(this);
      Object var41 = 595726637974712292L;
      ((JButton)Ref.g(595726637974712292L, var41)).addActionListener(var7);
      Registry.packArgs(a(-30309, -14481));
      long var43 = 309317109240719579L;
      Object var10017 = Ref.h2(309317109240719579L, var43);
      long var46 = 323808653284443090L;
      var45 = var10017;
      Ref.s(323808653284443090L, var45, var46);
      Object var47 = 323808653284443090L;
      ((JButton)Ref.g(323808653284443090L, var47)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var49 = 323808653284443090L;
      ((JButton)Ref.g(323808653284443090L, var49)).setForeground((Color)Registry.lookupField(503018106388102479L).get(null));
      Object var51 = 323808653284443090L;
      ((JButton)Ref.g(323808653284443090L, var51)).addActionListener(new MX(this));
      Object var53 = 323808653284443090L;
      this.add((JButton)Ref.g(323808653284443090L, var53), a(-30324, -20987));
      Registry.packArgs(a(-30312, -6722));
      long var55 = 309317109240719579L;
      Object var10023 = Ref.h2(309317109240719579L, var55);
      long var58 = 324428301021097377L;
      Object var57 = var10023;
      Ref.s(324428301021097377L, var57, var58);
      N();
      Object var59 = 324428301021097377L;
      ((JButton)Ref.g(324428301021097377L, var59)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var61 = 324428301021097377L;
      ((JButton)Ref.g(324428301021097377L, var61)).setForeground((Color)Registry.lookupField(503018106388102479L).get(null));
      Object var63 = 324428301021097377L;
      this.add((JButton)Ref.g(324428301021097377L, var63), a(-30324, -20987));
      Object var65 = 324428301021097377L;
      ((JButton)Ref.g(324428301021097377L, var65)).addActionListener(new Kg4(this, var1));
      int var8 = a(22702, 8228077343533215252L);
      Color var9 = new Color(var8, var8, var8);
      CompoundBorder var10 = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, var9), BorderFactory.createEmptyBorder(0, 0, 0, 0));
      JPanel var10029 = new JPanel();
      long var68 = 280328572906019845L;
      JPanel var67 = var10029;
      Ref.s(280328572906019845L, var67, var68);
      Object var69 = 280328572906019845L;
      this.add((JPanel)Ref.g(280328572906019845L, var69), a(-30330, -27453));
      Object var71 = 280328572906019845L;
      ((JPanel)Ref.g(280328572906019845L, var71)).setOpaque(false);
      Object var73 = 280328572906019845L;
      ((JPanel)Ref.g(280328572906019845L, var73)).setLayout(new MigLayout(a(-30322, 22246), a(-30336, -11177), a(-30305, -9898)));
      Object var75 = 280328572906019845L;
      ((JPanel)Ref.g(280328572906019845L, var75)).setBorder(null);
      Image var11 = (Image)Registry.lookupField(582605604039442414L).get(null);
      Registry.packArgs(a(-30315, -3696));
      var77 = 309317109240719579L;
      Object var10035 = Ref.h2(309317109240719579L, var77);
      long var80 = 466614086835737479L;
      Object var79 = var10035;
      Ref.s(466614086835737479L, var79, var80);
      Object var81 = 280328572906019845L;
      JPanel var10036 = (JPanel)Ref.g(280328572906019845L, var81);
      Object var83 = 466614086835737479L;
      this.add((JButton)Ref.g(466614086835737479L, var83));
      JFrame var12 = new JFrame();
      var12.setIconImage(var11);
      var12.setTitle(a(-30310, -27005));
      AccelerateRdpHelpPanel var10038 = new AccelerateRdpHelpPanel();
      long var86 = 298140125120982154L;
      AccelerateRdpHelpPanel var85 = var10038;
      Ref.s(298140125120982154L, var85, var86);
      Object var87 = 298140125120982154L;
      this.setContentPane((AccelerateRdpHelpPanel)Ref.g(298140125120982154L, var87));
      Object var89 = 466614086835737479L;
      ((JButton)Ref.g(466614086835737479L, var89)).addActionListener(new A2(this, var12));
      Registry.emptyArgs();
      long var91 = 270389152141252877L;
      Ref.h2(270389152141252877L, var91);
      Object[] var10042 = Registry.packArgs(new F52(this));
      long var94 = 459969040127248336L;
      Object[] var93 = var10042;
      Ref.h(459969040127248336L, var93, var94);

      try {
         ;
      } catch (InvocationTargetException var124) {
         throw var124.getTargetException();
      }

      SelectDownloadFolderPanel var10043 = new SelectDownloadFolderPanel(var1);
      long var96 = 187017741884349765L;
      SelectDownloadFolderPanel var95 = var10043;
      Ref.s(187017741884349765L, var95, var96);
      Object var97 = 187017741884349765L;
      ((SelectDownloadFolderPanel)Ref.g(187017741884349765L, var97)).setOpaque(false);
      Object var99 = 187017741884349765L;
      this.add((SelectDownloadFolderPanel)Ref.g(187017741884349765L, var99), a(-30335, 32312));
      Object var101 = 461309651596412572L;
      ((JButton)Ref.g(461309651596412572L, var101)).setEnabled(false);
      Object var103 = 323808653284443090L;
      ((JButton)Ref.g(323808653284443090L, var103)).setEnabled(false);
      Object var105 = 324428301021097377L;
      ((JButton)Ref.g(324428301021097377L, var105)).setEnabled(false);
      Object var107 = 595726637974712292L;
      ((JButton)Ref.g(595726637974712292L, var107)).setEnabled(false);
      Registry.packArgs(Registry.lookupField(420455465341613887L).get(null));
      long var109 = 309317109240719579L;
      Object var10050 = Ref.h2(309317109240719579L, var109);
      long var112 = 520261268421159057L;
      Object var111 = var10050;
      Ref.s(520261268421159057L, var111, var112);
      Object var113 = 520261268421159057L;
      ((JButton)Ref.g(520261268421159057L, var113))
         .setBorder(BorderFactory.createEmptyBorder(a(5206, 9214373350341927677L), 0, a(31271, 2593881197051088022L), 2));
      Object var115 = 520261268421159057L;
      ((JButton)Ref.g(520261268421159057L, var115)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var117 = 520261268421159057L;
      ((JButton)Ref.g(520261268421159057L, var117))
         .setForeground(new Color(a(14282, 7222729685126005091L), a(29484, 4563677695222777234L), a(4112, 858252989946095269L)));
      Object var119 = 520261268421159057L;
      ((JButton)Ref.g(520261268421159057L, var119)).addActionListener(new TG3(this));
      Object[] var10055 = Registry.packArgs(false);
      long var122 = 179143699838950106L;
      Object[] var121 = var10055;
      Ref.h(179143699838950106L, var121, var122);

      try {
         ;
      } catch (InvocationTargetException var123) {
         throw var123.getTargetException();
      }

      Registry.lookupField(466136119654778712L).set(null, new RouteTraceAddressPanel());
      this.add((RouteTraceAddressPanel)Registry.lookupField(466136119654778712L).get(null), a(-30335, 32312), 0);
      if (this == null) {
         Ky4.K(new String[2]);
      }
   }

   public void j(boolean var1) {
      boolean var27;
      label34: {
         Ky4[] var2 = N();
         if (var2 != null) {
            if (var1) {
               Object var3 = 520261268421159057L;
               ((JButton)Ref.g(520261268421159057L, var3)).setOpaque(false);
               Object var5 = 520261268421159057L;
               ((JButton)Ref.g(520261268421159057L, var5)).setText((String)Registry.lookupField(204284935306083361L).get(null));
               Object var7 = 520261268421159057L;
               ((JButton)Ref.g(520261268421159057L, var7))
                  .setForeground(new Color(a(19236, 1516335676861005209L), a(27842, 1599451165658258043L), a(25599, 5100589415763711313L)));
               if (var2 != null) {
                  break label34;
               }
            }

            Object var9 = 520261268421159057L;
            ((JButton)Ref.g(520261268421159057L, var9)).setOpaque(true);
            Object var11 = 520261268421159057L;
            ((JButton)Ref.g(520261268421159057L, var11)).setText((String)Registry.lookupField(420455465341613887L).get(null));
            Object var13 = 520261268421159057L;
            ((JButton)Ref.g(520261268421159057L, var13))
               .setBackground(new Color(a(9224, 8905499402478703280L), a(2165, 4793190587278163655L), a(21420, 8005941640101209350L)));
         }

         Object var15 = 520261268421159057L;
         ((JButton)Ref.g(520261268421159057L, var15))
            .setForeground(new Color(a(5299, 3528411738978116101L), a(19395, 1825592512016661875L), a(19395, 1825592512016661875L)));
      }

      Registry.emptyArgs();
      long var17 = 270389152141252877L;
      Ref.h2(270389152141252877L, var17);
      Object[] var10003 = Registry.emptyArgs();
      long var20 = 163462326892114024L;
      Object[] var19 = var10003;
      Ref.h(163462326892114024L, var19, var20);
      Object var10004 = Registry.emptyArgs();
      long var22 = 133802226692684648L;
      Object var21 = var10004;
      var10004 = Ref.h(133802226692684648L, var21, var22);

      try {
         var27 = (Boolean)var10004;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      if (var27) {
         Object var23 = 520261268421159057L;
         ((JButton)Ref.g(520261268421159057L, var23)).setText((String)Registry.lookupField(127034442177009153L).get(null));
      }
   }

   public static void i(KV var0, String var1) {
      long var27;
      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10002 = Registry.emptyArgs();
      long var9 = 634817973682994708L;
      Object[] var8 = var10002;
      Ref.h(634817973682994708L, var8, var9);
      Object[] var10003 = Registry.emptyArgs();
      long var11 = 240567170779145617L;
      Object[] var10 = var10003;
      Ref.h(240567170779145617L, var10, var11);
      Object var10004 = Registry.emptyArgs();
      long var13 = 226341449505323490L;
      Object var12 = var10004;
      var10004 = Ref.h(226341449505323490L, var12, var13);

      try {
         var10004 = (com.finalshell.ui.frame.MainFrame)var10004;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      com.finalshell.ui.frame.MainFrame var3 = var10004;
      N();
      ConnectionProperty var10006 = (ConnectionProperty)(Registry.emptyArgs());
      long var15 = 179934491990092343L;
      Object var14 = var10006;
      var10006 = Ref.h(179934491990092343L, var14, var15);

      try {
         var10006 = (ConnectionProperty)var10006;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      ConnectionProperty var4;
      var4 = var10006;
      label94:
      if (var4 == null) {
         var10006 = Registry.emptyArgs();
         long var17 = 559196035657690421L;
         Object var16 = var10006;
         var10006 = Ref.h(559196035657690421L, var16, var17);

         try {
            var10006 = (RemoteProcessManager)var10006;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

         if (var3 != null) {
            if (var10006 == null) {
               break label94;
            }

            Object[] var10007 = Registry.emptyArgs();
            long var19 = 559196035657690421L;
            Object[] var18 = var10007;
            Ref.h(559196035657690421L, var18, var19);

            try {
               ;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }
         }

         ConnectionProperty var41 = (ConnectionProperty)(Registry.emptyArgs());
         long var21 = 301663738912746359L;
         Object var20 = var41;
         var41 = Ref.h(301663738912746359L, var20, var21);

         try {
            var41 = (ConnectionProperty)var41;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         var4 = var41;
      }

      if (var3 != null) {
         ConnectionProperty var10005 = var4;
         if (var3 != null) {
            if (var4 == null) {
               return;
            }

            var10005 = var4;
         }

         Lv4_2 var5 = var10005.a();
         if (var3 != null) {
            if (var5 == null) {
               return;
            }

            Registry.lookupField(466136119654778712L).get(null);
            Object[] var44 = Registry.emptyArgs();
            long var23 = 380415140795833934L;
            Object[] var22 = var44;
            Ref.h(380415140795833934L, var22, var23);
            Object[] var10009 = Registry.emptyArgs();
            long var25 = 286931176286176762L;
            Object[] var24 = var10009;
            Object[] var10008 = Registry.packArgs(var5, Ref.h(286931176286176762L, var24, var25));
            var27 = 407547220859876749L;
            Object[] var26 = var10008;
            Ref.h(407547220859876749L, var26, var27);

            try {
               ;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }
         }

         ((C5)Registry.lookupField(299249922317273977L).get(null)).setVisible(false);
      }
   }

   public static void i(String var0) {
      long var27;
      Object[] var34;
      long var45;
      boolean var77;
      Ky4[] var1 = N();
      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);

      try {
         ;
      } catch (InvocationTargetException var74) {
         throw var74.getTargetException();
      }

      if (var1 != null) {
         Object[] var10002 = Registry.emptyArgs();
         long var13 = 163462326892114024L;
         Object[] var12 = var10002;
         Ref.h(163462326892114024L, var12, var13);
         Object var10003 = Registry.emptyArgs();
         long var15 = 633712494917113170L;
         Object var14 = var10003;
         var10003 = Ref.h(633712494917113170L, var14, var15);

         try {
            var77 = (Boolean)var10003;
         } catch (InvocationTargetException var73) {
            throw var73.getTargetException();
         }

         if (!var77) {
            Registry.emptyArgs();
            long var16 = 270389152141252877L;
            Ref.h2(270389152141252877L, var16);
            Object[] var83 = Registry.emptyArgs();
            long var19 = 248890456776257543L;
            Object[] var18 = var83;
            Ref.h(248890456776257543L, var18, var19);

            try {
               return;
            } catch (InvocationTargetException var58) {
               throw var58.getTargetException();
            }
         }

         Registry.emptyArgs();
         long var20 = 270389152141252877L;
         Ref.h2(270389152141252877L, var20);

         try {
            ;
         } catch (InvocationTargetException var72) {
            throw var72.getTargetException();
         }
      }

      Object[] var75 = Registry.emptyArgs();
      long var23 = 634817973682994708L;
      Object[] var22 = var75;
      Ref.h(634817973682994708L, var22, var23);
      Object[] var78 = Registry.emptyArgs();
      long var25 = 240567170779145617L;
      Object[] var24 = var78;
      Ref.h(240567170779145617L, var24, var25);
      Object var10004 = Registry.emptyArgs();
      var27 = 226341449505323490L;
      Object var26 = var10004;
      var10004 = Ref.h(226341449505323490L, var26, var27);

      try {
         var10004 = (com.finalshell.ui.frame.MainFrame)var10004;
      } catch (InvocationTargetException var71) {
         throw var71.getTargetException();
      }

      com.finalshell.ui.frame.MainFrame var2 = var10004;
      ConnectionProperty var10005 = (ConnectionProperty)(Registry.emptyArgs());
      long var29 = 179934491990092343L;
      Object var28 = var10005;
      var10005 = Ref.h(179934491990092343L, var28, var29);

      try {
         var10005 = (ConnectionProperty)var10005;
      } catch (InvocationTargetException var70) {
         throw var70.getTargetException();
      }

      ConnectionProperty var3 = var10005;
      if (var2 != null && var0 != null) {
         Registry.emptyArgs();
         long var30 = 270389152141252877L;
         Ref.h2(270389152141252877L, var30);
         Object[] var10007 = Registry.emptyArgs();
         long var33 = 410905379772103887L;
         Object[] var32 = var10007;
         Ref.h(410905379772103887L, var32, var33);
         Lv4_2 var10008 = (Lv4_2)(Registry.packArgs(var0));
         long var35 = 343419559142469673L;
         var34 = var10008;
         var10008 = Ref.h(343419559142469673L, var34, var35);

         try {
            var10008 = (Lv4_2)var10008;
         } catch (InvocationTargetException var69) {
            throw var69.getTargetException();
         }

         Lv4_2 var5 = var10008;
         if (var5 != null) {
            AM var10009 = (AM)(Registry.emptyArgs());
            long var37 = 303756590022481369L;
            Object var36 = var10009;
            var10009 = Ref.h(303756590022481369L, var36, var37);

            try {
               var10009 = (AM)var10009;
            } catch (InvocationTargetException var68) {
               throw var68.getTargetException();
            }

            AM var6 = var10009;
            T32 var10010 = (T32)(Registry.packArgs(var0));
            long var39 = 259592583851616584L;
            Object var38 = var10010;
            var10010 = Ref.h(259592583851616584L, var38, var39);

            try {
               var10010 = (T32)var10010;
            } catch (InvocationTargetException var67) {
               throw var67.getTargetException();
            }

            label206: {
               label189: {
                  T32 var7 = var10010;
                  if (var1 != null) {
                     if (var7 == null) {
                        break label189;
                     }

                     Object[] var10011 = Registry.packArgs(var7);
                     long var41 = 176011466134249595L;
                     Object[] var40 = var10011;
                     Ref.h(176011466134249595L, var40, var41);

                     try {
                        ;
                     } catch (InvocationTargetException var66) {
                        throw var66.getTargetException();
                     }
                  }

                  if (var1 != null) {
                     break label206;
                  }
               }

               label208: {
                  var10010 = var3;
                  if (var1 != null) {
                     if (var3 != null) {
                        break label208;
                     }

                     var10010 = var6;
                     Object[] var91 = Registry.emptyArgs();
                     long var43 = 194560825135347400L;
                     Object[] var42 = var91;
                     Ref.h(194560825135347400L, var42, var43);
                     Object[] var10012 = Registry.emptyArgs();
                     var45 = 424156930953488367L;
                     Object[] var44 = var10012;
                     Ref.h(424156930953488367L, var44, var45);

                     try {
                        ;
                     } catch (InvocationTargetException var65) {
                        throw var65.getTargetException();
                     }
                  }

                  Object var8 = var10010;
                  if (var1 == null || var8 != null) {
                     ConnectionProperty var92 = (ConnectionProperty)(Registry.emptyArgs());
                     long var47 = 595556246051364370L;
                     Object var46 = var92;
                     var92 = Ref.h(595556246051364370L, var46, var47);

                     try {
                        var92 = (ConnectionProperty)var92;
                     } catch (InvocationTargetException var64) {
                        throw var64.getTargetException();
                     }

                     var3 = var92;
                  }
               }

               Object[] var95 = Registry.packArgs(var3);
               long var49 = 546054476699535938L;
               Object[] var48 = var95;
               Ref.h(546054476699535938L, var48, var49);

               try {
                  ;
               } catch (InvocationTargetException var63) {
                  throw var63.getTargetException();
               }

               Object[] var10013 = Registry.emptyArgs();
               long var51 = 544029910883356329L;
               Object[] var50 = var10013;
               Ref.h(544029910883356329L, var50, var51);

               try {
                  ;
               } catch (InvocationTargetException var62) {
                  throw var62.getTargetException();
               }

               new StringBuilder().append(a(-30308, -10364));
               String var10016 = (String)(Registry.emptyArgs());
               long var53 = 286931176286176762L;
               Object var52 = var10016;
               var10016 = Ref.h(286931176286176762L, var52, var53);

               try {
                  var10016 = (String)var10016;
               } catch (InvocationTargetException var61) {
                  throw var61.getTargetException();
               }

               Object[] var10015 = Registry.packArgs(var5.append((String)var10016).toString());
               long var55 = 519460332647460288L;
               Object[] var54 = var10015;
               Ref.h(519460332647460288L, var54, var55);

               try {
                  ;
               } catch (InvocationTargetException var60) {
                  throw var60.getTargetException();
               }

               var10016 = Registry.emptyArgs();
               long var57 = 176235325809488947L;
               Object var56 = var10016;
               Ref.h(176235325809488947L, var56, var57);

               try {
                  ;
               } catch (InvocationTargetException var59) {
                  throw var59.getTargetException();
               }
            }

            ((C5)Registry.lookupField(299249922317273977L).get(null)).setVisible(false);
         }
      }
   }

   public static void c() {
      Object[] var27;
      boolean var45;
      Ky4[] var0 = N();
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      if (var0 != null) {
         Object[] var10002 = Registry.emptyArgs();
         long var8 = 163462326892114024L;
         Object[] var7 = var10002;
         Ref.h(163462326892114024L, var7, var8);
         Object var10003 = Registry.emptyArgs();
         long var10 = 133802226692684648L;
         Object var9 = var10003;
         var10003 = Ref.h(133802226692684648L, var9, var10);

         try {
            var45 = (Boolean)var10003;
         } catch (InvocationTargetException var41) {
            throw var41.getTargetException();
         }

         if (!var45) {
            Registry.emptyArgs();
            long var11 = 270389152141252877L;
            Ref.h2(270389152141252877L, var11);
            Object[] var51 = Registry.emptyArgs();
            long var14 = 248890456776257543L;
            Object[] var13 = var51;
            Ref.h(248890456776257543L, var13, var14);

            try {
               return;
            } catch (InvocationTargetException var33) {
               throw var33.getTargetException();
            }
         }

         Registry.emptyArgs();
         long var15 = 270389152141252877L;
         Ref.h2(270389152141252877L, var15);

         try {
            ;
         } catch (InvocationTargetException var40) {
            throw var40.getTargetException();
         }
      }

      Object[] var43 = Registry.emptyArgs();
      long var18 = 634817973682994708L;
      Object[] var17 = var43;
      Ref.h(634817973682994708L, var17, var18);
      Object[] var46 = Registry.emptyArgs();
      long var20 = 240567170779145617L;
      Object[] var19 = var46;
      Ref.h(240567170779145617L, var19, var20);
      Object var10004 = Registry.emptyArgs();
      long var22 = 226341449505323490L;
      Object var21 = var10004;
      var10004 = Ref.h(226341449505323490L, var21, var22);

      try {
         var10004 = (com.finalshell.ui.frame.MainFrame)var10004;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      com.finalshell.ui.frame.MainFrame var1 = var10004;
      ConnectionProperty var10005 = (ConnectionProperty)(Registry.emptyArgs());
      long var24 = 179934491990092343L;
      Object var23 = var10005;
      var10005 = Ref.h(179934491990092343L, var23, var24);

      try {
         var10005 = (ConnectionProperty)var10005;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      ConnectionProperty var2 = var10005;
      if (var0 == null || var1 != null) {
         Object[] var10006 = Registry.packArgs(var2);
         long var26 = 209062372486546413L;
         Object[] var25 = var10006;
         Ref.h(209062372486546413L, var25, var26);

         try {
            ;
         } catch (InvocationTargetException var37) {
            throw var37.getTargetException();
         }

         Object[] var10007 = Registry.emptyArgs();
         long var28 = 517277241396583737L;
         var27 = var10007;
         Ref.h(517277241396583737L, var27, var28);

         try {
            ;
         } catch (InvocationTargetException var36) {
            throw var36.getTargetException();
         }

         Object[] var10008 = Registry.packArgs(a(-30307, -16903));
         long var30 = 519460332647460288L;
         Object[] var29 = var10008;
         Ref.h(519460332647460288L, var29, var30);

         try {
            ;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }

         Object[] var10009 = Registry.emptyArgs();
         long var32 = 176235325809488947L;
         Object[] var31 = var10009;
         Ref.h(176235325809488947L, var31, var32);

         try {
            ;
         } catch (InvocationTargetException var34) {
            throw var34.getTargetException();
         }

         ((C5)Registry.lookupField(299249922317273977L).get(null)).setVisible(false);
      }
   }

   public static void O(String var0) {
      long var27;
      Object[] var34;
      long var45;
      boolean var77;
      Ky4[] var1 = N();
      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);

      try {
         ;
      } catch (InvocationTargetException var74) {
         throw var74.getTargetException();
      }

      if (var1 != null) {
         Object[] var10002 = Registry.emptyArgs();
         long var13 = 163462326892114024L;
         Object[] var12 = var10002;
         Ref.h(163462326892114024L, var12, var13);
         Object var10003 = Registry.emptyArgs();
         long var15 = 133802226692684648L;
         Object var14 = var10003;
         var10003 = Ref.h(133802226692684648L, var14, var15);

         try {
            var77 = (Boolean)var10003;
         } catch (InvocationTargetException var73) {
            throw var73.getTargetException();
         }

         if (!var77) {
            Registry.emptyArgs();
            long var16 = 270389152141252877L;
            Ref.h2(270389152141252877L, var16);
            Object[] var83 = Registry.emptyArgs();
            long var19 = 248890456776257543L;
            Object[] var18 = var83;
            Ref.h(248890456776257543L, var18, var19);

            try {
               return;
            } catch (InvocationTargetException var58) {
               throw var58.getTargetException();
            }
         }

         Registry.emptyArgs();
         long var20 = 270389152141252877L;
         Ref.h2(270389152141252877L, var20);

         try {
            ;
         } catch (InvocationTargetException var72) {
            throw var72.getTargetException();
         }
      }

      Object[] var75 = Registry.emptyArgs();
      long var23 = 634817973682994708L;
      Object[] var22 = var75;
      Ref.h(634817973682994708L, var22, var23);
      Object[] var78 = Registry.emptyArgs();
      long var25 = 240567170779145617L;
      Object[] var24 = var78;
      Ref.h(240567170779145617L, var24, var25);
      Object var10004 = Registry.emptyArgs();
      var27 = 226341449505323490L;
      Object var26 = var10004;
      var10004 = Ref.h(226341449505323490L, var26, var27);

      try {
         var10004 = (com.finalshell.ui.frame.MainFrame)var10004;
      } catch (InvocationTargetException var71) {
         throw var71.getTargetException();
      }

      com.finalshell.ui.frame.MainFrame var2 = var10004;
      ConnectionProperty var10005 = (ConnectionProperty)(Registry.emptyArgs());
      long var29 = 179934491990092343L;
      Object var28 = var10005;
      var10005 = Ref.h(179934491990092343L, var28, var29);

      try {
         var10005 = (ConnectionProperty)var10005;
      } catch (InvocationTargetException var70) {
         throw var70.getTargetException();
      }

      ConnectionProperty var3 = var10005;
      if (var2 != null && var0 != null) {
         Registry.emptyArgs();
         long var30 = 270389152141252877L;
         Ref.h2(270389152141252877L, var30);
         Object[] var10007 = Registry.emptyArgs();
         long var33 = 410905379772103887L;
         Object[] var32 = var10007;
         Ref.h(410905379772103887L, var32, var33);
         Lv4_2 var10008 = (Lv4_2)(Registry.packArgs(var0));
         long var35 = 343419559142469673L;
         var34 = var10008;
         var10008 = Ref.h(343419559142469673L, var34, var35);

         try {
            var10008 = (Lv4_2)var10008;
         } catch (InvocationTargetException var69) {
            throw var69.getTargetException();
         }

         Lv4_2 var5 = var10008;
         if (var5 != null) {
            AM var10009 = (AM)(Registry.emptyArgs());
            long var37 = 303756590022481369L;
            Object var36 = var10009;
            var10009 = Ref.h(303756590022481369L, var36, var37);

            try {
               var10009 = (AM)var10009;
            } catch (InvocationTargetException var68) {
               throw var68.getTargetException();
            }

            AM var6 = var10009;
            T32 var10010 = (T32)(Registry.packArgs(var0));
            long var39 = 616305670692343673L;
            Object var38 = var10010;
            var10010 = Ref.h(616305670692343673L, var38, var39);

            try {
               var10010 = (T32)var10010;
            } catch (InvocationTargetException var67) {
               throw var67.getTargetException();
            }

            label206: {
               label189: {
                  T32 var7 = var10010;
                  if (var1 != null) {
                     if (var7 == null) {
                        break label189;
                     }

                     Object[] var10011 = Registry.packArgs(var7);
                     long var41 = 176011466134249595L;
                     Object[] var40 = var10011;
                     Ref.h(176011466134249595L, var40, var41);

                     try {
                        ;
                     } catch (InvocationTargetException var66) {
                        throw var66.getTargetException();
                     }
                  }

                  if (var1 != null) {
                     break label206;
                  }
               }

               label208: {
                  var10010 = var3;
                  if (var1 != null) {
                     if (var3 != null) {
                        break label208;
                     }

                     var10010 = var6;
                     Object[] var91 = Registry.emptyArgs();
                     long var43 = 194560825135347400L;
                     Object[] var42 = var91;
                     Ref.h(194560825135347400L, var42, var43);
                     Object[] var10012 = Registry.emptyArgs();
                     var45 = 424156930953488367L;
                     Object[] var44 = var10012;
                     Ref.h(424156930953488367L, var44, var45);

                     try {
                        ;
                     } catch (InvocationTargetException var65) {
                        throw var65.getTargetException();
                     }
                  }

                  Object var8 = var10010;
                  if (var1 == null || var8 != null) {
                     ConnectionProperty var92 = (ConnectionProperty)(Registry.emptyArgs());
                     long var47 = 595556246051364370L;
                     Object var46 = var92;
                     var92 = Ref.h(595556246051364370L, var46, var47);

                     try {
                        var92 = (ConnectionProperty)var92;
                     } catch (InvocationTargetException var64) {
                        throw var64.getTargetException();
                     }

                     var3 = var92;
                  }
               }

               Object[] var95 = Registry.packArgs(var3);
               long var49 = 125277304329532808L;
               Object[] var48 = var95;
               Ref.h(125277304329532808L, var48, var49);

               try {
                  ;
               } catch (InvocationTargetException var63) {
                  throw var63.getTargetException();
               }

               Object[] var10013 = Registry.emptyArgs();
               long var51 = 457829551538949090L;
               Object[] var50 = var10013;
               Ref.h(457829551538949090L, var50, var51);

               try {
                  ;
               } catch (InvocationTargetException var62) {
                  throw var62.getTargetException();
               }

               new StringBuilder().append(a(-30319, 8343));
               String var10016 = (String)(Registry.emptyArgs());
               long var53 = 286931176286176762L;
               Object var52 = var10016;
               var10016 = Ref.h(286931176286176762L, var52, var53);

               try {
                  var10016 = (String)var10016;
               } catch (InvocationTargetException var61) {
                  throw var61.getTargetException();
               }

               Object[] var10015 = Registry.packArgs(var5.append((String)var10016).toString());
               long var55 = 519460332647460288L;
               Object[] var54 = var10015;
               Ref.h(519460332647460288L, var54, var55);

               try {
                  ;
               } catch (InvocationTargetException var60) {
                  throw var60.getTargetException();
               }

               var10016 = Registry.emptyArgs();
               long var57 = 176235325809488947L;
               Object var56 = var10016;
               Ref.h(176235325809488947L, var56, var57);

               try {
                  ;
               } catch (InvocationTargetException var59) {
                  throw var59.getTargetException();
               }
            }

            ((C5)Registry.lookupField(299249922317273977L).get(null)).setVisible(false);
         }
      }
   }

   public static void l(KV var0, String var1) {
      Object[] var27;
      long var34;
      Object[] var45;
      boolean var81;
      Ky4[] var2 = N();
      Registry.emptyArgs();
      long var11 = 270389152141252877L;
      Ref.h2(270389152141252877L, var11);

      try {
         ;
      } catch (InvocationTargetException var78) {
         throw var78.getTargetException();
      }

      if (var2 != null) {
         Object[] var10002 = Registry.emptyArgs();
         long var14 = 163462326892114024L;
         Object[] var13 = var10002;
         Ref.h(163462326892114024L, var13, var14);
         Object var10003 = Registry.emptyArgs();
         long var16 = 633712494917113170L;
         Object var15 = var10003;
         var10003 = Ref.h(633712494917113170L, var15, var16);

         try {
            var81 = (Boolean)var10003;
         } catch (InvocationTargetException var77) {
            throw var77.getTargetException();
         }

         if (var81) {
            if (var0 != null) {
               Registry.emptyArgs();
               long var21 = 270389152141252877L;
               Ref.h2(270389152141252877L, var21);
               Object[] var10005 = Registry.emptyArgs();
               long var24 = 634817973682994708L;
               Object[] var23 = var10005;
               Ref.h(634817973682994708L, var23, var24);
               Object[] var10006 = Registry.emptyArgs();
               long var26 = 240567170779145617L;
               Object[] var25 = var10006;
               Ref.h(240567170779145617L, var25, var26);
               Object var10007 = Registry.emptyArgs();
               long var28 = 226341449505323490L;
               var27 = var10007;
               var10007 = Ref.h(226341449505323490L, var27, var28);

               try {
                  var10007 = (com.finalshell.ui.frame.MainFrame)var10007;
               } catch (InvocationTargetException var74) {
                  throw var74.getTargetException();
               }

               com.finalshell.ui.frame.MainFrame var3 = var10007;
               ConnectionProperty var10008 = (ConnectionProperty)(Registry.emptyArgs());
               long var30 = 179934491990092343L;
               Object var29 = var10008;
               var10008 = Ref.h(179934491990092343L, var29, var30);

               try {
                  var10008 = (ConnectionProperty)var10008;
               } catch (InvocationTargetException var73) {
                  throw var73.getTargetException();
               }

               ConnectionProperty var4 = var10008;
               if (var3 != null && var1 != null) {
                  Registry.emptyArgs();
                  long var31 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var31);
                  Object[] var10010 = Registry.emptyArgs();
                  var34 = 410905379772103887L;
                  Object[] var33 = var10010;
                  Ref.h(410905379772103887L, var33, var34);
                  Lv4_2 var10011 = (Lv4_2)(Registry.packArgs(var1));
                  long var36 = 343419559142469673L;
                  Object var35 = var10011;
                  var10011 = Ref.h(343419559142469673L, var35, var36);

                  try {
                     var10011 = (Lv4_2)var10011;
                  } catch (InvocationTargetException var72) {
                     throw var72.getTargetException();
                  }

                  Lv4_2 var6 = var10011;
                  if (var6 != null) {
                     Object[] var10012 = Registry.emptyArgs();
                     long var38 = 303756590022481369L;
                     Object[] var37 = var10012;
                     Ref.h(303756590022481369L, var37, var38);

                     try {
                        ;
                     } catch (InvocationTargetException var71) {
                        throw var71.getTargetException();
                     }

                     T32 var10013 = (T32)(Registry.packArgs(var1));
                     long var40 = 536963842591527722L;
                     Object var39 = var10013;
                     var10013 = Ref.h(536963842591527722L, var39, var40);

                     try {
                        var10013 = (T32)var10013;
                     } catch (InvocationTargetException var70) {
                        throw var70.getTargetException();
                     }

                     label220: {
                        label198: {
                           T32 var8 = var10013;
                           if (var2 != null) {
                              if (var8 == null) {
                                 break label198;
                              }

                              Object[] var10014 = Registry.packArgs(var8);
                              long var42 = 176011466134249595L;
                              Object[] var41 = var10014;
                              Ref.h(176011466134249595L, var41, var42);

                              try {
                                 ;
                              } catch (InvocationTargetException var69) {
                                 throw var69.getTargetException();
                              }
                           }

                           if (var2 != null) {
                              break label220;
                           }
                        }

                        ConnectionProperty var90 = var4;
                        if (var2 != null) {
                           if (var4 == null) {
                              Object[] var91 = Registry.emptyArgs();
                              long var44 = 194560825135347400L;
                              Object[] var43 = var91;
                              Ref.h(194560825135347400L, var43, var44);
                              F8 var10015 = (F8)(Registry.emptyArgs());
                              long var46 = 424156930953488367L;
                              var45 = var10015;
                              var10015 = Ref.h(424156930953488367L, var45, var46);

                              try {
                                 var10015 = (F8)var10015;
                              } catch (InvocationTargetException var68) {
                                 throw var68.getTargetException();
                              }

                              F8 var9 = var10015;
                              if (var2 == null || var9 != null) {
                                 ConnectionProperty var10016 = (ConnectionProperty)(Registry.emptyArgs());
                                 long var48 = 595556246051364370L;
                                 Object var47 = var10016;
                                 var10016 = Ref.h(595556246051364370L, var47, var48);

                                 try {
                                    var10016 = (ConnectionProperty)var10016;
                                 } catch (InvocationTargetException var67) {
                                    throw var67.getTargetException();
                                 }

                                 var4 = var10016;
                              }
                           }

                           var90 = var4;
                        }

                        if (var90 != null) {
                           Object[] var92 = Registry.packArgs(var1, var4);
                           long var50 = 505125595265089083L;
                           Object[] var49 = var92;
                           Ref.h(505125595265089083L, var49, var50);

                           try {
                              ;
                           } catch (InvocationTargetException var66) {
                              throw var66.getTargetException();
                           }

                           Object[] var95 = Registry.emptyArgs();
                           long var52 = 327243143062390986L;
                           Object[] var51 = var95;
                           Ref.h(327243143062390986L, var51, var52);

                           try {
                              ;
                           } catch (InvocationTargetException var65) {
                              throw var65.getTargetException();
                           }

                           new StringBuilder().append(a(-30329, 31290));
                           String var10018 = (String)(Registry.emptyArgs());
                           long var54 = 286931176286176762L;
                           Object var53 = var10018;
                           var10018 = Ref.h(286931176286176762L, var53, var54);

                           try {
                              var10018 = (String)var10018;
                           } catch (InvocationTargetException var64) {
                              throw var64.getTargetException();
                           }

                           Object[] var10017 = Registry.packArgs(var6.append((String)var10018).toString());
                           long var56 = 519460332647460288L;
                           Object[] var55 = var10017;
                           Ref.h(519460332647460288L, var55, var56);

                           try {
                              ;
                           } catch (InvocationTargetException var63) {
                              throw var63.getTargetException();
                           }

                           var10018 = Registry.emptyArgs();
                           long var58 = 176235325809488947L;
                           Object var57 = var10018;
                           Ref.h(176235325809488947L, var57, var58);

                           try {
                              ;
                           } catch (InvocationTargetException var62) {
                              throw var62.getTargetException();
                           }

                           var4.M$Ty_2();
                           Object[] var10019 = Registry.packArgs(true);
                           long var60 = 307806728445309055L;
                           Object[] var59 = var10019;
                           Ref.h(307806728445309055L, var59, var60);

                           try {
                              ;
                           } catch (InvocationTargetException var61) {
                              throw var61.getTargetException();
                           }
                        }
                     }

                     ((C5)Registry.lookupField(299249922317273977L).get(null)).setVisible(false);
                  }
               }
            }

            return;
         }

         Registry.emptyArgs();
         long var17 = 270389152141252877L;
         Ref.h2(270389152141252877L, var17);

         try {
            ;
         } catch (InvocationTargetException var76) {
            throw var76.getTargetException();
         }
      }

      Object[] var79 = Registry.emptyArgs();
      long var20 = 248890456776257543L;
      Object[] var19 = var79;
      Ref.h(248890456776257543L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var75) {
         throw var75.getTargetException();
      }
   }

   public void J(KV var1, String var2) {
      N();
      long var7 = 447445157306867736L;
      Ref.s(447445157306867736L, var2, var7);
      long var9 = 566743455951098104L;
      Ref.s(566743455951098104L, var1, var9);
      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 634817973682994708L;
      Object[] var12 = var10004;
      Ref.h(634817973682994708L, var12, var13);
      Object[] var10005 = Registry.emptyArgs();
      long var15 = 240567170779145617L;
      Object[] var14 = var10005;
      Ref.h(240567170779145617L, var14, var15);
      Object var10006 = Registry.emptyArgs();
      long var17 = 402818413346430437L;
      Object var16 = var10006;
      var10006 = Ref.h(402818413346430437L, var16, var17);

      try {
         var10006 = (com.finalshell.ui.frame.MainFrame)var10006;
      } catch (InvocationTargetException var53) {
         throw var53.getTargetException();
      }

      com.finalshell.ui.frame.MainFrame var4 = var10006;
      if (this == null || var4 != null) {
         F8 var10007 = (F8)(Registry.emptyArgs());
         long var19 = 345201862285199517L;
         Object var18 = var10007;
         var10007 = Ref.h(345201862285199517L, var18, var19);

         try {
            var10007 = (F8)var10007;
         } catch (InvocationTargetException var52) {
            throw var52.getTargetException();
         }

         F8 var5 = var10007;
         F8 var58 = var5;
         if (this != null) {
            if (var5 == null) {
               return;
            }

            var58 = var5;
         }

         boolean var59 = var58.getClass().equals(ConnectionProperty.class);
         if (this != null) {
            if (var59) {
               Object var20 = 461309651596412572L;
               ((JButton)Ref.g(461309651596412572L, var20)).setEnabled(true);
               Object var22 = 323808653284443090L;
               ((JButton)Ref.g(323808653284443090L, var22)).setEnabled(true);
               Object var24 = 324428301021097377L;
               ((JButton)Ref.g(324428301021097377L, var24)).setEnabled(true);
               Object var26 = 595726637974712292L;
               ((JButton)Ref.g(595726637974712292L, var26)).setEnabled(true);
               if (this != null) {
                  return;
               }
            }

            var59 = var5.getClass().equals(F5.class);
         }

         if (this != null) {
            if (var59) {
               Object var28 = 461309651596412572L;
               ((JButton)Ref.g(461309651596412572L, var28)).setEnabled(false);
               Object var30 = 323808653284443090L;
               ((JButton)Ref.g(323808653284443090L, var30)).setEnabled(false);
               Object var32 = 324428301021097377L;
               ((JButton)Ref.g(324428301021097377L, var32)).setEnabled(false);
               Object var34 = 595726637974712292L;
               ((JButton)Ref.g(595726637974712292L, var34)).setEnabled(false);
               if (this != null) {
                  return;
               }
            }

            var59 = var5.getClass().equals(CT.class);
         }

         if (this != null) {
            if (var59) {
               Object var36 = 461309651596412572L;
               ((JButton)Ref.g(461309651596412572L, var36)).setEnabled(false);
               Object var38 = 323808653284443090L;
               ((JButton)Ref.g(323808653284443090L, var38)).setEnabled(true);
               Object var40 = 324428301021097377L;
               ((JButton)Ref.g(324428301021097377L, var40)).setEnabled(false);
               Object var42 = 595726637974712292L;
               ((JButton)Ref.g(595726637974712292L, var42)).setEnabled(false);
               if (this != null) {
                  return;
               }
            }

            var59 = var5.getClass().equals(CE.class);
         }

         if (var59) {
            Object var44 = 461309651596412572L;
            ((JButton)Ref.g(461309651596412572L, var44)).setEnabled(false);
            Object var46 = 323808653284443090L;
            ((JButton)Ref.g(323808653284443090L, var46)).setEnabled(false);
            Object var48 = 324428301021097377L;
            ((JButton)Ref.g(324428301021097377L, var48)).setEnabled(false);
            Object var50 = 595726637974712292L;
            ((JButton)Ref.g(595726637974712292L, var50)).setEnabled(true);
         }
      }
   }

   public static JButton P(String var0) {
      JButton var1 = new JButton(var0);
      var1.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      var1.setForeground(new Color(a(20616, 5117041513940854332L), a(18100, 6965071998835503107L), a(18100, 6965071998835503107L)));
      var1.addActionListener(new Cw2());
      return var1;
   }

   public KV k() {
      Object var1 = 566743455951098104L;
      return (KV)Ref.g(566743455951098104L, var1);
   }

   public void g(KV var1) {
      long var3 = 566743455951098104L;
      Ref.s(566743455951098104L, var1, var3);
   }

   public String o() {
      Object var1 = 447445157306867736L;
      return (String)Ref.g(447445157306867736L, var1);
   }

   public void v(String var1) {
      long var3 = 447445157306867736L;
      Ref.s(447445157306867736L, var1, var3);
   }

   public static void U(Ky4[] var0) {
      u = var0;
   }

   public static Ky4[] N() {
      return u;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -30313) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 83;
               break;
            case 1:
               var10000 = 144;
               break;
            case 2:
               var10000 = 155;
               break;
            case 3:
               var10000 = 121;
               break;
            case 4:
               var10000 = 162;
               break;
            case 5:
               var10000 = 51;
               break;
            case 6:
               var10000 = 182;
               break;
            case 7:
               var10000 = 9;
               break;
            case 8:
               var10000 = 219;
               break;
            case 9:
               var10000 = 56;
               break;
            case 10:
               var10000 = 132;
               break;
            case 11:
               var10000 = 78;
               break;
            case 12:
               var10000 = 137;
               break;
            case 13:
               var10000 = 223;
               break;
            case 14:
               var10000 = 225;
               break;
            case 15:
               var10000 = 22;
               break;
            case 16:
               var10000 = 59;
               break;
            case 17:
               var10000 = 135;
               break;
            case 18:
               var10000 = 92;
               break;
            case 19:
               var10000 = 204;
               break;
            case 20:
               var10000 = 16;
               break;
            case 21:
               var10000 = 10;
               break;
            case 22:
               var10000 = 251;
               break;
            case 23:
               var10000 = 40;
               break;
            case 24:
               var10000 = 220;
               break;
            case 25:
               var10000 = 172;
               break;
            case 26:
               var10000 = 243;
               break;
            case 27:
               var10000 = 128;
               break;
            case 28:
               var10000 = 252;
               break;
            case 29:
               var10000 = 119;
               break;
            case 30:
               var10000 = 153;
               break;
            case 31:
               var10000 = 31;
               break;
            case 32:
               var10000 = 87;
               break;
            case 33:
               var10000 = 170;
               break;
            case 34:
               var10000 = 80;
               break;
            case 35:
               var10000 = 125;
               break;
            case 36:
               var10000 = 1;
               break;
            case 37:
               var10000 = 130;
               break;
            case 38:
               var10000 = 23;
               break;
            case 39:
               var10000 = 43;
               break;
            case 40:
               var10000 = 165;
               break;
            case 41:
               var10000 = 47;
               break;
            case 42:
               var10000 = 133;
               break;
            case 43:
               var10000 = 103;
               break;
            case 44:
               var10000 = 228;
               break;
            case 45:
               var10000 = 136;
               break;
            case 46:
               var10000 = 42;
               break;
            case 47:
               var10000 = 235;
               break;
            case 48:
               var10000 = 245;
               break;
            case 49:
               var10000 = 72;
               break;
            case 50:
               var10000 = 70;
               break;
            case 51:
               var10000 = 25;
               break;
            case 52:
               var10000 = 205;
               break;
            case 53:
               var10000 = 138;
               break;
            case 54:
               var10000 = 139;
               break;
            case 55:
               var10000 = 30;
               break;
            case 56:
               var10000 = 113;
               break;
            case 57:
               var10000 = 7;
               break;
            case 58:
               var10000 = 100;
               break;
            case 59:
               var10000 = 33;
               break;
            case 60:
               var10000 = 239;
               break;
            case 61:
               var10000 = 35;
               break;
            case 62:
               var10000 = 73;
               break;
            case 63:
               var10000 = 99;
               break;
            case 64:
               var10000 = 233;
               break;
            case 65:
               var10000 = 46;
               break;
            case 66:
               var10000 = 14;
               break;
            case 67:
               var10000 = 117;
               break;
            case 68:
               var10000 = 108;
               break;
            case 69:
               var10000 = 148;
               break;
            case 70:
               var10000 = 216;
               break;
            case 71:
               var10000 = 49;
               break;
            case 72:
               var10000 = 179;
               break;
            case 73:
               var10000 = 217;
               break;
            case 74:
               var10000 = 105;
               break;
            case 75:
               var10000 = 254;
               break;
            case 76:
               var10000 = 214;
               break;
            case 77:
               var10000 = 190;
               break;
            case 78:
               var10000 = 52;
               break;
            case 79:
               var10000 = 0;
               break;
            case 80:
               var10000 = 195;
               break;
            case 81:
               var10000 = 129;
               break;
            case 82:
               var10000 = 145;
               break;
            case 83:
               var10000 = 98;
               break;
            case 84:
               var10000 = 63;
               break;
            case 85:
               var10000 = 122;
               break;
            case 86:
               var10000 = 75;
               break;
            case 87:
               var10000 = 64;
               break;
            case 88:
               var10000 = 227;
               break;
            case 89:
               var10000 = 15;
               break;
            case 90:
               var10000 = 154;
               break;
            case 91:
               var10000 = 76;
               break;
            case 92:
               var10000 = 127;
               break;
            case 93:
               var10000 = 66;
               break;
            case 94:
               var10000 = 209;
               break;
            case 95:
               var10000 = 156;
               break;
            case 96:
               var10000 = 173;
               break;
            case 97:
               var10000 = 29;
               break;
            case 98:
               var10000 = 107;
               break;
            case 99:
               var10000 = 8;
               break;
            case 100:
               var10000 = 4;
               break;
            case 101:
               var10000 = 164;
               break;
            case 102:
               var10000 = 68;
               break;
            case 103:
               var10000 = 41;
               break;
            case 104:
               var10000 = 161;
               break;
            case 105:
               var10000 = 157;
               break;
            case 106:
               var10000 = 48;
               break;
            case 107:
               var10000 = 222;
               break;
            case 108:
               var10000 = 126;
               break;
            case 109:
               var10000 = 185;
               break;
            case 110:
               var10000 = 198;
               break;
            case 111:
               var10000 = 249;
               break;
            case 112:
               var10000 = 12;
               break;
            case 113:
               var10000 = 88;
               break;
            case 114:
               var10000 = 38;
               break;
            case 115:
               var10000 = 101;
               break;
            case 116:
               var10000 = 97;
               break;
            case 117:
               var10000 = 187;
               break;
            case 118:
               var10000 = 241;
               break;
            case 119:
               var10000 = 231;
               break;
            case 120:
               var10000 = 95;
               break;
            case 121:
               var10000 = 166;
               break;
            case 122:
               var10000 = 5;
               break;
            case 123:
               var10000 = 210;
               break;
            case 124:
               var10000 = 184;
               break;
            case 125:
               var10000 = 94;
               break;
            case 126:
               var10000 = 232;
               break;
            case 127:
               var10000 = 171;
               break;
            case 128:
               var10000 = 26;
               break;
            case 129:
               var10000 = 32;
               break;
            case 130:
               var10000 = 36;
               break;
            case 131:
               var10000 = 230;
               break;
            case 132:
               var10000 = 84;
               break;
            case 133:
               var10000 = 158;
               break;
            case 134:
               var10000 = 21;
               break;
            case 135:
               var10000 = 58;
               break;
            case 136:
               var10000 = 50;
               break;
            case 137:
               var10000 = 189;
               break;
            case 138:
               var10000 = 111;
               break;
            case 139:
               var10000 = 93;
               break;
            case 140:
               var10000 = 62;
               break;
            case 141:
               var10000 = 163;
               break;
            case 142:
               var10000 = 207;
               break;
            case 143:
               var10000 = 229;
               break;
            case 144:
               var10000 = 140;
               break;
            case 145:
               var10000 = 28;
               break;
            case 146:
               var10000 = 221;
               break;
            case 147:
               var10000 = 37;
               break;
            case 148:
               var10000 = 213;
               break;
            case 149:
               var10000 = 199;
               break;
            case 150:
               var10000 = 39;
               break;
            case 151:
               var10000 = 45;
               break;
            case 152:
               var10000 = 201;
               break;
            case 153:
               var10000 = 238;
               break;
            case 154:
               var10000 = 188;
               break;
            case 155:
               var10000 = 255;
               break;
            case 156:
               var10000 = 250;
               break;
            case 157:
               var10000 = 116;
               break;
            case 158:
               var10000 = 79;
               break;
            case 159:
               var10000 = 240;
               break;
            case 160:
               var10000 = 242;
               break;
            case 161:
               var10000 = 74;
               break;
            case 162:
               var10000 = 65;
               break;
            case 163:
               var10000 = 218;
               break;
            case 164:
               var10000 = 114;
               break;
            case 165:
               var10000 = 215;
               break;
            case 166:
               var10000 = 183;
               break;
            case 167:
               var10000 = 234;
               break;
            case 168:
               var10000 = 89;
               break;
            case 169:
               var10000 = 253;
               break;
            case 170:
               var10000 = 104;
               break;
            case 171:
               var10000 = 54;
               break;
            case 172:
               var10000 = 236;
               break;
            case 173:
               var10000 = 142;
               break;
            case 174:
               var10000 = 44;
               break;
            case 175:
               var10000 = 211;
               break;
            case 176:
               var10000 = 149;
               break;
            case 177:
               var10000 = 120;
               break;
            case 178:
               var10000 = 193;
               break;
            case 179:
               var10000 = 85;
               break;
            case 180:
               var10000 = 194;
               break;
            case 181:
               var10000 = 174;
               break;
            case 182:
               var10000 = 19;
               break;
            case 183:
               var10000 = 24;
               break;
            case 184:
               var10000 = 53;
               break;
            case 185:
               var10000 = 18;
               break;
            case 186:
               var10000 = 176;
               break;
            case 187:
               var10000 = 150;
               break;
            case 188:
               var10000 = 3;
               break;
            case 189:
               var10000 = 110;
               break;
            case 190:
               var10000 = 192;
               break;
            case 191:
               var10000 = 247;
               break;
            case 192:
               var10000 = 20;
               break;
            case 193:
               var10000 = 11;
               break;
            case 194:
               var10000 = 112;
               break;
            case 195:
               var10000 = 169;
               break;
            case 196:
               var10000 = 6;
               break;
            case 197:
               var10000 = 96;
               break;
            case 198:
               var10000 = 141;
               break;
            case 199:
               var10000 = 91;
               break;
            case 200:
               var10000 = 224;
               break;
            case 201:
               var10000 = 106;
               break;
            case 202:
               var10000 = 159;
               break;
            case 203:
               var10000 = 206;
               break;
            case 204:
               var10000 = 86;
               break;
            case 205:
               var10000 = 151;
               break;
            case 206:
               var10000 = 71;
               break;
            case 207:
               var10000 = 186;
               break;
            case 208:
               var10000 = 181;
               break;
            case 209:
               var10000 = 146;
               break;
            case 210:
               var10000 = 61;
               break;
            case 211:
               var10000 = 81;
               break;
            case 212:
               var10000 = 109;
               break;
            case 213:
               var10000 = 102;
               break;
            case 214:
               var10000 = 177;
               break;
            case 215:
               var10000 = 60;
               break;
            case 216:
               var10000 = 82;
               break;
            case 217:
               var10000 = 212;
               break;
            case 218:
               var10000 = 244;
               break;
            case 219:
               var10000 = 197;
               break;
            case 220:
               var10000 = 57;
               break;
            case 221:
               var10000 = 202;
               break;
            case 222:
               var10000 = 13;
               break;
            case 223:
               var10000 = 55;
               break;
            case 224:
               var10000 = 168;
               break;
            case 225:
               var10000 = 226;
               break;
            case 226:
               var10000 = 123;
               break;
            case 227:
               var10000 = 115;
               break;
            case 228:
               var10000 = 27;
               break;
            case 229:
               var10000 = 208;
               break;
            case 230:
               var10000 = 134;
               break;
            case 231:
               var10000 = 237;
               break;
            case 232:
               var10000 = 191;
               break;
            case 233:
               var10000 = 200;
               break;
            case 234:
               var10000 = 246;
               break;
            case 235:
               var10000 = 34;
               break;
            case 236:
               var10000 = 175;
               break;
            case 237:
               var10000 = 160;
               break;
            case 238:
               var10000 = 17;
               break;
            case 239:
               var10000 = 178;
               break;
            case 240:
               var10000 = 167;
               break;
            case 241:
               var10000 = 69;
               break;
            case 242:
               var10000 = 143;
               break;
            case 243:
               var10000 = 118;
               break;
            case 244:
               var10000 = 77;
               break;
            case 245:
               var10000 = 90;
               break;
            case 246:
               var10000 = 180;
               break;
            case 247:
               var10000 = 152;
               break;
            case 248:
               var10000 = 248;
               break;
            case 249:
               var10000 = 67;
               break;
            case 250:
               var10000 = 2;
               break;
            case 251:
               var10000 = 147;
               break;
            case 252:
               var10000 = 196;
               break;
            case 253:
               var10000 = 131;
               break;
            case 254:
               var10000 = 124;
               break;
            default:
               var10000 = 203;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30395;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      byte var27;
      char[] var34;
      String var45;
      String[] var13 = new String[28];
      Ky4[] var10000 = new Ky4[4];
      int var11 = 0;
      String var10 = "ï GZÿ`6\u0095\u000f¥yÈ©\u0016\u000e\u009aÕíä.³\fkLz\u009574m\u0005腚寙丏务郢\u000e»\u000eúôJ\u000f÷>3{\u0091\u0015\u001dÀ\u000eä\\\"Õ×\u00913«¯bm0+\t\u000ex©\u0082\u0000E\u0091\u0016í\u000f\u0001\u0016Zí)\u0005簮织会恀Ï\u000el\t6\u007fðÄ×\u000137þ\u009aY\\\b\u0087TJÔ^±\u0002¯\bÈ%^g7\u001dÝO\u0004仴杣揚鑪\u0003迩窸\n\u0004罧縐盼挑\u0005膼宍仓别遹\u000e\u009e\"i\u001a:h\u008e\u0094\u0018\u0085\u009bÌõ\u0096\u0004途廖涏讎\u0003缽红K\u0012\"¹\u0003ô\u009co¨\n\u0091ÞÃãÛ\u0002\u0083R2õ\u0004赥疓迹躼\u0004轖窆筱瑏\u000f5º+bpÝ°tÍ0\u0089~|¯\u001b\u0004kS/Õ\u0004ÀQZ\u0095\u000f?æY\u0082¸\u007fÞò\u0012IÚUÝ¥I\u001aPï\u0087Èå\u0088\u0002Î\u008deFÖç¸\nÄ¾®\u008fx¿Vñ1Jç\rÁ\u0004µµ£tÚx\u0094±gNÁ";
      int var12 = "ï GZÿ`6\u0095\u000f¥yÈ©\u0016\u000e\u009aÕíä.³\fkLz\u009574m\u0005腚寙丏务郢\u000e»\u000eúôJ\u000f÷>3{\u0091\u0015\u001dÀ\u000eä\\\"Õ×\u00913«¯bm0+\t\u000ex©\u0082\u0000E\u0091\u0016í\u000f\u0001\u0016Zí)\u0005簮织会恀Ï\u000el\t6\u007fðÄ×\u000137þ\u009aY\\\b\u0087TJÔ^±\u0002¯\bÈ%^g7\u001dÝO\u0004仴杣揚鑪\u0003迩窸\n\u0004罧縐盼挑\u0005膼宍仓别遹\u000e\u009e\"i\u001a:h\u008e\u0094\u0018\u0085\u009bÌõ\u0096\u0004途廖涏讎\u0003缽红K\u0012\"¹\u0003ô\u009co¨\n\u0091ÞÃãÛ\u0002\u0083R2õ\u0004赥疓迹躼\u0004轖窆筱瑏\u000f5º+bpÝ°tÍ0\u0089~|¯\u001b\u0004kS/Õ\u0004ÀQZ\u0095\u000f?æY\u0082¸\u007fÞò\u0012IÚUÝ¥I\u001aPï\u0087Èå\u0088\u0002Î\u008deFÖç¸\nÄ¾®\u008fx¿Vñ1Jç\rÁ\u0004µµ£tÚx\u0094±gNÁ"
         .length();
      U(var10000);
      char var9 = 14;
      int var17 = -1;

      label70:
      while (true) {
         byte var18 = 47;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var40 = var10001.toCharArray();
               int var10004 = var40.length;
               int var14 = 0;
               byte var43 = var18;
               var34 = var40;
               int var25 = var10004;
               byte var50;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var40;
                  var50 = var18;
                  var10006 = var14;
               } else {
                  var43 = var18;
                  var25 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var56 = var40;
                  var50 = var18;
                  var10006 = var14;
               }

               while (true) {
                  char var65 = var56[var10006];
                  byte var66;
                  switch (var14 % 7) {
                     case 0:
                        var66 = 113;
                        break;
                     case 1:
                        var66 = 35;
                        break;
                     case 2:
                        var66 = 94;
                        break;
                     case 3:
                        var66 = 93;
                        break;
                     case 4:
                        var66 = 125;
                        break;
                     case 5:
                        var66 = 74;
                        break;
                     default:
                        var66 = 1;
                  }

                  var56[var10006] = (char)(var65 ^ var50 ^ var66);
                  var14++;
                  if (var43 == 0) {
                     var10006 = var43;
                     var56 = var34;
                     var50 = var43;
                  } else {
                     if (var25 <= var14) {
                        break;
                     }

                     var56 = var34;
                     var50 = var43;
                     var10006 = var14;
                  }
               }
            }

            var45 = new String(var34).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var45;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     c = new String[28];
                     long var0 = 5722659584347348947L;
                     long[] var6 = new long[22];
                     int var3 = 0;
                     String var4 = "Gó\u001e\u0088Ñ½ó\b\u0094S,\u009e\u0082>±\u0015c\u0098*ü\u000b'\u0005Ì\nÈ\u00832\u009f°M\u0099\u0091¬ÅoX±ªìwà¾~Z¢\u009a%\u0086\u0015æ¾Ì\u000f\"\u0010µ2³¬\u008fzñÜ ·²1\u009eB\u009dnä\u008eø+ø÷áäp\u0085\u0006\u0094ÄI\u0093O_§\u0092æðß¢\u009c\ff7 ú\u001e/\u0080G\u0013Á\u001e,\u0099ýêín¤6~¥y\u000eÔOAR$Ý9¿¢®Û\u009fivý$¿ÞØ\u0098q?º\thz\u009e,é\u0018Þê²cÏx|%\u0082ï";
                     int var5 = "Gó\u001e\u0088Ñ½ó\b\u0094S,\u009e\u0082>±\u0015c\u0098*ü\u000b'\u0005Ì\nÈ\u00832\u009f°M\u0099\u0091¬ÅoX±ªìwà¾~Z¢\u009a%\u0086\u0015æ¾Ì\u000f\"\u0010µ2³¬\u008fzñÜ ·²1\u009eB\u009dnä\u008eø+ø÷áäp\u0085\u0006\u0094ÄI\u0093O_§\u0092æðß¢\u009c\ff7 ú\u001e/\u0080G\u0013Á\u001e,\u0099ýêín¤6~¥y\u000eÔOAR$Ý9¿¢®Û\u009fivý$¿ÞØ\u0098q?º\thz\u009e,é\u0018Þê²cÏx|%\u0082ï"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        long[] var20 = var6;
                        int var28 = var3++;
                        long var38 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while (true) {
                           long var55 = var38 ^ var0;
                           switch (var46) {
                              case 0:
                                 var20[var28] = var55;
                                 if (var2 >= var5) {
                                    d = var6;
                                    e = new Integer[22];
                                    return;
                                 }
                                 break;
                              default:
                                 var20[var28] = var55;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "µrR(ÒÄ\u008b¥ôÆ ýÀ4\u008aú";
                                 var5 = "µrR(ÒÄ\u008b¥ôÆ ýÀ4\u008aú".length();
                                 var2 = 0;
                           }

                           byte var29 = var2;
                           var2 += 8;
                           var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                           var20 = var6;
                           var28 = var3++;
                           var38 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var45;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "\t`iüýËÄd\u0090\u0012 úî\u001f\bì\u001b\u001feÚ\u0098¥:";
                  var12 = "\t`iüýËÄd\u0090\u0012 úî\u001f\bì\u001b\u001feÚ\u0098¥:".length();
                  var9 = 14;
                  var17 = -1;
            }

            var18 = 99;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





