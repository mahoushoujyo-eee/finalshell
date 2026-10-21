package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;
import javax.swing.ImageIcon;

public class P2 {
   public static com.finalshell.ui.model.W N;
   public String k;
   public X2 o;

   public P2(X2 var1) {
      this.l(var1);
   }

   public String z() {
      return this.k;
   }

   public void o$void(String var1) {
      this.k = var1;
   }

   public X2 u() {
      return this.o;
   }

   public void l(X2 var1) {
      this.o = var1;
   }

   public List h(X2 var1) {
      List var4;
      label14: {
         int[] var2 = X2.w();
         X2 var10000 = var1;
         if (var2 != null) {
            if (var1 != null) {
               var4 = var1.G();
               break label14;
            }

            var10000 = this.u();
         }

         var4 = var10000.G();
      }

      List var3 = var4;
      Collections.sort(var3, N);
      return var3;
   }

   public X2 o$x(String var1) {
      return this.D(var1, this.u());
   }

   public X2 D(String var1, X2 var2) {
      X2 var8;
      int[] var10000 = X2.w();
      Iterator var4 = var2.G().iterator();
      int[] var3 = var10000;

      while (true) {
         if (var4.hasNext()) {
            X2 var5 = (X2)var4.next();
            X2 var7 = var5;
            if (var3 != null) {
               if (Cz2.Z(var5.v()).equals(var1)) {
                  return var5;
               }

               var7 = this.D(var1, var5);
            }

            X2 var6 = var7;
            var8 = var6;
            if (var3 == null) {
               break;
            }

            if (var6 != null) {
               var8 = var6;
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         return null;
      }

      return var8;
   }

   public List f(String var1) {
      return this.t(var1.toLowerCase(), null);
   }

   public List t(String var1, On2 var2) {
      return this.W(var1.toLowerCase(), this.u(), var2, new ArrayList());
   }

   public List W(String var1, X2 var2, On2 var3, List var4) {
      List var9;
      int[] var5 = X2.w();
      X2 var10000 = var2;
      if (var5 != null) {
         label31:
         if (var2.v().toLowerCase().contains(var1)) {
            label48: {
               On2 var8 = var3;
               if (var5 != null) {
                  if (var3 == null) {
                     break label48;
                  }

                  var8 = var3;
               }

               if (var5 == null || !var8.n(var2)) {
                  break label31;
               }
            }

            var4.add(var2);
         }

         var10000 = var2;
      }

      Iterator var6 = var10000.G().iterator();

      while (true) {
         if (var6.hasNext()) {
            X2 var7 = (X2)var6.next();
            var9 = this.W(var1, var7, var3, var4);
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               continue;
            }
         }

         var9 = var4;
         break;
      }

      return var9;
   }

   public X2 w(java.lang.Class var1) {
      String[] var3 = Kp2.n(var1);
      int[] var10000 = X2.w();
      String var4 = Kp2.G(var1);
      int[] var2 = var10000;
      int var5 = 0;
      X2 var6 = this.u();

      while (var6 != null) {
         label18: {
            if (var5 < var3.length) {
               var6 = var6.q(var3[var5]);
               if (var2 != null) {
                  break label18;
               }
            }

            var6 = var6.q(var4);
            if (var2 != null) {
               break;
            }
         }

         var5++;
         if (var2 == null) {
            break;
         }
      }

      return var6;
   }

   public void W(Package var1, ImageIcon var2) {
      this.I(var1.getName(), var2);
   }

   public void I(String var1, ImageIcon var2) {
      X2 var10;
      int var8;
      String[] var4 = Kp2.K(var1);
      int[] var10000 = X2.w();
      X2 var5 = this.u();
      String[] var6 = var4;
      int var7 = var4.length;
      int[] var3 = var10000;
      var8 = 0;

      while (true) {
         if (var8 < var7) {
            String var9 = var6[var8];
            var10 = var5;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               if (var5 == null) {
                  return;
               }

               var10 = var5.q(var9);
            }

            var5 = var10;
            if (var3 == null) {
               return;
            }

            var8++;
            if (var3 != null) {
               continue;
            }
         }

         var10 = var5;
         break;
      }

      var10.n(var2);
      if (Ky4.F$arrString() != null) {
         X2.q(new int[2]);
      }
   }

   public void Q(java.lang.Class var1, ImageIcon var2) {
      int[] var10000 = X2.w();
      X2 var4 = this.w(var1);
      int[] var3 = var10000;
      X2 var5 = var4;
      if (var3 != null) {
         if (var4 == null) {
            return;
         }

         var5 = var4;
      }

      var5.n(var2);
   }

   public InputStream w(X2 var1) throws IOException {
      return new ZipFile(this.z()).getInputStream(var1.H());
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      N = new com.finalshell.ui.model.W();
   }
}





