import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.tree.DefaultMutableTreeNode;

public class dy_4 implements LayoutManager {
   aJ P;
   Tv_2 n;
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
      int[] var10000 = oG_3.T();
      Dimension var3 = new Dimension();
      int[] var2 = var10000;
      if (var2 != null) {
         if ((aJ)com.c.c(628501091079280263L).get(this) != null) {
            var3 = ((aJ)com.c.c(628501091079280263L).get(this)).getPreferredSize();
         }

         var3 = new Dimension(a(27817, 2722024917501821351L), a(25644, 2484060400015690017L));
      }

      return var3;
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return new Dimension(a(17772, 8026740851858139235L), a(2659, 8320299013893760879L));
   }

   @Override
   public void layoutContainer(Container var1) {
      Component[] var3 = var1.getComponents();
      int[] var2 = oG_3.T();

      for (Component var7 : var3) {
         label33: {
            boolean var8 = var7.getClass().equals(aJ.class);
            if (var2 != null) {
               if (var8) {
                  com.c.c(628501091079280263L).set(this, (aJ)var7);
                  if (var2 != null) {
                     break label33;
                  }
               }

               var8 = var7.getClass().equals(Tv_2.class);
            }

            if (var8) {
               com.c.c(537516051091557680L).set(this, (Tv_2)var7);
            }
         }

         label26: {
            aJ var9 = (aJ)com.c.c(628501091079280263L).get(this);
            if (var2 != null) {
               if (var9 == null) {
                  break label26;
               }

               var9 = (aJ)com.c.c(628501091079280263L).get(this);
            }

            var9.setBounds(0, 0, var1.getWidth(), var1.getHeight());
         }

         if (var2 == null) {
            break;
         }
      }
   }

   public void v(Rectangle var1, DefaultMutableTreeNode var2) {
      int[] var3 = oG_3.T();
      Tv_2 var10000 = (Tv_2)com.c.c(537516051091557680L).get(this);
      if (var3 != null) {
         if (var10000 == null) {
            return;
         }

         ((Tv_2)com.c.c(537516051091557680L).get(this)).setBounds(var1);
         var10000 = (Tv_2)com.c.c(537516051091557680L).get(this);
      }

      Object[] var10001 = com.c.a(var2);
      Method var10003 = com.c.d(135515410391156914L);
      Object[] var10002 = var10001;
      Tv_2 var6 = var10000;
      Method var5 = var10003;

      try {
         var5.invoke(var6, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   static {
      long var0 = 1243245480819868915L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "Z\u0006%sHËcøæ\u000eã\u001aKl\fþ";
      int var5 = "Z\u0006%sHËcøæ\u000eã\u001aKl\fþ".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = ">\u0092þ\u000e\u0011\u0095\u0084xÎ)\u0019Ô\u007fþ,ô";
                  var5 = ">\u0092þ\u000e\u0011\u0095\u0084xÎ)\u0019Ô\u007fþ,ô".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11532;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





