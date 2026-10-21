package com.finalshell.ui.panel;

import com.finalshell.core.AL;
import com.finalshell.core.Li4;
import com.finalshell.core.Lj4_2;
import com.finalshell.core.T32;
import com.finalshell.core.Y9;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.AddCommandListener;
import com.finalshell.ui.listener.Ag2;
import com.finalshell.ui.listener.Bd4;
import com.finalshell.ui.listener.ConfirmDeleteCommandListener;
import com.finalshell.ui.listener.JK;
import com.finalshell.ui.listener.K;
import com.finalshell.ui.listener.Mf2;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import net.miginfocom.swing.MigLayout;

public class Copy3 extends F8 implements AL {
   AppendCarriageReturnCRPanel h;
   Li4 E;
   AM u;
   String Y;
   Lj4_2 I;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] e;

   Copy3(AppendCarriageReturnCRPanel var1, Li4 var2) {
      AppendCarriageReturnCRPanel.Y();
      long var9 = 597736782183485260L;
      Ref.s(597736782183485260L, var2, var9);
      Object[] var10004 = Registry.emptyArgs();
      long var11 = 194080076253066315L;
      Object[] var10 = var10004;
      var10004 = Ref.h(194080076253066315L, var10, var11);
      long var13 = 424248557458462193L;
      Object var12 = var10004;
      Ref.s(424248557458462193L, var12, var13);
      long var15 = 567366698646146944L;
      Ref.s(567366698646146944L, var1, var15);
      this.setOpaque(false);
      this.setLayout(new MigLayout(a(-4724, -30617)));
      this.setBorder(null);
      Copy3 var3 = this;
      AM var10005 = new AM();
      long var17 = 601657008259262484L;
      AM var16 = var10005;
      Ref.s(601657008259262484L, var16, var17);
      Object var18 = 601657008259262484L;
      Ref.g(601657008259262484L, var18);
      Object[] var10007 = Registry.packArgs(this);
      long var21 = 628117696186450927L;
      Object[] var20 = var10007;
      Ref.h(628117696186450927L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var61) {
         throw var61.getTargetException();
      }

      Object var22 = 601657008259262484L;
      ((AM)Ref.g(601657008259262484L, var22)).setOpaque(false);
      Object var24 = 601657008259262484L;
      Ref.g(601657008259262484L, var24);
      Object[] var10010 = Registry.packArgs(true);
      long var27 = 137984194358335738L;
      Object[] var26 = var10010;
      Ref.h(137984194358335738L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      Object var28 = 601657008259262484L;
      Ref.g(601657008259262484L, var28);
      Object[] var10012 = Registry.packArgs(true);
      long var31 = 528370173326315169L;
      Object[] var30 = var10012;
      Ref.h(528370173326315169L, var30, var31);

      try {
         ;
      } catch (InvocationTargetException var59) {
         throw var59.getTargetException();
      }

      Object var32 = 601657008259262484L;
      Ref.g(601657008259262484L, var32);
      Object[] var10014 = Registry.packArgs(this);
      long var35 = 253827983161591241L;
      Object[] var34 = var10014;
      Ref.h(253827983161591241L, var34, var35);

      try {
         ;
      } catch (InvocationTargetException var58) {
         throw var58.getTargetException();
      }

      Object var36 = 601657008259262484L;
      this.add((AM)Ref.g(601657008259262484L, var36), a(-4728, -14597));
      Object var38 = 601657008259262484L;
      ((AM)Ref.g(601657008259262484L, var38)).addMouseListener(new AddCommandListener(this, var1));
      ArrayList var10017 = (ArrayList)(Registry.emptyArgs());
      long var41 = 408177353860141270L;
      Object[] var40 = var10017;
      var10017 = Ref.h(408177353860141270L, var40, var41);

      try {
         var10017 = (ArrayList)var10017;
      } catch (InvocationTargetException var57) {
         throw var57.getTargetException();
      }

      ArrayList var4 = var10017;
      Iterator var5 = var4.iterator();

      while (true) {
         if (var5.hasNext()) {
            Lj4_2 var6 = (Lj4_2)var5.next();
            Object var42 = 601657008259262484L;
            Ref.g(601657008259262484L, var42);
            new F8();
            Object[] var10021 = Registry.emptyArgs();
            long var45 = 286931176286176762L;
            Object[] var44 = var10021;
            Object[] var10020 = Registry.packArgs(var6, Ref.h(286931176286176762L, var44, var45));
            long var47 = 407014907239672455L;
            Object[] var46 = var10020;
            Ref.h(407014907239672455L, var46, var47);

            try {
               ;
            } catch (InvocationTargetException var56) {
               throw var56.getTargetException();
            }

            var10021 = Registry.packArgs(var6);
            long var49 = 276170834929945961L;
            Object[] var48 = var10021;
            Ref.h(276170834929945961L, var48, var49);

            try {
               ;
            } catch (InvocationTargetException var55) {
               throw var55.getTargetException();
            }

            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         Object var50 = 601657008259262484L;
         Ref.g(601657008259262484L, var50);
         Object[] var10019 = Registry.emptyArgs();
         long var53 = 379202494105999184L;
         Object[] var52 = var10019;
         Ref.h(379202494105999184L, var52, var53);

         try {
            break;
         } catch (InvocationTargetException var54) {
            throw var54.getTargetException();
         }
      }
   }

   public void w(String var1, String var2, boolean var3) {
      AppendCarriageReturnCRPanel.Y();
      Lj4_2 var5 = new Lj4_2();
      Object[] var10002 = Registry.packArgs(var2);
      long var9 = 372027305840941998L;
      Object[] var8 = var10002;
      Ref.h(372027305840941998L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      Object[] var10003 = Registry.packArgs(var1);
      long var11 = 193904661956891993L;
      Object[] var10 = var10003;
      Ref.h(193904661956891993L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      var10003 = Registry.packArgs(var3);
      long var13 = 533048980031250758L;
      Object[] var12 = var10003;
      Ref.h(533048980031250758L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var71) {
         throw var71.getTargetException();
      }

      Object[] var10004 = Registry.e(System.currentTimeMillis());
      long var15 = 632174181210947576L;
      Object[] var14 = var10004;
      Ref.h(632174181210947576L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var70) {
         throw var70.getTargetException();
      }

      Registry.emptyArgs();
      long var16 = 270389152141252877L;
      Ref.h2(270389152141252877L, var16);
      Object[] var10006 = Registry.emptyArgs();
      long var19 = 306266403902896148L;
      Object[] var18 = var10006;
      Ref.h(306266403902896148L, var18, var19);
      Object var20 = 424248557458462193L;
      Li4 var10008 = (Li4)(Registry.packArgs(Ref.g(424248557458462193L, var20)));
      long var23 = 233092091994680304L;
      Object[] var22 = var10008;
      var10008 = Ref.h(233092091994680304L, var22, var23);

      try {
         var10008 = (Li4)var10008;
      } catch (InvocationTargetException var69) {
         throw var69.getTargetException();
      }

      Li4 var6 = var10008;
      if (var5 != null) {
         ArrayList var10009 = Registry.emptyArgs();
         long var31 = 408177353860141270L;
         Object[] var30 = var10009;
         var10009 = Ref.h(408177353860141270L, var30, var31);

         try {
            var10009 = (ArrayList)var10009;
         } catch (InvocationTargetException var66) {
            throw var66.getTargetException();
         }

         var10009.add(var5);
         Object var32 = 601657008259262484L;
         Ref.g(601657008259262484L, var32);
         Object[] var80 = Registry.packArgs(new F8(), var1);
         long var35 = 407014907239672455L;
         Object[] var34 = var80;
         Ref.h(407014907239672455L, var34, var35);

         try {
            ;
         } catch (InvocationTargetException var65) {
            throw var65.getTargetException();
         }

         Object[] var10012 = Registry.packArgs(var5);
         long var37 = 276170834929945961L;
         Object[] var36 = var10012;
         Ref.h(276170834929945961L, var36, var37);

         try {
            ;
         } catch (InvocationTargetException var64) {
            throw var64.getTargetException();
         }

         Object var38 = 567366698646146944L;
         Ref.g(567366698646146944L, var38);
         Object[] var10014 = Registry.emptyArgs();
         long var41 = 254774089477135261L;
         Object[] var40 = var10014;
         Ref.h(254774089477135261L, var40, var41);

         try {
            ;
         } catch (InvocationTargetException var63) {
            throw var63.getTargetException();
         }

         long var43 = 276279084084149402L;
         Ref.s(276279084084149402L, var5, var43);
         Object var44 = 567366698646146944L;
         Ref.g(567366698646146944L, var44);
         Object var46 = 276279084084149402L;
         Object[] var10018 = Registry.packArgs(Ref.g(276279084084149402L, var46));
         long var49 = 126130829284871178L;
         Object[] var48 = var10018;
         Ref.h(126130829284871178L, var48, var49);

         try {
            ;
         } catch (InvocationTargetException var62) {
            throw var62.getTargetException();
         }

         Object var50 = 567366698646146944L;
         Ref.g(567366698646146944L, var50);
         Object var52 = 276279084084149402L;
         Object[] var10021 = Registry.packArgs(Ref.g(276279084084149402L, var52));
         long var55 = 268892086263649472L;
         Object[] var54 = var10021;
         Ref.h(268892086263649472L, var54, var55);

         try {
            ;
         } catch (InvocationTargetException var61) {
            throw var61.getTargetException();
         }

         Registry.emptyArgs();
         long var56 = 270389152141252877L;
         Ref.h2(270389152141252877L, var56);
         Object[] var10023 = Registry.emptyArgs();
         long var59 = 578864097947885485L;
         Object[] var58 = var10023;
         Ref.h(578864097947885485L, var58, var59);

         try {
            ;
         } catch (InvocationTargetException var60) {
            throw var60.getTargetException();
         }
      } else if (var6 != null) {
         Object[] var10010 = Registry.emptyArgs();
         long var25 = 194080076253066315L;
         Object[] var24 = var10010;
         var10010 = Registry.packArgs(Ref.h(194080076253066315L, var24, var25));
         long var27 = 579965879482954180L;
         Object[] var26 = var10010;
         Ref.h(579965879482954180L, var26, var27);

         try {
            ;
         } catch (InvocationTargetException var68) {
            throw var68.getTargetException();
         }

         Object[] var10011 = Registry.packArgs(var6, var5);
         long var29 = 586250926568412482L;
         Object[] var28 = var10011;
         Ref.h(586250926568412482L, var28, var29);

         label111:
         try {
            break label111;
         } catch (InvocationTargetException var67) {
            throw var67.getTargetException();
         }
      }
   }

   void s(Li4 var1, Lj4_2 var2) {
      AppendCarriageReturnCRPanel.Y();
      ArrayList var10002 = (ArrayList)(Registry.emptyArgs());
      long var7 = 408177353860141270L;
      Object[] var6 = var10002;
      var10002 = Ref.h(408177353860141270L, var6, var7);

      try {
         var10002 = (ArrayList)var10002;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      ArrayList var4 = var10002;
      Object var10001 = var4;
      if (var1 == null) {
         if (var4.size() == 0) {
            Registry.packArgs(b(21433, 8344330962100731721L), b(25791, 2644884111073151054L));
            long var8 = 186880599905062406L;
            Object var10003 = Ref.h2(186880599905062406L, var8);

            try {
               var29 = (Integer)var10003;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }

            Registry.packArgs(var29);
            long var10 = 153746706510242688L;
            Object var10004 = Ref.h2(153746706510242688L, var10);

            try {
               var33 = (Integer)var10004;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            var10004 = Registry.packArgs(var33);
            long var13 = 470936572593593753L;
            Object[] var12 = (Object[])var10004;
            Ref.h(470936572593593753L, var12, var13);

            try {
               ;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }

            if (var1 == null) {
               return;
            }
         }

         var10001 = var4.get(var4.size() - 1);
      }

      Lj4_2 var5 = (Lj4_2)var10001;
      Object[] var30 = Registry.emptyArgs();
      long var15 = 145535910876897139L;
      Object[] var14 = var30;
      var30 = Ref.h(145535910876897139L, var14, var15);

      try {
         var32 = (Integer)var30;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Registry.packArgs(var32);
      long var16 = 153746706510242688L;
      Object var35 = Ref.h2(153746706510242688L, var16);

      try {
         var36 = (Integer)var35;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      var35 = Registry.packArgs(var36);
      long var19 = 470936572593593753L;
      Object[] var18 = (Object[])var35;
      Ref.h(470936572593593753L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }
   }

   public void H(T32 var1, Lj4_2 var2, Li4 var3, Li4 var4) {
      AppendCarriageReturnCRPanel.Y();
      ArrayList var10002 = Registry.packArgs(var2);
      long var10 = 498264172246598215L;
      Object[] var9 = var10002;
      Ref.h(498264172246598215L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var70) {
         throw var70.getTargetException();
      }

      if (var3 == null && var4 != null) {
         var10002 = Registry.packArgs(var4, var2);
         long var12 = 586250926568412482L;
         Object[] var11 = var10002;
         Ref.h(586250926568412482L, var11, var12);

         try {
            ;
         } catch (InvocationTargetException var69) {
            throw var69.getTargetException();
         }

         Object[] var10004 = Registry.emptyArgs();
         long var14 = 194080076253066315L;
         Object[] var13 = var10004;
         var10004 = Registry.packArgs(Ref.h(194080076253066315L, var13, var14));
         long var16 = 579965879482954180L;
         Object[] var15 = var10004;
         Ref.h(579965879482954180L, var15, var16);

         try {
            ;
         } catch (InvocationTargetException var68) {
            throw var68.getTargetException();
         }

         Object[] var10005 = Registry.e(System.currentTimeMillis());
         long var18 = 275634842768439116L;
         Object[] var17 = var10005;
         Ref.h(275634842768439116L, var17, var18);

         try {
            ;
         } catch (InvocationTargetException var67) {
            throw var67.getTargetException();
         }
      }

      var10002 = Registry.emptyArgs();
      long var20 = 408177353860141270L;
      Object[] var19 = var10002;
      var10002 = Ref.h(408177353860141270L, var19, var20);

      try {
         var10002 = (ArrayList)var10002;
      } catch (InvocationTargetException var66) {
         throw var66.getTargetException();
      }

      var10002.add(var2);
      Object var21 = 601657008259262484L;
      Ref.g(601657008259262484L, var21);
      Object[] var76 = Registry.packArgs(var1);
      long var24 = 267026473738179692L;
      Object[] var23 = var76;
      Ref.h(267026473738179692L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var65) {
         throw var65.getTargetException();
      }

      Object var25 = 601657008259262484L;
      Ref.g(601657008259262484L, var25);
      Object[] var10006 = Registry.emptyArgs();
      long var28 = 379202494105999184L;
      Object[] var27 = var10006;
      Ref.h(379202494105999184L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var64) {
         throw var64.getTargetException();
      }

      Object var29 = 567366698646146944L;
      Ref.g(567366698646146944L, var29);
      Object[] var10009 = Registry.emptyArgs();
      long var32 = 194080076253066315L;
      Object[] var31 = var10009;
      var10009 = Registry.packArgs(Ref.h(194080076253066315L, var31, var32));
      long var34 = 355138127201562772L;
      Object[] var33 = var10009;
      Ref.h(355138127201562772L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var63) {
         throw var63.getTargetException();
      }

      Object[] var10010 = Registry.emptyArgs();
      long var36 = 358371840708368096L;
      Object[] var35 = var10010;
      Ref.h(358371840708368096L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var62) {
         throw var62.getTargetException();
      }

      new F8();
      Object[] var10013 = Registry.emptyArgs();
      long var38 = 286931176286176762L;
      Object[] var37 = var10013;
      Object[] var10012 = Registry.packArgs(var2, Ref.h(286931176286176762L, var37, var38));
      long var40 = 407014907239672455L;
      Object[] var39 = var10012;
      Ref.h(407014907239672455L, var39, var40);

      try {
         ;
      } catch (InvocationTargetException var61) {
         throw var61.getTargetException();
      }

      var10013 = Registry.packArgs(var2);
      long var42 = 276170834929945961L;
      Object[] var41 = var10013;
      Ref.h(276170834929945961L, var41, var42);

      try {
         ;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      Object var43 = 567366698646146944L;
      Ref.g(567366698646146944L, var43);
      Object[] var10015 = Registry.emptyArgs();
      long var46 = 254774089477135261L;
      Object[] var45 = var10015;
      Ref.h(254774089477135261L, var45, var46);

      try {
         ;
      } catch (InvocationTargetException var59) {
         throw var59.getTargetException();
      }

      Registry.emptyArgs();
      long var47 = 270389152141252877L;
      Ref.h2(270389152141252877L, var47);
      Object[] var10017 = Registry.emptyArgs();
      long var50 = 578864097947885485L;
      Object[] var49 = var10017;
      Ref.h(578864097947885485L, var49, var50);

      try {
         ;
      } catch (InvocationTargetException var58) {
         throw var58.getTargetException();
      }

      Registry.emptyArgs();
      long var51 = 270389152141252877L;
      Ref.h2(270389152141252877L, var51);
      Object[] var10019 = Registry.emptyArgs();
      long var54 = 612604310671515822L;
      Object[] var53 = var10019;
      Ref.h(612604310671515822L, var53, var54);
      Object[] var10020 = Registry.emptyArgs();
      long var56 = 200561288808923907L;
      Object[] var55 = var10020;
      Ref.h(200561288808923907L, var55, var56);

      try {
         ;
      } catch (InvocationTargetException var57) {
         throw var57.getTargetException();
      }
   }

   public void b(T32 var1, String var2, String var3, String var4, boolean var5, boolean var6) {
      AppendCarriageReturnCRPanel.Y();
      Registry.emptyArgs();
      long var11 = 270389152141252877L;
      Ref.h2(270389152141252877L, var11);
      Object[] var10003 = Registry.emptyArgs();
      long var14 = 306266403902896148L;
      Object[] var13 = var10003;
      var10003 = Ref.h(306266403902896148L, var13, var14);
      Lj4_2 var10004 = (Lj4_2)(Registry.packArgs(var2));
      long var16 = 493256411906836966L;
      Object[] var15 = var10004;
      var10004 = Ref.h(493256411906836966L, var15, var16);

      try {
         var10004 = (Lj4_2)var10004;
      } catch (InvocationTargetException var63) {
         throw var63.getTargetException();
      }

      Lj4_2 var8 = var10004;
      Object var7 = var10003;
      var10004 = Registry.packArgs(var4);
      long var18 = 372027305840941998L;
      Object[] var17 = var10004;
      Ref.h(372027305840941998L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var62) {
         throw var62.getTargetException();
      }

      Object[] var10005 = Registry.packArgs(var3);
      long var20 = 193904661956891993L;
      Object[] var19 = var10005;
      Ref.h(193904661956891993L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var61) {
         throw var61.getTargetException();
      }

      long var9 = System.currentTimeMillis();
      if (var7 == null) {
         if (var6) {
            Object[] var10006 = Registry.e(var9);
            long var22 = 379623615202365815L;
            Object[] var21 = var10006;
            Ref.h(379623615202365815L, var21, var22);

            try {
               ;
            } catch (InvocationTargetException var60) {
               throw var60.getTargetException();
            }
         }

         Object[] var68 = Registry.e(var9);
         long var24 = 448034136929726083L;
         Object[] var23 = var68;
         Ref.h(448034136929726083L, var23, var24);

         try {
            ;
         } catch (InvocationTargetException var59) {
            throw var59.getTargetException();
         }

         Object[] var10007 = Registry.packArgs(var5);
         long var26 = 533048980031250758L;
         Object[] var25 = var10007;
         Ref.h(533048980031250758L, var25, var26);

         try {
            ;
         } catch (InvocationTargetException var58) {
            throw var58.getTargetException();
         }

         Object[] var10008 = Registry.packArgs(var3);
         long var28 = 519460332647460288L;
         Object[] var27 = var10008;
         Ref.h(519460332647460288L, var27, var28);

         try {
            ;
         } catch (InvocationTargetException var57) {
            throw var57.getTargetException();
         }

         Object[] var10009 = Registry.packArgs(var8);
         long var30 = 276170834929945961L;
         Object[] var29 = var10009;
         Ref.h(276170834929945961L, var29, var30);

         try {
            ;
         } catch (InvocationTargetException var56) {
            throw var56.getTargetException();
         }

         Registry.emptyArgs();
         long var31 = 270389152141252877L;
         Ref.h2(270389152141252877L, var31);
         Object[] var10011 = Registry.emptyArgs();
         long var34 = 578864097947885485L;
         Object[] var33 = var10011;
         Ref.h(578864097947885485L, var33, var34);

         try {
            ;
         } catch (InvocationTargetException var55) {
            throw var55.getTargetException();
         }

         Object[] var10012 = Registry.emptyArgs();
         long var36 = 584096728105558414L;
         Object[] var35 = var10012;
         Ref.h(584096728105558414L, var35, var36);
         Object[] var10013 = Registry.packArgs(var1);
         long var38 = 379860037679905473L;
         Object[] var37 = var10013;
         Ref.h(379860037679905473L, var37, var38);

         try {
            ;
         } catch (InvocationTargetException var54) {
            throw var54.getTargetException();
         }

         Object var39 = 567366698646146944L;
         Ref.g(567366698646146944L, var39);
         Object[] var10015 = Registry.emptyArgs();
         long var42 = 212885583671664730L;
         Object[] var41 = var10015;
         Ref.h(212885583671664730L, var41, var42);

         try {
            ;
         } catch (InvocationTargetException var53) {
            throw var53.getTargetException();
         }

         Object var43 = 567366698646146944L;
         Ref.g(567366698646146944L, var43);
         Object[] var10017 = Registry.emptyArgs();
         long var46 = 254774089477135261L;
         Object[] var45 = var10017;
         Ref.h(254774089477135261L, var45, var46);

         try {
            ;
         } catch (InvocationTargetException var52) {
            throw var52.getTargetException();
         }

         Object var47 = 601657008259262484L;
         Ref.g(601657008259262484L, var47);
         Object[] var10019 = Registry.packArgs(var1);
         long var50 = 378872941695439507L;
         Object[] var49 = var10019;
         Ref.h(378872941695439507L, var49, var50);

         try {
            ;
         } catch (InvocationTargetException var51) {
            throw var51.getTargetException();
         }
      }
   }

   void M(Y9 var1) {
      Object var11 = 601657008259262484L;
      Component[] var3 = ((AM)Ref.g(601657008259262484L, var11)).getComponents();
      ArrayList var4 = new ArrayList();
      int[] var10001 = AppendCarriageReturnCRPanel.Y();
      Component[] var5 = var3;
      int[] var2 = var10001;
      int var6 = var3.length;
      int var7 = 0;

      Object var48;
      while (true) {
         if (var7 < var6) {
            Component var8 = var5[var7];
            Bq2 var9 = (Bq2)var8;
            Object[] var10002 = Registry.emptyArgs();
            long var14 = 227343441450903310L;
            Object[] var13 = var10002;
            Ref.h(227343441450903310L, var13, var14);
            var48 = Registry.emptyArgs();
            long var16 = 348047003824927685L;
            Object[] var15 = (Object[])var48;
            Lj4_2 var10 = (Lj4_2)Ref.h(348047003824927685L, var15, var16);
            var48 = var4;
            if (var2 != null) {
               break;
            }

            var4.add(var10);
            var7++;
            if (var2 == null) {
               continue;
            }
         }

         Object[] var47 = Registry.emptyArgs();
         long var18 = 625676037677438329L;
         Object[] var17 = var47;
         Ref.h(625676037677438329L, var17, var18);
         var48 = Registry.emptyArgs();
         long var20 = 348047003824927685L;
         Object[] var19 = (Object[])var48;
         var48 = Ref.h(348047003824927685L, var19, var20);

         try {
            var48 = var48;
            break;
         } catch (InvocationTargetException var45) {
            throw var45.getTargetException();
         }
      }

      Lj4_2 var46 = (Lj4_2)var48;
      Registry.packArgs(var1, var4, var46);
      long var21 = 186563482927567915L;
      Ref.h2(186563482927567915L, var21);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      Registry.emptyArgs();
      long var23 = 270389152141252877L;
      Ref.h2(270389152141252877L, var23);
      Object[] var10006 = Registry.emptyArgs();
      long var26 = 306266403902896148L;
      Object[] var25 = var10006;
      Ref.h(306266403902896148L, var25, var26);
      Object var27 = 424248557458462193L;
      Object[] var10008 = Registry.packArgs(Ref.g(424248557458462193L, var27));
      long var30 = 233092091994680304L;
      Object[] var29 = var10008;
      Ref.h(233092091994680304L, var29, var30);
      Object[] var10009 = Registry.packArgs(var4);
      long var32 = 325285643417343723L;
      Object[] var31 = var10009;
      Ref.h(325285643417343723L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      Object var33 = 567366698646146944L;
      Ref.g(567366698646146944L, var33);
      Object[] var10011 = Registry.emptyArgs();
      long var36 = 254774089477135261L;
      Object[] var35 = var10011;
      Ref.h(254774089477135261L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      Registry.emptyArgs();
      long var37 = 270389152141252877L;
      Ref.h2(270389152141252877L, var37);
      Object[] var10013 = Registry.emptyArgs();
      long var40 = 578864097947885485L;
      Object[] var39 = var10013;
      Ref.h(578864097947885485L, var39, var40);

      try {
         ;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }
   }

   public void a(T32 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 348047003824927685L;
      Object[] var3 = var10001;
      Lj4_2 var2 = (Lj4_2)Ref.h(348047003824927685L, var3, var4);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 547398689030025911L;
      Object[] var5 = var10002;
      Registry.packArgs(Ref.h(547398689030025911L, var5, var6));
      long var7 = 396962080382410298L;
      Ref.h2(396962080382410298L, var7);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void B(T32 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 348047003824927685L;
      Object[] var3 = var10001;
      Lj4_2 var2 = (Lj4_2)Ref.h(348047003824927685L, var3, var4);
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 306266403902896148L;
      Object[] var7 = var10003;
      Ref.h(306266403902896148L, var7, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 194080076253066315L;
      Object[] var9 = var10005;
      var10005 = Registry.packArgs(Ref.h(194080076253066315L, var9, var10));
      long var12 = 616651502717058269L;
      Object[] var11 = var10005;
      Ref.h(616651502717058269L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10007 = Registry.emptyArgs();
      long var16 = 578864097947885485L;
      Object[] var15 = var10007;
      Ref.h(578864097947885485L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      Object var17 = 601657008259262484L;
      Ref.g(601657008259262484L, var17);
      Object[] var10009 = Registry.packArgs(var1);
      long var20 = 267026473738179692L;
      Object[] var19 = var10009;
      Ref.h(267026473738179692L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      Object var21 = 601657008259262484L;
      Ref.g(601657008259262484L, var21);
      Object[] var10011 = Registry.emptyArgs();
      long var24 = 379202494105999184L;
      Object[] var23 = var10011;
      Ref.h(379202494105999184L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      Object var25 = 567366698646146944L;
      Ref.g(567366698646146944L, var25);
      Object[] var10013 = Registry.emptyArgs();
      long var28 = 254774089477135261L;
      Object[] var27 = var10013;
      Ref.h(254774089477135261L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      Registry.emptyArgs();
      long var29 = 270389152141252877L;
      Ref.h2(270389152141252877L, var29);
      Object[] var10015 = Registry.emptyArgs();
      long var32 = 445913128761932285L;
      Object[] var31 = var10015;
      Ref.h(445913128761932285L, var31, var32);
      Object[] var10017 = Registry.emptyArgs();
      long var34 = 194080076253066315L;
      Object[] var33 = var10017;
      Ref.h(194080076253066315L, var33, var34);
      Object[] var10019 = Registry.emptyArgs();
      long var36 = 286931176286176762L;
      Object[] var35 = var10019;
      Object[] var10018 = Registry.packArgs(var2, Ref.h(286931176286176762L, var35, var36), Registry.lookupField(589216127597200618L).getInt(null));
      long var38 = 200839191777796316L;
      Object[] var37 = var10018;
      Ref.h(200839191777796316L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }
   }

   public Li4 i() {
      Object var1 = 597736782183485260L;
      return (Li4)Ref.g(597736782183485260L, var1);
   }

   public void d(Li4 var1) {
      long var3 = 597736782183485260L;
      Ref.s(597736782183485260L, var1, var3);
   }

   @Override
   public void P(Y9 var1) {
   }

   @Override
   public void v(Y9 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 436219151453922381L;
      Object[] var3 = var10001;
      Ref.h(436219151453922381L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Override
   public void U(Y9 var1) {
   }

   @Override
   public void D(Y9 var1) {
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 500459502209945715L;
      Object[] var2 = var10001;
      Ref.h(500459502209945715L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void K(Y9 var1) {
      AppendCarriageReturnCRPanel.Y();
      MouseEvent var10002 = (MouseEvent)(Registry.emptyArgs());
      long var17 = 446119396850912594L;
      Object[] var16 = var10002;
      var10002 = Ref.h(446119396850912594L, var16, var17);

      try {
         var10002 = (MouseEvent)var10002;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      MouseEvent var3 = var10002;
      Y9 var2 = var1;
      int var10001 = var3.getButton();
      byte var77 = 3;
      if (var1 == null) {
         if (var10001 == 3) {
            Object var18 = 601657008259262484L;
            Ref.g(601657008259262484L, var18);
            Object[] var10004 = Registry.emptyArgs();
            long var21 = 625676037677438329L;
            Object[] var20 = var10004;
            var10004 = Registry.packArgs(Ref.h(625676037677438329L, var20, var21));
            long var23 = 176011466134249595L;
            Object[] var22 = var10004;
            Ref.h(176011466134249595L, var22, var23);

            try {
               ;
            } catch (InvocationTargetException var72) {
               throw var72.getTargetException();
            }

            JPopupMenu var4 = new JPopupMenu();
            JMenuItem var5 = new JMenuItem(a(-4725, 30188));
            var5.addActionListener(new Ag2(this));
            var4.add(var5);
            JMenuItem var6 = new JMenuItem(a(-4721, 18238));
            var6.addActionListener(new Mf2(this));
            var4.add(var6);
            JMenuItem var7 = new JMenuItem(a(-4723, 24431));
            var7.addActionListener(new K(this));
            var4.add(var7);
            JMenuItem var8 = new JMenuItem(a(-4727, 24735));
            var8.addActionListener(new ConfirmDeleteCommandListener(this));
            var4.add(var8);
            var4.addSeparator();
            JMenuItem var9 = new JMenuItem(a(-4726, 11158));
            var9.addActionListener(new JK(this));
            var4.add(var9);
            var4.addSeparator();
            JMenu var10 = new JMenu(a(-4722, 12324));
            var4.add(var10);
            Registry.emptyArgs();
            long var24 = 270389152141252877L;
            Ref.h2(270389152141252877L, var24);
            Object[] var10006 = Registry.emptyArgs();
            long var27 = 306266403902896148L;
            Object[] var26 = var10006;
            Ref.h(306266403902896148L, var26, var27);
            ArrayList var10007 = (ArrayList)(Registry.emptyArgs());
            long var29 = 518875030097846779L;
            Object[] var28 = var10007;
            var10007 = Ref.h(518875030097846779L, var28, var29);

            try {
               var10007 = (ArrayList)var10007;
            } catch (InvocationTargetException var71) {
               throw var71.getTargetException();
            }

            ArrayList var11 = var10007;
            Iterator var12 = var11.iterator();

            while (true) {
               if (var12.hasNext()) {
                  Li4 var13 = (Li4)var12.next();
                  String var10008 = (String)(Registry.emptyArgs());
                  long var31 = 286931176286176762L;
                  Object[] var30 = var10008;
                  var10008 = Ref.h(286931176286176762L, var30, var31);

                  try {
                     var10008 = (String)var10008;
                  } catch (InvocationTargetException var68) {
                     throw var68.getTargetException();
                  }

                  String var14 = var10008;
                  if (var2 != null) {
                     break;
                  }

                  Object[] var10009 = Registry.emptyArgs();
                  long var33 = 194080076253066315L;
                  Object[] var32 = var10009;
                  Ref.h(194080076253066315L, var32, var33);

                  try {
                     ;
                  } catch (InvocationTargetException var70) {
                     throw var70.getTargetException();
                  }

                  Object var34 = 597736782183485260L;
                  Object var10011 = Ref.g(597736782183485260L, var34);
                  String var10012 = (String)(Registry.emptyArgs());
                  long var37 = 194080076253066315L;
                  Object[] var36 = var10012;
                  var10012 = Ref.h(194080076253066315L, var36, var37);

                  try {
                     var10012 = (String)var10012;
                  } catch (InvocationTargetException var69) {
                     throw var69.getTargetException();
                  }

                  if (!var10011.equals(var10012)) {
                     JMenuItem var15 = new JMenuItem(var14);
                     var15.addActionListener(new Bd4(this, var14));
                     var10.add(var15);
                  }

                  if (var2 == null) {
                     continue;
                  }
               }

               var4.show((Component)var3.getSource(), var3.getX(), var3.getY());
               break;
            }

            if (var2 == null) {
               return;
            }
         }

         var10001 = var3.getButton();
         var77 = 1;
      }

      if (var10001 == var77) {
         Object var38 = 601657008259262484L;
         Ref.g(601657008259262484L, var38);
         Object[] var10003 = Registry.emptyArgs();
         long var41 = 194560825135347400L;
         Object[] var40 = var10003;
         Ref.h(194560825135347400L, var40, var41);

         try {
            ;
         } catch (InvocationTargetException var67) {
            throw var67.getTargetException();
         }

         Object[] var79 = Registry.emptyArgs();
         long var43 = 348047003824927685L;
         Object[] var42 = var79;
         Lj4_2 var74 = (Lj4_2)Ref.h(348047003824927685L, var42, var43);
         long var45 = 276279084084149402L;
         Ref.s(276279084084149402L, var74, var45);
         Object var46 = 567366698646146944L;
         Ref.g(567366698646146944L, var46);
         Object var48 = 276279084084149402L;
         Object[] var84 = Registry.packArgs(Ref.g(276279084084149402L, var48));
         long var51 = 126130829284871178L;
         Object[] var50 = var84;
         Ref.h(126130829284871178L, var50, var51);

         try {
            ;
         } catch (InvocationTargetException var66) {
            throw var66.getTargetException();
         }

         Object var52 = 567366698646146944L;
         Ref.g(567366698646146944L, var52);
         Object var54 = 276279084084149402L;
         Object[] var85 = Registry.packArgs(Ref.g(276279084084149402L, var54));
         long var57 = 268892086263649472L;
         Object[] var56 = var85;
         Ref.h(268892086263649472L, var56, var57);

         try {
            ;
         } catch (InvocationTargetException var65) {
            throw var65.getTargetException();
         }

         Object var58 = 567366698646146944L;
         Ref.g(567366698646146944L, var58);
         Object var60 = 276279084084149402L;
         Object[] var10014 = Registry.packArgs(Ref.g(276279084084149402L, var60));
         long var63 = 164326793235876733L;
         Object[] var62 = var10014;
         Ref.h(164326793235876733L, var62, var63);

         try {
            ;
         } catch (InvocationTargetException var64) {
            throw var64.getTargetException();
         }
      }
   }

   public void D() {
      Object var2 = 601657008259262484L;
      Ref.g(601657008259262484L, var2);
      T32 var10002 = (T32)(Registry.emptyArgs());
      long var5 = 194560825135347400L;
      Object[] var4 = var10002;
      var10002 = Ref.h(194560825135347400L, var4, var5);

      try {
         var10002 = (T32)var10002;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      T32 var1 = var10002;
      Object var6 = 567366698646146944L;
      Ref.g(567366698646146944L, var6);
      Object[] var10004 = Registry.packArgs(var1);
      long var9 = 490004298405087400L;
      Object[] var8 = var10004;
      Ref.h(490004298405087400L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public AM H$aM() {
      Object var1 = 601657008259262484L;
      return (AM)Ref.g(601657008259262484L, var1);
   }

   public void y(AM var1) {
      long var3 = 601657008259262484L;
      Ref.s(601657008259262484L, var1, var3);
   }

   public Li4 w() {
      Object var1 = 597736782183485260L;
      return (Li4)Ref.g(597736782183485260L, var1);
   }

   public void I(Li4 var1) {
      long var3 = 597736782183485260L;
      Ref.s(597736782183485260L, var1, var3);
   }

   public AppendCarriageReturnCRPanel H$yB_3() {
      Object var1 = 567366698646146944L;
      return (AppendCarriageReturnCRPanel)Ref.g(567366698646146944L, var1);
   }

   public void f(AppendCarriageReturnCRPanel var1) {
      long var3 = 567366698646146944L;
      Ref.s(567366698646146944L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -4722) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 60;
               break;
            case 1:
               var10000 = 132;
               break;
            case 2:
               var10000 = 228;
               break;
            case 3:
               var10000 = 48;
               break;
            case 4:
               var10000 = 185;
               break;
            case 5:
               var10000 = 43;
               break;
            case 6:
               var10000 = 44;
               break;
            case 7:
               var10000 = 206;
               break;
            case 8:
               var10000 = 194;
               break;
            case 9:
               var10000 = 39;
               break;
            case 10:
               var10000 = 47;
               break;
            case 11:
               var10000 = 234;
               break;
            case 12:
               var10000 = 113;
               break;
            case 13:
               var10000 = 155;
               break;
            case 14:
               var10000 = 18;
               break;
            case 15:
               var10000 = 35;
               break;
            case 16:
               var10000 = 219;
               break;
            case 17:
               var10000 = 188;
               break;
            case 18:
               var10000 = 137;
               break;
            case 19:
               var10000 = 214;
               break;
            case 20:
               var10000 = 254;
               break;
            case 21:
               var10000 = 41;
               break;
            case 22:
               var10000 = 22;
               break;
            case 23:
               var10000 = 94;
               break;
            case 24:
               var10000 = 255;
               break;
            case 25:
               var10000 = 38;
               break;
            case 26:
               var10000 = 192;
               break;
            case 27:
               var10000 = 237;
               break;
            case 28:
               var10000 = 95;
               break;
            case 29:
               var10000 = 233;
               break;
            case 30:
               var10000 = 146;
               break;
            case 31:
               var10000 = 229;
               break;
            case 32:
               var10000 = 179;
               break;
            case 33:
               var10000 = 86;
               break;
            case 34:
               var10000 = 130;
               break;
            case 35:
               var10000 = 7;
               break;
            case 36:
               var10000 = 156;
               break;
            case 37:
               var10000 = 183;
               break;
            case 38:
               var10000 = 57;
               break;
            case 39:
               var10000 = 133;
               break;
            case 40:
               var10000 = 171;
               break;
            case 41:
               var10000 = 199;
               break;
            case 42:
               var10000 = 162;
               break;
            case 43:
               var10000 = 243;
               break;
            case 44:
               var10000 = 161;
               break;
            case 45:
               var10000 = 227;
               break;
            case 46:
               var10000 = 136;
               break;
            case 47:
               var10000 = 253;
               break;
            case 48:
               var10000 = 144;
               break;
            case 49:
               var10000 = 121;
               break;
            case 50:
               var10000 = 177;
               break;
            case 51:
               var10000 = 134;
               break;
            case 52:
               var10000 = 91;
               break;
            case 53:
               var10000 = 122;
               break;
            case 54:
               var10000 = 176;
               break;
            case 55:
               var10000 = 203;
               break;
            case 56:
               var10000 = 115;
               break;
            case 57:
               var10000 = 4;
               break;
            case 58:
               var10000 = 53;
               break;
            case 59:
               var10000 = 217;
               break;
            case 60:
               var10000 = 225;
               break;
            case 61:
               var10000 = 193;
               break;
            case 62:
               var10000 = 93;
               break;
            case 63:
               var10000 = 182;
               break;
            case 64:
               var10000 = 153;
               break;
            case 65:
               var10000 = 222;
               break;
            case 66:
               var10000 = 52;
               break;
            case 67:
               var10000 = 0;
               break;
            case 68:
               var10000 = 128;
               break;
            case 69:
               var10000 = 116;
               break;
            case 70:
               var10000 = 246;
               break;
            case 71:
               var10000 = 196;
               break;
            case 72:
               var10000 = 65;
               break;
            case 73:
               var10000 = 99;
               break;
            case 74:
               var10000 = 250;
               break;
            case 75:
               var10000 = 58;
               break;
            case 76:
               var10000 = 56;
               break;
            case 77:
               var10000 = 20;
               break;
            case 78:
               var10000 = 27;
               break;
            case 79:
               var10000 = 154;
               break;
            case 80:
               var10000 = 145;
               break;
            case 81:
               var10000 = 25;
               break;
            case 82:
               var10000 = 120;
               break;
            case 83:
               var10000 = 241;
               break;
            case 84:
               var10000 = 80;
               break;
            case 85:
               var10000 = 24;
               break;
            case 86:
               var10000 = 169;
               break;
            case 87:
               var10000 = 107;
               break;
            case 88:
               var10000 = 29;
               break;
            case 89:
               var10000 = 64;
               break;
            case 90:
               var10000 = 103;
               break;
            case 91:
               var10000 = 126;
               break;
            case 92:
               var10000 = 218;
               break;
            case 93:
               var10000 = 67;
               break;
            case 94:
               var10000 = 247;
               break;
            case 95:
               var10000 = 89;
               break;
            case 96:
               var10000 = 111;
               break;
            case 97:
               var10000 = 147;
               break;
            case 98:
               var10000 = 158;
               break;
            case 99:
               var10000 = 66;
               break;
            case 100:
               var10000 = 211;
               break;
            case 101:
               var10000 = 1;
               break;
            case 102:
               var10000 = 69;
               break;
            case 103:
               var10000 = 208;
               break;
            case 104:
               var10000 = 40;
               break;
            case 105:
               var10000 = 15;
               break;
            case 106:
               var10000 = 157;
               break;
            case 107:
               var10000 = 108;
               break;
            case 108:
               var10000 = 173;
               break;
            case 109:
               var10000 = 119;
               break;
            case 110:
               var10000 = 54;
               break;
            case 111:
               var10000 = 98;
               break;
            case 112:
               var10000 = 160;
               break;
            case 113:
               var10000 = 105;
               break;
            case 114:
               var10000 = 77;
               break;
            case 115:
               var10000 = 12;
               break;
            case 116:
               var10000 = 191;
               break;
            case 117:
               var10000 = 223;
               break;
            case 118:
               var10000 = 245;
               break;
            case 119:
               var10000 = 198;
               break;
            case 120:
               var10000 = 230;
               break;
            case 121:
               var10000 = 109;
               break;
            case 122:
               var10000 = 2;
               break;
            case 123:
               var10000 = 34;
               break;
            case 124:
               var10000 = 226;
               break;
            case 125:
               var10000 = 76;
               break;
            case 126:
               var10000 = 249;
               break;
            case 127:
               var10000 = 51;
               break;
            case 128:
               var10000 = 26;
               break;
            case 129:
               var10000 = 178;
               break;
            case 130:
               var10000 = 68;
               break;
            case 131:
               var10000 = 152;
               break;
            case 132:
               var10000 = 165;
               break;
            case 133:
               var10000 = 100;
               break;
            case 134:
               var10000 = 240;
               break;
            case 135:
               var10000 = 167;
               break;
            case 136:
               var10000 = 202;
               break;
            case 137:
               var10000 = 140;
               break;
            case 138:
               var10000 = 231;
               break;
            case 139:
               var10000 = 45;
               break;
            case 140:
               var10000 = 59;
               break;
            case 141:
               var10000 = 10;
               break;
            case 142:
               var10000 = 186;
               break;
            case 143:
               var10000 = 92;
               break;
            case 144:
               var10000 = 75;
               break;
            case 145:
               var10000 = 104;
               break;
            case 146:
               var10000 = 251;
               break;
            case 147:
               var10000 = 141;
               break;
            case 148:
               var10000 = 3;
               break;
            case 149:
               var10000 = 110;
               break;
            case 150:
               var10000 = 159;
               break;
            case 151:
               var10000 = 239;
               break;
            case 152:
               var10000 = 85;
               break;
            case 153:
               var10000 = 181;
               break;
            case 154:
               var10000 = 31;
               break;
            case 155:
               var10000 = 17;
               break;
            case 156:
               var10000 = 163;
               break;
            case 157:
               var10000 = 90;
               break;
            case 158:
               var10000 = 14;
               break;
            case 159:
               var10000 = 220;
               break;
            case 160:
               var10000 = 166;
               break;
            case 161:
               var10000 = 244;
               break;
            case 162:
               var10000 = 200;
               break;
            case 163:
               var10000 = 9;
               break;
            case 164:
               var10000 = 180;
               break;
            case 165:
               var10000 = 112;
               break;
            case 166:
               var10000 = 212;
               break;
            case 167:
               var10000 = 11;
               break;
            case 168:
               var10000 = 124;
               break;
            case 169:
               var10000 = 139;
               break;
            case 170:
               var10000 = 168;
               break;
            case 171:
               var10000 = 252;
               break;
            case 172:
               var10000 = 190;
               break;
            case 173:
               var10000 = 150;
               break;
            case 174:
               var10000 = 127;
               break;
            case 175:
               var10000 = 213;
               break;
            case 176:
               var10000 = 36;
               break;
            case 177:
               var10000 = 23;
               break;
            case 178:
               var10000 = 215;
               break;
            case 179:
               var10000 = 96;
               break;
            case 180:
               var10000 = 50;
               break;
            case 181:
               var10000 = 88;
               break;
            case 182:
               var10000 = 172;
               break;
            case 183:
               var10000 = 118;
               break;
            case 184:
               var10000 = 131;
               break;
            case 185:
               var10000 = 232;
               break;
            case 186:
               var10000 = 83;
               break;
            case 187:
               var10000 = 187;
               break;
            case 188:
               var10000 = 62;
               break;
            case 189:
               var10000 = 216;
               break;
            case 190:
               var10000 = 175;
               break;
            case 191:
               var10000 = 149;
               break;
            case 192:
               var10000 = 79;
               break;
            case 193:
               var10000 = 6;
               break;
            case 194:
               var10000 = 242;
               break;
            case 195:
               var10000 = 184;
               break;
            case 196:
               var10000 = 238;
               break;
            case 197:
               var10000 = 55;
               break;
            case 198:
               var10000 = 49;
               break;
            case 199:
               var10000 = 125;
               break;
            case 200:
               var10000 = 106;
               break;
            case 201:
               var10000 = 114;
               break;
            case 202:
               var10000 = 207;
               break;
            case 203:
               var10000 = 13;
               break;
            case 204:
               var10000 = 37;
               break;
            case 205:
               var10000 = 148;
               break;
            case 206:
               var10000 = 221;
               break;
            case 207:
               var10000 = 74;
               break;
            case 208:
               var10000 = 30;
               break;
            case 209:
               var10000 = 117;
               break;
            case 210:
               var10000 = 70;
               break;
            case 211:
               var10000 = 129;
               break;
            case 212:
               var10000 = 170;
               break;
            case 213:
               var10000 = 16;
               break;
            case 214:
               var10000 = 210;
               break;
            case 215:
               var10000 = 71;
               break;
            case 216:
               var10000 = 135;
               break;
            case 217:
               var10000 = 205;
               break;
            case 218:
               var10000 = 87;
               break;
            case 219:
               var10000 = 189;
               break;
            case 220:
               var10000 = 236;
               break;
            case 221:
               var10000 = 151;
               break;
            case 222:
               var10000 = 72;
               break;
            case 223:
               var10000 = 97;
               break;
            case 224:
               var10000 = 8;
               break;
            case 225:
               var10000 = 143;
               break;
            case 226:
               var10000 = 224;
               break;
            case 227:
               var10000 = 204;
               break;
            case 228:
               var10000 = 32;
               break;
            case 229:
               var10000 = 73;
               break;
            case 230:
               var10000 = 33;
               break;
            case 231:
               var10000 = 46;
               break;
            case 232:
               var10000 = 195;
               break;
            case 233:
               var10000 = 61;
               break;
            case 234:
               var10000 = 248;
               break;
            case 235:
               var10000 = 123;
               break;
            case 236:
               var10000 = 102;
               break;
            case 237:
               var10000 = 101;
               break;
            case 238:
               var10000 = 19;
               break;
            case 239:
               var10000 = 42;
               break;
            case 240:
               var10000 = 142;
               break;
            case 241:
               var10000 = 164;
               break;
            case 242:
               var10000 = 201;
               break;
            case 243:
               var10000 = 197;
               break;
            case 244:
               var10000 = 21;
               break;
            case 245:
               var10000 = 138;
               break;
            case 246:
               var10000 = 28;
               break;
            case 247:
               var10000 = 78;
               break;
            case 248:
               var10000 = 84;
               break;
            case 249:
               var10000 = 235;
               break;
            case 250:
               var10000 = 5;
               break;
            case 251:
               var10000 = 82;
               break;
            case 252:
               var10000 = 81;
               break;
            case 253:
               var10000 = 209;
               break;
            case 254:
               var10000 = 174;
               break;
            default:
               var10000 = 63;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27888;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[8];
      int var11 = 0;
      String var10 = "秶勪刦\u0004夁剸咽丈\u000fÖé¡è\u009aÔ|8u.¹\u0007@p\u0080\u0002翏較\b攟廡斎乼奘úÎ\u0016\u0007涯刦呀亇3ÕV";
      int var12 = "秶勪刦\u0004夁剸咽丈\u000fÖé¡è\u009aÔ|8u.¹\u0007@p\u0080\u0002翏較\b攟廡斎乼奘úÎ\u0016\u0007涯刦呀亇3ÕV".length();
      char var9 = 3;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 43;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
      Object[] var30;
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 41;
                        break;
                     case 1:
                        var58 = 114;
                        break;
                     case 2:
                        var58 = 39;
                        break;
                     case 3:
                        var58 = 19;
                        break;
                     case 4:
                        var58 = 109;
                        break;
                     case 5:
                        var58 = 95;
                        break;
                     default:
                        var58 = 22;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[8];
                     long var0 = 8222948675071951172L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "ë\"¬:D_\u0081ò\u0095\u008a\u007fü8\u00866õ";
                     int var5 = "ë\"¬:D_\u0081ò\u0095\u008a\u007fü8\u00866õ".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     d = var6;
                     e = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "LTbóQ\u008dÐy¹tY\u0015\u0004\u0001L\u0091SwYë{î\u000bÞea\u0083\u0085ª\u000eYSR\b\u001fbW\u0081Gæ:Æ°§øñ\u0002删陾";
                  var12 = "LTbóQ\u008dÐy¹tY\u0015\u0004\u0001L\u0091SwYë{î\u000bÞea\u0083\u0085ª\u000eYSR\b\u001fbW\u0081Gæ:Æ°§øñ\u0002删陾".length();
                  var9 = '.';
                  var16 = -1;
            }

            var10000 = 123;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





