package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.net.DatagramPacket;
import java.net.InetAddress;

public abstract class Vb2 {
   protected short V = Cs2.a;
   protected short E = 0;
   protected DatagramPacket O;
   public int p;
   public int x;
   public static Ky4[] h;

   public int V() {
      return this.E;
   }

   public int M() {
      return this.V;
   }

   public DatagramPacket S() {
      return this.O;
   }

   public void D(InetAddress var1) {
      this.O.setAddress(var1);
   }

   public void A(int var1) {
      this.O.setPort(var1);
   }

   public int J() {
      return this.p;
   }

   public void x(int var1) {
      this.p = var1;
   }

   public int w() {
      return this.x;
   }

   public void T(int var1) {
      this.x = var1;
   }

   public static void x(Ky4[] var0) {
      h = var0;
   }

   public static Ky4[] U() {
      return h;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (U() == null) {
         x(new Ky4[2]);
      }
   }
}





