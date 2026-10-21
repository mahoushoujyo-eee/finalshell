package com.finalshell.ui.listener;

import com.finalshell.core.Dv2;
import com.finalshell.core.L1;
import com.finalshell.core.Tq4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

public class B7 implements KeyListener {
   L1 W;
   final boolean R;
   final ClearListDialog r;
   public static long[] a;
   public static Integer[] b;

   B7(ClearListDialog var1, boolean var2) {
      this.r = var1;
      this.R = var2;
      long var4 = 308750888373001143L;
      Object var3 = null;
      Ref.s(308750888373001143L, var3, var4);
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String[] var2 = ClearListDialog.i$arrString();
      Object var6 = 484003208200249497L;
      Ref.g(484003208200249497L, var6);
      Object[] var10002 = Registry.emptyArgs();
      long var9 = 634403491225282499L;
      Object[] var8 = var10002;
      var10002 = Ref.h(634403491225282499L, var8, var9);

      try {
         var44 = (Boolean)var10002;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      if (var2 == null) {
         if (!var44) {
            return;
         }

         Object var10 = 484003208200249497L;
         Ref.g(484003208200249497L, var10);
         Object var12 = 618427502576624312L;
         ((Tq4)Ref.g(618427502576624312L, var12)).getSelectedRow();
      }

      B7 var45 = Registry.lookupField(361141657865972500L).getBoolean(this);
      if (var2 == null) {
         if (var45 != 0) {
            return;
         }

         var45 = var1.getModifiers();
      }

      if (var2 == null) {
         if (var45 != 0) {
            return;
         }

         var45 = var1.getKeyCode();
      }

      if (var2 == null) {
         if (var45 != a(20141, 8189760722115350579L)) {
            return;
         }

         var45 = this;
         Object var14 = 484003208200249497L;
         ((ClearListDialog)Ref.g(484003208200249497L, var14)).isVisible();
      }

      if (var45 == 0) {
      }

      if (!Registry.lookupField(361141657865972500L).getBoolean(this)) {
         label105: {
            System.currentTimeMillis();
            Object var16 = 484003208200249497L;
            long var4 = this - Registry.lookupField(202023651119989609L).getLong(Ref.g(484003208200249497L, var16));
            Object var18 = 484003208200249497L;
            B7 var10004 = Registry.lookupField(552009030867017299L).getInt(Ref.g(484003208200249497L, var18));
            if (var2 == null) {
               if (var10004 != a(22529, 5405553293530154653L)) {
                  return;
               }

               var10004 = this;
               Object var20 = 484003208200249497L;
               Ref.g(484003208200249497L, var20);
               Object[] var10006 = Registry.packArgs(false);
               long var23 = 464995000560394494L;
               Object[] var22 = var10006;
               Ref.h(464995000560394494L, var22, var23);

               try {
                  ;
               } catch (InvocationTargetException var41) {
                  throw var41.getTargetException();
               }

               Object var24 = 484003208200249497L;
               Ref.g(484003208200249497L, var24);
               Object[] var10008 = Registry.emptyArgs();
               long var27 = 306221011327708335L;
               Object[] var26 = var10008;
               Ref.h(306221011327708335L, var26, var27);

               try {
                  ;
               } catch (InvocationTargetException var40) {
                  throw var40.getTargetException();
               }

               Object var28 = 484003208200249497L;
               ClearListDialog var10009 = (ClearListDialog)Ref.g(484003208200249497L, var28);
               if (var2 != null) {
                  break label105;
               }

               var10009.isVisible();
            }

            if (var10004 == 0) {
               Object var30 = 484003208200249497L;
               Ref.g(484003208200249497L, var30);
               Object[] var46 = Registry.emptyArgs();
               long var33 = 612990022110170911L;
               Object[] var32 = var46;
               Ref.h(612990022110170911L, var32, var33);

               try {
                  ;
               } catch (InvocationTargetException var39) {
                  throw var39.getTargetException();
               }

               if (var2 == null) {
                  return;
               }
            }

            Object var34 = 484003208200249497L;
            ClearListDialog var10005 = (ClearListDialog)Ref.g(484003208200249497L, var34);
         }

         Object[] var47 = Registry.emptyArgs();
         long var37 = 496821856781947383L;
         Object[] var36 = var47;
         Ref.h(496821856781947383L, var36, var37);

         try {
            ;
         } catch (InvocationTargetException var38) {
            throw var38.getTargetException();
         }
      }
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      ClearListDialog.i$arrString();
      Object var4 = 484003208200249497L;
      Registry.lookupField(202023651119989609L).setLong(Ref.g(484003208200249497L, var4), System.currentTimeMillis());
      Object var6 = 484003208200249497L;
      Registry.lookupField(552009030867017299L).setInt(Ref.g(484003208200249497L, var6), var1.getKeyCode());
      Object var8 = 484003208200249497L;
      ClearListDialog var10003 = (ClearListDialog)Ref.g(484003208200249497L, var8);
      if (this == null) {
         Registry.lookupField(600941127808801108L).setBoolean(var10003, true);
         if (var1.getKeyCode() != a(28338, 2849901760476180525L)) {
            return;
         }

         Object var10 = 484003208200249497L;
         ClearListDialog var10004 = (ClearListDialog)Ref.g(484003208200249497L, var10);
      }

      Object var12 = 334241381080505095L;
      String var3 = ((Dv2)Ref.g(334241381080505095L, var12)).getText().trim();
      Object var14 = 484003208200249497L;
      Ref.g(484003208200249497L, var14);
      Object[] var10006 = Registry.packArgs(var3);
      long var17 = 170585917374516338L;
      Object[] var16 = var10006;
      Ref.h(170585917374516338L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7838;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4905433317014324509L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = ";\u008aå\u0098× \u0095<îa{æ§ð5:Äx6s9O\u0083\u0092";
      int var5 = ";\u008aå\u0098× \u0095<îa{æ§ð5:Äx6s9O\u0083\u0092".length();
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

      a = var6;
      b = new Integer[3];
   }
}





