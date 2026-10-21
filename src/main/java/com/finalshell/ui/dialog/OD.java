package com.finalshell.ui.dialog;

import com.finalshell.ui.frame.MainFrame;
import java.awt.Frame;
import javax.swing.JDialog;

public class OD extends JDialog {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public static void F(String[] var0) {
      new OD(null);
   }

   public OD(MainFrame var1) {
      super((Frame)var1);
      this.setTitle(a);
      this.setSize(a(23550, 6466152228272100294L), a(1126, 8136239753717779551L));
      this.setLocationRelativeTo(var1);
      this.setVisible(true);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2105;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "子众诎罥".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 116;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 116;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 115;
               break;
            case 1:
               var37 = 48;
               break;
            case 2:
               var37 = 4;
               break;
            case 3:
               var37 = 127;
               break;
            case 4:
               var37 = 20;
               break;
            case 5:
               var37 = 119;
               break;
            default:
               var37 = 41;
         }
      } else {
         var25 = 116;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 6065270888039156283L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "´Gõö\u000bÕ\u0007\u0090\u009ax[å\u0089ÕÛA";
            int var13 = "´Gõö\u000bÕ\u0007\u0090\u009ax[å\u0089ÕÛA".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 116;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 115;
               break;
            case 1:
               var37 = 48;
               break;
            case 2:
               var37 = 4;
               break;
            case 3:
               var37 = 127;
               break;
            case 4:
               var37 = 20;
               break;
            case 5:
               var37 = 119;
               break;
            default:
               var37 = 41;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 115;
                  break;
               case 1:
                  var37 = 48;
                  break;
               case 2:
                  var37 = 4;
                  break;
               case 3:
                  var37 = 127;
                  break;
               case 4:
                  var37 = 20;
                  break;
               case 5:
                  var37 = 119;
                  break;
               default:
                  var37 = 41;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 6065270888039156283L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "´Gõö\u000bÕ\u0007\u0090\u009ax[å\u0089ÕÛA";
               int var5 = "´Gõö\u000bÕ\u0007\u0090\u009ax[å\u0089ÕÛA".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
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
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 115;
                  break;
               case 1:
                  var37 = 48;
                  break;
               case 2:
                  var37 = 4;
                  break;
               case 3:
                  var37 = 127;
                  break;
               case 4:
                  var37 = 20;
                  break;
               case 5:
                  var37 = 119;
                  break;
               default:
                  var37 = 41;
            }
         }
      }
   }
}





