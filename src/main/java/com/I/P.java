package com.I;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;
import javax.swing.ImageIcon;

public class P {
   public static final w N = new w();
   private String k;
   private x o;

   public P(x var1) {
      this.l(var1);
   }

   public String z() {
      return this.k;
   }

   public void o(String var1) {
      this.k = var1;
   }

   public x u() {
      return this.o;
   }

   public void l(x var1) {
      this.o = var1;
   }

   public List h(x var1) {
      List var4;
      label14: {
         int[] var2 = x.w();
         x var10000 = var1;
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

   public x o$x(String var1) {
      return this.D(var1, this.u());
   }

   private x D(String var1, x var2) {
      int[] var10000 = x.w();
      Iterator var4 = var2.G().iterator();
      int[] var3 = var10000;

      while (true) {
         if (var4.hasNext()) {
            x var5 = (x)var4.next();
            x var7 = var5;
            if (var3 != null) {
               if (com.Cz_2.Z(var5.v()).equals(var1)) {
                  return var5;
               }

               var7 = this.D(var1, var5);
            }

            x var6 = var7;
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

   public List t(String var1, com.On_2 var2) {
      return this.W(var1.toLowerCase(), this.u(), var2, new ArrayList());
   }

   private List W(String var1, x var2, com.On_2 var3, List var4) {
      int[] var5 = x.w();
      x var10000 = var2;
      if (var5 != null) {
         label31:
         if (var2.v().toLowerCase().contains(var1)) {
            label48: {
               com.On_2 var8 = var3;
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
            x var7 = (x)var6.next();
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

   public x w(Class var1) {
      String[] var3 = com.Kp_2.n(var1);
      int[] var10000 = x.w();
      String var4 = com.Kp_2.G(var1);
      int[] var2 = var10000;
      int var5 = 0;
      x var6 = this.u();

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
      String[] var4 = com.Kp_2.K(var1);
      int[] var10000 = x.w();
      x var5 = this.u();
      String[] var6 = var4;
      int var7 = var4.length;
      int[] var3 = var10000;
      int var8 = 0;

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
      if (com.ky_4.F() != null) {
         x.q(new int[2]);
      }
   }

   public void Q(Class var1, ImageIcon var2) {
      int[] var10000 = x.w();
      x var4 = this.w(var1);
      int[] var3 = var10000;
      x var5 = var4;
      if (var3 != null) {
         if (var4 == null) {
            return;
         }

         var5 = var4;
      }

      var5.n(var2);
   }

   public InputStream w(x var1) throws IOException {
      return new ZipFile(this.z()).getInputStream(var1.H());
   }
}





