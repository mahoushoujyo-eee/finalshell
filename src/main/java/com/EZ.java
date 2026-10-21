package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.awt.Rectangle;
import java.io.Serializable;

@XStreamAlias("NinePatchInterval")
public final class EZ implements Serializable, Cloneable {
   @XStreamAsAttribute
   private transient String E;
   @XStreamAsAttribute
   private boolean Y;
   @XStreamAsAttribute
   private int v;
   @XStreamAsAttribute
   private int P;
   private static final String a;

   public EZ() {
      this(0);
   }

   public EZ(int var1) {
      this(var1, var1);
   }

   public EZ(int var1, boolean var2) {
      this(var1, var1, var2);
   }

   public EZ(int var1, int var2) {
      this(var1, var2, true);
   }

   public EZ(int var1, int var2, boolean var3) {
      this.k();
      this.i(var3);
      this.z(var1);
      this.T(var2);
   }

   public String P() {
      return this.E;
   }

   public void Z(String var1) {
      this.E = var1;
   }

   public void k() {
      this.E = NE.E(a);
   }

   public boolean C() {
      return this.Y;
   }

   public void i(boolean var1) {
      this.Y = var1;
   }

   public int x() {
      return this.v;
   }

   public void z(int var1) {
      this.v = var1;
   }

   public int f() {
      return this.P;
   }

   public void T(int var1) {
      this.P = var1;
   }

   public boolean s(EZ var1) {
      return new Rectangle(this.x(), 0, this.f() - this.x(), 1).intersects(new Rectangle(var1.x(), 0, var1.f() - var1.x(), 1));
   }

   public EZ R() {
      EZ var1 = new EZ();
      var1.Z(this.P());
      var1.i(this.C());
      var1.z(this.x());
      var1.T(this.f());
      return var1;
   }

   public int s() {
      return this.f() - this.x();
   }

   public boolean Y(EZ var1) {
      String var2 = pF_3.c();
      EZ var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return false;
         }

         var10000 = this;
      }

      boolean var3 = var10000.P().equals(var1.P());
      return var2 != null ? var3 : var3;
   }

   @Override
   public boolean equals(Object var1) {
      String var2 = pF_3.c();
      Object var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      boolean var4 = var10000 instanceof EZ;
      if (var2 != null) {
         return var4;
      } else if (var4) {
         EZ var3 = (EZ)var1;
         int var5 = this.C();
         int var10001 = var3.C();
         if (var2 == null) {
            if (var5 != var10001) {
               return (boolean)0;
            }

            var5 = this.x();
            var10001 = var3.x();
         }

         if (var2 == null) {
            if (var5 != var10001) {
               return (boolean)0;
            }

            var5 = this.f();
            if (var2 != null) {
               return (boolean)var5;
            }

            var10001 = var3.f();
         }

         return (boolean)(var5 == var10001 ? 1 : 0);
      } else {
         return false;
      }
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return this.R();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "Ny/".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 16;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 16;
         var10006 = var0;
      } else {
         var6 = 16;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 16;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 16;
               break;
            case 1:
               var23 = 57;
               break;
            case 2:
               var23 = 118;
               break;
            case 3:
               var23 = 55;
               break;
            case 4:
               var23 = 64;
               break;
            case 5:
               var23 = 93;
               break;
            default:
               var23 = 39;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





