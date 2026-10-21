package com.finalshell.task;

import com.finalshell.core.DE;
import com.finalshell.core.OQ3;
import com.finalshell.core.Wo4;
import com.finalshell.core.Xg2;
import com.finalshell.ui.panel.Co2;
import java.awt.Dimension;
import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class Xb4 implements Runnable {
   public static ExecutorService Q;
   public static Map H;
   public static Object z;
   public final Co2 W;
   public final Wo4 g;
   public final boolean t;
   public boolean L;
   public static long[] a;
   public static Integer[] b;

   public Xb4(Co2 var1, Wo4 var2, boolean var3) {
      this.W = var1;
      this.g = var2;
      this.t = var3;
      this.L = false;
   }

   public Co2 k() {
      return this.W;
   }

   public Wo4 J$wo_4() {
      return this.g;
   }

   public boolean g() {
      return this.t;
   }

   public boolean s() {
      return this.L;
   }

   public void P() {
      this.L = true;
   }

   @Override
   public void run() {
      Xb4 var2;
      String var1 = Co2.U$String();
      boolean var10000 = this.L;
      if (var1 != null) {
         if (this.L) {
            this.J$void();
            return;
         }

         this.v(this.g.T(), this.W.R());
         var10000 = this.L;
      }

      label32: {
         if (var1 != null) {
            if (var10000) {
               this.J$void();
               return;
            }

            SwingUtilities.invokeLater(new FU_2(this));
            var2 = this;
            if (var1 == null) {
               break label32;
            }

            var10000 = this.L;
         }

         if (var10000) {
            this.J$void();
            return;
         }

         var2 = this;
      }

      var2.J$void();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void J$void() {
      String var10000 = Co2.U$String();
      Object var2 = z;
      synchronized (z){} // $VF: monitorenter 
      String var1 = var10000;

      try {
         Xb4 var3 = (Xb4)H.get(this.g);
         var10000 = (String)(var3);
         if (var1 != null) {
            if (var3 == this) {
               synchronized (this.g.S()) {
                  this.g.F(false);
                  this.g.y(false);
               }

               H.remove(this.g);
            }

            var10000 = (String)var2;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public void v(File var1, boolean var2) {
      ImageIcon var6;
      label40: {
         String var10000 = Co2.U$String();
         OQ3 var4 = this.W.p();
         String var3 = var10000;
         OQ3 var7 = var4;
         if (var3 != null) {
            if (var4 == null) {
               break label40;
            }

            var7 = var4;
         }

         if (var7.accept(var1)) {
            Dimension var5 = new Dimension(a(7878, 3744201369438838872L), a(7878, 3744201369438838872L));
            ImageIcon var8 = this.g.k();
            if (var3 != null) {
               var8 = var8 != null ? this.g.k() : var4.Y(var1, var5, var2);
            }

            label32: {
               label31: {
                  var6 = var8;
                  if (var3 != null) {
                     if (var6 == null) {
                        break label31;
                     }

                     this.z(var6);
                  }

                  if (var3 != null) {
                     break label32;
                  }
               }

               this.G(var1, var2);
            }

            if (var3 != null) {
               return;
            }
         }
      }

      this.G(var1, var2);
   }

   public void G(File var1, boolean var2) {
      boolean var6;
      label40: {
         String var10000 = Co2.U$String();
         String var4 = com.finalshell.core.Cz2.G(var1.getName(), false).toLowerCase();
         String var3 = var10000;
         var6 = var2;
         if (var3 != null) {
            if (!var2) {
               break label40;
            }

            var6 = DE.o.contains(var4);
         }

         if (var6) {
            ImageIcon var7 = this.g.k();
            if (var3 != null) {
               var7 = var7 != null ? this.g.k() : Xg2.l(var1.getAbsolutePath(), a(11701, 7336052200513950506L));
            }

            label32: {
               label31: {
                  ImageIcon var5 = var7;
                  if (var3 != null) {
                     if (var5 == null) {
                        break label31;
                     }

                     this.z(var5);
                  }

                  if (var3 != null) {
                     break label32;
                  }
               }

               this.p(var1);
            }

            if (var3 != null) {
               return;
            }
         }
      }

      this.p(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void z(ImageIcon var1) {
      String var2 = Co2.U$String();
      Wo4 var10000 = this;
      if (var2 != null) {
         if (this.L) {
            return;
         }

         var10000 = (Wo4)this.g.S();
      }

      Object var3 = var10000;
      synchronized (var10000) {
         var10000 = this.g;
         if (var2 != null) {
            if (this.g.Y()) {
               this.g.U(var1);
            }

            var10000 = (Wo4)(var3);
         }

         // $VF: monitorexit
      }

      boolean var8 = this.L;
      if (var2 != null) {
         if (this.L) {
            return;
         }

         var8 = this.t;
      }

      if (var8) {
         label65: {
            var3 = Xg2.J(var1);
            boolean var9 = this.L;
            if (var2 != null) {
               if (this.L) {
                  return;
               }

               var10000 = this.g;
               if (var2 == null) {
                  break label65;
               }

               var9 = this.g.Z();
            }

            if (!var9) {
               return;
            }

            var10000 = this.g;
         }

         var10000.C((ImageIcon)var3);
      }
   }

   public void p(File var1) {
      String var2 = Co2.U$String();
      if (!this.L) {
         ImageIcon var3 = com.finalshell.core.Cz2.a(var1, true, true);
         boolean var10000 = this.L;
         if (var2 != null) {
            if (this.L) {
               return;
            }

            var10000 = this.g.Y();
         }

         if (var2 != null) {
            if (var10000) {
               this.g.U(var3);
            }

            var10000 = this.L;
         }

         if (var2 != null) {
            if (var10000) {
               return;
            }

            var10000 = this.t;
         }

         if (var10000) {
            ImageIcon var4;
            label56: {
               var4 = com.finalshell.core.Cz2.a(var1, true, false);
               var10000 = this.L;
               if (var2 != null) {
                  if (this.L) {
                     return;
                  }

                  var6 = this.g;
                  if (var2 == null) {
                     break label56;
                  }

                  var10000 = this.g.Z();
               }

               if (!var10000) {
                  return;
               }

               var6 = this.g;
            }

            var6.C(var4);
         }
      }
   }

   public static void r(Co2 var0, Wo4 var1, boolean var2) {
      synchronized (var1.S()) {
         var1.F(true);
         var1.y(var2);
      }

      synchronized (z) {
         Xb4 var4 = new Xb4(var0, var1, var2);
         H.put(var1, var4);
         Q.submit(var4);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void G(Wo4 var0) {
      String var10000 = Co2.U$String();
      Object var2 = z;
      synchronized (z){} // $VF: monitorenter 
      String var1 = var10000;

      try {
         Xb4 var3 = (Xb4)H.get(var0);
         var10000 = (String)(var3);
         if (var1 != null) {
            if (var3 != null) {
               var3.P();
            }

            var10000 = (String)var0.S();
         }

         synchronized (var10000) {
            var0.U(null);
            var0.F(false);
            var0.C(null);
            var0.y(false);
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public static Wo4 z(Xb4 var0) {
      return var0.g;
   }

   public static Co2 X(Xb4 var0) {
      return var0.W;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32415;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      int var2;
      long[] var6;
      long var0 = 2092753370335783284L;
      var6 = new long[2];
      int var3 = 0;
      String var4 = "±B\u007fJ\u0080\u0006úl×\u008f\u0095\u0095é³I\u001e";
      int var5 = "±B\u007fJ\u0080\u0006úl×\u008f\u0095\u0095é³I\u001e".length();
      var2 = 0;

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

      a = var6;
      b = new Integer[2];
      Q = Executors.newSingleThreadExecutor(new PU());
      H = new WeakHashMap();
      z = new Object();
   }
}





