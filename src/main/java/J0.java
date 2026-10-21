import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;

public class J0 extends JLabel {
   boolean E;
   boolean P;
   boolean y;
   boolean d;
   kw_4 e;
   Color z;
   Color f;
   private static final long[] a;
   private static final Integer[] b;

   public J0() {
      com.c.c(274420627917076678L).setBoolean(this, false);
      com.c.c(195928408362155202L).setBoolean(this, false);
      com.c.c(419480247857166371L).setBoolean(this, false);
      com.c.c(273368680465522015L)
         .set(this, new Color(a(2008, 6877392405139075383L), a(13640, 9048047858366645156L), a(3963, 336304932294834579L), a(29973, 1412147024354034683L)));
      com.c.c(243729176705171314L)
         .set(this, new Color(a(10576, 6483732662636257211L), a(24366, 419031080208296388L), a(3963, 336304932294834579L), a(4545, 414216209378060076L)));
   }

   @Override
   public void paint(Graphics var1) {
      J0 var24;
      label106: {
         label108: {
            int[] var10000 = CE.S();
            Graphics2D var3 = (Graphics2D)var1;
            int[] var2 = var10000;
            boolean var19 = com.c.c(274420627917076678L).getBoolean(this);
            if (var2 != null) {
               if (var19) {
                  break label108;
               }

               var19 = com.c.c(195928408362155202L).getBoolean(this);
            }

            if (var2 != null) {
               if (var19) {
                  var3.setColor((Color)com.c.c(243729176705171314L).get(this));
                  Object var20 = com.c.c(134558931194879927L).get(this);
                  Object[] var10001 = com.c.f();
                  Method var10003 = com.c.d(316174812741990735L);
                  Object[] var10002 = var10001;
                  var10001 = (Object[])var20;
                  var20 = var10003;

                  try {
                     var22 = (Float)var20.invoke(var10001, var10002);
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  float var4;
                  byte var5;
                  int var8;
                  var4 = var22 * 0.01F;
                  var5 = 3;
                  byte var6 = 0;
                  byte var7 = 5;
                  var8 = (int)(((float)this.getWidth() - (float)var7) * var4) + var6;
                  float var40;
                  var23 = (var40 = var4 - 0.0F) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
                  label95:
                  if (var2 != null) {
                     if (var23 > 0) {
                        var23 = var8;
                        if (var2 == null) {
                           break label95;
                        }

                        if (var8 == 0) {
                           var8 = 1;
                        }
                     }

                     var23 = var5;
                  }

                  label88: {
                     int var9 = var23;
                     if (var2 != null) {
                        if (var4 > 0.0F) {
                           var3.fillRect(this.getWidth() - var8, var9, var8, this.getHeight() - 2 * var5);
                           if (var2 != null) {
                              break label88;
                           }
                        }

                        var3.setColor((Color)com.c.c(243729176705171314L).get(this));
                     }

                     var3.fillRect(this.getWidth() - var8, var9, var8, this.getHeight() - 2 * var5);
                  }

                  if (var2 != null) {
                     break label108;
                  }
               }

               var24 = this;
               if (var2 == null) {
                  break label106;
               }

               var19 = com.c.c(419480247857166371L).getBoolean(this);
            }

            label77:
            if (var19) {
               var3.setColor((Color)com.c.c(273368680465522015L).get(this));
               Object var25 = com.c.c(134558931194879927L).get(this);
               Object[] var32 = com.c.f();
               Method var38 = com.c.d(491932081530754249L);
               Object[] var36 = var32;
               var32 = (Object[])var25;
               var25 = var38;

               try {
                  var27 = (Float)var25.invoke(var32, var36);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }

               double var14 = (double)(var27 * 0.01F);
               byte var15 = 3;
               byte var16 = 0;
               byte var17 = 5;
               int var18 = (int)((double)((float)this.getWidth() - (float)var17) * var14) + var16;
               var25 = com.c.c(134558931194879927L).get(this);
               var32 = com.c.f();
               var38 = com.c.d(204432614484767489L);
               var36 = var32;
               var32 = (Object[])var25;
               var25 = var38;

               try {
                  var30 = (Integer)var25.invoke(var32, var36);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               label73:
               if (var2 != null) {
                  if (var30 > 0) {
                     var30 = var18;
                     if (var2 == null) {
                        break label73;
                     }

                     if (var18 == 0) {
                        var18 = 1;
                     }
                  }

                  double var41;
                  var30 = (var41 = var14 - 0.0) == 0.0 ? 0 : (var41 < 0.0 ? -1 : 1);
               }

               if (var30 > 0) {
                  var3.fillRect(this.getWidth() - var18, var15, var18, this.getHeight() - 2 * var15);
                  if (var2 != null) {
                     break label77;
                  }
               }

               var3.setColor((Color)com.c.c(273368680465522015L).get(this));
               var3.fillRect(this.getWidth() - var18, var15, var18, this.getHeight() - 2 * var15);
            }
         }

         var24 = this;
      }

      var24.paint(var1);
   }

   public boolean Q() {
      return com.c.c(275155431310545120L).getBoolean(this);
   }

   public void C(boolean var1) {
      com.c.c(275155431310545120L).setBoolean(this, var1);
   }

   public boolean C() {
      return com.c.c(274420627917076678L).getBoolean(this);
   }

   public void V(boolean var1) {
      com.c.c(274420627917076678L).setBoolean(this, var1);
   }

   public kw_4 R() {
      return (kw_4)com.c.c(134558931194879927L).get(this);
   }

   public void k(kw_4 var1) {
      com.c.c(134558931194879927L).set(this, var1);
   }

   public boolean D() {
      return com.c.c(195928408362155202L).getBoolean(this);
   }

   public void i(boolean var1) {
      com.c.c(195928408362155202L).setBoolean(this, var1);
   }

   public boolean P() {
      return com.c.c(419480247857166371L).getBoolean(this);
   }

   public void D(boolean var1) {
      com.c.c(419480247857166371L).setBoolean(this, var1);
   }

   public kw_4 s() {
      return (kw_4)com.c.c(134558931194879927L).get(this);
   }

   public void s(kw_4 var1) {
      com.c.c(134558931194879927L).set(this, var1);
   }

   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14062;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





