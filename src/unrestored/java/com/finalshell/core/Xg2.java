package com.finalshell.core;

import com.mortennobel.imagescaling.ResampleOp;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LinearGradientPaint;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public final class Xg2 {
   public static Map Z;
   public static Map l;
   public static ImageIcon C;
   public static ImageIcon z;
   public static Map g;
   public static Map E;
   public static Map S;
   public static Map k;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static boolean V(BufferedImage var0, int var1, int var2) {
      String var3 = FV_2.D();
      int var10000 = var0.getRGB(var1, var2) >> a(14003, 7425200876588139692L) & a(15643, 8247608782124551944L);
      if (var3 == null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      return var10000 != 0;
   }

   public static BufferedImage P(int var0, int var1) {
      return Wx2.S().createCompatibleImage(var0, var1);
   }

   public static BufferedImage g(int var0, int var1, int var2) {
      return Wx2.S().createCompatibleImage(var0, var1, var2);
   }

   public static BufferedImage c(BufferedImage var0) {
      return o(var0, var0.getWidth(), var0.getHeight());
   }

   public static BufferedImage m(BufferedImage var0, int var1) {
      return g(var0.getWidth(), var0.getHeight(), var1);
   }

   public static BufferedImage o(BufferedImage var0, int var1, int var2) {
      return g(var1, var2, var0.getTransparency());
   }

   public static BufferedImage f(URL var0) throws IOException {
      BufferedImage var1 = ImageIO.read(var0);
      return v(var1);
   }

   public static BufferedImage v(BufferedImage var0) {
      String var1 = FV_2.D();
      BufferedImage var10000 = var0;
      if (var1 == null) {
         if (A(var0)) {
            return var0;
         }

         var10000 = Wx2.S().createCompatibleImage(var0.getWidth(), var0.getHeight(), var0.getTransparency());
      }

      BufferedImage var2 = var10000;
      Graphics2D var3 = var2.createGraphics();
      var3.drawImage(var0, 0, 0, null);
      var3.dispose();
      return var2;
   }

   public static boolean A(BufferedImage var0) {
      return var0.getColorModel().equals(Wx2.S().getColorModel());
   }

   public static ImageIcon b(Shape var0, ImageIcon var1) {
      return new ImageIcon(A(var0, var1.getImage()));
   }

   public static BufferedImage A(Shape var0, Image var1) {
      Graphics2D var5;
      int var2 = var1.getWidth(null);
      int var3 = var1.getHeight(null);
      BufferedImage var4 = g(var2, var3, 3);
      var5 = var4.createGraphics();
      RV.X(var5);
      var5.setPaint(Color.WHITE);
      var5.fill(var0);
      var5.setComposite(AlphaComposite.getInstance(5));
      var5.drawImage(var1, 0, 0, null);
      var5.dispose();
      return var4;
   }

   public static List i(List var0) {
      ArrayList var5;
      ArrayList var2 = new ArrayList(var0.size());
      String var10000 = FV_2.D();
      Iterator var3 = var0.iterator();
      String var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            ImageIcon var4 = (ImageIcon)var3.next();
            var5 = var2;
            if (var1 != null) {
               break;
            }

            var2.add(var4.getImage());
            if (var1 == null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public static ImageIcon z(List var0) {
      return Z(0, var0);
   }

   public static ImageIcon Z(int var0, List var1) {
      Iterator var5;
      ImageIcon var6;
      int var7;
      ImageIcon var8;
      String var2 = FV_2.D();
      List var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return null;
         }

         var10000 = var1;
      }

      var7 = var10000.size();
      if (var2 == null) {
         if (var7 == 0) {
            return null;
         }

         var7 = var1.size();
      }

      Image[] var3 = new Image[var7];
      int var4 = 0;
      var5 = var1.iterator();

      while (true) {
         if (var5.hasNext()) {
            var8 = (ImageIcon)var5.next();
            if (var2 != null) {
               break;
            }

            Image var9;
            label29: {
               var6 = var8;
               ImageIcon var10002 = var6;
               if (var2 == null) {
                  if (var6 == null) {
                     var9 = null;
                     break label29;
                  }

                  var10002 = var6;
               }

               var9 = var10002.getImage();
            }

            var3[var4] = var9;
            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var8 = new ImageIcon(k(var0, var3));
         break;
      }

      return var8;
   }

   public static ImageIcon o(ImageIcon[] var0) {
      return w(0, var0);
   }

   public static ImageIcon w(int var0, ImageIcon[] var1) {
      ImageIcon[] var5;
      int var7;
      ImageIcon var8;
      int var9;
      String var2 = FV_2.D();
      ImageIcon var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return null;
         }

         var10000 = (ImageIcon)(var1);
      }

      var9 = ((Object[])var10000).length;
      if (var2 == null) {
         if (var9 == 0) {
            return null;
         }

         var9 = var1.length;
      }

      Image[] var3 = new Image[var9];
      int var4 = 0;
      var5 = var1;
      int var6 = var1.length;
      var7 = 0;

      while (true) {
         if (var7 < var6) {
            var10000 = var5[var7];
            if (var2 != null) {
               break;
            }

            Image var11;
            label29: {
               var8 = var10000;
               ImageIcon var10002 = var8;
               if (var2 == null) {
                  if (var8 == null) {
                     var11 = null;
                     break label29;
                  }

                  var10002 = var8;
               }

               var11 = var10002.getImage();
            }

            var3[var4] = var11;
            var4++;
            var7++;
            if (var2 == null) {
               continue;
            }
         }

         var10000 = new ImageIcon(k(var0, var3));
         break;
      }

      return var10000;
   }

   public static BufferedImage P(Image[] var0) {
      return k(0, var0);
   }

   public static BufferedImage k(int var0, Image[] var1) {
      int var6;
      int var9;
      String var2 = FV_2.D();
      Image[] var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return null;
         }

         var10000 = var1;
      }

      if (var10000.length != 0) {
         Dimension var3 = new Dimension(0, 0);
         Image[] var4 = var1;
         int var5 = var1.length;
         var6 = 0;

         while (true) {
            if (var6 < var5) {
               Image var7 = var4[var6];
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  if (var7 != null) {
                     var3.width = var3.width + var7.getWidth(null) + var0;
                     var3.height = Math.max(var3.height, var7.getHeight(null));
                  }

                  var6++;
               }

               if (var2 == null) {
                  continue;
               }
            }

            var3.width -= var0;
            break;
         }

         int var15 = var3.width;
         if (var2 == null) {
            if (var3.width <= 0) {
               return null;
            }

            var15 = var3.height;
         }

         if (var2 == null) {
            if (var15 <= 0) {
               return null;
            }

            var15 = var3.width;
         }

         BufferedImage var11 = g(var15, var3.height, 3);
         Graphics2D var12 = var11.createGraphics();
         var6 = 0;
         Image[] var14 = var1;
         int var8 = var1.length;
         var9 = 0;

         while (true) {
            if (var9 < var8) {
               Image var10 = var14[var9];
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  if (var10 != null) {
                     var12.drawImage(var10, var6, 0, null);
                     var6 += var10.getWidth(null) + var0;
                  }

                  var9++;
               }

               if (var2 == null) {
                  continue;
               }
            }

            var12.dispose();
            break;
         }

         return var11;
      } else {
         return null;
      }
   }

   public static void s() {
      Z.clear();
   }

   public static ImageIcon G(List var0) {
      return E(null, var0);
   }

   public static ImageIcon E(String var0, List var1) {
      ImageIcon var10;
      Iterator var5;
      ImageIcon var6;
      ImageIcon var7;
      List var8;
      int var9;
      String var2 = FV_2.D();
      if (var0 != null) {
         if (var2 != null) {
            return (ImageIcon)Z.get(var0);
         }

         if (Z.containsKey(var0)) {
            return (ImageIcon)Z.get(var0);
         }
      }

      var8 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return null;
         }

         var8 = var1;
      }

      var9 = var8.size();
      if (var2 == null) {
         if (var9 == 0) {
            return null;
         }

         var9 = var1.size();
      }

      if (var2 == null) {
         if (var9 == 1) {
            return (ImageIcon)var1.get(0);
         }

         var9 = var1.size();
      }

      Image[] var3 = new Image[var9];
      int var4 = 0;
      var5 = var1.iterator();

      while (true) {
         if (var5.hasNext()) {
            var10 = (ImageIcon)var5.next();
            if (var2 != null) {
               break;
            }

            Image var11;
            label52: {
               var6 = var10;
               ImageIcon var10002 = var6;
               if (var2 == null) {
                  if (var6 == null) {
                     var11 = null;
                     break label52;
                  }

                  var10002 = var6;
               }

               var11 = var10002.getImage();
            }

            var3[var4] = var11;
            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var10 = new ImageIcon(G(var3));
         break;
      }

      var7 = var10;
      if (var2 == null && var0 != null) {
         Z.put(var0, var7);
      }

      return var7;
   }

   public static ImageIcon I(ImageIcon[] var0) {
      return U(null, var0);
   }

   public static ImageIcon U(String var0, ImageIcon[] var1) {
      ImageIcon[] var5;
      int var7;
      String var2 = FV_2.D();
      if (var0 != null) {
         if (var2 != null) {
            return (ImageIcon)Z.get(var0);
         }

         if (Z.containsKey(var0)) {
            return (ImageIcon)Z.get(var0);
         }
      }

      ImageIcon[] var10 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return null;
         }

         var10 = var1;
      }

      int var11 = var10.length;
      if (var2 == null) {
         if (var11 == 0) {
            return null;
         }

         var11 = var1.length;
      }

      if (var2 == null) {
         if (var11 == 1) {
            return var1[0];
         }

         var11 = var1.length;
      }

      Image[] var3 = new Image[var11];
      int var4 = 0;
      var5 = var1;
      int var6 = var1.length;
      var7 = 0;

      while (true) {
         if (var7 < var6) {
            var10 = (ImageIcon[])(var5[var7]);
            if (var2 != null) {
               break;
            }

            Image var13;
            label52: {
               ImageIcon var8 = var10;
               ImageIcon var10002 = var8;
               if (var2 == null) {
                  if (var8 == null) {
                     var13 = null;
                     break label52;
                  }

                  var10002 = var8;
               }

               var13 = var10002.getImage();
            }

            var3[var4] = var13;
            var4++;
            var7++;
            if (var2 == null) {
               continue;
            }
         }

         var10 = (ImageIcon[])(new ImageIcon(G(var3)));
         break;
      }

      ImageIcon var9 = var10;
      if (var2 == null && var0 != null) {
         Z.put(var0, var9);
      }

      return var9;
   }

   public static void G() {
      l.clear();
   }

   public static BufferedImage G(Image[] var0) {
      return I(null, var0);
   }

   public static BufferedImage I(String var0, Image[] var1) {
      BufferedImage var10;
      int var6;
      int var8;
      String var2 = FV_2.D();
      if (var0 != null) {
         if (var2 != null) {
            return (BufferedImage)l.get(var0);
         }

         if (l.containsKey(var0)) {
            return (BufferedImage)l.get(var0);
         }
      }

      Image[] var14 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return null;
         }

         var14 = var1;
      }

      int var15 = var14.length;
      if (var2 == null) {
         if (var15 == 0) {
            return null;
         }

         if (var2 != null) {
            return v(var1[0]);
         }

         var15 = var1.length;
      }

      if (var15 != 1) {
         Dimension var3 = new Dimension(0, 0);
         Image[] var4 = var1;
         int var5 = var1.length;
         var6 = 0;

         while (true) {
            if (var6 < var5) {
               Image var7 = var4[var6];
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  if (var7 != null) {
                     var3.width = Math.max(var3.width, var7.getWidth(null));
                     var3.height = Math.max(var3.height, var7.getHeight(null));
                  }

                  var6++;
               }

               if (var2 == null) {
                  continue;
               }
            }

            int var17 = var3.width;
            if (var2 == null) {
               if (var3.width <= 0) {
                  break;
               }

               var17 = var3.height;
            }

            if (var2 == null) {
               if (var17 <= 0) {
                  break;
               }

               var17 = var3.width;
            }

            var10 = g(var17, var3.height, 3);
            Graphics2D var11 = var10.createGraphics();
            Image[] var12 = var1;
            int var13 = var1.length;
            var8 = 0;

            while (true) {
               if (var8 < var13) {
                  Image var9 = var12[var8];
                  if (var2 == null) {
                     if (var2 != null) {
                        break;
                     }

                     if (var9 != null) {
                        var11.drawImage(var9, 0, 0, null);
                     }

                     var8++;
                  }

                  if (var2 == null) {
                     continue;
                  }
               }

               var11.dispose();
               if (var2 == null && var0 != null) {
                  l.put(var0, var10);
               }
               break;
            }

            return var10;
         }

         return null;
      } else {
         return v(var1[0]);
      }
   }

   public static BufferedImage L(String var0) {
      return a(new File(var0));
   }

   public static BufferedImage a(File var0) {
      try {
         return ImageIO.read(var0);
      } catch (Throwable var2) {
         return null;
      }
   }

   public static ImageIcon a(URL var0) {
      try {
         return new ImageIcon(var0);
      } catch (Throwable var2) {
         return null;
      }
   }

   public static ImageIcon Z(java.lang.Class var0, String var1) {
      try {
         return new ImageIcon(var0.getResource(var1));
      } catch (Throwable var3) {
         return null;
      }
   }

   public static ImageIcon U(InputStream var0) {
      try {
         return new ImageIcon(ImageIO.read(var0));
      } catch (Throwable var2) {
         return null;
      }
   }

   public static ImageIcon l(ImageIcon var0, Color var1) {
      return new ImageIcon(l(Z(var0), var1));
   }

   public static BufferedImage l(BufferedImage var0, Color var1) {
      BufferedImage var2 = c(var0);
      Graphics2D var3 = var2.createGraphics();
      var3.setPaint(var1);
      var3.fillRect(0, 0, var0.getWidth(), var0.getHeight());
      var3.drawImage(var0, 0, 0, null);
      var3.dispose();
      return var2;
   }

   public static ImageIcon i(ImageIcon var0, int var1, int var2) {
      return new ImageIcon(g(Z(var0), var1, var2));
   }

   public static BufferedImage g(BufferedImage var0, int var1, int var2) {
      BufferedImage var3 = o(var0, var1, var2);
      Graphics2D var4 = var3.createGraphics();
      var4.drawImage(var0, var1 / 2 - var0.getWidth() / 2, var2 / 2 - var0.getHeight() / 2, null);
      var4.dispose();
      return var3;
   }

   public static ImageIcon U(ImageIcon var0) {
      return new ImageIcon(g(Z(var0)));
   }

   public static BufferedImage g(BufferedImage var0) {
      BufferedImage var1 = g(var0.getHeight(), var0.getWidth(), 3);
      Graphics2D var2 = var1.createGraphics();
      var2.translate(var0.getHeight(), 0);
      var2.rotate(Math.PI / 2);
      var2.drawImage(var0, 0, 0, null);
      var2.dispose();
      return var1;
   }

   public static ImageIcon h(ImageIcon var0) {
      return new ImageIcon(X(Z(var0)));
   }

   public static BufferedImage X(BufferedImage var0) {
      BufferedImage var1 = g(var0.getHeight(), var0.getWidth(), 3);
      Graphics2D var2 = var1.createGraphics();
      var2.translate(0, var0.getWidth());
      var2.rotate(-Math.PI / 2);
      var2.drawImage(var0, 0, 0, null);
      var2.dispose();
      return var1;
   }

   public static ImageIcon r(ImageIcon var0) {
      return new ImageIcon(F(Z(var0)));
   }

   public static BufferedImage F(BufferedImage var0) {
      BufferedImage var1 = g(var0.getWidth(), var0.getHeight(), 3);
      Graphics2D var2 = var1.createGraphics();
      var2.translate(var0.getWidth(), var0.getHeight());
      var2.rotate(Math.PI);
      var2.drawImage(var0, 0, 0, null);
      var2.dispose();
      return var1;
   }

   public static ImageIcon F(int var0, int var1) {
      return new ImageIcon(a(var0, var1));
   }

   public static BufferedImage a(int var0, int var1) {
      return g(var0, var1, 3);
   }

   public static ImageIcon l(Color var0) {
      return G(var0, a(5667, 1320727664616219698L), a(5667, 1320727664616219698L));
   }

   public static ImageIcon G(Color var0, int var1, int var2) {
      return new ImageIcon(b(var0, var1, var2));
   }

   public static BufferedImage E(Color var0) {
      return b(var0, a(5667, 1320727664616219698L), a(5667, 1320727664616219698L));
   }

   public static BufferedImage b(Color var0, int var1, int var2) {
      BufferedImage var3 = g(var1, var2, 3);
      Graphics2D var4 = var3.createGraphics();
      RV.X(var4);
      var4.setPaint(Color.GRAY);
      var4.drawRoundRect(0, 0, var1 - 1, var2 - 1, GO.Y, GO.FT);
      var4.setPaint(Color.WHITE);
      var4.drawRoundRect(1, 1, var1 - 3, var2 - 3, GO.FT, GO.FT);
      var4.setPaint(var0);
      var4.fillRoundRect(2, 2, var1 - 4, var2 - 4, GO.FT, GO.FT);
      var4.dispose();
      return var3;
   }

   public static ImageIcon L(Color var0) {
      return new ImageIcon(q(var0));
   }

   public static BufferedImage q(Color var0) {
      BufferedImage var2;
      Graphics2D var3;
      Color var4;
      label27: {
         label26: {
            label30: {
               String var10000 = FV_2.D();
               var2 = g(a(5667, 1320727664616219698L), a(5667, 1320727664616219698L), 3);
               String var1 = var10000;
               var3 = var2.createGraphics();
               var4 = var0;
               if (var1 == null) {
                  if (var0 == null) {
                     break label30;
                  }

                  var4 = var0;
               }

               if (var1 != null) {
                  break label27;
               }

               if (var4.getAlpha() >= a(15643, 8247608782124551944L)) {
                  break label26;
               }
            }

            var3.drawImage(z.getImage(), 0, 0, null);
         }

         var4 = var0;
      }

      if (var4 != null) {
         var3.setPaint(var0);
         var3.fillRect(2, 2, a(22436, 273184142911301050L), a(8240, 6941280575379313196L));
      }

      var3.drawImage(C.getImage(), 0, 0, null);
      var3.dispose();
      return var2;
   }

   public static void U(BufferedImage var0, float var1) {
      Graphics2D var2 = var0.createGraphics();
      var2.setComposite(AlphaComposite.getInstance(3, var1));
      var2.setPaint(Color.BLACK);
      var2.fillRect(0, 0, var0.getWidth(), var0.getHeight());
      var2.dispose();
   }

   public static Color e(ImageIcon var0) {
      int var10;
      BufferedImage var5;
      int var6;
      int var7;
      int var2 = 0;
      String var10000 = FV_2.D();
      int var3 = 0;
      int var4 = 0;
      var5 = v(var0.getImage());
      var6 = 0;
      String var1 = var10000;

      while (true) {
         if (var6 < var0.getIconWidth()) {
            var10 = 0;
            if (var1 != null) {
               break;
            }

            var7 = 0;

            label27: {
               while (var7 < var0.getIconHeight()) {
                  int var8 = var5.getRGB(var6, var7);
                  var2 += var8 >> a(6052, 2430465669435368895L) & a(1619, 4472629596573480014L);
                  var3 += var8 >> a(15301, 369906032393357776L) & a(15643, 8247608782124551944L);
                  var4 += var8 & a(15643, 8247608782124551944L);
                  var7++;
                  if (var1 != null) {
                     break label27;
                  }

                  if (var1 != null) {
                     break;
                  }
               }

               var6++;
            }

            if (var1 == null) {
               continue;
            }
         }

         var10 = var0.getIconWidth() * var0.getIconHeight();
         break;
      }

      var6 = var10;
      return new Color(var2 / var6, var3 / var6, var4 / var6);
   }

   public static boolean P(String var0) {
      return DE.o.contains(Cz2.G(var0, false).toLowerCase());
   }

   public static ImageIcon G(String var0) {
      return l(var0, a(25653, 8865959407765378597L));
   }

   public static ImageIcon l(String var0, int var1) {
      ImageIcon var5;
      ImageIcon var6;
      String var10000 = FV_2.D();
      ImageIcon var3 = e(var0, false);
      String var2 = var10000;
      var5 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return null;
         }

         var5 = T(var3.getImage(), var1);
      }

      ImageIcon var4 = var5;
      var6 = var4;
      if (var2 == null) {
         if (var4 != null) {
            var4.setDescription(var3.getIconWidth() + "x" + var3.getIconHeight());
         }

         var6 = var4;
      }

      return var6;
   }

   public static ImageIcon q(ImageIcon var0, int var1) {
      return T(var0.getImage(), var1);
   }

   public static ImageIcon T(Image var0, int var1) {
      return W(v(var0), var1);
   }

   public static ImageIcon W(BufferedImage var0, int var1) {
      BufferedImage var2 = h(var0, var1);
      return var2 != null ? new ImageIcon(var2) : new ImageIcon();
   }

   public static BufferedImage g(BufferedImage var0, Dimension var1) {
      return S(var0, var1.width, var1.height);
   }

   public static BufferedImage S(BufferedImage var0, int var1, int var2) {
      String var3 = FV_2.D();
      int var10000 = var0.getWidth();
      if (var3 == null) {
         if (var10000 <= var1) {
            if (var3 != null) {
               return var0;
            }

            if (var0.getHeight() <= var2) {
               return var0;
            }
         }

         float var5;
         var10000 = (var5 = (float)var2 * ((float)var0.getWidth() / (float)var0.getHeight()) - (float)var1) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      }

      return var10000 <= 0
         ? h(var0, Math.max(var2, Math.round((float)var2 * ((float)var0.getWidth() / (float)var0.getHeight()))))
         : h(var0, Math.max(var1, Math.round((float)var1 * ((float)var0.getHeight() / (float)var0.getWidth()))));
   }

   public static BufferedImage h(BufferedImage var0, int var1) {
      int var10;
      BufferedImage var7;
      Graphics2D var8;
      int var9;
      String var2 = FV_2.D();
      BufferedImage var10000 = var0;
      if (var2 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      int var10001;
      var9 = var10000.getWidth();
      var10001 = var1;
      label60:
      if (var2 == null) {
         if (var9 <= var1) {
            var9 = var0.getHeight();
            var10001 = var1;
            if (var2 != null) {
               break label60;
            }

            if (var9 <= var1) {
               return var0;
            }
         }

         var9 = var0.getWidth();
         var10001 = var0.getHeight();
      }

      int var3;
      int var4;
      label64: {
         if (var2 == null) {
            if (var9 > var10001) {
               var3 = var1;
               var4 = Math.round((float)var1 * (float)var0.getHeight() / (float)var0.getWidth());
               if (var2 == null) {
                  break label64;
               }
            }

            var9 = var0.getWidth();
            var10001 = var0.getHeight();
         }

         if (var2 == null) {
            if (var9 < var10001) {
               var4 = var1;
               var3 = Math.round((float)var1 * (float)var0.getWidth() / (float)var0.getHeight());
               if (var2 == null) {
                  break label64;
               }
            }

            var9 = var1;
            var10001 = var1;
         }

         var4 = var10001;
         var3 = var9;
      }

      var10 = var3;
      var10001 = 3;
      label40:
      if (var2 == null) {
         if (var3 >= 3) {
            var10 = var4;
            var10001 = 3;
            if (var2 != null) {
               break label40;
            }

            if (var4 >= 3) {
               return new ResampleOp(var3, var4).filter(var0, c(var0));
            }
         }

         var10 = 1;
         var10001 = var3;
      }

      int var5 = Math.max(var10, var10001);
      int var6 = Math.max(1, var4);
      var7 = g(var5, var6, 3);
      var8 = var7.createGraphics();
      RV.O(var8);
      var8.drawImage(var0, 0, 0, var3, var4, null);
      var8.dispose();
      return var7;
   }

   public static boolean K(String var0) {
      String var1 = FV_2.D();
      Map var10000 = g;
      String var10001 = var0;
      if (var1 == null) {
         if (!g.containsKey(var0)) {
            return false;
         }

         var10000 = g;
         var10001 = var0;
      }

      return var10000.get(var10001) != null;
   }

   public static void J(String var0, ImageIcon var1) {
      g.put(var0, var1);
   }

   public static void j() {
      g.clear();
   }

   public static void Q(String var0) {
      String var1;
      Map var2;
      String var10001;
      label40: {
         var1 = FV_2.D();
         int var10000 = g.size();
         if (var1 == null) {
            if (var10000 <= 0) {
               return;
            }

            var2 = g;
            var10001 = var0;
            if (var1 != null) {
               break label40;
            }

            var10000 = (g.containsKey(var0)) ? 1 : 0;
         }

         if (var10000 == 0) {
            return;
         }

         var2 = g;
         var10001 = var0;
      }

      Object var3 = var2.get(var10001);
      if (var1 == null) {
         if (var3 != null) {
            var3 = ((ImageIcon)g.get(var0)).getImage();
            if (var1 != null) {
               return;
            }

            if (var3 != null) {
               ((ImageIcon)g.get(var0)).getImage().flush();
            }
         }

         g.remove(var0);
      }
   }

   public static ImageIcon K(File var0) {
      return O(var0, true);
   }

   public static ImageIcon O(File var0, boolean var1) {
      return e(var0.getAbsolutePath(), var1);
   }

   public static ImageIcon e(String var0) {
      return e(var0, true);
   }

   public static ImageIcon e(String var0, boolean var1) {
      boolean var5;
      Map var6;
      ImageIcon var7;
      String var2 = FV_2.D();
      String var10000 = var0;
      if (var2 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0.trim();
      }

      var5 = var10000.equals("");
      if (var2 == null) {
         if (var5) {
            return null;
         }

         var5 = var1;
      }

      String var10001;
      label54: {
         label40: {
            if (var2 == null) {
               if (!var5) {
                  break label40;
               }

               var6 = g;
               var10001 = var0;
               if (var2 != null) {
                  break label54;
               }

               var5 = g.containsKey(var0);
            }

            if (var5) {
               var6 = g;
               var10001 = var0;
               break label54;
            }
         }

         ImageIcon var4 = w(var0);
         if (var1) {
            g.put(var0, var4);
         }

         return var4;
      }

      ImageIcon var3 = (ImageIcon)var6.get(var10001);
      var7 = var3;
      if (var2 == null) {
         if (var3 != null) {
            return var3;
         }

         g.remove(var0);
         var7 = e(var0, var1);
      }

      return var7;
   }

   public static ImageIcon w(String var0) {
      try {
         if (!new File(var0).exists()) {
            return new ImageIcon();
         }
      } catch (Throwable var3) {
         throw a(var3);
      }

      try {
         return new ImageIcon(ImageIO.read(new File(var0)));
      } catch (Throwable var2) {
         return new ImageIcon();
      }
   }

   public static ImageIcon U(URL var0) {
      return d(var0, true);
   }

   public static ImageIcon d(URL var0, boolean var1) {
      ImageIcon var5;
      boolean var6;
      Map var7;
      ImageIcon var8;
      String var2 = FV_2.D();
      URL var10000 = var0;
      if (var2 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      String var3;
      String var10001;
      label45: {
         label40: {
            var3 = var10000.toString();
            var6 = var1;
            if (var2 == null) {
               if (!var1) {
                  break label40;
               }

               var7 = g;
               var10001 = var3;
               if (var2 != null) {
                  break label45;
               }

               var6 = g.containsKey(var3);
            }

            if (var6) {
               var7 = g;
               var10001 = var3;
               break label45;
            }
         }

         var5 = new ImageIcon(var0);
         if (var1) {
            g.put(var3, var5);
         }

         return var5;
      }

      ImageIcon var4 = (ImageIcon)var7.get(var10001);
      var8 = var4;
      if (var2 == null) {
         if (var4 != null) {
            return var4;
         }

         g.remove(var3);
         var8 = e(var3, var1);
      }

      return var8;
   }

   public static BufferedImage m(Image var0) {
      return h(v(var0));
   }

   public static BufferedImage h(BufferedImage var0) {
      BufferedImage var1 = c(var0);
      Graphics2D var2 = var1.createGraphics();
      var2.drawImage(var0, 0, 0, null);
      var2.dispose();
      return var1;
   }

   public static BufferedImage z(URL var0) {
      return Z(new ImageIcon(var0));
   }

   public static BufferedImage R(String var0) {
      return Z(new ImageIcon(var0));
   }

   public static BufferedImage Z(ImageIcon var0) {
      return v(var0.getImage());
   }

   public static BufferedImage v(Image var0) {
      if (var0 == null || var0.getWidth(null) <= 0 || var0.getHeight(null) <= 0) {
         return null;
      } else if (var0 instanceof BufferedImage) {
         return (BufferedImage)var0;
      } else {
         BufferedImage var1 = g(var0.getWidth(null), var0.getHeight(null), 3);
         Graphics2D var2 = var1.createGraphics();
         var2.drawImage(var0, 0, 0, null);
         var2.dispose();
         return var1;
      }
   }

   public static BufferedImage i(Icon var0) {
      String var1 = FV_2.D();
      Icon var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      if (var1 == null) {
         if (var10000 instanceof ImageIcon) {
            Image var2 = ((ImageIcon)var0).getImage();
            Image var3 = var2;
            if (var1 == null) {
               if (var2 == null) {
                  return Z(var0);
               }

               var3 = var2;
            }

            return v(var3);
         }

         var10000 = var0;
      }

      return Z(var10000);
   }

   public static BufferedImage Z(Icon var0) {
      BufferedImage var1 = g(var0.getIconWidth(), var0.getIconHeight(), 3);
      Graphics2D var2 = var1.createGraphics();
      var0.paintIcon(null, var2, 0, 0);
      var2.dispose();
      return var1;
   }

   public static ImageIcon S(Icon var0) {
      String var1 = FV_2.D();
      Icon var10000 = var0;
      if (var1 == null) {
         if (!(var0 instanceof ImageIcon)) {
            return new ImageIcon(i(var0));
         }

         var10000 = var0;
      }

      return (ImageIcon)var10000;
   }

   public static ImageIcon U(String var0, int var1, boolean var2) {
      ImageIcon var5;
      String var3 = FV_2.D();
      Map var10000 = E;
      String var10001 = var1 + b(-31662, -21917) + var0;
      if (var3 == null) {
         if (!var10000.containsKey(var10001)) {
            ImageIcon var4 = l(var0, var1);
            var5 = c(var4, var1, var2);
            E.put(var1 + b(-31657, -7393) + var0, var5);
            return var5;
         }

         var10000 = E;
         var10001 = var1 + b(-31657, -7393) + var0;
      }

      return (ImageIcon)var10000.get(var10001);
   }

   public static ImageIcon Y(String var0, ImageIcon var1, int var2, boolean var3) {
      ImageIcon var5;
      String var4 = FV_2.D();
      Map var10000 = E;
      String var10001 = var0;
      if (var4 == null) {
         if (!E.containsKey(var0)) {
            var5 = c(var1, var2, var3);
            E.put(var0, var5);
            return var5;
         }

         var10000 = E;
         var10001 = var0;
      }

      return (ImageIcon)var10000.get(var10001);
   }

   public static ImageIcon c(ImageIcon var0, int var1, boolean var2) {
      Graphics2D var5;
      ImageIcon var6;
      var1 += 4;
      String var10000 = FV_2.D();
      BufferedImage var4 = g(var1, var1, 3);
      var5 = var4.createGraphics();
      String var3 = var10000;
      if (var0 != null) {
         var5.drawImage(var0.getImage(), var1 / 2 - var0.getIconWidth() / 2, var1 / 2 - var0.getIconHeight() / 2, null);
      }

      if (var2) {
         var5.setPaint(Color.LIGHT_GRAY);
         var5.drawRect(0, 0, var1 - 1, var1 - 1);
      }

      String var8;
      label19: {
         var5.dispose();
         var6 = new ImageIcon(var4);
         ImageIcon var10001 = var0;
         if (var3 == null) {
            if (var0 == null) {
               var8 = null;
               break label19;
            }

            var10001 = var0;
         }

         var8 = var10001.getDescription();
      }

      var6.setDescription(var8);
      return var6;
   }

   public static void c() {
      S.clear();
   }

   public static void y(String var0) {
      S.remove(var0);
   }

   public static ImageIcon H(String var0, ImageIcon var1) {
      if (S.containsKey(var0)) {
         return (ImageIcon)S.get(var0);
      } else {
         S.put(var0, J(var1));
         return (ImageIcon)S.get(var0);
      }
   }

   public static ImageIcon J(ImageIcon var0) {
      return new ImageIcon(h(var0.getImage()));
   }

   public static BufferedImage h(Image var0) {
      BufferedImage var1 = f(var0);
      BufferedImage var2 = c(var1);
      Graphics2D var3 = var2.createGraphics();
      RV.p(var3, GO.F8);
      var3.drawImage(var1, 0, 0, null);
      var3.dispose();
      return var2;
   }

   public static ImageIcon C(ImageIcon var0) {
      return new ImageIcon(f(var0.getImage()));
   }

   public static BufferedImage f(Image var0) {
      return n(v(var0));
   }

   public static BufferedImage n(BufferedImage var0) {
      return Oa4.q(var0, null);
   }

   public static ImageIcon h(String var0, ImageIcon var1, float var2) {
      String var3 = FV_2.D();
      Map var10000 = k;
      String var10001 = var0;
      if (var3 == null) {
         if (k.containsKey(var0)) {
            return (ImageIcon)k.get(var0);
         }

         k.put(var0, f(var1, var2));
         var10000 = k;
         var10001 = var0;
      }

      return (ImageIcon)var10000.get(var10001);
   }

   public static ImageIcon f(ImageIcon var0, float var1) {
      BufferedImage var2 = g(var0.getIconWidth(), var0.getIconHeight(), 3);
      Graphics2D var3 = var2.createGraphics();
      RV.p(var3, var1);
      var3.drawImage(var0.getImage(), 0, 0, null);
      var3.dispose();
      return new ImageIcon(var2);
   }

   public static BufferedImage Z(Image var0, int var1, int var2) {
      return j(v(var0), var1, var2);
   }

   public static BufferedImage j(BufferedImage var0, int var1, int var2) {
      BufferedImage var5;
      Graphics2D var6;
      Double var7;
      Shape var8;
      int var3 = var0.getWidth();
      int var4 = var0.getHeight();
      var5 = g(var3 + var1 * 2 + 1, var4 + var1 * 2 + 1, 3);
      var6 = var5.createGraphics();
      RV.X(var6);
      RV.O(var6);
      var7 = new Double((double)var1, (double)var1, (double)var3, (double)var4, (double)var2, (double)var2);
      var8 = var6.getClip();
      var6.setClip(var7);
      var6.drawImage(var0, var1, var1, null);
      var6.setClip(var8);
      RV.Y(var6, var7, GO.r, var1);
      var6.setPaint(
         new LinearGradientPaint(
            0.0F,
            (float)var1,
            0.0F,
            (float)(var4 - var1),
            new float[]{0.0F, 0.5F, 1.0F},
            new Color[]{
               new Color(a(15608, 5655894665130905312L), a(7019, 1957122256642287996L), a(7019, 1957122256642287996L), a(15510, 3972533210596642432L)),
               new Color(a(7019, 1957122256642287996L), a(7019, 1957122256642287996L), a(7019, 1957122256642287996L), 0),
               new Color(a(7019, 1957122256642287996L), a(7019, 1957122256642287996L), a(7019, 1957122256642287996L), a(31505, 1209462129975576840L))
            }
         )
      );
      var6.fill(var7);
      var6.setColor(Color.GRAY);
      var6.draw(var7);
      var6.dispose();
      return var5;
   }

   public static BufferedImage p(int var0, int var1, Shape var2, int var3, float var4) {
      return C(var0, var1, var2, var3, var4, GO.l);
   }

   public static BufferedImage C(int var0, int var1, Shape var2, int var3, float var4, Color var5) {
      Zf2 var10;
      int var6;
      int var7;
      BufferedImage var8;
      Graphics2D var9;
      var6 = var3 * 2 + var0;
      var7 = var3 * 2 + var1;
      var8 = g(var6, var6, 3);
      var9 = var8.createGraphics();
      RV.X(var9);
      var9.translate(var3, var3);
      var9.setPaint(Color.BLACK);
      var9.fill(var2);
      var9.dispose();
      var10 = new Zf2(var3, 0, 0, var4);
      BufferedImage var11 = var10.filter(var8, null);
      if (var5 != null) {
         Graphics2D var12 = var11.createGraphics();
         RV.X(var12);
         var12.translate(var3, var3);
         var12.setComposite(AlphaComposite.getInstance(5));
         var12.setPaint(var5);
         var12.fill(var2);
         var12.dispose();
      }

      return var11;
   }

   public static ImageIcon l$ImageIcon(int var0) {
      return new ImageIcon(J(var0));
   }

   public static BufferedImage J(int var0) {
      return C(a(1396, 7302371937458468704L), a(1396, 7302371937458468704L), Z(), var0, 1.0F, Color.WHITE);
   }

   public static ImageIcon Y(int var0) {
      return new ImageIcon(G(var0));
   }

   public static BufferedImage G(int var0) {
      return M(Z(), V(), var0);
   }

   public static GeneralPath Z() {
      GeneralPath var0 = new GeneralPath(0);
      var0.moveTo(0.0F, 7.0F);
      var0.lineTo(5.0F, 1.0F);
      var0.lineTo(10.0F, 7.0F);
      var0.closePath();
      return var0;
   }

   public static GeneralPath V() {
      GeneralPath var0 = new GeneralPath(0);
      var0.moveTo(0.0F, 6.0F);
      var0.lineTo(4.0F, 2.0F);
      var0.lineTo(8.0F, 6.0F);
      var0.closePath();
      return var0;
   }

   public static ImageIcon p(int var0) {
      return new ImageIcon(s(var0));
   }

   public static BufferedImage s(int var0) {
      return C(a(1396, 7302371937458468704L), a(1396, 7302371937458468704L), e(), var0, 1.0F, Color.WHITE);
   }

   public static ImageIcon P(int var0) {
      return new ImageIcon(g(var0));
   }

   public static BufferedImage g(int var0) {
      return M(e(), a(), var0);
   }

   public static GeneralPath e() {
      GeneralPath var0 = new GeneralPath(0);
      var0.moveTo(7.0F, 0.0F);
      var0.lineTo(1.0F, 5.0F);
      var0.lineTo(7.0F, 10.0F);
      var0.closePath();
      return var0;
   }

   public static GeneralPath a() {
      GeneralPath var0 = new GeneralPath(0);
      var0.moveTo(6.0F, 0.0F);
      var0.lineTo(2.0F, 4.0F);
      var0.lineTo(6.0F, 8.0F);
      var0.closePath();
      return var0;
   }

   public static ImageIcon q(int var0) {
      return new ImageIcon(y(var0));
   }

   public static BufferedImage y(int var0) {
      return C(a(1396, 7302371937458468704L), a(1396, 7302371937458468704L), P(), var0, 1.0F, Color.WHITE);
   }

   public static ImageIcon e$ImageIcon(int var0) {
      return new ImageIcon(e$BufferedImage(var0));
   }

   public static BufferedImage e$BufferedImage(int var0) {
      return M(P(), D(), var0);
   }

   public static GeneralPath P() {
      GeneralPath var0 = new GeneralPath(0);
      var0.moveTo(0.0F, 3.0F);
      var0.lineTo(5.0F, 9.0F);
      var0.lineTo(10.0F, 3.0F);
      var0.closePath();
      return var0;
   }

   public static GeneralPath D() {
      GeneralPath var0 = new GeneralPath(0);
      var0.moveTo(0.0F, 3.0F);
      var0.lineTo(4.0F, 7.0F);
      var0.lineTo(8.0F, 3.0F);
      var0.closePath();
      return var0;
   }

   public static ImageIcon L(int var0) {
      return new ImageIcon(Q(var0));
   }

   public static BufferedImage Q(int var0) {
      return C(a(28776, 1012553027963535986L), a(1396, 7302371937458468704L), l(), var0, 1.0F, Color.WHITE);
   }

   public static ImageIcon a(int var0) {
      return new ImageIcon(l$BufferedImage(var0));
   }

   public static BufferedImage l$BufferedImage(int var0) {
      return M(l(), M(), var0);
   }

   public static GeneralPath l() {
      GeneralPath var0 = new GeneralPath(0);
      var0.moveTo(3.0F, 0.0F);
      var0.lineTo(9.0F, 5.0F);
      var0.lineTo(3.0F, 10.0F);
      var0.closePath();
      return var0;
   }

   public static GeneralPath M() {
      GeneralPath var0 = new GeneralPath(0);
      var0.moveTo(3.0F, 0.0F);
      var0.lineTo(7.0F, 4.0F);
      var0.lineTo(3.0F, 8.0F);
      var0.closePath();
      return var0;
   }

   public static BufferedImage M(GeneralPath var0, GeneralPath var1, int var2) {
      BufferedImage var3 = C(a(1396, 7302371937458468704L), a(1396, 7302371937458468704L), var0, var2, 1.0F, Color.BLACK);
      Graphics2D var4 = var3.createGraphics();
      RV.X(var4);
      var4.setPaint(Color.WHITE);
      var4.translate(var2, var2);
      var4.draw(var1);
      var4.dispose();
      return var3;
   }

   public static BufferedImage a(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 2
      // 05: astore 1
      // 06: aload 0
      // 07: aload 1
      // 08: ifnonnull 16
      // 0b: ifnull 2a
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Xg2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: aload 1
      // 17: ifnonnull 34
      // 1a: ldc_w ""
      // 1d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 20: ifeq 30
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/Xg2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 2
      // 2b: areturn
      // 2c: invokestatic com/finalshell/core/Xg2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 0
      // 31: invokestatic com/finalshell/core/LE_2.Q (Ljava/lang/String;)Ljava/lang/String;
      // 34: invokevirtual java/lang/String.getBytes ()[B
      // 37: astore 3
      // 38: new java/io/ByteArrayInputStream
      // 3b: dup
      // 3c: aload 3
      // 3d: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 40: astore 4
      // 42: aload 4
      // 44: invokestatic javax/imageio/ImageIO.read (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 47: astore 2
      // 48: aload 4
      // 4a: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 4d: goto 6a
      // 50: astore 5
      // 52: sipush -31663
      // 55: sipush -5324
      // 58: invokestatic com/finalshell/core/Xg2.b (II)Ljava/lang/String;
      // 5b: aload 5
      // 5d: invokestatic com/finalshell/core/NE3.M (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 60: aload 4
      // 62: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 65: goto 6a
      // 68: astore 6
      // 6a: aload 2
      // 6b: areturn
   }

   public static String K(BufferedImage var0) {
      String var1 = null;

      try {
         if (var0 == null) {
            return var1;
         }
      } catch (IOException var7) {
         throw a(var7);
      }

      ByteArrayOutputStream var2 = new ByteArrayOutputStream();

      try {
         ImageIO.write(var0, b(-31659, 21210), var2);
         var1 = LE_2.S(new String(var2.toByteArray()));
         var2.close();
      } catch (IOException var6) {
         NE3.M(b(-31664, 14473), var6);

         try {
            var2.close();
         } catch (IOException var5) {
         }
      }

      return var1;
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var6;
      int var8;
      int var2 = (var0 ^ -31661) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 230;
               break;
            case 1:
               var10000 = 5;
               break;
            case 2:
               var10000 = 65;
               break;
            case 3:
               var10000 = 115;
               break;
            case 4:
               var10000 = 194;
               break;
            case 5:
               var10000 = 150;
               break;
            case 6:
               var10000 = 123;
               break;
            case 7:
               var10000 = 84;
               break;
            case 8:
               var10000 = 16;
               break;
            case 9:
               var10000 = 192;
               break;
            case 10:
               var10000 = 122;
               break;
            case 11:
               var10000 = 191;
               break;
            case 12:
               var10000 = 88;
               break;
            case 13:
               var10000 = 145;
               break;
            case 14:
               var10000 = 37;
               break;
            case 15:
               var10000 = 15;
               break;
            case 16:
               var10000 = 181;
               break;
            case 17:
               var10000 = 126;
               break;
            case 18:
               var10000 = 174;
               break;
            case 19:
               var10000 = 17;
               break;
            case 20:
               var10000 = 27;
               break;
            case 21:
               var10000 = 35;
               break;
            case 22:
               var10000 = 80;
               break;
            case 23:
               var10000 = 247;
               break;
            case 24:
               var10000 = 73;
               break;
            case 25:
               var10000 = 118;
               break;
            case 26:
               var10000 = 121;
               break;
            case 27:
               var10000 = 48;
               break;
            case 28:
               var10000 = 81;
               break;
            case 29:
               var10000 = 132;
               break;
            case 30:
               var10000 = 218;
               break;
            case 31:
               var10000 = 243;
               break;
            case 32:
               var10000 = 22;
               break;
            case 33:
               var10000 = 33;
               break;
            case 34:
               var10000 = 164;
               break;
            case 35:
               var10000 = 36;
               break;
            case 36:
               var10000 = 19;
               break;
            case 37:
               var10000 = 59;
               break;
            case 38:
               var10000 = 58;
               break;
            case 39:
               var10000 = 156;
               break;
            case 40:
               var10000 = 142;
               break;
            case 41:
               var10000 = 235;
               break;
            case 42:
               var10000 = 239;
               break;
            case 43:
               var10000 = 187;
               break;
            case 44:
               var10000 = 25;
               break;
            case 45:
               var10000 = 95;
               break;
            case 46:
               var10000 = 240;
               break;
            case 47:
               var10000 = 251;
               break;
            case 48:
               var10000 = 214;
               break;
            case 49:
               var10000 = 50;
               break;
            case 50:
               var10000 = 106;
               break;
            case 51:
               var10000 = 180;
               break;
            case 52:
               var10000 = 225;
               break;
            case 53:
               var10000 = 149;
               break;
            case 54:
               var10000 = 102;
               break;
            case 55:
               var10000 = 219;
               break;
            case 56:
               var10000 = 204;
               break;
            case 57:
               var10000 = 85;
               break;
            case 58:
               var10000 = 99;
               break;
            case 59:
               var10000 = 53;
               break;
            case 60:
               var10000 = 112;
               break;
            case 61:
               var10000 = 189;
               break;
            case 62:
               var10000 = 52;
               break;
            case 63:
               var10000 = 26;
               break;
            case 64:
               var10000 = 250;
               break;
            case 65:
               var10000 = 32;
               break;
            case 66:
               var10000 = 242;
               break;
            case 67:
               var10000 = 202;
               break;
            case 68:
               var10000 = 11;
               break;
            case 69:
               var10000 = 74;
               break;
            case 70:
               var10000 = 100;
               break;
            case 71:
               var10000 = 184;
               break;
            case 72:
               var10000 = 94;
               break;
            case 73:
               var10000 = 7;
               break;
            case 74:
               var10000 = 64;
               break;
            case 75:
               var10000 = 234;
               break;
            case 76:
               var10000 = 163;
               break;
            case 77:
               var10000 = 18;
               break;
            case 78:
               var10000 = 254;
               break;
            case 79:
               var10000 = 157;
               break;
            case 80:
               var10000 = 158;
               break;
            case 81:
               var10000 = 56;
               break;
            case 82:
               var10000 = 171;
               break;
            case 83:
               var10000 = 14;
               break;
            case 84:
               var10000 = 105;
               break;
            case 85:
               var10000 = 160;
               break;
            case 86:
               var10000 = 146;
               break;
            case 87:
               var10000 = 67;
               break;
            case 88:
               var10000 = 136;
               break;
            case 89:
               var10000 = 144;
               break;
            case 90:
               var10000 = 147;
               break;
            case 91:
               var10000 = 222;
               break;
            case 92:
               var10000 = 49;
               break;
            case 93:
               var10000 = 173;
               break;
            case 94:
               var10000 = 21;
               break;
            case 95:
               var10000 = 182;
               break;
            case 96:
               var10000 = 62;
               break;
            case 97:
               var10000 = 217;
               break;
            case 98:
               var10000 = 135;
               break;
            case 99:
               var10000 = 178;
               break;
            case 100:
               var10000 = 177;
               break;
            case 101:
               var10000 = 77;
               break;
            case 102:
               var10000 = 208;
               break;
            case 103:
               var10000 = 104;
               break;
            case 104:
               var10000 = 152;
               break;
            case 105:
               var10000 = 6;
               break;
            case 106:
               var10000 = 186;
               break;
            case 107:
               var10000 = 79;
               break;
            case 108:
               var10000 = 169;
               break;
            case 109:
               var10000 = 9;
               break;
            case 110:
               var10000 = 0;
               break;
            case 111:
               var10000 = 193;
               break;
            case 112:
               var10000 = 228;
               break;
            case 113:
               var10000 = 167;
               break;
            case 114:
               var10000 = 101;
               break;
            case 115:
               var10000 = 54;
               break;
            case 116:
               var10000 = 83;
               break;
            case 117:
               var10000 = 141;
               break;
            case 118:
               var10000 = 45;
               break;
            case 119:
               var10000 = 68;
               break;
            case 120:
               var10000 = 162;
               break;
            case 121:
               var10000 = 4;
               break;
            case 122:
               var10000 = 215;
               break;
            case 123:
               var10000 = 28;
               break;
            case 124:
               var10000 = 197;
               break;
            case 125:
               var10000 = 227;
               break;
            case 126:
               var10000 = 42;
               break;
            case 127:
               var10000 = 200;
               break;
            case 128:
               var10000 = 133;
               break;
            case 129:
               var10000 = 38;
               break;
            case 130:
               var10000 = 1;
               break;
            case 131:
               var10000 = 82;
               break;
            case 132:
               var10000 = 224;
               break;
            case 133:
               var10000 = 113;
               break;
            case 134:
               var10000 = 89;
               break;
            case 135:
               var10000 = 31;
               break;
            case 136:
               var10000 = 172;
               break;
            case 137:
               var10000 = 3;
               break;
            case 138:
               var10000 = 116;
               break;
            case 139:
               var10000 = 30;
               break;
            case 140:
               var10000 = 23;
               break;
            case 141:
               var10000 = 93;
               break;
            case 142:
               var10000 = 41;
               break;
            case 143:
               var10000 = 223;
               break;
            case 144:
               var10000 = 166;
               break;
            case 145:
               var10000 = 210;
               break;
            case 146:
               var10000 = 220;
               break;
            case 147:
               var10000 = 111;
               break;
            case 148:
               var10000 = 229;
               break;
            case 149:
               var10000 = 51;
               break;
            case 150:
               var10000 = 78;
               break;
            case 151:
               var10000 = 253;
               break;
            case 152:
               var10000 = 203;
               break;
            case 153:
               var10000 = 76;
               break;
            case 154:
               var10000 = 216;
               break;
            case 155:
               var10000 = 13;
               break;
            case 156:
               var10000 = 119;
               break;
            case 157:
               var10000 = 109;
               break;
            case 158:
               var10000 = 71;
               break;
            case 159:
               var10000 = 29;
               break;
            case 160:
               var10000 = 143;
               break;
            case 161:
               var10000 = 165;
               break;
            case 162:
               var10000 = 12;
               break;
            case 163:
               var10000 = 87;
               break;
            case 164:
               var10000 = 176;
               break;
            case 165:
               var10000 = 92;
               break;
            case 166:
               var10000 = 70;
               break;
            case 167:
               var10000 = 170;
               break;
            case 168:
               var10000 = 183;
               break;
            case 169:
               var10000 = 161;
               break;
            case 170:
               var10000 = 201;
               break;
            case 171:
               var10000 = 103;
               break;
            case 172:
               var10000 = 120;
               break;
            case 173:
               var10000 = 245;
               break;
            case 174:
               var10000 = 148;
               break;
            case 175:
               var10000 = 185;
               break;
            case 176:
               var10000 = 206;
               break;
            case 177:
               var10000 = 248;
               break;
            case 178:
               var10000 = 55;
               break;
            case 179:
               var10000 = 128;
               break;
            case 180:
               var10000 = 137;
               break;
            case 181:
               var10000 = 168;
               break;
            case 182:
               var10000 = 238;
               break;
            case 183:
               var10000 = 57;
               break;
            case 184:
               var10000 = 188;
               break;
            case 185:
               var10000 = 91;
               break;
            case 186:
               var10000 = 10;
               break;
            case 187:
               var10000 = 34;
               break;
            case 188:
               var10000 = 212;
               break;
            case 189:
               var10000 = 179;
               break;
            case 190:
               var10000 = 63;
               break;
            case 191:
               var10000 = 236;
               break;
            case 192:
               var10000 = 140;
               break;
            case 193:
               var10000 = 231;
               break;
            case 194:
               var10000 = 90;
               break;
            case 195:
               var10000 = 199;
               break;
            case 196:
               var10000 = 129;
               break;
            case 197:
               var10000 = 44;
               break;
            case 198:
               var10000 = 159;
               break;
            case 199:
               var10000 = 20;
               break;
            case 200:
               var10000 = 40;
               break;
            case 201:
               var10000 = 233;
               break;
            case 202:
               var10000 = 114;
               break;
            case 203:
               var10000 = 209;
               break;
            case 204:
               var10000 = 252;
               break;
            case 205:
               var10000 = 97;
               break;
            case 206:
               var10000 = 207;
               break;
            case 207:
               var10000 = 43;
               break;
            case 208:
               var10000 = 151;
               break;
            case 209:
               var10000 = 190;
               break;
            case 210:
               var10000 = 75;
               break;
            case 211:
               var10000 = 153;
               break;
            case 212:
               var10000 = 213;
               break;
            case 213:
               var10000 = 244;
               break;
            case 214:
               var10000 = 124;
               break;
            case 215:
               var10000 = 60;
               break;
            case 216:
               var10000 = 138;
               break;
            case 217:
               var10000 = 69;
               break;
            case 218:
               var10000 = 86;
               break;
            case 219:
               var10000 = 131;
               break;
            case 220:
               var10000 = 117;
               break;
            case 221:
               var10000 = 39;
               break;
            case 222:
               var10000 = 196;
               break;
            case 223:
               var10000 = 195;
               break;
            case 224:
               var10000 = 47;
               break;
            case 225:
               var10000 = 98;
               break;
            case 226:
               var10000 = 72;
               break;
            case 227:
               var10000 = 205;
               break;
            case 228:
               var10000 = 246;
               break;
            case 229:
               var10000 = 108;
               break;
            case 230:
               var10000 = 226;
               break;
            case 231:
               var10000 = 237;
               break;
            case 232:
               var10000 = 241;
               break;
            case 233:
               var10000 = 232;
               break;
            case 234:
               var10000 = 134;
               break;
            case 235:
               var10000 = 255;
               break;
            case 236:
               var10000 = 61;
               break;
            case 237:
               var10000 = 8;
               break;
            case 238:
               var10000 = 249;
               break;
            case 239:
               var10000 = 139;
               break;
            case 240:
               var10000 = 24;
               break;
            case 241:
               var10000 = 198;
               break;
            case 242:
               var10000 = 175;
               break;
            case 243:
               var10000 = 46;
               break;
            case 244:
               var10000 = 66;
               break;
            case 245:
               var10000 = 96;
               break;
            case 246:
               var10000 = 130;
               break;
            case 247:
               var10000 = 107;
               break;
            case 248:
               var10000 = 211;
               break;
            case 249:
               var10000 = 221;
               break;
            case 250:
               var10000 = 125;
               break;
            case 251:
               var10000 = 127;
               break;
            case 252:
               var10000 = 154;
               break;
            case 253:
               var10000 = 110;
               break;
            case 254:
               var10000 = 2;
               break;
            default:
               var10000 = 155;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12829;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var10;
      char[] var33;
      boolean var5;
      long[] var6;
      byte[] var7;
      int var9;
      String[] var13 = new String[7];
      int var11 = 0;
      var10 = "ÖÉ Ø¯ðä\u0015#\u001ew$ÁS\räÎÏï\u0092º®6\tÌîç\u0004\u0080\u000f;\u001d\u001b\u000b±®w¾ÂyK¸âqWÂ#\u009d_*ËF;\u0000áwÍ)Ø#\u001b³!¹e\\\u0080%\u00033ë\u0001}í\fxº\u0096wÑ¬ò\u0013)\u0093â\u0013Z\u0004\u0085\u008f\u009b\r";
      int var12 = "ÖÉ Ø¯ðä\u0015#\u001ew$ÁS\räÎÏï\u0092º®6\tÌîç\u0004\u0080\u000f;\u001d\u001b\u000b±®w¾ÂyK¸âqWÂ#\u009d_*ËF;\u0000áwÍ)Ø#\u001b³!¹e\\\u0080%\u00033ë\u0001}í\fxº\u0096wÑ¬ò\u0013)\u0093â\u0013Z\u0004\u0085\u008f\u009b\r"
         .length();
      var9 = 27;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 86;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 28;
                        break;
                     case 1:
                        var65 = 66;
                        break;
                     case 2:
                        var65 = 78;
                        break;
                     case 3:
                        var65 = 84;
                        break;
                     case 4:
                        var65 = 31;
                        break;
                     case 5:
                        var65 = 113;
                        break;
                     default:
                        var65 = 16;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[7];
                     long var0 = 7617842255369400522L;
                     var6 = new long[15];
                     int var3 = 0;
                     String var4 = "fú\u00adhYéÄ{*üB?·\u008dbêRòÂyÈ´t~\u009c\\ì[F?\u0095}¢ØËc ;¹ò\u009fb];Àg~W\u0094=Ôï£:ÕeVéüx®C²²ã\u0083\u009c÷\u000fTy\u00122æ#×÷¾Ç \u008b¾57+lYË²}ýüÎNþzÙ)=\u0017¬;Ôè";
                     var5 = (boolean)("fú\u00adhYéÄ{*üB?·\u008dbêRòÂyÈ´t~\u009c\\ì[F?\u0095}¢ØËc ;¹ò\u009fb];Àg~W\u0094=Ôï£:ÕeVéüx®C²²ã\u0083\u009c÷\u000fTy\u00122æ#×÷¾Ç \u008b¾57+lYË²}ýüÎNþzÙ)=\u0017¬;Ôè");
                        // [VF] .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Integer[15];
                                    Z = new HashMap();
                                    l = new HashMap();
                                    C = new ImageIcon(Xg2.class.getResource(b(-31658, -30855)));
                                    z = new ImageIcon(Xg2.class.getResource(b(-31661, 13676)));
                                    g = new HashMap();
                                    E = new HashMap();
                                    S = new HashMap();
                                    k = new HashMap();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "½ÜH\u0084\u0016£¦ÝKAÞ\u001dÊ\u00adÿ=";
                                 var5 = ("½ÜH\u0084\u0016£¦ÝKAÞ\u001dÊ\u00adÿ=".length()) != 0;
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "Ìê\u0091Îû@\u001cqNà¨\u0089_\u0089Tr:\u00103\u0092b\u0003ñ)\u0004";
                  var12 = "Ìê\u0091Îû@\u001cqNà¨\u0089_\u0089Tr:\u00103\u0092b\u0003ñ)\u0004".length();
                  var9 = 21;
                  var17 = -1;
            }

            var10000 = 15;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





