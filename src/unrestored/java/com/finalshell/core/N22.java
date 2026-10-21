package com.finalshell.core;
import com.finalshell.reflect.Ref;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class N22 {
   public static boolean M;
   public static String a;
   public static long[] b;
   public static Integer[] c;
   public static long d;

   public static String[] j(Component var0, String var1, String var2, String var3, String[] var4, boolean[] var5) {
      GridBagConstraints var7 = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, a(23871, 4926583747465766740L), 0, new Insets(0, 0, 0, 0), 0, 0);
      JPanel var8 = new JPanel();
      var8.setLayout(new GridBagLayout());
      var7.weightx = 1.0;
      String[] var10000 = Cj4.v$arrString();
      var7.gridwidth = 0;
      var7.gridx = 0;
      var8.add(new JLabel(var3), var7);
      var7.gridy++;
      String[] var6 = var10000;
      var7.gridwidth = -1;
      JTextField[] var9 = new JTextField[var4.length];
      int var10 = 0;

      while (true) {
         if (var10 < var4.length) {
            var7.fill = 0;
            var7.gridx = 0;
            var7.weightx = 1.0;
            var8.add(new JLabel(var4[var10]), var7);
            var7.gridx = 1;
            var7.fill = 2;
            var7.weighty = 1.0;
            if (var6 != null) {
               break;
            }

            label57: {
               label67: {
                  if (var6 == null) {
                     if (!var5[var10]) {
                        break label67;
                     }

                     var9[var10] = new JTextField(a(21109, 4954518799755470877L));
                  }

                  if (var6 == null) {
                     break label57;
                  }

                  Ky4.K(new String[5]);
               }

               var9[var10] = new JPasswordField(a(17114, 3560628322228402352L));
            }

            var8.add(var9[var10], var7);
            var7.gridy++;
            var10++;
            if (var6 == null) {
               continue;
            }
         }

         ((ScheduledExecutorService)Ref.g(496176629577379819L, null)).schedule(new com.finalshell.task.KT(var9), d, TimeUnit.MILLISECONDS);
         break;
      }

      Object var13 = null;
      Component var11 = SwingUtilities.getRoot(var0);
      int var15 = JOptionPane.showConfirmDialog(var11, var8, var1 + a + var2, 2, 3);
      if (var6 == null) {
         var15 = var15 == 0 ? 1 : 0;
      }

      M = (var15) != 0;
      int var16 = (M) ? 1 : 0;
      if (var6 == null) {
         if (!M) {
            return null;
         }

         var16 = var4.length;
      }

      String[] var14 = new String[var16];
      int var12 = 0;

      while (true) {
         if (var12 < var4.length) {
            var10000 = var14;
            if (var6 != null) {
               break;
            }

            var14[var12] = var9[var12].getText();
            var12++;
            if (var6 == null) {
               continue;
            }
         }

         var10000 = var14;
         break;
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14954;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u000b,".toCharArray();
      int var10004 = var10003.length;
      int var10 = 0;
      byte var32 = 84;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var38;
      byte var44;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var38 = var10003;
         var10005 = var10;
         char var10008 = var10003[var10];
         var10007 = 84;
         var10006 = var10008;
         switch (var10 % 7) {
            case 0:
               var44 = 101;
               break;
            case 1:
               var44 = 88;
               break;
            case 2:
               var44 = 80;
               break;
            case 3:
               var44 = 85;
               break;
            case 4:
               var44 = 3;
               break;
            case 5:
               var44 = 11;
               break;
            default:
               var44 = 65;
         }
      } else {
         var32 = 84;
         var19 = var10004;
         if (var10004 <= var10) {
            String var36 = new String(var10003).intern();
            int var25 = -1;
            a = var36;
            long var12 = 12962125292041866L;
            long[] var17 = new long[3];
            int var14 = 0;
            String var15 = "fRo.ê\u000e\u008e.ZpPÇ\u0016x\u0011Ì\u009f;à\u0010Ýû\u009e\u0083";
            int var16 = "fRo.ê\u000e\u008e.ZpPÇ\u0016x\u0011Ì\u009f;à\u0010Ýû\u009e\u0083".length();
            byte var13 = 0;

            do {
               var25 = var13;
               var13 += 8;
               byte[] var18 = var15.substring(var25, var13).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               var25 = var14++;
               long var42 = (
                     ((long)var18[0] & 255L) << 56
                        | ((long)var18[1] & 255L) << 48
                        | ((long)var18[2] & 255L) << 40
                        | ((long)var18[3] & 255L) << 32
                        | ((long)var18[4] & 255L) << 24
                        | ((long)var18[5] & 255L) << 16
                        | ((long)var18[6] & 255L) << 8
                        | (long)var18[7] & 255L
                  )
                  ^ var12;
               byte var37 = -1;
               var17[var25] = var42;
            } while (var13 < var16);

            b = var17;
            c = new Integer[3];
            long var11 = 4609907156515215858L;
            long var31 = 4609907156515215674L ^ var11;
            byte var28 = -1;
            d = var31;
            return;
         }

         var38 = var10003;
         var10005 = var10;
         char var45 = var10003[var10];
         var10007 = 84;
         var10006 = var45;
         switch (var10 % 7) {
            case 0:
               var44 = 101;
               break;
            case 1:
               var44 = 88;
               break;
            case 2:
               var44 = 80;
               break;
            case 3:
               var44 = 85;
               break;
            case 4:
               var44 = 3;
               break;
            case 5:
               var44 = 11;
               break;
            default:
               var44 = 65;
         }
      }

      while (true) {
         var38[var10005] = (char)(var10006 ^ var10007 ^ var44);
         var10++;
         if (var32 == 0) {
            var38 = var10002;
            var10005 = var32;
            char var47 = var10002[var32];
            var10007 = var32;
            var10006 = var47;
            switch (var10 % 7) {
               case 0:
                  var44 = 101;
                  break;
               case 1:
                  var44 = 88;
                  break;
               case 2:
                  var44 = 80;
                  break;
               case 3:
                  var44 = 85;
                  break;
               case 4:
                  var44 = 3;
                  break;
               case 5:
                  var44 = 11;
                  break;
               default:
                  var44 = 65;
            }
         } else {
            if (var19 <= var10) {
               String var34 = new String(var10002).intern();
               int var21 = -1;
               a = var34;
               long var2 = 12962125292041866L;
               long[] var8 = new long[3];
               int var5 = 0;
               String var6 = "fRo.ê\u000e\u008e.ZpPÇ\u0016x\u0011Ì\u009f;à\u0010Ýû\u009e\u0083";
               int var7 = "fRo.ê\u000e\u008e.ZpPÇ\u0016x\u0011Ì\u009f;à\u0010Ýû\u009e\u0083".length();
               byte var4 = 0;

               do {
                  var21 = var4;
                  var4 += 8;
                  byte[] var9 = var6.substring(var21, var4).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var21 = var5++;
                  long var41 = (
                        ((long)var9[0] & 255L) << 56
                           | ((long)var9[1] & 255L) << 48
                           | ((long)var9[2] & 255L) << 40
                           | ((long)var9[3] & 255L) << 32
                           | ((long)var9[4] & 255L) << 24
                           | ((long)var9[5] & 255L) << 16
                           | ((long)var9[6] & 255L) << 8
                           | (long)var9[7] & 255L
                     )
                     ^ var2;
                  byte var35 = -1;
                  var8[var21] = var41;
               } while (var4 < var7);

               b = var8;
               c = new Integer[3];
               long var0 = 4609907156515215858L;
               long var30 = 4609907156515215674L ^ var0;
               byte var24 = -1;
               d = var30;
               return;
            }

            var38 = var10002;
            var10005 = var10;
            char var46 = var10002[var10];
            var10007 = var32;
            var10006 = var46;
            switch (var10 % 7) {
               case 0:
                  var44 = 101;
                  break;
               case 1:
                  var44 = 88;
                  break;
               case 2:
                  var44 = 80;
                  break;
               case 3:
                  var44 = 85;
                  break;
               case 4:
                  var44 = 3;
                  break;
               case 5:
                  var44 = 11;
                  break;
               default:
                  var44 = 65;
            }
         }
      }
   }
}





