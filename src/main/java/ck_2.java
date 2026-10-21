import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class Ck_2 implements LayoutManager2 {
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public void addLayoutComponent(Component var1, Object var2) {
      Object[] var10001 = com.c.a(var1, var2);
      Method var10003 = com.c.d(211984589505220492L);
      Object[] var10002 = var10001;
      Ck_2 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public void addLayoutComponent(String var1, Component var2) {
      Object[] var10001 = com.c.a(var2, var1);
      Method var10003 = com.c.d(211984589505220492L);
      Object[] var10002 = var10001;
      Ck_2 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public void removeLayoutComponent(Component var1) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(455538072076904486L);
      Object[] var10002 = var10001;
      Ck_2 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void O(Component var1, Object var2) {
   }

   public void B(Component var1) {
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.preferredLayoutSize(var1);
   }

   @Override
   public Dimension maximumLayoutSize(Container var1) {
      return new Dimension(a(10031, 8514026021197084715L), a(10137, 963672662800955548L));
   }

   @Override
   public float getLayoutAlignmentX(Container var1) {
      return 0.5F;
   }

   @Override
   public float getLayoutAlignmentY(Container var1) {
      return 0.5F;
   }

   @Override
   public void invalidateLayout(Container var1) {
   }

   static {
      long var0 = 1452564465116053195L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0093\u007f\u00174º\u0085y\u001f=\u0087\u0003\byfy¨";
      int var5 = "\u0093\u007f\u00174º\u0085y\u001f=\u0087\u0003\byfy¨".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24324;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





