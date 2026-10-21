package com.finalshell.core;

import com.finalshell.ui.model.Rk4;

public class C_1 {
   public Rk4 n;
   public int o;
   public int f;
   public E_2 l;

   public C_1() {
      this.n = Rk4.fill;
   }

   public C_1(int var1, int var2) {
      this.n = Rk4.align;
      this.o = var1;
      this.f = var2;
   }

   public C_1(E_2 var1) {
      this.n = Rk4.custom;
      this.l = var1;
   }

   public C_1(Rk4 var1, int var2, int var3, E_2 var4) {
      this.n = var1;
      this.o = var2;
      this.f = var3;
      this.l = var4;
   }

   public Rk4 c() {
      return this.n;
   }

   public void Q(Rk4 var1) {
      this.n = var1;
   }

   public int r() {
      return this.o;
   }

   public void l(int var1) {
      this.o = var1;
   }

   public int X() {
      return this.f;
   }

   public void G(int var1) {
      this.f = var1;
   }

   public E_2 Q() {
      return this.l;
   }

   public void a(E_2 var1) {
      this.l = var1;
   }
}





