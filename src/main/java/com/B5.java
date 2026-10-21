package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.awt.Point;

@XStreamAlias("Line")
public class B5 {
   @XStreamAsAttribute
   public int L;
   @XStreamAsAttribute
   public int I;
   @XStreamAsAttribute
   public int z;
   @XStreamAsAttribute
   public int A;

   public B5() {
   }

   public B5(int var1, int var2, int var3, int var4) {
      this.L = var1;
      this.I = var2;
      this.z = var3;
      this.A = var4;
   }

   public B5(Point var1, Point var2) {
      pI_3.v();
      super();
      this.L = var1.x;
      this.I = var1.y;
      this.z = var2.x;
      this.A = var2.y;
      if (com.ky_4.F() != null) {
         pI_3.t(new String[5]);
      }
   }

   public B5(com.B5 var1) {
      String[] var10000 = pI_3.v();
      this.L = var1.L;
      this.I = var1.I;
      this.z = var1.z;
      String[] var2 = var10000;
      this.A = var1.A;
      if (var2 != null) {
         com.ky_4.K(new String[5]);
      }
   }

   public double r() {
      return (double)this.L;
   }

   public void R(int var1) {
      this.L = var1;
   }

   public double Q() {
      return (double)this.I;
   }

   public void Z(int var1) {
      this.I = var1;
   }

   public double e() {
      return (double)this.z;
   }

   public void d(int var1) {
      this.z = var1;
   }

   public double b() {
      return (double)this.A;
   }

   public void r(int var1) {
      this.A = var1;
   }

   public void H(Point var1) {
      this.L = var1.x;
      this.I = var1.y;
   }

   public void g(Point var1) {
      this.z = var1.x;
      this.A = var1.y;
   }
}





