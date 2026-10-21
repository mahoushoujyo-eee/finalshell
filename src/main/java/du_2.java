import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class Du_2 extends AbstractListModel {
   private ArrayList x;
   String[] a;
   Class[] W;
   private static final String b;

   public Du_2() {
      com.c.c(587586177856690794L).set(this, new ArrayList());
      com.c.c(437066352942724981L).set(this, new String[]{b});
      com.c.c(566899324430396131L).set(this, new Class[]{Object.class});
   }

   public String z(int var1) {
      return ((String[])com.c.c(437066352942724981L).get(this))[var1];
   }

   public void b() {
      ((ArrayList)com.c.c(587586177856690794L).get(this)).clear();
   }

   public Class U(int var1) {
      return ((Class[])com.c.c(566899324430396131L).get(this))[var1];
   }

   public void r(int var1) {
      ((ArrayList)com.c.c(587586177856690794L).get(this)).remove(var1);
   }

   public synchronized void k(L1 var1) {
      ((ArrayList)com.c.c(587586177856690794L).get(this)).add(var1);
   }

   void R() {
      this.fireContentsChanged(this, 0, ((ArrayList)com.c.c(587586177856690794L).get(this)).size() - 1);
   }

   public synchronized void x(L1 var1) {
      ((ArrayList)com.c.c(587586177856690794L).get(this)).add(0, var1);
   }

   @Override
   public int getSize() {
      return ((ArrayList)com.c.c(587586177856690794L).get(this)).size();
   }

   public L1 Z(int var1) {
      return (L1)((ArrayList)com.c.c(587586177856690794L).get(this)).get(var1);
   }

   @Override
   public Object getElementAt(int var1) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(430610060651646114L);
      Object[] var10002 = var10001;
      Du_2 var3 = this;
      Method var10000 = var10003;

      try {
         return (L1)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\\IO".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 82;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 82;
         var10006 = var0;
      } else {
         var6 = 82;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 82;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 109;
               break;
            case 1:
               var23 = 118;
               break;
            case 2:
               var23 = 121;
               break;
            case 3:
               var23 = 104;
               break;
            case 4:
               var23 = 73;
               break;
            case 5:
               var23 = 21;
               break;
            default:
               var23 = 85;
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
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





