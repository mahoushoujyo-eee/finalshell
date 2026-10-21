import com._y_2;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JPanel;

public class F8 extends JPanel {
   Kj_2 R;
   Kj_2 p;
   aM H;
   t3_2 K;
   _y_2 q;
   protected String c;
   private static String[] f;
   private static final long[] cb;
   private static final Integer[] db;

   public F8() {
      this.setPreferredSize(new Dimension(a(10735, 7292822211235108152L), a(18069, 523133079799642691L)));
   }

   public void q() {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(356328755167951757L);
      Object[] var10002 = var10001;
      F8 var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public void C(KV var1) {
   }

   public void S() {
   }

   public Kj_2 i() {
      return (Kj_2)com.c.c(480934286044834250L).get(this);
   }

   private void b(Kj_2 var1) {
      com.c.c(480934286044834250L).set(this, var1);
   }

   public Kj_2 Y() {
      return (Kj_2)com.c.c(280691565200945876L).get(this);
   }

   public void K(Kj_2 var1) {
      com.c.c(280691565200945876L).set(this, var1);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(328920636414804414L);
      Object[] var10003 = var10002;
      Kj_2 var7 = var1;
      Method var10001 = var10004;

      try {
         var4 = var10001.invoke(var7, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      Object[] var5 = com.c.a(var4);
      Method var9 = com.c.d(238817641764583171L);
      var10002 = var5;
      F8 var6 = this;
      Method var10000 = var9;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public aM h() {
      return (aM)com.c.c(192114424962340582L).get(this);
   }

   public void C(aM var1) {
      com.c.c(192114424962340582L).set(this, var1);
   }

   public t3_2 X() {
      return (t3_2)com.c.c(180652311095961139L).get(this);
   }

   public void U(t3_2 var1) {
      com.c.c(180652311095961139L).set(this, var1);
   }

   public void o() {
   }

   public _y_2 t() {
      return (_y_2)com.c.c(501796506201911497L).get(this);
   }

   public void E(_y_2 var1) {
      com.c.c(501796506201911497L).set(this, var1);
   }

   public String T() {
      return (String)com.c.c(208762370948884177L).get(this);
   }

   public void h(String var1) {
      com.c.c(208762370948884177L).set(this, var1);
   }

   public void h$void() {
      com.c.c(480934286044834250L).set(this, null);
      com.c.c(280691565200945876L).set(this, null);
      com.c.c(192114424962340582L).set(this, null);
      com.c.c(180652311095961139L).set(this, null);
      com.c.c(501796506201911497L).set(this, null);
      com.c.c(208762370948884177L).set(this, null);
   }

   public void K() {
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new Bj_2(this), com.c.c(222883478649268280L).getInt(null));
      Method var10003 = com.c.d(266288712085965362L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public static void D(String[] var0) {
      f = var0;
   }

   public static String[] y() {
      return f;
   }

   static {
      long var0 = 1922241311274734944L;
      long[] var6 = new long[2];
      D(null);
      int var3 = 0;
      String var4 = "V\u009c5 lª\b3³iÈ¼½£çH";
      int var5 = "V\u009c5 lª\b3³iÈ¼½£çH".length();
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

      cb = var6;
      db = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31958;
      if (db[var3] == null) {
         db[var3] = (int)(cb[var3] ^ var1);
      }

      return db[var3];
   }
}





