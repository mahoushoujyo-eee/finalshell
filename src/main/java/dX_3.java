import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;

public class dX_3 implements Q0 {
   short K = I();
   Yu_2 P = new Yu_2();
   String B;
   Q0 F;
   boolean S = true;
   int A;
   boolean w = false;
   gH G;
   private static final long[] a;
   private static final Integer[] b;

   public dX_3(String var1) {
      this.B = var1;
   }

   public void C() throws UnknownHostException, PcapNativeException, NotOpenException {
      ((ThreadPoolExecutor)com.c.c(285529366020626428L).get(null)).execute(new fH_3(this));
   }

   public void v() {
      String[] var10000 = xQ.B();
      this.P.C().clear();
      String[] var1 = var10000;
      dX_3 var3 = this;
      if (var1 != null) {
         if (this.G != null) {
            gH var4 = this.G;
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(624731062495880669L);
            Object[] var10002 = var10001;
            gH var6 = var4;
            Method var5 = var10003;

            try {
               var5.invoke(var6, var10002);
            } catch (InvocationTargetException var2) {
               throw var2.getTargetException();
            }
         }

         var3 = this;
      }

      var3.F = null;
   }

   static short I() {
      String[] var10000 = xQ.B();
      int var1 = a(20338, 4574849776412187L);
      int var2 = a(9255, 3454409876788809039L);
      String[] var0 = var10000;
      short var3 = (short)new Random().nextInt(var2);
      short var4 = var3;
      if (var0 != null) {
         if (var3 < var1) {
            var3 = (short)(var3 + var1);
         }

         var4 = var3;
      }

      return var4;
   }

   @Override
   public void a(B0 var1) {
      String[] var2 = xQ.B();
      Q0 var10000 = this.F;
      if (var2 != null) {
         if (this.F == null) {
            return;
         }

         var10000 = this.F;
      }

      var10000.a(var1);
   }

   public Q0 i() {
      return this.F;
   }

   public void j(Q0 var1) {
      this.F = var1;
   }

   public Yu_2 n() {
      return this.P;
   }

   public void C(Yu_2 var1) {
      this.P = var1;
   }

   public boolean R() {
      return this.w;
   }

   public void O(boolean var1) {
      this.w = var1;
   }

   static {
      long var0 = 3506461730338835122L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "nM¶º\u0091À{ê\u001f.±¯¨\u008bïA";
      int var5 = "nM¶º\u0091À{ê\u001f.±¯¨\u008bïA".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10600;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





