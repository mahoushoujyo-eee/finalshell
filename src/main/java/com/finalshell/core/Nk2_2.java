package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.net.DatagramPacket;
import java.net.InetAddress;

public abstract class Nk2_2 {
   protected short L = 0;
   protected short R;
   protected DatagramPacket o;
   public static String[] D;

   public Nk2_2() {
      String[] var10000 = s();
      this.R = 0;
      String[] var1 = var10000;
      if (var1 != null) {
         Ky4.K(new String[4]);
      }
   }

   public int p() {
      return this.R;
   }

   public int G() {
      return this.L;
   }

   public DatagramPacket k() {
      return this.o;
   }

   public void s(InetAddress var1) {
      this.o.setAddress(var1);
   }

   public void v(int var1) {
      this.o.setPort(var1);
   }

   public static void f(String[] var0) {
      D = var0;
   }

   public static String[] s() {
      return D;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (s() != null) {
         f(new String[3]);
      }
   }
}





