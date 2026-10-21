package com.finalshell.ui.dialog;

import com.finalshell.core.Dv2;
import com.finalshell.core.Dx4_2;
import com.finalshell.core.L1;
import com.finalshell.core.Lj4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import com.finalshell.ui.panel.EditPanel;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;

public class Fw2 extends ClearListDialog {
   EditPanel eL;
   String ed;
   Lj4_2 eJ;
   public static long[] cb;
   public static Integer[] db;

   public Fw2(String var1, EditPanel var2, Dv2 var3) {
      super(var3, true);
      Object[] var10001 = Registry.packArgs(b(29988, 1516009930303765884L), b(19668, 4005540325463934093L));
      long var5 = 620992058944098515L;
      Object[] var4 = var10001;
      Ref.h(620992058944098515L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      long var7 = 187140034186517946L;
      Ref.s(187140034186517946L, var1, var7);
      long var9 = 426573730261755490L;
      Ref.s(426573730261755490L, var2, var9);
      Object[] var10004 = Registry.packArgs(false);
      long var11 = 482653304504628027L;
      Object[] var10 = var10004;
      Ref.h(482653304504628027L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      Object[] var10005 = Registry.packArgs(false);
      long var13 = 481279655071834828L;
      Object[] var12 = var10005;
      Ref.h(481279655071834828L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      Object[] var10006 = Registry.packArgs(false);
      long var15 = 464995000560394494L;
      Object[] var14 = var10006;
      Ref.h(464995000560394494L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Object[] var10007 = Registry.packArgs(false);
      long var17 = 539780336826110266L;
      Object[] var16 = var10007;
      Ref.h(539780336826110266L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Object[] var10008 = Registry.packArgs(true);
      long var19 = 338129737384235253L;
      Object[] var18 = var10008;
      Ref.h(338129737384235253L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }
   }

   public Lj4_2 a() {
      Object var1 = 289445681920008656L;
      return (Lj4_2)Ref.g(289445681920008656L, var1);
   }

   public void t(Lj4_2 var1) {
      long var3 = 289445681920008656L;
      Ref.s(289445681920008656L, var1, var3);
   }

   public String T() {
      Object var1 = 187140034186517946L;
      return (String)Ref.g(187140034186517946L, var1);
   }

   public void Z(String var1) {
      long var3 = 187140034186517946L;
      Ref.s(187140034186517946L, var1, var3);
   }

   @Override
   public boolean p(L1 var1) {
      return true;
   }

   @Override
   protected Dx4_2 k$dx_4() {
      int[] var10000 = AppendCarriageReturnCRPanel.Y();
      Object var2 = null;
      int[] var1 = var10000;
      Object var3 = 289445681920008656L;
      Lj4_2 var10001 = (Lj4_2)Ref.g(289445681920008656L, var3);
      if (var1 == null) {
         if (var10001 == null) {
            return new Dx4_2();
         }

         Object var5 = 289445681920008656L;
         Lj4_2 var10002 = (Lj4_2)Ref.g(289445681920008656L, var5);
      }

      Object var7 = 187140034186517946L;
      Dx4_2 var10003 = Registry.packArgs(Ref.g(187140034186517946L, var7));
      long var10 = 242040625560871861L;
      Object[] var9 = var10003;
      var10003 = Ref.h(242040625560871861L, var9, var10);

      try {
         var10003 = (Dx4_2)var10003;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      return var10003;
   }

   @Override
   protected void L(String var1) {
      Registry.packArgs(var1);
      long var3 = 330094358428833085L;
      Object var10001 = Ref.h2(330094358428833085L, var3);

      try {
         var11 = (Boolean)var10001;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      if (!var11) {
         L1 var2 = new L1("", var1);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 247369048764074052L;
         Object[] var5 = var10002;
         Ref.h(247369048764074052L, var5, var6);
         Object[] var10003 = Registry.packArgs(var2);
         long var8 = 331594575686452212L;
         Object[] var7 = var10003;
         Ref.h(331594575686452212L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }
      }
   }

   @Override
   protected void i(L1 var1, int var2) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 247369048764074052L;
      Object[] var3 = var10001;
      Ref.h(247369048764074052L, var3, var4);
      Object[] var10002 = Registry.packArgs(var1);
      long var6 = 190233821466993016L;
      Object[] var5 = var10002;
      Ref.h(190233821466993016L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var10 = 578864097947885485L;
      Object[] var9 = var10004;
      Ref.h(578864097947885485L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Registry.emptyArgs();
      long var11 = 270389152141252877L;
      Ref.h2(270389152141252877L, var11);
      Object[] var10006 = Registry.emptyArgs();
      long var14 = 612604310671515822L;
      Object[] var13 = var10006;
      Ref.h(612604310671515822L, var13, var14);
      Object[] var10007 = Registry.emptyArgs();
      long var16 = 200561288808923907L;
      Object[] var15 = var10007;
      Ref.h(200561288808923907L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }
   }

   @Override
   protected void k(L1 var1) {
      Object[] var10001 = Registry.packArgs(false);
      long var3 = 499180481011525071L;
      Object[] var2 = var10001;
      Ref.h(499180481011525071L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Object var4 = 334241381080505095L;
      Dv2 var10002 = (Dv2)Ref.g(334241381080505095L, var4);
      String var10004 = (String)(Registry.emptyArgs());
      long var7 = 542058094445767607L;
      Object[] var6 = var10004;
      var10004 = Ref.h(542058094445767607L, var6, var7);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var1.setText(var10004);
      Object var8 = 334241381080505095L;
      ((Dv2)Ref.g(334241381080505095L, var8)).requestFocus();
   }

   @Override
   protected void u(KeyEvent var1) {
   }

   @Override
   protected String c() {
      Object var1 = 265132846717086219L;
      return ((Dv2)Ref.g(265132846717086219L, var1)).getText().trim();
   }

   @Override
   public void Q(L1 var1, int var2) {
      Object[] var10001 = Registry.packArgs(var1);
      long var4 = 565532503448267938L;
      Object[] var3 = var10001;
      Ref.h(565532503448267938L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Object var5 = 426573730261755490L;
      Ref.g(426573730261755490L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 469112436702288424L;
      Object[] var7 = var10003;
      Ref.h(469112436702288424L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   @Override
   protected Dx4_2 n() {
      return null;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2137;
      if (db[var3] == null) {
         db[var3] = (int)(cb[var3] ^ var1);
      }

      return db[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7541713775315075023L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = ";©$\n§\u0094úÒ<zXLTëC½";
      int var5 = ";©$\n§\u0094úÒ<zXLTëC½".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      cb = var6;
      db = new Integer[2];
   }
}





