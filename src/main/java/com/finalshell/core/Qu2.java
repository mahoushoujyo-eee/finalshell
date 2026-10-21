package com.finalshell.core;

import com.finalshell.crypto.PingMessageReceiver;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Qu2 {
   public InetAddress s;
   public String M;
   public int F;
   public InetAddress l;
   public int r;
   public int a;
   public B2 P;
   public static Random U;
   public PingMessageReceiver m;
   public DatagramSocket T;
   public boolean n = true;
   public int y;
   public FO K;
   public int B;
   public HashMap b;
   public HashMap c;
   public boolean V;
   public static int Y;
   public static int w;
   public int q;
   public Object t;
   public HashSet A;
   public ArrayList p;
   public boolean N;
   public Object f;
   public static long d;

   static {
      __vfClinit__();
   }

   public Qu2(PingMessageReceiver var1, FO var2, InetAddress var3, int var4, int var5, B2 var6) {
      this.y = (int)d;
      this.B = -1;
      this.b = new HashMap();
      this.c = new HashMap();
      this.V = false;
      this.q = -1;
      this.t = new Object();
      this.A = new HashSet();
      this.p = new ArrayList();
      this.N = false;
      this.f = new Object();
      this.m = var1;
      this.K = var2;
      this.l = var3;
      this.r = var4;
      this.a = var5;
      this.P = var6;

      try {
         this.T = new DatagramSocket();
         this.T.setSoTimeout(this.y);
      } catch (SocketException var8) {
         var8.printStackTrace();
      }

      PingMessageReceiver.U.execute(new com.finalshell.task.Z6(this));
   }

   public void T() {
      String[] var1 = PingMessageReceiver.N();
      Qu2 var10000 = this;
      if (var1 != null) {
         if (this.V) {
            return;
         }

         this.T.close();
         this.n = false;
         var10000 = this;
      }

      var10000.T.close();
   }

   public void K(DatagramPacket var1) {
      this.B++;
      byte[] var2 = new byte[var1.getLength()];
      System.arraycopy(var1.getData(), 0, var2, 0, var1.getLength());
      this.W(var2, this.B);
      this.m.e.p(this, this.B);
   }

   public void O(String var1, int var2) {
      this.M = var1;
      this.F = var2;
   }

   public void W(byte[] var1, int var2) {
      label13: {
         String[] var10000 = PingMessageReceiver.N();
         long var4 = System.nanoTime();
         String[] var3 = var10000;
         Wr2 var6 = new Wr2(this.a, this.m.q, var2, var1);
         this.c.put(var2, var6);
         Qu2 var8 = this;
         byte[] var10001 = var6.B();
         if (var3 != null) {
            this.k(var10001);
            if (!Yh2.Y) {
               break label13;
            }

            var8 = this;
            var10001 = var6.B();
         }

         var8.k(var10001);
      }

      Uy2 var7 = new Uy2("", U.nextLong(), var1.length, Uy2.T);
      PingMessageReceiver.V(var7);
   }

   public void k(int var1) {
      Wr2 var2 = (Wr2)this.c.get(var1);
      if (var2 != null) {
         this.W(var2.M(), var2.i());
      }
   }

   public void H() {
      We2 var1 = new We2(this.a, this.m.q, this.M, this.F);
      this.k(var1.f());
   }

   public void k(byte[] var1) {
      DatagramPacket var2 = new DatagramPacket(var1, var1.length);
      var2.setAddress(this.l);
      var2.setPort(this.r);

      try {
         this.P.P(var2);
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   public void J(Wr2 var1) {
      DatagramPacket var2 = new DatagramPacket(var1.M(), var1.M().length);
      var2.setAddress(this.s);
      var2.setPort(this.F);

      try {
         this.T.send(var2);
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Could not inline inconsistent finally blocks
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void D(DatagramPacket var1) {
      Qu2 var21;
      String[] var10000 = PingMessageReceiver.N();
      Object var3 = this.t;
      synchronized (this.t){} // $VF: monitorenter 
      String[] var2 = var10000;

      try {
         int var4 = CA3.I(var1);
         int var5 = CA3.m(var1);
         if (var2 != null) {
            label148:
            if (var4 == Yh2.i) {
               int var18 = var5;
               short var10001 = D6.nw;
               if (var2 != null) {
                  if (var5 == D6.nw) {
                     We2 var6 = new We2(var1);
                     PingMessageReceiver.U.execute(new com.finalshell.task.BC(this, var6));
                     if (var2 != null) {
                        break label148;
                     }
                  }

                  var18 = var5;
                  var10001 = D6.nr;
               }

               if (var2 != null) {
                  if (var18 == var10001) {
                     break label148;
                  }

                  var18 = var5;
                  var10001 = D6.L;
               }

               if (var2 != null) {
                  if (var18 == var10001) {
                     Wr2 var14 = new Wr2(var1);
                     int var7 = var14.i();
                     Qu2 var19 = this;
                     if (var2 != null) {
                        label170:
                        if (!this.A.contains(var7)) {
                           label198: {
                              int var20 = var1.getLength();
                              if (var2 != null) {
                                 if (var20 > w) {
                                    w = var1.getLength();
                                 }

                                 var21 = this;
                                 if (var2 == null) {
                                    break label198;
                                 }

                                 var20 = (this.N) ? 1 : 0;
                              }

                              if (var20 == 0) {
                                 Qu2 var22 = this;
                                 if (var2 != null) {
                                    if (this.m.g == 2) {
                                       Qu2 var23 = this;
                                       if (var2 != null) {
                                          if (this.s == null) {
                                             synchronized (this.f) {
                                                this.p.add(var14);
                                             }

                                             // $VF: monitorexit
                                             return;
                                          }

                                          this.X();
                                          var23 = this;
                                       }

                                       var23.J(var14);
                                       if (var2 != null) {
                                          break label170;
                                       }
                                    }

                                    var22 = this;
                                 }

                                 var22.K.a(var14.M());
                                 if (var2 != null) {
                                    break label170;
                                 }
                              }

                              this.b.put(var7, var14);
                              var21 = this;
                           }

                           var21.b();
                        }

                        var19 = this;
                     }

                     var19.m.T.d(this, var7);
                     if (var2 != null) {
                        break label148;
                     }
                  }

                  var18 = var5;
                  var10001 = D6.T;
               }

               if (var18 == var10001) {
                  WA var15 = new WA(var1);
                  ArrayList var16 = var15.Z();
                  int var17 = 0;
                  if (var2 == null || var17 < var16.size()) {
                     do {
                        int var9 = (Integer)var16.get(var17);
                        this.c.remove(var9);
                     } while (++var17 < var16.size());
                  }
               }
            }

            // $VF: monitorexit
         }
      } catch (Throwable var13) {
         // $VF: monitorexit
         throw var13;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Could not inline inconsistent finally blocks
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void b() {
      String[] var10000 = PingMessageReceiver.N();
      Object var2 = this.t;
      synchronized (this.t){} // $VF: monitorenter 
      String[] var1 = var10000;

      try {
         int var3 = this.q + 1;
         if (var1 == null) {
            var10000 = (String[])this.b.get(var3);
         } else if (!this.b.containsKey(var3)) {
            var10000 = (String[])var2;
            if (var1 != null) {
               // $VF: monitorexit
               return;
            }
         } else {
            var10000 = (String[])this.b.get(var3);
         }

         while (true) {
            Wr2 var4 = (Wr2)var10000;
            if (var1 != null) {
               if (this.m.g == 2) {
                  Qu2 var8 = this;
                  if (var1 != null) {
                     if (this.s == null) {
                        // $VF: monitorexit
                        return;
                     }

                     var8 = this;
                  }

                  var8.J(var4);
                  if (var1 == null) {
                     this.K.a(var4.M());
                  }
               } else {
                  this.K.a(var4.M());
               }
            } else {
               this.K.a(var4.M());
            }

            this.b.remove(var3);
            this.A.add(var3);
            this.q++;
            var3 = this.q + 1;
            if (!this.b.containsKey(var3)) {
               var10000 = (String[])var2;
               if (var1 != null) {
                  // $VF: monitorexit
                  return;
               }
            } else {
               var10000 = (String[])this.b.get(var3);
            }
         }
      } catch (Throwable var6) {
         // $VF: monitorexit
         throw var6;
      }
   }

   public void F(ArrayList var1) {
      WA var2 = new WA((long)this.a, var1, 0, this.a, this.m.q);
      var2.K(this.l);
      var2.S(this.r);

      try {
         this.P.P(var2.H());
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void X() {
      String[] var1 = PingMessageReceiver.N();
      Object var10000 = this.p;
      if (var1 != null) {
         if (this.p.size() <= 0) {
            return;
         }

         var10000 = this.f;
      }

      Object var2 = var10000;
      synchronized (var10000) {
         Iterator var4 = this.p.iterator();
         if (var1 == null) {
            Wr2 var3 = (Wr2)var4.next();
            this.J(var3);
         }

         while (true) {
            if (!var4.hasNext()) {
               this.p.clear();
               var10000 = var2;
               if (var1 != null) {
                  return;
               }
            } else {
               var10000 = var4.next();
            }

            Wr2 var6 = (Wr2)var10000;
            this.J(var6);
         }
      }
   }

   public boolean I() {
      return this.n;
   }

   public void m(boolean var1) {
      this.n = var1;
   }

   public Wr2 g(int var1) {
      return (Wr2)this.c.get(var1);
   }

   public static void __vfClinit__() {
      long var0 = 3564761179627992480L;
      long var10002 = -6177578120744229312L ^ var0;
      byte var10001 = -1;
      d = var10002;
      U = new Random();
      Y = 0;
   }
}





