package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class J0 extends JLabel {
   public boolean E;
   public boolean P;
   public boolean y;
   public boolean d;
   public com.finalshell.core.Kw4 e;
   public Color z;
   public Color f;
   public static long[] a;
   public static Integer[] b;

   public J0() {
      Registry.lookupField(274420627917076678L).setBoolean(this, false);
      Registry.lookupField(195928408362155202L).setBoolean(this, false);
      Registry.lookupField(419480247857166371L).setBoolean(this, false);
      Color var10001 = new Color(a(2008, 6877392405139075383L), a(13640, 9048047858366645156L), a(3963, 336304932294834579L), a(29973, 1412147024354034683L));
      long var2 = 273368680465522015L;
      Color var1 = var10001;
      Ref.s(273368680465522015L, var1, var2);
      Color var10002 = new Color(a(10576, 6483732662636257211L), a(24366, 419031080208296388L), a(3963, 336304932294834579L), a(4545, 414216209378060076L));
      long var4 = 243729176705171314L;
      Color var3 = var10002;
      Ref.s(243729176705171314L, var3, var4);
   }

   @Override
   public void paint(Graphics var1) {
      Float var42;
      Float var46;
      J0 var40;
      label106: {
         label108: {
            int[] var10000 = CE.S$arrint();
            Graphics2D var3 = (Graphics2D)var1;
            int[] var2 = var10000;
            boolean var39 = Registry.lookupField(274420627917076678L).getBoolean(this);
            if (var2 != null) {
               if (var39) {
                  break label108;
               }

               var39 = Registry.lookupField(195928408362155202L).getBoolean(this);
            }

            if (var2 != null) {
               if (var39) {
                  Object var11 = 243729176705171314L;
                  this.setColor((Color)Ref.g(243729176705171314L, var11));
                  Object var13 = 134558931194879927L;
                  Ref.g(134558931194879927L, var13);
                  Object var10003 = Registry.emptyArgs();
                  long var16 = 316174812741990735L;
                  Object var15 = var10003;
                  var10003 = Ref.h(316174812741990735L, var15, var16);

                  try {
                     var42 = (Float)var10003;
                  } catch (InvocationTargetException var33) {
                     throw var33.getTargetException();
                  }

                  float var4;
                  byte var5;
                  int var8;
                  var4 = var42 * 0.01F;
                  var5 = 3;
                  byte var6 = 0;
                  byte var7 = 5;
                  var8 = (int)(((float)this.getWidth() - (float)var7) * var4) + var6;
                  float var49;
                  var43 = (var49 = var4 - 0.0F) == 0.0F ? 0 : (var49 < 0.0F ? -1 : 1);
                  label95:
                  if (var2 != null) {
                     if (var43 > 0) {
      int var43;
                        var43 = var8;
                        if (var2 == null) {
                           break label95;
                        }

                        if (var8 == 0) {
                           var8 = 1;
                        }
                     }

                     var43 = var5;
                  }

                  label88: {
                     int var9 = var43;
                     if (var2 != null) {
                        if (var4 > 0.0F) {
                           var3.fillRect(this.getWidth() - var8, var9, var8, this.getHeight() - 2 * var5);
                           if (var2 != null) {
                              break label88;
                           }
                        }

                        Object var17 = 243729176705171314L;
                        this.setColor((Color)Ref.g(243729176705171314L, var17));
                     }

                     var3.fillRect(this.getWidth() - var8, var9, var8, this.getHeight() - 2 * var5);
                  }

                  if (var2 != null) {
                     break label108;
                  }
               }

               var40 = this;
               if (var2 == null) {
                  break label106;
               }

               var39 = Registry.lookupField(419480247857166371L).getBoolean(this);
            }

            label77:
            if (var39) {
               Object var19 = 273368680465522015L;
               this.setColor((Color)Ref.g(273368680465522015L, var19));
               Object var21 = 134558931194879927L;
               Ref.g(134558931194879927L, var21);
               Object var44 = Registry.emptyArgs();
               long var24 = 491932081530754249L;
               Object var23 = var44;
               var44 = Ref.h(491932081530754249L, var23, var24);

               try {
                  var46 = (Float)var44;
               } catch (InvocationTargetException var32) {
                  throw var32.getTargetException();
               }

               double var34 = (double)(var46 * 0.01F);
               byte var35 = 3;
               byte var36 = 0;
               byte var37 = 5;
               int var38 = (int)((double)((float)this.getWidth() - (float)var37) * var34) + var36;
               Object var25 = 134558931194879927L;
               Ref.g(134558931194879927L, var25);
               Object var10005 = Registry.emptyArgs();
               long var28 = 204432614484767489L;
               Object var27 = var10005;
               var10005 = Ref.h(204432614484767489L, var27, var28);

               try {
                  var48 = (Integer)var10005;
               } catch (InvocationTargetException var31) {
                  throw var31.getTargetException();
               }

               label73:
               if (var2 != null) {
                  if (var48 > 0) {
                     var48 = var38;
                     if (var2 == null) {
                        break label73;
                     }

                     if (var38 == 0) {
                        var38 = 1;
                     }
                  }

                  double var50;
                  var48 = (var50 = var34 - 0.0) == 0.0 ? 0 : (var50 < 0.0 ? -1 : 1);
               }

               if (var48 > 0) {
                  var3.fillRect(this.getWidth() - var38, var35, var38, this.getHeight() - 2 * var35);
                  if (var2 != null) {
                     break label77;
                  }
               }

               Object var29 = 273368680465522015L;
               this.setColor((Color)Ref.g(273368680465522015L, var29));
               var3.fillRect(this.getWidth() - var38, var35, var38, this.getHeight() - 2 * var35);
            }
         }

         var40 = this;
      }

      var40.paint(var1);
   }

   public boolean Q() {
      return Registry.lookupField(275155431310545120L).getBoolean(this);
   }

   public void C(boolean var1) {
      Registry.lookupField(275155431310545120L).setBoolean(this, var1);
   }

   public boolean C() {
      return Registry.lookupField(274420627917076678L).getBoolean(this);
   }

   public void V(boolean var1) {
      Registry.lookupField(274420627917076678L).setBoolean(this, var1);
   }

   public com.finalshell.core.Kw4 R() {
      Object var1 = 134558931194879927L;
      return (com.finalshell.core.Kw4)Ref.g(134558931194879927L, var1);
   }

   public void k(com.finalshell.core.Kw4 var1) {
      long var3 = 134558931194879927L;
      Ref.s(134558931194879927L, var1, var3);
   }

   public boolean D() {
      return Registry.lookupField(195928408362155202L).getBoolean(this);
   }

   public void i(boolean var1) {
      Registry.lookupField(195928408362155202L).setBoolean(this, var1);
   }

   public boolean P() {
      return Registry.lookupField(419480247857166371L).getBoolean(this);
   }

   public void D(boolean var1) {
      Registry.lookupField(419480247857166371L).setBoolean(this, var1);
   }

   public com.finalshell.core.Kw4 s() {
      Object var1 = 134558931194879927L;
      return (com.finalshell.core.Kw4)Ref.g(134558931194879927L, var1);
   }

   public void s(com.finalshell.core.Kw4 var1) {
      long var3 = 134558931194879927L;
      Ref.s(134558931194879927L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14062;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8414051312702908116L;
      long[] var6 = new long[7];
      int var3 = 0;
      String var4 = "t!RkB¯¥Whd3l\u0086ØWÑXñ\u0092\u009es=eÚn\u0093dè{ ÁRËÖ\u0092²Â9\u000f@";
      int var5 = "t!RkB¯¥Whd3l\u0086ØWÑXñ\u0092\u009es=eÚn\u0093dè{ ÁRËÖ\u0092²Â9\u000f@".length();
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
                     a = var6;
                     b = new Integer[7];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "0î\u009eSÀ\u0098ù\u0090\u0096ØmÂ\u00065ßu";
                  var5 = "0î\u009eSÀ\u0098ù\u0090\u0096ØmÂ\u00065ßu".length();
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





