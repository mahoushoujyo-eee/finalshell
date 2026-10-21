package com.finalshell.ui.panel;

import com.finalshell.core.E;
import com.finalshell.core.Rv4;
import com.finalshell.core.T3_3;
import com.finalshell.ui.listener.K3;
import com.finalshell.ui.model.QE;
import java.awt.Component;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class QY extends QB {
   public int O;
   public double G;
   public double s;
   public QE u;
   public QE o;
   public boolean g;
   public List h = new ArrayList();
   public int H = -1;
   public static String d;
   public static long j;

   public QY() {
      super(d, new T3_3());
      this.Y(true);
      this.c(0.04F);
      this.C(false);
      this.t(0.0F);
      this.t(true);
      this.a(true);
      this.b((int)j);
      this.u(0.0);
      this.y(360.0);
      this.W(QE.shutter);
      this.y(null);
      this.P(true);
   }

   public int v() {
      return this.O;
   }

   public void b(int var1) {
      this.O = var1;
   }

   public double V() {
      return this.G;
   }

   public void u(double var1) {
      this.G = var1;
   }

   public double a() {
      return this.s;
   }

   public void y(double var1) {
      this.s = var1;
   }

   public QE t() {
      return this.u;
   }

   public void W(QE var1) {
      this.u = var1;
   }

   public QE H() {
      int[] var1 = E2.P();
      QY var10000 = this;
      if (var1 == null) {
         if (this.o != null) {
            return this.o;
         }

         var10000 = this;
      }

      return var10000.u;
   }

   public void y(QE var1) {
      this.o = var1;
   }

   public boolean C() {
      return this.g;
   }

   public void P(boolean var1) {
      this.g = var1;
   }

   public List R() {
      return this.h;
   }

   public E2 w(ImageIcon var1) {
      return this.e(var1, null);
   }

   public E2 e(ImageIcon var1, ActionListener var2) {
      return this.E(new E2(var1, var2));
   }

   public E2 E(E2 var1) {
      this.h.add(var1);
      var1.setEnabled(var1.V$ActionListener() != null);
      var1.p(var1.V$Insets());
      var1.addMouseListener(new K3(this, var1));
      this.add(var1);
      return var1;
   }

   public int u() {
      return this.H;
   }

   public QY Q(Component var1, int var2, int var3) {
      this.S(var1, var2, var3);
      return this;
   }

   public void h(Component var1, Point var2) {
      this.S(var1, var2.x, var2.y);
   }

   public void S(Component var1, int var2, int var3) {
      synchronized (this.c) {
         Point var5 = this.X().r(this, var2, var3);
         super.M(var1, var5.x, var5.y);
      }
   }

   @Override
   public void i() {
      this.revalidate();
   }

   @Override
   public QB l$QB() {
      this.w();
      return this;
   }

   public void w() {
      this.U(-1);
   }

   public void U(int var1) {
      this.H = var1;
      super.l$QB();
   }

   @Override
   public void f() {
      int[] var1 = E2.P();
      QY var10000 = this;
      if (var1 == null) {
         if (this.y > 0.0F) {
            this.revalidate();
            if (var1 == null) {
               return;
            }
         }

         this.H = -1;
         this.revalidate();
         var10000 = this;
      }

      var10000.q();
   }

   public double a(Component var1) {
      return this.j(this.getComponentZOrder(var1));
   }

   public double j(int var1) {
      return Rv4.p(this.X().r(this, var1));
   }

   public T3_3 X() {
      return (T3_3)this.getLayout();
   }

   public static boolean P() {
      boolean var5;
      int[] var10000 = E2.P();
      Window[] var1 = Window.getWindows();
      int var2 = var1.length;
      int[] var0 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < var2) {
            Window var4 = var1[var3];
            if (var0 == null) {
               var5 = var4.isShowing();
               if (var0 != null) {
                  break;
               }

               label36:
               if (var5) {
                  boolean var6 = var4 instanceof E;
                  if (var0 == null) {
                     if (!var6) {
                        break label36;
                     }

                     var6 = ((E)var4).getContentPane() instanceof QY;
                  }

                  if (var0 != null) {
                     return var6;
                  }

                  if (var6) {
                     return true;
                  }
               }

               var3++;
            }

            if (var0 == null) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }

   public static void F() {
      QY var5;
      Window[] var1 = Window.getWindows();
      int[] var10000 = E2.P();
      int var2 = var1.length;
      int[] var0 = var10000;
      int var3 = 0;

      while (var3 < var2) {
         Window var4 = var1[var3];
         if (var0 == null) {
            label25:
            if (var4.isShowing()) {
               label44: {
                  boolean var6 = var4 instanceof E;
                  if (var0 == null) {
                     if (!var6) {
                        break label25;
                     }

                     var7 = ((E)var4).getContentPane();
                     if (var0 != null) {
                        break label44;
                     }

                     var6 = var7 instanceof QY;
                  }

                  if (!var6) {
                     break label25;
                  }

                  var7 = ((E)var4).getContentPane();
               }

               var5 = (QY)var7;
               var5.w();
            }

            var3++;
         }

         if (var0 != null) {
            break;
         }
      }
   }

   @Override
   public QB M(Component var1, int var2, int var3) {
      return this.Q(var1, var2, var3);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0016b\u001f\u001a&x\b\u0010u\u0010\u0000".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 70;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 70;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 36;
               break;
            case 1:
               var21 = 86;
               break;
            case 2:
               var21 = 56;
               break;
            case 3:
               var21 = 50;
               break;
            case 4:
               var21 = 19;
               break;
            case 5:
               var21 = 78;
               break;
            default:
               var21 = 47;
         }
      } else {
         var13 = 70;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            d = var16;
            long var3 = 1299338594377316636L;
            long var12 = -5111244486855313120L ^ var3;
            var8 = -1;
            j = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 70;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 36;
               break;
            case 1:
               var21 = 86;
               break;
            case 2:
               var21 = 56;
               break;
            case 3:
               var21 = 50;
               break;
            case 4:
               var21 = 19;
               break;
            case 5:
               var21 = 78;
               break;
            default:
               var21 = 47;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 36;
                  break;
               case 1:
                  var21 = 86;
                  break;
               case 2:
                  var21 = 56;
                  break;
               case 3:
                  var21 = 50;
                  break;
               case 4:
                  var21 = 19;
                  break;
               case 5:
                  var21 = 78;
                  break;
               default:
                  var21 = 47;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               d = var15;
               long var0 = 1299338594377316636L;
               long var11 = -5111244486855313120L ^ var0;
               var6 = -1;
               j = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 36;
                  break;
               case 1:
                  var21 = 86;
                  break;
               case 2:
                  var21 = 56;
                  break;
               case 3:
                  var21 = 50;
                  break;
               case 4:
                  var21 = 19;
                  break;
               case 5:
                  var21 = 78;
                  break;
               default:
                  var21 = 47;
            }
         }
      }
   }
}





