import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JComponent;

public class J6 implements LayoutManager {
   oG_3 J;
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public void addLayoutComponent(String var1, Component var2) {
   }

   @Override
   public void removeLayoutComponent(Component var1) {
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      new Dimension();
      Dimension var10000;
      int var10002 = var1.getWidth();
      Method var10003 = (Method)com.c.c(403443201352784895L).get(this);
      Object[] var10004 = com.c.f();
      Method var10006 = com.c.d(471986896906843084L);
      Object[] var10005 = var10004;
      var10004 = var10003;
      var10003 = var10006;

      try {
         var5 = (JComponent)var10003.invoke(var10004, var10005);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10000 = new Dimension(var10002, var5.getPreferredSize().height);
      return var10000;
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return new Dimension(a(7023, 5129712945139162511L), a(13167, 7373005805903066510L));
   }

   @Override
   public void layoutContainer(Container var1) {
      Component[] var2 = var1.getComponents();
      Method var10000 = (Method)com.c.c(403443201352784895L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(471986896906843084L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var6 = (JComponent)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      JComponent var3 = var6;
      var3.setBounds(0, 0, var1.getWidth(), var1.getHeight());
   }

   public void i(Rectangle var1) {
      Method var10000 = (Method)com.c.c(403443201352784895L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(132133208927421439L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var4 = (JComponent)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var4.setBounds(var1);
   }

   public oG_3 q() {
      return (oG_3)com.c.c(403443201352784895L).get(this);
   }

   public void P(oG_3 var1) {
      com.c.c(403443201352784895L).set(this, var1);
   }

   static {
      long var0 = 7994035924332159797L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "/\u008d\u0004öa9¾ÞÈ[\u00849Ô9\u0016ß";
      int var5 = "/\u008d\u0004öa9¾ÞÈ[\u00849Ô9\u0016ß".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1760;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





