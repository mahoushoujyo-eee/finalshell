import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.KeyStroke;

public class zG {
   int m;
   int X;
   int S;
   String B;
   KeyStroke N;
   private static int[] e;

   public zG(int var1, String var2, int var3, int var4) {
      com.c.c(475095538131051066L).setInt(this, var1);
      com.c.c(485068014524919453L).set(this, var2);
      com.c.c(280093782285122906L).setInt(this, var3);
      com.c.c(475485638447637979L).setInt(this, var4);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(374767772410438758L);
      Object[] var10002 = var10001;
      zG var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void F() {
      com.c.c(556570767736054289L).set(this, KeyStroke.getKeyStroke(com.c.c(475485638447637979L).getInt(this), com.c.c(280093782285122906L).getInt(this)));
   }

   public int m() {
      return com.c.c(280093782285122906L).getInt(this);
   }

   public void A(int var1) {
      com.c.c(280093782285122906L).setInt(this, var1);
   }

   public int p() {
      return com.c.c(475485638447637979L).getInt(this);
   }

   public void s(int var1) {
      com.c.c(475485638447637979L).setInt(this, var1);
   }

   public int K() {
      return com.c.c(475095538131051066L).getInt(this);
   }

   public void Y(int var1) {
      com.c.c(475095538131051066L).setInt(this, var1);
   }

   public String y() {
      return (String)com.c.c(485068014524919453L).get(this);
   }

   public void C(String var1) {
      com.c.c(485068014524919453L).set(this, var1);
   }

   public KeyStroke f() {
      return (KeyStroke)com.c.c(556570767736054289L).get(this);
   }

   public void h(KeyStroke var1) {
      com.c.c(556570767736054289L).set(this, var1);
   }

   public static void p(int[] var0) {
      e = var0;
   }

   public static int[] Z() {
      return e;
   }

   static {
      if (Z() != null) {
         p(new int[3]);
      }
   }
}





