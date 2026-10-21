import com.ne_4;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class DN extends ne_4 {
   private BufferedImage I;
   private static final Map D;
   private static final long[] a;
   private static final Integer[] b;

   public DN() {
      this(a(14808, 3943790025191899887L));
   }

   public DN(int var1) {
      super(var1);
      com.c.c(329170386049535157L).set(this, null);
      this.L(false);
      this.c(false);
      com.KS var2 = new com.KS(3, a(14435, 4717495035907064661L), 3, 3);
      this.setBorder(var2);
      Object[] var10001 = com.c.f();
      Method var6 = com.c.d(270389152141252877L);
      Object[] var17 = var10001;
      Object var12 = null;

      try {
         var10001 = (Object[])var6.invoke(var12, var17);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var12 = com.c.f();
      Method var10004 = com.c.d(634817973682994708L);
      var17 = (Object[])var12;
      var12 = var10001;
      Method var8 = var10004;

      try {
         var8.invoke(var12, var17);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001 = com.c.f();
      Method var10 = com.c.d(499537131214815290L);
      var17 = var10001;
      var12 = null;

      try {
         var10001 = (Font)var10.invoke(var12, var17);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      this.setFont(var10001);
   }

   @Override
   public void paint(Graphics var1) {
      Graphics2D var2 = (Graphics2D)var1;
      super.paint(var1);
   }

   @Override
   public void paintComponent(Graphics var1) {
      label97: {
         String var10000 = aA.z();
         Container var3 = this.getTopLevelAncestor();
         String var2 = var10000;
         int var11 = var3 instanceof Window;
         if (var2 == null) {
            if (var11 == 0) {
               break label97;
            }

            var11 = ((Window)var3).isOpaque();
         }

         if (var2 == null) {
            if (var11 != 0) {
               break label97;
            }

            var11 = this.getWidth();
         }

         int var4;
         int var5;
         label83: {
            label82: {
               var4 = var11;
               var5 = this.getHeight();
               var12 = this;
               label81:
               if (var2 == null) {
                  if ((BufferedImage)com.c.c(329170386049535157L).get(this) != null) {
                     var12 = this;
                     if (var2 != null) {
                        break label81;
                     }

                     if (((BufferedImage)com.c.c(329170386049535157L).get(this)).getWidth() == var4) {
                        var13 = (BufferedImage)com.c.c(329170386049535157L).get(this);
                        if (var2 != null) {
                           break label83;
                        }

                        if (var13.getHeight() == var5) {
                           break label82;
                        }
                     }
                  }

                  var12 = this;
               }

               GraphicsConfiguration var6 = var12.getGraphicsConfiguration();
               com.c.c(329170386049535157L).set(this, var6.createCompatibleImage(var4, var5, 3));
            }

            var13 = (BufferedImage)com.c.c(329170386049535157L).get(this);
         }

         Graphics2D var10 = var13.createGraphics();

         try {
            super.paintComponent(var10);
         } finally {
            var10.dispose();
         }

         var1.drawImage((BufferedImage)com.c.c(329170386049535157L).get(this), 0, 0, var4, var5, 0, 0, var4, var5, null);
         if (var2 == null) {
            return;
         }
      }

      super.paintComponent(var1);
   }

   public ImageIcon U(String var1) {
      Object[] var10001 = com.c.a(this.getClass(), var1);
      Method var10003 = com.c.d(224017843723037148L);
      Object[] var10002 = var10001;
      DN var3 = this;
      Method var10000 = var10003;

      try {
         return (ImageIcon)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public ImageIcon q(Class var1, String var2) {
      String var10000 = aA.z();
      String var4 = var1.getCanonicalName() + ":" + var2;
      String var3 = var10000;
      Map var5 = (Map)com.c.c(628253408435626925L).get(null);
      String var10001 = var4;
      if (var3 == null) {
         if (!var5.containsKey(var4)) {
            ((Map)com.c.c(628253408435626925L).get(null)).put(var4, new ImageIcon(var1.getResource("/" + var2)));
         }

         var5 = (Map)com.c.c(628253408435626925L).get(null);
         var10001 = var4;
      }

      return (ImageIcon)var5.get(var10001);
   }

   static {
      long var0 = 3754755697294332681L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "áh®ÀÃÐ\u0091éT³\u008cLgr\u0090V";
      int var5 = "áh®ÀÃÐ\u0091éT³\u008cLgr\u0090V".length();
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
      D = new HashMap();
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31543;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





