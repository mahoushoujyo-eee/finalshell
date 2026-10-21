package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Du4 implements Fs2 {
   public Socket R;
   public Socket N;
   public DataInputStream r;
   public DataOutputStream x;
   public DataInputStream d;
   public DataOutputStream z;
   public Object C = new Object();
   public Object Y = new Object();
   public Object q = new Object();
   public Object G = new Object();
   public ArrayList m = new ArrayList();
   public ArrayList w = new ArrayList();
   public byte[] D = new byte[0];
   public int c = 1;
   public int E = 1;
   public boolean t = false;
   public boolean p = false;
   public boolean j = false;
   public boolean s = false;
   public boolean o = false;
   public boolean h = false;
   public boolean L = false;
   public String H;
   public String e;
   public static int K;
   public Random F;
   public long U;
   public static int Z;
   public boolean B;
   public long i;
   public static ExecutorService k;
   public Socket O;
   public Socket J;
   public int W;
   public String M;
   public static String a;

   static {
      __vfClinit__();
   }

   public Du4() {
      this.H = a;
      this.e = "";
      this.F = new Random();
      this.B = false;
      this.i = System.currentTimeMillis();
      this.W = -1;
      this.M = null;
   }

   public void E(Socket var1) {
      this.N = var1;
   }

   public void c(long var1) {
      this.U = var1;
   }

   public boolean K() {
      return this.B;
   }

   public long n() {
      return this.i;
   }

   public void I() {
      this.i = System.currentTimeMillis();
   }

   public long i() {
      return this.U;
   }

   public void y() {
      this.v(true);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void v(boolean var1) {
      Du4 var10000;
      Ky4[] var2 = Qm2.J();

      label41: {
         IOException var8;
         label40: {
            label46: {
               try {
                  var10000 = this;
                  if (var2 == null) {
                     break label46;
                  }

                  if (this.B) {
                     return;
                  }
               } catch (IOException var7) {
                  throw a(var7);
               }

               this.B = true;

               try {
                  var10000 = this;
               } catch (IOException var6) {
                  var8 = var6;
                  boolean var10001 = false;
                  break label40;
               }
            }

            try {
               var10000.R.close();
               break label41;
            } catch (IOException var5) {
               var8 = var5;
               boolean var9 = false;
            }
         }

         IOException var3 = var8;
         var3.printStackTrace();
      }

      if (var1) {
         try {
            this.N.close();
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }
   }

   public void e() {
      this.y();
   }

   public void R() {
      com.finalshell.task.Lq4 var1 = new com.finalshell.task.Lq4(this);
      k.execute(var1);
   }

   @Override
   public void x() {
   }

   public Socket m() {
      return this.O;
   }

   public void d(Socket var1) {
      this.O = var1;
   }

   public Socket z() {
      return this.J;
   }

   public void w(Socket var1) {
      this.J = var1;
   }

   public int U() {
      return this.W;
   }

   public void n(int var1) {
      this.W = var1;
   }

   public String p() {
      return this.M;
   }

   public void Y(String var1) {
      this.M = var1;
   }

   @Override
   public void V(String var1) {
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0012QY;p6>\u0012QY;".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 52;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 52;
         var10006 = var0;
      } else {
         var6 = 52;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            K = 0;
            Z = 0;
            k = Executors.newCachedThreadPool();
            return;
         }

         var10005 = var10003;
         var10 = 52;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 6;
            case 1 -> 69;
            case 2 -> 77;
            case 3 -> 47;
            case 4 -> 100;
            case 5 -> 34;
            default -> 42;
         });
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
               K = 0;
               Z = 0;
               k = Executors.newCachedThreadPool();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





