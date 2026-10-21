package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.net.DatagramPacket;
import java.net.InetAddress;

public abstract class WC {
   public short W = Yh2.i;
   public short T = 0;
   public DatagramPacket g;
   public int l;
   public int H;
   public static Ky4[] d;

   public int y() {
      return this.T;
   }

   public int M() {
      return this.W;
   }

   public DatagramPacket H() {
      return this.g;
   }

   public void K(InetAddress var1) {
      this.g.setAddress(var1);
   }

   public void S(int var1) {
      this.g.setPort(var1);
   }

   public int w() {
      return this.l;
   }

   public void Q(int var1) {
      this.l = var1;
   }

   public int Z() {
      return this.H;
   }

   public void u(int var1) {
      this.H = var1;
   }

   public static void X(Ky4[] var0) {
      d = var0;
   }

   public static Ky4[] U() {
      return d;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (U() == null) {
         X(new Ky4[4]);
      }
   }
}





