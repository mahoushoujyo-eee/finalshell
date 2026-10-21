package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.KeyStroke;

@XStreamAlias("HotkeyData")
public class Cs_2 implements Serializable, Cloneable {
   @XStreamAsAttribute
   protected boolean A;
   @XStreamAsAttribute
   protected boolean e;
   @XStreamAsAttribute
   protected boolean L;
   @XStreamAsAttribute
   protected Integer W;
   protected transient Integer O;
   private static final long a;

   public Cs_2() {
      this.A = false;
      this.e = false;
      this.L = false;
      this.W = null;
      this.O = null;
   }

   public Cs_2(KeyEvent var1) {
      this.A = com.FN.m(var1);
      this.e = com.FN.O(var1);
      this.L = com.FN.y(var1);
      this.W = var1.getKeyCode();
      this.O = null;
   }

   public Cs_2(Integer var1) {
      this.A = false;
      this.e = false;
      this.L = false;
      this.W = var1;
      this.O = null;
   }

   public Cs_2(boolean var1, boolean var2, boolean var3, Integer var4) {
      this.A = var1;
      this.e = var2;
      this.L = var3;
      this.W = var4;
      this.O = null;
   }

   public Cs_2(KeyStroke var1) {
      this.z(var1.getModifiers());
      this.W = var1.getKeyCode();
      this.O = null;
   }

   public boolean I() {
      return this.A;
   }

   public void s(boolean var1) {
      this.A = var1;
      this.O = null;
   }

   public boolean p() {
      return this.e;
   }

   public void M(boolean var1) {
      this.e = var1;
      this.O = null;
   }

   public boolean w() {
      return this.L;
   }

   public void x(boolean var1) {
      this.L = var1;
      this.O = null;
   }

   public Integer c() {
      return this.W;
   }

   public void D(Integer var1) {
      this.W = var1;
      this.O = null;
   }

   public boolean g() {
      return this.W != null;
   }

   public boolean J(KeyEvent var1) {
      String[] var2 = GR.I();
      boolean var10000 = this.q(var1);
      if (var2 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.v(var1);
      }

      return var2 == null ? var10000 : var10000;
   }

   public boolean q(KeyEvent var1) {
      String[] var2 = GR.I();
      boolean var10000 = com.FN.i(var1);
      boolean var10001 = this.A;
      if (var2 != null) {
         if (var10000 != this.A) {
            return false;
         }

         var10000 = com.FN.O(var1);
         var10001 = this.e;
      }

      if (var2 != null) {
         if (var10000 != var10001) {
            return false;
         }

         var10000 = com.FN.y(var1);
         if (var2 == null) {
            return var10000;
         }

         var10001 = this.L;
      }

      return var10000 == var10001;
   }

   public boolean v(KeyEvent var1) {
      String[] var2 = GR.I();
      int var10000 = var1.getKeyCode();
      if (var2 != null) {
         var10000 = var10000 == this.W ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public KeyStroke U() {
      return KeyStroke.getKeyStroke(this.W, this.X());
   }

   public int X() {
      String[] var1 = GR.I();
      int var10000 = this.A;
      if (var1 != null) {
         var10000 = this.A ? com.FN.I() : 0;
      }

      int var10001 = this.e;
      if (var1 != null) {
         var10001 = this.e ? (int)a : 0;
      }

      var10000 |= var10001;
      var10001 = this.L;
      if (var1 != null) {
         var10001 = this.L ? 1 : 0;
      }

      return var10000 | var10001;
   }

   public void z(int var1) {
      this.A = com.FN.k(var1);
      this.e = com.FN.g(var1);
      this.L = com.FN.J(var1);
   }

   @Override
   public boolean equals(Object var1) {
      String[] var2 = GR.I();
      Object var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return (boolean)0;
         }

         var10000 = var1;
      }

      int var3 = var10000 instanceof com.Cs_2;
      if (var2 != null) {
         if (var3 == 0) {
            return (boolean)0;
         }

         var3 = var1.hashCode();
      }

      if (var2 == null) {
         return (boolean)var3;
      } else {
         return (boolean)(var3 == this.hashCode() ? 1 : 0);
      }
   }

   @Override
   public String toString() {
      return com.FN.r(this);
   }

   @Override
   public int hashCode() {
      String[] var1 = GR.I();
      Integer var10000 = this.O;
      if (var1 != null) {
         if (this.O == null) {
            this.O = this.toString().hashCode();
         }

         var10000 = this.O;
      }

      return var10000;
   }

   protected com.Cs_2 D() {
      return new com.Cs_2(this.I(), this.p(), this.w(), this.c());
   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      return this.D();
   }

   static {
      long var0 = 3590876076870950547L;
      long var10002 = 8105155492610268827L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





