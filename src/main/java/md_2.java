import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class md_2 implements Yx_2 {
   Socket a;
   Socket S;
   public DataInputStream I;
   public DataOutputStream M;
   public DataInputStream g;
   public DataOutputStream m;
   Object Q = new Object();
   Object K = new Object();
   Object X = new Object();
   Object F = new Object();
   ArrayList U = new ArrayList();
   ArrayList j = new ArrayList();
   byte[] s = new byte[0];
   int T = 1;
   int t = 1;
   boolean n = false;
   boolean x = false;
   boolean O = false;
   boolean v = false;
   boolean w = false;
   boolean V = false;
   boolean q = false;
   String Z;
   String p;
   static int N;
   Random k;
   long h;
   static int c;
   boolean C;
   long i;
   static ExecutorService b;
   Socket B;
   Socket P;
   int r;
   String R;
   private static final String d;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "0=?5\"b\u001c0=?5".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 120;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 120;
         var10006 = var0;
      } else {
         var6 = 120;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            N = 0;
            c = 0;
            b = Executors.newCachedThreadPool();
            return;
         }

         var10005 = var10003;
         var10 = 120;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 104;
               break;
            case 1:
               var23 = 101;
               break;
            case 2:
               var23 = 103;
               break;
            case 3:
               var23 = 109;
               break;
            case 4:
               var23 = 122;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 68;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               d = var8;
               N = 0;
               c = 0;
               b = Executors.newCachedThreadPool();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }

   public md_2() {
      this.Z = d;
      this.p = "";
      this.k = new Random();
      this.C = false;
      this.i = System.currentTimeMillis();
      this.r = -1;
      this.R = null;
   }

   public void x(Socket var1) {
      this.S = var1;
   }

   public void v(long var1) {
      this.h = var1;
   }

   public boolean s() {
      return this.C;
   }

   public long h() {
      return this.i;
   }

   void s$void() {
      this.i = System.currentTimeMillis();
   }

   public long q() {
      return this.h;
   }

   public void n() {
      this.G(true);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void G(boolean var1) {
      String[] var2 = QI.N();

      label41: {
         IOException var8;
         label40: {
            label46: {
               try {
                  var10000 = this;
                  if (var2 == null) {
                     break label46;
                  }

                  if (this.C) {
                     return;
                  }
               } catch (IOException var7) {
                  throw a(var7);
               }

               this.C = true;

               try {
                  var10000 = this;
               } catch (IOException var6) {
                  var8 = var6;
                  boolean var10001 = false;
                  break label40;
               }
            }

            try {
               var10000.a.close();
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
            this.S.close();
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }
   }

   void z() {
      this.n();
   }

   public void N() {
      Ls_2 var1 = new Ls_2(this);
      b.execute(var1);
   }

   @Override
   public void X() {
   }

   public Socket c() {
      return this.B;
   }

   public void Z(Socket var1) {
      this.B = var1;
   }

   public Socket o() {
      return this.P;
   }

   public void g(Socket var1) {
      this.P = var1;
   }

   public int o$int() {
      return this.r;
   }

   public void W(int var1) {
      this.r = var1;
   }

   public String g() {
      return this.R;
   }

   public void Y(String var1) {
      this.R = var1;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





