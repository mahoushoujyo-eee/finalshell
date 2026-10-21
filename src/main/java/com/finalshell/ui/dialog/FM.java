package com.finalshell.ui.dialog;

import com.finalshell.core.Dv2;
import com.finalshell.core.Dx4_2;
import com.finalshell.core.L1;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.W5;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

public class FM extends ClearListDialog {
   public SetBackgroundImagePanel vS;
   public static long[] cb;
   public static Integer[] db;

   public FM(SetBackgroundImagePanel var1, Dv2 var2) {
      super(var2, true, true);
      Object var3 = 376708942717725433L;
      Object[] var10002 = Registry.packArgs(Ref.g(376708942717725433L, var3));
      long var6 = 528904680453974557L;
      Object[] var5 = var10002;
      Ref.h(528904680453974557L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      Object var7 = 282658375549611139L;
      Object[] var10004 = Registry.packArgs(Ref.g(282658375549611139L, var7));
      long var10 = 528904680453974557L;
      Object[] var9 = var10004;
      Ref.h(528904680453974557L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      Object[] var10005 = Registry.packArgs(b(26880, 7494843451023589009L), b(31436, 2849624512543354207L));
      long var12 = 620992058944098515L;
      Object[] var11 = var10005;
      Ref.h(620992058944098515L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      long var14 = 282940094729004615L;
      Ref.s(282940094729004615L, var1, var14);
      Object[] var10007 = Registry.packArgs(false);
      long var16 = 482653304504628027L;
      Object[] var15 = var10007;
      Ref.h(482653304504628027L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      Object[] var10008 = Registry.emptyArgs();
      long var18 = 220872586276736931L;
      Object[] var17 = var10008;
      Ref.h(220872586276736931L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      Object var19 = 334241381080505095L;
      ((Dv2)Ref.g(334241381080505095L, var19)).setForeground(Color.white);
      Object var21 = 334241381080505095L;
      ((Dv2)Ref.g(334241381080505095L, var21)).j().n(false);
      Object var23 = 334241381080505095L;
      ((Dv2)Ref.g(334241381080505095L, var23)).j().w(new Color(b(29438, 5474337388064400750L), b(11121, 1276871118257044707L), b(11121, 1276871118257044707L)));
   }

   @Override
   public void D() {
      super.D();
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 583819321118849819L;
      Object[] var1 = var10001;
      Ref.h(583819321118849819L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void c(JButton var1) {
   }

   @Override
   public void i(L1 var1, int var2) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 183335068648082367L;
      Object[] var3 = var10001;
      Ref.h(183335068648082367L, var3, var4);
      Object[] var10002 = Registry.packArgs(var1);
      long var6 = 190233821466993016L;
      Object[] var5 = var10002;
      Ref.h(190233821466993016L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
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
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   @Override
   public void L(String var1) {
   }

   @Override
   public void k(L1 var1) {
      Object var2 = 334241381080505095L;
      Dv2 var10001 = (Dv2)Ref.g(334241381080505095L, var2);
      String var10003 = (String)(Registry.emptyArgs());
      long var5 = 542058094445767607L;
      Object[] var4 = var10003;
      var10003 = Ref.h(542058094445767607L, var4, var5);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var1.setText(var10003);
      Object var6 = 334241381080505095L;
      ((Dv2)Ref.g(334241381080505095L, var6)).requestFocus();
   }

   @Override
   public Dx4_2 n() {
      return new Dx4_2();
   }

   @Override
   public Dx4_2 k$dx_4() {
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 306266403902896148L;
      Object[] var4 = var10002;
      Ref.h(306266403902896148L, var4, var5);
      Dx4_2 var10003 = Registry.emptyArgs();
      long var7 = 568950058787001160L;
      Object[] var6 = var10003;
      var10003 = Ref.h(568950058787001160L, var6, var7);

      try {
         var10003 = (Dx4_2)var10003;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      return var10003;
   }

   public void S(L1 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 183335068648082367L;
      Object[] var3 = var10001;
      Ref.h(183335068648082367L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Object[] var10002 = Registry.packArgs(var1);
      long var6 = 331594575686452212L;
      Object[] var5 = var10002;
      Ref.h(331594575686452212L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
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
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      Object var11 = 282940094729004615L;
      SetBackgroundImagePanel var10005 = (SetBackgroundImagePanel)Ref.g(282940094729004615L, var11);
      String var10007 = (String)(Registry.emptyArgs());
      long var14 = 542058094445767607L;
      Object[] var13 = var10007;
      var10007 = Ref.h(542058094445767607L, var13, var14);

      try {
         var10007 = (String)var10007;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      var1.x(var10007, true);
      Object var15 = 334241381080505095L;
      ((Dv2)Ref.g(334241381080505095L, var15)).setText("");
      Object var17 = 282940094729004615L;
      ((SetBackgroundImagePanel)Ref.g(282940094729004615L, var17)).requestFocus();
   }

   @Override
   public boolean p(L1 var1) {
      return true;
   }

   @Override
   public void u(KeyEvent var1) {
   }

   @Override
   public String c() {
      Object var1 = 265132846717086219L;
      return ((Dv2)Ref.g(265132846717086219L, var1)).getText().trim();
   }

   @Override
   public void Q(L1 var1, int var2) {
      Object[] var10001 = Registry.packArgs(var1);
      long var4 = 395039908230437316L;
      Object[] var3 = var10001;
      Ref.h(395039908230437316L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Override
   public void h() {
      long var2 = 282940094729004615L;
      Object var1 = null;
      Ref.s(282940094729004615L, var1, var2);
   }

   @Override
   public void K$void() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new W5(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6033;
      if (db[var3] == null) {
         db[var3] = (int)(cb[var3] ^ var1);
      }

      return db[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7709073078507528579L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "á¸i´\u001e\u009b\u009eL;ÃÈÍsÀ\u0004%";
      int var5 = "á¸i´\u001e\u009b\u009eL;ÃÈÍsÀ\u0004%".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     cb = var6;
                     db = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "®P^yº\u0093\u008dL¸t\u0088P\u0084]]¨";
                  var5 = "®P^yº\u0093\u008dL¸t\u0088P\u0084]]¨".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





