package com.finalshell.ui.panel;

import com.finalshell.core.GA;
import com.finalshell.ui.listener.Xz2;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;

public class Kb4 extends Ky4 {
   public int g;
   public int b;
   public int e;
   public boolean v;
   public int C;
   public int m;
   public Insets M;
   public static String a;
   public static long[] c;
   public static Integer[] d;

   public Kb4() {
      this(null);
   }

   public Kb4(Component var1) {
      label13: {
         int[] var10000 = K32.L$arrint();
         super();
         this.g = 0;
         this.b = 0;
         this.e = -1;
         this.v = false;
         int[] var2 = var10000;
         this.C = -1;
         this.m = -1;
         this.M = new Insets(a(5865, 2195314037654215914L), a(1316, 3222710582203371298L), a(1316, 3222710582203371298L), a(1316, 3222710582203371298L));
         this.setOpaque(false);
         this.E();
         if (var2 != null) {
            if (var1 == null) {
               break label13;
            }

            this.setLayout(new BorderLayout());
         }

         this.add(var1, a);
      }

      Xz2 var3 = new Xz2(this);
      this.addMouseListener(var3);
      this.addMouseMotionListener(var3);
   }

   public void E() {
      this.N(this.M.top, this.M.left, this.M.bottom, this.M.right);
   }

   public Insets s() {
      return this.M;
   }

   public void x(int var1) {
      this.n(new Insets(var1, var1, var1, var1));
   }

   public void n(Insets var1) {
      this.M = var1;
      this.E();
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      GA.z(
         (Graphics2D)var1,
         new Rectangle(
            a(3471, 3234863040296896395L),
            a(4966, 5953234533138684259L),
            this.getWidth() - a(362, 8670596037004807016L),
            this.getHeight() - a(29793, 4900195236049075814L)
         ),
         true,
         true,
         true
      );
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var1 = super.getPreferredSize();
      var1.width = var1.width + this.g;
      var1.height = var1.height + this.b;
      return var1;
   }

   public void M() {
      this.g = 0;
      this.b = 0;
      this.revalidate();
   }

   static int y(Kb4 var0, int var1) {
      return var0.e = var1;
   }

   static int z(Kb4 var0) {
      return var0.e;
   }

   static boolean Y(Kb4 var0, boolean var1) {
      return var0.v = var1;
   }

   static int n(Kb4 var0, int var1) {
      return var0.C = var1;
   }

   static int i(Kb4 var0, int var1) {
      return var0.m = var1;
   }

   static boolean r(Kb4 var0) {
      return var0.v;
   }

   static int A(Kb4 var0) {
      return var0.C;
   }

   static int Q(Kb4 var0) {
      return var0.m;
   }

   static int H(Kb4 var0, int var1) {
      return var0.g += var1;
   }

   static int t(Kb4 var0, int var1) {
      return var0.g = var1;
   }

   static int J(Kb4 var0) {
      return var0.g;
   }

   static int A(Kb4 var0, int var1) {
      return var0.b += var1;
   }

   static int T(Kb4 var0, int var1) {
      return var0.b = var1;
   }

   static int v(Kb4 var0) {
      return var0.b;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18950;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "?\u00117\u00109\u0005".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 77;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 77;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 49;
               break;
            case 1:
               var50 = 57;
               break;
            case 2:
               var50 = 20;
               break;
            case 3:
               var50 = 41;
               break;
            case 4:
               var50 = 17;
               break;
            case 5:
               var50 = 58;
               break;
            default:
               var50 = 70;
         }
      } else {
         var34 = 77;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 6446757524717427793L;
            long[] var14 = new long[6];
            int var11 = 0;
            String var12 = "\u0089\u0011\u0091¦ßÄ\u0013\u007f*\u0006è\u0098#\u001fâ:Åí8b84\u001bÜ|\u000e~qÙ\u008a\u00054";
            int var13 = "\u0089\u0011\u0091¦ßÄ\u0013\u007f*\u0006è\u0098#\u001fâ:Åí8b84\u001bÜ|\u000e~qÙ\u008a\u00054".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           c = var14;
                           d = new Integer[6];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "£ÍÌcÝO\u00174ÊßÔ\u007f\u009d\u0015\u0000·";
                        var13 = "£ÍÌcÝO\u00174ÊßÔ\u007f\u009d\u0015\u0000·".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 77;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 49;
               break;
            case 1:
               var50 = 57;
               break;
            case 2:
               var50 = 20;
               break;
            case 3:
               var50 = 41;
               break;
            case 4:
               var50 = 17;
               break;
            case 5:
               var50 = 58;
               break;
            default:
               var50 = 70;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 49;
                  break;
               case 1:
                  var50 = 57;
                  break;
               case 2:
                  var50 = 20;
                  break;
               case 3:
                  var50 = 41;
                  break;
               case 4:
                  var50 = 17;
                  break;
               case 5:
                  var50 = 58;
                  break;
               default:
                  var50 = 70;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 6446757524717427793L;
               long[] var6 = new long[6];
               int var3 = 0;
               String var4 = "\u0089\u0011\u0091¦ßÄ\u0013\u007f*\u0006è\u0098#\u001fâ:Åí8b84\u001bÜ|\u000e~qÙ\u008a\u00054";
               int var5 = "\u0089\u0011\u0091¦ßÄ\u0013\u007f*\u0006è\u0098#\u001fâ:Åí8b84\u001bÜ|\u000e~qÙ\u008a\u00054".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              c = var6;
                              d = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "£ÍÌcÝO\u00174ÊßÔ\u007f\u009d\u0015\u0000·";
                           var5 = "£ÍÌcÝO\u00174ÊßÔ\u007f\u009d\u0015\u0000·".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 49;
                  break;
               case 1:
                  var50 = 57;
                  break;
               case 2:
                  var50 = 20;
                  break;
               case 3:
                  var50 = 41;
                  break;
               case 4:
                  var50 = 17;
                  break;
               case 5:
                  var50 = 58;
                  break;
               default:
                  var50 = 70;
            }
         }
      }
   }
}





