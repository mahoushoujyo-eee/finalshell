package com.finalshell.core;

import com.finalshell.ui.model.Pt2;
import java.awt.Component;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class As2 extends AO_2 {
   public static List J;
   public static List O;
   public int t = -1;
   public static long[] a;
   public static Integer[] b;

   @Override
   public void G$void() {
      int var2;
      label14: {
         boolean var1 = UE.Z();
         As2 var10001 = this;
         if (!var1) {
            if (this.A == Pt2.checked) {
               var2 = this.t + 1;
               break label14;
            }

            var10001 = this;
         }

         var2 = var10001.t - 1;
      }

      this.t = var2;
   }

   @Override
   public void F() {
      this.t = this.D == Pt2.checked ? 3 : -1;
   }

   @Override
   public boolean B() {
      boolean var1;
      As2 var3;
      label41: {
         var1 = UE.o();
         Pt2 var10000 = this.A;
         Pt2 var10001 = Pt2.unchecked;
         if (var1) {
            if (this.A == Pt2.unchecked) {
               if (!var1) {
                  return (boolean)this.t;
               }

               if (this.t == -1) {
                  return 1 != 0;
               }
            }

            var3 = this;
            if (!var1) {
               break label41;
            }

            var10000 = this.A;
            var10001 = Pt2.checked;
         }

         if (var10000 != var10001) {
            return 0 != 0;
         }

         var3 = this;
      }

      if (!var1) {
         return (boolean)var3.t;
      } else {
         return (boolean)((var3.t == 3 ? 1 : 0) != 0);
      }
   }

   @Override
   public void l() {
      this.D = this.A;
      this.A = null;
   }

   @Override
   public int L() {
      return a(14935, 3337117774170216550L);
   }

   @Override
   public int u() {
      return a(14935, 3337117774170216550L);
   }

   @Override
   public void O(Component var1, Graphics2D var2, int var3, int var4, int var5, int var6) {
      boolean var7;
      ImageIcon var12;
      label57: {
         label61: {
            var7 = UE.o();
            int var10000 = this.t;
            if (var7) {
               if (this.t <= -1) {
                  return;
               }

               var12 = this;
               if (!var7) {
                  break label61;
               }

               var10000 = (this.h) ? 1 : 0;
            }

            if (var10000 != 0) {
               var12 = (ImageIcon)J.get(this.t);
               break label57;
            }

            var12 = (ImageIcon)O.get(this.t);
         }

         var12 = var12;
      }

      ImageIcon var8 = var12;
      int var13 = (var5 - this.L()) / 2;
      int var10001 = var5 & 1;
      if (var7) {
         var10001 = var10001 == 1 ? 1 : 0;
      }

      int var9;
      label63: {
         var9 = var13 + var10001;
         var14 = (var6 - this.u()) / 2;
         var10001 = var6;
         int var10002 = a(17988, 406439959415956598L);
         if (var7) {
            if (var6 <= var10002) {
               var10001 = 0;
               break label63;
            }

            var10001 = var6 & 1;
            if (!var7) {
               break label63;
            }

            var10002 = 1;
         }

         if (var10001 == var10002) {
            var10001 = var6;
            if (!var7) {
               break label63;
            }

            if (var6 > a(11794, 7011858990838500386L)) {
               var10001 = 2;
               break label63;
            }
         }

         var10001 = 1;
      }

      int var10 = var14 + var10001;
      var2.drawImage(var8.getImage(), var3 + var9, var4 + var10, null);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25136;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var8 = new String[3];
      int var12 = 0;
      String var11 = "c\u0014l\u000e\u0007$\u0007m\u0007Rg<\u001b\u001a\u0001`*I-<&&m\u0011\u000f,6>\u0005`\u0005D,q.\fg\nJf";
      int var13 = "c\u0014l\u000e\u0007$\u0007m\u0007Rg<\u001b\u001a\u0001`*I-<&&m\u0011\u000f,6>\u0005`\u0005D,q.\fg\nJf".length();
      char var10 = 4;
      int var9 = -1;

      while (true) {
         char[] var10002;
         label58: {
            char[] var10003 = var11.substring(++var9, var9 + var10).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var25 = 39;
            var10002 = var10003;
            int var18 = var10004;
            byte var29;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var29 = 39;
               var10006 = var14;
            } else {
               var25 = 39;
               var18 = var10004;
               if (var10004 <= var14) {
                  break label58;
               }

               var10005 = var10003;
               var29 = 39;
               var10006 = var14;
            }

            while (true) {
               char var42 = var10005[var10006];
               byte var43;
               switch (var14 % 7) {
                  case 0:
                     var43 = 106;
                     break;
                  case 1:
                     var43 = 67;
                     break;
                  case 2:
                     var43 = 37;
                     break;
                  case 3:
                     var43 = 78;
                     break;
                  case 4:
                     var43 = 6;
                     break;
                  case 5:
                     var43 = 111;
                     break;
                  default:
                     var43 = 120;
               }

               var10005[var10006] = (char)(var42 ^ var29 ^ var43);
               var14++;
               if (var25 == 0) {
                  var10006 = var25;
                  var10005 = var10002;
                  var29 = var25;
               } else {
                  if (var18 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var29 = var25;
                  var10006 = var14;
               }
            }
         }

         String var27 = new String(var10002).intern();
         int var20 = -1;
         var8[var12++] = var27;
         if ((var9 += var10) >= var13) {
            long var0 = 7229808570086258421L;
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "\u0000z\u008b\u000fÒ\u001e:Å\u009e\u0005¼\u001a\u0091\u001e.\u0083\u0011ñ\u0005\u000e\u0085\u0093Ò\u0093";
            int var5 = "\u0000z\u008b\u000fÒ\u001e:Å\u009e\u0005¼\u001a\u0091\u001e.\u0083\u0011ñ\u0005\u000e\u0085\u0093Ò\u0093".length();
            byte var2 = 0;

            do {
               var20 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var20, var2).getBytes("ISO-8859-1");
               var20 = var3++;
               long var33 = (
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
               var6[var20] = var33;
            } while (var2 < var5);

            a = var6;
            b = new Integer[3];
            J = new ArrayList();
            O = new ArrayList();

            for (int var15 = 1; var15 <= 4; var15++) {
               ImageIcon var16 = new ImageIcon(Fm2.class.getResource(var8[1] + var15 + var8[0]));
               J.add(var16);
               O.add(Xg2.H(var8[2] + var15, var16));
            }

            return;
         }

         var10 = var11.charAt(var9);
      }
   }
}





