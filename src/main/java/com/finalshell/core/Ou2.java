package com.finalshell.core;

import com.finalshell.crypto.PingMessageR;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

public class Ou2 {
   public InetAddress C;
   public int y;
   public boolean G = false;
   public Thread v;
   public Random j = new Random();
   public int H;
   public InetAddress K;
   public int V;
   public PingMessageR B;
   public boolean c = false;
   public boolean F = false;
   public boolean p = false;
   public long P = 0L;
   public long N;
   public boolean A = false;
   public int U = 0;
   public boolean D = false;
   public boolean u = false;

   public Ou2() {
      this.H = this.j.nextInt();
      this.P = System.currentTimeMillis();
   }

   public boolean i() {
      return this.u;
   }

   public void o(boolean var1) {
      this.u = var1;
   }

   public boolean V() {
      return this.D;
   }

   public void X(boolean var1) {
      this.D = var1;
   }

   public long M() {
      return this.P;
   }

   public void q(long var1) {
      this.P = var1;
   }

   public boolean w() {
      String[] var1 = PingMessageR.N();
      int var10000 = (this.y()) ? 1 : 0;
      if (var1 != null) {
         var10000 = var10000 != 0 ? 0 : 1;
      }

      int var10001 = (this.p) ? 1 : 0;
      if (var1 != null) {
         var10001 = this.p ? 0 : 1;
      }

      var10000 &= var10001;
      long var5;
      var10001 = (var5 = System.currentTimeMillis() - this.N - (long)Yh2.U) == 0L ? 0 : (var5 < 0L ? -1 : 1);
      if (var1 != null) {
         var10001 = var10001 > 0 ? 1 : 0;
      }

      return (boolean)((var10000 & var10001) != 0);
   }

   public void m() {
      this.p = false;
   }

   public boolean b() {
      return this.p;
   }

   public void D(String var1, int var2) {
      try {
         this.C = InetAddress.getByName(var1);
      } catch (UnknownHostException var4) {
         var4.printStackTrace();
      }

      this.y = var2;
   }

   public void u(String var1, int var2) {
      try {
         this.K = InetAddress.getByName(var1);
      } catch (UnknownHostException var4) {
         var4.printStackTrace();
      }

      this.V = var2;
   }

   public void A(InetAddress var1, int var2) {
      this.K = var1;
      this.V = var2;
   }

   public boolean y() {
      return this.c;
   }

   public void A(PingMessageR var1) {
      this.B = var1;
   }

   public void x() {
      this.G = false;
      this.v.interrupt();
   }
}





