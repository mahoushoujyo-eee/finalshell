package com.finalshell.ui.model;

import com.finalshell.core.AL_2;
import com.finalshell.core.FN;
import com.finalshell.core.Km4;
import com.finalshell.core.Nx4;
import com.finalshell.core.P9;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@XStreamAlias("GradientData")
public class Ed2 implements Serializable, Cloneable, Km4 {
   public static transient Ho2 u;
   @XStreamImplicit(
      itemFieldName = "Color"
   )
   public List a;

   public Ed2() {
      this.a = new ArrayList();
   }

   public Ed2(List var1) {
      this.h(var1);
   }

   public boolean Z$boolean(float var1) {
      int var10000 = Nx4.c$int();
      Iterator var3 = this.a.iterator();
      int var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            PV var4 = (PV)var3.next();
            float var6;
            var10000 = (var6 = var4.I() - var1) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
            if (var2 == 0) {
               break;
            }

            if (var2 == 0) {
               return var10000 != 0;
            }

            if (!var10000) {
               return 1 != 0;
            }

            if (var2 != 0) {
               continue;
            }
         }

         var10000 = 0;
         break;
      }

      return var10000 != 0;
   }

   public void H(PV var1) {
      this.a.add(var1);
      this.u();
   }

   public void W(float var1, Color var2) {
      this.a.add(new PV(var1, var2));
      this.u();
   }

   public void W(PV var1) {
      this.a.remove(var1);
      this.u();
   }

   public List X() {
      this.u();
      return this.a;
   }

   public void h(List var1) {
      this.a = var1;
      this.u();
   }

   public float[] l() {
      int var10000 = Nx4.c$int();
      this.u();
      float[] var2 = new float[this.a.size()];
      int var3 = 0;
      int var1 = var10000;

      while (true) {
         if (var3 < this.a.size()) {
      int var4;
            var4 = var2;
            if (var1 == 0) {
               break;
            }

            var2[var3] = ((PV)this.a.get(var3)).I();
            var3++;
            if (var1 != 0) {
      int var4;
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   public Color[] H() {
      int var10000 = Nx4.R();
      this.u();
      Color[] var2 = new Color[this.a.size()];
      int var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < this.a.size()) {
            var4 = var2;
            if (var1 != 0) {
               break;
            }

            var2[var3] = ((PV)this.a.get(var3)).N();
            var3++;
            if (var1 == 0) {
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   public int C$int() {
      return this.a.size();
   }

   public PV B(int var1) {
      return (PV)this.a.get(var1);
   }

   public float h(int var1) {
      return this.B(var1).I();
   }

   public Color d(int var1) {
      return this.B(var1).N();
   }

   public PV L() {
      int var1 = Nx4.c$int();
      Object var10000 = this;
      if (var1 != 0) {
         if (this.C$int() <= 0) {
            return null;
         }

         var10000 = this.a.get(0);
      }

      return (PV)var10000;
   }

   public PV C$PV() {
      int var1 = Nx4.R();
      Object var10000 = this;
      if (var1 == 0) {
         if (this.C$int() <= 0) {
            return null;
         }

         var10000 = this.a.get(this.C$int() - 1);
      }

      return (PV)var10000;
   }

   public Color Z$Color(float var1) {
      int var2 = Nx4.R();
      int var10000 = this.C$int();
      if (var2 == 0) {
         if (var10000 == 0) {
            return null;
         }

         float var13;
         var10000 = (var13 = var1 - this.L().I()) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      }

      if (var2 == 0) {
         if (var10000 <= 0) {
            return FN.q(this.B(0).N());
         }

         float var14;
         var10000 = (var14 = var1 - this.C$PV().I()) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
      }

      if (var2 == 0) {
         if (var10000 >= 0) {
            return FN.q(this.C$PV().N());
         }

         var10000 = -1;
      }

      int var3 = var10000;
      int var4 = 0;

      while (true) {
         label50:
         if (var4 < this.C$int()) {
            var11 = this.h(var4);
            if (var2 != 0) {
               break;
            }

            label47: {
               float var15;
               var10000 = (var15 = var11 - var1) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
               if (var2 == 0) {
                  if (var10000 <= 0) {
                     break label47;
                  }

                  var10000 = var4;
               }

               var3 = var10000;
               if (var2 == 0) {
                  break label50;
               }
            }

            var4++;
            if (var2 == 0) {
               continue;
            }
         }

         var11 = this.h(var3 - 1);
         break;
      }

      float var10 = var11;
      float var5 = var1 - var10;
      float var6 = this.h(var3) - var10;
      float var7 = var5 / var6;
      Color var8 = this.d(var3 - 1);
      Color var9 = this.d(var3);
      return P9.N(var8, var9, var7);
   }

   public void u() {
      Collections.sort(this.a, u);
   }

   @Override
   public boolean equals(Object var1) {
      int var2 = Nx4.R();
      Object var10000 = var1;
      if (var2 == 0) {
         if (var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      if (var2 == 0) {
         if (!(var10000 instanceof Ed2)) {
            return false;
         }

         var10000 = var1;
      }

      Ed2 var3 = (Ed2)var10000;
      int var5 = this.C$int();
      if (var2 == 0) {
         if (var5 != var3.C$int()) {
            return false;
         }

         var5 = 0;
      }

      int var4 = var5;

      while (true) {
         if (var4 < this.C$int()) {
            var6 = this.B(var4).equals(var3.B(var4));
            if (var2 != 0) {
               break;
            }

            if (var2 != 0) {
               return var6;
            }

            if (!var6) {
               return false;
            }

            var4++;
            if (var2 == 0) {
               continue;
            }
         }

         var6 = true;
         break;
      }

      return var6;
   }

   public Ed2 Y() {
      return new Ed2(AL_2.y(this.a));
   }

   public static Ed2 r() {
      Ed2 var0 = new Ed2();
      var0.W(0.0F, Color.RED);
      var0.W(0.25F, Color.YELLOW);
      var0.W(0.5F, Color.GREEN);
      var0.W(0.75F, Color.CYAN);
      var0.W(1.0F, Color.BLUE);
      return var0;
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return this.Y();
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      u = new Ho2();
   }
}






