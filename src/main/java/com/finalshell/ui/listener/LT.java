package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class LT implements ActionListener {
   public final com.finalshell.ui.frame.U a;
   public static long[] b;
   public static Long[] c;

   public LT(com.finalshell.ui.frame.U var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.ui.panel.F8.y();
      long var10001 = System.currentTimeMillis();
      Object var10002 = Registry.lookupField(199832172921665052L).get(null);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 311260639782144664L;
      Object[] var6 = var10003;
      var10003 = Ref.h(311260639782144664L, var6, var7);

      try {
         var41 = (Long)var10003;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      label94: {
         long var3 = var10002 - var41;
         long var2 = var10001;
         int var35 = (((com.finalshell.ui.dialog.KQ)Registry.lookupField(199832172921665052L).get(null)).isVisible()) ? 1 : 0;
         if (var2 == 0) {
            if (var35 != 0) {
               Registry.lookupField(199832172921665052L).get(null);
               var10002 = Registry.emptyArgs();
               long var9 = 419565703796979209L;
               Object[] var8 = (Object[])var10002;
               var10002 = Ref.h(419565703796979209L, var8, var9);

               try {
                  var10002 = (Boolean)var10002;
               } catch (InvocationTargetException var33) {
                  throw var33.getTargetException();
               }

               Object var5 = var10002;
               long var46;
               var10002 = (var46 = var3 - a(27195, 8548535950817463058L)) == 0L ? 0 : (var46 < 0L ? -1 : 1);
               if (var2 == 0) {
                  if (var10002 > 0) {
                     var5 = true;
                  }

                  var10002 = Registry.lookupField(199832172921665052L).get(null);
                  var10003 = Registry.emptyArgs();
                  long var11 = 249886410317960768L;
                  Object[] var10 = var10003;
                  Ref.h(249886410317960768L, var10, var11);

                  try {
                     ;
                  } catch (InvocationTargetException var32) {
                     throw var32.getTargetException();
                  }

                  Object var12 = 181600139630751244L;
                  this.equals((com.finalshell.ui.frame.U)Ref.g(181600139630751244L, var12));
               }

               if (var2 == 0) {
                  if (var10002 == null) {
                     var5 = true;
                  }

                  var10002 = var5;
               }

               label100: {
                  if (var10002 == null) {
                     Object var14 = 181600139630751244L;
                     Ref.g(181600139630751244L, var14);
                     Object[] var10004 = Registry.emptyArgs();
                     long var17 = 385826789103549433L;
                     Object[] var16 = var10004;
                     Ref.h(385826789103549433L, var16, var17);

                     try {
                        ;
                     } catch (InvocationTargetException var31) {
                        throw var31.getTargetException();
                     }

                     if (var2 == 0) {
                        break label100;
                     }
                  }

                  Registry.lookupField(199832172921665052L).get(null);
                  var10003 = Registry.packArgs(false);
                  long var19 = 634601920284847200L;
                  Object[] var18 = var10003;
                  Ref.h(634601920284847200L, var18, var19);

                  try {
                     ;
                  } catch (InvocationTargetException var30) {
                     throw var30.getTargetException();
                  }
               }

               if (var2 == 0) {
                  break label94;
               }
            }

            long var47;
            var35 = (var47 = var3 - a(13008, 746215865339991032L)) == 0L ? 0 : (var47 < 0L ? -1 : 1);
         }

         if (var35 > 0) {
            Object var20 = 181600139630751244L;
            Ref.g(181600139630751244L, var20);
            var10003 = Registry.emptyArgs();
            long var23 = 385826789103549433L;
            Object[] var22 = var10003;
            Ref.h(385826789103549433L, var22, var23);

            try {
               ;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }
         }
      }

      Registry.lookupField(199832172921665052L).get(null);
      Object var24 = 181600139630751244L;
      var10003 = Registry.packArgs(Ref.g(181600139630751244L, var24));
      long var27 = 324105784334970743L;
      Object[] var26 = var10003;
      Ref.h(324105784334970743L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 24872) & 32767;
      if (c[var3] == null) {
         c[var3] = b[var3] ^ var1;
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8360661401461151461L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "~\\\u001e_B0\u0085ç\u0002¥\u0089\u0018ÃHÜÛ";
      int var5 = "~\\\u001e_B0\u0085ç\u0002¥\u0089\u0018ÃHÜÛ".length();
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

      b = var6;
      c = new Long[2];
   }
}





