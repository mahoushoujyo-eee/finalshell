import java.util.ArrayList;

public class uI_3 {
   String v;
   private long J;
   private long X;
   long y;
   long l;
   long C;
   long G;
   public ArrayList e;
   public ArrayList O;
   int d;
   private static final long a;

   public uI_3() {
      com.c.c(400438251718288839L).set(this, new ArrayList());
      com.c.c(559298368859498848L).set(this, new ArrayList());
      int var10001 = (int)a;
      com.c.c(469312586073532900L).setInt(this, var10001);
   }

   public void t() {
      ((ArrayList)com.c.c(400438251718288839L).get(this)).clear();
      ((ArrayList)com.c.c(559298368859498848L).get(this)).clear();
   }

   public long O() {
      return com.c.c(276405647390720435L).getLong(this);
   }

   public synchronized void e(long var1) {
      String[] var10000 = KV.b();
      com.c.c(276405647390720435L).setLong(this, var1);
      ((ArrayList)com.c.c(400438251718288839L).get(this)).add(com.c.c(276405647390720435L).getLong(this));
      String[] var3 = var10000;
      if (var3 == null && ((ArrayList)com.c.c(400438251718288839L).get(this)).size() > com.c.c(469312586073532900L).getInt(this)) {
         ((ArrayList)com.c.c(400438251718288839L).get(this)).remove(0);
      }

      long var4 = 0L;

      for (long var7 : (ArrayList)com.c.c(400438251718288839L).get(this)) {
         var4 += var7;
         if (var3 != null) {
            break;
         }
      }
   }

   public long y() {
      return com.c.c(345009583953251357L).getLong(this);
   }

   public synchronized void Y(long var1) {
      String[] var10000 = KV.b();
      com.c.c(345009583953251357L).setLong(this, var1);
      String[] var3 = var10000;
      ((ArrayList)com.c.c(559298368859498848L).get(this)).add(com.c.c(345009583953251357L).getLong(this));
      if (var3 == null && ((ArrayList)com.c.c(559298368859498848L).get(this)).size() > com.c.c(469312586073532900L).getInt(this)) {
         ((ArrayList)com.c.c(559298368859498848L).get(this)).remove(0);
      }

      long var4 = 0L;

      for (long var7 : (ArrayList)com.c.c(559298368859498848L).get(this)) {
         var4 += var7;
         if (var3 != null) {
            break;
         }
      }
   }

   public ArrayList W() {
      return (ArrayList)com.c.c(400438251718288839L).get(this);
   }

   public synchronized ArrayList I() {
      ArrayList var1 = new ArrayList();
      var1.addAll((ArrayList)com.c.c(400438251718288839L).get(this));
      return var1;
   }

   public synchronized ArrayList k() {
      ArrayList var1 = new ArrayList();
      var1.addAll((ArrayList)com.c.c(559298368859498848L).get(this));
      return var1;
   }

   public void d() {
      com.c.c(492627762665069625L).setLong(this, 0L);
      com.c.c(354679426752562901L).setLong(this, 0L);
      com.c.c(378121677769114664L).setLong(this, 0L);
      com.c.c(454115681480069499L).setLong(this, 0L);
   }

   public ArrayList T() {
      return (ArrayList)com.c.c(559298368859498848L).get(this);
   }

   public void y(ArrayList var1) {
      com.c.c(559298368859498848L).set(this, var1);
   }

   public long T$long() {
      return com.c.c(454115681480069499L).getLong(this);
   }

   public void h(long var1) {
      com.c.c(454115681480069499L).setLong(this, var1);
   }

   public long r() {
      return com.c.c(378121677769114664L).getLong(this);
   }

   public void T(long var1) {
      com.c.c(378121677769114664L).setLong(this, var1);
   }

   public long Y() {
      return com.c.c(354679426752562901L).getLong(this);
   }

   public void o(long var1) {
      com.c.c(354679426752562901L).setLong(this, var1);
   }

   public long g() {
      return com.c.c(492627762665069625L).getLong(this);
   }

   public void y(long var1) {
      com.c.c(492627762665069625L).setLong(this, var1);
   }

   public String U() {
      return (String)com.c.c(493900951344634838L).get(this);
   }

   public void y(String var1) {
      com.c.c(493900951344634838L).set(this, var1);
   }

   static {
      long var0 = 2690515540993287461L;
      long var10002 = -362586666020199415L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





