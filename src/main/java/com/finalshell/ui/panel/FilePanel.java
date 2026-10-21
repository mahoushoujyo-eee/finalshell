package com.finalshell.ui.panel;

import com.finalshell.core.AL;
import com.finalshell.core.NY;
import com.finalshell.core.T32;
import com.finalshell.core.Y9;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Tt2;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;

public class FilePanel extends JPanel implements AL {
   ConnectionProperty p;
   String Y;
   AM h;
   Ge2 b;
   Address j;
   Lh2 r;
   boolean A;
   T32 y;
   T32 d;
   T32 B;
   AppendCarriageReturnCRPanel n;
   Cp2 g;
   int R;
   boolean D;
   String i;
   boolean f;
   public static boolean m;
   public static String[] a;
   public static String[] c;

   public FilePanel(ConnectionProperty var1) {
      Registry.lookupField(594293721204294006L).setBoolean(this, true);
      Registry.lookupField(315385164375078477L).setBoolean(this, true);
      long var4 = 275346031968216783L;
      Object var3 = null;
      Ref.s(275346031968216783L, var3, var4);
      Registry.lookupField(373201485708422755L).setBoolean(this, false);
      long var6 = 368229368988830859L;
      Ref.s(368229368988830859L, var1, var6);
      this.setOpaque(false);
      this.setLayout(new MigLayout(a(-6068, -16113), a(-6066, 24835), a(-6071, -731)));
      p$boolean();
      AM var10004 = new AM();
      long var8 = 316833191843640334L;
      AM var7 = var10004;
      Ref.s(316833191843640334L, var7, var8);
      Object var9 = 316833191843640334L;
      Ref.g(316833191843640334L, var9);
      Object[] var10006 = Registry.packArgs(false);
      long var12 = 326462668127767256L;
      Object[] var11 = var10006;
      Ref.h(326462668127767256L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var86) {
         throw var86.getTargetException();
      }

      Object var13 = 316833191843640334L;
      Ref.g(316833191843640334L, var13);
      Object[] var10008 = Registry.packArgs(false);
      long var16 = 244638313518960043L;
      Object[] var15 = var10008;
      Ref.h(244638313518960043L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var85) {
         throw var85.getTargetException();
      }

      Object var17 = 316833191843640334L;
      Ref.g(316833191843640334L, var17);
      Object[] var10010 = Registry.packArgs(false);
      long var20 = 165543570995805586L;
      Object[] var19 = var10010;
      Ref.h(165543570995805586L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var84) {
         throw var84.getTargetException();
      }

      Object var21 = 316833191843640334L;
      this.add((AM)Ref.g(316833191843640334L, var21), a(-6067, -27861));
      Object var23 = 316833191843640334L;
      Object var10013 = Ref.g(316833191843640334L, var23);
      Object[] var10014 = Registry.emptyArgs();
      long var26 = 435326248614032175L;
      Object[] var25 = var10014;
      var10014 = Ref.h(435326248614032175L, var25, var26);
      long var28 = 503693676675457665L;
      Object var27 = var10014;
      Ref.s(503693676675457665L, var27, var28);
      Object var2 = var10013;
      Object var29 = 503693676675457665L;
      ((Ge2)Ref.g(503693676675457665L, var29)).setOpaque(false);
      Object var31 = 503693676675457665L;
      this.add((Ge2)Ref.g(503693676675457665L, var31), a(-6072, 13910));
      Object var33 = 316833191843640334L;
      Ref.g(316833191843640334L, var33);
      Object[] var10017 = Registry.packArgs(this);
      long var36 = 253827983161591241L;
      Object[] var35 = var10017;
      Ref.h(253827983161591241L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var83) {
         throw var83.getTargetException();
      }

      Address var10018 = new Address();
      long var38 = 529307091863304391L;
      Address var37 = var10018;
      Ref.s(529307091863304391L, var37, var38);
      Object var39 = 529307091863304391L;
      Ref.g(529307091863304391L, var39);
      Object[] var10020 = Registry.packArgs(var1);
      long var42 = 262268198491031089L;
      Object[] var41 = var10020;
      Ref.h(262268198491031089L, var41, var42);

      try {
         ;
      } catch (InvocationTargetException var82) {
         throw var82.getTargetException();
      }

      Object var43 = 529307091863304391L;
      Ref.g(529307091863304391L, var43);
      Object[] var10022 = Registry.packArgs(this);
      long var46 = 189568124343374829L;
      Object[] var45 = var10022;
      Ref.h(189568124343374829L, var45, var46);

      try {
         ;
      } catch (InvocationTargetException var81) {
         throw var81.getTargetException();
      }

      Object var47 = 316833191843640334L;
      Ref.g(316833191843640334L, var47);
      Object var49 = 529307091863304391L;
      Object[] var10026 = Registry.packArgs(Ref.g(529307091863304391L, var49), a(-6065, -28611));
      long var52 = 407014907239672455L;
      Object[] var51 = var10026;
      var10026 = Ref.h(407014907239672455L, var51, var52);
      long var54 = 207695726482463276L;
      Object var53 = var10026;
      Ref.s(207695726482463276L, var53, var54);
      Cp2 var10027 = new Cp2();
      long var56 = 497053271897858177L;
      Cp2 var55 = var10027;
      Ref.s(497053271897858177L, var55, var56);
      if (var2 == false) {
         Object var57 = 165652197740112410L;
         if ((AppendCarriageReturnCRPanel)Ref.g(165652197740112410L, var57) == null) {
            AppendCarriageReturnCRPanel var10030;
            Object var59 = 497053271897858177L;
            super((Cp2)Ref.g(497053271897858177L, var59));
            long var62 = 165652197740112410L;
            AppendCarriageReturnCRPanel var61 = var10030;
            Ref.s(165652197740112410L, var61, var62);
         }

         Object[] var10029 = Registry.emptyArgs();
         long var64 = 391523999621654604L;
         Object[] var63 = var10029;
         Ref.h(391523999621654604L, var63, var64);

         try {
            ;
         } catch (InvocationTargetException var80) {
            throw var80.getTargetException();
         }

         Object var65 = 316833191843640334L;
         Ref.g(316833191843640334L, var65);
         Object var67 = 497053271897858177L;
         Object[] var10033 = Registry.packArgs(Ref.g(497053271897858177L, var67), a(-6069, -24343));
         long var70 = 407014907239672455L;
         Object[] var69 = var10033;
         var10033 = Ref.h(407014907239672455L, var69, var70);
         long var72 = 317002556145653527L;
         Object var71 = var10033;
         Ref.s(317002556145653527L, var71, var72);
         Object var73 = 316833191843640334L;
         Ref.g(316833191843640334L, var73);
         Object var75 = 207695726482463276L;
         Object[] var10036 = Registry.packArgs(Ref.g(207695726482463276L, var75));
         long var78 = 176011466134249595L;
         Object[] var77 = var10036;
         Ref.h(176011466134249595L, var77, var78);

         try {
            ;
         } catch (InvocationTargetException var79) {
            throw var79.getTargetException();
         }
      }

      Registry.lookupField(373201485708422755L).setBoolean(this, true);
      if (var2 != false) {
         Ky4.K(new String[2]);
      }
   }

   @Override
   protected void finalize() throws Throwable {
   }

   public void v() {
      Object var1 = 529307091863304391L;
      Ref.g(529307091863304391L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 270852994370383093L;
      Object[] var3 = var10002;
      Ref.h(270852994370383093L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Object var5 = 316833191843640334L;
      Ref.g(316833191843640334L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 470703154955857362L;
      Object[] var7 = var10004;
      Ref.h(470703154955857362L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      Object var9 = 497053271897858177L;
      Ref.g(497053271897858177L, var9);
      Object[] var10006 = Registry.emptyArgs();
      long var12 = 233200781534928224L;
      Object[] var11 = var10006;
      Ref.h(233200781534928224L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Registry.packArgs(this);
      long var13 = 242617331513341262L;
      Ref.h2(242617331513341262L, var13);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Object[] var10008 = Registry.emptyArgs();
      long var16 = 376184255771993381L;
      Object[] var15 = var10008;
      Ref.h(376184255771993381L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }
   }

   public void L$void() {
      Object var1 = 497053271897858177L;
      Ref.g(497053271897858177L, var1);
      Object var3 = 165652197740112410L;
      Object[] var10003 = Registry.packArgs(Ref.g(165652197740112410L, var3));
      long var6 = 224515254178442904L;
      Object[] var5 = var10003;
      Ref.h(224515254178442904L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void u() {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 399585344452154517L;
      Object[] var5 = var10002;
      Ref.h(399585344452154517L, var5, var6);
      NY var10003 = (NY)(Registry.emptyArgs());
      long var8 = 149968465491171480L;
      Object[] var7 = var10003;
      var10003 = Ref.h(149968465491171480L, var7, var8);

      try {
         var10003 = (NY)var10003;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      NY var1 = var10003;
      byte var15 = 2;
      Color var10008 = (Color)(Registry.emptyArgs());
      long var10 = 345089686683358688L;
      Object[] var9 = var10008;
      var10008 = Ref.h(345089686683358688L, var9, var10);

      try {
         var10008 = (Color)var10008;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      MatteBorder var2 = BorderFactory.createMatteBorder(0, 0, 0, (int)var1, var10008);
      this.setBorder(var2);
      this.setBorder(null);
   }

   public void P() {
      Registry.lookupField(610303840465563691L).setInt(this, Registry.lookupField(365550255727062967L).getInt(null));
      Object var1 = 316833191843640334L;
      Ref.g(316833191843640334L, var1);
      Object var3 = 207695726482463276L;
      Object[] var10003 = Registry.packArgs(Ref.g(207695726482463276L, var3));
      long var6 = 176011466134249595L;
      Object[] var5 = var10003;
      Ref.h(176011466134249595L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void X() {
      Registry.lookupField(610303840465563691L).setInt(this, Registry.lookupField(575606058119943329L).getInt(null));
      Object var1 = 316833191843640334L;
      Ref.g(316833191843640334L, var1);
      Object var3 = 317002556145653527L;
      Object[] var10003 = Registry.packArgs(Ref.g(317002556145653527L, var3));
      long var6 = 176011466134249595L;
      Object[] var5 = var10003;
      Ref.h(176011466134249595L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public Address p$F6() {
      Object var1 = 529307091863304391L;
      return (Address)Ref.g(529307091863304391L, var1);
   }

   public void t(Address var1) {
      long var3 = 529307091863304391L;
      Ref.s(529307091863304391L, var1, var3);
   }

   public AM G() {
      Object var1 = 316833191843640334L;
      return (AM)Ref.g(316833191843640334L, var1);
   }

   public void Y(AM var1) {
      long var3 = 316833191843640334L;
      Ref.s(316833191843640334L, var1, var3);
   }

   @Override
   public void P(Y9 var1) {
   }

   @Override
   public void v(Y9 var1) {
      T32 var10001 = (T32)(Registry.emptyArgs());
      long var7 = 625676037677438329L;
      Object[] var6 = var10001;
      var10001 = Ref.h(625676037677438329L, var6, var7);

      try {
         var10001 = (T32)var10001;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      T32 var3 = var10001;
      q();
      F8 var10003 = (F8)(Registry.emptyArgs());
      long var9 = 424156930953488367L;
      Object[] var8 = var10003;
      var10003 = Ref.h(424156930953488367L, var8, var9);

      try {
         var10003 = (F8)var10003;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      F8 var4 = var10003;
      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 306266403902896148L;
      Object[] var12 = var10004;
      Ref.h(306266403902896148L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      boolean var40 = Registry.lookupField(373201485708422755L).getBoolean(this);
      if (var3 != false) {
         if (!var40) {
            return;
         }

         var40 = var4.getClass().equals(Address.class);
      }

      label83: {
         if (var3 != false) {
            if (var40) {
               Registry.emptyArgs();
               long var14 = 270389152141252877L;
               Ref.h2(270389152141252877L, var14);
               Object[] var10006 = Registry.emptyArgs();
               long var17 = 306266403902896148L;
               Object[] var16 = var10006;
               Ref.h(306266403902896148L, var16, var17);
               Object[] var10007 = Registry.packArgs(Registry.lookupField(365550255727062967L).getInt(null));
               long var19 = 192862898326551774L;
               Object[] var18 = var10007;
               Ref.h(192862898326551774L, var18, var19);

               try {
                  ;
               } catch (InvocationTargetException var32) {
                  throw var32.getTargetException();
               }

               if (var3 != false) {
                  break label83;
               }
            }

            var40 = var4.getClass().equals(Cp2.class);
         }

         if (var40) {
            Registry.emptyArgs();
            long var20 = 270389152141252877L;
            Ref.h2(270389152141252877L, var20);
            Object[] var41 = Registry.emptyArgs();
            long var23 = 306266403902896148L;
            Object[] var22 = var41;
            Ref.h(306266403902896148L, var22, var23);
            Object[] var43 = Registry.packArgs(Registry.lookupField(575606058119943329L).getInt(null));
            long var25 = 192862898326551774L;
            Object[] var24 = var43;
            Ref.h(192862898326551774L, var24, var25);

            try {
               ;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }
         }
      }

      Registry.emptyArgs();
      long var26 = 270389152141252877L;
      Ref.h2(270389152141252877L, var26);
      Object[] var42 = Registry.emptyArgs();
      long var29 = 578864097947885485L;
      Object[] var28 = var42;
      Ref.h(578864097947885485L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }
   }

   @Override
   public void U(Y9 var1) {
   }

   @Override
   public void K(Y9 var1) {
   }

   @Override
   public void D(Y9 var1) {
   }

   public AppendCarriageReturnCRPanel Q() {
      Object var1 = 165652197740112410L;
      return (AppendCarriageReturnCRPanel)Ref.g(165652197740112410L, var1);
   }

   public void d(AppendCarriageReturnCRPanel var1) {
      long var3 = 165652197740112410L;
      Ref.s(165652197740112410L, var1, var3);
   }

   public int Y() {
      return Registry.lookupField(610303840465563691L).getInt(this);
   }

   public void q(int var1) {
      Registry.lookupField(610303840465563691L).setInt(this, var1);
      Registry.lookupField(315385164375078477L).setBoolean(this, false);
   }

   public boolean L$boolean() {
      return Registry.lookupField(315385164375078477L).getBoolean(this);
   }

   public void F(boolean var1) {
      Registry.lookupField(315385164375078477L).setBoolean(this, var1);
   }

   public ConnectionProperty Z() {
      Object var1 = 368229368988830859L;
      return (ConnectionProperty)Ref.g(368229368988830859L, var1);
   }

   public void A(ConnectionProperty var1) {
      long var3 = 368229368988830859L;
      Ref.s(368229368988830859L, var1, var3);
   }

   public String H() {
      Object var1 = 275346031968216783L;
      return (String)Ref.g(275346031968216783L, var1);
   }

   public void H(String var1) {
      long var3 = 275346031968216783L;
      Ref.s(275346031968216783L, var1, var3);
   }

   public void V() {
      long var2 = 368229368988830859L;
      Object var1 = null;
      Ref.s(368229368988830859L, var1, var2);
      long var4 = 145216498281899024L;
      Object var3 = null;
      Ref.s(145216498281899024L, var3, var4);
      long var6 = 316833191843640334L;
      Object var5 = null;
      Ref.s(316833191843640334L, var5, var6);
      long var8 = 503693676675457665L;
      Object var7 = null;
      Ref.s(503693676675457665L, var7, var8);
      long var10 = 529307091863304391L;
      Object var9 = null;
      Ref.s(529307091863304391L, var9, var10);
      long var12 = 582293815758012519L;
      Object var11 = null;
      Ref.s(582293815758012519L, var11, var12);
      long var14 = 600430778061829820L;
      Object var13 = null;
      Ref.s(600430778061829820L, var13, var14);
      long var16 = 207695726482463276L;
      Object var15 = null;
      Ref.s(207695726482463276L, var15, var16);
      long var18 = 317002556145653527L;
      Object var17 = null;
      Ref.s(317002556145653527L, var17, var18);
      long var20 = 165652197740112410L;
      Object var19 = null;
      Ref.s(165652197740112410L, var19, var20);
      long var22 = 497053271897858177L;
      Object var21 = null;
      Ref.s(497053271897858177L, var21, var22);
      long var24 = 275346031968216783L;
      Object var23 = null;
      Ref.s(275346031968216783L, var23, var24);
   }

   public void U() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Tt2(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static void R(boolean var0) {
      m = var0;
   }

   public static boolean q() {
      return m;
   }

   public static boolean p$boolean() {
      boolean var0 = q();
      return !var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -6067) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 49;
               break;
            case 1:
               var10000 = 174;
               break;
            case 2:
               var10000 = 218;
               break;
            case 3:
               var10000 = 183;
               break;
            case 4:
               var10000 = 254;
               break;
            case 5:
               var10000 = 120;
               break;
            case 6:
               var10000 = 215;
               break;
            case 7:
               var10000 = 175;
               break;
            case 8:
               var10000 = 113;
               break;
            case 9:
               var10000 = 24;
               break;
            case 10:
               var10000 = 132;
               break;
            case 11:
               var10000 = 109;
               break;
            case 12:
               var10000 = 143;
               break;
            case 13:
               var10000 = 121;
               break;
            case 14:
               var10000 = 117;
               break;
            case 15:
               var10000 = 188;
               break;
            case 16:
               var10000 = 94;
               break;
            case 17:
               var10000 = 148;
               break;
            case 18:
               var10000 = 28;
               break;
            case 19:
               var10000 = 26;
               break;
            case 20:
               var10000 = 107;
               break;
            case 21:
               var10000 = 74;
               break;
            case 22:
               var10000 = 189;
               break;
            case 23:
               var10000 = 61;
               break;
            case 24:
               var10000 = 25;
               break;
            case 25:
               var10000 = 149;
               break;
            case 26:
               var10000 = 164;
               break;
            case 27:
               var10000 = 240;
               break;
            case 28:
               var10000 = 211;
               break;
            case 29:
               var10000 = 170;
               break;
            case 30:
               var10000 = 34;
               break;
            case 31:
               var10000 = 70;
               break;
            case 32:
               var10000 = 212;
               break;
            case 33:
               var10000 = 29;
               break;
            case 34:
               var10000 = 55;
               break;
            case 35:
               var10000 = 223;
               break;
            case 36:
               var10000 = 159;
               break;
            case 37:
               var10000 = 242;
               break;
            case 38:
               var10000 = 75;
               break;
            case 39:
               var10000 = 241;
               break;
            case 40:
               var10000 = 244;
               break;
            case 41:
               var10000 = 35;
               break;
            case 42:
               var10000 = 206;
               break;
            case 43:
               var10000 = 253;
               break;
            case 44:
               var10000 = 66;
               break;
            case 45:
               var10000 = 93;
               break;
            case 46:
               var10000 = 110;
               break;
            case 47:
               var10000 = 156;
               break;
            case 48:
               var10000 = 154;
               break;
            case 49:
               var10000 = 252;
               break;
            case 50:
               var10000 = 53;
               break;
            case 51:
               var10000 = 97;
               break;
            case 52:
               var10000 = 185;
               break;
            case 53:
               var10000 = 118;
               break;
            case 54:
               var10000 = 80;
               break;
            case 55:
               var10000 = 105;
               break;
            case 56:
               var10000 = 123;
               break;
            case 57:
               var10000 = 91;
               break;
            case 58:
               var10000 = 77;
               break;
            case 59:
               var10000 = 232;
               break;
            case 60:
               var10000 = 203;
               break;
            case 61:
               var10000 = 220;
               break;
            case 62:
               var10000 = 27;
               break;
            case 63:
               var10000 = 193;
               break;
            case 64:
               var10000 = 146;
               break;
            case 65:
               var10000 = 129;
               break;
            case 66:
               var10000 = 79;
               break;
            case 67:
               var10000 = 139;
               break;
            case 68:
               var10000 = 82;
               break;
            case 69:
               var10000 = 84;
               break;
            case 70:
               var10000 = 64;
               break;
            case 71:
               var10000 = 50;
               break;
            case 72:
               var10000 = 89;
               break;
            case 73:
               var10000 = 192;
               break;
            case 74:
               var10000 = 65;
               break;
            case 75:
               var10000 = 198;
               break;
            case 76:
               var10000 = 7;
               break;
            case 77:
               var10000 = 48;
               break;
            case 78:
               var10000 = 1;
               break;
            case 79:
               var10000 = 210;
               break;
            case 80:
               var10000 = 228;
               break;
            case 81:
               var10000 = 11;
               break;
            case 82:
               var10000 = 68;
               break;
            case 83:
               var10000 = 15;
               break;
            case 84:
               var10000 = 142;
               break;
            case 85:
               var10000 = 81;
               break;
            case 86:
               var10000 = 38;
               break;
            case 87:
               var10000 = 237;
               break;
            case 88:
               var10000 = 160;
               break;
            case 89:
               var10000 = 90;
               break;
            case 90:
               var10000 = 52;
               break;
            case 91:
               var10000 = 209;
               break;
            case 92:
               var10000 = 101;
               break;
            case 93:
               var10000 = 96;
               break;
            case 94:
               var10000 = 208;
               break;
            case 95:
               var10000 = 180;
               break;
            case 96:
               var10000 = 46;
               break;
            case 97:
               var10000 = 155;
               break;
            case 98:
               var10000 = 41;
               break;
            case 99:
               var10000 = 172;
               break;
            case 100:
               var10000 = 100;
               break;
            case 101:
               var10000 = 138;
               break;
            case 102:
               var10000 = 202;
               break;
            case 103:
               var10000 = 214;
               break;
            case 104:
               var10000 = 62;
               break;
            case 105:
               var10000 = 199;
               break;
            case 106:
               var10000 = 165;
               break;
            case 107:
               var10000 = 22;
               break;
            case 108:
               var10000 = 166;
               break;
            case 109:
               var10000 = 45;
               break;
            case 110:
               var10000 = 141;
               break;
            case 111:
               var10000 = 136;
               break;
            case 112:
               var10000 = 147;
               break;
            case 113:
               var10000 = 179;
               break;
            case 114:
               var10000 = 153;
               break;
            case 115:
               var10000 = 125;
               break;
            case 116:
               var10000 = 248;
               break;
            case 117:
               var10000 = 224;
               break;
            case 118:
               var10000 = 69;
               break;
            case 119:
               var10000 = 63;
               break;
            case 120:
               var10000 = 9;
               break;
            case 121:
               var10000 = 116;
               break;
            case 122:
               var10000 = 197;
               break;
            case 123:
               var10000 = 161;
               break;
            case 124:
               var10000 = 158;
               break;
            case 125:
               var10000 = 137;
               break;
            case 126:
               var10000 = 54;
               break;
            case 127:
               var10000 = 92;
               break;
            case 128:
               var10000 = 4;
               break;
            case 129:
               var10000 = 239;
               break;
            case 130:
               var10000 = 173;
               break;
            case 131:
               var10000 = 250;
               break;
            case 132:
               var10000 = 176;
               break;
            case 133:
               var10000 = 59;
               break;
            case 134:
               var10000 = 10;
               break;
            case 135:
               var10000 = 114;
               break;
            case 136:
               var10000 = 204;
               break;
            case 137:
               var10000 = 78;
               break;
            case 138:
               var10000 = 195;
               break;
            case 139:
               var10000 = 17;
               break;
            case 140:
               var10000 = 19;
               break;
            case 141:
               var10000 = 221;
               break;
            case 142:
               var10000 = 243;
               break;
            case 143:
               var10000 = 168;
               break;
            case 144:
               var10000 = 169;
               break;
            case 145:
               var10000 = 13;
               break;
            case 146:
               var10000 = 191;
               break;
            case 147:
               var10000 = 128;
               break;
            case 148:
               var10000 = 225;
               break;
            case 149:
               var10000 = 83;
               break;
            case 150:
               var10000 = 98;
               break;
            case 151:
               var10000 = 122;
               break;
            case 152:
               var10000 = 236;
               break;
            case 153:
               var10000 = 130;
               break;
            case 154:
               var10000 = 190;
               break;
            case 155:
               var10000 = 8;
               break;
            case 156:
               var10000 = 150;
               break;
            case 157:
               var10000 = 231;
               break;
            case 158:
               var10000 = 163;
               break;
            case 159:
               var10000 = 99;
               break;
            case 160:
               var10000 = 95;
               break;
            case 161:
               var10000 = 140;
               break;
            case 162:
               var10000 = 255;
               break;
            case 163:
               var10000 = 6;
               break;
            case 164:
               var10000 = 186;
               break;
            case 165:
               var10000 = 213;
               break;
            case 166:
               var10000 = 47;
               break;
            case 167:
               var10000 = 73;
               break;
            case 168:
               var10000 = 33;
               break;
            case 169:
               var10000 = 207;
               break;
            case 170:
               var10000 = 43;
               break;
            case 171:
               var10000 = 16;
               break;
            case 172:
               var10000 = 178;
               break;
            case 173:
               var10000 = 44;
               break;
            case 174:
               var10000 = 184;
               break;
            case 175:
               var10000 = 187;
               break;
            case 176:
               var10000 = 18;
               break;
            case 177:
               var10000 = 76;
               break;
            case 178:
               var10000 = 87;
               break;
            case 179:
               var10000 = 20;
               break;
            case 180:
               var10000 = 56;
               break;
            case 181:
               var10000 = 21;
               break;
            case 182:
               var10000 = 57;
               break;
            case 183:
               var10000 = 40;
               break;
            case 184:
               var10000 = 233;
               break;
            case 185:
               var10000 = 151;
               break;
            case 186:
               var10000 = 226;
               break;
            case 187:
               var10000 = 219;
               break;
            case 188:
               var10000 = 42;
               break;
            case 189:
               var10000 = 157;
               break;
            case 190:
               var10000 = 127;
               break;
            case 191:
               var10000 = 111;
               break;
            case 192:
               var10000 = 246;
               break;
            case 193:
               var10000 = 2;
               break;
            case 194:
               var10000 = 88;
               break;
            case 195:
               var10000 = 31;
               break;
            case 196:
               var10000 = 238;
               break;
            case 197:
               var10000 = 39;
               break;
            case 198:
               var10000 = 23;
               break;
            case 199:
               var10000 = 134;
               break;
            case 200:
               var10000 = 205;
               break;
            case 201:
               var10000 = 12;
               break;
            case 202:
               var10000 = 230;
               break;
            case 203:
               var10000 = 103;
               break;
            case 204:
               var10000 = 249;
               break;
            case 205:
               var10000 = 30;
               break;
            case 206:
               var10000 = 37;
               break;
            case 207:
               var10000 = 36;
               break;
            case 208:
               var10000 = 102;
               break;
            case 209:
               var10000 = 251;
               break;
            case 210:
               var10000 = 131;
               break;
            case 211:
               var10000 = 200;
               break;
            case 212:
               var10000 = 234;
               break;
            case 213:
               var10000 = 0;
               break;
            case 214:
               var10000 = 58;
               break;
            case 215:
               var10000 = 216;
               break;
            case 216:
               var10000 = 181;
               break;
            case 217:
               var10000 = 194;
               break;
            case 218:
               var10000 = 245;
               break;
            case 219:
               var10000 = 217;
               break;
            case 220:
               var10000 = 85;
               break;
            case 221:
               var10000 = 67;
               break;
            case 222:
               var10000 = 126;
               break;
            case 223:
               var10000 = 162;
               break;
            case 224:
               var10000 = 182;
               break;
            case 225:
               var10000 = 177;
               break;
            case 226:
               var10000 = 3;
               break;
            case 227:
               var10000 = 86;
               break;
            case 228:
               var10000 = 104;
               break;
            case 229:
               var10000 = 196;
               break;
            case 230:
               var10000 = 112;
               break;
            case 231:
               var10000 = 5;
               break;
            case 232:
               var10000 = 135;
               break;
            case 233:
               var10000 = 171;
               break;
            case 234:
               var10000 = 144;
               break;
            case 235:
               var10000 = 201;
               break;
            case 236:
               var10000 = 115;
               break;
            case 237:
               var10000 = 51;
               break;
            case 238:
               var10000 = 229;
               break;
            case 239:
               var10000 = 235;
               break;
            case 240:
               var10000 = 124;
               break;
            case 241:
               var10000 = 119;
               break;
            case 242:
               var10000 = 152;
               break;
            case 243:
               var10000 = 108;
               break;
            case 244:
               var10000 = 106;
               break;
            case 245:
               var10000 = 145;
               break;
            case 246:
               var10000 = 14;
               break;
            case 247:
               var10000 = 32;
               break;
            case 248:
               var10000 = 72;
               break;
            case 249:
               var10000 = 227;
               break;
            case 250:
               var10000 = 71;
               break;
            case 251:
               var10000 = 222;
               break;
            case 252:
               var10000 = 133;
               break;
            case 253:
               var10000 = 247;
               break;
            case 254:
               var10000 = 60;
               break;
            default:
               var10000 = 167;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "\u0010\u0094\u008fñ\u0087}°éÀ\u001c^¹^\u008c¿´Â\u0005°qNÕ\t\u009b©açÃ\u0011²\u0089á\u008c^1²'Þû\u000fË\u001c>\u0016XáÄIF_\u009f\u001bnp\u0091\u0002旮乨\u0005\u008f)\u0081Û\u00ad\u0005\u0005YÐÕ\u0087";
      int var4 = "\u0010\u0094\u008fñ\u0087}°éÀ\u001c^¹^\u008c¿´Â\u0005°qNÕ\t\u009b©açÃ\u0011²\u0089á\u008c^1²'Þû\u000fË\u001c>\u0016XáÄIF_\u009f\u001bnp\u0091\u0002旮乨\u0005\u008f)\u0081Û\u00ad\u0005\u0005YÐÕ\u0087"
         .length();
      char var1 = '\'';
      int var8 = -1;
      R(true);

      label52:
      while (true) {
         byte var10000 = 42;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
      Object[] var20;
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 16;
                        break;
                     case 1:
                        var46 = 18;
                        break;
                     case 2:
                        var46 = 29;
                        break;
                     case 3:
                        var46 = 126;
                        break;
                     case 4:
                        var46 = 58;
                        break;
                     case 5:
                        var46 = 57;
                        break;
                     default:
                        var46 = 61;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     c = new String[7];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Ï3f\u0017¨³M),`ÂîßÝüTûÍ\u0081lûË\u00197\u009dGøú\u0018°gQ\u0004¦Ê¹\u0097S©ße\u0018\u00ad1bws\u0081\"\u00819s½rp\u0002吧仫";
                  var4 = "Ï3f\u0017¨³M),`ÂîßÝüTûÍ\u0081lûË\u00197\u009dGøú\u0018°gQ\u0004¦Ê¹\u0097S©ße\u0018\u00ad1bws\u0081\"\u00819s½rp\u0002吧仫".length();
                  var1 = '7';
                  var8 = -1;
            }

            var10000 = 58;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





