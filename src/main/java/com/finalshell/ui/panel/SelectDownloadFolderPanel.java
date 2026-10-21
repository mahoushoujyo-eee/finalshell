package com.finalshell.ui.panel;

import com.finalshell.core.C;
import com.finalshell.core.C_C;
import com.finalshell.core.Cq2;
import com.finalshell.core.DT;
import com.finalshell.core.FX3;
import com.finalshell.core.U62;
import com.finalshell.core.UY3;
import com.finalshell.core.VO;
import com.finalshell.core.Y12_2;
import com.finalshell.core.YI;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.J8;
import com.finalshell.task.OT;
import com.finalshell.ui.dialog.C5;
import com.finalshell.ui.dialog.EditorSelectionDialog;
import com.finalshell.ui.listener.De2;
import com.finalshell.ui.listener.FM3;
import com.finalshell.ui.listener.KQ3;
import com.finalshell.ui.listener.LP_3;
import com.finalshell.ui.listener.Pc;
import com.finalshell.ui.listener.QV;
import com.finalshell.ui.listener.Te2;
import com.finalshell.ui.listener.Xy_2;
import com.finalshell.ui.model.Fr4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

public class SelectDownloadFolderPanel extends JPanel implements Cq2 {
   public Fr4 A;
   public DT I;
   public boolean l;
   public C_C H;
   public ArrayList s;
   public JPopupMenu a;
   public U62 q;
   public C5 z;
   public static int[] u;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public SelectDownloadFolderPanel(C5 var1) {
      super();
      StringBuilder var29;
      Registry.lookupField(297239574302510705L).setBoolean(this, true);
      ArrayList var10001 = new ArrayList();
      long var16 = 585743319788652558L;
      ArrayList var15 = var10001;
      Ref.s(585743319788652558L, var15, var16);
      long var18 = 534231457215759502L;
      Ref.s(534231457215759502L, var1, var18);
      Registry.emptyArgs();
      long var19 = 270389152141252877L;
      Ref.h2(270389152141252877L, var19);
      Object var10005 = Registry.emptyArgs();
      long var22 = 306266403902896148L;
      Object var21 = var10005;
      var10005 = Ref.h(306266403902896148L, var21, var22);
      long var24 = 269586463206323716L;
      Object var23 = var10005;
      Ref.s(269586463206323716L, var23, var24);
      this.setLayout(new MigLayout(a(-21397, -27528), "", a(-21402, -5789)));
      this.setOpaque(false);
      JPanel var3 = new JPanel();
      var3.setOpaque(false);
      var3.setLayout(new MigLayout(a(-21393, 14737), a(-21394, 2734), a(-21394, 2734)));
      this.add(var3, a(-21404, -22181));
      StringBuilder var10008 = new StringBuilder().append(a(-21385, 30961));
      java.io.File var10009;
      Object var25 = 269586463206323716L;
      Object var10012 = Ref.g(269586463206323716L, var25);
      String var10013 = (String)(Registry.emptyArgs());
      long var28 = 248904686894997647L;
      Object var27 = var10013;
      var10013 = Ref.h(248904686894997647L, var27, var28);

      try {
         var10013 = (String)var10013;
      } catch (InvocationTargetException var98) {
         throw var98.getTargetException();
      }

var10012 = new ArrayList(var10013);
      var10009 = new java.io.File(var10009.append(this.getAbsolutePath()).toString());
      long var30 = 435031631667149019L;
      var29 = var10008;
      Ref.s(435031631667149019L, var29, var30);
      Object var31 = 435031631667149019L;
      C_C var100 = (C_C)Ref.g(435031631667149019L, var31);
      Object var33 = 269586463206323716L;
      Object var10011 = Ref.g(269586463206323716L, var33);
      String var101 = (String)(Registry.emptyArgs());
      long var36 = 248904686894997647L;
      Object var35 = var101;
      var101 = Ref.h(248904686894997647L, var35, var36);

      try {
         var101 = (String)var101;
      } catch (InvocationTargetException var97) {
         throw var97.getTargetException();
      }

      ((C_C)var10011).setToolTipText(var101);
      Object var37 = 435031631667149019L;
      ((C_C)Ref.g(435031631667149019L, var37)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      Object var39 = 435031631667149019L;
      ((C_C)Ref.g(435031631667149019L, var39)).setForeground(new Color(0, 0, 0));
      Object var41 = 435031631667149019L;
      ((C_C)Ref.g(435031631667149019L, var41)).o$void(1);
      Object var43 = 435031631667149019L;
      this.add((C_C)Ref.g(435031631667149019L, var43), a(-21400, 26439));
      Object var45 = 435031631667149019L;
      ((C_C)Ref.g(435031631667149019L, var45)).setLineWrap(true);
      Object var47 = 435031631667149019L;
      ((C_C)Ref.g(435031631667149019L, var47)).setEditable(false);
      Object var49 = 435031631667149019L;
      ((C_C)Ref.g(435031631667149019L, var49)).setOpaque(false);
      Object var51 = 435031631667149019L;
      ((C_C)Ref.g(435031631667149019L, var51)).setLayout(new MigLayout(a(-21407, -4876)));
      Registry.packArgs("\uf0d7");
      long var53 = 378399160856121064L;
      Object var10020 = Ref.h2(378399160856121064L, var53);

      try {
         var10020 = (C)var10020;
      } catch (InvocationTargetException var96) {
         throw var96.getTargetException();
      }

      C var4 = (C)var10020;
      var4.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      var3.add(var4, a(-21387, 15742));
      Registry.packArgs("\uf115");
      long var55 = 378399160856121064L;
      Object var10021 = Ref.h2(378399160856121064L, var55);

      try {
         var10021 = (C)var10021;
      } catch (InvocationTargetException var95) {
         throw var95.getTargetException();
      }

      C var5 = (C)var10021;
      var5.setFont((Font)Registry.lookupField(344087302787482558L).get(null));
      var5.addActionListener(new Te2(this));
      Registry.packArgs("\uf115");
      long var57 = 378399160856121064L;
      Object var10022 = Ref.h2(378399160856121064L, var57);

      try {
         var10022 = (C)var10022;
      } catch (InvocationTargetException var94) {
         throw var94.getTargetException();
      }

      C var6 = (C)var10022;
      JLabel var7 = new JLabel(a(-21395, -20484));
      var7.setForeground(new Color(a(7667, 2102492924628297440L), a(8969, 1261181727877847060L), a(8969, 1261181727877847060L)));
      var3.add(var6, a(-21408, -28960));
      var6.addActionListener(new LP_3(this, var1));
      Registry.packArgs("\uf114");
      long var59 = 378399160856121064L;
      Object var10023 = Ref.h2(378399160856121064L, var59);

      try {
         var10023 = (C)var10023;
      } catch (InvocationTargetException var93) {
         throw var93.getTargetException();
      }

      C var8 = (C)var10023;
      JLabel var9 = new JLabel(a(-21406, 27066));
      O$arrint();
      var9.setForeground(new Color(a(8969, 1261181727877847060L), a(8969, 1261181727877847060L), a(8969, 1261181727877847060L)));
      var3.add(var8, a(-21408, -28960));
      var8.addActionListener(new Xy_2(this));
      JPopupMenu var10025 = new JPopupMenu();
      long var62 = 468326905894456044L;
      JPopupMenu var61 = var10025;
      Ref.s(468326905894456044L, var61, var62);
      Object var63 = 435031631667149019L;
      Object[] var10027 = Registry.packArgs(Ref.g(435031631667149019L, var63));
      long var66 = 342946178954715412L;
      Object[] var65 = var10027;
      Ref.h(342946178954715412L, var65, var66);

      try {
         ;
      } catch (InvocationTargetException var92) {
         throw var92.getTargetException();
      }

      JLabel var10 = new JLabel();
      var10.setText(a(-21398, -1450));
      Y12_2 var10028;
      Object var67 = 468326905894456044L;
      var4 = new String(this, (JPopupMenu)Ref.g(468326905894456044L, var67));
      Y12_2 var11 = var10028;
      var4.addActionListener(new KQ3(this, var11));
      Object var69 = 435031631667149019L;
      C_C var10031 = (C_C)Ref.g(435031631667149019L, var69);
      Object var71 = 468326905894456044L;
var10031 = new LP_3(this, (JPopupMenu)Ref.g(468326905894456044L, var71));
      Object var73 = 435031631667149019L;
      ((C_C)Ref.g(435031631667149019L, var73)).addMouseListener(new com.finalshell.ui.listener.OS(this, this));
      Fr4 var10032 = new Fr4();
      long var76 = 344912960350819457L;
      Fr4 var75 = var10032;
      Ref.s(344912960350819457L, var75, var76);
      DT var10034;
      Object var77 = 344912960350819457L;
      // [VF-super] super(this, (Fr4)Ref.g(344912960350819457L, var77));
      long var80 = 622126560416402693L;
      DT var79 = var10034;
      Ref.s(622126560416402693L, var79, var80);
      Object var81 = 622126560416402693L;
      ((DT)Ref.g(622126560416402693L, var81)).setOpaque(false);
      JScrollPane var10035;
      Object var83 = 622126560416402693L;
      super((DT)Ref.g(622126560416402693L, var83), a(24037, 2327327528598775550L), a(5065, 7197748606806649046L));
      JScrollPane var13 = var10035;
      var13.getViewport().setOpaque(false);
      this.add(var13, a(-21403, 15489));
      var13.addMouseListener(new FM3(this));
      if (Registry.lookupField(297239574302510705L).getBoolean(this)) {
         Registry.emptyArgs();
         long var85 = 270389152141252877L;
         Ref.h2(270389152141252877L, var85);
         Object[] var10037 = Registry.emptyArgs();
         long var88 = 377280722715900564L;
         Object[] var87 = var10037;
         Ref.h(377280722715900564L, var87, var88);
         Object[] var10038 = Registry.packArgs(this);
         long var90 = 374306567729240072L;
         Object[] var89 = var10038;
         Ref.h(374306567729240072L, var89, var90);

         try {
            ;
         } catch (InvocationTargetException var91) {
            throw var91.getTargetException();
         }
      }

      J8 var14 = new J8(this);
      var14.start();
      if (Ky4.F$arrString() != null) {
         g(new int[1]);
      }
   }

   public void F() {
      Integer var26;
      O$arrint();
      Object var5 = 622126560416402693L;
      int var2 = ((DT)Ref.g(622126560416402693L, var5)).getSelectedRow();
      if (var2 > -1) {
         Object var7 = 622126560416402693L;
         Ref.g(622126560416402693L, var7);
         Object var9 = 622126560416402693L;
         YI var10004 = (YI)(Registry.packArgs(((DT)Ref.g(622126560416402693L, var9)).convertRowIndexToModel(var2)));
         long var12 = 314520454321390476L;
         Object var11 = var10004;
         var10004 = Ref.h(314520454321390476L, var11, var12);

         try {
            var10004 = (YI)var10004;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         YI var3 = var10004;
         Object var10005 = Registry.emptyArgs();
         long var14 = 532275517761561192L;
         Object var13 = var10005;
         var10005 = Ref.h(532275517761561192L, var13, var14);

         try {
            var26 = (Integer)var10005;
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         if (var26 == Registry.lookupField(364503691566382472L).getInt(null)) {
            java.io.File var10006;
            String var10008 = (String)(Registry.emptyArgs());
            long var16 = 191716730601734423L;
            Object var15 = var10008;
            var10008 = Ref.h(191716730601734423L, var15, var16);

            try {
               var10008 = (String)var10008;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }

            var3 = new java.io.File(var10008);
            java.io.File var4 = var10006;
            if (this == null && var4.exists()) {
               Registry.packArgs(var4);
               long var17 = 557190378343810325L;
               Object var10007 = Ref.h2(557190378343810325L, var17);

               try {
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }
            }
         }
      }
   }

   public void m() {
      long var26;
      Integer var37;
      boolean var42;
      O$arrint();
      Object var6 = 622126560416402693L;
      int var2 = ((DT)Ref.g(622126560416402693L, var6)).getSelectedRow();
      if (var2 > -1) {
         Object var8 = 622126560416402693L;
         Ref.g(622126560416402693L, var8);
         Object var10 = 622126560416402693L;
         Object[] var10004 = Registry.packArgs(((DT)Ref.g(622126560416402693L, var10)).convertRowIndexToModel(var2));
         long var13 = 314520454321390476L;
         Object[] var12 = var10004;
         Ref.h(314520454321390476L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }

         if (this == null) {
            Object var10005 = Registry.emptyArgs();
            long var15 = 532275517761561192L;
            Object var14 = var10005;
            var10005 = Ref.h(532275517761561192L, var14, var15);

            try {
               var37 = (Integer)var10005;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }

            if (var37 != Registry.lookupField(364503691566382472L).getInt(null)) {
               return;
            }
         }

         String var38 = (String)(Registry.emptyArgs());
         long var17 = 191716730601734423L;
         Object var16 = var38;
         var38 = Ref.h(191716730601734423L, var16, var17);

         try {
            var38 = (String)var38;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         String var4;
         label104: {
            var4 = var38;
            if (this == null) {
               Object var10006 = Registry.emptyArgs();
               long var19 = 161763971655686270L;
               Object var18 = var10006;
               var10006 = Ref.h(161763971655686270L, var18, var19);

               try {
                  var42 = (Boolean)var10006;
               } catch (InvocationTargetException var32) {
                  throw var32.getTargetException();
               }

               if (var42) {
                  break label104;
               }
            }

            String var43 = (String)(Registry.emptyArgs());
            long var21 = 483977999197402540L;
            Object var20 = var43;
            var43 = Ref.h(483977999197402540L, var20, var21);

            try {
               var43 = (String)var43;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }

            var4 = var43;
         }

         java.io.File var5 = new java.io.File(var4);
         Object var46 = var5.exists();
         if (this == null) {
            if (var46 == null) {
               return;
            }

            var46 = Registry.emptyArgs();
            long var22 = 253808553645062345L;
            Object var10007 = Ref.h2(253808553645062345L, var22);

            try {
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }
         }

         if (var46 == null) {
            Registry.packArgs(var5.getAbsolutePath());
            long var24 = 402130946821638998L;
            Ref.h2(402130946821638998L, var24);

            try {
               ;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            if (this == null) {
               return;
            }
         }

         Registry.packArgs(var5.getPath());
         var26 = 555473894912140963L;
         Ref.h2(555473894912140963L, var26);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }
      }
   }

   public void b() {
      Object var9 = 622126560416402693L;
      int[] var2 = ((DT)Ref.g(622126560416402693L, var9)).getSelectedRows();
      ArrayList var3 = new ArrayList();
      int[] var4 = var2;
      int var5 = var2.length;
      int[] var10001 = O$arrint();
      int var6 = 0;
      int[] var1 = var10001;

      while (true) {
         if (var6 < var5) {
            int var7 = var4[var6];
            var10001 = (int[])this;
            Object var11 = 622126560416402693L;
            Ref.g(622126560416402693L, var11);
            Object var13 = 622126560416402693L;
            YI var10004 = (YI)(Registry.packArgs(((DT)Ref.g(622126560416402693L, var13)).convertRowIndexToModel(var7)));
            long var16 = 314520454321390476L;
            Object var15 = var10004;
            var10004 = Ref.h(314520454321390476L, var15, var16);

            try {
               var10004 = (YI)var10004;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }

            YI var8 = var10004;
            if (var1 != null) {
               break;
            }

            var3.add(var8);
            var6++;
            if (var1 == null) {
               continue;
            }
         }

         var10001 = (int[])var3;
         break;
      }

      for (YI var27 : var10001) {
         if (var1 == null) {
            if (var27 != null) {
               Object[] var10002 = Registry.emptyArgs();
               long var18 = 166974543324792064L;
               Object[] var17 = var10002;
               Ref.h(166974543324792064L, var17, var18);

               try {
                  ;
               } catch (InvocationTargetException var24) {
                  throw var24.getTargetException();
               }
            }

            Object var19 = 344912960350819457L;
            Ref.g(344912960350819457L, var19);
            Object[] var10003 = Registry.packArgs(var27);
            long var22 = 248427345189412900L;
            Object[] var21 = var10003;
            Ref.h(248427345189412900L, var21, var22);

            try {
               ;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public void Q() {
      ArrayList var2 = new ArrayList();
      O$arrint();
      Object var7 = 622126560416402693L;
      int var3 = ((DT)Ref.g(622126560416402693L, var7)).getModel().getRowCount();
      SelectDownloadFolderPanel var1 = this;
      int var4 = 0;

      while (var4 < var3) {
         Object var9 = 622126560416402693L;
         Ref.g(622126560416402693L, var9);
         Object var11 = 622126560416402693L;
         YI var10004 = (YI)(Registry.packArgs(((DT)Ref.g(622126560416402693L, var11)).convertRowIndexToModel(var4)));
         long var14 = 314520454321390476L;
         Object var13 = var10004;
         var10004 = Ref.h(314520454321390476L, var13, var14);

         try {
            var10004 = (YI)var10004;
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }

         YI var5 = var10004;
         Object var10005 = Registry.emptyArgs();
         long var16 = 532275517761561192L;
         Object var15 = var10005;
         var10005 = Ref.h(532275517761561192L, var15, var16);

         try {
            var29 = (Integer)var10005;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         int var6 = var29;
         if (var1 == null
            && (
               var6 == Registry.lookupField(588497303530669971L).getInt(null)
                  || var1 == null
                     && (
                        var6 == Registry.lookupField(474112474147008326L).getInt(null)
                           || var1 == null && var6 == Registry.lookupField(364503691566382472L).getInt(null)
                     )
            )) {
            var2.add(var5);
         }

         var4++;
         if (var1 != null) {
            break;
         }
      }

      for (YI var25 : var2) {
         Object var17 = 344912960350819457L;
         Ref.g(344912960350819457L, var17);
         Object[] var10003 = Registry.packArgs(var25);
         long var20 = 248427345189412900L;
         Object[] var19 = var10003;
         Ref.h(248427345189412900L, var19, var20);

         try {
            ;
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public void w() {
      Integer var33;
      new ArrayList();
      Object var9 = 622126560416402693L;
      int var3 = ((DT)Ref.g(622126560416402693L, var9)).getSelectedRows();
      int[] var4 = var3;
      int[] var10001 = O$arrint();
      int var5 = var3.length;
      int var6 = 0;
      int[] var1 = var10001;

      while (var6 < var5) {
         int var7 = var4[var6];
         Object var11 = 622126560416402693L;
         Ref.g(622126560416402693L, var11);
         YI var10003 = (YI)(Registry.packArgs(var7));
         long var14 = 314520454321390476L;
         Object var13 = var10003;
         var10003 = Ref.h(314520454321390476L, var13, var14);

         try {
            var10003 = (YI)var10003;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         YI var8 = var10003;
         if (var1 == null) {
            Object var10004 = Registry.emptyArgs();
            long var16 = 532275517761561192L;
            Object var15 = var10004;
            var10004 = Ref.h(532275517761561192L, var15, var16);

            try {
               var33 = (Integer)var10004;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }

            if (var33 == Registry.lookupField(474112474147008326L).getInt(null)) {
               Object[] var10005 = Registry.emptyArgs();
               long var18 = 268465037806953599L;
               Object[] var17 = var10005;
               Ref.h(268465037806953599L, var17, var18);

               try {
                  ;
               } catch (InvocationTargetException var27) {
                  throw var27.getTargetException();
               }

               Object[] var10006 = Registry.emptyArgs();
               long var20 = 181011293761108924L;
               Object[] var19 = var10006;
               Ref.h(181011293761108924L, var19, var20);

               try {
                  ;
               } catch (InvocationTargetException var26) {
                  throw var26.getTargetException();
               }

               Object var21 = 344912960350819457L;
               Ref.g(344912960350819457L, var21);
               Object[] var10008 = Registry.packArgs(var8);
               long var24 = 452901420522307835L;
               Object[] var23 = var10008;
               Ref.h(452901420522307835L, var23, var24);

               try {
                  ;
               } catch (InvocationTargetException var25) {
                  throw var25.getTargetException();
               }
            }

            var6++;
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public void W(Component var1) {
      O$arrint();
      Object var7 = 269586463206323716L;
      Ref.g(269586463206323716L, var7);
      FX3 var10003 = (FX3)(Registry.emptyArgs());
      long var10 = 380488306238748207L;
      Object var9 = var10003;
      var10003 = Ref.h(380488306238748207L, var9, var10);

      try {
         var10003 = (FX3)var10003;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      FX3 var3 = var10003;
      Object var11 = 468326905894456044L;
      ((JPopupMenu)Ref.g(468326905894456044L, var11)).removeAll();
      int var4 = 0;
      SelectDownloadFolderPanel var2 = this;

      do {
         ArrayList var10005 = (ArrayList)(Registry.emptyArgs());
         long var14 = 250284129792311327L;
         Object var13 = var10005;
         var10005 = Ref.h(250284129792311327L, var13, var14);

         try {
            var10005 = (ArrayList)var10005;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }

         if (!(var3 < var10005.size())) {
            break;
         }

         var10005 = Registry.emptyArgs();
         long var16 = 250284129792311327L;
         Object var15 = var10005;
         Ref.h(250284129792311327L, var15, var16);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }

         ArrayList var10007 = (ArrayList)(Registry.emptyArgs());
         long var18 = 250284129792311327L;
         Object var17 = var10007;
         var10007 = Ref.h(250284129792311327L, var17, var18);

         try {
            var10007 = (ArrayList)var10007;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         String var5 = (String)var3.get(var10007.size() - 1 - var4);
         Object var19 = 468326905894456044L;
         W8 var10008 = (W8)(Registry.packArgs(this, Ref.g(468326905894456044L, var19), var1, var5));
         long var22 = 551513000150344715L;
         Object var21 = var10008;
         var10008 = Ref.h(551513000150344715L, var21, var22);

         try {
            var10008 = (W8)var10008;
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         W8 var6 = var10008;
         Object var23 = 468326905894456044L;
         ((JPopupMenu)Ref.g(468326905894456044L, var23)).add(var6, 0);
         var4++;
      } while (var2 == null);
   }

   public W8 d(String var1) {
      int[] var10000 = O$arrint();
      W8 var3 = null;
      int[] var2 = var10000;
      Object var6 = 585743319788652558L;

      for (W8 var5 : (ArrayList)Ref.g(585743319788652558L, var6)) {
         if (var2 == null) {
            String var10002 = (String)(Registry.emptyArgs());
            long var9 = 325466260686391537L;
            Object var8 = var10002;
            var10002 = Ref.h(325466260686391537L, var8, var9);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (!var10002.equals(var1)) {
               continue;
            }
         }

         var3 = var5;
         break;
      }

      return var3;
   }

   public void W() {
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 578864097947885485L;
      Object[] var3 = var10002;
      Ref.h(578864097947885485L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public EditorSelectionDialog l(String var1, com.finalshell.ui.frame.MainFrame var2) {
      int[] var10000 = O$arrint();
      EditorSelectionDialog var4 = new EditorSelectionDialog(Registry.lookupField(243490669497898236L).getInt(null), var2, a(-21396, -2576), false);
      int[] var3 = var10000;
      if (var3 == null) {
         if (!var1.equals((String)Registry.lookupField(149082991182987426L).get(null))) {
            Object[] var10001 = Registry.packArgs(var1, true, true);
            long var6 = 206082969888821725L;
            Object[] var5 = var10001;
            Ref.h(206082969888821725L, var5, var6);

            try {
               ;
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }
         }

         var4.setSize(a(290, 8009132706189343290L), a(18081, 3943639492674764221L));
         var4.setLocationRelativeTo(var2);
         var4.setVisible(true);
      }

      return var4;
   }

   public W8 B(FX3 var1, JPopupMenu var2, Component var3, String var4) {
      Color var5 = (Color)Registry.lookupField(461796957683008100L).get(null);
      Color var6 = new Color(a(13476, 7212822420094570422L), a(19896, 2985074675117635238L), a(19896, 2985074675117635238L));
      Color var7 = new Color(a(31074, 3857975071267521147L), a(17714, 9183881487808052776L), a(17714, 9183881487808052776L));
      Color var8 = new Color(a(3485, 389912064302315148L), a(3485, 389912064302315148L), a(3485, 389912064302315148L));
      W8 var9 = new W8(var4);
      Object var17 = 585743319788652558L;
      ((ArrayList)Ref.g(585743319788652558L, var17)).add(var9);
      var9.setLayout(new MigLayout(a(-21405, -20642), a(-21399, -13364), ""));
      var9.setBackground(var6);
      JLabel var10 = new JLabel(var4);
      var10.setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      var10.setForeground(var8);
      var10.setFocusable(false);
      var10.setOpaque(true);
      var10.setBackground(var6);
      var10.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
      var9.add(var10, a(-21401, -19877));
      var10.addMouseListener(new QV(this, var4, var1, var10, var6, var9, var2));
      JPanel var11 = new JPanel();
      var11.setLayout(new MigLayout(a(-21386, 16214), a(-21394, 2734), ""));
      var11.setOpaque(false);
      var9.add(var11);
      Font var12 = (Font)Registry.lookupField(344087302787482558L).get(null);
      Registry.packArgs("\uf115");
      long var19 = 378399160856121064L;
      Object var10002 = Ref.h2(378399160856121064L, var19);

      try {
         var10002 = (C)var10002;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      C var13 = (C)var10002;
      var13.setFont(var12);
      var11.add(var13);
      var13.setForeground(var7);
      var13.addActionListener(new com.finalshell.ui.listener.K52(this, var4, var1, var2, var3, var10, var6, var9));
      Registry.packArgs("\uf114");
      long var21 = 378399160856121064L;
      Object var10003 = Ref.h2(378399160856121064L, var21);

      try {
         var10003 = (C)var10003;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      C var14 = (C)var10003;
      var14.setFont(var12);
      var11.add(var14);
      var14.addActionListener(new Pc(this, var10, var6, var9, var4));
      Registry.packArgs("\uf00d");
      long var23 = 378399160856121064L;
      Object var10004 = Ref.h2(378399160856121064L, var23);

      try {
         var10004 = (C)var10004;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      C var15 = (C)var10004;
      var15.setForeground(var7);
      var15.setFont(var12);
      var11.add(var15);
      var15.addActionListener(new com.finalshell.ui.listener.L(this, var1, var4, var2, var9));
      var14.setForeground(var7);
      De2 var16 = new De2(this, var10, var6, var9, var5);
      var15.addMouseListener(var16);
      var13.addMouseListener(var16);
      var14.addMouseListener(var16);
      var10.addMouseListener(var16);
      var9.addMouseListener(var16);
      return var9;
   }

   public void c() {
      O$arrint();
      Object var2 = false;
      Object var7 = 344912960350819457L;
      Object var10002 = Ref.g(344912960350819457L, var7);
      Integer var10003 = (Integer)(Registry.emptyArgs());
      long var10 = 455614021419137275L;
      Object var9 = var10003;
      ArrayList var3 = (ArrayList)Ref.h(455614021419137275L, var9, var10);
      Iterator var4 = var3.iterator();
      Object var1 = var10002;

      while (true) {
         label60:
         if (var4.hasNext()) {
            YI var5 = (YI)var4.next();
            var10002 = var5;
            var10003 = Registry.emptyArgs();
            long var12 = 532275517761561192L;
            Object var11 = var10003;
            var10003 = Ref.h(532275517761561192L, var11, var12);

            try {
               var10003 = (Integer)var10003;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            Object var6 = var10003;
            var10003 = (Object[])var6;
            if (var1 != null) {
               break;
            }

            label57: {
               label56:
               if (var1 == null) {
                  if (var6 != Registry.lookupField(635857280906233483L).getInt(null)) {
                     var10003 = (Object[])var6;
                     if (var1 != null) {
                        break label56;
                     }

                     if (var6 != Registry.lookupField(476761782289979268L).getInt(null)) {
                        break label57;
                     }
                  }

                  var10003 = true;
               }

               var2 = var10003;
               if (var1 == null) {
                  break label60;
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         var10002 = var2;
         break;
      }

      YI var23 = (YI)var10002;
      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10004 = Registry.emptyArgs();
      long var16 = 634817973682994708L;
      Object[] var15 = var10004;
      Ref.h(634817973682994708L, var15, var16);
      Object[] var10005 = Registry.emptyArgs();
      long var18 = 240567170779145617L;
      Object[] var17 = var10005;
      Ref.h(240567170779145617L, var17, var18);
      Object[] var10006 = Registry.packArgs(new UY3(this, (boolean)var23));
      long var20 = 442259795076941885L;
      Object[] var19 = var10006;
      Ref.h(442259795076941885L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }
   }

   @Override
   public synchronized void u(VO var1) {
      long var26;
      Object[] var33;
      Object[] var37;
      boolean var81;
      O$arrint();
      Object var10002 = Registry.emptyArgs();
      long var8 = 178857963789314984L;
      Object var7 = var10002;
      var10002 = Ref.h(178857963789314984L, var7, var8);

      try {
         var74 = (Integer)var10002;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      int var3 = var74;
      var10002 = Registry.emptyArgs();
      long var10 = 184120697106130251L;
      Object var9 = var10002;
      var10002 = Ref.h(184120697106130251L, var9, var10);

      try {
         var10002 = (YI)var10002;
      } catch (InvocationTargetException var71) {
         throw var71.getTargetException();
      }

      Object var82;
      label220: {
         YI var4;
         Object var5;
         label221: {
            var4 = var10002;
            var5 = false;
            int var78 = var3;
            int var10003 = Registry.lookupField(355995585155017665L).getInt(null);
            if (var1 == null) {
               if (var3 == var10003) {
                  Object var11 = 344912960350819457L;
                  Ref.g(344912960350819457L, var11);
                  var82 = Registry.packArgs(var4);
                  long var14 = 168760181056568074L;
                  Object[] var13 = (Object[])var82;
                  Ref.h(168760181056568074L, var13, var14);

                  try {
                     ;
                  } catch (InvocationTargetException var70) {
                     throw var70.getTargetException();
                  }

                  var82 = this;
                  Object var15 = 622126560416402693L;
                  ((DT)Ref.g(622126560416402693L, var15)).scrollRectToVisible(new Rectangle(0, 0, 0, 0));
                  var5 = true;
                  Object var17 = 534231457215759502L;
                  boolean var10006 = ((C5)Ref.g(534231457215759502L, var17)).isVisible();
                  if (var1 != null) {
                     break label220;
                  }

                  if (var10006) {
                     break label221;
                  }

                  Registry.emptyArgs();
                  long var19 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var19);
                  Object[] var10008 = Registry.emptyArgs();
                  long var22 = 634817973682994708L;
                  Object[] var21 = var10008;
                  Ref.h(634817973682994708L, var21, var22);
                  Object[] var10009 = Registry.emptyArgs();
                  long var24 = 240567170779145617L;
                  Object[] var23 = var10009;
                  Ref.h(240567170779145617L, var23, var24);
                  Object[] var10010 = Registry.emptyArgs();
                  var26 = 226341449505323490L;
                  Object[] var25 = var10010;
                  Ref.h(226341449505323490L, var25, var26);
                  Object[] var10011 = Registry.emptyArgs();
                  long var28 = 402347743199818669L;
                  Object[] var27 = var10011;
                  Ref.h(402347743199818669L, var27, var28);

                  try {
                     ;
                  } catch (InvocationTargetException var69) {
                     throw var69.getTargetException();
                  }

                  if (var1 == null) {
                     break label221;
                  }
               }

               var78 = var3;
               var10003 = Registry.lookupField(352927757876034743L).getInt(null);
            }

            if (var1 == null) {
               if (var78 == var10003) {
                  var5 = true;
                  Object var29 = 344912960350819457L;
                  Ref.g(344912960350819457L, var29);
                  var82 = Registry.packArgs(var4);
                  long var32 = 452901420522307835L;
                  Object[] var31 = (Object[])var82;
                  Ref.h(452901420522307835L, var31, var32);

                  try {
                     ;
                  } catch (InvocationTargetException var68) {
                     throw var68.getTargetException();
                  }

                  if (var1 == null) {
                     break label221;
                  }
               }

               var78 = var3;
               var10003 = Registry.lookupField(503069149042327914L).getInt(null);
            }

            var82 = var1;
            if (var1 == null) {
               if (var78 == var10003) {
                  var5 = true;
                  if (var1 == null) {
                     break label221;
                  }
               }

               var78 = var3;
               if (var1 != null) {
                  break label220;
               }

               var10003 = Registry.lookupField(242649790291880610L).getInt(null);
            }

            if (var78 == var10003) {
               var5 = true;
               Object[] var79 = Registry.emptyArgs();
               long var34 = 435200798393730562L;
               var33 = var79;
               Object var80 = Ref.h(435200798393730562L, var33, var34);

               try {
                  var81 = (Boolean)var80;
               } catch (InvocationTargetException var67) {
                  throw var67.getTargetException();
               }

               var82 = var1;
               if (var1 != null) {
                  break label220;
               }

               if (var81) {
                  Object var35 = 344912960350819457L;
                  Ref.g(344912960350819457L, var35);
                  Object[] var10005 = Registry.packArgs(var4);
                  long var38 = 248427345189412900L;
                  var37 = var10005;
                  Ref.h(248427345189412900L, var37, var38);

                  try {
                     ;
                  } catch (InvocationTargetException var66) {
                     throw var66.getTargetException();
                  }

                  Registry.lookupField(388376917454860932L).get(null);
                  Object[] var87 = Registry.packArgs(new OT(this, var4));
                  long var40 = 434592463220957006L;
                  Object[] var39 = var87;
                  Ref.h(434592463220957006L, var39, var40);

                  try {
                     ;
                  } catch (InvocationTargetException var65) {
                     throw var65.getTargetException();
                  }
               }
            }
         }

         Object var41 = 344912960350819457L;
         Ref.g(344912960350819457L, var41);
         var82 = Registry.packArgs(var4);
         long var44 = 452901420522307835L;
         Object[] var43 = (Object[])var82;
         Ref.h(452901420522307835L, var43, var44);

         try {
            ;
         } catch (InvocationTargetException var64) {
            throw var64.getTargetException();
         }

         var82 = var5;
      }

      label228: {
         if (var1 == null) {
            if (var82 == null) {
               return;
            }

            var82 = this;
            Object var45 = 344912960350819457L;
            Fr4 var85 = (Fr4)Ref.g(344912960350819457L, var45);
            if (var1 != null) {
               break label228;
            }

            Object[] var88 = Registry.emptyArgs();
            long var48 = 288307566032491631L;
            Object[] var47 = var88;
            var88 = Ref.h(288307566032491631L, var47, var48);

            try {
            } catch (InvocationTargetException var63) {
               throw var63.getTargetException();
            }
         }

         if (!(var82 < Registry.lookupField(611678237881470112L).getInt(null))) {
            return;
         }

         Object var49 = 344912960350819457L;
         Fr4 var86 = (Fr4)Ref.g(344912960350819457L, var49);
      }

      YI var90 = (YI)(Registry.emptyArgs());
      long var52 = 195315429550440605L;
      Object var51 = var90;
      var90 = Ref.h(195315429550440605L, var51, var52);

      try {
         var90 = (YI)var90;
      } catch (InvocationTargetException var62) {
         throw var62.getTargetException();
      }

      YI var6 = var90;
      if (var1 != null || var6 != null) {
         Integer var10007 = (Integer)(Registry.emptyArgs());
         long var54 = 616518435013173083L;
         Object var53 = var10007;
         var10007 = Ref.h(616518435013173083L, var53, var54);

         try {
            var10007 = (Integer)var10007;
         } catch (InvocationTargetException var61) {
            throw var61.getTargetException();
         }

         label230: {
            int var95 = Registry.lookupField(454428843955025864L).getInt(null);
            if (var1 == null) {
               if (var10007 != var95) {
                  return;
               }

               var10007 = var6;
               if (var1 != null) {
                  break label230;
               }

               Object[] var96 = Registry.emptyArgs();
               long var56 = 532275517761561192L;
               Object[] var55 = var96;
               Object var97 = Ref.h(532275517761561192L, var55, var56);

               try {
                  var95 = (Integer)var97;
               } catch (InvocationTargetException var60) {
                  throw var60.getTargetException();
               }

               Registry.lookupField(588497303530669971L).getInt(null);
            }

            if (var10007 == var95) {
               return;
            }
         }

         Object[] var98 = Registry.emptyArgs();
         long var58 = 181011293761108924L;
         Object[] var57 = var98;
         Ref.h(181011293761108924L, var57, var58);

         try {
            ;
         } catch (InvocationTargetException var59) {
            throw var59.getTargetException();
         }
      }
   }

   public DT O$DT() {
      Object var1 = 622126560416402693L;
      return (DT)Ref.g(622126560416402693L, var1);
   }

   public void f(DT var1) {
      long var3 = 622126560416402693L;
      Ref.s(622126560416402693L, var1, var3);
   }

   public static void g(int[] var0) {
      u = var0;
   }

   public static int[] O$arrint() {
      return u;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -21401) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 108;
               break;
            case 1:
               var10000 = 246;
               break;
            case 2:
               var10000 = 250;
               break;
            case 3:
               var10000 = 67;
               break;
            case 4:
               var10000 = 88;
               break;
            case 5:
               var10000 = 150;
               break;
            case 6:
               var10000 = 16;
               break;
            case 7:
               var10000 = 34;
               break;
            case 8:
               var10000 = 105;
               break;
            case 9:
               var10000 = 208;
               break;
            case 10:
               var10000 = 209;
               break;
            case 11:
               var10000 = 4;
               break;
            case 12:
               var10000 = 143;
               break;
            case 13:
               var10000 = 95;
               break;
            case 14:
               var10000 = 204;
               break;
            case 15:
               var10000 = 161;
               break;
            case 16:
               var10000 = 119;
               break;
            case 17:
               var10000 = 73;
               break;
            case 18:
               var10000 = 59;
               break;
            case 19:
               var10000 = 62;
               break;
            case 20:
               var10000 = 69;
               break;
            case 21:
               var10000 = 70;
               break;
            case 22:
               var10000 = 239;
               break;
            case 23:
               var10000 = 159;
               break;
            case 24:
               var10000 = 1;
               break;
            case 25:
               var10000 = 2;
               break;
            case 26:
               var10000 = 213;
               break;
            case 27:
               var10000 = 120;
               break;
            case 28:
               var10000 = 170;
               break;
            case 29:
               var10000 = 33;
               break;
            case 30:
               var10000 = 174;
               break;
            case 31:
               var10000 = 225;
               break;
            case 32:
               var10000 = 7;
               break;
            case 33:
               var10000 = 142;
               break;
            case 34:
               var10000 = 189;
               break;
            case 35:
               var10000 = 155;
               break;
            case 36:
               var10000 = 101;
               break;
            case 37:
               var10000 = 99;
               break;
            case 38:
               var10000 = 57;
               break;
            case 39:
               var10000 = 125;
               break;
            case 40:
               var10000 = 60;
               break;
            case 41:
               var10000 = 47;
               break;
            case 42:
               var10000 = 162;
               break;
            case 43:
               var10000 = 13;
               break;
            case 44:
               var10000 = 106;
               break;
            case 45:
               var10000 = 211;
               break;
            case 46:
               var10000 = 124;
               break;
            case 47:
               var10000 = 182;
               break;
            case 48:
               var10000 = 181;
               break;
            case 49:
               var10000 = 44;
               break;
            case 50:
               var10000 = 198;
               break;
            case 51:
               var10000 = 15;
               break;
            case 52:
               var10000 = 221;
               break;
            case 53:
               var10000 = 128;
               break;
            case 54:
               var10000 = 165;
               break;
            case 55:
               var10000 = 248;
               break;
            case 56:
               var10000 = 26;
               break;
            case 57:
               var10000 = 228;
               break;
            case 58:
               var10000 = 8;
               break;
            case 59:
               var10000 = 190;
               break;
            case 60:
               var10000 = 116;
               break;
            case 61:
               var10000 = 154;
               break;
            case 62:
               var10000 = 23;
               break;
            case 63:
               var10000 = 129;
               break;
            case 64:
               var10000 = 5;
               break;
            case 65:
               var10000 = 147;
               break;
            case 66:
               var10000 = 9;
               break;
            case 67:
               var10000 = 188;
               break;
            case 68:
               var10000 = 54;
               break;
            case 69:
               var10000 = 52;
               break;
            case 70:
               var10000 = 84;
               break;
            case 71:
               var10000 = 118;
               break;
            case 72:
               var10000 = 89;
               break;
            case 73:
               var10000 = 203;
               break;
            case 74:
               var10000 = 176;
               break;
            case 75:
               var10000 = 112;
               break;
            case 76:
               var10000 = 68;
               break;
            case 77:
               var10000 = 56;
               break;
            case 78:
               var10000 = 173;
               break;
            case 79:
               var10000 = 20;
               break;
            case 80:
               var10000 = 201;
               break;
            case 81:
               var10000 = 38;
               break;
            case 82:
               var10000 = 185;
               break;
            case 83:
               var10000 = 74;
               break;
            case 84:
               var10000 = 85;
               break;
            case 85:
               var10000 = 249;
               break;
            case 86:
               var10000 = 202;
               break;
            case 87:
               var10000 = 110;
               break;
            case 88:
               var10000 = 153;
               break;
            case 89:
               var10000 = 223;
               break;
            case 90:
               var10000 = 194;
               break;
            case 91:
               var10000 = 240;
               break;
            case 92:
               var10000 = 115;
               break;
            case 93:
               var10000 = 224;
               break;
            case 94:
               var10000 = 82;
               break;
            case 95:
               var10000 = 235;
               break;
            case 96:
               var10000 = 77;
               break;
            case 97:
               var10000 = 40;
               break;
            case 98:
               var10000 = 98;
               break;
            case 99:
               var10000 = 160;
               break;
            case 100:
               var10000 = 18;
               break;
            case 101:
               var10000 = 100;
               break;
            case 102:
               var10000 = 49;
               break;
            case 103:
               var10000 = 148;
               break;
            case 104:
               var10000 = 217;
               break;
            case 105:
               var10000 = 21;
               break;
            case 106:
               var10000 = 117;
               break;
            case 107:
               var10000 = 137;
               break;
            case 108:
               var10000 = 253;
               break;
            case 109:
               var10000 = 145;
               break;
            case 110:
               var10000 = 37;
               break;
            case 111:
               var10000 = 146;
               break;
            case 112:
               var10000 = 158;
               break;
            case 113:
               var10000 = 229;
               break;
            case 114:
               var10000 = 133;
               break;
            case 115:
               var10000 = 169;
               break;
            case 116:
               var10000 = 207;
               break;
            case 117:
               var10000 = 93;
               break;
            case 118:
               var10000 = 131;
               break;
            case 119:
               var10000 = 55;
               break;
            case 120:
               var10000 = 251;
               break;
            case 121:
               var10000 = 197;
               break;
            case 122:
               var10000 = 87;
               break;
            case 123:
               var10000 = 63;
               break;
            case 124:
               var10000 = 175;
               break;
            case 125:
               var10000 = 81;
               break;
            case 126:
               var10000 = 157;
               break;
            case 127:
               var10000 = 61;
               break;
            case 128:
               var10000 = 83;
               break;
            case 129:
               var10000 = 104;
               break;
            case 130:
               var10000 = 200;
               break;
            case 131:
               var10000 = 32;
               break;
            case 132:
               var10000 = 227;
               break;
            case 133:
               var10000 = 132;
               break;
            case 134:
               var10000 = 214;
               break;
            case 135:
               var10000 = 91;
               break;
            case 136:
               var10000 = 72;
               break;
            case 137:
               var10000 = 144;
               break;
            case 138:
               var10000 = 196;
               break;
            case 139:
               var10000 = 179;
               break;
            case 140:
               var10000 = 42;
               break;
            case 141:
               var10000 = 90;
               break;
            case 142:
               var10000 = 247;
               break;
            case 143:
               var10000 = 17;
               break;
            case 144:
               var10000 = 111;
               break;
            case 145:
               var10000 = 149;
               break;
            case 146:
               var10000 = 96;
               break;
            case 147:
               var10000 = 46;
               break;
            case 148:
               var10000 = 151;
               break;
            case 149:
               var10000 = 180;
               break;
            case 150:
               var10000 = 39;
               break;
            case 151:
               var10000 = 206;
               break;
            case 152:
               var10000 = 178;
               break;
            case 153:
               var10000 = 226;
               break;
            case 154:
               var10000 = 10;
               break;
            case 155:
               var10000 = 244;
               break;
            case 156:
               var10000 = 58;
               break;
            case 157:
               var10000 = 222;
               break;
            case 158:
               var10000 = 6;
               break;
            case 159:
               var10000 = 28;
               break;
            case 160:
               var10000 = 134;
               break;
            case 161:
               var10000 = 245;
               break;
            case 162:
               var10000 = 166;
               break;
            case 163:
               var10000 = 25;
               break;
            case 164:
               var10000 = 199;
               break;
            case 165:
               var10000 = 51;
               break;
            case 166:
               var10000 = 238;
               break;
            case 167:
               var10000 = 186;
               break;
            case 168:
               var10000 = 237;
               break;
            case 169:
               var10000 = 152;
               break;
            case 170:
               var10000 = 139;
               break;
            case 171:
               var10000 = 3;
               break;
            case 172:
               var10000 = 76;
               break;
            case 173:
               var10000 = 102;
               break;
            case 174:
               var10000 = 127;
               break;
            case 175:
               var10000 = 0;
               break;
            case 176:
               var10000 = 136;
               break;
            case 177:
               var10000 = 135;
               break;
            case 178:
               var10000 = 24;
               break;
            case 179:
               var10000 = 66;
               break;
            case 180:
               var10000 = 126;
               break;
            case 181:
               var10000 = 78;
               break;
            case 182:
               var10000 = 14;
               break;
            case 183:
               var10000 = 31;
               break;
            case 184:
               var10000 = 114;
               break;
            case 185:
               var10000 = 168;
               break;
            case 186:
               var10000 = 243;
               break;
            case 187:
               var10000 = 122;
               break;
            case 188:
               var10000 = 140;
               break;
            case 189:
               var10000 = 236;
               break;
            case 190:
               var10000 = 130;
               break;
            case 191:
               var10000 = 241;
               break;
            case 192:
               var10000 = 53;
               break;
            case 193:
               var10000 = 231;
               break;
            case 194:
               var10000 = 64;
               break;
            case 195:
               var10000 = 43;
               break;
            case 196:
               var10000 = 107;
               break;
            case 197:
               var10000 = 220;
               break;
            case 198:
               var10000 = 71;
               break;
            case 199:
               var10000 = 29;
               break;
            case 200:
               var10000 = 138;
               break;
            case 201:
               var10000 = 48;
               break;
            case 202:
               var10000 = 233;
               break;
            case 203:
               var10000 = 41;
               break;
            case 204:
               var10000 = 123;
               break;
            case 205:
               var10000 = 65;
               break;
            case 206:
               var10000 = 234;
               break;
            case 207:
               var10000 = 230;
               break;
            case 208:
               var10000 = 164;
               break;
            case 209:
               var10000 = 242;
               break;
            case 210:
               var10000 = 141;
               break;
            case 211:
               var10000 = 218;
               break;
            case 212:
               var10000 = 113;
               break;
            case 213:
               var10000 = 50;
               break;
            case 214:
               var10000 = 252;
               break;
            case 215:
               var10000 = 121;
               break;
            case 216:
               var10000 = 35;
               break;
            case 217:
               var10000 = 232;
               break;
            case 218:
               var10000 = 216;
               break;
            case 219:
               var10000 = 103;
               break;
            case 220:
               var10000 = 80;
               break;
            case 221:
               var10000 = 79;
               break;
            case 222:
               var10000 = 12;
               break;
            case 223:
               var10000 = 167;
               break;
            case 224:
               var10000 = 86;
               break;
            case 225:
               var10000 = 192;
               break;
            case 226:
               var10000 = 171;
               break;
            case 227:
               var10000 = 109;
               break;
            case 228:
               var10000 = 92;
               break;
            case 229:
               var10000 = 22;
               break;
            case 230:
               var10000 = 195;
               break;
            case 231:
               var10000 = 205;
               break;
            case 232:
               var10000 = 19;
               break;
            case 233:
               var10000 = 177;
               break;
            case 234:
               var10000 = 75;
               break;
            case 235:
               var10000 = 193;
               break;
            case 236:
               var10000 = 255;
               break;
            case 237:
               var10000 = 27;
               break;
            case 238:
               var10000 = 183;
               break;
            case 239:
               var10000 = 219;
               break;
            case 240:
               var10000 = 94;
               break;
            case 241:
               var10000 = 254;
               break;
            case 242:
               var10000 = 163;
               break;
            case 243:
               var10000 = 212;
               break;
            case 244:
               var10000 = 30;
               break;
            case 245:
               var10000 = 45;
               break;
            case 246:
               var10000 = 210;
               break;
            case 247:
               var10000 = 191;
               break;
            case 248:
               var10000 = 97;
               break;
            case 249:
               var10000 = 172;
               break;
            case 250:
               var10000 = 215;
               break;
            case 251:
               var10000 = 187;
               break;
            case 252:
               var10000 = 184;
               break;
            case 253:
               var10000 = 36;
               break;
            case 254:
               var10000 = 156;
               break;
            default:
               var10000 = 11;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31515;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      byte var26;
      char[] var33;
      long var37;
      byte var42;
      String[] var13 = new String[19];
      int var11 = 0;
      String var10 = "\u0013Nn^êÈ\u000bçÎI×\u008ak\u001c\u0005\u0087#\u0001nì\u001bh\u0003\u0001÷\u0007ý¶B|\u009e.x\nWåÁA1£\u00008(õ¹>\u0096\u0012\u0004\u0013lkf\ro\u0091+S«Z¶§4\u0001D\u0083T\u0002戼忶(<\u001bA\u0002æp\u001fâ\u0002©á\u0096ãÓÃX\u00ad*8o\u008d\u0000\u001bªè\r\u008d3\u009c¥ä9É}\u0005\u0006&\u008c¥¾\u0005÷\u0098ëÿ!\r gÒ\u008d\u0094\u0081QÜÎnÝna\u0005\u001c\u009erÙ\u0082\u0002譂罭\u0007郯戢丯轊斯亴妲\r×Ä<ùI\u000fè\r¾Tv)\u0011\u0007Z\"~Á)c\u0091\bàÏíóq§\u008aw\u0013\u0095\u0083¾çðÿB\t¨\u009d\u0095\u0012gQ\u001e\u0016Ö.\u0087\u0004两迳%+";
      int var12 = "\u0013Nn^êÈ\u000bçÎI×\u008ak\u001c\u0005\u0087#\u0001nì\u001bh\u0003\u0001÷\u0007ý¶B|\u009e.x\nWåÁA1£\u00008(õ¹>\u0096\u0012\u0004\u0013lkf\ro\u0091+S«Z¶§4\u0001D\u0083T\u0002戼忶(<\u001bA\u0002æp\u001fâ\u0002©á\u0096ãÓÃX\u00ad*8o\u008d\u0000\u001bªè\r\u008d3\u009c¥ä9É}\u0005\u0006&\u008c¥¾\u0005÷\u0098ëÿ!\r gÒ\u008d\u0094\u0081QÜÎnÝna\u0005\u001c\u009erÙ\u0082\u0002譂罭\u0007郯戢丯轊斯亴妲\r×Ä<ùI\u000fè\r¾Tv)\u0011\u0007Z\"~Á)c\u0091\bàÏíóq§\u008aw\u0013\u0095\u0083¾çðÿB\t¨\u009d\u0095\u0012gQ\u001e\u0016Ö.\u0087\u0004两迳%+"
         .length();
      g(null);
      char var9 = 14;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 61;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 83;
                        break;
                     case 1:
                        var65 = 123;
                        break;
                     case 2:
                        var65 = 1;
                        break;
                     case 3:
                        var65 = 82;
                        break;
                     case 4:
                        var65 = 29;
                        break;
                     case 5:
                        var65 = 9;
                        break;
                     default:
                        var65 = 48;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     b = var13;
                     c = new String[19];
                     long var0 = 2713476200623460900L;
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "\u0094ÀÜÖ.½tÎq\u0011¥£X¶ì\u008e;\u000ft/_\u0095ÐÝÞ\u009aÕ\u0094CÃª¢k\u0012)Ú¯æºì\u001d\u0083?Ï¢Åä\u007fÀ\u0018Õ¤#ü\nÏ\u0091VKÒ?·îm¢ªø¦¿\u009e´;";
                     int var5 = "\u0094ÀÜÖ.½tÎq\u0011¥£X¶ì\u008e;\u000ft/_\u0095ÐÝÞ\u009aÕ\u0094CÃª¢k\u0012)Ú¯æºì\u001d\u0083?Ï¢Åä\u007fÀ\u0018Õ¤#ü\nÏ\u0091VKÒ?·îm¢ªø¦¿\u009e´;"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    d = var6;
                                    e = new Integer[11];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "9bæ\u001aõ\u0016\u009do{\u0085\r£²Ã¤¼";
                                 var5 = "9bæ\u001aõ\u0016\u009do{\u0085\r£²Ã¤¼".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "K\u009fB\u007fk2CGdðÀP*\u0005¢Ü¬\u009a$";
                  var12 = "K\u009fB\u007fk2CGdðÀP*\u0005¢Ü¬\u009a$".length();
                  var9 = '\r';
                  var17 = -1;
            }

            var10000 = 120;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





