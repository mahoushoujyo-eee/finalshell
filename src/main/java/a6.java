import java.util.ArrayList;
import java.util.HashMap;

public class a6 {
   public int r;
   public String B;
   public int a;
   public String m;
   public String j;
   b2_2 g;
   HashMap G;
   boolean U;
   public String Z;
   public ArrayList k;
   public ArrayList E;
   public ArrayList w;
   private static com.ky_4[] V;
   private static final long b;

   public a6() {
      this.a = (int)b;
      this.G = new HashMap();
      this.U = false;
      this.k = new ArrayList();
      this.E = new ArrayList();
      this.w = new ArrayList();
   }

   void g(String var1, b2_2 var2) {
      this.G.put(var1, var2);
   }

   void h(nD var1) {
      this.w.add(var1);
      var1.F = this;
   }

   public ArrayList k() {
      return this.w;
   }

   public void d(ArrayList var1) {
      this.w = var1;
   }

   public static void i(com.ky_4[] var0) {
      V = var0;
   }

   public static com.ky_4[] P() {
      return V;
   }

   static {
      if (P() == null) {
         i(new com.ky_4[2]);
      }

      long var0 = 7002487834923142730L;
      long var10002 = 332468740234317484L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





