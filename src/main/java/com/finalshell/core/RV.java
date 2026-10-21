package com.finalshell.core;

import com.finalshell.ui.model.PI3;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.geom.Area;
import java.util.HashMap;
import java.util.Map;

public final class RV {
   public static boolean m;
   public static Map H;
   public static Map g;
   public static String a;

   public static Object O(Graphics var0) {
      return f((Graphics2D)var0, RenderingHints.VALUE_ANTIALIAS_ON);
   }

   public static Object X(Graphics2D var0) {
      return f(var0, RenderingHints.VALUE_ANTIALIAS_ON);
   }

   public static Object h(Graphics var0) {
      return f((Graphics2D)var0, RenderingHints.VALUE_ANTIALIAS_OFF);
   }

   public static Object j(Graphics2D var0) {
      return f(var0, RenderingHints.VALUE_ANTIALIAS_OFF);
   }

   public static Object f(Graphics2D var0, Object var1) {
      Object var2 = var0.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
      var0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var1);
      return var2;
   }

   public static void s(Graphics var0, Object var1) {
      X((Graphics2D)var0, var1);
   }

   public static void X(Graphics2D var0, Object var1) {
      var0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var1);
   }

   public static Map A() {
      String var0 = FV_2.D();
      boolean var10000 = m;
      if (var0 == null) {
         if (m) {
            return H;
         }

         H = (Map)Toolkit.getDefaultToolkit().getDesktopProperty(a);
         var10000 = true;
      }

      m = var10000;
      return H;
   }

   public static void K(Graphics var0) {
      L((Graphics2D)var0);
   }

   public static void L(Graphics2D var0) {
      Map var1 = A();
      if (var1 != null) {
         var0.addRenderingHints(var1);
      }
   }

   public static Composite p(Graphics2D var0, Float var1) {
      return a(var0, var1, true);
   }

   public static Composite a(Graphics2D var0, Float var1, boolean var2) {
      return a(var0, var0.getComposite(), var1, var2);
   }

   public static Composite U(Graphics2D var0, Composite var1, Float var2) {
      return a(var0, var1, var2, true);
   }

   public static Composite a(Graphics2D var0, Composite var1, Float var2, boolean var3) {
      Composite var4 = var0.getComposite();
      if (var3 && var2 != null) {
         float var5 = 1.0F;
         if (var1 != null && var1 instanceof AlphaComposite) {
            var5 = ((AlphaComposite)var1).getAlpha();
         }

         AlphaComposite var6 = AlphaComposite.getInstance(3, var5 * var2);
         var0.setComposite(var6);
         return var4;
      } else {
         return var4;
      }
   }

   public static void c(Graphics2D var0, Composite var1) {
      var0.setComposite(var1);
   }

   public static void E(Graphics2D var0, Composite var1, boolean var2) {
      if (var2) {
         var0.setComposite(var1);
      }
   }

   public static Stroke M(Graphics2D var0, Stroke var1) {
      return d(var0, var1, true);
   }

   public static Stroke d(Graphics2D var0, Stroke var1, boolean var2) {
      Stroke var10000;
      label15: {
         String var3 = FV_2.D();
         if (var2) {
            var10000 = var1;
            if (var3 != null) {
               break label15;
            }

            if (var1 != null) {
               var10000 = var0.getStroke();
               break label15;
            }
         }

         return null;
      }

      Stroke var4 = var10000;
      var0.setStroke(var1);
      return var4;
   }

   public static void p(Graphics2D var0, Stroke var1) {
      t(var0, var1, true);
   }

   public static void t(Graphics2D var0, Stroke var1, boolean var2) {
      if (var2 && var1 != null) {
         var0.setStroke(var1);
      }
   }

   public static Shape e(Graphics2D var0, Shape var1) {
      return A(var0, var1, true);
   }

   public static Shape A(Graphics2D var0, Shape var1, boolean var2) {
      Shape var10000;
      label15: {
         String var3 = FV_2.D();
         if (var2) {
            var10000 = var1;
            if (var3 != null) {
               break label15;
            }

            if (var1 != null) {
               var10000 = var0.getClip();
               break label15;
            }
         }

         return null;
      }

      Shape var4 = var10000;
      var0.setClip(var1);
      return var4;
   }

   public static Shape d(Graphics2D var0, int var1, int var2, int var3, int var4) {
      return K(var0, var1, var2, var3, var4, true);
   }

   public static Shape K(Graphics2D var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         Shape var6 = var0.getClip();
         var0.setClip(var1, var2, var3, var4);
         return var6;
      } else {
         return null;
      }
   }

   public static void w(Graphics2D var0, Shape var1) {
      n(var0, var1, true);
   }

   public static void n(Graphics2D var0, Shape var1, boolean var2) {
      if (var2 && var1 != null) {
         var0.setClip(var1);
      }
   }

   public static Object I(Graphics var0) {
      return O((Graphics2D)var0);
   }

   public static Object O(Graphics2D var0) {
      Object var1 = var0.getRenderingHint(RenderingHints.KEY_INTERPOLATION);
      var0.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      return var1;
   }

   public static void S(Graphics var0, Object var1) {
      N((Graphics2D)var0, var1);
   }

   public static void N(Graphics2D var0, Object var1) {
      String var2 = FV_2.D();
      Object var10002 = var1;
      if (var2 == null) {
         var10002 = var1 != null ? var1 : RenderingHints.VALUE_INTERPOLATION_BILINEAR;
      }

      var0.setRenderingHint(RenderingHints.KEY_INTERPOLATION, var10002);
   }

   public static Font b(Graphics var0, Font var1) {
      String var2 = FV_2.D();
      Font var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return null;
         }

         var10000 = var0.getFont();
      }

      Font var3 = var10000;
      var0.setFont(var1);
      return var3;
   }

   public static void j(Graphics var0, Font var1) {
      if (var1 != null) {
         var0.setFont(var1);
      }
   }

   public static Shape n(Graphics2D var0, Shape var1) {
      return I(var0, var1, true);
   }

   public static Shape I(Graphics2D var0, Shape var1, boolean var2) {
      Shape var10000;
      label15: {
         String var3 = FV_2.D();
         if (var2) {
            var10000 = var1;
            if (var3 != null) {
               break label15;
            }

            if (var1 != null) {
               var10000 = var0.getClip();
               break label15;
            }
         }

         return null;
      }

      Shape var4 = var10000;
      var0.clip(var1);
      return var4;
   }

   public static Shape k(Graphics var0, Shape var1) {
      return t(var0, var1, true);
   }

   public static Shape t(Graphics var0, Shape var1, boolean var2) {
      String var3 = FV_2.D();
      if (var2) {
         Shape var10000 = var1;
         if (var3 == null) {
            if (var1 == null) {
               return null;
            }

            var10000 = var0.getClip();
         }

         Shape var4 = var10000;
         var10000 = var4;
         if (var3 == null) {
            if (var4 != null) {
               Area var5 = new Area(var4);
               var5.subtract(new Area(var1));
               var0.setClip(var5);
            }

            var10000 = var4;
         }

         return var10000;
      } else {
         return null;
      }
   }

   public static void t(Graphics var0, Shape var1) {
      j(var0, var1, true);
   }

   public static void j(Graphics var0, Shape var1, boolean var2) {
      if (var2 && var1 != null) {
         var0.setClip(var1);
      }
   }

   public static Stroke y(int var0) {
      return Z(var0, 1, 1);
   }

   public static Stroke c(int var0, int var1) {
      return Z(var0, var1, 1);
   }

   public static Stroke Z(int var0, int var1, int var2) {
      String var4 = var0 + "," + var1 + "," + var2;
      String var10000 = FV_2.D();
      Object var5 = (Stroke)g.get(var4);
      String var3 = var10000;
      Object var6 = var5;
      if (var3 == null) {
         if (var5 == null) {
            var5 = new BasicStroke((float)var0, var1, var2);
            g.put(var4, var5);
         }

         var6 = var5;
      }

      return (Stroke)var6;
   }

   public static void Y(Graphics2D var0, Shape var1, Color var2, int var3) {
      y(var0, var1, GO.m, var2, var3);
   }

   public static void y(Graphics2D var0, Shape var1, PI3 var2, Color var3, int var4) {
      n(var0, var1, var2, var3, var4, null, true);
   }

   public static void D(Graphics2D var0, Shape var1, Color var2, int var3, Shape var4) {
      n(var0, var1, GO.m, var2, var3, var4, true);
   }

   public static void m(Graphics2D var0, Shape var1, PI3 var2, Color var3, int var4, Shape var5) {
      n(var0, var1, var2, var3, var4, var5, true);
   }

   public static void Z(Graphics2D var0, Shape var1, Color var2, int var3, boolean var4) {
      n(var0, var1, GO.m, var2, var3, null, var4);
   }

   public static void y(Graphics2D var0, Shape var1, PI3 var2, Color var3, int var4, boolean var5) {
      n(var0, var1, var2, var3, var4, null, var5);
   }

   public static void n(Graphics2D var0, Shape var1, Color var2, int var3, Shape var4, boolean var5) {
      n(var0, var1, GO.m, var2, var3, var4, var5);
   }

   public static void n(Graphics2D var0, Shape var1, PI3 var2, Color var3, int var4, Shape var5, boolean var6) {
      Graphics2D var16;
      String var7 = FV_2.D();
      if (var4 > 1) {
         Shape var10000 = var5;
         if (var7 == null) {
            var10000 = var5 != null ? n(var0, var5) : k(var0, var1);
         }

         Shape var8;
         Composite var9;
         float var10;
         label72: {
            var8 = var10000;
            var9 = var0.getComposite();
            var10 = 1.0F;
            Composite var14 = var9;
            if (var7 == null) {
               if (!(var9 instanceof AlphaComposite)) {
                  break label72;
               }

               var14 = var9;
            }

            var10 = ((AlphaComposite)var14).getAlpha();
         }

         Stroke var11 = var0.getStroke();
         if (var3 != null) {
            var0.setPaint(var3);
         }

         label65: {
            label78: {
               int var15 = (var2.equals(PI3.simple)) ? 1 : 0;
               if (var7 == null) {
                  if (var15 != 0) {
                     if (GO.p < 1.0F) {
                        var0.setComposite(AlphaComposite.getInstance(3, GO.p * var10));
                     }

                     int var10001 = var4 * 2;
                     int var10002 = (var6) ? 1 : 0;
                     if (var7 == null) {
                        var10002 = var6 != 0 ? 1 : 0;
                     }

                     var0.setStroke(c(var10001, var10002));
                     var0.draw(var1);
                     if (var7 == null) {
                        break label78;
                     }
                  }

                  var4 *= 2;
                  var15 = var4;
               }

               int var12 = var15;

               while (var12 >= 2) {
                  float var13 = (float)(var4 - var12) / (float)(var4 - 1);
                  var0.setComposite(AlphaComposite.getInstance(3, var13 * var10));
                  var16 = var0;
                  if (var7 != null) {
                     break label65;
                  }

                  int var17 = (var6) ? 1 : 0;
                  if (var7 == null) {
                     var17 = var6 != 0 ? 1 : 0;
                  }

                  var0.setStroke(c(var12, var17));
                  var0.draw(var1);
                  var12 -= 2;
                  if (var7 != null) {
                     break;
                  }
               }
            }

            p(var0, var11);
            c(var0, var9);
            var16 = var0;
         }

         w(var16, var8);
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "-?\u0003i+L\r8f\u0013\">H\u0017#8\u001f.#W\u0010".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 62;
      char[] var10002 = var10003;
      int var1 = var10004;
      char[] var10;
      byte var14;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var10 = var10003;
         var10005 = var0;
         char var10008 = var10003[var0];
         var10007 = 62;
         var10006 = var10008;
         switch (var0 % 7) {
            case 0:
               var14 = 114;
               break;
            case 1:
               var14 = 118;
               break;
            case 2:
               var14 = 73;
               break;
            case 3:
               var14 = 121;
               break;
            case 4:
               var14 = 115;
               break;
            case 5:
               var14 = 29;
               break;
            default:
               var14 = 93;
         }
      } else {
         var6 = 62;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            m = false;
            H = null;
            g = new HashMap();
            return;
         }

         var10 = var10003;
         var10005 = var0;
         char var15 = var10003[var0];
         var10007 = 62;
         var10006 = var15;
         switch (var0 % 7) {
            case 0:
               var14 = 114;
               break;
            case 1:
               var14 = 118;
               break;
            case 2:
               var14 = 73;
               break;
            case 3:
               var14 = 121;
               break;
            case 4:
               var14 = 115;
               break;
            case 5:
               var14 = 29;
               break;
            default:
               var14 = 93;
         }
      }

      while (true) {
         var10[var10005] = (char)(var10006 ^ var10007 ^ var14);
         var0++;
         if (var6 == 0) {
            var10 = var10002;
            var10005 = var6;
            char var17 = var10002[var6];
            var10007 = var6;
            var10006 = var17;
            switch (var0 % 7) {
               case 0:
                  var14 = 114;
                  break;
               case 1:
                  var14 = 118;
                  break;
               case 2:
                  var14 = 73;
                  break;
               case 3:
                  var14 = 121;
                  break;
               case 4:
                  var14 = 115;
                  break;
               case 5:
                  var14 = 29;
                  break;
               default:
                  var14 = 93;
            }
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               m = false;
               H = null;
               g = new HashMap();
               return;
            }

            var10 = var10002;
            var10005 = var0;
            char var16 = var10002[var0];
            var10007 = var6;
            var10006 = var16;
            switch (var0 % 7) {
               case 0:
                  var14 = 114;
                  break;
               case 1:
                  var14 = 118;
                  break;
               case 2:
                  var14 = 73;
                  break;
               case 3:
                  var14 = 121;
                  break;
               case 4:
                  var14 = 115;
                  break;
               case 5:
                  var14 = 29;
                  break;
               default:
                  var14 = 93;
            }
         }
      }
   }
}





