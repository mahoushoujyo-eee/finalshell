package com.finalshell.core;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.util.HashMap;
import java.util.Map;

public class GE {
   public final FontMetrics T;
   public final Font g;
   public final FontRenderContext l;
   public final Map a;
   public static char[] H;
   static boolean S;
   public static long[] b;
   public static Integer[] c;

   public GE(FontMetrics var1) {
      String var10000 = FV_2.D();
      super();
      this.T = var1;
      this.g = var1.getFont();
      this.l = var1.getFontRenderContext();
      String var2 = var10000;
      GE var3 = this;
      if (var2 == null) {
         this.a = new HashMap();
         if (S) {
            return;
         }

         var3 = this;
      }

      if (var2 == null) {
         if (var3.g == null) {
            throw new AssertionError();
         }

         var3 = this;
      }

      if (var3.l == null) {
         throw new AssertionError();
      }
   }

   public int G(char var1) {
      String var10000 = FV_2.D();
      Short var3 = (Short)this.a.get(var1);
      String var2 = var10000;
      if (var2 == null && var3 == null) {
         var3 = this.k(var1);
         this.a.put(var1, var3);
      }

      return ((a(17385, 6578449476650503238L) & var3) >>> a(15720, 8802378366684230344L)) - a(17425, 241585815428041651L);
   }

   public int g(char var1) {
      String var10000 = FV_2.D();
      Short var3 = (Short)this.a.get(var1);
      String var2 = var10000;
      if (var2 == null && var3 == null) {
         var3 = this.k(var1);
         this.a.put(var1, var3);
      }

      return (a(9003, 4505525811107097735L) & var3) - a(17425, 241585815428041651L);
   }

   public short k(char var1) {
      H[0] = var1;
      GlyphVector var3 = this.g.createGlyphVector(this.l, H);
      String var10000 = FV_2.D();
      Rectangle var4 = var3.getGlyphPixelBounds(0, this.l, 0.0F, 0.0F);
      String var2 = var10000;
      int var5 = var4.x;
      int var6 = var4.width - this.T.charWidth(var1);
      int var10 = var5;
      if (var2 == null) {
         label74:
         if (var5 < 0) {
            label79: {
               Object var7 = this.l.getAntiAliasingHint();
               var10000 = (String)var7;
               Object var10001 = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB;
               if (var2 == null) {
                  if (var7 == RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
                     break label79;
                  }

                  var10000 = (String)var7;
                  var10001 = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HBGR;
               }

               if (var10000 != var10001) {
                  break label74;
               }
            }

            var5++;
         }

         var10 = var6;
      }

      if (var2 == null) {
         label61:
         if (var10 > 0) {
            label66: {
               Object var8 = this.l.getAntiAliasingHint();
               var10000 = (String)var8;
               Object var15 = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB;
               if (var2 == null) {
                  if (var8 == RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
                     break label66;
                  }

                  var10000 = (String)var8;
                  var15 = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HBGR;
               }

               if (var10000 != var15) {
                  break label61;
               }
            }

            var6--;
         }

         var10 = var5;
      }

      int var17;
      label57: {
         label56: {
            label88: {
               label89: {
                  label53: {
                     if (var2 == null) {
                        if (var10 >= a(21427, 2140305497940499472L)) {
      int var13;
                           var13 = var5;
                           var17 = a(16803, 4006517586498784777L);
                           if (var2 != null) {
                              break label89;
                           }

                           if (var5 <= var17) {
      int var13;
                              break label53;
                           }
                        }

                        var10 = 0;
                     }

                     var5 = var10;
                  }

                  var13 = var6;
                  if (var2 != null) {
                     break label88;
                  }

                  var17 = a(15892, 6166191262402474431L);
               }

               if (var13 >= var17) {
                  var14 = var6;
                  var17 = a(17425, 241585815428041651L);
                  if (var2 != null) {
                     break label57;
                  }

                  if (var6 <= var17) {
                     break label56;
                  }
               }

               var13 = 0;
            }

            var6 = var13;
         }

         var14 = (var5 + a(17425, 241585815428041651L) << a(25715, 6341177783699778525L)) + var6;
         var17 = a(17425, 241585815428041651L);
      }

      int var9 = var14 + var17;
      return (short)var9;
   }

   @Override
   public boolean equals(Object var1) {
      String var2 = FV_2.D();
      Object var10000 = var1;
      if (var2 == null) {
         if (var1 == this) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof GE)) {
            return false;
         }

         var10000 = var1;
      }

      GE var3 = (GE)var10000;
      boolean var4 = this.g.equals(var3.g);
      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = this.l.equals(var3.l);
      }

      return var2 != null ? var4 : var4;
   }

   @Override
   public int hashCode() {
      String var10000 = FV_2.D();
      int var2 = a(25276, 5389899735197953297L);
      String var1 = var10000;
      GE var3 = this;
      if (var1 == null) {
         if (this.g != null) {
            var2 = a(1779, 1943290617856051546L) * var2 + this.g.hashCode();
         }

         var3 = this;
      }

      if (var3.l != null) {
         var2 = a(32345, 8202851128078021105L) * var2 + this.l.hashCode();
      }

      return var2;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20394;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1713784925716413036L;
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "©U\u0011\u008d/#t\u001aËý\u0091`-ÜôRÜM;<¤>K¸j\u008b\u00930\n\u00163\u0013²\u001c¦_±¸Ñ¹l3÷§²%\u0089*\u0099Zª\u0084ÏÚ\u0096\u0014*.+ëÅÌ×llk\u0081Í±âq ";
      int var5 = "©U\u0011\u008d/#t\u001aËý\u0091`-ÜôRÜM;<¤>K¸j\u008b\u00930\n\u00163\u0013²\u001c¦_±¸Ñ¹l3÷§²%\u0089*\u0099Zª\u0084ÏÚ\u0096\u0014*.+ëÅÌ×llk\u0081Í±âq "
         .length();
      byte var2 = 0;

      label26:
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
                     b = var6;
                     c = new Integer[11];
                     S = !FN.class.desiredAssertionStatus();
                     H = new char[1];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label26;
                  }

                  var4 = "À\u0011¬D\u001aÎ\u0019ýæ$mÍ\u009au\b¬";
                  var5 = "À\u0011¬D\u001aÎ\u0019ýæ$mÍ\u009au\b¬".length();
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






