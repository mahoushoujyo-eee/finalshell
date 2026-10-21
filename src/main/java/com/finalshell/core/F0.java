package com.finalshell.core;

import com.finalshell.crypto.PingMessageReceiver;
import com.finalshell.io.B52;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class F0 {
   public DatagramSocket X;
   public int z;
   public Socket S;
   public InetAddress w;
   public int r;
   public HashMap T = new HashMap();
   public Object y = new Object();
   public F0 L;
   public InputStream q;
   public static Random x;
   public PingMessageReceiver N;
   public String U;
   public int C;
   public Dm4_2 l;
   public boolean E = false;
   public static String a;

   static {
      __vfClinit__();
   }

   public F0(Dm4_2 var1, PingMessageReceiver var2, String var3, int var4, Socket var5, InputStream var6, DatagramSocket var7) {
      this.l = var1;
      this.N = var2;
      this.U = var3;
      this.C = var4;
      this.q = var6;
      this.L = this;
      this.z = var7.getLocalPort();
      Jy2.g(a + this.z);
      this.S = var5;
      this.X = var7;
      this.N();
      PingMessageReceiver.U.execute(new com.finalshell.task.Lb4(this, var6));
   }

   public F0(Dm4_2 var1, PingMessageReceiver var2, String var3, int var4) {
      this.E = true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void d() {
      String[] var10000 = PingMessageReceiver.N();
      this.X.close();
      String[] var1 = var10000;
      Object var2 = this.y;
      synchronized (this.y) {
         Iterator var3 = this.g();
         if (var1 == null) {
            FO var4 = (FO)this.T.get(var3.next());
            var4.Z();
         }

         while (true) {
            while (var3.hasNext()) {
               FO var6 = (FO)this.T.get(var3.next());
               var6.Z();
            }

            if (var1 != null) {
               break;
            }

            FO var7 = (FO)var2;
            var7.Z();
         }
      }

      this.l.D(this);
   }

   public Iterator g() {
      Object var1 = null;
      synchronized (this.y) {
         return new com.finalshell.ui.model.GN(this.T.keySet().iterator());
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void e(DatagramPacket var1) {
      JX var17;
      String[] var10000 = PingMessageReceiver.N();
      ByteArrayInputStream var3 = new ByteArrayInputStream(var1.getData(), 0, var1.getLength());
      String[] var2 = var10000;

      try {
         JX var4 = new JX(var3);
         String var5 = "";

         label63: {
            label78: {
               label71: {
                  try {
                     var17 = var4;
                     if (var2 == null) {
                        break label78;
                     }

                     if (var4.e == null) {
                        break label71;
                     }
                  } catch (B52 var13) {
                     throw a(var13);
                  }

                  var5 = var4.e.getHostAddress();

                  try {
                     if (var2 != null) {
                        break label63;
                     }
                  } catch (B52 var12) {
                     boolean var10001 = false;
                     throw a(var12);
                  }
               }

               try {
                  var17 = var4;
               } catch (B52 var11) {
                  boolean var20 = false;
                  throw a(var11);
               }
            }

            var5 = var17.B;
         }

         String var6 = var1.getAddress().getHostAddress() + ":" + var1.getPort() + var5 + ":" + var4.R;
         FO var7 = (FO)this.T.get(var6);
         var3.close();
         Object var8 = this.y;
         synchronized (this.y) {
            var10000 = var7;
            if (var2 != null) {
               if (var7 == null) {
                  int var9 = Math.abs(x.nextInt());
                  var7 = new FO(this.N, this.U, this.C, this.L, var1.getAddress(), var1.getPort(), var6, var9);
                  this.T.put(var6, var7);
                  this.w = var1.getAddress();
                  this.r = var1.getPort();
               }

               var10000 = (String[])var8;
            }

            // $VF: monitorexit
         }

         var7.T(var1);
      } catch (B52 var14) {
         var14.printStackTrace();
      } catch (IOException var15) {
         var15.printStackTrace();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void A(byte[] var1) {
      DatagramSocket var8;
      IOException var9;
      DatagramPacket var3 = new DatagramPacket(var1, var1.length);
      var3.setAddress(this.w);
      String[] var10000 = PingMessageReceiver.N();
      var3.setPort(this.r);
      String[] var2 = var10000;

      label30: {
         label29: {
            try {
               var8 = this.X;
               if (var2 == null) {
                  break label29;
               }

               if (this.X.isClosed()) {
                  return;
               }
            } catch (IOException var7) {
               throw a(var7);
            }

            try {
               var8 = this.X;
            } catch (IOException var6) {
               var9 = var6;
               boolean var10001 = false;
               break label30;
            }
         }

         try {
            var8.send(var3);
            return;
         } catch (IOException var5) {
            var9 = var5;
            boolean var10 = false;
         }
      }

      IOException var4 = var9;
      var4.printStackTrace();
   }

   public void N() {
      PingMessageReceiver.U.execute(new com.finalshell.task.XF(this));
   }

   public void B(FO var1) {
      synchronized (this.y) {
         this.T.remove(var1.j());
      }
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var8;
      String var9;
      char[] var10003 = "於遝遂k".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 72;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 72;
         var10006 = var0;
      } else {
         var6 = 72;
         var1 = var10004;
         if (var10004 <= var0) {
            var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            x = new Random();
            return;
         }

         var10005 = var10003;
         var10 = 72;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 68;
               break;
            case 1:
               var23 = 15;
               break;
            case 2:
               var23 = 89;
               break;
            case 3:
               var23 = 3;
               break;
            case 4:
               var23 = 112;
               break;
            case 5:
               var23 = 89;
               break;
            default:
               var23 = 57;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               x = new Random();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





